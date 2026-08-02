package xsna;

import androidx.core.app.NotificationCompat;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.instantjobs.InstantJob;
import java.util.Map;
import ru.ok.android.sdk.SharedKt;
import xsna.ij20;
import xsna.u6x;

/* compiled from: MsgSendUncheckedJob.kt */
/* loaded from: classes.dex */
public final class dz30 extends u4w {
    public final Peer c;
    public final String d;
    public final String e;
    public final long f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;

    /* compiled from: MsgSendUncheckedJob.kt */
    public static final class a implements s7x<dz30> {
        @Override // xsna.s7x
        public final dz30 a(ny90 ny90Var) {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            return new dz30(Peer.a.b(ny90Var.e("dialog_id")), ny90Var.f("text"), ny90Var.f("attaches"), ny90Var.e("timeout"), ny90Var.i("track_code", ""), ny90Var.i("ref", ""), ny90Var.i("ref_source", ""), ny90Var.i("widget_id", ""), ny90Var.i("template", ""));
        }

        @Override // xsna.s7x
        public final void b(dz30 dz30Var, ny90 ny90Var) {
            dz30 dz30Var2 = dz30Var;
            ny90Var.n("dialog_id", dz30Var2.c.b);
            ny90Var.o("text", dz30Var2.d);
            ny90Var.o("attaches", dz30Var2.e);
            ny90Var.n("timeout", dz30Var2.f);
            ny90Var.o("track_code", dz30Var2.g);
            ny90Var.o("ref", dz30Var2.h);
            ny90Var.o("ref_source", dz30Var2.i);
            String str = dz30Var2.j;
            if (str == null) {
                str = "";
            }
            ny90Var.o("widget_id", str);
            String str2 = dz30Var2.k;
            ny90Var.o("template", str2 != null ? str2 : "");
        }

        @Override // xsna.s7x
        public final String getType() {
            return "ImSendMsgUnchecked";
        }
    }

    public dz30(Peer peer, String str, String str2, long j, String str3, String str4, String str5, String str6, String str7) {
        this.c = peer;
        this.d = str;
        this.e = str2;
        this.f = j;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        this.k = str7;
    }

    @Override // xsna.u4w
    public final void E(w2w w2wVar) {
        w2wVar.Z0().k();
    }

    @Override // xsna.u4w
    public final String F(w2w w2wVar) {
        return w2wVar.Z0().a();
    }

    @Override // xsna.u4w
    public final int G(w2w w2wVar) {
        return w2wVar.Z0().b();
    }

    @Override // xsna.u4w
    public final void K(w2w w2wVar, Throwable th) {
        String str = this.k;
        if (str == null || str.length() == 0) {
            return;
        }
        w2wVar.e1(this, new qb80(th));
    }

    @Override // xsna.u4w
    public final void L(w2w w2wVar, u6x.a aVar) {
        Peer Q0 = w2wVar.Q0();
        ij20.a aVar2 = new ij20.a();
        aVar2.d = bz2.m();
        aVar2.c = "messages.send";
        aVar2.f.put("peer_id", Long.valueOf(this.c.b).toString());
        Q0.getClass();
        if (Q0.Ab(Peer.Type.GROUP)) {
            aVar2.f.put("group_id", Long.valueOf(Q0.d).toString());
        }
        aVar2.f.put("random_id", Integer.valueOf(w2wVar.d1()).toString());
        aVar2.b("message", this.d);
        aVar2.b(SharedKt.PARAM_ATTACHMENT, this.e);
        aVar2.b("track_code", this.g);
        aVar2.b("ref", this.h);
        aVar2.b("ref_source", this.i);
        String str = this.j;
        if (!(str == null || str.length() == 0)) {
            aVar2.b("widget_id", str);
        }
        String str2 = this.k;
        if (!(str2 == null || str2.length() == 0)) {
            aVar2.b("template", str2);
        }
        aVar2.g = 1;
        aVar2.i = true;
        bz2.h(new ij20(aVar2));
    }

    @Override // xsna.u4w
    public final void O(w2w w2wVar, Map<InstantJob, ? extends InstantJob.a> map, NotificationCompat.h hVar) {
        w2wVar.Z0().d(hVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz30)) {
            return false;
        }
        dz30 dz30Var = (dz30) obj;
        return epx.f(this.c, dz30Var.c) && epx.f(this.d, dz30Var.d) && epx.f(this.e, dz30Var.e) && this.f == dz30Var.f && epx.f(this.g, dz30Var.g) && epx.f(this.h, dz30Var.h) && epx.f(this.i, dz30Var.i) && epx.f(this.j, dz30Var.j) && epx.f(this.k, dz30Var.k);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(urd0.a(bh10.a(urd0.a(urd0.a(Long.hashCode(this.c.b) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        String str = this.j;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.k;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.vk.instantjobs.InstantJob
    public final long i() {
        return 500L;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final long j() {
        return this.f;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final InstantJob.NotificationHideCondition o() {
        return InstantJob.NotificationHideCondition.NEVER;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final InstantJob.NotificationShowCondition p() {
        return InstantJob.NotificationShowCondition.WHEN_STARTED;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String q() {
        return sa30.y(this.c.b);
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "MsgSendUncheckedJob";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgSendUncheckedJob(dialog=");
        sb.append(this.c);
        sb.append(", text=");
        sb.append(this.d);
        sb.append(", attachmentsStr=");
        sb.append(this.e);
        sb.append(", expireTimeoutMs=");
        sb.append(this.f);
        sb.append(", trackCode=");
        sb.append(this.g);
        sb.append(", ref=");
        sb.append(this.h);
        sb.append(", refSource=");
        sb.append(this.i);
        sb.append(", widgetId=");
        sb.append(this.j);
        sb.append(", template=");
        return ho8.a(sb, this.k, ')');
    }

    @Override // com.vk.instantjobs.InstantJob
    public final boolean y() {
        return true;
    }
}
