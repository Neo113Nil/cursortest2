package xsna;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.vk.im.engine.external.ImMsgPushSettingsProvider;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.p9w;

/* compiled from: ImNotificationSettingsHelper.kt */
/* loaded from: classes2.dex */
public final class y9w {
    public static final y9w a = new y9w();
    public static final pcw b = g2v.c().i();

    public static final void a(Context context, gzs gzsVar, boolean z) {
        String str;
        y9w y9wVar = a;
        boolean f = ((p9w) c()).c.f();
        ImMsgPushSettingsProvider c = c();
        ImMsgPushSettingsProvider.Type type = ImMsgPushSettingsProvider.Type.PRIVATE_MESSAGES;
        boolean h = ((p9w) c).h(type);
        if (!f) {
            if (z) {
                a1w a1wVar = q1w.a;
                if (a1wVar == null) {
                    a1wVar = null;
                }
                a1wVar.E(y9wVar, new rz30()).subscribe(new yng(2), new x9w());
            }
            b.a(null);
        } else if (!h) {
            b.a(((p9w) c()).d(type));
        }
        if (((p9w) c()).g(type)) {
            return;
        }
        p9w p9wVar = (p9w) c();
        switch (p9w.c.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                str = NotificationCompat.CATEGORY_MESSAGE;
                break;
            case 2:
                str = "chat";
                break;
            case 3:
                str = "community_msg";
                break;
            case 4:
                str = RTCStatsConstants.KEY_CHANNELS;
                break;
            case 5:
            case 6:
                str = "calls";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        is isVar = new is("account.setPushSettings");
        isVar.K("key", str);
        isVar.K("value", "on");
        hg1.m(rsg0.y0(isVar, null, null, 3), context, 0L, false, 62).subscribe(new lav(new defpackage.o(context, p9wVar, type), 2), new pmu(new n9w(0), 1));
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    public static /* synthetic */ void b(int i, Context context, gzs gzsVar) {
        boolean z = (i & 2) == 0;
        if ((i & 4) != 0) {
            gzsVar = null;
        }
        a(context, gzsVar, z);
    }

    public static ImMsgPushSettingsProvider c() {
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        return a1wVar.r().f;
    }
}
