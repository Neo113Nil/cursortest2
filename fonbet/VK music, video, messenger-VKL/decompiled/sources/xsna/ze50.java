package xsna;

import com.vk.music.bottomsheets.settings.presentation.LoadMixSettingsStateValue;
import kotlin.NoWhenBranchMatchedException;
import xsna.ye50;

/* compiled from: MusicVkMixSettingsReducer.kt */
/* loaded from: classes3.dex */
public final class ze50 extends dm50<df50, ye50, cf50> {

    /* compiled from: MusicVkMixSettingsReducer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadMixSettingsStateValue.values().length];
            try {
                iArr[LoadMixSettingsStateValue.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadMixSettingsStateValue.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoadMixSettingsStateValue.COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.dm50
    public final cf50 c(cf50 cf50Var, ye50 ye50Var) {
        cf50 cf50Var2 = cf50Var;
        ye50 ye50Var2 = ye50Var;
        if (ye50Var2 instanceof ye50.b) {
            return cf50.a(cf50Var2, LoadMixSettingsStateValue.COMPLETED, ((ye50.b) ye50Var2).b);
        }
        if (ye50Var2.equals(ye50.a.b)) {
            return cf50.a(cf50Var2, LoadMixSettingsStateValue.ERROR, null);
        }
        if (ye50Var2.equals(ye50.c.b)) {
            return cf50.a(cf50Var2, LoadMixSettingsStateValue.LOADING, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final df50 d() {
        return new df50(e(new b4r(20)), e(new uuz(10)), e(new ept(15)));
    }

    @Override // xsna.dm50
    public final void h(cf50 cf50Var, df50 df50Var) {
        cf50 cf50Var2 = cf50Var;
        df50 df50Var2 = df50Var;
        int i = a.$EnumSwitchMapping$0[cf50Var2.b.ordinal()];
        if (i == 1) {
            f(df50Var2.c, cf50Var2);
        } else if (i == 2) {
            f(df50Var2.b, cf50Var2);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            f(df50Var2.a, cf50Var2);
        }
    }
}
