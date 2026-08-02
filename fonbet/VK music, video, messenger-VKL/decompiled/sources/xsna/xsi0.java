package xsna;

import com.google.android.gms.cast.MediaInfo;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import one.video.cast.manager.status.MediaRouteConnectStatus;
import one.video.cast.session.action.CastAction;
import org.json.JSONObject;

/* compiled from: SessionCallbackHolder.kt */
/* loaded from: classes11.dex */
public final class xsi0 {
    public static final CopyOnWriteArrayList<ez9> a = new CopyOnWriteArrayList<>();
    public static final gz9 b = new gz9();
    public static final CopyOnWriteArrayList<tz9> c = new CopyOnWriteArrayList<>();
    public static final CopyOnWriteArrayList<ow10> d = new CopyOnWriteArrayList<>();
    public static final CopyOnWriteArrayList<m0a> e = new CopyOnWriteArrayList<>();
    public static final q9k f = new q9k();
    public static final mvf0 g = new mvf0(new b());

    /* compiled from: SessionCallbackHolder.kt */
    /* loaded from: classes8.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[MediaRouteConnectStatus.values().length];
            try {
                iArr[MediaRouteConnectStatus.NO_DEVICES_AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaRouteConnectStatus.NOT_CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MediaRouteConnectStatus.CONNECTING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MediaRouteConnectStatus.CONNECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CastAction.values().length];
            try {
                iArr2[CastAction.SESSION_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CastAction.VIDEO_PLAYED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CastAction.VIDEO_PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CastAction.VIDEO_BUFFERING.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CastAction.VIDEO_LOADING.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[CastAction.VIDEO_FINISHED.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[CastAction.SESSION_ENDED.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[CastAction.PLAYER_STATE_UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[CastAction.PLAYER_STATE_IDLE_REASON_CANCELED.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[CastAction.PLAYER_STATE_IDLE_REASON_INTERRUPTED.ordinal()] = 10;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[CastAction.PLAYER_STATE_IDLE_REASON_ERROR.ordinal()] = 11;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: SessionCallbackHolder.kt */
    public static final class b {
    }

    public static final void a(CastAction castAction) {
        mvf0 mvf0Var = g;
        lvf0 lvf0Var = mvf0Var.b;
        MediaInfo g2 = lvf0Var != null ? lvf0Var.g() : null;
        JSONObject i = g2 != null ? g2.i() : null;
        lvf0 lvf0Var2 = mvf0Var.b;
        MediaInfo g3 = lvf0Var2 != null ? lvf0Var2.g() : null;
        gz9 gz9Var = b;
        if (((CastAction) gz9Var.a) != castAction || !epx.f((MediaInfo) gz9Var.b, g3)) {
            int i2 = a.$EnumSwitchMapping$1[castAction.ordinal()];
            CopyOnWriteArrayList<ez9> copyOnWriteArrayList = a;
            switch (i2) {
                case 1:
                    Iterator<ez9> it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        it.next().b();
                    }
                    break;
                case 2:
                    Iterator<ez9> it2 = copyOnWriteArrayList.iterator();
                    while (it2.hasNext()) {
                        it2.next().c(i);
                    }
                    break;
                case 3:
                    Iterator<ez9> it3 = copyOnWriteArrayList.iterator();
                    while (it3.hasNext()) {
                        it3.next().d(i);
                    }
                    break;
                case 4:
                    Iterator<ez9> it4 = copyOnWriteArrayList.iterator();
                    while (it4.hasNext()) {
                        it4.next().getClass();
                    }
                    break;
                case 5:
                    Iterator<ez9> it5 = copyOnWriteArrayList.iterator();
                    while (it5.hasNext()) {
                        it5.next().getClass();
                    }
                    break;
                case 6:
                    Iterator<ez9> it6 = copyOnWriteArrayList.iterator();
                    while (it6.hasNext()) {
                        it6.next().e(i);
                    }
                    break;
                case 7:
                    Iterator<ez9> it7 = copyOnWriteArrayList.iterator();
                    while (it7.hasNext()) {
                        it7.next().a();
                    }
                    break;
                case 8:
                    Iterator<ez9> it8 = copyOnWriteArrayList.iterator();
                    while (it8.hasNext()) {
                        it8.next().getClass();
                    }
                    break;
                case 9:
                    Iterator<ez9> it9 = copyOnWriteArrayList.iterator();
                    while (it9.hasNext()) {
                        it9.next().getClass();
                    }
                    break;
                case 10:
                    Iterator<ez9> it10 = copyOnWriteArrayList.iterator();
                    while (it10.hasNext()) {
                        it10.next().getClass();
                    }
                    break;
                case 11:
                    Iterator<ez9> it11 = copyOnWriteArrayList.iterator();
                    while (it11.hasNext()) {
                        it11.next().f();
                    }
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        gz9Var.a = castAction;
        gz9Var.b = g3;
    }

    public static void b(MediaRouteConnectStatus mediaRouteConnectStatus) {
        int i = a.$EnumSwitchMapping$0[mediaRouteConnectStatus.ordinal()];
        CopyOnWriteArrayList<ow10> copyOnWriteArrayList = d;
        if (i == 1) {
            Iterator<ow10> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            return;
        }
        if (i == 2) {
            Iterator<ow10> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().c();
            }
        } else if (i == 3) {
            Iterator<ow10> it3 = copyOnWriteArrayList.iterator();
            while (it3.hasNext()) {
                it3.next().a();
            }
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            Iterator<ow10> it4 = copyOnWriteArrayList.iterator();
            while (it4.hasNext()) {
                it4.next().onConnected();
            }
        }
    }

    public static void c(g0a g0aVar) {
        lvf0 k = g0aVar.k();
        mvf0 mvf0Var = g;
        mvf0Var.b = k;
        lvf0 k2 = g0aVar.k();
        if (k2 != null) {
            k2.y(mvf0Var);
        }
        lvf0 k3 = g0aVar.k();
        if (k3 != null) {
            k3.t(mvf0Var);
        }
    }
}
