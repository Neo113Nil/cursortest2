package xsna;

import com.vk.games.presentation.catalog.model.SectionTypePrefixKey;
import java.util.Objects;

/* compiled from: MyGameModel.kt */
/* loaded from: classes17.dex */
public final class ko50 {
    public final sbt a;
    public final uet b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public ko50(sbt sbtVar, uet uetVar, String str, String str2, String str3) {
        this.a = sbtVar;
        this.b = uetVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
        Object obj = uetVar.b;
        this.f = SectionTypePrefixKey.MY_GAME_SECTION.h() + '_' + (obj == null ? Integer.valueOf(Objects.hash(Long.valueOf(sbtVar.a.b), str, str2)) : obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ko50)) {
            return false;
        }
        ko50 ko50Var = (ko50) obj;
        return epx.f(this.a, ko50Var.a) && epx.f(this.b, ko50Var.b) && epx.f(this.c, ko50Var.c) && epx.f(this.d, ko50Var.d) && epx.f(this.e, ko50Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + urd0.a(urd0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MyGameModel(extendedApp=");
        sb.append(this.a);
        sb.append(", trackedApp=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", subtitle=");
        sb.append(this.d);
        sb.append(", sectionTrackCode=");
        return ho8.a(sb, this.e, ')');
    }
}
