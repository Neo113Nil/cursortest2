package xsna;

import androidx.compose.ui.node.LayoutNode;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class sfi implements zzs {
    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
        int intValue = ((Integer) obj4).intValue();
        if (aVar.t(intValue & 1, (intValue & 129) != 128)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1311163436, intValue, -1, "com.vk.feed.design.compose.posting.picker.placepicker.ComposableSingletons$FeedPlacePickerKt.lambda$-1311163436.<anonymous> (FeedPlacePicker.kt:52)");
            }
            q630 q = txj0.q(q630.a.a, 24);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.e, false);
            int hashCode = Long.hashCode(n34.n(aVar));
            sy90 D = aVar.D();
            q630 c = qri.c(aVar, q);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (aVar.N() == null) {
                n34.r();
                throw null;
            }
            aVar.H();
            if (aVar.L()) {
                aVar.I(aVar2);
            } else {
                aVar.f();
            }
            k9q0.w(aVar, d, cri.a.f);
            k9q0.w(aVar, D, cri.a.e);
            k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(aVar, cri.a.h);
            k9q0.w(aVar, c, cri.a.d);
            qzu0.a.getClass();
            lg90 b1 = qzu0.b1(aVar);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            pzu0.b(b1, null, null, ylu0Var.getIcon().l, aVar, 56, 4);
            aVar.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar.h();
        }
        return s3q0.a;
    }
}
