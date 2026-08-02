package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ij20;

/* compiled from: FriendsSearchCmd.kt */
/* loaded from: classes2.dex */
public final class yss extends le6<List<? extends qtd0>> {
    public final String b;
    public final int c;
    public final boolean d;
    public final String e;

    public yss(int i, String str, String str2, boolean z) {
        this.b = str;
        this.c = i;
        this.d = z;
        this.e = str2;
    }

    @Override // xsna.le6
    public final List<? extends qtd0> e(w2w w2wVar) {
        ij20.a aVar = new ij20.a();
        aVar.d = bz2.m();
        aVar.c = "friends.search";
        aVar.b(CampaignEx.JSON_KEY_AD_Q, this.b);
        aVar.f.put("user_id", Long.valueOf(w2wVar.H0().b).toString());
        aVar.b("fields", ky2.b);
        aVar.f.put("count", Integer.valueOf(this.c).toString());
        Integer num = 0;
        aVar.f.put(SignalingProtocol.KEY_OFFSET, num.toString());
        aVar.i = this.d;
        List<? extends qtd0> list = (List) bz2.f(new ij20(aVar), xss.b);
        List<? extends qtd0> list2 = list;
        new i1r0(w2wVar.f1(), list2).o(w2wVar);
        w2wVar.S0().d(this.e, list2);
        return list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yss)) {
            return false;
        }
        yss yssVar = (yss) obj;
        return epx.f(this.b, yssVar.b) && this.c == yssVar.c && this.d == yssVar.d && epx.f(this.e, yssVar.e);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int b = qoy.b(shy.a(0, shy.a(this.c, this.b.hashCode() * 31, 31), 31), 31, this.d);
        String str = this.e;
        return b + (str != null ? str.hashCode() : 0);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("FriendsSearchCmd(query=");
        sb.append(this.b);
        sb.append(", limit=");
        sb.append(this.c);
        sb.append(", offset=0, awaitNetwork=");
        sb.append(this.d);
        sb.append(", changerTag=");
        return tq.f(sb, this.e, ')');
    }
}
