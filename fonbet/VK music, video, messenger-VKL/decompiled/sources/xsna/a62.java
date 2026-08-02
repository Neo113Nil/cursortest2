package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Lambda;

/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* loaded from: classes11.dex */
public final class a62 extends Lambda implements gzs<s3q0> {
    final /* synthetic */ xfh0 $scrollObservationScope;
    final /* synthetic */ y52 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a62(xfh0 xfh0Var, y52 y52Var) {
        super(0);
        this.$scrollObservationScope = xfh0Var;
        this.this$0 = y52Var;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        igi0 igi0Var;
        LayoutNode layoutNode;
        xfh0 xfh0Var = this.$scrollObservationScope;
        qeh0 qeh0Var = xfh0Var.f;
        qeh0 qeh0Var2 = xfh0Var.g;
        Float f = xfh0Var.d;
        Float f2 = xfh0Var.e;
        float floatValue = (qeh0Var == null || f == null) ? 0.0f : qeh0Var.a.invoke().floatValue() - f.floatValue();
        float floatValue2 = (qeh0Var2 == null || f2 == null) ? 0.0f : qeh0Var2.a.invoke().floatValue() - f2.floatValue();
        if (floatValue != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || floatValue2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            y52 y52Var = this.this$0;
            int i = this.$scrollObservationScope.b;
            ng50 ng50Var = y52.M;
            int q = y52Var.q(i);
            lgi0 b = this.this$0.i().b(this.this$0.j);
            if (b != null) {
                y52 y52Var2 = this.this$0;
                try {
                    am amVar = y52Var2.l;
                    if (amVar != null) {
                        amVar.k(y52Var2.b(b));
                        s3q0 s3q0Var = s3q0.a;
                    }
                } catch (IllegalStateException unused) {
                    s3q0 s3q0Var2 = s3q0.a;
                }
            }
            lgi0 b2 = this.this$0.i().b(this.this$0.k);
            if (b2 != null) {
                y52 y52Var3 = this.this$0;
                try {
                    am amVar2 = y52Var3.m;
                    if (amVar2 != null) {
                        amVar2.k(y52Var3.b(b2));
                        s3q0 s3q0Var3 = s3q0.a;
                    }
                } catch (IllegalStateException unused2) {
                    s3q0 s3q0Var4 = s3q0.a;
                }
            }
            this.this$0.b.invalidate();
            lgi0 b3 = this.this$0.i().b(q);
            if (b3 != null && (igi0Var = b3.a) != null && (layoutNode = igi0Var.c) != null) {
                y52 y52Var4 = this.this$0;
                if (qeh0Var != null) {
                    y52Var4.o.k(q, qeh0Var);
                }
                if (qeh0Var2 != null) {
                    y52Var4.p.k(q, qeh0Var2);
                }
                y52Var4.m(layoutNode);
            }
        }
        if (qeh0Var != null) {
            this.$scrollObservationScope.d = qeh0Var.a.invoke();
        }
        if (qeh0Var2 != null) {
            this.$scrollObservationScope.e = qeh0Var2.a.invoke();
        }
        return s3q0.a;
    }
}
