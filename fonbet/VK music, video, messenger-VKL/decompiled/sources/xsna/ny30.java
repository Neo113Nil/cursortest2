package xsna;

import androidx.core.app.NotificationCompat;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.common.Peer;
import com.vk.dto.messages.MsgSyncState;
import com.vk.im.engine.commands.uploads.AttachUploadingEndpoint;
import com.vk.im.engine.exceptions.IllegalAttachStateException;
import com.vk.im.engine.exceptions.IllegalFwdStateException;
import com.vk.im.engine.exceptions.IllegalMsgTypeException;
import com.vk.im.engine.internal.api_commands.messages.b;
import com.vk.im.engine.models.LongPollType;
import com.vk.im.engine.models.messages.LocalMsgId;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.MsgSendSource;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.engine.models.reporters.CancelReason;
import com.vk.im.stability.ImMsgSendDisabledByUnstableConnection;
import com.vk.instantjobs.InstantJob;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.transport.SignalingTransport;
import xsna.u6x;

/* compiled from: MsgSendJob.kt */
/* loaded from: classes.dex */
public final class ny30 extends u4w {
    public static final String o = "ny30";
    public final long c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final boolean h;
    public final long i;
    public final boolean j;
    public final boolean k;
    public final String l;
    public final MsgSendSource m;
    public final Peer n;

    /* compiled from: MsgSendJob.kt */
    public static final class a implements s7x<ny30> {
        @Override // xsna.s7x
        public final ny30 a(ny90 ny90Var) {
            return new ny30(ny90Var.e("dialog_id"), ny90Var.c("msg_local_id"), ny90Var.a("keep_fwds"), ny90Var.a("keep_snippets"), ny90Var.f("entry_point"), ny90Var.a(SignalingTransport.URL_TYPE_RETRY), ny90Var.e("timeout"), ny90Var.h("has_pending_mr"), ny90Var.h("distinct_queue"), ny90Var.i("track_code", ""), az30.a(new JSONObject(ny90Var.i("msg_send_source", "{}"))));
        }

        @Override // xsna.s7x
        public final void b(ny30 ny30Var, ny90 ny90Var) {
            String str;
            ny30 ny30Var2 = ny30Var;
            ny90Var.n("dialog_id", ny30Var2.c);
            ny90Var.l("msg_local_id", ny30Var2.d);
            ny90Var.j("keep_fwds", ny30Var2.e);
            ny90Var.j("keep_snippets", ny30Var2.f);
            ny90Var.o("entry_point", ny30Var2.g);
            ny90Var.j(SignalingTransport.URL_TYPE_RETRY, ny30Var2.h);
            ny90Var.n("timeout", ny30Var2.i);
            ny90Var.j("has_pending_mr", ny30Var2.j);
            ny90Var.j("distinct_queue", ny30Var2.k);
            ny90Var.o("track_code", ny30Var2.l);
            MsgSendSource msgSendSource = ny30Var2.m;
            if (msgSendSource == null || (str = az30.b(msgSendSource).toString()) == null) {
                str = "{}";
            }
            ny90Var.o("msg_send_source", str);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "ImSendMsg";
        }
    }

    public /* synthetic */ ny30(long j, int i, boolean z, boolean z2, boolean z3, long j2, boolean z4, boolean z5, int i2) {
        this(j, i, z, z2, "unknown", z3, j2, z4, z5, "", null);
    }

    public static MsgFromUser Q(int i, w2w w2wVar) {
        Msg L = w2wVar.I0().o().L(i);
        if (L == null) {
            return null;
        }
        if (L instanceof MsgFromUser) {
            return (MsgFromUser) L;
        }
        throw new IllegalMsgTypeException("Message has wrong type msg = ".concat(qjg.a(L)));
    }

    public static void S(MsgFromUser msgFromUser) {
        List<Attach> K0 = msgFromUser.K0();
        if (K0 == null || !K0.isEmpty()) {
            for (Attach attach : K0) {
                AttachSyncState.a aVar = AttachSyncState.Companion;
                AttachSyncState G0 = attach.G0();
                aVar.getClass();
                if (AttachSyncState.a.a(G0)) {
                    StringBuilder sb = new StringBuilder("Message has failed attaches ");
                    List<Attach> K02 = msgFromUser.K0();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : K02) {
                        AttachSyncState.a aVar2 = AttachSyncState.Companion;
                        AttachSyncState G02 = ((Attach) obj).G0();
                        aVar2.getClass();
                        if (AttachSyncState.a.a(G02)) {
                            arrayList.add(obj);
                        }
                    }
                    sb.append(arrayList);
                    throw new IllegalAttachStateException(sb.toString());
                }
            }
        }
        List<NestedMsg> q7 = msgFromUser.q7();
        if ((q7 instanceof Collection) && q7.isEmpty()) {
            return;
        }
        Iterator<T> it = q7.iterator();
        while (it.hasNext()) {
            if (!zir0.b(((NestedMsg) it.next()).xb())) {
                throw new IllegalFwdStateException();
            }
        }
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
        return w2wVar.Z0().l();
    }

    @Override // xsna.u4w
    public final void J(w2w w2wVar) {
        R(w2wVar, new InterruptedException(), true);
    }

    @Override // xsna.u4w
    public final void K(w2w w2wVar, Throwable th) {
        R(w2wVar, th, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, com.vk.im.engine.models.messages.Msg, com.vk.im.engine.models.messages.MsgFromUser] */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, com.vk.im.engine.models.messages.Msg, com.vk.im.engine.models.messages.MsgFromUser] */
    @Override // xsna.u4w
    public final void L(w2w w2wVar, u6x.a aVar) {
        Object c;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        int i = this.d;
        ?? Q = Q(i, w2wVar);
        ref$ObjectRef.element = Q;
        if (Q == 0 || Q.Qb() || ((MsgFromUser) ref$ObjectRef.element).Pb()) {
            return;
        }
        S((MsgFromUser) ref$ObjectRef.element);
        boolean Mb = ((MsgFromUser) ref$ObjectRef.element).Mb();
        ry30 d = w2wVar.K().d();
        long j = this.c;
        LocalMsgId localMsgId = new LocalMsgId(j, i);
        Set<Class<? extends Object>> set = fz30.a;
        d.d(new xy30(localMsgId, this.h, fz30.b(((MsgFromUser) ref$ObjectRef.element).K0()), ((MsgFromUser) ref$ObjectRef.element).K0(), w2wVar.b().a(LongPollType.MESSAGES), this.g));
        Serializer.c<Peer> cVar = Peer.CREATOR;
        w2wVar.L0(this, new ch30(Collections.singleton(Peer.a.b(j)), ((MsgFromUser) ref$ObjectRef.element).K0(), AttachUploadingEndpoint.CHAT));
        ?? Q2 = Q(i, w2wVar);
        ref$ObjectRef.element = Q2;
        if (Q2 == 0 || Q2.Qb() || ((MsgFromUser) ref$ObjectRef.element).Pb()) {
            return;
        }
        S((MsgFromUser) ref$ObjectRef.element);
        w2wVar.K().d().f(i, j);
        c = bz2.c(new com.vk.im.engine.internal.api_commands.messages.b((MsgFromUser) ref$ObjectRef.element, this.e, this.f, this.g, this.l, this.m, w2wVar.Q0()), null);
        b.C1113b c1113b = (b.C1113b) c;
        w2wVar.K().d().h(i, j);
        if (!Mb) {
            w2wVar.K().t().u().a(this.d, ((MsgFromUser) ref$ObjectRef.element).C(), ((MsgFromUser) ref$ObjectRef.element).K0(), ((MsgFromUser) ref$ObjectRef.element).Gb() == MsgSyncState.DONE);
        }
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        w2wVar.I0().u(new my30(this, ref$ObjectRef, c1113b, w2wVar, Mb, ref$BooleanRef));
        boolean z = ref$BooleanRef.element;
        String str = o;
        if (z) {
            w2wVar.S0().v(j, str);
        }
        w2wVar.e1(this, new p980(str, j, i));
    }

    @Override // xsna.u4w
    public final void O(w2w w2wVar, Map<InstantJob, ? extends InstantJob.a> map, NotificationCompat.h hVar) {
        w2wVar.Z0().f(hVar, map.size());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void R(w2w w2wVar, Throwable th, boolean z) {
        String message;
        boolean z2 = th instanceof ImMsgSendDisabledByUnstableConnection;
        long j = this.c;
        if (z2) {
            w2wVar.e1(this, new m980(j));
        }
        d040 o2 = w2wVar.I0().o();
        int i = this.d;
        Msg L = o2.L(i);
        if (L == 0) {
            w2wVar.getConfig().g.a(new IllegalArgumentException(tgw.b(i, "Msg with localId = ", " not exist")));
            return;
        }
        fz30.a(w2wVar, i, MsgSyncState.ERROR, AttachSyncState.REJECTED);
        String str = o;
        w2wVar.e1(this, new p980(str, j, i));
        w2wVar.S0().v(j, str);
        if (z) {
            message = "cancel";
        } else {
            message = th.getMessage();
            if (message == null) {
                message = "empty error";
            }
        }
        String str2 = message;
        w2wVar.K().t().u().c(this.d, L instanceof com.vk.im.engine.models.messages.a ? ((com.vk.im.engine.models.messages.a) L).K0() : EmptyList.b, str2, L.C());
        if (z) {
            w2wVar.K().d().i(Collections.singletonList(L), CancelReason.ATTACH_CANCEL);
        } else {
            w2wVar.K().d().k(i, j, th);
            w2wVar.e1(this, new i980(str, th, this.d, this.c));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ny30)) {
            return false;
        }
        ny30 ny30Var = (ny30) obj;
        return this.c == ny30Var.c && this.d == ny30Var.d;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.c);
        return Integer.hashCode(this.d) + (hashCode * 31) + hashCode;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final long i() {
        return 500L;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final long j() {
        return this.i;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final InstantJob.NotificationHideCondition o() {
        return InstantJob.NotificationHideCondition.NEVER;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final InstantJob.NotificationShowCondition p() {
        return InstantJob.NotificationShowCondition.WHEN_APP_SUSPENDING;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String q() {
        if (this.j) {
            return "msg-request-change-status-job";
        }
        boolean z = this.k;
        long j = this.c;
        return z ? sa30.w(j) : sa30.y(j);
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "MsgSendJob";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ny30.class.getCanonicalName());
        sb.append("(dialogId=");
        sb.append(this.c);
        sb.append(", msgLocalId=");
        sb.append(this.d);
        sb.append(", keepFwds=");
        sb.append(this.e);
        sb.append(", keepSnippets=");
        sb.append(this.f);
        sb.append(", entryPoint=");
        sb.append(this.g);
        sb.append(", retry=");
        sb.append(this.h);
        sb.append(", expireTimeoutMs=");
        sb.append(this.i);
        sb.append(", forceExecuteOnMsgRequestQueue=");
        sb.append(this.j);
        sb.append(", forceExecuteOnDistinctQueue=");
        sb.append(this.k);
        sb.append(", trackCode=");
        return ho8.a(sb, this.l, ')');
    }

    @Override // com.vk.instantjobs.InstantJob
    public final boolean y() {
        return true;
    }

    public ny30(long j, int i, boolean z, boolean z2, String str, boolean z3, long j2, boolean z4, boolean z5, String str2, MsgSendSource msgSendSource) {
        this.c = j;
        this.d = i;
        this.e = z;
        this.f = z2;
        this.g = str;
        this.h = z3;
        this.i = j2;
        this.j = z4;
        this.k = z5;
        this.l = str2;
        this.m = msgSendSource;
        Serializer.c<Peer> cVar = Peer.CREATOR;
        this.n = Peer.a.b(j);
    }
}
