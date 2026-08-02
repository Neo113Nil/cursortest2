package xsna;

import android.content.Context;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.Source;
import com.vk.pushes.notifications.im.BusinessNotifyNotification;
import com.vk.pushes.notifications.im.MessageNotificationContainer;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.wh70;

/* compiled from: MsgAddHandler.kt */
/* loaded from: classes7.dex */
public final class ah30 {
    public final Context a;
    public final a1w b;
    public final b25 c;
    public final yk70 d;
    public final BuildInfo.Client e;
    public final fv30 f = new fv30(Source.ACTUAL);
    public final io.reactivex.rxjava3.subjects.f<a> g;
    public final io.reactivex.rxjava3.disposables.c h;
    public volatile boolean i;

    /* compiled from: MsgAddHandler.kt */
    public static final class a {
        public final long a;
        public final long b;
        public final int c;

        public a(long j, long j2, int i) {
            this.a = j;
            this.b = j2;
            this.c = i;
        }
    }

    public ah30(Context context, a1w a1wVar, b25 b25Var, yk70 yk70Var, BuildInfo.Client client) {
        this.a = context;
        this.b = a1wVar;
        this.c = b25Var;
        this.d = yk70Var;
        this.e = client;
        io.reactivex.rxjava3.subjects.f<a> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.g = fVar;
        this.h = new io.reactivex.rxjava3.internal.operators.observable.i0(new io.reactivex.rxjava3.internal.operators.observable.m0(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, new v20(new iou(this, 15), 28)).A(1000L, TimeUnit.MILLISECONDS).a0(asu0.a.c()), new yi2(new ugm(this, 22), 29)), new mm6(new j4x(this, 15), 27)).U(new j630(new r9k(this, 29), 1)).a0(asu0.t()).subscribe(new fs00(new h2s(this, 19), 4), new k130(new q8w(5), 2));
    }

    public final BusinessNotifyNotification.BusinessNotifyNotificationContainer a(uk70 uk70Var, boolean z) {
        String str;
        boolean z2 = !baw.a(uk70Var.b) && z;
        String str2 = uk70Var.d;
        String str3 = uk70Var.e;
        boolean z3 = uk70Var.p;
        if (z3) {
            str = "msg_error";
        } else {
            if (z3) {
                throw new NoWhenBranchMatchedException();
            }
            switch (wh70.a.$EnumSwitchMapping$0[this.e.ordinal()]) {
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
        BusinessNotifyNotification.BusinessNotifyNotificationContainer businessNotifyNotificationContainer = new BusinessNotifyNotification.BusinessNotifyNotificationContainer(str2, str3, str, false, uk70Var.g, uk70Var.b, uk70Var.c, z2, uk70Var.p, null);
        businessNotifyNotificationContainer.u = !z2;
        return businessNotifyNotificationContainer;
    }

    public final MessageNotificationContainer b(uk70 uk70Var, boolean z) {
        String str;
        String str2 = uk70Var.d;
        long j = uk70Var.b;
        String str3 = uk70Var.e;
        long j2 = uk70Var.f;
        boolean z2 = uk70Var.p;
        if (z2) {
            str = "msg_error";
        } else {
            if (z2) {
                throw new NoWhenBranchMatchedException();
            }
            switch (wh70.a.$EnumSwitchMapping$0[this.e.ordinal()]) {
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
        String a2 = defpackage.k0.a(j, "vk://chat?peer=");
        String str4 = str;
        String str5 = uk70Var.g;
        Long valueOf = Long.valueOf(uk70Var.a);
        cn o = this.c.o();
        if (!fkq0.c(o.a)) {
            o = null;
        }
        String str6 = o != null ? o.h : null;
        Long valueOf2 = Long.valueOf(uk70Var.h);
        Long valueOf3 = Long.valueOf(j);
        long j3 = uk70Var.b;
        MessageNotificationContainer a3 = com.vk.pushes.notifications.im.a.a(str2, str3, j2, str4, a2, false, str5, valueOf, str6, valueOf2, valueOf3, j3, uk70Var.c, !baw.a(j3) && z, uk70Var.p, uk70Var.l, false, null);
        a3.u = true ^ a3.t;
        return a3;
    }
}
