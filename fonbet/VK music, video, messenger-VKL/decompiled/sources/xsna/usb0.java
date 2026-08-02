package xsna;

import com.vk.core.view.components.button.VkButton;
import com.vk.dto.polls.Poll;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PollAttachment;

/* compiled from: PollV3State.kt */
/* loaded from: classes4.dex */
public final class usb0 implements km50 {
    public final PollAttachment b;
    public final Poll c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final int k;
    public final VkButton.Mode l;
    public final VkButton.Appearance m;
    public final Integer n;

    public usb0() {
        this(0);
    }

    public static usb0 a(usb0 usb0Var, PollAttachment pollAttachment, Poll poll, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, int i, VkButton.Mode mode, VkButton.Appearance appearance, Integer num, int i2) {
        if ((i2 & 1) != 0) {
            pollAttachment = usb0Var.b;
        }
        PollAttachment pollAttachment2 = pollAttachment;
        Poll poll2 = (i2 & 2) != 0 ? usb0Var.c : poll;
        String str4 = (i2 & 4) != 0 ? usb0Var.d : str;
        String str5 = (i2 & 8) != 0 ? usb0Var.e : str2;
        String str6 = (i2 & 16) != 0 ? usb0Var.f : str3;
        boolean z5 = (i2 & 32) != 0 ? usb0Var.g : z;
        boolean z6 = (i2 & 64) != 0 ? usb0Var.h : z2;
        boolean z7 = (i2 & 128) != 0 ? usb0Var.i : z3;
        boolean z8 = (i2 & 256) != 0 ? usb0Var.j : z4;
        int i3 = (i2 & 512) != 0 ? usb0Var.k : i;
        VkButton.Mode mode2 = (i2 & 1024) != 0 ? usb0Var.l : mode;
        VkButton.Appearance appearance2 = (i2 & 2048) != 0 ? usb0Var.m : appearance;
        Integer num2 = (i2 & 4096) != 0 ? usb0Var.n : num;
        usb0Var.getClass();
        return new usb0(pollAttachment2, poll2, str4, str5, str6, z5, z6, z7, z8, i3, mode2, appearance2, num2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof usb0)) {
            return false;
        }
        usb0 usb0Var = (usb0) obj;
        return epx.f(this.b, usb0Var.b) && epx.f(this.c, usb0Var.c) && epx.f(this.d, usb0Var.d) && epx.f(this.e, usb0Var.e) && epx.f(this.f, usb0Var.f) && this.g == usb0Var.g && this.h == usb0Var.h && this.i == usb0Var.i && this.j == usb0Var.j && this.k == usb0Var.k && this.l == usb0Var.l && this.m == usb0Var.m && epx.f(this.n, usb0Var.n);
    }

    public final int hashCode() {
        PollAttachment pollAttachment = this.b;
        int hashCode = (pollAttachment == null ? 0 : pollAttachment.f.hashCode()) * 31;
        Poll poll = this.c;
        int a = urd0.a((hashCode + (poll == null ? 0 : poll.hashCode())) * 31, 31, this.d);
        String str = this.e;
        int hashCode2 = (this.m.hashCode() + ((this.l.hashCode() + shy.a(this.k, qoy.b(qoy.b(qoy.b(qoy.b(urd0.a((a + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31)) * 31)) * 31;
        Integer num = this.n;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PollV3State(attachment=");
        sb.append(this.b);
        sb.append(", poll=");
        sb.append(this.c);
        sb.append(", ref=");
        sb.append(this.d);
        sb.append(", trackCode=");
        sb.append(this.e);
        sb.append(", voteContext=");
        sb.append(this.f);
        sb.append(", isError=");
        sb.append(this.g);
        sb.append(", answerAdded=");
        sb.append(this.h);
        sb.append(", answerDeleted=");
        sb.append(this.i);
        sb.append(", voteButtonEnabled=");
        sb.append(this.j);
        sb.append(", voteButtonText=");
        sb.append(this.k);
        sb.append(", voteButtonMode=");
        sb.append(this.l);
        sb.append(", voteButtonAppearance=");
        sb.append(this.m);
        sb.append(", toastMessage=");
        return uqi.b(sb, this.n, ')');
    }

    public usb0(PollAttachment pollAttachment, Poll poll, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, int i, VkButton.Mode mode, VkButton.Appearance appearance, Integer num) {
        this.b = pollAttachment;
        this.c = poll;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = i;
        this.l = mode;
        this.m = appearance;
        this.n = num;
    }

    public /* synthetic */ usb0(int i) {
        this(null, null, "poll", null, "wall", false, false, false, false, R.string.poll_vote, VkButton.Mode.Primary, VkButton.Appearance.Accent, null);
    }
}
