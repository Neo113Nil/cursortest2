package xsna;

import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import java.util.Collections;

/* compiled from: ChannelEditCmd.kt */
/* loaded from: classes2.dex */
public final class kya extends le6<a> {
    public final UserId b;
    public final String c;
    public final String d;
    public final boolean e;

    /* compiled from: ChannelEditCmd.kt */
    public static final class a {
        public final boolean a;
        public final Throwable b;

        public a(boolean z, Exception exc) {
            this.a = z;
            this.b = exc;
        }
    }

    public kya(UserId userId, boolean z, String str, String str2) {
        this.b = userId;
        this.c = str;
        this.d = str2;
        this.e = z;
    }

    @Override // xsna.le6
    public final a e(w2w w2wVar) {
        Exception exc;
        String str;
        String str2 = this.d;
        if (str2 == null) {
            str = null;
            exc = null;
        } else {
            if (str2.length() == 0) {
                str = "";
            } else {
                try {
                    str = (String) bz2.c(new ava(str2), null);
                } catch (Exception e) {
                    exc = e;
                    str = null;
                }
            }
            exc = null;
        }
        String str3 = this.c;
        boolean z = this.e;
        UserId userId = this.b;
        boolean booleanValue = ((Boolean) bz2.c(new jya(userId, z, str3, str), null)).booleanValue();
        if (booleanValue) {
            wpp wppVar = (wpp) w2wVar.J0(this, new gfb(Collections.singletonList(com.vk.dto.common.a.a(userId)), Source.NETWORK, false, 8)).await();
            if (myc0.f(str2) && exc == null) {
                w2wVar.e1(this, new r280(null, wppVar));
            }
        }
        return new a(booleanValue, exc);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kya)) {
            return false;
        }
        kya kyaVar = (kya) obj;
        return epx.f(this.b, kyaVar.b) && epx.f(this.c, kyaVar.c) && epx.f(this.d, kyaVar.d) && this.e == kyaVar.e;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int hashCode = Long.hashCode(this.b.b) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return Boolean.hashCode(this.e) + qoy.b((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, false);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelEditCmd(channelId=");
        sb.append(this.b);
        sb.append(", channelName=");
        sb.append(this.c);
        sb.append(", channelAvatar=");
        sb.append(this.d);
        sb.append(", awaitNetwork=false, commentsEnabled=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
