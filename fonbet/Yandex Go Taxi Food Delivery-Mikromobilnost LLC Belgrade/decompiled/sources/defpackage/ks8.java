package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.view.Display;
import androidx.compose.runtime.f;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.ar.core.ImageMetadata;
import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.gci0;
import defpackage.hs8;
import defpackage.jt8;
import defpackage.kzd;
import defpackage.ldc;
import defpackage.m4m0;
import defpackage.pvn;
import defpackage.qke;
import defpackage.rs8;
import defpackage.tfx;
import defpackage.tls;
import defpackage.tpr;
import defpackage.ts8;
import defpackage.zy11;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public final class ks8 {
    public final hs8 a;

    public ks8(hs8 hs8Var) {
        this.a = hs8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(final f530 f530Var, fid fidVar, int i) {
        int i2;
        int i3;
        int rotation;
        int i4;
        Display display;
        Activity activity;
        bts btsVar = (bts) fidVar;
        btsVar.g0(433745955);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(this) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        activity = null;
                        break;
                    } else {
                        if (context instanceof Activity) {
                            activity = (Activity) context;
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                Q = activity;
                btsVar.o0(Q);
            }
            Activity activity2 = (Activity) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = Integer.valueOf(activity2 != null ? activity2.getRequestedOrientation() : -1);
                btsVar.o0(Q2);
            }
            int intValue = ((Number) Q2).intValue();
            Object Q3 = btsVar.Q();
            if (Q3 == o430Var) {
                if (activity2 != null) {
                    if (Build.VERSION.SDK_INT >= 30) {
                        display = activity2.getDisplay();
                        rotation = display != null ? display.getRotation() : 0;
                    } else {
                        rotation = activity2.getWindowManager().getDefaultDisplay().getRotation();
                    }
                    if (rotation != 0) {
                        if (rotation == 1) {
                            i4 = 0;
                        } else if (rotation == 2) {
                            i4 = 9;
                        } else if (rotation == 3) {
                            i4 = 8;
                        }
                        activity2.setRequestedOrientation(i4);
                        if (rotation != 0) {
                            if (rotation == 1) {
                                i3 = 90;
                            } else if (rotation == 2) {
                                i3 = SubsamplingScaleImageView.ORIENTATION_180;
                            } else if (rotation == 3) {
                                i3 = SubsamplingScaleImageView.ORIENTATION_270;
                            }
                            Q3 = Integer.valueOf(i3);
                            btsVar.o0(Q3);
                        }
                    }
                    i4 = 1;
                    activity2.setRequestedOrientation(i4);
                    if (rotation != 0) {
                    }
                }
                i3 = 0;
                Q3 = Integer.valueOf(i3);
                btsVar.o0(Q3);
            }
            final int intValue2 = ((Number) Q3).intValue();
            boolean e = btsVar.e(activity2);
            Object Q4 = btsVar.Q();
            if (e || Q4 == o430Var) {
                Q4 = new is8(activity2, intValue, 0);
                btsVar.o0(Q4);
            }
            zpn.a(zy11.a, (tls) Q4, btsVar);
            hs8 hs8Var = this.a;
            ss8 ss8Var = new ss8(0, hs8Var.a, hs8Var.b, hs8Var.c);
            rs31 a = f5z.a(btsVar);
            if (a == null) {
                ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            final ts8 ts8Var = (ts8) ooc.G(qoi0.a(ts8.class), a, null, ss8Var, a instanceof q7u ? ((q7u) a).getDefaultViewModelCreationExtras() : w8f.b, btsVar);
            final oz40 b = f.b(ts8Var.Y(), btsVar);
            qti.c(null, null, ((Boolean) btsVar.m(qti.e)).booleanValue(), wwg.S(-278433828, true, new wls() { // from class: ru.yandex.logistics.care.camera.ui.d
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    fid fidVar2 = (fid) obj;
                    int intValue3 = ((Integer) obj2).intValue();
                    bts btsVar2 = (bts) fidVar2;
                    if (btsVar2.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                        rs8 rs8Var = (rs8) b.getValue();
                        ts8 ts8Var2 = ts8.this;
                        gci0 X = ts8Var2.X();
                        gci0 Z = ts8Var2.Z();
                        boolean e2 = btsVar2.e(ts8Var2);
                        Object Q5 = btsVar2.Q();
                        if (e2 || Q5 == did.a) {
                            Q5 = new CareCameraScreen$Content$2$1$1(1, ts8Var2, ts8.class, "onAction", "onAction(Lru/yandex/logistics/care/camera/data/CareCameraAction;)V", 0);
                            btsVar2.o0(Q5);
                        }
                        tfx tfxVar = (tfx) Q5;
                        hs8 hs8Var2 = this.a;
                        kzd kzdVar = hs8Var2.a.c;
                        tpr tprVar = ((jt8) hs8Var2.d.b).i;
                        if (tprVar == null) {
                            tprVar = pvn.a;
                        }
                        c.a(rs8Var, X, Z, kzdVar, (tls) tfxVar, Integer.valueOf(intValue2), m4m0.b(f530Var, ldc.b, qke.q), tprVar, ts8Var2.W(), btsVar2, ImageMetadata.EDGE_MODE);
                    } else {
                        btsVar2.Y();
                    }
                    return zy11.a;
                }
            }, btsVar), btsVar, HProv.ALG_TYPE_SECURECHANNEL, 3);
            btsVar = btsVar;
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mj5(this, f530Var, i, 18);
        }
    }
}
