package xsna;

import com.vk.channelrestrictions.RestrictionBadge;
import com.vk.channels.api.Channel;
import com.vk.channels.impl.channel_screen.RefreshInfo;
import com.vk.dto.common.VerifyInfo;
import com.vk.im.engine.models.ImBgSyncState;
import com.vk.im.engine.models.groups.AgeLimits;
import com.vk.im.engine.reporters.syncstate.ImSyncStateStatReporter;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.functions.b;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.amw;
import xsna.hbo0;
import xsna.ks5;
import xsna.q720;
import xsna.wup0;
import xsna.ycb;

/* compiled from: ChannelHeaderInfoStateSource.kt */
/* loaded from: classes16.dex */
public final class sza {
    public final uza a;
    public final h3g0 b;
    public final imj0 c;
    public final kpf0 d;
    public final ImSyncStateStatReporter e;
    public final boolean f;
    public final boolean g;
    public final io.reactivex.rxjava3.subjects.d h;

    /* compiled from: ChannelHeaderInfoStateSource.kt */
    public static abstract class a {

        /* compiled from: ChannelHeaderInfoStateSource.kt */
        /* renamed from: xsna.sza$a$a, reason: collision with other inner class name */
        public static final class C3707a extends a {
            public static final C3707a a = new C3707a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3707a);
            }

            public final int hashCode() {
                return -1824754832;
            }

            public final String toString() {
                return "Loading";
            }
        }

        /* compiled from: ChannelHeaderInfoStateSource.kt */
        public static final class b extends a {
            public final AgeLimits a;

            public b(AgeLimits ageLimits) {
                this.a = ageLimits;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a == ((b) obj).a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Ready(ageLimits=" + this.a + ')';
            }
        }
    }

    /* compiled from: ChannelHeaderInfoStateSource.kt */
    public static abstract class b {

        /* compiled from: ChannelHeaderInfoStateSource.kt */
        public static final class a extends b {
            public static final a a = new a();
        }

        /* compiled from: ChannelHeaderInfoStateSource.kt */
        /* renamed from: xsna.sza$b$b, reason: collision with other inner class name */
        public static final class C3708b extends b {
            public static final C3708b a = new C3708b();
        }

        /* compiled from: ChannelHeaderInfoStateSource.kt */
        public static final class c extends b {
            public final Channel a;

            public c(Channel channel) {
                this.a = channel;
            }
        }
    }

    /* compiled from: ChannelHeaderInfoStateSource.kt */
    public static final class c {
        public final b a;
        public final a b;
        public final ImBgSyncState c;
        public final boolean d;
        public final d e;
        public final int f;

        public c() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && this.c == cVar.c && this.d == cVar.d && epx.f(this.e, cVar.e) && this.f == cVar.f;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f) + ((this.e.hashCode() + qoy.b((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InnerState(channelState=");
            sb.append(this.a);
            sb.append(", channelAgeLimitState=");
            sb.append(this.b);
            sb.append(", syncState=");
            sb.append(this.c);
            sb.append(", isRefreshingExternal=");
            sb.append(this.d);
            sb.append(", subscribersCountState=");
            sb.append(this.e);
            sb.append(", unreadCount=");
            return vu5.b(sb, this.f, ')');
        }

        public c(b bVar, a aVar, ImBgSyncState imBgSyncState, boolean z, d dVar, int i) {
            this.a = bVar;
            this.b = aVar;
            this.c = imBgSyncState;
            this.d = z;
            this.e = dVar;
            this.f = i;
        }

        public /* synthetic */ c(int i) {
            this(b.C3708b.a, a.C3707a.a, ImBgSyncState.DISCONNECTED, false, d.a.a, 0);
        }
    }

    /* compiled from: ChannelHeaderInfoStateSource.kt */
    public static abstract class d {

        /* compiled from: ChannelHeaderInfoStateSource.kt */
        public static final class a extends d {
            public static final a a = new a();
        }

        /* compiled from: ChannelHeaderInfoStateSource.kt */
        public static final class b extends d {
            public final int a;

            public b(int i) {
                this.a = i;
            }
        }
    }

    /* compiled from: ChannelHeaderInfoStateSource.kt */
    public static final /* synthetic */ class e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AgeLimits.values().length];
            try {
                iArr[AgeLimits.OVER_16.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AgeLimits.OVER_18.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AgeLimits.NO_AGE_RESTRICTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public sza(uza uzaVar, h3g0 h3g0Var, imj0 imj0Var, kpf0 kpf0Var, ImSyncStateStatReporter imSyncStateStatReporter, boolean z, boolean z2) {
        io.reactivex.rxjava3.internal.operators.observable.y a2;
        this.a = uzaVar;
        this.b = h3g0Var;
        this.c = imj0Var;
        this.d = kpf0Var;
        this.e = imSyncStateStatReporter;
        this.f = z;
        this.g = z2;
        io.reactivex.rxjava3.subjects.d O0 = io.reactivex.rxjava3.subjects.d.O0(new c(0));
        io.reactivex.rxjava3.subjects.d O02 = io.reactivex.rxjava3.subjects.d.O0(b());
        a.q qVar = io.reactivex.rxjava3.internal.functions.a.a;
        b.a aVar = io.reactivex.rxjava3.internal.functions.b.a;
        new io.reactivex.rxjava3.internal.operators.observable.y(O0, qVar, aVar).U(new d22(new tza(1, this, sza.class, "mapToChatHeaderState", "mapToChatHeaderState(Lcom/vk/channels/impl/channel_screen/ChannelHeaderInfoStateSource$InnerState;)Lcom/vk/chat/api/header/info/ChatHeaderInfoState;", 0), 8)).a0(asu0.a.d()).subscribe(O02);
        io.reactivex.rxjava3.subjects.d O03 = io.reactivex.rxjava3.subjects.d.O0(b.C3708b.a);
        ixa ixaVar = uzaVar.a;
        io.reactivex.rxjava3.internal.operators.observable.y a3 = ixaVar.a();
        a3.getClass();
        new io.reactivex.rxjava3.internal.operators.observable.y(a3, qVar, aVar).U(new o40(new dh5(3), 5)).subscribe(O03);
        io.reactivex.rxjava3.subjects.d O04 = io.reactivex.rxjava3.subjects.d.O0(a.C3707a.a);
        ixaVar.a().L(new com.vk.movika.sdk.base.hooks.f(new p40(this, 20), 5), false).subscribe(O04);
        io.reactivex.rxjava3.subjects.d O05 = io.reactivex.rxjava3.subjects.d.O0(ycb.d.a);
        zcb zcbVar = uzaVar.c;
        if (zcbVar != null && (a2 = zcbVar.a()) != null) {
            new io.reactivex.rxjava3.internal.operators.observable.y(a2, qVar, aVar).subscribe(O05);
        }
        this.h = O02;
        io.reactivex.rxjava3.internal.operators.observable.y yVar = (io.reactivex.rxjava3.internal.operators.observable.y) uzaVar.d.b;
        yVar.getClass();
        io.reactivex.rxjava3.internal.operators.observable.y yVar2 = new io.reactivex.rxjava3.internal.operators.observable.y(yVar, qVar, aVar);
        io.reactivex.rxjava3.internal.operators.observable.y yVar3 = uzaVar.e.b;
        yVar3.getClass();
        io.reactivex.rxjava3.internal.operators.observable.y yVar4 = new io.reactivex.rxjava3.internal.operators.observable.y(yVar3, qVar, aVar);
        io.reactivex.rxjava3.subjects.d O06 = io.reactivex.rxjava3.subjects.d.O0(d.a.a);
        io.reactivex.rxjava3.subjects.d dVar = uzaVar.f.b;
        dVar.getClass();
        new io.reactivex.rxjava3.internal.operators.observable.y(dVar, qVar, aVar).U(new q40(new pe1(9), 5)).subscribe(O06);
        io.reactivex.rxjava3.subjects.d O07 = io.reactivex.rxjava3.subjects.d.O0(0);
        io.reactivex.rxjava3.core.q<Integer> a4 = uzaVar.g.a();
        a4.getClass();
        new io.reactivex.rxjava3.internal.operators.observable.y(a4, qVar, aVar).subscribe(O07);
        io.reactivex.rxjava3.core.q.g(O03, O04, yVar4, yVar2, O06, O05, O07, new com.vk.movika.sdk.base.hooks.k(new rza(this), 9)).subscribe(O0);
    }

    public final mrb a() {
        return new mrb(new ks5.a(), amw.a.a, new uzo0(new hbo0.a(R.string.vkim_channel_deleted_name), null, false, 62), this.f ? null : new c1n0(this.c.g(0), wup0.a.a), new lrb(EmptyList.b), null, 0);
    }

    public final mrb b() {
        return new mrb(ks5.d.a, amw.a.a, new uzo0(null, null, false, 62), this.f ? null : new c1n0("", wup0.a.a), new lrb(EmptyList.b), null, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final mrb c(Channel channel, AgeLimits ageLimits, ImBgSyncState imBgSyncState, boolean z, d dVar, int i) {
        RestrictionBadge restrictionBadge;
        RefreshInfo refreshInfo;
        c1n0 c1n0Var;
        lrb lrbVar;
        int i2 = e.$EnumSwitchMapping$0[ageLimits.ordinal()];
        if (i2 == 1) {
            restrictionBadge = RestrictionBadge.OVER_16;
        } else if (i2 == 2) {
            restrictionBadge = RestrictionBadge.OVER_18;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            restrictionBadge = null;
        }
        boolean z2 = channel.S;
        boolean z3 = channel.o;
        ks5 bVar = z2 ? ks5.c.a : new ks5.b(channel.c);
        imj0 imj0Var = this.c;
        boolean z4 = this.f;
        if (z4) {
            Integer num = channel.G;
            c1n0Var = num != null ? new c1n0(imj0Var.g(num.intValue()), wup0.a.a) : null;
        } else {
            this.e.a(com.vk.im.engine.reporters.syncstate.b.a(imBgSyncState));
            ImBgSyncState imBgSyncState2 = ImBgSyncState.CONNECTING;
            if (imBgSyncState == imBgSyncState2) {
                r6m.a.getClass();
                if (r6m.j()) {
                    refreshInfo = RefreshInfo.CONNECTING;
                    RefreshInfo refreshInfo2 = RefreshInfo.CONNECTED;
                    kpf0 kpf0Var = this.d;
                    c1n0Var = new c1n0(refreshInfo == refreshInfo2 ? kpf0Var.a(refreshInfo) : dVar instanceof d.a ? kpf0Var.a(RefreshInfo.REFRESHING) : dVar instanceof d.b ? imj0Var.g(((d.b) dVar).a) : kpf0Var.a(RefreshInfo.REFRESHING), wup0.a.a);
                }
            }
            if (imBgSyncState == imBgSyncState2) {
                refreshInfo = RefreshInfo.WAIT_FOR_NETWORK;
            } else if (imBgSyncState == ImBgSyncState.REFRESHING) {
                refreshInfo = RefreshInfo.REFRESHING;
            } else {
                ImBgSyncState imBgSyncState3 = ImBgSyncState.REFRESHED;
                refreshInfo = ((imBgSyncState == imBgSyncState3 || imBgSyncState == ImBgSyncState.CONNECTED) && z) ? RefreshInfo.REFRESHING : (imBgSyncState == imBgSyncState3 || imBgSyncState == ImBgSyncState.CONNECTED) ? RefreshInfo.CONNECTED : RefreshInfo.DISCONNECTED;
            }
            RefreshInfo refreshInfo22 = RefreshInfo.CONNECTED;
            kpf0 kpf0Var2 = this.d;
            c1n0Var = new c1n0(refreshInfo == refreshInfo22 ? kpf0Var2.a(refreshInfo) : dVar instanceof d.a ? kpf0Var2.a(RefreshInfo.REFRESHING) : dVar instanceof d.b ? imj0Var.g(((d.b) dVar).a) : kpf0Var2.a(RefreshInfo.REFRESHING), wup0.a.a);
        }
        amw.a aVar = amw.a.a;
        h3g0 h3g0Var = this.b;
        boolean z5 = this.g;
        hbo0.b bVar2 = new hbo0.b(h3g0Var.i(channel, z5));
        VerifyInfo verifyInfo = new VerifyInfo(channel.f, false, false, false, false, false, 62, null);
        xuo0.a.getClass();
        uzo0 uzo0Var = new uzo0(bVar2, verifyInfo, channel.Db(xuo0.a()), 56);
        ArrayList arrayList = new ArrayList();
        if (z4) {
            ImFeatures imFeatures = ImFeatures.CHANNEL_MSG_SEARCH;
            imFeatures.getClass();
            if (com.vk.toggle.b.A.a(imFeatures) && !z5) {
                arrayList.add(new srb(R.id.channel_search_menu_action, new hbo0.a(R.string.vkim_search), new q720.b(R.drawable.vk_icon_search_outline_28)));
            }
        }
        if (z4) {
            if (channel.x && z3 && !z5) {
                int i3 = channel.m;
                arrayList.add(new srb(R.id.channel_delayed_msg_list_menu_action, new hbo0.a(R.string.vkim_channels_postponed_posts_screen_title), i3 > 0 ? new q720.c(R.drawable.vk_icon_history_forward_outline_28, i3) : new q720.b(R.drawable.vk_icon_history_forward_outline_28)));
            }
        } else {
            if (channel.n || !z3) {
                lrbVar = new lrb(EmptyList.b);
                return new mrb(bVar, aVar, uzo0Var, c1n0Var, lrbVar, !z4 ? restrictionBadge : null, i);
            }
            if (channel.Db(xuo0.a())) {
                arrayList.add(new srb(R.id.channel_notification_off_menu_action, new hbo0.a(R.string.vkim_channels_notifications), new q720.b(R.drawable.vk_icon_notification_slash_outline_24)));
            } else {
                arrayList.add(new srb(R.id.channel_notification_on_menu_action, new hbo0.a(R.string.vkim_channels_notifications), new q720.b(R.drawable.vk_icon_notification_outline_24)));
            }
        }
        lrbVar = new lrb(arrayList);
        return new mrb(bVar, aVar, uzo0Var, c1n0Var, lrbVar, !z4 ? restrictionBadge : null, i);
    }
}
