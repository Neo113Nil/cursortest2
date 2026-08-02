package xsna;

import android.app.Activity;
import android.content.Context;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.libvideo.pip.v2.activity.VideoContainerActivityWithPip;
import com.vk.stat.scheme.SchemeStat$TypeBackgroundItem;
import com.vk.stat.scheme.SchemeStat$TypeVideoBackgroundListeningItem;
import com.vkontakte.android.FragmentWrapperActivity;
import com.vkontakte.android.MainActivity;
import java.lang.ref.WeakReference;
import kotlin.LazyThreadSafetyMode;
import xsna.c63;
import xsna.oz50;

/* compiled from: SuperAppVideoWatchingRestrictionController.kt */
/* loaded from: classes2.dex */
public final class scn0 extends c63.b {
    public static final scn0 b = new scn0();
    public static yg5 c;
    public static final Object d;
    public static final Object e;
    public static final bpn0 f;

    /* compiled from: SuperAppVideoWatchingRestrictionController.kt */
    public static final class a {
        public Boolean a;
        public WeakReference<yg5> b;
    }

    /* compiled from: SuperAppVideoWatchingRestrictionController.kt */
    public static final class b implements j0q0 {
        @Override // xsna.j0q0
        public final SchemeStat$TypeBackgroundItem.b a() {
            return null;
        }

        @Override // xsna.j0q0
        public final SchemeStat$TypeVideoBackgroundListeningItem b() {
            boolean z;
            yg5 c;
            scn0.c = null;
            if (!BuildInfo.s()) {
                return null;
            }
            VideoPipStateHolder.a.getClass();
            yg5 c2 = VideoPipStateHolder.c();
            VideoFile A = c2 != null ? c2.A() : null;
            if (A != null) {
                Boolean valueOf = Boolean.valueOf(A.v());
                if (A.l6() == 6) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    z = valueOf.booleanValue();
                    scn0.b.getClass();
                    if (!scn0.D() && VideoPipStateHolder.h()) {
                        if ((A != null ? A.Ia() : false) || z || (c = VideoPipStateHolder.c()) == null) {
                            return null;
                        }
                        return new SchemeStat$TypeVideoBackgroundListeningItem(SchemeStat$TypeVideoBackgroundListeningItem.EventType.START, Integer.valueOf((int) (c.getPosition() / 1000)));
                    }
                }
            }
            z = false;
            scn0.b.getClass();
            return !scn0.D() ? null : null;
        }
    }

    static {
        uh80 uh80Var = new uh80(8);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        d = msy.a(lazyThreadSafetyMode, uh80Var);
        e = msy.a(lazyThreadSafetyMode, new jzm0(2));
        f = new bpn0(new vqe0(5));
        b bVar = new b();
        UiTracker uiTracker = UiTracker.a;
        UiTracker.h.f.add(bVar);
    }

    public static boolean D() {
        return ((Boolean) f.getValue()).booleanValue();
    }

    public static void E(Context context, yg5 yg5Var, boolean z) {
        if (yg5Var == null) {
            return;
        }
        fxc0.B().Y().k(context, yg5Var.A(), (r43 & 4) != 0 ? null : yg5Var.d0(), (r43 & 8) != 0 ? null : null, (r43 & 16) != 0 ? null : null, (r43 & 32) != 0 ? null : null, (r43 & 64) != 0 ? false : false, (r43 & 128) != 0 ? null : null, (r43 & 256) != 0 ? null : null, (r43 & 512) != 0 ? null : null, true, (r43 & 2048) != 0 ? false : z, (r43 & 4096) == 0, (r43 & 8192) == 0, (r43 & 16384) != 0 ? -1L : 0L, (32768 & r43) != 0 ? null : null, (65536 & r43) != 0 ? null : null, (524288 & r43) != 0 ? false : false, (r43 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : null);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    public static void F() {
        if (BuildInfo.s() && D()) {
            a aVar = (a) e.getValue();
            aVar.getClass();
            bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
            xh5 xh5Var = b.C1208b.a().c;
            yg5 yg5Var = xh5Var != null ? xh5Var.a : null;
            boolean z = false;
            if (yg5Var != null && yg5Var.isPlaying()) {
                z = true;
            }
            aVar.a = Boolean.valueOf(z);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.c63.b
    public final void p(Activity activity) {
        Class<?> cls = activity.getClass();
        rsr rsrVar = oz50.k;
        oz50.b.d();
        if (!cls.equals(MainActivity.class)) {
            Class<?> cls2 = activity.getClass();
            rsr rsrVar2 = oz50.k;
            if (rsrVar2 == null) {
                rsrVar2 = null;
            }
            rsrVar2.getClass();
            if (!cls2.equals(FragmentWrapperActivity.class) && !(activity instanceof VideoContainerActivityWithPip)) {
                return;
            }
        }
        if (BuildInfo.s()) {
            yg5 yg5Var = c;
            ?? r2 = e;
            WeakReference<yg5> weakReference = ((a) r2.getValue()).b;
            yg5 yg5Var2 = weakReference != null ? weakReference.get() : null;
            if (D()) {
                ?? r5 = d;
                if (yg5Var != null) {
                    ((nst0) r5.getValue()).a(activity, yg5Var.A().a1(), Long.valueOf(yg5Var.getPosition()), new ihq(4, new xg2(13, activity, yg5Var)));
                } else if (yg5Var2 != null) {
                    if (!(activity instanceof VideoContainerActivityWithPip)) {
                        E(activity, yg5Var2, false);
                        return;
                    }
                    ((nst0) r5.getValue()).a(activity, yg5Var2.A().a1(), Long.valueOf(yg5Var2.getPosition()), new ihq(4, new ejf0(yg5Var2, 9)));
                }
            } else if (!Preference.j().getBoolean("video_background", true)) {
                E(activity, c, true);
            }
            a aVar = (a) r2.getValue();
            aVar.a = null;
            aVar.b = null;
            c = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.c63.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t() {
        boolean z;
        yg5 c2;
        if (!BuildInfo.s()) {
            return;
        }
        VideoPipStateHolder.a.getClass();
        yg5 c3 = VideoPipStateHolder.c();
        VideoFile A = c3 != null ? c3.A() : null;
        if (A != null) {
            Boolean valueOf = Boolean.valueOf(A.v());
            if (A.l6() == 6) {
                valueOf = null;
            }
            if (valueOf != null) {
                z = valueOf.booleanValue();
                boolean Ia = A != null ? A.Ia() : false;
                if (VideoPipStateHolder.h() && (!Preference.j().getBoolean("video_background", true) || (D() && !Ia && !z))) {
                    c2 = VideoPipStateHolder.c();
                    c = c2;
                    if (c2 != null) {
                        VideoPipStateHolder.a();
                    }
                }
                if (D()) {
                    return;
                }
                a aVar = (a) e.getValue();
                aVar.getClass();
                bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                xh5 xh5Var = b.C1208b.a().c;
                yg5 yg5Var = xh5Var != null ? xh5Var.a : null;
                Boolean valueOf2 = yg5Var != null ? Boolean.valueOf(yg5Var.isPlaying()) : null;
                Boolean bool = Boolean.TRUE;
                boolean f2 = epx.f(valueOf2, bool);
                if (epx.f(aVar.a, bool) && !f2 && yg5Var != null) {
                    aVar.b = new WeakReference<>(yg5Var);
                    return;
                } else {
                    aVar.a = null;
                    aVar.b = null;
                    return;
                }
            }
        }
        z = false;
        if (A != null) {
        }
        if (VideoPipStateHolder.h()) {
            c2 = VideoPipStateHolder.c();
            c = c2;
            if (c2 != null) {
            }
        }
        if (D()) {
        }
    }
}
