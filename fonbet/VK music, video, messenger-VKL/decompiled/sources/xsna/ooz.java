package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.dialogs.Dialog;

/* compiled from: LoadAllByCacheCmd.kt */
/* loaded from: classes2.dex */
public final class ooz extends le6<a> {
    public final long b;

    /* compiled from: LoadAllByCacheCmd.kt */
    public static final class a {
        public final wpp<Long, Dialog> a;
        public final boolean b;

        public a(wpp<Long, Dialog> wppVar, boolean z) {
            this.a = wppVar;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Response(dialogs=");
            sb.append(this.a);
            sb.append(", deleteForAllFlag=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    public ooz(long j) {
        this.b = j;
    }

    @Override // xsna.le6
    public final a e(w2w w2wVar) {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        return new a((wpp) w2wVar.J0(this, new tqm(new sqm(Peer.a.b(this.b), Source.CACHE, false, (Object) null, 16))).await(), ((Boolean) w2wVar.L0(this, new jnm())).booleanValue());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ooz) {
            return this.b == ((ooz) obj).b;
        }
        return false;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    @Override // xsna.e1w
    public final String toString() {
        return vu5.a(')', this.b, new StringBuilder("LoadAllByCacheCmd(dialogId="));
    }
}
