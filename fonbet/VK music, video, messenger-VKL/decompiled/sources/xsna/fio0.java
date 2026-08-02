package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.compose.component.cell.skeleton.TextType;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import kotlin.NoWhenBranchMatchedException;
import xsna.q630;
import xsna.voa;

/* compiled from: TextImpl.kt */
/* loaded from: classes17.dex */
public final class fio0 implements voa.b {
    public final wh50 a;
    public final rg50 b;
    public final wh50 c;
    public final wh50 d = androidx.compose.runtime.k.b(null);

    /* compiled from: TextImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextType.values().length];
            try {
                iArr[TextType.Title.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextType.Subtitle.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextType.ExtraSubtitle.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public fio0(String str, int i, float f) {
        this.a = androidx.compose.runtime.k.b(str);
        this.b = androidx.compose.runtime.i.a(i);
        this.c = cq.f(f);
    }

    @Override // xsna.voa.b
    public final void a(TextType textType, androidx.compose.runtime.a aVar, int i) {
        frv0 frv0Var;
        float f;
        androidx.compose.runtime.a M = aVar.M(-1074167028);
        int i2 = (M.J(this) ? 256 : 128) | i;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1074167028, i2, -1, "com.vk.core.compose.component.cell.skeleton.TextImpl.Content (TextImpl.kt:33)");
            }
            String str = (String) ((zak0) this.a).getValue();
            int[] iArr = a.$EnumSwitchMapping$0;
            int i3 = iArr[textType.ordinal()];
            if (i3 == 1) {
                M.K(-1482356240);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0Var = wuv0Var.T;
                M.j();
            } else {
                if (i3 != 2 && i3 != 3) {
                    throw alb0.c(-1482358191, M);
                }
                M.K(-1482353644);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var2 = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0Var = wuv0Var2.i0;
                M.j();
            }
            frv0 frv0Var2 = frv0Var;
            wh50 wh50Var = this.c;
            if (Float.isNaN(((pco) ((zak0) wh50Var).getValue()).b)) {
                int i4 = iArr[textType.ordinal()];
                if (i4 == 1) {
                    f = fyj0.a;
                } else if (i4 == 2) {
                    f = fyj0.b;
                } else {
                    if (i4 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f = fyj0.c;
                }
            } else {
                f = ((pco) ((zak0) wh50Var).getValue()).b;
            }
            float f2 = f;
            wh50 wh50Var2 = this.d;
            q630.a aVar2 = q630.a.a;
            if (str != null) {
                M.K(1292082340);
                erv0.b(str, com.vk.core.compose.component.semantics.b.b(aVar2, (SemanticsConfiguration) ((zak0) wh50Var2).getValue()), f2, null, 0, false, 0, 0, null, frv0Var2, M, 0, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
                M.j();
            } else {
                M.K(1292360689);
                erv0.a(((wak0) this.b).getIntValue(), frv0Var2, com.vk.core.compose.component.semantics.b.b(aVar2, (SemanticsConfiguration) ((zak0) wh50Var2).getValue()), f2, M, 0, 0);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new x4a(this, textType, i, 11);
        }
    }
}
