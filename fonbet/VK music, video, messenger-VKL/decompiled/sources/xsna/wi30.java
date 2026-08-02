package xsna;

import android.content.Context;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.Source;
import com.vk.im.ui.fragments.DialogsFragment;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.pushes.notifications.im.MessageNotificationContainer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.wh70;

/* compiled from: MsgFailedHandler.kt */
/* loaded from: classes7.dex */
public final class wi30 {
    public final b25 a;
    public final BuildInfo.Client b;
    public final yk70 c;
    public final fv30 d = new fv30(Source.ACTUAL);
    public final ExecutorService e;
    public final io.reactivex.rxjava3.core.w f;
    public volatile boolean g;

    public wi30(b25 b25Var, BuildInfo.Client client, yk70 yk70Var) {
        this.a = b25Var;
        this.b = client;
        this.c = yk70Var;
        asu0.a.getClass();
        this.e = asu0.s();
        this.f = asu0.t();
    }

    public final MessageNotificationContainer a(uk70 uk70Var) {
        String str;
        String str2 = uk70Var.d;
        long j = uk70Var.b;
        String str3 = uk70Var.e;
        long j2 = uk70Var.f;
        boolean z = uk70Var.p;
        if (z) {
            str = "msg_error";
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            switch (wh70.a.$EnumSwitchMapping$0[this.b.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    str = "message_24";
                    break;
                case 11:
                    str = "message_calls_24";
                    break;
                case 12:
                    str = "message_vkme_24";
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        String a = defpackage.k0.a(j, "vk://chat?peer=");
        String str4 = str;
        String str5 = uk70Var.g;
        Long valueOf = Long.valueOf(uk70Var.a);
        cn o = this.a.o();
        if (!fkq0.c(o.a)) {
            o = null;
        }
        return com.vk.pushes.notifications.im.a.a(str2, str3, j2, str4, a, false, str5, valueOf, o != null ? o.h : null, Long.valueOf(uk70Var.h), Long.valueOf(j), uk70Var.b, uk70Var.c, !baw.a(r13), uk70Var.p, uk70Var.l, false, null);
    }

    public final void b(Context context, uk70 uk70Var) {
        long j;
        if (uk70Var == null || this.g) {
            return;
        }
        MessageNotificationContainer a = a(uk70Var);
        qa20 qa20Var = qa20.b;
        qa20Var.a.a(a, uk70Var.i.a, uk70Var.j, uk70Var.q.a);
        if (this.g) {
            return;
        }
        boolean z = DialogsFragment.u0;
        if (!DialogsFragment.u0) {
            ChatFragment.w1.getClass();
            if (ChatFragment.y1 == 0) {
                j = 1000;
                this.f.d(new dhs(this, context, uk70Var, 2), j, TimeUnit.MILLISECONDS);
            }
        }
        j = 1;
        this.f.d(new dhs(this, context, uk70Var, 2), j, TimeUnit.MILLISECONDS);
    }
}
