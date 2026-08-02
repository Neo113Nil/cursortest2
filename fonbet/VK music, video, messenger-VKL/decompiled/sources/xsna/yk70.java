package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import com.ironsource.X3;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vk.pushes.NotificationUtils;
import com.vkontakte.android.R;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.PropertyReference1Impl;
import ru.ok.proto.PublisherConfiguration;

/* compiled from: NotifyFormatter.kt */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes7.dex */
public final class yk70 {
    public static final /* synthetic */ qcy<Object>[] g;
    public final si70 a;
    public final Context b;
    public final wqo0 c;
    public final wqo0 d;
    public final wqo0 e;
    public final wqo0 f;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(yk70.class, "nameFormatter", "getNameFormatter()Lcom/vk/im/ui/formatters/DisplayNameFormatter;", 0);
        hpf0 hpf0Var = fpf0.a;
        g = new qcy[]{propertyReference1Impl, fp.c(0, yk70.class, "bodyFormatter", "getBodyFormatter()Lcom/vk/im/ui/formatters/MsgNotifyFormatter;", hpf0Var), ep.a(0, yk70.class, "attachFormatter", "getAttachFormatter()Lcom/vk/im/ui/formatters/MsgAttachFormatter;", hpf0Var), ep.a(0, yk70.class, "fwdFormatter", "getFwdFormatter()Lcom/vk/im/ui/formatters/MsgNestedFormatter;", hpf0Var)};
    }

    public yk70(si70 si70Var) {
        this.a = si70Var;
        Context context = e43.a;
        this.b = context == null ? null : context;
        this.c = new wqo0(new xk70(0));
        this.d = new wqo0(new tju(this, 13));
        this.e = new wqo0(new vv20(this, 8));
        this.f = new wqo0(new vex(this, 13));
    }

    public static boolean c(Context context, Dialog dialog, long j) {
        return NotificationUtils.i(context, com.vk.dto.common.b.c(j) ? NotificationUtils.Type.CommunityMessages : dialog.uc() ? NotificationUtils.Type.ChatMessages : NotificationUtils.Type.PrivateMessages, o25.a().c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0210 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0283  */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16, types: [xsna.ztx0] */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r17v3, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final uk70 a(Context context, dv30 dv30Var) {
        boolean z;
        String d;
        String obj;
        String str;
        String b;
        boolean z2;
        String str2;
        qtd0 zb;
        boolean z3;
        Iterator it;
        String str3;
        AttachImage attachImage;
        ImageList g2;
        Image Bb;
        String str4;
        String string;
        ProfilesSimpleInfo profilesSimpleInfo = dv30Var.e;
        Dialog dialog = dv30Var.b;
        Msg msg = dv30Var.c;
        long j = dv30Var.a;
        boolean c = com.vk.dto.common.b.c(j);
        qcy<Object>[] qcyVarArr = g;
        Context context2 = this.b;
        if (c) {
            z = false;
            Group group = (Group) profilesSimpleInfo.e.get(Long.valueOf(-j));
            if (group == null || (str4 = group.c) == null) {
                str4 = "…";
            }
            StringBuilder e = fw3.e(o25.a().g().size() > 1 ? efz.b(o25.a().c().b, "] ", new StringBuilder("[id")) : "");
            if (dialog.uc()) {
                StringBuilder a = t33.a(X3.j.d, str4, "] ");
                ChatSettings Hb = dialog.Hb();
                a.append(Hb != null ? Hb.b : null);
                string = a.toString();
            } else {
                string = context2.getString(R.string.push_group_msg_title_template, str4);
            }
            e.append(string);
            d = e.toString();
        } else {
            z = false;
            qcy<Object> qcyVar = qcyVarArr[0];
            wqo0 wqo0Var = this.c;
            wqo0Var.getClass();
            d = ((DisplayNameFormatter) wqo0Var.get()).d(dialog, profilesSimpleInfo);
        }
        String str5 = d;
        if (c(context, dialog, j)) {
            String obj2 = b().a(msg, profilesSimpleInfo, dialog).toString();
            if (msg.x) {
                obj2 = go9.b("🔕 ", obj2);
            }
            obj = ine0.q(obj2).toString();
            qcy<Object> qcyVar2 = qcyVarArr[3];
            wqo0 wqo0Var2 = this.f;
            wqo0Var2.getClass();
            String d2 = ((en30) wqo0Var2.get()).d(msg);
            qcy<Object> qcyVar3 = qcyVarArr[2];
            wqo0 wqo0Var3 = this.e;
            wqo0Var3.getClass();
            CharSequence b2 = ((com.vk.im.ui.formatters.a) wqo0Var3.get()).b(msg);
            if (drm0.N(d2)) {
                d2 = !drm0.N(b2) ? b2.toString() : "";
            }
            if (!drm0.N(obj) && !drm0.N(d2)) {
                b().getClass();
                if (fn30.c(msg)) {
                    obj = obj + " [" + d2 + ']';
                }
            }
            if (obj.length() <= 0) {
                obj = d2.length() > 0 ? d2 : "";
            }
        } else {
            obj = context.getString(R.string.notification_msg_text_disabled_text);
        }
        if (msg.Pb()) {
            b = context2.getString(R.string.notification_msg_send_failed);
            str = null;
        } else {
            str = null;
            b = new DisplayNameFormatter(null, 3, null).b(msg.getFrom(), profilesSimpleInfo);
        }
        if (c(context2, dialog, j)) {
            b().getClass();
            if (fn30.c(msg) && (!(msg instanceof MsgFromUser) || !((MsgFromUser) msg).F0())) {
                z2 = true;
                if (gz80.a(28) && z2 && (msg instanceof MsgFromUser)) {
                    it = ((MsgFromUser) msg).H.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            ?? next = it.next();
                            Attach attach = (Attach) next;
                            if ((attach instanceof ztx0) && ((ztx0) attach).g().Jb()) {
                                str3 = next;
                                break;
                            }
                        } else {
                            str3 = str;
                            break;
                        }
                    }
                    attachImage = !(str3 instanceof ztx0) ? (ztx0) str3 : str;
                    if (((attachImage instanceof AttachImage) || attachImage.v == null) && attachImage != 0 && (g2 = attachImage.g()) != null && (Bb = g2.Bb(1440, PublisherConfiguration.DEFAULT_MAX_RES)) != null) {
                        str2 = Bb.d;
                        long j2 = msg.c;
                        boolean z4 = msg instanceof MsgFromUser;
                        Pair pair = (!z4 || ((!z4 || (!com.vk.dto.common.b.d(j2) && !com.vk.dto.common.b.b(j2))) ? z : true)) ? new Pair(obj, b) : new Pair("", obj);
                        String str6 = (String) pair.d();
                        String str7 = (String) pair.g();
                        boolean Pb = msg.Pb();
                        int i = !Pb ? msg.b : msg.d;
                        long j3 = dv30Var.a;
                        long longValue = dialog.Sb().longValue();
                        long j4 = msg.g;
                        long j5 = msg.getFrom().b;
                        zb = profilesSimpleInfo.zb(msg.getFrom());
                        si70 si70Var = this.a;
                        if (zb != null) {
                            str = si70Var.d(zb);
                        }
                        al70 al70Var = new al70(str, zb == null ? si70Var.f(zb) : null);
                        boolean uc = dialog.uc();
                        if (dialog.notificationsIsUseSound && !msg.x) {
                            if (NotificationUtils.g(context, !com.vk.dto.common.b.c(j) ? NotificationUtils.Type.CommunityMessages : dialog.uc() ? NotificationUtils.Type.ChatMessages : NotificationUtils.Type.PrivateMessages)) {
                                z3 = true;
                                return new uk70(j3, longValue, i, str5, str6, j4, str7, j5, al70Var, str2, uc, dialog.tc(), dialog.kc() == 1 ? true : z, dv30Var.d, z3, Pb, new al70(si70Var.g(dialog), si70Var.e(dialog)));
                            }
                        }
                        z3 = z;
                        return new uk70(j3, longValue, i, str5, str6, j4, str7, j5, al70Var, str2, uc, dialog.tc(), dialog.kc() == 1 ? true : z, dv30Var.d, z3, Pb, new al70(si70Var.g(dialog), si70Var.e(dialog)));
                    }
                }
                str2 = str;
                long j22 = msg.c;
                boolean z42 = msg instanceof MsgFromUser;
                if (z42) {
                }
                String str62 = (String) pair.d();
                String str72 = (String) pair.g();
                boolean Pb2 = msg.Pb();
                int i2 = !Pb2 ? msg.b : msg.d;
                long j32 = dv30Var.a;
                long longValue2 = dialog.Sb().longValue();
                long j42 = msg.g;
                long j52 = msg.getFrom().b;
                zb = profilesSimpleInfo.zb(msg.getFrom());
                si70 si70Var2 = this.a;
                if (zb != null) {
                }
                al70 al70Var2 = new al70(str, zb == null ? si70Var2.f(zb) : null);
                boolean uc2 = dialog.uc();
                if (dialog.notificationsIsUseSound) {
                    if (NotificationUtils.g(context, !com.vk.dto.common.b.c(j) ? NotificationUtils.Type.CommunityMessages : dialog.uc() ? NotificationUtils.Type.ChatMessages : NotificationUtils.Type.PrivateMessages)) {
                    }
                }
                z3 = z;
                return new uk70(j32, longValue2, i2, str5, str62, j42, str72, j52, al70Var2, str2, uc2, dialog.tc(), dialog.kc() == 1 ? true : z, dv30Var.d, z3, Pb2, new al70(si70Var2.g(dialog), si70Var2.e(dialog)));
            }
        }
        z2 = z;
        if (gz80.a(28)) {
            it = ((MsgFromUser) msg).H.iterator();
            while (true) {
                if (!it.hasNext()) {
                }
            }
            if (!(str3 instanceof ztx0)) {
            }
            if (attachImage instanceof AttachImage) {
            }
            str2 = Bb.d;
            long j222 = msg.c;
            boolean z422 = msg instanceof MsgFromUser;
            if (z422) {
            }
            String str622 = (String) pair.d();
            String str722 = (String) pair.g();
            boolean Pb22 = msg.Pb();
            int i22 = !Pb22 ? msg.b : msg.d;
            long j322 = dv30Var.a;
            long longValue22 = dialog.Sb().longValue();
            long j422 = msg.g;
            long j522 = msg.getFrom().b;
            zb = profilesSimpleInfo.zb(msg.getFrom());
            si70 si70Var22 = this.a;
            if (zb != null) {
            }
            al70 al70Var22 = new al70(str, zb == null ? si70Var22.f(zb) : null);
            boolean uc22 = dialog.uc();
            if (dialog.notificationsIsUseSound) {
            }
            z3 = z;
            return new uk70(j322, longValue22, i22, str5, str622, j422, str722, j522, al70Var22, str2, uc22, dialog.tc(), dialog.kc() == 1 ? true : z, dv30Var.d, z3, Pb22, new al70(si70Var22.g(dialog), si70Var22.e(dialog)));
        }
        str2 = str;
        long j2222 = msg.c;
        boolean z4222 = msg instanceof MsgFromUser;
        if (z4222) {
        }
        String str6222 = (String) pair.d();
        String str7222 = (String) pair.g();
        boolean Pb222 = msg.Pb();
        int i222 = !Pb222 ? msg.b : msg.d;
        long j3222 = dv30Var.a;
        long longValue222 = dialog.Sb().longValue();
        long j4222 = msg.g;
        long j5222 = msg.getFrom().b;
        zb = profilesSimpleInfo.zb(msg.getFrom());
        si70 si70Var222 = this.a;
        if (zb != null) {
        }
        al70 al70Var222 = new al70(str, zb == null ? si70Var222.f(zb) : null);
        boolean uc222 = dialog.uc();
        if (dialog.notificationsIsUseSound) {
        }
        z3 = z;
        return new uk70(j3222, longValue222, i222, str5, str6222, j4222, str7222, j5222, al70Var222, str2, uc222, dialog.tc(), dialog.kc() == 1 ? true : z, dv30Var.d, z3, Pb222, new al70(si70Var222.g(dialog), si70Var222.e(dialog)));
    }

    public final fn30 b() {
        qcy<Object> qcyVar = g[1];
        wqo0 wqo0Var = this.d;
        wqo0Var.getClass();
        return (fn30) wqo0Var.get();
    }
}
