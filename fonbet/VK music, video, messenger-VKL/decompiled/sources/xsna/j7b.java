package xsna;

import android.content.Context;
import com.vk.channels.api.Channel;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vk.pushes.NotificationUtils;
import com.vkontakte.android.R;
import java.util.Iterator;
import kotlin.jvm.internal.PropertyReference1Impl;
import ru.ok.proto.PublisherConfiguration;
import xsna.vqo0;

/* compiled from: ChannelNotifyFormatter.kt */
/* loaded from: classes.dex */
public final class j7b {
    public static final /* synthetic */ qcy<Object>[] f;
    public final Context a;
    public final tb8 b;
    public final wqo0 c = new wqo0(new hia(this, 1));
    public final wqo0 d = new wqo0(new m66(this, 2));
    public final wqo0 e = new wqo0(new n66(this, 2));

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(j7b.class, "bodyFormatter", "getBodyFormatter()Lcom/vk/im/ui/formatters/MsgNotifyFormatter;", 0);
        hpf0 hpf0Var = fpf0.a;
        f = new qcy[]{propertyReference1Impl, fp.c(0, j7b.class, "attachFormatter", "getAttachFormatter()Lcom/vk/im/ui/formatters/MsgAttachFormatter;", hpf0Var), ep.a(0, j7b.class, "fwdFormatter", "getFwdFormatter()Lcom/vk/im/ui/formatters/MsgNestedFormatter;", hpf0Var)};
    }

    public j7b(Context context, tb8 tb8Var, cau0 cau0Var) {
        this.a = context;
        this.b = tb8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final h7b a(Channel channel, Msg msg, ProfilesSimpleInfo profilesSimpleInfo) {
        CharSequence a;
        String obj;
        boolean z;
        String str;
        boolean z2;
        MsgFromChannel msgFromChannel;
        Object obj2;
        ImageList g;
        Image Bb;
        long longValue = channel.Bb().longValue();
        int Z5 = msg.Z5();
        String name = channel.getName();
        NotificationUtils.Type type = ad0.B(channel.Cb()) ? NotificationUtils.Type.VkAppChannels : NotificationUtils.Type.CommunityChannelsMessages;
        UserId c = o25.a().c();
        Context context = this.a;
        if (NotificationUtils.i(context, type, c)) {
            a = b().a(msg, profilesSimpleInfo, null);
            String obj3 = a.toString();
            if (msg.Ob()) {
                obj3 = go9.b("🔕 ", obj3);
            }
            obj = ine0.q(obj3).toString();
            qcy<Object>[] qcyVarArr = f;
            qcy<Object> qcyVar = qcyVarArr[2];
            wqo0 wqo0Var = this.e;
            wqo0Var.getClass();
            String d = ((en30) vqo0.a.a(wqo0Var)).d(msg);
            qcy<Object> qcyVar2 = qcyVarArr[1];
            wqo0 wqo0Var2 = this.d;
            wqo0Var2.getClass();
            CharSequence b = ((com.vk.im.ui.formatters.a) vqo0.a.a(wqo0Var2)).b(msg);
            if (drm0.N(d)) {
                d = !drm0.N(b) ? b.toString() : "";
            }
            if (!drm0.N(obj) && !drm0.N(d)) {
                b().getClass();
                if (fn30.c(msg)) {
                    obj = obj + " [" + d + ']';
                }
            }
            if (obj.length() <= 0) {
                obj = d.length() > 0 ? d : "";
            }
        } else {
            obj = context.getString(R.string.notification_msg_text_disabled_text);
        }
        long C = msg.C();
        String string = msg.Pb() ? context.getString(R.string.notification_msg_send_failed) : new DisplayNameFormatter(null, 3, null).b(msg.getFrom(), profilesSimpleInfo);
        long j = msg.getFrom().b;
        qtd0 zb = profilesSimpleInfo.zb(msg.getFrom());
        tb8 tb8Var = this.b;
        String d2 = zb != null ? ((ri70) tb8Var.invoke()).d(zb) : null;
        String b2 = ((ri70) tb8Var.invoke()).b(channel);
        boolean a2 = gz80.a(28);
        String str2 = d2;
        if (NotificationUtils.i(context, ad0.B(channel.Cb()) ? NotificationUtils.Type.VkAppChannels : NotificationUtils.Type.CommunityChannelsMessages, o25.a().c())) {
            b().getClass();
            if (fn30.c(msg)) {
                z = true;
                if (a2 && z && (msg instanceof MsgFromChannel)) {
                    msgFromChannel = (MsgFromChannel) msg;
                    if (!msgFromChannel.dc()) {
                        Iterator it = msgFromChannel.K0().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            Attach attach = (Attach) obj2;
                            Iterator it2 = it;
                            if ((attach instanceof ztx0) && ((ztx0) attach).g().Jb()) {
                                break;
                            }
                            it = it2;
                        }
                        Attach attach2 = (Attach) obj2;
                        if (attach2 != null) {
                            ztx0 ztx0Var = attach2 instanceof ztx0 ? (ztx0) attach2 : null;
                            if (ztx0Var != null) {
                                AttachImage attachImage = ztx0Var instanceof AttachImage ? (AttachImage) ztx0Var : null;
                                if (attachImage == null || attachImage.i()) {
                                    ztx0Var = null;
                                }
                                if (ztx0Var != null && (g = ztx0Var.g()) != null && (Bb = g.Bb(1440, PublisherConfiguration.DEFAULT_MAX_RES)) != null) {
                                    str = Bb.getUrl();
                                    if (!msg.Ob()) {
                                        if (NotificationUtils.g(context, ad0.B(channel.Cb()) ? NotificationUtils.Type.VkAppChannels : NotificationUtils.Type.CommunityChannelsMessages)) {
                                            z2 = true;
                                            return new h7b(longValue, Z5, name, obj, C, string, j, str, str2, b2, z2, channel.Cb());
                                        }
                                    }
                                    z2 = false;
                                    return new h7b(longValue, Z5, name, obj, C, string, j, str, str2, b2, z2, channel.Cb());
                                }
                            }
                        }
                    }
                }
                str = null;
                if (!msg.Ob()) {
                }
                z2 = false;
                return new h7b(longValue, Z5, name, obj, C, string, j, str, str2, b2, z2, channel.Cb());
            }
        }
        z = false;
        if (a2) {
            msgFromChannel = (MsgFromChannel) msg;
            if (!msgFromChannel.dc()) {
            }
        }
        str = null;
        if (!msg.Ob()) {
        }
        z2 = false;
        return new h7b(longValue, Z5, name, obj, C, string, j, str, str2, b2, z2, channel.Cb());
    }

    public final fn30 b() {
        qcy<Object> qcyVar = f[0];
        wqo0 wqo0Var = this.c;
        wqo0Var.getClass();
        return (fn30) vqo0.a.a(wqo0Var);
    }
}
