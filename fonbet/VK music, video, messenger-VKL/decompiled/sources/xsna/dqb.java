package xsna;

import com.ironsource.C4217a2;
import com.vk.im.engine.models.dialogs.ChatPermissions;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.ui.components.chat_controls.ChatControls;
import com.vk.im.ui.components.common.NotifyId;
import java.util.ArrayList;

/* compiled from: ChatControlsAndTitleHelper.kt */
/* loaded from: classes2.dex */
public final class dqb {
    public final gzs<DialogExt> a;
    public final lzv b;
    public final j8i c;
    public final String d;
    public final io.reactivex.rxjava3.disposables.b e = new io.reactivex.rxjava3.disposables.b();
    public io.reactivex.rxjava3.disposables.c f;
    public io.reactivex.rxjava3.disposables.c g;

    /* compiled from: ChatControlsAndTitleHelper.kt */
    public interface a {
        void W();

        void e0();

        void g0();

        void i(NotifyId notifyId);

        void i0(Throwable th);

        void k();

        void m();

        void w();

        void w0(Throwable th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dqb(gzs<DialogExt> gzsVar, lzv lzvVar, a aVar, String str) {
        this.a = gzsVar;
        this.b = lzvVar;
        this.c = (j8i) aVar;
        this.d = str;
    }

    public final boolean a(ChatControls chatControls) {
        ChatSettings Hb;
        ChatPermissions chatPermissions;
        ChatPermissions chatPermissions2;
        Dialog Cb = this.a.invoke().Cb();
        if (Cb == null || (Hb = Cb.Hb()) == null) {
            return false;
        }
        ChatPermissions chatPermissions3 = Hb.B;
        ChatPermissions q = kq01.q(chatControls);
        if (chatPermissions3 != null) {
            String str = q.i;
            String str2 = q.h;
            String str3 = q.g;
            String str4 = q.f;
            String str5 = q.e;
            String str6 = q.d;
            String str7 = q.c;
            String str8 = q.b;
            if (chatPermissions3.equals(q)) {
                chatPermissions2 = null;
            } else {
                chatPermissions2 = new ChatPermissions(!epx.f(chatPermissions3.b, str8) ? str8 : null, !epx.f(chatPermissions3.c, str7) ? str7 : null, !epx.f(chatPermissions3.d, str6) ? str6 : null, !epx.f(chatPermissions3.e, str5) ? str5 : null, !epx.f(chatPermissions3.f, str4) ? str4 : null, !epx.f(chatPermissions3.g, str3) ? str3 : null, !epx.f(chatPermissions3.h, str2) ? str2 : null, !epx.f(chatPermissions3.i, str) ? str : null);
            }
            chatPermissions = chatPermissions2;
        } else {
            chatPermissions = null;
        }
        ChatControls p = kq01.p(Hb);
        Boolean bool = !epx.f(p.j, chatControls.j) ? chatControls.j : null;
        Boolean valueOf = !epx.f(p.k, chatControls.k) ? Boolean.valueOf(epx.f(chatControls.k, C4217a2.e)) : null;
        Boolean valueOf2 = !epx.f(p.l, chatControls.l) ? Boolean.valueOf(epx.f(chatControls.l, C4217a2.e)) : null;
        Boolean valueOf3 = epx.f(p.m, chatControls.m) ? null : Boolean.valueOf(epx.f(chatControls.m, "enabled"));
        if (((ArrayList) rl3.I(new Object[]{chatPermissions, bool, valueOf, valueOf2, valueOf3})).isEmpty()) {
            return false;
        }
        io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(this.b.b(this, new vcm(Cb.Zb(), chatPermissions, bool, valueOf, valueOf2, valueOf3)).m(io.reactivex.rxjava3.android.schedulers.a.b()), new az(new a8(this, 18), 12)), new zwa(this, 1)).subscribe(new io1(new ul1(this, 19), 14), new gn0(new qu(this, 17), 9));
        this.e.b(subscribe);
        this.g = subscribe;
        return true;
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [xsna.dqb$a, xsna.j8i] */
    public final boolean b(String str) {
        gzs<DialogExt> gzsVar = this.a;
        Dialog Cb = gzsVar.invoke().Cb();
        if (Cb != null && !hg1.d(this.f)) {
            if (drm0.N(str)) {
                this.c.i(NotifyId.CHAT_CHANGE_TITLE_EMPTY);
                return false;
            }
            ChatSettings Hb = Cb.Hb();
            if (!epx.f(Hb != null ? Hb.b : null, str)) {
                io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(this.b.b(this, new wlm(gzsVar.invoke().f, str, this.d)).m(io.reactivex.rxjava3.android.schedulers.a.b()), new bg1(new lb(this, 19), 11)), new g30(this, 2)).subscribe(new ov2(new zt4(this, 9), 8), new pv2(new hb(this, 22), 7));
                this.e.b(subscribe);
                this.f = subscribe;
                return true;
            }
        }
        return false;
    }
}
