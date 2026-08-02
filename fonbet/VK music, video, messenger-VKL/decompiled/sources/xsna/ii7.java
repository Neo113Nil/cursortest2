package xsna;

import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BoardTopic.kt */
/* loaded from: classes7.dex */
public final class ii7 {
    public int a;
    public String b;
    public int c;
    public int d;
    public int e;
    public UserId f;
    public int g;
    public UserId h;
    public CharSequence i;
    public UserProfile j;

    /* compiled from: BoardTopic.kt */
    public static final class a {
        public static ii7 a(JSONObject jSONObject, izs izsVar, izs izsVar2, CharSequence charSequence) throws JSONException {
            ii7 ii7Var = new ii7(0);
            ii7Var.a = jSONObject.getInt("id");
            ii7Var.b = cqm0.f(jSONObject.getString("title"));
            ii7Var.d = jSONObject.getInt("created");
            ii7Var.h = new UserId(jSONObject.getLong("created_by"));
            ii7Var.e = jSONObject.getInt("updated");
            if (jSONObject.getInt("is_closed") != 0) {
                ii7Var.g |= 1;
            }
            if (jSONObject.getInt("is_fixed") != 0) {
                ii7Var.g |= 2;
            }
            ii7Var.c = jSONObject.getInt("comments");
            if (jSONObject.has("last_comment")) {
                CharSequence charSequence2 = (CharSequence) izsVar.invoke(new Regex("\\[(id|club)[0-9]+(?::bp[-_0-9]+)?\\|([^\\]]+)\\]").g(jSONObject.optString("last_comment"), "$2"));
                if (charSequence2 instanceof SpannableStringBuilder) {
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence2;
                    CharacterStyle[] characterStyleArr = (CharacterStyle[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), CharacterStyle.class);
                    if (characterStyleArr != null) {
                        for (CharacterStyle characterStyle : characterStyleArr) {
                            spannableStringBuilder.removeSpan(characterStyle);
                        }
                    }
                }
                CharSequence charSequence3 = (CharSequence) izsVar2.invoke(charSequence2);
                if (charSequence3.length() != 0) {
                    charSequence = charSequence3;
                }
                ii7Var.i = charSequence;
            }
            return ii7Var;
        }
    }

    public ii7() {
        this(0);
    }

    public static final ii7 a(JSONObject jSONObject, qm qmVar, af2 af2Var, String str) throws JSONException {
        return a.a(jSONObject, qmVar, af2Var, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ii7)) {
            return false;
        }
        ii7 ii7Var = (ii7) obj;
        ii7Var.getClass();
        return this.a == ii7Var.a && epx.f(this.b, ii7Var.b) && this.c == ii7Var.c && this.d == ii7Var.d && this.e == ii7Var.e && epx.f(this.f, ii7Var.f) && this.g == ii7Var.g && epx.f(this.h, ii7Var.h) && epx.f(this.i, ii7Var.i) && epx.f(this.j, ii7Var.j);
    }

    public final int hashCode() {
        int a2 = shy.a(this.a, Integer.hashCode(0) * 31, 31);
        String str = this.b;
        int a3 = bh10.a(shy.a(this.g, bh10.a(shy.a(this.e, shy.a(this.d, shy.a(this.c, (a2 + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31, this.f.b), 31), 31, this.h.b);
        CharSequence charSequence = this.i;
        int hashCode = (a3 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        UserProfile userProfile = this.j;
        return hashCode + (userProfile != null ? userProfile.hashCode() : 0);
    }

    public final String toString() {
        return "BoardTopic(gid=0, id=" + this.a + ", title=" + this.b + ", numComments=" + this.c + ", created=" + this.d + ", updated=" + this.e + ", lastCommentUid=" + this.f + ", flags=" + this.g + ", creator=" + this.h + ", lastComment=" + ((Object) this.i) + ", updatedBy=" + this.j + ')';
    }

    public ii7(int i) {
        UserId userId = UserId.d;
        this.a = 0;
        this.b = null;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = userId;
        this.g = 0;
        this.h = userId;
        this.i = null;
        this.j = null;
    }
}
