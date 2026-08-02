package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.dto.common.id.UserId;

/* compiled from: NewsfeedSearchMviState.kt */
/* loaded from: classes4.dex */
public final class xx60 implements tw60<xx60> {
    public final UserId b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final String h;
    public final CharSequence i;
    public final CharSequence j;
    public final ry60 k;
    public final ur60 l;

    public xx60(UserId userId, String str, String str2, String str3, String str4, boolean z, String str5, CharSequence charSequence, CharSequence charSequence2, ry60 ry60Var, ur60 ur60Var) {
        this.b = userId;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = z;
        this.h = str5;
        this.i = charSequence;
        this.j = charSequence2;
        this.k = ry60Var;
        this.l = ur60Var;
    }

    public static xx60 a(xx60 xx60Var, String str, CharSequence charSequence, CharSequence charSequence2, ry60 ry60Var, ur60 ur60Var, int i) {
        UserId userId = xx60Var.b;
        String str2 = xx60Var.c;
        String str3 = xx60Var.d;
        if ((i & 8) != 0) {
            str = xx60Var.e;
        }
        String str4 = str;
        String str5 = xx60Var.f;
        boolean z = xx60Var.g;
        String str6 = xx60Var.h;
        if ((i & 128) != 0) {
            charSequence = xx60Var.i;
        }
        CharSequence charSequence3 = charSequence;
        CharSequence charSequence4 = (i & 256) != 0 ? xx60Var.j : charSequence2;
        ry60 ry60Var2 = (i & 512) != 0 ? xx60Var.k : ry60Var;
        ur60 ur60Var2 = (i & 1024) != 0 ? xx60Var.l : ur60Var;
        xx60Var.getClass();
        return new xx60(userId, str2, str3, str4, str5, z, str6, charSequence3, charSequence4, ry60Var2, ur60Var2);
    }

    @Override // xsna.tw60
    public final xx60 b(ur60 ur60Var) {
        return a(this, null, null, null, null, ur60Var, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xx60)) {
            return false;
        }
        xx60 xx60Var = (xx60) obj;
        return epx.f(this.b, xx60Var.b) && epx.f(this.c, xx60Var.c) && epx.f(this.d, xx60Var.d) && epx.f(this.e, xx60Var.e) && epx.f(this.f, xx60Var.f) && this.g == xx60Var.g && epx.f(this.h, xx60Var.h) && epx.f(this.i, xx60Var.i) && epx.f(this.j, xx60Var.j) && epx.f(this.k, xx60Var.k) && epx.f(this.l, xx60Var.l);
    }

    public final int hashCode() {
        UserId userId = this.b;
        int hashCode = (userId == null ? 0 : Long.hashCode(userId.b)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int b = qoy.b((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.g);
        String str5 = this.h;
        int hashCode5 = (b + (str5 == null ? 0 : str5.hashCode())) * 31;
        CharSequence charSequence = this.i;
        int hashCode6 = (hashCode5 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.j;
        int hashCode7 = (hashCode6 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        ry60 ry60Var = this.k;
        return this.l.hashCode() + ((hashCode7 + (ry60Var != null ? ry60Var.hashCode() : 0)) * 31);
    }

    @Override // xsna.tw60
    public final ur60 p() {
        return this.l;
    }

    public final String toString() {
        return "NewsfeedSearchMviState(ownerId=" + this.b + ", ownerName=" + this.c + ", keyHint=" + this.d + ", query=" + this.e + ", domain=" + this.f + ", startSpeechToText=" + this.g + ", situationalSuggestId=" + this.h + ", placeholderText=" + ((Object) this.i) + ", suggestedText=" + ((Object) this.j) + ", stories=" + this.k + ", listState=" + this.l + ')';
    }
}
