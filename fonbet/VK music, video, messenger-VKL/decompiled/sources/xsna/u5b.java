package xsna;

import com.vk.api.generated.channels.dto.ChannelsMessageDto;
import com.vk.channels.api.Channel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.attaches.AttachMap;
import com.vk.dto.common.Direction;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import com.vk.im.engine.commands.uploads.AttachUploadingEndpoint;
import com.vk.im.engine.models.attaches.AttachSticker;
import com.vk.im.engine.models.channels.ChannelType;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.stability.ImMsgSendDisabledByUnstableConnection;
import com.vk.network.kbh.state.NetworkState;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import org.json.JSONObject;

/* compiled from: ChannelMsgSendCmd.kt */
/* loaded from: classes2.dex */
public final class u5b extends le6<Integer> {
    public final Peer b;
    public final String c;
    public final MsgFromChannel d;
    public final ChannelMsgSendConfig e;
    public final boolean f = true;

    /* compiled from: ChannelMsgSendCmd.kt */
    public static final class a {
        public final ArrayList a;
        public final String b;

        public a(String str, ArrayList arrayList) {
            this.a = arrayList;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AttachInfo(apiParams=");
            sb.append(this.a);
            sb.append(", attachmentProperties=");
            return ho8.a(sb, this.b, ')');
        }
    }

    public u5b(Peer peer, ChannelMsgSendConfig channelMsgSendConfig, MsgFromChannel msgFromChannel, String str) {
        this.b = peer;
        this.c = str;
        this.d = msgFromChannel;
        this.e = channelMsgSendConfig;
    }

    public static a f(ArrayList arrayList, Map map) {
        Iterator it;
        String k;
        String str;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Attach attach = (Attach) it2.next();
            if (attach instanceof AttachImage) {
                AttachImage attachImage = (AttachImage) attach;
                AttachImage attachImage2 = map.containsKey(Integer.valueOf(attachImage.b)) ? (AttachImage) pn00.h(Integer.valueOf(attachImage.b), map) : attachImage;
                String k2 = xa4.k(attachImage2);
                if (k2 != null) {
                    arrayList2.add(k2);
                }
                boolean z = attachImage2.x;
                if (!z || attachImage2.y == null || attachImage2.z == null) {
                    it = it2;
                    if (!z || attachImage2.y == null) {
                        str = k2;
                        if (attachImage2.y != null) {
                            jSONObject = new JSONObject();
                            jSONObject.put("need_blur", 1);
                        } else {
                            jSONObject = null;
                        }
                    } else {
                        jSONObject = new JSONObject();
                        jSONObject.put("need_blur", 1);
                        str = k2;
                        jSONObject.put("original_id", String.format(Locale.US, "%s%d_%d", Arrays.copyOf(new Object[]{"photo", Long.valueOf(attachImage.d.b), Long.valueOf(attachImage.e)}, 3)));
                        jSONObject.put("is_donut", 1);
                    }
                } else {
                    jSONObject = new JSONObject();
                    jSONObject.put("need_blur", 1);
                    it = it2;
                    jSONObject.put("original_id", String.format(Locale.US, "%s%d_%d", Arrays.copyOf(new Object[]{"photo", Long.valueOf(attachImage2.d.b), Long.valueOf(attachImage2.e)}, 3)));
                    jSONObject.put("is_donut", 1);
                    str = k2;
                }
                if (jSONObject != null) {
                    jSONObject2.put(str == null ? "" : str, jSONObject);
                }
            } else {
                it = it2;
                if (attach instanceof AttachSticker) {
                    k = "sticker" + ((AttachSticker) attach).g.b;
                } else {
                    k = xa4.k(attach);
                }
                if (k != null) {
                    arrayList2.add(k);
                }
            }
            it2 = it;
        }
        return new a(jSONObject2.length() > 0 ? jSONObject2.toString() : null, arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x01c4 A[Catch: all -> 0x00a1, TryCatch #0 {all -> 0x00a1, blocks: (B:10:0x008c, B:12:0x009e, B:14:0x00a7, B:15:0x00d5, B:17:0x00db, B:21:0x00e5, B:24:0x00ea, B:26:0x00f4, B:28:0x0106, B:31:0x0111, B:33:0x0117, B:35:0x0133, B:37:0x013e, B:38:0x0147, B:41:0x0171, B:55:0x0190, B:57:0x01b2, B:61:0x01be, B:63:0x01c4, B:65:0x01dd, B:67:0x01eb, B:68:0x01f7, B:71:0x0200, B:73:0x0208, B:77:0x0214, B:80:0x0252, B:86:0x02ff, B:87:0x0304, B:94:0x0305, B:95:0x030c), top: B:9:0x008c }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02ff A[Catch: all -> 0x00a1, TRY_ENTER, TryCatch #0 {all -> 0x00a1, blocks: (B:10:0x008c, B:12:0x009e, B:14:0x00a7, B:15:0x00d5, B:17:0x00db, B:21:0x00e5, B:24:0x00ea, B:26:0x00f4, B:28:0x0106, B:31:0x0111, B:33:0x0117, B:35:0x0133, B:37:0x013e, B:38:0x0147, B:41:0x0171, B:55:0x0190, B:57:0x01b2, B:61:0x01be, B:63:0x01c4, B:65:0x01dd, B:67:0x01eb, B:68:0x01f7, B:71:0x0200, B:73:0x0208, B:77:0x0214, B:80:0x0252, B:86:0x02ff, B:87:0x0304, B:94:0x0305, B:95:0x030c), top: B:9:0x008c }] */
    @Override // xsna.le6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Integer e(w2w w2wVar) {
        List<Attach> list;
        Attach attach;
        Object obj;
        String str;
        boolean z;
        ChannelsMessageDto channelsMessageDto;
        Msg e = w2wVar.I0().y().b.e(this.d.b);
        if (e == null) {
            e = w2wVar.I0().e().b.e(this.d.b);
        }
        Msg msg = e;
        if (msg == null || !(msg instanceof MsgFromChannel)) {
            List<Attach> list2 = this.d.E;
            ArrayList arrayList = new ArrayList();
            for (Attach attach2 : list2) {
                try {
                    attach = l34.c(w2wVar, attach2);
                } catch (FileNotFoundException e2) {
                    com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                    StringBuilder sb = new StringBuilder("Error while updating ");
                    sb.append(attach2);
                    sb.append(", cause=[");
                    mla mlaVar = this.a;
                    if (mlaVar == null) {
                        mlaVar = null;
                    }
                    sb.append(mlaVar);
                    sb.append(']');
                    bVar.a(new IllegalStateException(sb.toString(), e2));
                    attach = null;
                }
                if (attach != null) {
                    arrayList.add(attach);
                }
            }
            list = arrayList;
        } else {
            list = ((MsgFromChannel) msg).E;
        }
        try {
            bdb c = w2wVar.I0().a().c(this.b.b);
            Long l = c != null ? c.w : null;
            if (l == null) {
                throw new IllegalStateException("Required value was null.");
            }
            long longValue = l.longValue();
            Serializer.c<Peer> cVar = Peer.CREATOR;
            ArrayList g = g(w2wVar, list, Collections.singleton(Peer.a.b(longValue)));
            a f = f(g, h(w2wVar, list, Collections.singleton(Peer.a.b(l.longValue()))));
            ArrayList arrayList2 = f.a;
            String str2 = f.b;
            Iterator it = g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (obj instanceof AttachMap) {
                    break;
                }
            }
            if (!(obj instanceof AttachMap)) {
                obj = null;
            }
            AttachMap attachMap = (AttachMap) obj;
            Date l2 = this.e.l();
            Integer valueOf = l2 != null ? Integer.valueOf((int) (l2.getTime() / 1000)) : null;
            if ((msg != null ? Integer.valueOf(msg.d) : null) == null || !msg.Mb()) {
                w2wVar.K().n().d().l(this.c);
                String j = this.e.j();
                String k = this.e.k();
                if (j != null && j.length() != 0) {
                    str = null;
                    if (d6q0.t != NetworkState.UNSTABLE) {
                        throw new ImMsgSendDisabledByUnstableConnection();
                    }
                    oib oibVar = new oib();
                    UserId b = com.vk.dto.common.a.b(this.b);
                    MsgFromChannel msgFromChannel = this.d;
                    String str3 = msgFromChannel.I.a;
                    String zb = msgFromChannel.T.zb();
                    Float valueOf2 = attachMap != null ? Float.valueOf((float) attachMap.e) : null;
                    Float valueOf3 = attachMap != null ? Float.valueOf((float) attachMap.f) : null;
                    boolean z2 = c.v == ChannelType.COMMUNITY_CHANNEL;
                    if (this.e.f() && this.e.c0()) {
                        z = false;
                        boolean d = this.e.d();
                        boolean z3 = !this.e.n();
                        Integer i = this.e.i();
                        boolean f2 = epx.f(this.e.p(), Boolean.TRUE);
                        channelsMessageDto = (ChannelsMessageDto) bz2.l(nib.e(oibVar, b, Boolean.valueOf(z2), str3, arrayList2, Boolean.valueOf(d), valueOf, valueOf2, valueOf3, null, this.c, Boolean.valueOf(f2), Boolean.valueOf(this.e.e()), Boolean.valueOf(z), i, Boolean.valueOf(z3), j, str, zb, this.e.i() == null ? Boolean.valueOf(this.e.B()) : null, str2, this.e.g(), -235982650, 3903), this.f);
                    }
                    z = true;
                    boolean d2 = this.e.d();
                    boolean z32 = !this.e.n();
                    Integer i2 = this.e.i();
                    boolean f22 = epx.f(this.e.p(), Boolean.TRUE);
                    if (this.e.i() == null) {
                    }
                    channelsMessageDto = (ChannelsMessageDto) bz2.l(nib.e(oibVar, b, Boolean.valueOf(z2), str3, arrayList2, Boolean.valueOf(d2), valueOf, valueOf2, valueOf3, null, this.c, Boolean.valueOf(f22), Boolean.valueOf(this.e.e()), Boolean.valueOf(z), i2, Boolean.valueOf(z32), j, str, zb, this.e.i() == null ? Boolean.valueOf(this.e.B()) : null, str2, this.e.g(), -235982650, 3903), this.f);
                }
                str = k;
                if (d6q0.t != NetworkState.UNSTABLE) {
                }
            } else {
                oib oibVar2 = new oib();
                UserId b2 = com.vk.dto.common.a.b(this.b);
                MsgFromChannel msgFromChannel2 = this.d;
                channelsMessageDto = (ChannelsMessageDto) bz2.l(oibVar2.g(msg.d, b2, msgFromChannel2.I.a, arrayList2, attachMap != null ? Float.valueOf((float) attachMap.e) : null, attachMap != null ? Float.valueOf((float) attachMap.f) : null, Boolean.valueOf(this.e.d()), valueOf, Boolean.valueOf(!this.e.f()), this.e.i(), msgFromChannel2.T.zb(), this.e.i() != null ? Boolean.valueOf(this.e.B()) : null, str2), this.f);
            }
            Channel channel = (Channel) ((wpp) w2wVar.J0(this, new gfb(Collections.singletonList(this.b), Source.CACHE, false, 12)).await()).c.get(Long.valueOf(this.b.b));
            if (channel != null && channel.n && this.e.l() == null) {
                w2wVar.L0(this, new x4b(this.b, new vj30(MsgIdType.CNV_ID, channelsMessageDto.d(), Direction.AFTER), false, 2, Source.NETWORK, 96));
                w2wVar.e1(this, new w280(this, Collections.singletonList(Long.valueOf(this.b.b))));
            }
            return Integer.valueOf(channelsMessageDto.d());
        } finally {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5b)) {
            return false;
        }
        u5b u5bVar = (u5b) obj;
        return epx.f(this.b, u5bVar.b) && epx.f(this.c, u5bVar.c) && epx.f(this.d, u5bVar.d) && epx.f(this.e, u5bVar.e) && this.f == u5bVar.f;
    }

    public final ArrayList g(w2w w2wVar, List list, Set set) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (((Attach) obj).Ya()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list2 = (List) pair.d();
        return j5g.u0((List) w2wVar.L0(this, new ch30(set, (List) pair.g(), AttachUploadingEndpoint.CHANNEL, Long.valueOf(Math.abs(this.b.b)))), list2);
    }

    public final Map<Integer, AttachImage> h(w2w w2wVar, List<? extends Attach> list, Set<? extends Peer> set) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof AttachImage) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            AttachImage attachImage = (AttachImage) next;
            if (attachImage.x && attachImage.z == null) {
                arrayList2.add(next);
            }
        }
        return arrayList2.isEmpty() ? jgp.b : (Map) w2wVar.L0(this, new aaq0(arrayList2, Math.abs(this.b.b), set));
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((this.d.hashCode() + urd0.a(Long.hashCode(this.b.b) * 31, 31, this.c)) * 31)) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelMsgSendCmd(peer=");
        sb.append(this.b);
        sb.append(", guid=");
        sb.append(this.c);
        sb.append(", msg=");
        sb.append(this.d);
        sb.append(", config=");
        sb.append(this.e);
        sb.append(", isAwaitNetwork=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}
