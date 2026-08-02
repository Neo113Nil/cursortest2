package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import java.util.List;

/* compiled from: LoadAllByActualCmd.kt */
/* loaded from: classes2.dex */
public final class loz extends xl6<a> {
    public final long b;
    public final Object c;

    /* compiled from: LoadAllByActualCmd.kt */
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

    public loz(long j, Object obj) {
        this.b = j;
        this.c = obj;
    }

    @Override // xsna.m2w
    public final String a() {
        return "im-dialogs-load-from-network";
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        long j = this.b;
        ipm ipmVar = (ipm) w2wVar.b1(this, new uqm(new sqm(Peer.a.b(j), Source.ACTUAL, true, this.c, 16)));
        return new a(ipmVar.a.e(Long.valueOf(j)), ipmVar.b, (List) w2wVar.L0(this, new bsi(Peer.a.b(j))));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof loz)) {
            return false;
        }
        loz lozVar = (loz) obj;
        return this.b == lozVar.b && epx.f(this.c, lozVar.c);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        return vu5.a(')', this.b, new StringBuilder("DialogInfo.LoadAllByActualCmd(dialogId="));
    }
}
