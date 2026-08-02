package xsna;

import com.vk.games.model.GamesCatalogActionType;

/* compiled from: GamesAchievementBlockModel.kt */
/* loaded from: classes17.dex */
public final class st {
    public final GamesCatalogActionType a;
    public final a63 b;
    public final String c;
    public final String d;

    /* compiled from: GamesAchievementBlockModel.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GamesCatalogActionType.values().length];
            try {
                iArr[GamesCatalogActionType.OPEN_URL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GamesCatalogActionType.OPEN_ACHIEVEMENT_MODAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public st(GamesCatalogActionType gamesCatalogActionType, a63 a63Var, String str, String str2) {
        this.a = gamesCatalogActionType;
        this.b = a63Var;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof st)) {
            return false;
        }
        st stVar = (st) obj;
        return this.a == stVar.a && epx.f(this.b, stVar.b) && epx.f(this.c, stVar.c) && epx.f(this.d, stVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        a63 a63Var = this.b;
        int hashCode2 = (hashCode + (a63Var == null ? 0 : a63Var.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AchievementActionModel(type=");
        sb.append(this.a);
        sb.append(", appLaunchParams=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.c);
        sb.append(", sectionTrackCode=");
        return ho8.a(sb, this.d, ')');
    }
}
