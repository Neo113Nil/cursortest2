package xsna;

import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.games.model.GamesCatalogActivityType;
import com.vk.games.model.GamesCatalogUser;
import com.vk.games.presentation.catalog.model.SectionTypePrefixKey;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;

/* compiled from: ActivityItem.kt */
/* loaded from: classes17.dex */
public final class s90 {
    public final sbt a;
    public final uet b;
    public final GamesCatalogUser c;
    public final GamesCatalogActivityType d;
    public final int e;
    public final Integer f;
    public final Integer g;
    public final String h;
    public final WebImage i;
    public final String j;
    public final String k;

    /* compiled from: ActivityItem.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GamesCatalogActivityType.values().length];
            try {
                iArr[GamesCatalogActivityType.INSTALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GamesCatalogActivityType.LEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GamesCatalogActivityType.SCORE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GamesCatalogActivityType.ACHIEVEMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GamesCatalogActivityType.STICKERS_ACHIEVEMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public s90(sbt sbtVar, uet uetVar, GamesCatalogUser gamesCatalogUser, GamesCatalogActivityType gamesCatalogActivityType, int i, Integer num, Integer num2, String str, WebImage webImage, String str2) {
        WebApiApplication webApiApplication;
        this.a = sbtVar;
        this.b = uetVar;
        this.c = gamesCatalogUser;
        this.d = gamesCatalogActivityType;
        this.e = i;
        this.f = num;
        this.g = num2;
        this.h = str;
        this.i = webImage;
        this.j = str2;
        this.k = SectionTypePrefixKey.ACTIVITY_SECTION.h() + '_' + Objects.hash((sbtVar == null || (webApiApplication = sbtVar.a) == null) ? null : Long.valueOf(webApiApplication.b), gamesCatalogUser.a, gamesCatalogActivityType, Integer.valueOf(i), num, num2, str);
    }

    public final void a(s8u0 s8u0Var, String str, String str2, int i, h2v0 h2v0Var, h2v0 h2v0Var2) {
        WebApiApplication webApiApplication;
        sbt sbtVar = this.a;
        String str3 = (sbtVar == null || (webApiApplication = sbtVar.a) == null) ? null : webApiApplication.c;
        s8u0Var.e((str3 == null || drm0.N(str3)) ? String.format(Locale.FRANCE, str, Arrays.copyOf(new Object[]{str2, Integer.valueOf(i)}, 2)) : String.format(Locale.FRANCE, str, Arrays.copyOf(new Object[]{str2, Integer.valueOf(i), str3}, 3)));
        rdi.D(s8u0Var, str2, h2v0Var);
        if (str3 == null || drm0.N(str3)) {
            return;
        }
        rdi.C(s8u0Var, str3, h2v0Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s90)) {
            return false;
        }
        s90 s90Var = (s90) obj;
        return epx.f(this.a, s90Var.a) && epx.f(this.b, s90Var.b) && epx.f(this.c, s90Var.c) && this.d == s90Var.d && this.e == s90Var.e && epx.f(this.f, s90Var.f) && epx.f(this.g, s90Var.g) && epx.f(this.h, s90Var.h) && epx.f(this.i, s90Var.i) && epx.f(this.j, s90Var.j);
    }

    public final int hashCode() {
        sbt sbtVar = this.a;
        int hashCode = (sbtVar == null ? 0 : sbtVar.hashCode()) * 31;
        uet uetVar = this.b;
        int a2 = shy.a(this.e, (this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (uetVar == null ? 0 : uetVar.hashCode())) * 31)) * 31)) * 31, 31);
        Integer num = this.f;
        int hashCode2 = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.g;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.h;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        WebImage webImage = this.i;
        return this.j.hashCode() + ((hashCode4 + (webImage != null ? webImage.b.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityItem(extendedApp=");
        sb.append(this.a);
        sb.append(", trackedApp=");
        sb.append(this.b);
        sb.append(", userProfile=");
        sb.append(this.c);
        sb.append(", type=");
        sb.append(this.d);
        sb.append(", date=");
        sb.append(this.e);
        sb.append(", value=");
        sb.append(this.f);
        sb.append(", level=");
        sb.append(this.g);
        sb.append(", text=");
        sb.append(this.h);
        sb.append(", icon=");
        sb.append(this.i);
        sb.append(", sectionTrackCode=");
        return ho8.a(sb, this.j, ')');
    }
}
