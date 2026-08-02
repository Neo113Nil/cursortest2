package xsna;

import androidx.compose.animation.EnterExitState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;

/* compiled from: EnterExitTransition.kt */
/* loaded from: classes11.dex */
public final class hnp extends Lambda implements izs<EnterExitState, lkp0> {
    final /* synthetic */ qpp $enter;
    final /* synthetic */ d5q $exit;
    final /* synthetic */ lkp0 $transformOriginWhenVisible;

    /* compiled from: EnterExitTransition.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnterExitState.values().length];
            try {
                iArr[EnterExitState.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnterExitState.PreEnter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnterExitState.PostExit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hnp(lkp0 lkp0Var, qpp qppVar, d5q d5qVar) {
        super(1);
        this.$transformOriginWhenVisible = lkp0Var;
        this.$enter = qppVar;
        this.$exit = d5qVar;
    }

    @Override // xsna.izs
    public final lkp0 invoke(EnterExitState enterExitState) {
        lkp0 lkp0Var;
        lkp0 lkp0Var2;
        int i = a.$EnumSwitchMapping$0[enterExitState.ordinal()];
        if (i != 1) {
            lkp0Var = null;
            if (i == 2) {
                h4h0 h4h0Var = this.$enter.a().d;
                if (h4h0Var != null) {
                    lkp0Var2 = new lkp0(h4h0Var.b);
                } else {
                    h4h0 h4h0Var2 = this.$exit.a().d;
                    if (h4h0Var2 != null) {
                        lkp0Var2 = new lkp0(h4h0Var2.b);
                    }
                }
                lkp0Var = lkp0Var2;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                h4h0 h4h0Var3 = this.$exit.a().d;
                if (h4h0Var3 != null) {
                    lkp0Var2 = new lkp0(h4h0Var3.b);
                } else {
                    h4h0 h4h0Var4 = this.$enter.a().d;
                    if (h4h0Var4 != null) {
                        lkp0Var2 = new lkp0(h4h0Var4.b);
                    }
                }
                lkp0Var = lkp0Var2;
            }
        } else {
            lkp0Var = this.$transformOriginWhenVisible;
        }
        return new lkp0(lkp0Var != null ? lkp0Var.a : lkp0.b);
    }
}
