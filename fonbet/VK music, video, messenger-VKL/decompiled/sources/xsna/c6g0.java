package xsna;

import com.vk.api.generated.messages.dto.MessagesConversationBarCallbackSourceDto;
import com.vk.api.generated.reports.dto.ReportsAddReportSourceLabelDto;
import com.vk.dto.common.Peer;

/* compiled from: ReportSpamWithCallbackCmd.kt */
/* loaded from: classes2.dex */
public final class c6g0 extends le6<s3q0> {
    public final String b;
    public final Peer c;
    public final Peer d;
    public final String e;
    public final String f;
    public final String g;
    public final ReportsAddReportSourceLabelDto h;
    public final MessagesConversationBarCallbackSourceDto i;
    public final boolean j;

    public c6g0(String str, Peer peer, Peer peer2, String str2, String str3, String str4, ReportsAddReportSourceLabelDto reportsAddReportSourceLabelDto, MessagesConversationBarCallbackSourceDto messagesConversationBarCallbackSourceDto, boolean z) {
        this.b = str;
        this.c = peer;
        this.d = peer2;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = reportsAddReportSourceLabelDto;
        this.i = messagesConversationBarCallbackSourceDto;
        this.j = z;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        String str = this.f;
        if (str == null || str.length() == 0) {
            w2wVar.L0(this, new y5g0(this.c, this.d, this.j, this.g, this.h));
        } else {
            w2wVar.L0(this, new nfm(this.c, this.b, this.f, this.i, this.j, this.e));
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6g0)) {
            return false;
        }
        c6g0 c6g0Var = (c6g0) obj;
        return epx.f(this.b, c6g0Var.b) && epx.f(this.c, c6g0Var.c) && epx.f(this.d, c6g0Var.d) && epx.f(this.e, c6g0Var.e) && epx.f(this.f, c6g0Var.f) && epx.f(this.g, c6g0Var.g) && this.h == c6g0Var.h && this.i == c6g0Var.i && this.j == c6g0Var.j;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int a = bh10.a(bh10.a(this.b.hashCode() * 31, 31, this.c.b), 31, this.d.b);
        String str = this.e;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ReportsAddReportSourceLabelDto reportsAddReportSourceLabelDto = this.h;
        int hashCode4 = (hashCode3 + (reportsAddReportSourceLabelDto == null ? 0 : reportsAddReportSourceLabelDto.hashCode())) * 31;
        MessagesConversationBarCallbackSourceDto messagesConversationBarCallbackSourceDto = this.i;
        return Boolean.hashCode(this.j) + ((hashCode4 + (messagesConversationBarCallbackSourceDto != null ? messagesConversationBarCallbackSourceDto.hashCode() : 0)) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("ReportSpamWithCallbackCmd(infoBarName=");
        sb.append(this.b);
        sb.append(", peer=");
        sb.append(this.c);
        sb.append(", owner=");
        sb.append(this.d);
        sb.append(", changerTag=");
        sb.append(this.e);
        sb.append(", callbackData=");
        sb.append(this.f);
        sb.append(", source=");
        sb.append(this.g);
        sb.append(", reportSourceLabel=");
        sb.append(this.h);
        sb.append(", conversationCallbackSource=");
        sb.append(this.i);
        sb.append(", awaitNetwork=");
        return defpackage.q0.a(sb, this.j, ')');
    }
}
