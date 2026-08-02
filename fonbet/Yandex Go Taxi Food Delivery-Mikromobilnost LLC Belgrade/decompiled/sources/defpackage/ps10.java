package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.widget.ImageView;
import com.yandex.alicekit.core.permissions.b;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.activity.MessengerRequestCode;
import com.yandex.messaging.activity.calls.MessengerCallFeedbackArguments;
import com.yandex.messaging.input.g;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.internal.PrivateChat;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.ThreadChat;
import com.yandex.messaging.internal.entities.ChatId;
import com.yandex.messaging.internal.entities.ChatNamespaces;
import com.yandex.messaging.internal.view.chat.input.InputTextController;
import com.yandex.messaging.internal.view.input.c;
import com.yandex.messaging.internal.view.messagemenu.MessageMenuDialog;
import com.yandex.messaging.internal.view.timeline.g0;
import com.yandex.messaging.internal.view.timeline.i;
import com.yandex.messaging.mediaviewer.MediaViewerMessageActions;
import com.yandex.messaging.telemost.ui.StartPersonalMeetingMenuDialog;
import com.yandex.messaging.ui.imageviewer.ImageViewerArgs$Sender;
import com.yandex.messaging.ui.imageviewer.ImageViewerInfo;
import com.yandex.messaging.ui.imageviewer.ImageViewerMessageActions;
import com.yandex.messaging.video.UrlVideoPlayerArgs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes15.dex */
public final class ps10 implements jcz0 {
    public final g A;
    public final ezq B;
    public final h3y C;
    public final ulg0 D;
    public final tlg0 E;
    public nu10 F;
    public final os10 G = new os10(this);
    public final Activity a;
    public final ChatRequest b;
    public final mu10 c;
    public final xs10 d;
    public final g0 e;
    public final h3y f;
    public final odz0 g;
    public final h3y h;
    public final j0x i;
    public final k0b j;
    public final zbu0 k;
    public final b l;
    public final ryv m;
    public final InputTextController n;
    public final m0w o;
    public final q0r p;
    public final b00 q;
    public final h3y r;
    public final qu10 s;
    public final mdb t;
    public final sfl0 u;
    public final e2k0 v;
    public final b40 w;
    public final dbb x;
    public final zm31 y;
    public final com.yandex.messaging.ui.timeline.b z;

    public ps10(Activity activity, ChatRequest chatRequest, mu10 mu10Var, xs10 xs10Var, g0 g0Var, h3y h3yVar, odz0 odz0Var, h3y h3yVar2, j0x j0xVar, k0b k0bVar, zbu0 zbu0Var, b bVar, ryv ryvVar, InputTextController inputTextController, m0w m0wVar, q0r q0rVar, b00 b00Var, h3y h3yVar3, qu10 qu10Var, mdb mdbVar, sfl0 sfl0Var, e2k0 e2k0Var, b40 b40Var, dbb dbbVar, zm31 zm31Var, com.yandex.messaging.ui.timeline.b bVar2, g gVar, ezq ezqVar, h3y h3yVar4, ulg0 ulg0Var, tlg0 tlg0Var) {
        this.a = activity;
        this.b = chatRequest;
        this.c = mu10Var;
        this.d = xs10Var;
        this.e = g0Var;
        this.f = h3yVar;
        this.g = odz0Var;
        this.h = h3yVar2;
        this.i = j0xVar;
        this.j = k0bVar;
        this.k = zbu0Var;
        this.l = bVar;
        this.m = ryvVar;
        this.n = inputTextController;
        this.o = m0wVar;
        this.p = q0rVar;
        this.q = b00Var;
        this.r = h3yVar3;
        this.s = qu10Var;
        this.t = mdbVar;
        this.u = sfl0Var;
        this.v = e2k0Var;
        this.w = b40Var;
        this.x = dbbVar;
        this.y = zm31Var;
        this.z = bVar2;
        this.A = gVar;
        this.B = ezqVar;
        this.C = h3yVar4;
        this.D = ulg0Var;
        this.E = tlg0Var;
    }

    public static void D(k0b k0bVar, String str, String str2) {
        if (str2 != null) {
            String str3 = null;
            if (str != null && !evu0.J(str)) {
                str3 = str;
            }
            if (str3 != null) {
                k0bVar.getClass();
                tje.e();
                b00 b00Var = k0bVar.a;
                ((Handler) b00Var.a.get()).post(new tz(b00Var, k0bVar.b, str, str2, 0));
            }
        }
    }

    @Override // defpackage.jcz0
    public final void A(o4v0 o4v0Var) {
        String str = o4v0Var.b.url;
        if (str != null) {
            ((b0x) this.u).b(str);
            return;
        }
        String str2 = o4v0Var.d;
        Map map = o4v0Var.e;
        String str3 = o4v0Var.f;
        g gVar = this.g.a;
        gVar.getClass();
        tje.e();
        g.d(gVar, str2, false, null, null, false, map, str3, false, null, null, 926);
    }

    @Override // defpackage.jcz0
    public final void B(long j, String str) {
        this.x.a("timeline reply");
        ((i) ((ucz0) this.h.get())).u(j, str);
    }

    @Override // defpackage.jcz0
    public final void C(Uri uri) {
        this.v.getClass();
        this.i.a(uri);
    }

    public final MediaViewerMessageActions E() {
        return new MediaViewerMessageActions(true, this.t.c, true, true, false, 16, null);
    }

    @Override // defpackage.jcz0
    public final void a(long j, String str, String str2, String str3) {
        if (str.equals(str2)) {
            this.x.a("timeline reply");
            ((i) ((ucz0) this.h.get())).u(j, null);
            return;
        }
        boolean b = ChatNamespaces.b(str2);
        sfl0 sfl0Var = this.u;
        if (b) {
            sfl0.a(sfl0Var, new q6b(c620.d, p8b.a(str2), new ServerMessageRef(str2, j), null, null, 2097132), 6);
        } else {
            new bae(p420.d, str, str3);
            ((b0x) sfl0Var).c();
        }
    }

    @Override // defpackage.jcz0
    public final void b(ServerMessageRef serverMessageRef) {
        sfl0.a(this.u, new q6b(b720.d, p8b.a(serverMessageRef.getRequiredChatId()), serverMessageRef, null, null, 2097132), 4);
    }

    @Override // defpackage.jcz0
    public final void c() {
        ((StartPersonalMeetingMenuDialog) this.r.get()).show();
    }

    @Override // defpackage.jcz0
    public final void d(ImageView imageView, String str, ImageViewerInfo imageViewerInfo, nu10 nu10Var) {
        this.F = nu10Var;
        if (!nu10Var.l) {
            new ImageViewerMessageActions(true, this.t.c, true, true, false, false, 48, null);
        }
        new ArrayList(Collections.singletonList(imageViewerInfo));
        ImageViewerArgs$Sender imageViewerArgs$Sender = ImageViewerArgs$Sender.Chat;
        c720 c720Var = c720.d;
        MessengerRequestCode messengerRequestCode = MessengerRequestCode.CAMERA;
        this.u.getClass();
    }

    @Override // defpackage.jcz0
    public final void e(String str) {
        g gVar = this.g.a;
        gVar.getClass();
        tje.e();
        c cVar = gVar.k;
        g.d(gVar, str, false, null, null, ((uqq0) cVar.f.a.getValue()).a, null, null, ((uqq0) cVar.f.a.getValue()).b, null, null, 864);
    }

    @Override // defpackage.jcz0
    public final void f(long j, String str, String str2) {
        c720 c720Var = c720.d;
        UrlVideoPlayerArgs urlVideoPlayerArgs = new UrlVideoPlayerArgs(Uri.parse(str), str2, j);
        this.y.getClass();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(urlVideoPlayerArgs.getVideoUri());
        this.a.startActivity(intent);
    }

    @Override // defpackage.jcz0
    public final void g(LocalMessageRef localMessageRef, j3b j3bVar, y2r y2rVar, nu10 nu10Var) {
        String str;
        String str2 = y2rVar.a;
        if (str2 == null || (str = y2rVar.b) == null) {
            return;
        }
        this.F = nu10Var;
        ezq.a(this.B, localMessageRef, j3bVar, str2, str, y2rVar.c, y2rVar.d, nu10Var.l ? new MediaViewerMessageActions(false, false, false, false, false) : E(), new ns10(this, str2, str, 1));
    }

    @Override // defpackage.jcz0
    public final void h(String str) {
        this.n.appendText(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jcz0
    public final void i(String str, String str2) {
        s520 s520Var = s520.d;
        String str3 = null;
        PrivateChat privateChat = new PrivateChat(str2, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
        try {
            str3 = Uri.parse(str).getQueryParameter("context");
        } catch (Exception unused) {
        }
        sfl0.a(this.u, new q6b(s520Var, privateChat, null, str3, null, 2031612), 6);
    }

    @Override // defpackage.jcz0
    public final void j(String str) {
        new e0u0(e620.d, str);
        this.u.getClass();
    }

    @Override // defpackage.jcz0
    public final void k(LocalMessageRef localMessageRef, j3b j3bVar, y2r y2rVar, nu10 nu10Var) {
        String str;
        String str2 = y2rVar.a;
        if (str2 == null || (str = y2rVar.b) == null) {
            return;
        }
        this.F = nu10Var;
        ezq.a(this.B, localMessageRef, j3bVar, str2, str, y2rVar.c, y2rVar.d, nu10Var.l ? new MediaViewerMessageActions(false, false, false, false, false) : E(), new ns10(this, str2, str, 0));
    }

    @Override // defpackage.jcz0
    public final void l(LocalMessageRef localMessageRef, j3b j3bVar, y2r y2rVar, nu10 nu10Var, f02 f02Var) {
        String str;
        String str2 = y2rVar.a;
        if (str2 == null || (str = y2rVar.b) == null) {
            return;
        }
        this.F = nu10Var;
        ezq.a(this.B, localMessageRef, j3bVar, str2, str, y2rVar.c, y2rVar.d, nu10Var.l ? new MediaViewerMessageActions(false, false, false, false, false) : E(), new jo0(f02Var, this, str2, str, 22));
    }

    @Override // defpackage.jcz0
    public final void m(String str, int i, boolean z, boolean z2) {
        com.yandex.messaging.ui.timeline.b bVar = this.z;
        bVar.getClass();
        bVar.a.h("thread bubble tapped", "thread id", str, "count", Integer.valueOf(i), "type", z ? "mention" : z2 ? "dot" : "empty");
        sfl0.a(this.u, new q6b(c720.d, new ThreadChat(str), null, null, null, 2097148), 6);
    }

    @Override // defpackage.jcz0
    public final void n(String str) {
        new bae(t520.d, null, str);
        ((b0x) this.u).c();
    }

    @Override // defpackage.jcz0
    public final void o(String str, String str2, ServerMessageRef serverMessageRef, String str3) {
        String requiredChatId = serverMessageRef.getRequiredChatId();
        String str4 = null;
        if (str3.equals(requiredChatId)) {
            ((i) ((ucz0) this.h.get())).u(serverMessageRef.getTimestamp(), null);
        } else {
            t520 t520Var = t520.d;
            ChatRequest b = p8b.b(requiredChatId, str2);
            try {
                str4 = Uri.parse(str).getQueryParameter("context");
            } catch (Exception unused) {
            }
            sfl0.a(this.u, new q6b(t520Var, b, serverMessageRef, str4, null, 2031596), 6);
        }
    }

    @Override // defpackage.jcz0
    public final void p(String str) {
        this.k.a(str, null);
    }

    @Override // defpackage.jcz0
    public final void q(ImageView imageView, String str, ImageViewerInfo imageViewerInfo, ArrayList arrayList, nu10 nu10Var) {
        this.F = nu10Var;
        if (!nu10Var.l) {
            new ImageViewerMessageActions(true, this.t.c, true, true, false, false, 48, null);
        }
        c720 c720Var = c720.d;
        new ArrayList(arrayList);
        ImageViewerArgs$Sender imageViewerArgs$Sender = ImageViewerArgs$Sender.Chat;
        MessengerRequestCode messengerRequestCode = MessengerRequestCode.CAMERA;
        this.u.getClass();
    }

    @Override // defpackage.jcz0
    public final void r(String str, ServerMessageRef serverMessageRef) {
        if (this.E.c) {
            r620 r620Var = r620.d;
            ulg0 ulg0Var = this.D;
            ulg0Var.b = str;
            ulg0Var.c = r620Var;
            tbb tbbVar = ulg0Var.d;
            if (tbbVar != null) {
                tbbVar.invoke(serverMessageRef, Boolean.FALSE);
            }
        }
    }

    @Override // defpackage.jcz0
    public final void s(nu10 nu10Var) {
        LocalMessageRef localMessageRef = nu10Var.c;
        if (localMessageRef == null) {
            return;
        }
        g0 g0Var = this.e;
        g0Var.getClass();
        tje.e();
        b00 b00Var = g0Var.a;
        ((Handler) b00Var.a.get()).post(new mz(b00Var, g0Var.b, localMessageRef, 2));
    }

    @Override // defpackage.jcz0
    public final void t(ChatRequest chatRequest, Long l, String str, int i, boolean z) {
        new MessengerCallFeedbackArguments(chatRequest, l, null, true, str, Integer.valueOf(i), Boolean.valueOf(z));
        this.u.getClass();
    }

    @Override // defpackage.jcz0
    public final void u(String str) {
        this.d.a(1, new p500(21, this, str), new d82(1));
    }

    @Override // defpackage.jcz0
    public final void v(ServerMessageRef serverMessageRef) {
        x22 x22Var = this.z.a;
        String requiredChatId = serverMessageRef.getRequiredChatId();
        x22Var.c("menu thread reply tapped", "thread id", ChatId.Companion.a(requiredChatId).b(serverMessageRef.getTimestamp()).a);
        sfl0.a(this.u, new q6b(c720.d, nob1.b(serverMessageRef), null, null, null, 2097148), 6);
    }

    @Override // defpackage.jcz0
    public final void w(LocalMessageRef localMessageRef) {
        this.q.b(this.b, localMessageRef);
    }

    @Override // defpackage.jcz0
    public final void x(nu10 nu10Var, CharSequence charSequence, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, j3b j3bVar, y2r y2rVar, boolean z6, boolean z7) {
        this.F = nu10Var;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (charSequence != null) {
            spannableStringBuilder.append(charSequence);
        }
        LocalMessageRef localMessageRef = nu10Var.c;
        mu10 mu10Var = this.c;
        mu10Var.getClass();
        lu10 lu10Var = new lu10(mu10Var, spannableStringBuilder, z4, z5, z6, z, z2, z3, z7, localMessageRef, this, j3bVar, y2rVar, nu10Var);
        k8g k8gVar = mu10Var.h;
        k8gVar.getClass();
        z8g z8gVar = k8gVar.a;
        p8g p8gVar = k8gVar.b;
        d8g d8gVar = k8gVar.c;
        h8g h8gVar = k8gVar.d;
        bu0 bu0Var = new bu0();
        bu0Var.e = bu0Var;
        bu0Var.a = z8gVar;
        bu0Var.b = p8gVar;
        bu0Var.c = d8gVar;
        bu0Var.d = h8gVar;
        v8c0 v8c0Var = h8gVar.h;
        xvf0 xvf0Var = p8gVar.C;
        xvf0 xvf0Var2 = p8gVar.t0;
        xvf0 xvf0Var3 = p8gVar.D2;
        bu0Var.f = new hs30(v8c0Var, xvf0Var, xvf0Var2, xvf0Var3, 24);
        bu0Var.g = new s3f0(p8gVar.j0, p8gVar.f0, xvf0Var3, 4);
        bu0Var.h = new m580(d8gVar.e, (hs30) bu0Var.f, (s3f0) bu0Var.g, new vu(h8gVar.h, p8gVar.C, n3w.b(localMessageRef), 21), h8gVar.E, wai0.a, p8gVar.D2, p8gVar.T1, p8gVar.g3);
        n3w a = n3w.a(lu10Var);
        n3w n3wVar = d8gVar.e;
        bu0Var.i = new e3u((xvf0) n3wVar, (xvf0) new o08(n3wVar, (m580) bu0Var.h, p8gVar.t0, h8gVar.h, h8gVar.B0, a, p8gVar.D2, 2), (xvf0) new cta0(n3wVar, new faj(n3wVar, 2), new ywf(13, bu0Var), h8gVar.w, new jde0(n3wVar, 10)), 27, false);
        ((MessageMenuDialog) i5m.a((e3u) bu0Var.i).get()).show();
        su10 su10Var = mu10Var.i;
        su10Var.a.c("menu_opened", "chat_id", mu10Var.e.uniqueRequestId());
    }

    @Override // defpackage.jcz0
    public final void y(String str, String str2, String str3) {
        new bae(t520.d, str3, str2);
        ((b0x) this.u).c();
    }

    @Override // defpackage.jcz0
    public final void z(String str, String str2, String str3) {
        String str4;
        boolean z = ((q9x) this.C.get()).c;
        sfl0 sfl0Var = this.u;
        if (z) {
            new p9x(s520.d, str2, str3, str, null);
            sfl0Var.getClass();
            return;
        }
        s520 s520Var = s520.d;
        ChatRequest b = p8b.b(str2, str3);
        try {
            str4 = Uri.parse(str).getQueryParameter("context");
        } catch (Exception unused) {
            str4 = null;
        }
        sfl0.a(sfl0Var, new q6b(s520Var, b, null, str4, null, 2031612), 6);
    }
}
