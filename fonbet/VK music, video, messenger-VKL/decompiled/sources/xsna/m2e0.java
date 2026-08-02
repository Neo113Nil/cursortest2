package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import kotlin.NoWhenBranchMatchedException;
import xsna.cp8;
import xsna.q630;

/* compiled from: ProgressIndicatorImpl.kt */
/* loaded from: classes17.dex */
public final class m2e0 extends cp8.c {
    public final wh50 e;
    public final wh50 f;
    public final wh50 g;
    public final wh50 h = androidx.compose.runtime.k.b(null);

    /* compiled from: ProgressIndicatorImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonSize.values().length];
            try {
                iArr[ButtonSize.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonSize.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonSize.Large.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public m2e0(l5g l5gVar, pco pcoVar, pco pcoVar2) {
        this.e = androidx.compose.runtime.k.b(l5gVar);
        this.f = androidx.compose.runtime.k.b(pcoVar);
        this.g = androidx.compose.runtime.k.b(pcoVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.cp8
    public final void a(lgu0 lgu0Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        float f;
        long j;
        float f2;
        androidx.compose.runtime.a M = aVar.M(-308955659);
        if ((i & 48) == 0) {
            i2 = (M.J(lgu0Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(this) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & IronSourceError.ERROR_IS_INSTANCE_INIT_EXCEPTION) != 1040)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-308955659, i2, -1, "com.vk.core.compose.component.button.ProgressIndicatorImpl.Content (ProgressIndicatorImpl.kt:36)");
            }
            pco pcoVar = (pco) ((zak0) this.f).getValue();
            if (pcoVar == null) {
                M.K(-553640346);
                f = hr80.z().v(c(), M, 0) - (c() == ButtonSize.Small ? (float) 1.5d : 2);
                M.j();
            } else {
                M.K(-553640996);
                M.j();
                f = pcoVar.b;
            }
            q630 q = txj0.q(com.vk.core.compose.component.semantics.b.b(q630.a.a, (SemanticsConfiguration) ((zak0) this.h).getValue()), f);
            l5g l5gVar = (l5g) ((zak0) this.e).getValue();
            if (l5gVar == null) {
                M.K(-553630630);
                j = ((l5g) lgu0Var.d(d(), M, i2 & 112).getValue()).a;
                M.j();
            } else {
                M.K(-553631994);
                M.j();
                j = l5gVar.a;
            }
            pco pcoVar2 = (pco) ((zak0) this.g).getValue();
            if (pcoVar2 != null) {
                f2 = pcoVar2.b;
            } else {
                int i3 = a.$EnumSwitchMapping$0[c().ordinal()];
                if (i3 == 1) {
                    f2 = 1;
                } else {
                    if (i3 != 2 && i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f2 = 2;
                }
            }
            x2e0.b(q, j, f2, 0L, 1, M, 0, 8);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new me4(this, lgu0Var, i);
        }
    }
}
