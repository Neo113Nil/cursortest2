package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.net.Uri;
import android.util.Rational;
import androidx.camera.core.CameraControl$OperationCanceledException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import xsna.re9;
import xsna.ub9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class fvn implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ fvn(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, xsna.xvr] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                Uri uri = (Uri) this.c;
                Context context = (Context) this.d;
                String str = (String) this.e;
                String str2 = (String) this.f;
                ArrayList a = e43.a("vk.com", "vk.ru");
                if (!a.contains(a0a.d)) {
                    a.add(a0a.d);
                }
                boolean P = j5g.P(a, uri.getHost());
                String lastPathSegment = (str == null || drm0.N(str)) ? uri.getLastPathSegment() : drm0.p0(str).toString().replace('/', '_');
                if (str2 != null) {
                    String concat = ".".concat(str2);
                    if (lastPathSegment != null && !brm0.v(lastPathSegment, concat, false)) {
                        lastPathSegment = fo8.a(lastPathSegment, concat);
                    }
                }
                vao.b(context, lastPathSegment, uri.toString(), true, null, Boolean.TRUE, P);
                break;
            default:
                final zvr zvrVar = (zvr) this.c;
                ub9.a<bwr> aVar = (ub9.a) this.d;
                wvr wvrVar = (wvr) this.e;
                Rational rational = (Rational) this.f;
                if (!zvrVar.d) {
                    aVar.d(new CameraControl$OperationCanceledException("Camera is not active."));
                    break;
                } else if (!wvrVar.a.isEmpty() || !wvrVar.b.isEmpty() || !wvrVar.c.isEmpty()) {
                    int size = wvrVar.a.size();
                    Integer num = (Integer) zvrVar.a.e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
                    int min = Math.min(size, num == null ? 0 : num.intValue());
                    int size2 = wvrVar.b.size();
                    Integer num2 = (Integer) zvrVar.a.e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
                    int min2 = Math.min(size2, num2 == null ? 0 : num2.intValue());
                    int size3 = wvrVar.c.size();
                    Integer num3 = (Integer) zvrVar.a.e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
                    int min3 = Math.min(size3, num3 == null ? 0 : num3.intValue());
                    if (min + min2 + min3 > 0) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        if (min > 0) {
                            arrayList.addAll(wvrVar.a.subList(0, min));
                        }
                        if (min2 > 0) {
                            arrayList2.addAll(wvrVar.b.subList(0, min2));
                        }
                        if (min3 > 0) {
                            arrayList3.addAll(wvrVar.c.subList(0, min3));
                        }
                        Rect e = zvrVar.a.j.e.e();
                        Rational rational2 = new Rational(e.width(), e.height());
                        if (rational == null) {
                            rational = rational2;
                        }
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ej20 ej20Var = (ej20) it.next();
                            if (zvr.f(ej20Var)) {
                                MeteringRectangle d = zvr.d(ej20Var, zvr.c(ej20Var, rational2, rational), e);
                                if (d.getWidth() != 0 && d.getHeight() != 0) {
                                    arrayList4.add(d);
                                }
                            }
                        }
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            ej20 ej20Var2 = (ej20) it2.next();
                            if (zvr.f(ej20Var2)) {
                                MeteringRectangle d2 = zvr.d(ej20Var2, zvr.c(ej20Var2, rational2, rational), e);
                                if (d2.getWidth() != 0 && d2.getHeight() != 0) {
                                    arrayList5.add(d2);
                                }
                            }
                        }
                        Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            ej20 ej20Var3 = (ej20) it3.next();
                            if (zvr.f(ej20Var3)) {
                                MeteringRectangle d3 = zvr.d(ej20Var3, zvr.c(ej20Var3, rational2, rational), e);
                                if (d3.getWidth() != 0 && d3.getHeight() != 0) {
                                    arrayList6.add(d3);
                                }
                            }
                        }
                        if (!arrayList4.isEmpty() || !arrayList5.isEmpty() || !arrayList6.isEmpty()) {
                            zvrVar.a.b.a.remove(zvrVar.j);
                            ub9.a<bwr> aVar2 = zvrVar.q;
                            if (aVar2 != null) {
                                aVar2.d(new CameraControl$OperationCanceledException("Cancelled by another startFocusAndMetering()"));
                                zvrVar.q = null;
                            }
                            zvrVar.a.b.a.remove(null);
                            ScheduledFuture<?> scheduledFuture = zvrVar.g;
                            if (scheduledFuture != null) {
                                scheduledFuture.cancel(true);
                                zvrVar.g = null;
                            }
                            zvrVar.q = aVar;
                            final MeteringRectangle[] meteringRectangleArr = (MeteringRectangle[]) arrayList4.toArray(new MeteringRectangle[0]);
                            final MeteringRectangle[] meteringRectangleArr2 = (MeteringRectangle[]) arrayList5.toArray(new MeteringRectangle[0]);
                            final MeteringRectangle[] meteringRectangleArr3 = (MeteringRectangle[]) arrayList6.toArray(new MeteringRectangle[0]);
                            re9 re9Var = zvrVar.a;
                            re9Var.b.a.remove(zvrVar.j);
                            ScheduledFuture<?> scheduledFuture2 = zvrVar.g;
                            if (scheduledFuture2 != null) {
                                scheduledFuture2.cancel(true);
                                zvrVar.g = null;
                            }
                            zvrVar.k = meteringRectangleArr;
                            zvrVar.l = meteringRectangleArr2;
                            zvrVar.m = meteringRectangleArr3;
                            if (meteringRectangleArr.length > 0) {
                                zvrVar.e = true;
                                zvrVar.i = false;
                                re9Var.n();
                                zvrVar.g(null);
                            } else {
                                zvrVar.e = false;
                                zvrVar.i = true;
                                re9Var.n();
                            }
                            zvrVar.f = 0;
                            final boolean z = re9Var.i(1) == 1;
                            ?? r1 = new re9.c() { // from class: xsna.xvr
                                @Override // xsna.re9.c
                                public final boolean a(TotalCaptureResult totalCaptureResult) {
                                    zvr zvrVar2 = zvr.this;
                                    zvrVar2.getClass();
                                    Integer num4 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                                    if (zvrVar2.k.length > 0) {
                                        if (!z || num4 == null) {
                                            zvrVar2.i = true;
                                        } else if (zvrVar2.f.intValue() == 3) {
                                            if (num4.intValue() == 4) {
                                                zvrVar2.i = true;
                                            } else if (num4.intValue() == 5) {
                                                zvrVar2.i = true;
                                            }
                                        }
                                    }
                                    if (zvrVar2.i && totalCaptureResult.getRequest() != null) {
                                        MeteringRectangle[] meteringRectangleArr4 = meteringRectangleArr;
                                        if (meteringRectangleArr4.length == 0) {
                                            meteringRectangleArr4 = zvrVar2.n;
                                        }
                                        MeteringRectangle[] meteringRectangleArr5 = meteringRectangleArr2;
                                        if (meteringRectangleArr5.length == 0) {
                                            meteringRectangleArr5 = zvrVar2.o;
                                        }
                                        MeteringRectangle[] meteringRectangleArr6 = meteringRectangleArr3;
                                        if (meteringRectangleArr6.length == 0) {
                                            meteringRectangleArr6 = zvrVar2.p;
                                        }
                                        CaptureRequest request = totalCaptureResult.getRequest();
                                        if (zvr.e((MeteringRectangle[]) request.get(CaptureRequest.CONTROL_AF_REGIONS), meteringRectangleArr4) && zvr.e((MeteringRectangle[]) request.get(CaptureRequest.CONTROL_AE_REGIONS), meteringRectangleArr5) && zvr.e((MeteringRectangle[]) request.get(CaptureRequest.CONTROL_AWB_REGIONS), meteringRectangleArr6)) {
                                            ub9.a<bwr> aVar3 = zvrVar2.q;
                                            if (aVar3 != null) {
                                                aVar3.b(new bwr());
                                                zvrVar2.q = null;
                                            }
                                            return true;
                                        }
                                    }
                                    if (!zvrVar2.f.equals(num4) && num4 != null) {
                                        zvrVar2.f = num4;
                                    }
                                    return false;
                                }
                            };
                            zvrVar.j = r1;
                            re9Var.b.a.add(r1);
                            long j = wvrVar.d;
                            if (j > 0) {
                                long j2 = zvrVar.h + 1;
                                zvrVar.h = j2;
                                zvrVar.g = zvrVar.c.schedule(new y8p(zvrVar, j2, 1), j, TimeUnit.MILLISECONDS);
                                break;
                            }
                        } else {
                            aVar.d(new IllegalArgumentException("None of the specified AF/AE/AWB MeteringPoints are valid."));
                            break;
                        }
                    } else {
                        aVar.d(new IllegalArgumentException("None of the specified AF/AE/AWB MeteringPoints is supported on this camera."));
                        break;
                    }
                } else {
                    aVar.d(new IllegalArgumentException("No AF/AE/AWB MeteringPoints are added."));
                    break;
                }
                break;
        }
    }
}
