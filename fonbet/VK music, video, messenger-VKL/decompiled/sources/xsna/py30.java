package xsna;

import androidx.core.app.NotificationCompat;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.instantjobs.InstantJob;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import ru.ok.android.sdk.SharedKt;
import xsna.ij20;
import xsna.u6x;

/* compiled from: MsgSendMultipleJob.kt */
/* loaded from: classes.dex */
public final class py30 extends u4w {
    public final Set<Peer> c;
    public final String d;
    public final String e;
    public final String f;

    /* compiled from: MsgSendMultipleJob.kt */
    public static final class a implements s7x<py30> {
        @Override // xsna.s7x
        public final py30 a(ny90 ny90Var) {
            List<String> c0 = drm0.c0(ny90Var.f("dialog_ids"), new String[]{StringUtils.COMMA}, 0, 6);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (String str : c0) {
                Serializer.c<Peer> cVar = Peer.CREATOR;
                linkedHashSet.add(Peer.a.b(Long.parseLong(str)));
            }
            return new py30(ny90Var.f("text"), ny90Var.f("attaches"), linkedHashSet, ny90Var.f("entry_point"));
        }

        @Override // xsna.s7x
        public final void b(py30 py30Var, ny90 ny90Var) {
            py30 py30Var2 = py30Var;
            ny90Var.o("dialog_ids", p4g.k(py30Var2.c, StringUtils.COMMA, new tuq(13)));
            ny90Var.o("text", py30Var2.d);
            ny90Var.o("attaches", py30Var2.e);
            ny90Var.o("entry_point", py30Var2.f);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "ImSendMultipleMsg";
        }
    }

    public py30() {
        throw null;
    }

    public py30(String str, String str2, Set set, String str3) {
        this.c = set;
        this.d = str;
        this.e = str2;
        this.f = str3;
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
    public final void L(w2w w2wVar, u6x.a aVar) {
        Peer Q0 = w2wVar.Q0();
        ij20.a aVar2 = new ij20.a();
        aVar2.d = bz2.m();
        aVar2.c = "messages.send";
        aVar2.b("peer_ids", p4g.k(this.c, StringUtils.COMMA, new v4v(17)));
        Q0.getClass();
        if (Q0.Ab(Peer.Type.GROUP)) {
            aVar2.f.put("group_id", Long.valueOf(Q0.d).toString());
        }
        aVar2.b("message", this.d);
        aVar2.f.put("random_id", Integer.valueOf(w2wVar.R0()).toString());
        aVar2.b(SharedKt.PARAM_ATTACHMENT, this.e);
        aVar2.b("entrypoint", this.f);
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
        if (!(obj instanceof py30)) {
            return false;
        }
        py30 py30Var = (py30) obj;
        return epx.f(this.c, py30Var.c) && epx.f(this.d, py30Var.d) && epx.f(this.e, py30Var.e) && epx.f(this.f, py30Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + urd0.a(urd0.a(this.c.hashCode() * 31, 31, this.d), 31, this.e);
    }

    @Override // com.vk.instantjobs.InstantJob
    public final long j() {
        return TimeUnit.MINUTES.toMillis(10L);
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
    public final String s() {
        return "MsgSendMultipleJob";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgSendMultipleJob(dialogs=");
        sb.append(this.c);
        sb.append(", text=");
        sb.append(this.d);
        sb.append(", attachesStr=");
        sb.append(this.e);
        sb.append(", entryPoint=");
        return ho8.a(sb, this.f, ')');
    }

    @Override // com.vk.instantjobs.InstantJob
    public final boolean y() {
        return true;
    }
}
