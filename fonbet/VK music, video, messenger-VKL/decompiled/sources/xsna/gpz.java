package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.exceptions.ImEngineException;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import java.util.ArrayList;
import xsna.g1e0;

/* compiled from: LoadFullCmd.kt */
/* loaded from: classes2.dex */
public final class gpz extends le6<a> {
    public final long b;
    public final Object c;
    public final boolean d;

    /* compiled from: LoadFullCmd.kt */
    public static final class a {
        public final Dialog a;
        public final ohm b;
        public final ProfilesInfo c;
        public final boolean d;

        public a(Dialog dialog, ohm ohmVar, ProfilesInfo profilesInfo, boolean z) {
            this.a = dialog;
            this.b = ohmVar;
            this.c = profilesInfo;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + ur.b(this.c, qr.a(this.b.b, this.a.hashCode() * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Result(dialog=");
            sb.append(this.a);
            sb.append(", membersList=");
            sb.append(this.b);
            sb.append(", profilesInfo=");
            sb.append(this.c);
            sb.append(", isFullMemberList=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    public gpz(long j, Object obj, boolean z) {
        this.b = j;
        this.c = obj;
        this.d = z;
    }

    @Override // xsna.le6
    public final a e(w2w w2wVar) {
        phm phmVar;
        Source source = Source.CACHE;
        ipm f = f(w2wVar, source);
        boolean f2 = f.a.f();
        boolean Fb = f.b.Fb();
        if (f2 || Fb) {
            f = f(w2wVar, Source.ACTUAL);
        }
        wpp<Long, Dialog> wppVar = f.a;
        long j = this.b;
        Dialog dialog = (Dialog) wppVar.c.get(Long.valueOf(j));
        ProfilesInfo profilesInfo = f.b;
        if (dialog == null) {
            throw new ImEngineException(qlb0.a(j, "Dialog with id=", " is not found"));
        }
        ChatSettings Hb = dialog.Hb();
        if (Hb.j || Hb.i) {
            phmVar = new phm(0);
        } else if (this.d) {
            phmVar = g(w2wVar, Source.NETWORK);
        } else {
            phm g = g(w2wVar, source);
            xpp<ohm> xppVar = g.a;
            ProfilesInfo profilesInfo2 = g.b;
            boolean z = (xppVar.d() && xppVar.c()) ? false : true;
            boolean Fb2 = profilesInfo2.Fb();
            if (!z || Fb2) {
                if (z) {
                    f1e0 zb = profilesInfo2.zb();
                    g1e0.a aVar = new g1e0.a();
                    aVar.a.e(zb);
                    aVar.b = Source.ACTUAL;
                    aVar.c = true;
                    aVar.d = this.c;
                    profilesInfo2.Hb((ProfilesInfo) w2wVar.L0(this, new d1e0(new g1e0(aVar))));
                    if (!profilesInfo2.Fb()) {
                        g = new phm(xppVar, profilesInfo2, g.c);
                    }
                }
                phmVar = g(w2wVar, Source.NETWORK);
            }
            phmVar = g;
        }
        ohm a2 = phmVar.a.a();
        if (a2 == null) {
            a2 = new ohm();
        }
        ArrayList arrayList = a2.b;
        profilesInfo.Hb(phmVar.b);
        if (o25.b(o25.a())) {
            g5g.L(arrayList, new nhm(dialog.Hb().d, profilesInfo));
        } else {
            g5g.L(arrayList, new mhm(dialog.Hb().d, 0));
        }
        return new a(dialog, a2, profilesInfo, phmVar.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpz)) {
            return false;
        }
        gpz gpzVar = (gpz) obj;
        return this.b == gpzVar.b && epx.f(this.c, gpzVar.c);
    }

    public final ipm f(w2w w2wVar, Source source) {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        return (ipm) k9q0.f(w2wVar, this, new uqm(new sqm(Peer.a.b(this.b), source, true, this.c, 16)));
    }

    public final phm g(w2w w2wVar, Source source) {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        return (phm) w2wVar.L0(this, new hem(Peer.a.b(this.b), source, true, this.c, Boolean.valueOf(this.d)));
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadFullCmd(dialogId=");
        sb.append(this.b);
        sb.append(", changerTag=");
        sb.append(this.c);
        sb.append(", loadNextPage=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
