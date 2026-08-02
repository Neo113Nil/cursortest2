package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.api.generated.messages.dto.MessagesConversationBarCallbackSourceDto;
import com.vk.api.generated.messages.dto.MessagesDeleteConversationSourceDto;
import com.vk.api.generated.reports.dto.ReportsAddReportSourceLabelDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import kotlin.Result;

/* compiled from: DialogChatDeleteAndReportCmd.kt */
/* loaded from: classes2.dex */
public final class nbm extends le6<a> {
    public final Peer b;
    public final Peer c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final boolean j = true;

    /* compiled from: DialogChatDeleteAndReportCmd.kt */
    public static final class a {
        public final boolean a;
        public final boolean b;

        public a(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Result(isReportedAsSpam=");
            sb.append(this.a);
            sb.append(", isChatDeleted=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    public nbm(Peer peer, Peer peer2, boolean z, boolean z2, String str, String str2, String str3, String str4) {
        this.b = peer;
        this.c = peer2;
        this.d = z;
        this.e = z2;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
    }

    @Override // xsna.le6
    public final a e(w2w w2wVar) {
        Object failure;
        boolean booleanValue;
        Object failure2;
        boolean z = this.d;
        boolean z2 = false;
        boolean z3 = this.e;
        if (!z3 && !z) {
            return new a(false, false);
        }
        String str = this.f;
        Peer peer = this.b;
        w2wVar.L0(this, new pfm(peer, str, CampaignEx.JSON_NATIVE_VIDEO_CLOSE));
        if (z3) {
            try {
                String str2 = this.f;
                Peer peer2 = this.b;
                Peer peer3 = this.c;
                if (peer3 == null) {
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    peer3 = Peer.Unknown.e;
                }
                w2wVar.L0(this, new c6g0(str2, peer2, peer3, this.i, this.g, this.h, ReportsAddReportSourceLabelDto.ANTISPAM_MODAL, MessagesConversationBarCallbackSourceDto.ANTISPAM_MODAL, this.j));
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
        if (z) {
            try {
                w2wVar.L0(this, new wrm(peer, this.j, this.i));
                w2wVar.L0(this, new kj30(this.b, this.e, true, false, true, MessagesDeleteConversationSourceDto.ANTISPAM_MODAL, this.i));
                failure2 = Boolean.TRUE;
            } catch (Throwable th2) {
                failure2 = new Result.Failure(th2);
            }
            Object obj2 = Boolean.FALSE;
            if (failure2 instanceof Result.Failure) {
                failure2 = obj2;
            }
            z2 = ((Boolean) failure2).booleanValue();
        }
        return new a(booleanValue, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nbm)) {
            return false;
        }
        nbm nbmVar = (nbm) obj;
        return epx.f(this.b, nbmVar.b) && epx.f(this.c, nbmVar.c) && this.d == nbmVar.d && this.e == nbmVar.e && epx.f(this.f, nbmVar.f) && epx.f(this.g, nbmVar.g) && epx.f(this.h, nbmVar.h) && epx.f(this.i, nbmVar.i) && this.j == nbmVar.j;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int hashCode = Long.hashCode(this.b.b) * 31;
        Peer peer = this.c;
        return Boolean.hashCode(this.j) + urd0.a(urd0.a(urd0.a(urd0.a(qoy.b(qoy.b((hashCode + (peer == null ? 0 : Long.hashCode(peer.b))) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogChatDeleteAndReportCmd(peer=");
        sb.append(this.b);
        sb.append(", owner=");
        sb.append(this.c);
        sb.append(", shouldDeleteAndExitChat=");
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
        sb.append(", isAwaitNetwork=");
        return defpackage.q0.a(sb, this.j, ')');
    }
}
