package xsna;

import android.os.SystemClock;
import android.util.SparseArray;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.messages.dto.MessagesDeleteFullResponseItemDto;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import com.vk.dto.messages.MsgSyncState;
import com.vk.im.engine.models.events.OnCacheInvalidateEvent;
import com.vk.im.engine.models.im_item.ImItemType;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.reporters.CancelReason;
import com.vk.im.engine.models.upload.ResumableAttachUploadInfo;
import com.vk.im.engine.reporters.performance.events.LogType;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.Regex;
import xsna.hfr;

/* compiled from: MsgDeleteCmd.kt */
/* loaded from: classes2.dex */
public final class fi30 extends le6<Boolean> {
    public final Peer b;
    public final Collection<Integer> c;
    public final boolean d;
    public final boolean e;
    public final Integer f;
    public final Object g;
    public final f9w h;

    /* compiled from: MsgDeleteCmd.kt */
    public static abstract class a {

        /* compiled from: MsgDeleteCmd.kt */
        /* renamed from: xsna.fi30$a$a, reason: collision with other inner class name */
        public static final class C2874a extends a {
            public final VKApiException a;

            public C2874a(VKApiException vKApiException) {
                this.a = vKApiException;
            }
        }

        /* compiled from: MsgDeleteCmd.kt */
        public static final class b extends a {
            public static final b a = new b();
        }
    }

    public fi30() {
        throw null;
    }

    public fi30(Peer peer, Collection collection, boolean z, Integer num, Object obj, int i) {
        z = (i & 4) != 0 ? false : z;
        boolean z2 = (i & 8) == 0;
        num = (i & 16) != 0 ? null : num;
        this.b = peer;
        this.c = collection;
        this.d = z;
        this.e = z2;
        this.f = num;
        this.g = obj;
        this.h = e9w.a(fi30.class);
        if (peer.Ab(Peer.Type.UNKNOWN)) {
            throw new IllegalStateException("Invalid dialog peer");
        }
    }

    public static a.C2874a f(String str) {
        return new a.C2874a(new VKApiException(go9.b("MsgDeleteCmd failed: ", str)));
    }

    @Override // xsna.le6
    public final Boolean e(w2w w2wVar) {
        Object f;
        int i = 1;
        ArrayList U0 = j5g.U0(this.c, 200, 200, true);
        int size = U0.size();
        int i2 = 0;
        while (i2 < size) {
            List list = (List) U0.get(i2);
            if (!list.isEmpty()) {
                if (!w2wVar.I0().o().h0(list)) {
                    throw new IllegalArgumentException("Specified msg are belongs to different dialogs");
                }
                SparseArray<Msg> T = w2wVar.I0().o().T(list);
                u4q0 u4q0Var = zik0.a;
                xik0 xik0Var = new xik0(T);
                if (!xik0Var.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<Object> it = xik0Var.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (((Msg) next).o == MsgSyncState.SENDING) {
                            arrayList.add(next);
                        }
                    }
                    w2wVar.K().d().i(arrayList, CancelReason.MSG_DELETE);
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<Object> it2 = xik0Var.iterator();
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        if (((Msg) next2).Pb()) {
                            arrayList2.add(next2);
                        }
                    }
                    w2wVar.K().d().g(arrayList2);
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                new r3w0(LogType.IM_CANCEL_MSG_SEND, null, "start", null, null, null, Boolean.TRUE, null, null, null, null, 16314).q();
                x6x O0 = w2wVar.O0();
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    O0.i("delete msg", new qso(((Number) it3.next()).intValue(), i));
                }
                new r3w0(LogType.IM_CANCEL_MSG_SEND, null, TtmlNode.END, null, null, null, Boolean.TRUE, Integer.valueOf((int) (SystemClock.elapsedRealtime() - elapsedRealtime)), null, null, null, 16186).q();
                w2wVar.O0().l(new d2y(list, 7));
                SparseArray<MsgSyncState> b0 = w2wVar.I0().o().b0(list);
                ArrayList arrayList3 = new ArrayList();
                int size2 = b0.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    int keyAt = b0.keyAt(i3);
                    if (b0.valueAt(i3) == MsgSyncState.SENDING) {
                        arrayList3.add(Integer.valueOf(keyAt));
                    }
                }
                if (!arrayList3.isEmpty()) {
                    SparseArray<Msg> T2 = w2wVar.I0().o().T(list);
                    ArrayList g = zik0.g(T2);
                    if (!g.isEmpty()) {
                        Iterator it4 = g.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            if (((Msg) it4.next()).o == MsgSyncState.SENDING) {
                                xuo0.a.getClass();
                                w2wVar.getConfig().g.a(new RuntimeException("\n            Delete Warning!\n            There are messages, that must be REJECTED, but they are IN_PROGRESS.\n            Current time = " + xuo0.a() + ". Msgs = " + T2 + "\n            "));
                                break;
                            }
                        }
                    }
                }
                ArrayList g2 = zik0.g(w2wVar.I0().o().T(list));
                ArrayList arrayList4 = new ArrayList();
                Iterator it5 = g2.iterator();
                while (it5.hasNext()) {
                    Object next3 = it5.next();
                    if (((Msg) next3).Mb()) {
                        arrayList4.add(next3);
                    }
                }
                hfr j = rli0.j(new i5g(g2), new p2u(8));
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it6 = j.iterator();
                while (true) {
                    hfr.a aVar = (hfr.a) it6;
                    if (!aVar.hasNext()) {
                        break;
                    }
                    linkedHashSet.add(Integer.valueOf(((Msg) aVar.next()).b));
                }
                boolean isEmpty = arrayList4.isEmpty();
                Peer peer = this.b;
                VKApiException vKApiException = null;
                if (!isEmpty) {
                    UserId b = com.vk.dto.common.a.b(peer);
                    ArrayList arrayList5 = new ArrayList(c5g.u(arrayList4, 10));
                    Iterator it7 = arrayList4.iterator();
                    while (it7.hasNext()) {
                        arrayList5.add(Integer.valueOf(((Msg) it7.next()).d));
                    }
                    Iterable iterable = (Iterable) bz2.c(new vd20(b, arrayList5, this.d, this.e, this.f, w2wVar.Q0()), null);
                    int e = on00.e(c5g.u(iterable, 10));
                    if (e < 16) {
                        e = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(e);
                    for (Object obj : iterable) {
                        linkedHashMap.put(((MessagesDeleteFullResponseItemDto) obj).d(), obj);
                    }
                    Iterator it8 = arrayList4.iterator();
                    while (it8.hasNext()) {
                        Msg msg = (Msg) it8.next();
                        int i4 = msg.d;
                        MessagesDeleteFullResponseItemDto messagesDeleteFullResponseItemDto = (MessagesDeleteFullResponseItemDto) linkedHashMap.get(Integer.valueOf(i4));
                        if (messagesDeleteFullResponseItemDto == null) {
                            f = f("cnvMsgId=" + i4 + ", e: no result in api response");
                        } else if (messagesDeleteFullResponseItemDto.e() != null) {
                            StringBuilder b2 = ji.b(i4, "cnvMsgId=", ", e: ");
                            b2.append(messagesDeleteFullResponseItemDto.e());
                            f = f(b2.toString());
                        } else if (messagesDeleteFullResponseItemDto.f() == BaseBoolIntDto.YES) {
                            f = a.b.a;
                        } else {
                            StringBuilder b3 = ji.b(i4, "cnvMsgId=", ", e: response=");
                            b3.append(messagesDeleteFullResponseItemDto.f());
                            f = f(b3.toString());
                        }
                        if (epx.f(f, a.b.a)) {
                            linkedHashSet.add(Integer.valueOf(msg.b));
                        } else {
                            if (!(f instanceof a.C2874a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            a.C2874a c2874a = (a.C2874a) f;
                            L.i(c2874a.a);
                            if (vKApiException == null) {
                                vKApiException = c2874a.a;
                            }
                        }
                    }
                }
                VKApiException vKApiException2 = vKApiException;
                if (!linkedHashSet.isEmpty()) {
                    SparseArray<Msg> T3 = w2wVar.I0().o().T(linkedHashSet);
                    u4q0 u4q0Var2 = zik0.a;
                    ArrayList E = g5g.E(new yik0(T3), MsgFromUser.class);
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it9 = E.iterator();
                    while (it9.hasNext()) {
                        g5g.y(((MsgFromUser) it9.next()).H, arrayList6);
                    }
                    ArrayList arrayList7 = new ArrayList(c5g.u(arrayList6, 10));
                    Iterator it10 = arrayList6.iterator();
                    while (it10.hasNext()) {
                        arrayList7.add(Integer.valueOf(((Attach) it10.next()).xb()));
                    }
                    tcq0 upload = w2wVar.I0().upload();
                    ArrayList arrayList8 = new ArrayList();
                    Iterator it11 = arrayList7.iterator();
                    while (it11.hasNext()) {
                        ResumableAttachUploadInfo g3 = upload.g(((Number) it11.next()).intValue());
                        if (g3 != null) {
                            arrayList8.add(g3);
                        }
                    }
                    f9w f9wVar = this.h;
                    Iterator it12 = arrayList8.iterator();
                    while (it12.hasNext()) {
                        ResumableAttachUploadInfo resumableAttachUploadInfo = (ResumableAttachUploadInfo) it12.next();
                        if (resumableAttachUploadInfo.m()) {
                            String l = resumableAttachUploadInfo.l();
                            try {
                                Regex regex = com.vk.core.files.a.a;
                                try {
                                    f9wVar.debug(new ei30(vhk0.c(l), l, 0));
                                } catch (Exception unused) {
                                    f9wVar.f(new nuv(l, 11));
                                }
                            } catch (Exception unused2) {
                            }
                        }
                    }
                    w2wVar.I0().u(new di30(linkedHashSet, arrayList8, this, w2wVar, 0));
                    if (!isEmpty) {
                        w2wVar.L0(this, new pj30(this.b, uj30.d, 1, Source.NETWORK, false, this.g));
                    }
                    OnCacheInvalidateEvent.Reason reason = OnCacheInvalidateEvent.Reason.COMPLICATED_DB_CHANGE;
                    Object obj2 = this.g;
                    w2wVar.e1(this, new OnCacheInvalidateEvent(obj2, reason));
                    w2wVar.e1(this, new r680(obj2, Collections.singleton(new b5w(peer.b, ImItemType.DIALOG))));
                }
                if (vKApiException2 != null) {
                    throw vKApiException2;
                }
            }
            i2++;
            i = 1;
        }
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fi30)) {
            return false;
        }
        fi30 fi30Var = (fi30) obj;
        return epx.f(this.b, fi30Var.b) && epx.f(this.c, fi30Var.c) && this.e == fi30Var.e && epx.f(this.g, fi30Var.g);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int b = qoy.b(qoy.b(s3j0.a(Long.hashCode(this.b.b) * 31, this.c, 31), 31, this.e), 31, false);
        Object obj = this.g;
        return b + (obj != null ? obj.hashCode() : 0);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgDeleteCmd(dialogId=");
        sb.append(this.b);
        sb.append(", msgLocalIds=");
        sb.append(this.c);
        sb.append(", isSpam=");
        sb.append(this.e);
        sb.append(", isAwaitNetwork=false, changerTag=");
        return k73.c(sb, this.g, ')');
    }
}
