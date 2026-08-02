package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.common.Source;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.engine.models.attaches.AttachChannelStub;
import com.vk.im.engine.models.attaches.AttachPoll;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.messages.MsgFromChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: UpdateChannelMessagesContentCmd.kt */
/* loaded from: classes2.dex */
public final class x7q0 extends le6<s3q0> {
    public final long b;
    public final Collection<MsgFromChannel> c;
    public final boolean d;

    public x7q0(long j, Collection<MsgFromChannel> collection, boolean z) {
        this.b = j;
        this.c = collection;
        this.d = z;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        Collection<MsgFromChannel> collection = this.c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            ArrayList Zb = ((MsgFromChannel) obj).Zb();
            if (!Zb.isEmpty()) {
                Iterator it = Zb.iterator();
                while (it.hasNext()) {
                    Attach attach = (Attach) it.next();
                    if (!(attach instanceof AttachVideo)) {
                        if (!(attach instanceof AttachPoll)) {
                            if (attach instanceof AttachChannelStub) {
                                arrayList.add(obj);
                                break;
                                break;
                            }
                        } else {
                            if (w2wVar.f1() - ((AttachPoll) attach).e > w2wVar.getConfig().B) {
                                arrayList.add(obj);
                                break;
                                break;
                            }
                        }
                    } else {
                        AttachVideo attachVideo = (AttachVideo) attach;
                        if (attachVideo.n == AttachSyncState.DONE && attachVideo.getId() != 0 && fkq0.c(attachVideo.b.I0())) {
                            boolean z = attachVideo.b.Q0() && attachVideo.b.w9().Ab(VideoUrl.URL_240) == null && attachVideo.b.w9().Ab(VideoUrl.HLS_URL) == null;
                            boolean q0 = attachVideo.b.q0();
                            if (!z && !q0 && !attachVideo.b.isEmpty()) {
                                if (w2wVar.f1() - attachVideo.e > w2wVar.getConfig().C) {
                                    arrayList.add(obj);
                                    break;
                                    break;
                                }
                            } else {
                                if (w2wVar.f1() - attachVideo.e > w2wVar.getConfig().D) {
                                    arrayList.add(obj);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(((MsgFromChannel) it2.next()).b));
        }
        if (!arrayList2.isEmpty()) {
            Set keySet = ((wpp) w2wVar.L0(this, new n2b(this.b, arrayList2, MsgIdType.LOCAL_ID, Source.NETWORK, true, this.d))).c.keySet();
            long j = this.b;
            w2wVar.e1(this, new o280(j, "UpdateChannelMessagesContentCmd", keySet));
            if (!(collection instanceof Collection) || !collection.isEmpty()) {
                Iterator<T> it3 = collection.iterator();
                loop3: while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    MsgFromChannel msgFromChannel = (MsgFromChannel) it3.next();
                    if (arrayList2.contains(Integer.valueOf(msgFromChannel.b))) {
                        List<Attach> list = msgFromChannel.E;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator<T> it4 = list.iterator();
                            while (it4.hasNext()) {
                                if (((Attach) it4.next()) instanceof AttachChannelStub) {
                                    w2wVar.S0().H(j);
                                    break loop3;
                                }
                            }
                        }
                    }
                }
            }
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7q0)) {
            return false;
        }
        x7q0 x7q0Var = (x7q0) obj;
        return this.b == x7q0Var.b && epx.f(this.c, x7q0Var.c) && this.d == x7q0Var.d;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(this.d) + s3j0.a(Long.hashCode(this.b) * 31, this.c, 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateChannelMessagesContentCmd(channelId=");
        sb.append(this.b);
        sb.append(", messages=");
        sb.append(this.c);
        sb.append(", isPostponed=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
