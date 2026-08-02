package xsna;

import com.vk.im.engine.internal.longpoll.polling_tasks.channels.ChannelsLongPollUnsupportedException;
import com.vk.im.engine.internal.longpoll.response_handler.LongPollLiveEventsHandlerImpl;
import com.vk.im.engine.models.LongPollType;
import com.vk.toggle.features.CoreFeatures;
import kotlin.NoWhenBranchMatchedException;
import xsna.a500;
import xsna.aox;
import xsna.pzv;

/* compiled from: LongPollSyncThreadTasksFactory.kt */
/* loaded from: classes2.dex */
public final class d500 implements c500 {
    public final r4k a;
    public final jx5 b;

    /* compiled from: LongPollSyncThreadTasksFactory.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LongPollType.values().length];
            try {
                iArr[LongPollType.MESSAGES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LongPollType.CHANNELS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public d500(r4k r4kVar, jx5 jx5Var) {
        this.a = r4kVar;
        this.b = jx5Var;
    }

    @Override // xsna.c500
    public final t6o0 a(String str, LongPollType longPollType, w2w w2wVar, a500.a aVar) {
        int i = a.$EnumSwitchMapping$0[longPollType.ordinal()];
        if (i == 1) {
            return new v6o0(str, new LongPollLiveEventsHandlerImpl(w2wVar, aVar));
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        new LongPollLiveEventsHandlerImpl(w2wVar, aVar);
        return new u6o0();
    }

    @Override // xsna.c500
    public final p6o0 b(LongPollType longPollType, aox aoxVar) {
        int i = a.$EnumSwitchMapping$0[longPollType.ordinal()];
        if (i == 1) {
            return new p6o0(new q6o0(aoxVar, this.a), this.b);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        throw new ChannelsLongPollUnsupportedException();
    }

    @Override // xsna.c500
    public final q6o0 c(LongPollType longPollType, aox aoxVar) {
        int i = a.$EnumSwitchMapping$0[longPollType.ordinal()];
        if (i == 1) {
            return new q6o0(aoxVar, this.a);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        throw new ChannelsLongPollUnsupportedException();
    }

    @Override // xsna.c500
    public final b7o0 d(a500.a aVar) {
        CoreFeatures coreFeatures = CoreFeatures.COMMON_WEBSOCKET_API;
        coreFeatures.getClass();
        return new b7o0(aVar, com.vk.toggle.b.A.a(coreFeatures));
    }

    @Override // xsna.c500
    public final q6o0 e(LongPollType longPollType) {
        int i = a.$EnumSwitchMapping$0[longPollType.ordinal()];
        if (i == 1) {
            return new q6o0(aox.a.a, this.a);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        throw new ChannelsLongPollUnsupportedException();
    }

    @Override // xsna.c500
    public final d7o0 f(LongPollType longPollType, w2w w2wVar, a500.a aVar) {
        vnk0 xnk0Var;
        LongPollLiveEventsHandlerImpl longPollLiveEventsHandlerImpl = new LongPollLiveEventsHandlerImpl(w2wVar, aVar);
        w3w c = w2wVar.getExperiments().c();
        int i = a.$EnumSwitchMapping$0[longPollType.ordinal()];
        if (i == 1) {
            String str = (String) w2wVar.getConfig().p0.invoke();
            if (str == null) {
                pzv.a aVar2 = pzv.x0;
                vx2.a.getClass();
                String invoke = vx2.b().a.p.invoke();
                aVar2.getClass();
                str = pzv.a.b(invoke, "ruim");
                if (str == null) {
                    str = pzv.a.a();
                }
            }
            xnk0Var = new xnk0(str);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (((String) w2wVar.getConfig().q0.invoke()) == null) {
                pzv.a aVar3 = pzv.x0;
                vx2.a.getClass();
                String invoke2 = vx2.b().a.p.invoke();
                aVar3.getClass();
                if (pzv.a.b(invoke2, "getEvents") == null) {
                    "api.".concat(a0a.d);
                }
            }
            xnk0Var = new wnk0();
        }
        return new d7o0(longPollLiveEventsHandlerImpl, c, xnk0Var, new t400());
    }
}
