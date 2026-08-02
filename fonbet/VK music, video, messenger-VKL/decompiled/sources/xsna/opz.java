package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import java.util.List;

/* compiled from: LoadInitCmd.kt */
/* loaded from: classes2.dex */
public final class opz extends le6<a> {
    public final long b;
    public final Object c;
    public final Source d;

    /* compiled from: LoadInitCmd.kt */
    public static final class a {
        public final xpp<Dialog> a;
        public final ProfilesInfo b;
        public final List<vh30> c;

        public a(xpp<Dialog> xppVar, ProfilesInfo profilesInfo, List<vh30> list) {
            this.a = xppVar;
            this.b = profilesInfo;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ur.b(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Result(dialogs=");
            sb.append(this.a);
            sb.append(", profiles=");
            sb.append(this.b);
            sb.append(", typing=");
            return ms9.a(')', sb, this.c);
        }
    }

    public opz(long j, Object obj, Source source) {
        this.b = j;
        this.c = obj;
        this.d = source;
    }

    @Override // xsna.le6
    public final a e(w2w w2wVar) {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        long j = this.b;
        ipm ipmVar = (ipm) k9q0.f(w2wVar, this, new uqm(new sqm(Peer.a.b(j), Source.CACHE, false, this.c, 16)));
        if (!ipmVar.a.a.isEmpty()) {
            ipmVar = (ipm) w2wVar.J0(this, new uqm(new sqm(Peer.a.b(j), Source.ACTUAL, true, this.c, 16))).await();
        }
        return new a(ipmVar.a.e(Long.valueOf(j)), ipmVar.b, (List) w2wVar.L0(this, new bsi(Peer.a.b(j))));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof opz)) {
            return false;
        }
        opz opzVar = (opz) obj;
        return this.b == opzVar.b && epx.f(this.c, opzVar.c) && this.d == opzVar.d;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.d.hashCode() + vul0.a(Long.hashCode(this.b) * 31, 31, this.c);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "LoadInitCmd(dialogId=" + this.b + ", changerTag=" + this.c + ", source=" + this.d + ')';
    }
}
