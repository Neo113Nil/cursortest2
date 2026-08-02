package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.clickable.ClickableQuestion;

/* compiled from: ClickableStickerDTO.kt */
/* loaded from: classes6.dex */
public final class eu3 {
    public final ClickableQuestion a;
    public final String b;
    public final UserId c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public eu3(ClickableQuestion clickableQuestion, String str, UserId userId, int i, boolean z, boolean z2, boolean z3) {
        this.a = clickableQuestion;
        this.b = str;
        this.c = userId;
        this.d = i;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eu3)) {
            return false;
        }
        eu3 eu3Var = (eu3) obj;
        return epx.f(this.a, eu3Var.a) && epx.f(this.b, eu3Var.b) && epx.f(this.c, eu3Var.c) && this.d == eu3Var.d && this.e == eu3Var.e && this.f == eu3Var.f && this.g == eu3Var.g;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.g) + qoy.b(qoy.b(shy.a(this.d, bh10.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c.b), 31), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AskQuestionViewParams(question=");
        sb.append(this.a);
        sb.append(", ownerFirstName=");
        sb.append(this.b);
        sb.append(", ownerId=");
        sb.append(this.c);
        sb.append(", itemId=");
        sb.append(this.d);
        sb.append(", canAsk=");
        sb.append(this.e);
        sb.append(", canAskAnonymous=");
        sb.append(this.f);
        sb.append(", isPrivateFirst=");
        return defpackage.q0.a(sb, this.g, ')');
    }
}
