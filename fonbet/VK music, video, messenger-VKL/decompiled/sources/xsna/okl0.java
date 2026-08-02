package xsna;

import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vk.core.compose.utils.swipable.DismissValue;
import com.vk.ecomm.storefront.impl.albums.presentation.model.LoadingState;
import java.util.ArrayList;
import xsna.dll0;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class okl0 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ okl0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.b;
        q630 q630Var = q630.a.a;
        Object obj4 = a.C0011a.a;
        Object obj5 = this.f;
        final Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.c;
        switch (i) {
            case 0:
                final dll0 dll0Var = (dll0) obj8;
                final izs izsVar = (izs) obj7;
                final yw90 yw90Var = (yw90) obj5;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-537332294, intValue, -1, "com.vk.ecomm.storefront.impl.albums.presentation.fragment.ui.StorefrontAlbumsContent.<anonymous>.<anonymous> (StorefrontAlbumsScreen.kt:82)");
                    }
                    boolean z = dll0Var.b == LoadingState.Refresh;
                    boolean J = aVar.J(izsVar);
                    Object x = aVar.x();
                    if (J || x == obj4) {
                        x = new gy7(izsVar, 7);
                        aVar.R(x);
                    }
                    gzs gzsVar = (gzs) x;
                    q630 d = txj0.d(q630Var, 1.0f);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    dge0.a(z, gzsVar, hr80.m(d, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a), null, null, kai.c(333119116, new yzs() { // from class: xsna.pkl0
                        @Override // xsna.yzs
                        public final Object invoke(Object obj9, Object obj10, Object obj11) {
                            qa8 qa8Var = (qa8) obj9;
                            androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj10;
                            int intValue2 = ((Integer) obj11).intValue();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= aVar2.J(qa8Var) ? 4 : 2;
                            }
                            if (aVar2.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(333119116, intValue2, -1, "com.vk.ecomm.storefront.impl.albums.presentation.fragment.ui.StorefrontAlbumsContent.<anonymous>.<anonymous>.<anonymous> (StorefrontAlbumsScreen.kt:93)");
                                }
                                dll0 dll0Var2 = dll0.this;
                                dll0.a aVar3 = dll0Var2.d;
                                if (aVar3 instanceof dll0.a.b) {
                                    aVar2.K(-1717702967);
                                    bll0.b(qa8Var, (dll0.a.b) dll0Var2.d, dll0Var2.b, izsVar, aVar2, intValue2 & 14);
                                    View view = (View) aVar2.r(AndroidCompositionLocals_androidKt.f);
                                    s3q0 s3q0Var = s3q0.a;
                                    Object obj12 = obj6;
                                    boolean J2 = aVar2.J(obj12) | aVar2.y(view);
                                    yw90 yw90Var2 = yw90Var;
                                    boolean J3 = J2 | aVar2.J(yw90Var2);
                                    Object x2 = aVar2.x();
                                    if (J3 || x2 == a.C0011a.a) {
                                        x2 = new qkl0(obj12, view, yw90Var2, null);
                                        aVar2.R(x2);
                                    }
                                    bap.g(s3q0Var, (wzs) x2, aVar2, 6);
                                    aVar2.j();
                                } else {
                                    if (!(aVar3 instanceof dll0.a.C2741a)) {
                                        throw alb0.c(-1995075197, aVar2);
                                    }
                                    aVar2.K(-1717091957);
                                    hkl0.a(qa8Var, aVar2, intValue2 & 14);
                                    aVar2.j();
                                }
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                            } else {
                                aVar2.h();
                            }
                            return s3q0.a;
                        }
                    }, aVar), aVar, 196608, 24);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                rek0 rek0Var = (rek0) obj8;
                j1z j1zVar = (j1z) obj7;
                tho0 tho0Var = (tho0) obj6;
                Object obj9 = (uv70) obj5;
                q630 q630Var2 = (q630) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                aVar2.K(-84507373);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-84507373, intValue2, -1, "androidx.compose.foundation.text.cursor.<anonymous> (TextFieldCursor.kt:46)");
                }
                boolean booleanValue = ((Boolean) aVar2.r(uvi.x)).booleanValue();
                boolean l = aVar2.l(booleanValue);
                Object x2 = aVar2.x();
                if (l || x2 == obj4) {
                    x2 = new amk(booleanValue);
                    aVar2.R(x2);
                }
                amk amkVar = (amk) x2;
                boolean z2 = rek0Var.b != 16;
                if (((spx0) aVar2.r(uvi.u)).b() && j1zVar.b() && qko0.c(tho0Var.b) && z2) {
                    aVar2.K(-707487962);
                    us2 us2Var = tho0Var.a;
                    qko0 qko0Var = new qko0(tho0Var.b);
                    boolean y = aVar2.y(amkVar);
                    Object x3 = aVar2.x();
                    if (y || x3 == obj4) {
                        x3 = new ofo0(amkVar, null);
                        aVar2.R(x3);
                    }
                    bap.f(us2Var, qko0Var, (wzs) x3, aVar2, 0);
                    boolean y2 = aVar2.y(amkVar) | aVar2.y(obj9) | aVar2.J(tho0Var) | aVar2.y(j1zVar) | aVar2.J(rek0Var);
                    Object x4 = aVar2.x();
                    if (y2 || x4 == obj4) {
                        Object hqbVar = new hqb(amkVar, obj9, tho0Var, j1zVar, rek0Var, 1);
                        aVar2.R(hqbVar);
                        x4 = hqbVar;
                    }
                    q630Var = bu00.f(q630Var2, (izs) x4);
                    aVar2.j();
                } else {
                    aVar2.K(-705473241);
                    aVar2.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
                return q630Var;
            default:
                l7k0 l7k0Var = (l7k0) obj8;
                l7k0 l7k0Var2 = (l7k0) obj7;
                riq riqVar = (riq) obj6;
                ArrayList arrayList = (ArrayList) obj5;
                wzs wzsVar = (wzs) obj;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                int i2 = 4;
                if ((intValue3 & 6) == 0) {
                    intValue3 |= aVar3.y(wzsVar) ? 4 : 2;
                }
                if (aVar3.t(intValue3 & 1, (intValue3 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1904020055, intValue3, -1, "com.vk.core.compose.snackbar.FadeInFadeOutWithScale.<anonymous>.<anonymous> (VkSnackbarHost.kt:224)");
                    }
                    boolean f = epx.f(l7k0Var, l7k0Var2);
                    Object x5 = aVar3.x();
                    if (x5 == obj4) {
                        x5 = new bi50(Boolean.FALSE);
                        aVar3.R(x5);
                    }
                    bi50 bi50Var = (bi50) x5;
                    boolean J2 = aVar3.J(l7k0Var);
                    Object x6 = aVar3.x();
                    if (J2 || x6 == obj4) {
                        x6 = new com.vk.movika.tools.controls.seekbar.r(l7k0Var, 15);
                        aVar3.R(x6);
                    }
                    wzs wzsVar2 = (wzs) x6;
                    float f2 = hmn0.a;
                    DismissValue dismissValue = DismissValue.Default;
                    Object x7 = aVar3.x();
                    if (x7 == obj4) {
                        x7 = new zlm0(i2);
                        aVar3.R(x7);
                    }
                    izs izsVar2 = (izs) x7;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2055139607, 0, -1, "com.vk.core.compose.utils.swipable.rememberDismissState (SwipeToDismiss.kt:208)");
                    }
                    Object[] objArr = new Object[0];
                    fh9 fh9Var = new fh9(new x9d(2), new kp5(9, izsVar2, wzsVar2));
                    boolean o = aVar3.o(dismissValue.ordinal()) | aVar3.J(izsVar2) | aVar3.J(wzsVar2);
                    Object x8 = aVar3.x();
                    if (o || x8 == obj4) {
                        x8 = new hj3(dismissValue, izsVar2, wzsVar2, 6);
                        aVar3.R(x8);
                    }
                    ccn ccnVar = (ccn) crx0.D(objArr, fh9Var, (gzs) x8, aVar3, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    boolean y3 = aVar3.y(bi50Var) | aVar3.J(l7k0Var) | aVar3.y(riqVar);
                    Object x9 = aVar3.x();
                    if (y3 || x9 == obj4) {
                        x9 = new xkv0(bi50Var, l7k0Var, riqVar, null);
                        aVar3.R(x9);
                    }
                    bap.g(bi50Var, (wzs) x9, aVar3, 0);
                    Object x10 = aVar3.x();
                    if (x10 == obj4) {
                        x10 = qf2.a(1.0f);
                        aVar3.R(x10);
                    }
                    if2 if2Var = (if2) x10;
                    boolean y4 = aVar3.y(ccnVar) | aVar3.y(if2Var);
                    Object x11 = aVar3.x();
                    if (y4 || x11 == obj4) {
                        x11 = new ykv0(ccnVar, if2Var, null);
                        aVar3.R(x11);
                    }
                    bap.g(ccnVar, (wzs) x11, aVar3, 0);
                    zkv0.a(l7k0Var, bi50Var, ccnVar, if2Var, wzsVar, null, f, (!f || ((ArrayList) j5g.V(arrayList)).size() == 1) ? 0 : 200, aVar3, 4096 | ((intValue3 << 12) & 57344));
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
