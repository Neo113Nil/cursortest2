package defpackage;

import android.app.AlertDialog;
import android.content.ClipData;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Handler;
import android.os.RemoteException;
import android.view.Surface;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.camera.video.k;
import androidx.concurrent.futures.b;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.SendAction;
import com.yandex.messaging.core.net.entities.GetUrlPreviewResponse;
import com.yandex.messaging.core.net.entities.proto.message.CustomPayload;
import com.yandex.messaging.input.g;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.internal.SavedMessages;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.ChatId;
import com.yandex.messaging.internal.entities.ForwardMessageRef;
import com.yandex.messaging.internal.view.chat.ChatSearchToolbarBrick;
import com.yandex.messaging.internal.view.messagemenu.MessageMenuReporter$Item;
import com.yandex.messaging.internal.view.messagemenu.a;
import io.flutter.embedding.android.FlutterView;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes15.dex */
public final /* synthetic */ class k9b implements e9e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k9b(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.e9e
    public final void accept(Object obj) {
        b700 b700Var;
        b700 b700Var2;
        a aVar;
        b700 b700Var3;
        b700 b700Var4;
        int i = this.a;
        final int i2 = 2;
        final int i3 = 3;
        final int i4 = 0;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((m9b) obj2).G = ((j3b) obj).I ? oyh0.messaging_channel_search_in_progress : oyh0.messaging_chat_search_in_progress;
                break;
            case 1:
                ((ChatSearchToolbarBrick) obj2).onChatInfoAvailable((j3b) obj);
                break;
            case 2:
                mrh mrhVar = (mrh) obj2;
                if (((Boolean) obj).booleanValue()) {
                    mrhVar.i();
                    break;
                } else {
                    mrhVar.n();
                    break;
                }
            case 3:
                m150 m150Var = (m150) obj;
                ((zog) obj2).b(m150Var.a, new czj(m150Var.b, m150Var.c, m150Var.d, Boolean.valueOf(m150Var.e)));
                break;
            case 4:
                ((tls) obj2).invoke(new tu21(((tun) obj).a));
                break;
            case 5:
                ((FlutterView) obj2).setWindowInfoListenerDisplayFeatures((v751) obj);
                break;
            case 6:
                q4g q4gVar = (q4g) obj2;
                ru10 ru10Var = (ru10) obj;
                final LocalMessageRef localMessageRef = (LocalMessageRef) q4gVar.x;
                final mu10 mu10Var = (mu10) q4gVar.c;
                final ps10 ps10Var = (ps10) q4gVar.w;
                a aVar2 = (a) q4gVar.b;
                if (!ru10Var.a && !jl40.l(ru10Var.s, Boolean.TRUE)) {
                    final ServerMessageRef serverMessageRef = ru10Var.f;
                    if (serverMessageRef == null || !mu10Var.j.c) {
                        a.q(aVar2, e9h0.message_forward, wwg0.msg_ic_arrow_to_forward, null, 0, null, 120);
                        b700Var = null;
                    } else {
                        final int i5 = 4;
                        a.q(aVar2, e9h0.message_forward, wwg0.msg_ic_arrow_to_forward, new sls() { // from class: gu10
                            @Override // defpackage.sls
                            public final Object invoke() {
                                String str;
                                int i6 = i5;
                                zy11 zy11Var = zy11.a;
                                ServerMessageRef serverMessageRef2 = serverMessageRef;
                                ps10 ps10Var2 = ps10Var;
                                mu10 mu10Var2 = mu10Var;
                                switch (i6) {
                                    case 0:
                                        mu10Var2.i.a(MessageMenuReporter$Item.THREAD_SHOW);
                                        ps10Var2.v(serverMessageRef2);
                                        break;
                                    case 1:
                                        mu10Var2.i.a(MessageMenuReporter$Item.REPLY);
                                        nu10 nu10Var = ps10Var2.F;
                                        if (nu10Var != null && (str = nu10Var.h) != null) {
                                            ps10Var2.o.a(str, serverMessageRef2, d620.d);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        mu10Var2.i.a(MessageMenuReporter$Item.THREAD_REPLY);
                                        ps10Var2.z.a.c("menu thread reply tapped", "thread id", ChatId.Companion.a(serverMessageRef2.getRequiredChatId()).b(serverMessageRef2.getTimestamp()).a);
                                        sfl0.a(ps10Var2.u, new q6b(c720.d, nob1.b(serverMessageRef2), null, null, null, 1966076), 6);
                                        break;
                                    case 3:
                                        mu10Var2.i.a(MessageMenuReporter$Item.PIN);
                                        qu10 qu10Var = ps10Var2.s;
                                        b00 b00Var = qu10Var.c;
                                        ((Handler) b00Var.a.get()).post(new lz(3, b00Var, qu10Var.b, serverMessageRef2));
                                        break;
                                    case 4:
                                        mu10Var2.i.a(MessageMenuReporter$Item.FORWARD);
                                        c620 c620Var = c620.d;
                                        sfl0 sfl0Var = ps10Var2.u;
                                        SendAction sendAction = SendAction.NO_ACTION;
                                        Collections.singletonList(serverMessageRef2);
                                        sfl0Var.getClass();
                                        new cqr0(c620Var);
                                        break;
                                    case 5:
                                        mu10Var2.i.a(MessageMenuReporter$Item.EDIT);
                                        ps10Var2.m.a(serverMessageRef2);
                                        break;
                                    default:
                                        mu10Var2.i.a(MessageMenuReporter$Item.DELETE);
                                        ps10Var2.d.a(1, new p500(20, mu10Var2.c, serverMessageRef2), new d82(1));
                                        break;
                                }
                                return zy11Var;
                            }
                        }, 0, null, 120);
                        b700Var = null;
                    }
                    final ServerMessageRef serverMessageRef2 = ru10Var.g;
                    if (serverMessageRef2 == null || !mu10Var.j.e) {
                        a.q(aVar2, e9h0.message_reply, wwg0.msg_ic_reply, b700Var, jng0.messagingCommonIconsPrimaryColor, null, 112);
                    } else {
                        a.q(aVar2, e9h0.message_reply, wwg0.msg_ic_reply, new sls() { // from class: gu10
                            @Override // defpackage.sls
                            public final Object invoke() {
                                String str;
                                int i6 = r4;
                                zy11 zy11Var = zy11.a;
                                ServerMessageRef serverMessageRef22 = serverMessageRef2;
                                ps10 ps10Var2 = ps10Var;
                                mu10 mu10Var2 = mu10Var;
                                switch (i6) {
                                    case 0:
                                        mu10Var2.i.a(MessageMenuReporter$Item.THREAD_SHOW);
                                        ps10Var2.v(serverMessageRef22);
                                        break;
                                    case 1:
                                        mu10Var2.i.a(MessageMenuReporter$Item.REPLY);
                                        nu10 nu10Var = ps10Var2.F;
                                        if (nu10Var != null && (str = nu10Var.h) != null) {
                                            ps10Var2.o.a(str, serverMessageRef22, d620.d);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        mu10Var2.i.a(MessageMenuReporter$Item.THREAD_REPLY);
                                        ps10Var2.z.a.c("menu thread reply tapped", "thread id", ChatId.Companion.a(serverMessageRef22.getRequiredChatId()).b(serverMessageRef22.getTimestamp()).a);
                                        sfl0.a(ps10Var2.u, new q6b(c720.d, nob1.b(serverMessageRef22), null, null, null, 1966076), 6);
                                        break;
                                    case 3:
                                        mu10Var2.i.a(MessageMenuReporter$Item.PIN);
                                        qu10 qu10Var = ps10Var2.s;
                                        b00 b00Var = qu10Var.c;
                                        ((Handler) b00Var.a.get()).post(new lz(3, b00Var, qu10Var.b, serverMessageRef22));
                                        break;
                                    case 4:
                                        mu10Var2.i.a(MessageMenuReporter$Item.FORWARD);
                                        c620 c620Var = c620.d;
                                        sfl0 sfl0Var = ps10Var2.u;
                                        SendAction sendAction = SendAction.NO_ACTION;
                                        Collections.singletonList(serverMessageRef22);
                                        sfl0Var.getClass();
                                        new cqr0(c620Var);
                                        break;
                                    case 5:
                                        mu10Var2.i.a(MessageMenuReporter$Item.EDIT);
                                        ps10Var2.m.a(serverMessageRef22);
                                        break;
                                    default:
                                        mu10Var2.i.a(MessageMenuReporter$Item.DELETE);
                                        ps10Var2.d.a(1, new p500(20, mu10Var2.c, serverMessageRef22), new d82(1));
                                        break;
                                }
                                return zy11Var;
                            }
                        }, jng0.messagingCommonIconsPrimaryColor, null, 112);
                    }
                    final ServerMessageRef serverMessageRef3 = ru10Var.d;
                    if (serverMessageRef3 == null || mu10Var.c == null) {
                        a.q(aVar2, e9h0.message_delete, wwg0.msg_ic_delete, b700Var, jng0.messagingCommonDestructiveIconsColor, null, 112);
                    } else {
                        final int i6 = 6;
                        a.q(aVar2, e9h0.message_delete, wwg0.msg_ic_delete, new sls() { // from class: gu10
                            @Override // defpackage.sls
                            public final Object invoke() {
                                String str;
                                int i62 = i6;
                                zy11 zy11Var = zy11.a;
                                ServerMessageRef serverMessageRef22 = serverMessageRef3;
                                ps10 ps10Var2 = ps10Var;
                                mu10 mu10Var2 = mu10Var;
                                switch (i62) {
                                    case 0:
                                        mu10Var2.i.a(MessageMenuReporter$Item.THREAD_SHOW);
                                        ps10Var2.v(serverMessageRef22);
                                        break;
                                    case 1:
                                        mu10Var2.i.a(MessageMenuReporter$Item.REPLY);
                                        nu10 nu10Var = ps10Var2.F;
                                        if (nu10Var != null && (str = nu10Var.h) != null) {
                                            ps10Var2.o.a(str, serverMessageRef22, d620.d);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        mu10Var2.i.a(MessageMenuReporter$Item.THREAD_REPLY);
                                        ps10Var2.z.a.c("menu thread reply tapped", "thread id", ChatId.Companion.a(serverMessageRef22.getRequiredChatId()).b(serverMessageRef22.getTimestamp()).a);
                                        sfl0.a(ps10Var2.u, new q6b(c720.d, nob1.b(serverMessageRef22), null, null, null, 1966076), 6);
                                        break;
                                    case 3:
                                        mu10Var2.i.a(MessageMenuReporter$Item.PIN);
                                        qu10 qu10Var = ps10Var2.s;
                                        b00 b00Var = qu10Var.c;
                                        ((Handler) b00Var.a.get()).post(new lz(3, b00Var, qu10Var.b, serverMessageRef22));
                                        break;
                                    case 4:
                                        mu10Var2.i.a(MessageMenuReporter$Item.FORWARD);
                                        c620 c620Var = c620.d;
                                        sfl0 sfl0Var = ps10Var2.u;
                                        SendAction sendAction = SendAction.NO_ACTION;
                                        Collections.singletonList(serverMessageRef22);
                                        sfl0Var.getClass();
                                        new cqr0(c620Var);
                                        break;
                                    case 5:
                                        mu10Var2.i.a(MessageMenuReporter$Item.EDIT);
                                        ps10Var2.m.a(serverMessageRef22);
                                        break;
                                    default:
                                        mu10Var2.i.a(MessageMenuReporter$Item.DELETE);
                                        ps10Var2.d.a(1, new p500(20, mu10Var2.c, serverMessageRef22), new d82(1));
                                        break;
                                }
                                return zy11Var;
                            }
                        }, jng0.messagingCommonDestructiveIconsColor, null, 112);
                    }
                    final ServerMessageRef serverMessageRef4 = ru10Var.e;
                    if (serverMessageRef4 == null || !mu10Var.j.e) {
                        a.q(aVar2, e9h0.message_edit, wwg0.msg_ic_edit, b700Var, 0, null, 120);
                    } else {
                        final int i7 = 5;
                        a.q(aVar2, e9h0.message_edit, wwg0.msg_ic_edit, new sls() { // from class: gu10
                            @Override // defpackage.sls
                            public final Object invoke() {
                                String str;
                                int i62 = i7;
                                zy11 zy11Var = zy11.a;
                                ServerMessageRef serverMessageRef22 = serverMessageRef4;
                                ps10 ps10Var2 = ps10Var;
                                mu10 mu10Var2 = mu10Var;
                                switch (i62) {
                                    case 0:
                                        mu10Var2.i.a(MessageMenuReporter$Item.THREAD_SHOW);
                                        ps10Var2.v(serverMessageRef22);
                                        break;
                                    case 1:
                                        mu10Var2.i.a(MessageMenuReporter$Item.REPLY);
                                        nu10 nu10Var = ps10Var2.F;
                                        if (nu10Var != null && (str = nu10Var.h) != null) {
                                            ps10Var2.o.a(str, serverMessageRef22, d620.d);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        mu10Var2.i.a(MessageMenuReporter$Item.THREAD_REPLY);
                                        ps10Var2.z.a.c("menu thread reply tapped", "thread id", ChatId.Companion.a(serverMessageRef22.getRequiredChatId()).b(serverMessageRef22.getTimestamp()).a);
                                        sfl0.a(ps10Var2.u, new q6b(c720.d, nob1.b(serverMessageRef22), null, null, null, 1966076), 6);
                                        break;
                                    case 3:
                                        mu10Var2.i.a(MessageMenuReporter$Item.PIN);
                                        qu10 qu10Var = ps10Var2.s;
                                        b00 b00Var = qu10Var.c;
                                        ((Handler) b00Var.a.get()).post(new lz(3, b00Var, qu10Var.b, serverMessageRef22));
                                        break;
                                    case 4:
                                        mu10Var2.i.a(MessageMenuReporter$Item.FORWARD);
                                        c620 c620Var = c620.d;
                                        sfl0 sfl0Var = ps10Var2.u;
                                        SendAction sendAction = SendAction.NO_ACTION;
                                        Collections.singletonList(serverMessageRef22);
                                        sfl0Var.getClass();
                                        new cqr0(c620Var);
                                        break;
                                    case 5:
                                        mu10Var2.i.a(MessageMenuReporter$Item.EDIT);
                                        ps10Var2.m.a(serverMessageRef22);
                                        break;
                                    default:
                                        mu10Var2.i.a(MessageMenuReporter$Item.DELETE);
                                        ps10Var2.d.a(1, new p500(20, mu10Var2.c, serverMessageRef22), new d82(1));
                                        break;
                                }
                                return zy11Var;
                            }
                        }, 0, null, 120);
                    }
                    final ServerMessageRef serverMessageRef5 = ru10Var.j;
                    if (serverMessageRef5 != null) {
                        a.q(aVar2, e9h0.message_pin, wwg0.msg_ic_pin, new sls() { // from class: gu10
                            @Override // defpackage.sls
                            public final Object invoke() {
                                String str;
                                int i62 = i3;
                                zy11 zy11Var = zy11.a;
                                ServerMessageRef serverMessageRef22 = serverMessageRef5;
                                ps10 ps10Var2 = ps10Var;
                                mu10 mu10Var2 = mu10Var;
                                switch (i62) {
                                    case 0:
                                        mu10Var2.i.a(MessageMenuReporter$Item.THREAD_SHOW);
                                        ps10Var2.v(serverMessageRef22);
                                        break;
                                    case 1:
                                        mu10Var2.i.a(MessageMenuReporter$Item.REPLY);
                                        nu10 nu10Var = ps10Var2.F;
                                        if (nu10Var != null && (str = nu10Var.h) != null) {
                                            ps10Var2.o.a(str, serverMessageRef22, d620.d);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        mu10Var2.i.a(MessageMenuReporter$Item.THREAD_REPLY);
                                        ps10Var2.z.a.c("menu thread reply tapped", "thread id", ChatId.Companion.a(serverMessageRef22.getRequiredChatId()).b(serverMessageRef22.getTimestamp()).a);
                                        sfl0.a(ps10Var2.u, new q6b(c720.d, nob1.b(serverMessageRef22), null, null, null, 1966076), 6);
                                        break;
                                    case 3:
                                        mu10Var2.i.a(MessageMenuReporter$Item.PIN);
                                        qu10 qu10Var = ps10Var2.s;
                                        b00 b00Var = qu10Var.c;
                                        ((Handler) b00Var.a.get()).post(new lz(3, b00Var, qu10Var.b, serverMessageRef22));
                                        break;
                                    case 4:
                                        mu10Var2.i.a(MessageMenuReporter$Item.FORWARD);
                                        c620 c620Var = c620.d;
                                        sfl0 sfl0Var = ps10Var2.u;
                                        SendAction sendAction = SendAction.NO_ACTION;
                                        Collections.singletonList(serverMessageRef22);
                                        sfl0Var.getClass();
                                        new cqr0(c620Var);
                                        break;
                                    case 5:
                                        mu10Var2.i.a(MessageMenuReporter$Item.EDIT);
                                        ps10Var2.m.a(serverMessageRef22);
                                        break;
                                    default:
                                        mu10Var2.i.a(MessageMenuReporter$Item.DELETE);
                                        ps10Var2.d.a(1, new p500(20, mu10Var2.c, serverMessageRef22), new d82(1));
                                        break;
                                }
                                return zy11Var;
                            }
                        }, 0, null, 120);
                        b700Var2 = b700Var;
                    } else {
                        b700 b700Var5 = b700Var;
                        a.q(aVar2, e9h0.message_pin, wwg0.msg_ic_pin, b700Var5, 0, null, 120);
                        b700Var2 = b700Var5;
                    }
                    boolean z = ru10Var.l;
                    boolean z2 = ru10Var.m;
                    if (z) {
                        xw8 xw8Var = new xw8(mu10Var, ps10Var, localMessageRef, z2, 2);
                        aVar = aVar2;
                        a.q(aVar, e9h0.report, wwg0.msg_ic_report, xw8Var, jng0.messagingCommonDestructiveIconsColor, null, 112);
                        b700Var3 = b700Var2;
                    } else {
                        aVar = aVar2;
                        b700 b700Var6 = b700Var2;
                        a.q(aVar, e9h0.report, wwg0.msg_ic_report, b700Var6, jng0.messagingCommonDestructiveIconsColor, null, 112);
                        b700Var3 = b700Var6;
                    }
                    if (ru10Var.n) {
                        a.q(aVar, e9h0.message_cancel, wwg0.msg_ic_delete, new sls() { // from class: fu10
                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i8 = r4;
                                zy11 zy11Var = zy11.a;
                                LocalMessageRef localMessageRef2 = localMessageRef;
                                ps10 ps10Var2 = ps10Var;
                                mu10 mu10Var2 = mu10Var;
                                switch (i8) {
                                    case 0:
                                        mu10Var2.i.a(MessageMenuReporter$Item.RETRY);
                                        qu10 qu10Var = ps10Var2.s;
                                        b00 b00Var = qu10Var.c;
                                        ((Handler) b00Var.a.get()).post(new mz(b00Var, qu10Var.b, localMessageRef2, 1));
                                        break;
                                    default:
                                        mu10Var2.i.a(MessageMenuReporter$Item.CANCEL);
                                        qu10 qu10Var2 = ps10Var2.s;
                                        qu10Var2.getClass();
                                        tje.e();
                                        qu10Var2.c.b(qu10Var2.b, localMessageRef2);
                                        break;
                                }
                                return zy11Var;
                            }
                        }, jng0.messagingCommonDestructiveIconsColor, null, 112);
                    } else {
                        a.q(aVar, e9h0.message_retry, wwg0.msg_ic_retry_send, b700Var3, 0, null, 120);
                    }
                    final String str = ru10Var.p;
                    if (str != null) {
                        a.q(aVar, e9h0.block_user, wwg0.msg_ic_block, new sls() { // from class: iu10
                            @Override // defpackage.sls
                            public final Object invoke() {
                                boolean z3;
                                int i8 = r4;
                                zy11 zy11Var = zy11.a;
                                final String str2 = str;
                                ps10 ps10Var2 = ps10Var;
                                mu10 mu10Var2 = mu10Var;
                                switch (i8) {
                                    case 0:
                                        mu10Var2.i.a(MessageMenuReporter$Item.COPY_LINK);
                                        qu10 qu10Var = ps10Var2.s;
                                        f3c f3cVar = qu10Var.e;
                                        f3cVar.getClass();
                                        try {
                                            f3cVar.b().setPrimaryClip(ClipData.newRawUri("Link", Uri.parse(str2)));
                                            z3 = true;
                                        } catch (RemoteException unused) {
                                            z3 = false;
                                        }
                                        if (z3) {
                                            vqb1.g(oyh0.invitelink_copied_notification, qu10Var.a);
                                            break;
                                        }
                                        break;
                                    default:
                                        mu10Var2.i.a(MessageMenuReporter$Item.BLOCK);
                                        final qu10 qu10Var2 = ps10Var2.s;
                                        final xyz xyzVar = new xyz(24, ps10Var2);
                                        qu10Var2.getClass();
                                        new AlertDialog.Builder(qu10Var2.a, w0i0.Messaging_AlertDialog).setTitle(oyh0.do_you_want_to_block_user).setMessage(oyh0.block_user_popup_text).setNegativeButton(oyh0.button_no, (DialogInterface.OnClickListener) null).setPositiveButton(oyh0.button_yes, new DialogInterface.OnClickListener() { // from class: pu10
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i9) {
                                                b00 b00Var = qu10.this.c;
                                                ((Handler) b00Var.a.get()).post(new do91(1, b00Var, str2));
                                                xyzVar.invoke();
                                                dialogInterface.dismiss();
                                            }
                                        }).show();
                                        break;
                                }
                                return zy11Var;
                            }
                        }, jng0.messagingCommonDestructiveIconsColor, null, 112);
                    } else {
                        a.q(aVar, e9h0.block_user, wwg0.msg_ic_block, b700Var3, jng0.messagingCommonDestructiveIconsColor, null, 112);
                    }
                    final String str2 = ru10Var.q;
                    boolean z3 = ru10Var.w;
                    if (str2 != null && mu10Var.j.o && z3) {
                        a.q(aVar, e9h0.message_copy_link, wwg0.msg_ic_copy_link, new sls() { // from class: iu10
                            @Override // defpackage.sls
                            public final Object invoke() {
                                boolean z32;
                                int i8 = i4;
                                zy11 zy11Var = zy11.a;
                                final String str22 = str2;
                                ps10 ps10Var2 = ps10Var;
                                mu10 mu10Var2 = mu10Var;
                                switch (i8) {
                                    case 0:
                                        mu10Var2.i.a(MessageMenuReporter$Item.COPY_LINK);
                                        qu10 qu10Var = ps10Var2.s;
                                        f3c f3cVar = qu10Var.e;
                                        f3cVar.getClass();
                                        try {
                                            f3cVar.b().setPrimaryClip(ClipData.newRawUri("Link", Uri.parse(str22)));
                                            z32 = true;
                                        } catch (RemoteException unused) {
                                            z32 = false;
                                        }
                                        if (z32) {
                                            vqb1.g(oyh0.invitelink_copied_notification, qu10Var.a);
                                            break;
                                        }
                                        break;
                                    default:
                                        mu10Var2.i.a(MessageMenuReporter$Item.BLOCK);
                                        final qu10 qu10Var2 = ps10Var2.s;
                                        final xyz xyzVar = new xyz(24, ps10Var2);
                                        qu10Var2.getClass();
                                        new AlertDialog.Builder(qu10Var2.a, w0i0.Messaging_AlertDialog).setTitle(oyh0.do_you_want_to_block_user).setMessage(oyh0.block_user_popup_text).setNegativeButton(oyh0.button_no, (DialogInterface.OnClickListener) null).setPositiveButton(oyh0.button_yes, new DialogInterface.OnClickListener() { // from class: pu10
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i9) {
                                                b00 b00Var = qu10.this.c;
                                                ((Handler) b00Var.a.get()).post(new do91(1, b00Var, str22));
                                                xyzVar.invoke();
                                                dialogInterface.dismiss();
                                            }
                                        }).show();
                                        break;
                                }
                                return zy11Var;
                            }
                        }, 0, null, 120);
                    } else {
                        a.q(aVar, e9h0.message_copy_link, wwg0.msg_ic_copy_link, b700Var3, 0, null, 120);
                    }
                    if (ru10Var.o && ((AtomicLong) q4gVar.y).get() == 0) {
                        a.q(aVar, e9h0.message_retry, wwg0.msg_ic_retry_send, new sls() { // from class: fu10
                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i8 = i4;
                                zy11 zy11Var = zy11.a;
                                LocalMessageRef localMessageRef2 = localMessageRef;
                                ps10 ps10Var2 = ps10Var;
                                mu10 mu10Var2 = mu10Var;
                                switch (i8) {
                                    case 0:
                                        mu10Var2.i.a(MessageMenuReporter$Item.RETRY);
                                        qu10 qu10Var = ps10Var2.s;
                                        b00 b00Var = qu10Var.c;
                                        ((Handler) b00Var.a.get()).post(new mz(b00Var, qu10Var.b, localMessageRef2, 1));
                                        break;
                                    default:
                                        mu10Var2.i.a(MessageMenuReporter$Item.CANCEL);
                                        qu10 qu10Var2 = ps10Var2.s;
                                        qu10Var2.getClass();
                                        tje.e();
                                        qu10Var2.c.b(qu10Var2.b, localMessageRef2);
                                        break;
                                }
                                return zy11Var;
                            }
                        }, 0, null, 120);
                    } else {
                        a.q(aVar, e9h0.message_retry, wwg0.msg_ic_retry_send, b700Var3, 0, null, 120);
                    }
                    Boolean bool = ru10Var.r;
                    if (bool == null || !mu10Var.j.m) {
                        aVar.r(b700Var3, false);
                    } else {
                        aVar.r(new b700(i2, bool, mu10Var, ps10Var), bool.booleanValue());
                    }
                    final ServerMessageRef serverMessageRef6 = ru10Var.i;
                    if (serverMessageRef6 != null) {
                        a.q(aVar, e9h0.message_reply_in_thread, wwg0.msg_ic_thread, new sls() { // from class: gu10
                            @Override // defpackage.sls
                            public final Object invoke() {
                                String str3;
                                int i62 = i2;
                                zy11 zy11Var = zy11.a;
                                ServerMessageRef serverMessageRef22 = serverMessageRef6;
                                ps10 ps10Var2 = ps10Var;
                                mu10 mu10Var2 = mu10Var;
                                switch (i62) {
                                    case 0:
                                        mu10Var2.i.a(MessageMenuReporter$Item.THREAD_SHOW);
                                        ps10Var2.v(serverMessageRef22);
                                        break;
                                    case 1:
                                        mu10Var2.i.a(MessageMenuReporter$Item.REPLY);
                                        nu10 nu10Var = ps10Var2.F;
                                        if (nu10Var != null && (str3 = nu10Var.h) != null) {
                                            ps10Var2.o.a(str3, serverMessageRef22, d620.d);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        mu10Var2.i.a(MessageMenuReporter$Item.THREAD_REPLY);
                                        ps10Var2.z.a.c("menu thread reply tapped", "thread id", ChatId.Companion.a(serverMessageRef22.getRequiredChatId()).b(serverMessageRef22.getTimestamp()).a);
                                        sfl0.a(ps10Var2.u, new q6b(c720.d, nob1.b(serverMessageRef22), null, null, null, 1966076), 6);
                                        break;
                                    case 3:
                                        mu10Var2.i.a(MessageMenuReporter$Item.PIN);
                                        qu10 qu10Var = ps10Var2.s;
                                        b00 b00Var = qu10Var.c;
                                        ((Handler) b00Var.a.get()).post(new lz(3, b00Var, qu10Var.b, serverMessageRef22));
                                        break;
                                    case 4:
                                        mu10Var2.i.a(MessageMenuReporter$Item.FORWARD);
                                        c620 c620Var = c620.d;
                                        sfl0 sfl0Var = ps10Var2.u;
                                        SendAction sendAction = SendAction.NO_ACTION;
                                        Collections.singletonList(serverMessageRef22);
                                        sfl0Var.getClass();
                                        new cqr0(c620Var);
                                        break;
                                    case 5:
                                        mu10Var2.i.a(MessageMenuReporter$Item.EDIT);
                                        ps10Var2.m.a(serverMessageRef22);
                                        break;
                                    default:
                                        mu10Var2.i.a(MessageMenuReporter$Item.DELETE);
                                        ps10Var2.d.a(1, new p500(20, mu10Var2.c, serverMessageRef22), new d82(1));
                                        break;
                                }
                                return zy11Var;
                            }
                        }, 0, null, 120);
                    } else {
                        a.q(aVar, e9h0.message_reply_in_thread, wwg0.msg_ic_thread, b700Var3, 0, null, 120);
                    }
                    final ServerMessageRef serverMessageRef7 = ru10Var.h;
                    if (serverMessageRef7 != null) {
                        a.q(aVar, e9h0.message_show_thread, wwg0.msg_ic_thread, new sls() { // from class: gu10
                            @Override // defpackage.sls
                            public final Object invoke() {
                                String str3;
                                int i62 = i4;
                                zy11 zy11Var = zy11.a;
                                ServerMessageRef serverMessageRef22 = serverMessageRef7;
                                ps10 ps10Var2 = ps10Var;
                                mu10 mu10Var2 = mu10Var;
                                switch (i62) {
                                    case 0:
                                        mu10Var2.i.a(MessageMenuReporter$Item.THREAD_SHOW);
                                        ps10Var2.v(serverMessageRef22);
                                        break;
                                    case 1:
                                        mu10Var2.i.a(MessageMenuReporter$Item.REPLY);
                                        nu10 nu10Var = ps10Var2.F;
                                        if (nu10Var != null && (str3 = nu10Var.h) != null) {
                                            ps10Var2.o.a(str3, serverMessageRef22, d620.d);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        mu10Var2.i.a(MessageMenuReporter$Item.THREAD_REPLY);
                                        ps10Var2.z.a.c("menu thread reply tapped", "thread id", ChatId.Companion.a(serverMessageRef22.getRequiredChatId()).b(serverMessageRef22.getTimestamp()).a);
                                        sfl0.a(ps10Var2.u, new q6b(c720.d, nob1.b(serverMessageRef22), null, null, null, 1966076), 6);
                                        break;
                                    case 3:
                                        mu10Var2.i.a(MessageMenuReporter$Item.PIN);
                                        qu10 qu10Var = ps10Var2.s;
                                        b00 b00Var = qu10Var.c;
                                        ((Handler) b00Var.a.get()).post(new lz(3, b00Var, qu10Var.b, serverMessageRef22));
                                        break;
                                    case 4:
                                        mu10Var2.i.a(MessageMenuReporter$Item.FORWARD);
                                        c620 c620Var = c620.d;
                                        sfl0 sfl0Var = ps10Var2.u;
                                        SendAction sendAction = SendAction.NO_ACTION;
                                        Collections.singletonList(serverMessageRef22);
                                        sfl0Var.getClass();
                                        new cqr0(c620Var);
                                        break;
                                    case 5:
                                        mu10Var2.i.a(MessageMenuReporter$Item.EDIT);
                                        ps10Var2.m.a(serverMessageRef22);
                                        break;
                                    default:
                                        mu10Var2.i.a(MessageMenuReporter$Item.DELETE);
                                        ps10Var2.d.a(1, new p500(20, mu10Var2.c, serverMessageRef22), new d82(1));
                                        break;
                                }
                                return zy11Var;
                            }
                        }, 0, null, 120);
                    } else {
                        a.q(aVar, e9h0.message_show_thread, wwg0.msg_ic_thread, b700Var3, 0, null, 120);
                    }
                    final ServerMessageRef serverMessageRef8 = ru10Var.f;
                    boolean z4 = ru10Var.u;
                    if (serverMessageRef8 == null || !z4) {
                        a.q(aVar, e9h0.message_added_to_saved_messages, wwg0.msg_ic_add_to_saved, b700Var3, 0, null, 120);
                    } else {
                        a.q(aVar, e9h0.message_added_to_saved_messages, wwg0.msg_ic_add_to_saved, new sls() { // from class: hu10
                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i8 = r3;
                                zy11 zy11Var = zy11.a;
                                ps10 ps10Var2 = ps10Var;
                                switch (i8) {
                                    case 0:
                                        qu10 qu10Var = ps10Var2.s;
                                        b00 b00Var = qu10Var.c;
                                        ChatRequest chatRequest = qu10Var.b;
                                        a620 a620Var = a620.d;
                                        WeakReference weakReference = new WeakReference(new k200(23, qu10Var));
                                        ((Handler) b00Var.a.get()).post(new vz(b00Var, chatRequest, weakReference, serverMessageRef8, a620Var, 0));
                                        ps10Var2.u.getClass();
                                        break;
                                    default:
                                        ForwardMessageRef forwardMessageRef = new ForwardMessageRef();
                                        ServerMessageRef serverMessageRef9 = serverMessageRef8;
                                        forwardMessageRef.chatId = serverMessageRef9.getRequiredChatId();
                                        forwardMessageRef.timestamp = serverMessageRef9.getTimestamp();
                                        g gVar = ps10Var2.A;
                                        ForwardMessageRef[] forwardMessageRefArr = {forwardMessageRef};
                                        gVar.getClass();
                                        tje.e();
                                        w7b w7bVar = gVar.c;
                                        g720 g720Var = gVar.b.a;
                                        CustomPayload b = gVar.b(null);
                                        w7bVar.b.getClass();
                                        yw80 d = ax80.d(null, false, null, forwardMessageRefArr, g720Var, false, false, b, null, null);
                                        if (d != null) {
                                            b00 b00Var2 = w7bVar.c;
                                            b00Var2.getClass();
                                            b00Var2.c(SavedMessages.INSTANCE, d);
                                        }
                                        Toast.makeText(ps10Var2.a, oyh0.toast_message_add_to_saved, 0).show();
                                        break;
                                }
                                return zy11Var;
                            }
                        }, 0, null, 120);
                    }
                    ServerMessageRef serverMessageRef9 = ru10Var.b;
                    int i8 = ru10Var.c;
                    TextView textView = aVar.F;
                    if (i8 == 0 || serverMessageRef9 == null) {
                        textView.setVisibility(8);
                        aVar.w();
                    } else {
                        a.q(aVar, e9h0.message_reactions, wwg0.msg_ic_reactions_heart, new p61(aVar, serverMessageRef9, i8, r3), 0, Integer.valueOf(wwg0.msg_ic_arrow_end), 40);
                        textView.setText(aVar.a.getResources().getQuantityString(ewh0.menu_reactions, i8, Integer.valueOf(i8)));
                    }
                    lv10 lv10Var = ru10Var.x;
                    lqo lqoVar = mu10Var.k;
                    mdb mdbVar = mu10Var.j;
                    r96 r96Var = tz10.G;
                    if (lqoVar.a(r96Var)) {
                        final ServerMessageRef serverMessageRef10 = lv10Var.a;
                        if (!lv10Var.b) {
                            mdbVar.getClass();
                        }
                        if (serverMessageRef10 != null) {
                            a.q(aVar, e9h0.message_mark_unread, wwg0.msg_ic_unread, new sls() { // from class: hu10
                                @Override // defpackage.sls
                                public final Object invoke() {
                                    int i82 = i4;
                                    zy11 zy11Var = zy11.a;
                                    ps10 ps10Var2 = ps10Var;
                                    switch (i82) {
                                        case 0:
                                            qu10 qu10Var = ps10Var2.s;
                                            b00 b00Var = qu10Var.c;
                                            ChatRequest chatRequest = qu10Var.b;
                                            a620 a620Var = a620.d;
                                            WeakReference weakReference = new WeakReference(new k200(23, qu10Var));
                                            ((Handler) b00Var.a.get()).post(new vz(b00Var, chatRequest, weakReference, serverMessageRef10, a620Var, 0));
                                            ps10Var2.u.getClass();
                                            break;
                                        default:
                                            ForwardMessageRef forwardMessageRef = new ForwardMessageRef();
                                            ServerMessageRef serverMessageRef92 = serverMessageRef10;
                                            forwardMessageRef.chatId = serverMessageRef92.getRequiredChatId();
                                            forwardMessageRef.timestamp = serverMessageRef92.getTimestamp();
                                            g gVar = ps10Var2.A;
                                            ForwardMessageRef[] forwardMessageRefArr = {forwardMessageRef};
                                            gVar.getClass();
                                            tje.e();
                                            w7b w7bVar = gVar.c;
                                            g720 g720Var = gVar.b.a;
                                            CustomPayload b = gVar.b(null);
                                            w7bVar.b.getClass();
                                            yw80 d = ax80.d(null, false, null, forwardMessageRefArr, g720Var, false, false, b, null, null);
                                            if (d != null) {
                                                b00 b00Var2 = w7bVar.c;
                                                b00Var2.getClass();
                                                b00Var2.c(SavedMessages.INSTANCE, d);
                                            }
                                            Toast.makeText(ps10Var2.a, oyh0.toast_message_add_to_saved, 0).show();
                                            break;
                                    }
                                    return zy11Var;
                                }
                            }, 0, null, 120);
                            b700Var4 = b700Var3;
                        } else {
                            b700Var4 = b700Var3;
                            a.q(aVar, e9h0.message_mark_unread, wwg0.msg_ic_unread, b700Var4, 0, null, 120);
                        }
                    } else {
                        b700Var4 = b700Var3;
                        a.q(aVar, e9h0.message_mark_unread, wwg0.msg_ic_unread, b700Var4, 0, null, 120);
                    }
                    lv10 lv10Var2 = ru10Var.x;
                    if (mu10Var.k.a(r96Var)) {
                        if (lv10Var2.c) {
                            mdbVar.getClass();
                        }
                        a.q(aVar, e9h0.thread_mark_read, wwg0.msg_ic_mark_read, b700Var4, 0, null, 120);
                        break;
                    } else {
                        a.q(aVar, e9h0.thread_mark_read, wwg0.msg_ic_mark_read, b700Var4, 0, null, 120);
                        break;
                    }
                }
                break;
            case 7:
                e9e e9eVar = (e9e) obj2;
                in21 in21Var = (in21) ((oyj0) obj).b();
                if (in21Var != null) {
                    e9eVar.accept(in21Var);
                    break;
                }
                break;
            case 8:
                o9x o9xVar = (o9x) obj2;
                j3b j3bVar = (j3b) obj;
                mp11 mp11Var = o9xVar.z;
                Button button = o9xVar.c;
                h9x h9xVar = o9xVar.w;
                h9xVar.getClass();
                boolean z5 = j3bVar.r;
                boolean z6 = j3bVar.l;
                h9xVar.z = !z5;
                Boolean bool2 = o9xVar.C;
                if (bool2 == null) {
                    o9xVar.C = Boolean.valueOf(z6);
                    if (!z6) {
                        button.setEnabled(true);
                        button.setTypeface(mp11Var.b());
                        button.setText(oyh0.chat_site_comments_join_suggest_button_enabled);
                        o9xVar.a.setVisibility(0);
                        break;
                    }
                } else if (!bool2.booleanValue() && z6) {
                    o9xVar.C = Boolean.TRUE;
                    button.setEnabled(false);
                    button.setTypeface(mp11Var.getLight());
                    button.setText(oyh0.chat_site_comments_join_suggest_button_disabled);
                    o9xVar.A.postDelayed(o9xVar.B, 2000L);
                    break;
                }
                break;
            case 9:
                eu10 eu10Var = (eu10) obj2;
                String title = ((GetUrlPreviewResponse) obj).getTitle();
                if (title != null) {
                    a aVar3 = eu10Var.a;
                    aVar3.B = title;
                    TextView textView2 = aVar3.I;
                    textView2.setVisibility(0);
                    textView2.setText(title);
                    aVar3.s(null);
                    break;
                }
                break;
            case 10:
                ((lu10) obj2).a.set(((Long) obj).longValue());
                break;
            case 11:
                ((pbj) obj2).A = (j3b) obj;
                break;
            case 12:
                jn31 jn31Var = (jn31) obj2;
                jn31Var.a.a.O(new l52(i3, jn31Var, (in31) obj));
                break;
            case 13:
                ((androidx.camera.video.g) obj2).L = (Uri) obj;
                break;
            case 14:
                ixj0 ixj0Var = (ixj0) obj2;
                ((Handler) ixj0Var.z.z).post(new hxj0(i4, ixj0Var));
                break;
            case 15:
                blt0 blt0Var = (blt0) obj2;
                String str3 = (String) obj;
                blt0Var.z = str3;
                blt0Var.a.b.setVisibility((str3 == null ? 0 : 1) != 0 ? 0 : 8);
                break;
            case 16:
                xnw0 xnw0Var = (xnw0) obj;
                for (Map.Entry entry : ((Map) obj2).entrySet()) {
                    int c = ((w84) xnw0Var).b - ((zr80) entry.getKey()).c();
                    if (((zr80) entry.getKey()).g()) {
                        c = -c;
                    }
                    int k = lw01.k(c);
                    enw0 enw0Var = (enw0) entry.getValue();
                    enw0Var.getClass();
                    tob1.g(new yp7(enw0Var, k, -1, i2));
                }
                break;
            case 17:
                ((b) obj2).b((wnw0) obj);
                break;
            case 18:
                k kVar = (k) obj2;
                wnw0 wnw0Var = (wnw0) obj;
                ((v84) wnw0Var).b.hashCode();
                sgb1.g(3, "VideoEncoderSession");
                Surface surface = ((v84) wnw0Var).b;
                if (surface == kVar.e) {
                    kVar.e = null;
                    kVar.m.b(kVar.d);
                    kVar.a();
                    break;
                } else {
                    surface.release();
                    break;
                }
            default:
                ((x6f0) ((y6f0) obj2)).d((v751) obj);
                break;
        }
    }
}
