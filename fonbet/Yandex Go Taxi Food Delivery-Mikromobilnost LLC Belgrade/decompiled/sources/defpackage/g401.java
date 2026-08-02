package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes14.dex */
public final class g401 {
    public final int a;
    public final e501 b;
    public final UiStateDrawableWrapper c;
    public final UiStateDrawableWrapper d;
    public final UiStateDrawableWrapper e;

    public g401(int i, e501 e501Var, UiStateDrawableWrapper uiStateDrawableWrapper, UiStateDrawableWrapper uiStateDrawableWrapper2, UiStateDrawableWrapper uiStateDrawableWrapper3) {
        this.a = i;
        this.b = e501Var;
        this.c = uiStateDrawableWrapper;
        this.d = uiStateDrawableWrapper2;
        this.e = uiStateDrawableWrapper3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g401)) {
            return false;
        }
        g401 g401Var = (g401) obj;
        return this.a == g401Var.a && jl40.l(this.b, g401Var.b) && jl40.l(this.c, g401Var.c) && jl40.l(this.d, g401Var.d) && jl40.l(this.e, g401Var.e);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        e501 e501Var = this.b;
        int hashCode2 = (hashCode + (e501Var == null ? 0 : e501Var.hashCode())) * 31;
        UiStateDrawableWrapper uiStateDrawableWrapper = this.c;
        int hashCode3 = (hashCode2 + (uiStateDrawableWrapper == null ? 0 : uiStateDrawableWrapper.hashCode())) * 31;
        UiStateDrawableWrapper uiStateDrawableWrapper2 = this.d;
        int hashCode4 = (hashCode3 + (uiStateDrawableWrapper2 == null ? 0 : uiStateDrawableWrapper2.hashCode())) * 31;
        UiStateDrawableWrapper uiStateDrawableWrapper3 = this.e;
        return hashCode4 + (uiStateDrawableWrapper3 != null ? uiStateDrawableWrapper3.hashCode() : 0);
    }

    public final String toString() {
        return "TrackingCardRatingUiState(score=" + this.a + ", selectAnimationColor=" + this.b + ", selectedStarDrawable=" + this.c + ", unselectedStarDrawable=" + this.d + ", backgroundDrawable=" + this.e + Extension.C_BRAKE;
    }

    public /* synthetic */ g401(int i) {
        this(i, null, null, null, null);
    }
}
