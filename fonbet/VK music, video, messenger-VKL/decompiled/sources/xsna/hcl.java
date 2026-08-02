package xsna;

import androidx.compose.ui.state.ToggleableState;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: Checkbox.kt */
/* loaded from: classes11.dex */
public final class hcl implements u1c {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    /* compiled from: Checkbox.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public hcl(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    @Override // xsna.u1c
    public final mtk0<l5g> a(boolean z, ToggleableState toggleableState, androidx.compose.runtime.a aVar, int i) {
        long j;
        androidx.compose.runtime.a aVar2;
        mtk0<l5g> c;
        aVar.K(-1568341342);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1568341342, i, -1, "androidx.compose.material.DefaultCheckboxColors.borderColor (Checkbox.kt:445)");
        }
        if (z) {
            int i2 = a.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i2 == 1 || i2 == 2) {
                j = this.a;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j = this.b;
            }
        } else {
            int i3 = a.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    j = this.d;
                } else if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            j = this.c;
        }
        long j2 = j;
        if (z) {
            aVar.K(-1801897268);
            aVar2 = aVar;
            c = lwj0.b(j2, jq2.d(toggleableState == ToggleableState.Off ? 100 : 50, 0, null, 6), null, aVar2, 0, 12);
            aVar2.j();
        } else {
            aVar2 = aVar;
            aVar2.K(-1801716724);
            c = androidx.compose.runtime.k.c(new l5g(j2), aVar2, 0);
            aVar2.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar2.j();
        return c;
    }
}
