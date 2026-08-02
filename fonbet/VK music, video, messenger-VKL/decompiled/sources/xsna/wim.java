package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.api.generated.account.dto.AccountBanSourceDto;
import com.vk.api.generated.messages.dto.MessagesConversationBarCallbackSourceDto;
import com.vk.api.generated.messages.dto.MessagesDeleteConversationSourceDto;
import com.vk.api.generated.reports.dto.ReportsAddReportSourceLabelDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.user.UserSex;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;

/* compiled from: DialogProfileDeleteBanReportCmd.kt */
/* loaded from: classes2.dex */
public final class wim extends le6<a> {
    public final Peer b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final UserSex k;
    public final boolean l = true;

    /* compiled from: DialogProfileDeleteBanReportCmd.kt */
    public static final class a {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final String d;
        public final UserSex e;

        public a(boolean z, boolean z2, boolean z3, String str, UserSex userSex) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = str;
            this.e = userSex;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && epx.f(this.d, aVar.d) && this.e == aVar.e;
        }

        public final int hashCode() {
            int b = qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
            String str = this.d;
            return this.e.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return "Result(isReportedAsSpam=" + this.a + ", isChatDeleted=" + this.b + ", isBanned=" + this.c + ", userName=" + this.d + ", userSex=" + this.e + ')';
        }
    }

    public wim(Peer peer, boolean z, boolean z2, boolean z3, String str, String str2, String str3, String str4, String str5, UserSex userSex) {
        this.b = peer;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = str5;
        this.k = userSex;
    }

    @Override // xsna.le6
    public final a e(w2w w2wVar) {
        Object failure;
        boolean booleanValue;
        Object failure2;
        boolean booleanValue2;
        Object failure3;
        boolean z = this.e;
        Boolean valueOf = Boolean.valueOf(z);
        boolean z2 = this.d;
        Boolean valueOf2 = Boolean.valueOf(z2);
        boolean z3 = this.c;
        List l = e43.l(valueOf, valueOf2, Boolean.valueOf(z3));
        if (!(l instanceof Collection) || !l.isEmpty()) {
            Iterator it = l.iterator();
            while (it.hasNext()) {
                if (((Boolean) it.next()).booleanValue()) {
                    String str = this.f;
                    Peer peer = this.b;
                    w2wVar.L0(this, new pfm(peer, str, CampaignEx.JSON_NATIVE_VIDEO_CLOSE));
                    boolean z4 = false;
                    if (z) {
                        try {
                            String str2 = this.f;
                            Peer peer2 = this.b;
                            String str3 = this.i;
                            String str4 = this.g;
                            String str5 = this.h;
                            ReportsAddReportSourceLabelDto reportsAddReportSourceLabelDto = ReportsAddReportSourceLabelDto.ANTISPAM_MODAL;
                            MessagesConversationBarCallbackSourceDto messagesConversationBarCallbackSourceDto = MessagesConversationBarCallbackSourceDto.ANTISPAM_MODAL;
                            boolean z5 = this.l;
                            Serializer.c<Peer> cVar = Peer.CREATOR;
                            w2wVar.L0(this, new c6g0(str2, peer2, Peer.Unknown.e, str3, str4, str5, reportsAddReportSourceLabelDto, messagesConversationBarCallbackSourceDto, z5));
                            failure = Boolean.TRUE;
                        } catch (Throwable th) {
                            failure = new Result.Failure(th);
                        }
                        Object obj = Boolean.FALSE;
                        if (failure instanceof Result.Failure) {
                            failure = obj;
                        }
                        booleanValue = ((Boolean) failure).booleanValue();
                    } else {
                        booleanValue = false;
                    }
                    if (z2) {
                        try {
                            bz2.c(new kn(peer, this.l, AccountBanSourceDto.ANTISPAM_MODAL), null);
                            failure2 = Boolean.TRUE;
                        } catch (Throwable th2) {
                            failure2 = new Result.Failure(th2);
                        }
                        Object obj2 = Boolean.FALSE;
                        if (failure2 instanceof Result.Failure) {
                            failure2 = obj2;
                        }
                        booleanValue2 = ((Boolean) failure2).booleanValue();
                    } else {
                        booleanValue2 = false;
                    }
                    if (z3) {
                        try {
                            w2wVar.L0(this, new kj30(this.b, this.e, true, false, this.l, MessagesDeleteConversationSourceDto.ANTISPAM_MODAL, this.i));
                            failure3 = Boolean.TRUE;
                        } catch (Throwable th3) {
                            failure3 = new Result.Failure(th3);
                        }
                        Object obj3 = Boolean.FALSE;
                        if (failure3 instanceof Result.Failure) {
                            failure3 = obj3;
                        }
                        z4 = ((Boolean) failure3).booleanValue();
                    }
                    return new a(booleanValue, z4, booleanValue2, this.j, this.k);
                }
            }
        }
        return new a(false, false, false, this.j, this.k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wim)) {
            return false;
        }
        wim wimVar = (wim) obj;
        return epx.f(this.b, wimVar.b) && this.c == wimVar.c && this.d == wimVar.d && this.e == wimVar.e && epx.f(this.f, wimVar.f) && epx.f(this.g, wimVar.g) && epx.f(this.h, wimVar.h) && epx.f(this.i, wimVar.i) && epx.f(this.j, wimVar.j) && this.k == wimVar.k && this.l == wimVar.l;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int a2 = urd0.a(qoy.b(qoy.b(qoy.b(Long.hashCode(this.b.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.j;
        return Boolean.hashCode(this.l) + ((this.k.hashCode() + ((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31)) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogProfileDeleteBanReportCmd(peer=");
        sb.append(this.b);
        sb.append(", shouldDeleteChat=");
        sb.append(this.c);
        sb.append(", shouldBan=");
        sb.append(this.d);
        sb.append(", shouldReportSpam=");
        sb.append(this.e);
        sb.append(", infoBarName=");
        sb.append(this.f);
        sb.append(", callbackData=");
        sb.append(this.g);
        sb.append(", source=");
        sb.append(this.h);
        sb.append(", changerTag=");
        sb.append(this.i);
        sb.append(", userName=");
        sb.append(this.j);
        sb.append(", userSex=");
        sb.append(this.k);
        sb.append(", awaitNetwork=");
        return defpackage.q0.a(sb, this.l, ')');
    }
}
