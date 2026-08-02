package xsna;

import androidx.compose.animation.EnterExitState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;

/* compiled from: EnterExitTransition.kt */
/* loaded from: classes11.dex */
public final class cnp extends Lambda implements izs<EnterExitState, Float> {
    final /* synthetic */ qpp $enter;
    final /* synthetic */ d5q $exit;

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
    public cnp(qpp qppVar, d5q d5qVar) {
        super(1);
        this.$enter = qppVar;
        this.$exit = d5qVar;
    }

    @Override // xsna.izs
    public final Float invoke(EnterExitState enterExitState) {
        int i = a.$EnumSwitchMapping$0[enterExitState.ordinal()];
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                ciq ciqVar = this.$enter.a().a;
                if (ciqVar != null) {
                    f = ciqVar.a;
                }
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                ciq ciqVar2 = this.$exit.a().a;
                if (ciqVar2 != null) {
                    f = ciqVar2.a;
                }
            }
        }
        return Float.valueOf(f);
    }
}
