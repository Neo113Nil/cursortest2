package xsna;

import com.vk.core.utils.newtork.NetworkType;
import com.vk.dto.common.Peer;
import com.vk.im.engine.internal.longpoll.response_handler.LongPollLiveEventsHandlerImpl;
import com.vk.im.engine.models.LongPollType;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.a400;
import xsna.nnk0;
import xsna.r400;

/* compiled from: TaskSseLiveImpl.kt */
/* loaded from: classes2.dex */
public final class d7o0 implements c7o0 {
    public static final f9w g = e9w.b("TaskSseLive");
    public final LongPollLiveEventsHandlerImpl a;
    public final w3w b;
    public final vnk0 c;
    public volatile onk0 d;
    public volatile int e;
    public final bpn0 f = new bpn0(new qc00(14));

    /* compiled from: TaskSseLiveImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NetworkType.values().length];
            try {
                iArr[NetworkType.MOBILE_2G.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NetworkType.MOBILE_3G.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NetworkType.MOBILE_FAST_3G.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NetworkType.MOBILE_4G.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NetworkType.MOBILE_5G.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[NetworkType.WIFI.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public d7o0(LongPollLiveEventsHandlerImpl longPollLiveEventsHandlerImpl, w3w w3wVar, vnk0 vnk0Var, t400 t400Var) {
        this.a = longPollLiveEventsHandlerImpl;
        this.b = w3wVar;
        this.c = vnk0Var;
        this.e = w3wVar.b;
    }

    @Override // xsna.c7o0
    public final void a(w2w w2wVar, a400 a400Var, zkh zkhVar) {
        r400 u400Var;
        LongPollType longPollType;
        Peer a2 = mq9.a(w2wVar);
        snk0 a3 = gau.a.b().a(this.e, this.c.a(a400Var, a2));
        this.d = a3;
        com.vk.im.engine.models.c experiments = w2wVar.getExperiments();
        boolean z = a400Var instanceof a400.a;
        if (z) {
            u400Var = new s400();
        } else {
            if (!(a400Var instanceof a400.b)) {
                throw new NoWhenBranchMatchedException();
            }
            u400Var = new u400(a2, (a400.b) a400Var, new com.vk.im.engine.internal.api_parsers.a(experiments));
        }
        if (z) {
            longPollType = LongPollType.CHANNELS;
        } else {
            if (!(a400Var instanceof a400.b)) {
                throw new NoWhenBranchMatchedException();
            }
            longPollType = LongPollType.MESSAGES;
        }
        f9w f9wVar = g;
        while (a3.g) {
            nnk0 next = a3.next();
            if (next instanceof nnk0.c) {
                f9wVar.debug(new d2c0(10));
            } else if (next instanceof nnk0.b) {
                try {
                    b((nnk0.b) next, longPollType, u400Var, zkhVar);
                } catch (Throwable th) {
                    a3.cancel();
                    throw th;
                }
            } else if (next instanceof nnk0.d) {
                f9wVar.debug(new rme0((nnk0.d) next, 12));
            } else {
                if (!(next instanceof nnk0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                f9wVar.debug(new g2c0(10));
            }
        }
    }

    public final void b(nnk0.b bVar, LongPollType longPollType, r400 r400Var, zkh zkhVar) {
        int i;
        int i2;
        String str = bVar.a;
        String str2 = bVar.c;
        String str3 = bVar.b;
        g.debug(new v9b0(str, str3, this, str2, 2));
        if (!"ping-interval".equalsIgnoreCase(str3) || str2.length() <= 0) {
            if (str3 != null || str2.length() <= 0) {
                return;
            }
            r400.a a2 = r400Var.a(new JSONObject(str2));
            this.a.a(a2.b, com.vk.im.engine.internal.longpoll.response_handler.b.a(longPollType), "d7o0");
            zkhVar.invoke(a2.a);
            return;
        }
        bpn0 bpn0Var = cqm0.a;
        try {
            i = Integer.parseInt(str2);
        } catch (Throwable unused) {
            i = 0;
        }
        int i3 = i >= 0 ? i : 0;
        if (i3 != 0) {
            NetworkType d = com.vk.core.utils.newtork.b.c().d();
            w3w w3wVar = this.b;
            switch (a.$EnumSwitchMapping$0[d.ordinal()]) {
                case 1:
                    i2 = w3wVar.c;
                    break;
                case 2:
                case 3:
                    i2 = w3wVar.d;
                    break;
                case 4:
                case 5:
                case 6:
                    i2 = w3wVar.e;
                    break;
                default:
                    i2 = 5000;
                    break;
            }
            this.e = i3 + i2;
        }
    }

    @Override // xsna.c7o0
    public final void cancel() {
        onk0 onk0Var = this.d;
        if (onk0Var != null) {
            onk0Var.cancel();
        }
    }
}
