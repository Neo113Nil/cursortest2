package xsna;

import com.vk.music.bottomsheets.reactions.presentation.LoadReactionsStateValue;
import kotlin.NoWhenBranchMatchedException;
import xsna.fu4;

/* compiled from: AudioReactionsReducer.kt */
/* loaded from: classes3.dex */
public final class gu4 extends dm50<lu4, fu4, ku4> {

    /* compiled from: AudioReactionsReducer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadReactionsStateValue.values().length];
            try {
                iArr[LoadReactionsStateValue.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadReactionsStateValue.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoadReactionsStateValue.COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.dm50
    public final ku4 c(ku4 ku4Var, fu4 fu4Var) {
        ku4 ku4Var2 = ku4Var;
        fu4 fu4Var2 = fu4Var;
        if (fu4Var2 instanceof fu4.b) {
            return ku4.a(ku4Var2, LoadReactionsStateValue.COMPLETED, ((fu4.b) fu4Var2).b);
        }
        if (fu4Var2.equals(fu4.a.b)) {
            return ku4.a(ku4Var2, LoadReactionsStateValue.ERROR, null);
        }
        if (fu4Var2.equals(fu4.c.b)) {
            return ku4.a(ku4Var2, LoadReactionsStateValue.LOADING, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final lu4 d() {
        return new lu4(e(new i8(7)), e(new com.vk.movika.sdk.base.observable.i(4)), e(new j60(2)));
    }

    @Override // xsna.dm50
    public final void h(ku4 ku4Var, lu4 lu4Var) {
        ku4 ku4Var2 = ku4Var;
        lu4 lu4Var2 = lu4Var;
        int i = a.$EnumSwitchMapping$0[ku4Var2.b.ordinal()];
        if (i == 1) {
            f(lu4Var2.c, ku4Var2);
        } else if (i == 2) {
            f(lu4Var2.b, ku4Var2);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            f(lu4Var2.a, ku4Var2);
        }
    }
}
