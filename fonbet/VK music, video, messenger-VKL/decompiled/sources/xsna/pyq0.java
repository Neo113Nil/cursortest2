package xsna;

import com.vk.onboardingscreens.impl.recomthemes.domain.model.UserRecomThemesBackButtonAction;
import java.util.List;

/* compiled from: UserRecomThemesChooserRender.kt */
/* loaded from: classes4.dex */
public interface pyq0 extends fm50<ryq0> {

    /* compiled from: UserRecomThemesChooserRender.kt */
    public static final class a implements pyq0 {
        public final yzt0<Boolean> a;
        public final yzt0<Boolean> b;
        public final yzt0<Boolean> c;
        public final yzt0<Boolean> d;
        public final yzt0<List<faf0>> e;
        public final yzt0<Integer> f;
        public final yzt0<Integer> g;
        public final yzt0<Integer> h;
        public final yzt0<String> i;
        public final yzt0<Integer> j;
        public final yzt0<Integer> k;
        public final yzt0<UserRecomThemesBackButtonAction> l;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5, h0u0 h0u0Var6, h0u0 h0u0Var7, h0u0 h0u0Var8, h0u0 h0u0Var9, h0u0 h0u0Var10, h0u0 h0u0Var11, h0u0 h0u0Var12) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
            this.d = h0u0Var4;
            this.e = h0u0Var5;
            this.f = h0u0Var6;
            this.g = h0u0Var7;
            this.h = h0u0Var8;
            this.i = h0u0Var9;
            this.j = h0u0Var10;
            this.k = h0u0Var11;
            this.l = h0u0Var12;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && epx.f(this.i, aVar.i) && epx.f(this.j, aVar.j) && epx.f(this.k, aVar.k) && epx.f(this.l, aVar.l);
        }

        public final int hashCode() {
            return this.l.hashCode() + sr.a(this.k, sr.a(this.j, sr.a(this.i, sr.a(this.h, sr.a(this.g, sr.a(this.f, sr.a(this.e, sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(isLoading=");
            sb.append(this.a);
            sb.append(", isLoadingError=");
            sb.append(this.b);
            sb.append(", isButtonEnabled=");
            sb.append(this.c);
            sb.append(", isSkipButtonEnabled=");
            sb.append(this.d);
            sb.append(", items=");
            sb.append(this.e);
            sb.append(", buttonTitleRes=");
            sb.append(this.f);
            sb.append(", placeholderTitleRes=");
            sb.append(this.g);
            sb.append(", placeholderSubtitleRes=");
            sb.append(this.h);
            sb.append(", avatarUrl=");
            sb.append(this.i);
            sb.append(", currentStep=");
            sb.append(this.j);
            sb.append(", totalSteps=");
            sb.append(this.k);
            sb.append(", backButtonAction=");
            return tr.c(sb, this.l, ')');
        }
    }

    /* compiled from: UserRecomThemesChooserRender.kt */
    public static final class b implements pyq0 {
        public static final b a = new b();
    }
}
