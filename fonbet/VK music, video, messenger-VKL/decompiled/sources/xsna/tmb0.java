package xsna;

import android.graphics.drawable.Drawable;
import com.vk.dto.polls.Poll;
import com.vk.dto.polls.PollOption;

/* compiled from: PollAttachmentAnswerUiDto.kt */
/* loaded from: classes4.dex */
public final class tmb0 {
    public final long a;
    public final PollOption b;
    public final Poll c;
    public final CharSequence d;
    public final CharSequence e;
    public final boolean f;
    public final int g;
    public final int h;
    public final String i;
    public final int j;
    public final Drawable k;
    public final int l;
    public final int m;

    public tmb0(long j, PollOption pollOption, Poll poll, CharSequence charSequence, String str, boolean z, int i, int i2, String str2, int i3, Drawable drawable, int i4, int i5) {
        this.a = j;
        this.b = pollOption;
        this.c = poll;
        this.d = charSequence;
        this.e = str;
        this.f = z;
        this.g = i;
        this.h = i2;
        this.i = str2;
        this.j = i3;
        this.k = drawable;
        this.l = i4;
        this.m = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tmb0)) {
            return false;
        }
        tmb0 tmb0Var = (tmb0) obj;
        return this.a == tmb0Var.a && this.b.equals(tmb0Var.b) && this.c.equals(tmb0Var.c) && epx.f(this.d, tmb0Var.d) && epx.f(this.e, tmb0Var.e) && this.f == tmb0Var.f && this.g == tmb0Var.g && this.h == tmb0Var.h && this.i.equals(tmb0Var.i) && this.j == tmb0Var.j && epx.f(this.k, tmb0Var.k) && this.l == tmb0Var.l && this.m == tmb0Var.m;
    }

    public final int hashCode() {
        int c = u11.c((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31)) * 31, 31, this.d);
        CharSequence charSequence = this.e;
        int a = shy.a(this.j, (this.i.hashCode() + shy.a(this.h, shy.a(this.g, qoy.b((c + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31, this.f), 31), 31)) * 31, 31);
        Drawable drawable = this.k;
        return Integer.hashCode(this.m) + shy.a(this.l, (a + (drawable != null ? drawable.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PollAttachmentAnswerUiDto(id=");
        sb.append(this.a);
        sb.append(", raw=");
        sb.append(this.b);
        sb.append(", poll=");
        sb.append(this.c);
        sb.append(", optionNameText=");
        sb.append((Object) this.d);
        sb.append(", optionNameContentDescription=");
        sb.append((Object) this.e);
        sb.append(", multipleChoiceIsChecked=");
        sb.append(this.f);
        sb.append(", multipleChoiceVisibility=");
        sb.append(this.g);
        sb.append(", progressVisibility=");
        sb.append(this.h);
        sb.append(", resultsText=");
        sb.append((Object) this.i);
        sb.append(", resultsVisibility=");
        sb.append(this.j);
        sb.append(", foregroundDrawable=");
        sb.append(this.k);
        sb.append(", level=");
        sb.append(this.l);
        sb.append(", highlightColor=");
        return vu5.b(sb, this.m, ')');
    }
}
