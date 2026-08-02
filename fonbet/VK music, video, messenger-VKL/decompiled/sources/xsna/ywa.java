package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import java.util.Collections;
import xsna.xwa;

/* compiled from: ChannelCreateCmd.kt */
/* loaded from: classes2.dex */
public final class ywa extends le6<a> {
    public final String b;
    public final String c;
    public final UserId d;
    public final boolean e;

    /* compiled from: ChannelCreateCmd.kt */
    public static final class a {
        public final Peer a;
        public final Throwable b;

        public a(Peer peer, Exception exc) {
            this.a = peer;
            this.b = exc;
        }
    }

    public ywa() {
        this(31, null, null, null, false);
    }

    @Override // xsna.le6
    public final a e(w2w w2wVar) {
        Exception exc;
        String str;
        String str2 = this.c;
        if (str2.length() > 0) {
            try {
                str = (String) bz2.c(new ava(str2), null);
                exc = null;
            } catch (Exception e) {
                exc = e;
                str = null;
            }
        } else {
            str = null;
            exc = null;
        }
        Peer peer = ((xwa.a) bz2.c(new xwa(this.d, this.e, this.b, str), null)).a;
        wpp wppVar = (wpp) w2wVar.J0(this, new gfb(Collections.singletonList(peer), Source.NETWORK, false, 8)).await();
        if (str2.length() > 0 && exc == null) {
            w2wVar.e1(this, new r280(null, wppVar));
        }
        return new a(peer, exc);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ywa)) {
            return false;
        }
        ywa ywaVar = (ywa) obj;
        return epx.f(this.b, ywaVar.b) && epx.f(this.c, ywaVar.c) && epx.f(this.d, ywaVar.d) && this.e == ywaVar.e;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        String str = this.b;
        int b = qoy.b(urd0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.c), 31, false);
        UserId userId = this.d;
        return Boolean.hashCode(this.e) + ((b + (userId != null ? Long.hashCode(userId.b) : 0)) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelCreateCmd(channelName=");
        sb.append(this.b);
        sb.append(", channelAvatar=");
        sb.append(this.c);
        sb.append(", awaitNetwork=false, parentId=");
        sb.append(this.d);
        sb.append(", commentsEnabled=");
        return defpackage.q0.a(sb, this.e, ')');
    }

    public ywa(int i, UserId userId, String str, String str2, boolean z) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? "" : str2;
        userId = (i & 8) != 0 ? null : userId;
        z = (i & 16) != 0 ? false : z;
        this.b = str;
        this.c = str2;
        this.d = userId;
        this.e = z;
    }
}
