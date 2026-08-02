package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.instantjobs.InstantJob;
import xsna.u6x;

/* compiled from: DialogInfoBarHideJob.kt */
/* loaded from: classes.dex */
public final class qfm extends u4w {
    public final Peer c;
    public final String d;
    public final String e;

    /* compiled from: DialogInfoBarHideJob.kt */
    public static final class a implements s7x<qfm> {
        @Override // xsna.s7x
        public final qfm a(ny90 ny90Var) {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            return new qfm(Peer.a.b(ny90Var.e("dialog_id")), ny90Var.f("bar_name"), ny90Var.f("source"));
        }

        @Override // xsna.s7x
        public final void b(qfm qfmVar, ny90 ny90Var) {
            qfm qfmVar2 = qfmVar;
            ny90Var.n("dialog_id", qfmVar2.c.b);
            ny90Var.o("bar_name", qfmVar2.d);
            ny90Var.o("source", qfmVar2.e);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "ImDialogInfoBarHideJob";
        }
    }

    public qfm(Peer peer, String str, String str2) {
        this.c = peer;
        this.d = str;
        this.e = str2;
    }

    @Override // xsna.u4w
    public final void J(w2w w2wVar) {
        bhu.h(this.c.b, this.d, w2wVar);
    }

    @Override // xsna.u4w
    public final void K(w2w w2wVar, Throwable th) {
        bhu.h(this.c.b, this.d, w2wVar);
    }

    @Override // xsna.u4w
    public final void L(w2w w2wVar, u6x.a aVar) {
        Object c;
        String str = this.e;
        Peer peer = this.c;
        String str2 = this.d;
        c = bz2.c(new ofm(peer, str2, str), null);
        if (((Boolean) c).booleanValue()) {
            bhu.i(peer.b, str2, w2wVar);
            w2wVar.S0().V(peer.b);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qfm)) {
            return false;
        }
        qfm qfmVar = (qfm) obj;
        return epx.f(this.c, qfmVar.c) && epx.f(this.d, qfmVar.d) && epx.f(this.e, qfmVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + urd0.a(Long.hashCode(this.c.b) * 31, 31, this.d);
    }

    @Override // com.vk.instantjobs.InstantJob
    public final InstantJob.NotificationHideCondition o() {
        return InstantJob.NotificationHideCondition.NEVER;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final InstantJob.NotificationShowCondition p() {
        return InstantJob.NotificationShowCondition.NEVER;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String q() {
        return sa30.s(this.c.b);
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "DialogInfoBarHideJob";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogInfoBarHideJob(peer=");
        sb.append(this.c);
        sb.append(", barName=");
        sb.append(this.d);
        sb.append(", source=");
        return ho8.a(sb, this.e, ')');
    }
}
