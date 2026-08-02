package xsna;

import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.zxing.ResultPoint;
import com.google.zxing.qrcode.detector.FinderPattern;
import com.unity3d.services.UnityAdsConstants;
import com.vk.cameraui.impl.QrScannerUi;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.newsfeed.impl.items.posting.item.modals.d;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.mo9;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class aoe0 implements zzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ aoe0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x02a5, code lost:
    
        if (r7 != 1) goto L131;
     */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0123  */
    @Override // xsna.zzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        zd9 zd9Var;
        mo9.a aVar;
        boolean z;
        View view;
        boolean z2;
        Iterator it;
        int i;
        int i2;
        int i3;
        int i4 = this.b;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (i4) {
            case 0:
                QrScannerUi qrScannerUi = (QrScannerUi) obj6;
                zd9 zd9Var2 = (zd9) obj5;
                ResultPoint[] resultPointArr = (ResultPoint[]) obj;
                yne0 yne0Var = (yne0) obj2;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                izs<? super Integer, s3q0> izsVar = (izs) obj4;
                ene0 ene0Var = qrScannerUi.h;
                if (ene0Var != null) {
                    FrameLayout frameLayout = qrScannerUi.i;
                    if (qrScannerUi.f != null) {
                        int i5 = cme0.p;
                        if (com.vk.qrcode.d.k != null || com.vk.qrcode.d.l) {
                            z2 = true;
                            if (frameLayout != null && zd9Var2 != null) {
                                if (ene0Var.a == null) {
                                    ene0Var.a = new gne0(frameLayout.getContext());
                                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
                                    gne0 gne0Var = ene0Var.a;
                                    if (gne0Var == null) {
                                        gne0Var = null;
                                    }
                                    gne0Var.setLayoutParams(layoutParams);
                                    gne0 gne0Var2 = ene0Var.a;
                                    if (gne0Var2 == null) {
                                        gne0Var2 = null;
                                    }
                                    frameLayout.addView(gne0Var2);
                                }
                                if (resultPointArr != null || resultPointArr.length == 0 || yne0Var == null) {
                                    zd9Var = zd9Var2;
                                    gne0 gne0Var3 = ene0Var.a;
                                    f4m.j(gne0Var3 != null ? gne0Var3 : null);
                                } else {
                                    gne0 gne0Var4 = ene0Var.a;
                                    if (gne0Var4 == null) {
                                        gne0Var4 = null;
                                    }
                                    gne0Var4.setGoogleVisionMode(booleanValue);
                                    int width = zd9Var2.getWidth();
                                    int height = zd9Var2.getHeight();
                                    float f = width / yne0Var.a;
                                    float f2 = height / yne0Var.b;
                                    ArrayList arrayList = new ArrayList(4);
                                    Ref$IntRef ref$IntRef = new Ref$IntRef();
                                    Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                                    Ref$IntRef ref$IntRef3 = new Ref$IntRef();
                                    Ref$IntRef ref$IntRef4 = new Ref$IntRef();
                                    zd9Var = zd9Var2;
                                    int length = resultPointArr.length;
                                    int i6 = 0;
                                    while (i6 < length) {
                                        int i7 = length;
                                        int i8 = i6 % 4;
                                        int i9 = i6;
                                        if (i8 == 0) {
                                            ref$IntRef.element = 0;
                                            ref$IntRef2.element = width;
                                            ref$IntRef3.element = 0;
                                            ref$IntRef4.element = height;
                                        }
                                        ResultPoint resultPoint = resultPointArr[i9];
                                        int i10 = width;
                                        if (resultPoint != null) {
                                            i2 = height;
                                            ref$IntRef.element = Math.max(ref$IntRef.element, (int) resultPoint.getX());
                                            ref$IntRef2.element = Math.min(ref$IntRef2.element, (int) resultPoint.getX());
                                            ref$IntRef3.element = Math.max(ref$IntRef3.element, (int) resultPoint.getY());
                                            ref$IntRef4.element = Math.min(ref$IntRef4.element, (int) resultPoint.getY());
                                        } else {
                                            i2 = height;
                                        }
                                        if (i8 == 3) {
                                            arrayList.add(new Point(ref$IntRef2.element, ref$IntRef3.element));
                                            arrayList.add(new Point(ref$IntRef2.element, ref$IntRef4.element));
                                            arrayList.add(new Point(ref$IntRef.element, ref$IntRef4.element));
                                            arrayList.add(new Point(ref$IntRef.element, ref$IntRef3.element));
                                        }
                                        i6 = i9 + 1;
                                        length = i7;
                                        width = i10;
                                        height = i2;
                                    }
                                    if (ref$IntRef.element == ref$IntRef2.element || ref$IntRef3.element == ref$IntRef4.element) {
                                        arrayList = new ArrayList(0);
                                    }
                                    Iterator it2 = arrayList.iterator();
                                    float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                    int i11 = 0;
                                    while (it2.hasNext()) {
                                        Object next = it2.next();
                                        int i12 = i11 + 1;
                                        if (i11 < 0) {
                                            e43.t();
                                            throw null;
                                        }
                                        Point point = (Point) next;
                                        int i13 = i11 % 4;
                                        if (i13 == 0) {
                                            ResultPoint[] resultPointArr2 = (ResultPoint[]) jw5.m(i11, resultPointArr.length, resultPointArr);
                                            int length2 = resultPointArr2.length;
                                            it = it2;
                                            int i14 = 0;
                                            float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                            while (i14 < length2) {
                                                int i15 = i14;
                                                ResultPoint resultPoint2 = resultPointArr2[i15];
                                                ResultPoint[] resultPointArr3 = resultPointArr2;
                                                if (resultPoint2 != null && (resultPoint2 instanceof FinderPattern)) {
                                                    f4 = Math.max(f4, ((FinderPattern) resultPoint2).getEstimatedModuleSize());
                                                }
                                                i14 = i15 + 1;
                                                resultPointArr2 = resultPointArr3;
                                            }
                                            f3 = f4;
                                        } else {
                                            it = it2;
                                        }
                                        float f5 = point.x + yne0Var.d;
                                        float f6 = point.y + yne0Var.c;
                                        float f7 = (7 * f3) / 2.0f;
                                        float f8 = f5 + ((i13 == 0 || i13 == 1) ? -f7 : f7);
                                        if (i13 == 1 || i13 == 2) {
                                            f7 = -f7;
                                        }
                                        float f9 = f8 * f;
                                        float f10 = (f6 + f7) * f2;
                                        int a = iah0.a(16);
                                        if (i13 != 0) {
                                            i = 1;
                                            break;
                                        } else {
                                            i = 1;
                                        }
                                        a = -a;
                                        float f11 = f9 + a;
                                        int a2 = iah0.a(8);
                                        if (i13 != i && i13 != 2) {
                                            arrayList.set(i11, new Point((int) f11, (int) (f10 + a2)));
                                            it2 = it;
                                            i11 = i12;
                                        }
                                        a2 = -a2;
                                        arrayList.set(i11, new Point((int) f11, (int) (f10 + a2)));
                                        it2 = it;
                                        i11 = i12;
                                    }
                                    gne0 gne0Var5 = ene0Var.a;
                                    if (gne0Var5 == null) {
                                        gne0Var5 = null;
                                    }
                                    gne0Var5.setOnQrClicked(izsVar);
                                    gne0Var5.setCorners(arrayList);
                                    gne0Var5.setQrSelected(z2);
                                    gne0Var5.setVisibility(0);
                                    if (gne0Var5.m) {
                                        gne0Var5.invalidate();
                                    } else {
                                        gne0Var5.requestLayout();
                                    }
                                }
                                if (resultPointArr != null && resultPointArr.length != 0) {
                                    mo9 mo9Var = (mo9) zd9Var.getCameraPreview();
                                    aVar = mo9Var.j;
                                    if (aVar == null) {
                                        aVar.c = 5;
                                        z = true;
                                    } else {
                                        z = true;
                                        mo9Var.l = true;
                                    }
                                    view = qrScannerUi.j;
                                    if (view != null) {
                                        f4m.j(view);
                                    }
                                    qrScannerUi.b.getState().R = z;
                                }
                                return s3q0.a;
                            }
                        }
                    }
                    z2 = false;
                    if (frameLayout != null) {
                        if (ene0Var.a == null) {
                        }
                        if (resultPointArr != null) {
                        }
                        zd9Var = zd9Var2;
                        gne0 gne0Var32 = ene0Var.a;
                        f4m.j(gne0Var32 != null ? gne0Var32 : null);
                        if (resultPointArr != null) {
                            mo9 mo9Var2 = (mo9) zd9Var.getCameraPreview();
                            aVar = mo9Var2.j;
                            if (aVar == null) {
                            }
                            view = qrScannerUi.j;
                            if (view != null) {
                            }
                            qrScannerUi.b.getState().R = z;
                        }
                        return s3q0.a;
                    }
                }
                zd9Var = zd9Var2;
                if (resultPointArr != null) {
                }
                return s3q0.a;
            default:
                d.a aVar2 = (d.a) obj6;
                Cell$Middle.Size size = (Cell$Middle.Size) obj5;
                izs izsVar2 = (izs) obj;
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 6) == 0) {
                    i3 = (aVar3.y(izsVar2) ? 4 : 2) | intValue;
                } else {
                    i3 = intValue;
                }
                if ((intValue & 48) == 0) {
                    i3 |= aVar3.l(booleanValue2) ? 32 : 16;
                }
                if (aVar3.t(i3 & 1, (i3 & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-297933042, i3, -1, "com.vk.newsfeed.impl.items.posting.item.modals.SimplePostingCreateBottomSheet.HighlightedTitle.Content.<anonymous> (SimplePostingCreateBottomSheet.kt:419)");
                    }
                    v5v v5vVar = aVar2.d;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    iyk0 iyk0Var = rrv0.a;
                    ylu0 ylu0Var = (ylu0) aVar3.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    boolean z3 = !ylu0Var.s();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var2 = (ylu0) aVar3.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j = ylu0Var2.getText().o;
                    bpn0 bpn0Var = v5v.c;
                    Cell$Middle.d.b.b(d8v0.c(v5vVar, booleanValue2, z3, j, aVar3, i3 & 112), null, null, null, 0, 0, null, null, izsVar2, aVar3, (i3 << 27) & 1879048192, 6, 510).c(q630.a.a, size, aVar3, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
        }
    }
}
