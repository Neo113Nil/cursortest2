package xsna;

import android.content.Context;
import com.vk.channels.api.Channel;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.engine.models.stories.ImStoryState;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.mto0;

/* compiled from: ChannelsListItemsMapper.kt */
/* loaded from: classes16.dex */
public final class ngb {
    public static final /* synthetic */ qcy<Object>[] d;
    public final Context a;
    public final wqo0 b = new wqo0(new v40(this, 12));
    public final bpn0 c = new bpn0(new w40(this, 17));

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ngb.class, "timeFormatter", "getTimeFormatter()Lcom/vk/im/ui/formatters/DialogTimeFormatter;", 0);
        fpf0.a.getClass();
        d = new qcy[]{propertyReference1Impl};
    }

    public ngb(Context context) {
        this.a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013b  */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j0b a(Channel channel, MsgFromChannel msgFromChannel, ProfilesSimpleInfo profilesSimpleInfo, Map<Peer, ? extends ImStoryState> map, boolean z) {
        String str;
        String stringBuffer;
        String str2;
        ImStoryState imStoryState;
        SimpleDateFormat simpleDateFormat;
        CharSequence a = msgFromChannel != null ? p4b.a(msgFromChannel, profilesSimpleInfo) : (String) this.c.getValue();
        if (msgFromChannel != null) {
            long j = msgFromChannel.g;
            boolean t = BuildInfo.t();
            qcy<Object>[] qcyVarArr = d;
            wqo0 wqo0Var = this.b;
            if (t) {
                qcy<Object> qcyVar = qcyVarArr[0];
                wqo0Var.getClass();
                vlm vlmVar = (vlm) wqo0Var.get();
                vlmVar.getClass();
                xuo0.a.getClass();
                long d2 = xuo0.d(j);
                ?? r6 = vlmVar.a;
                ((Calendar) r6.getValue()).setTimeInMillis(d2);
                Date date = vlmVar.b;
                date.setTime(d2);
                long d3 = xuo0.d(xuo0.a());
                vlmVar.c().setTimeInMillis(d3);
                Calendar c = vlmVar.c();
                Calendar calendar = (Calendar) r6.getValue();
                if (c.get(1) == calendar.get(1) && c.get(2) == calendar.get(2) && c.get(5) == calendar.get(5)) {
                    simpleDateFormat = (SimpleDateFormat) vlmVar.g.getValue();
                } else if ((d3 - d2) / vlm.n <= 7) {
                    simpleDateFormat = (SimpleDateFormat) vlmVar.h.getValue();
                } else {
                    simpleDateFormat = vlmVar.c().get(1) == ((Calendar) r6.getValue()).get(1) ? (SimpleDateFormat) vlmVar.l.getValue() : (SimpleDateFormat) vlmVar.m.getValue();
                }
                str = simpleDateFormat.format(date);
            } else {
                qcy<Object> qcyVar2 = qcyVarArr[0];
                wqo0Var.getClass();
                StringBuffer stringBuffer2 = ((vlm) wqo0Var.get()).e;
                vlm.b(j, stringBuffer2);
                str = stringBuffer2.toString();
            }
        } else {
            str = "";
        }
        String str3 = str;
        if (msgFromChannel == null) {
            stringBuffer = null;
        } else {
            if (BuildInfo.t()) {
                str2 = str3;
                long j2 = channel.b;
                ImageList imageList = channel.c;
                String str4 = channel.d;
                xuo0.a.getClass();
                boolean Db = channel.Db(xuo0.a());
                int i = channel.k;
                long j3 = channel.b;
                Serializer.c<Peer> cVar = Peer.CREATOR;
                imStoryState = map.get(Peer.a.b(j3));
                if (imStoryState == null) {
                    imStoryState = ImStoryState.NONE;
                }
                return new j0b(j2, imageList, str4, a, str3, str2, i, Db, imStoryState, channel.f, !z ? com.vk.im.engine.models.im_item.b.f(channel.P) : pli.j(channel.s), channel.K);
            }
            StringBuffer stringBuffer3 = new StringBuffer();
            mto0.a(msgFromChannel.g, stringBuffer3, mto0.a.C3369a.g);
            stringBuffer = stringBuffer3.toString();
        }
        str2 = stringBuffer;
        long j22 = channel.b;
        ImageList imageList2 = channel.c;
        String str42 = channel.d;
        xuo0.a.getClass();
        boolean Db2 = channel.Db(xuo0.a());
        int i2 = channel.k;
        long j32 = channel.b;
        Serializer.c<Peer> cVar2 = Peer.CREATOR;
        imStoryState = map.get(Peer.a.b(j32));
        if (imStoryState == null) {
        }
        return new j0b(j22, imageList2, str42, a, str3, str2, i2, Db2, imStoryState, channel.f, !z ? com.vk.im.engine.models.im_item.b.f(channel.P) : pli.j(channel.s), channel.K);
    }
}
