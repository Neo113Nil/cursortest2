package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Lambda;
import xsna.cri;
import xsna.q630;

/* compiled from: AndroidPopup.android.kt */
/* loaded from: classes11.dex */
public final class sb2 extends Lambda implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    final /* synthetic */ mtk0<wzs<androidx.compose.runtime.a, Integer, s3q0>> $currentContent$delegate;
    final /* synthetic */ owb0 $this_apply;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public sb2(owb0 owb0Var, mtk0<? extends wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0>> mtk0Var) {
        super(2);
        this.$this_apply = owb0Var;
        this.$currentContent$delegate = mtk0Var;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1022273628, intValue, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:441)");
            }
            Object x = aVar2.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = qb2.i;
                aVar2.R(x);
            }
            q630 b = egi0.b(q630.a.a, false, (izs) x);
            boolean y = aVar2.y(this.$this_apply);
            owb0 owb0Var = this.$this_apply;
            Object x2 = aVar2.x();
            if (y || x2 == c0012a) {
                x2 = new rb2(owb0Var);
                aVar2.R(x2);
            }
            q630 a = o19.a(sv1.z(b, (izs) x2), this.$this_apply.getCanCalculatePosition() ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            mtk0<wzs<androidx.compose.runtime.a, Integer, s3q0>> mtk0Var = this.$currentContent$delegate;
            pqo pqoVar = nb2.a;
            wzs<androidx.compose.runtime.a, Integer, s3q0> value = mtk0Var.getValue();
            Object x3 = aVar2.x();
            if (x3 == c0012a) {
                x3 = AndroidPopup_androidKt$SimpleStack$1$1.a;
                aVar2.R(x3);
            }
            cp10 cp10Var = (cp10) x3;
            int hashCode = Long.hashCode(n34.n(aVar2));
            sy90 D = aVar2.D();
            q630 c = qri.c(aVar2, a);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (aVar2.N() == null) {
                n34.r();
                throw null;
            }
            aVar2.H();
            if (aVar2.L()) {
                aVar2.I(aVar3);
            } else {
                aVar2.f();
            }
            k9q0.w(aVar2, cp10Var, cri.a.f);
            k9q0.w(aVar2, D, cri.a.e);
            k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(aVar2, cri.a.h);
            k9q0.w(aVar2, c, cri.a.d);
            value.invoke(aVar2, 0);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
