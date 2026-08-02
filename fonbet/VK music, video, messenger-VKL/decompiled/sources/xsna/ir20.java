package xsna;

import android.content.res.Configuration;
import android.view.View;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.ui.discovery.minimizable.announce.VideoAnnounceState;
import com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper;
import com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController;
import java.util.ArrayList;
import one.video.transform.TransformController;
import xsna.yks0;

/* compiled from: MiniPlayerViewWrapper.kt */
/* loaded from: classes7.dex */
public interface ir20 extends l6s0, i2b0 {

    /* compiled from: MiniPlayerViewWrapper.kt */
    public static final class a {
        public final cty a;
        public final fm20 b;
        public final gzs<Boolean> c;
        public final gzs<Boolean> d;
        public final m40 e;

        public a(cty ctyVar, fm20 fm20Var, gzs gzsVar, gzs gzsVar2, m40 m40Var) {
            this.a = ctyVar;
            this.b = fm20Var;
            this.c = gzsVar;
            this.d = gzsVar2;
            this.e = m40Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b) && this.c.equals(aVar.c) && this.d.equals(aVar.d) && this.e.equals(aVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + sf3.a(sf3.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        }

        public final String toString() {
            return "MetaProvider(playerStateProvider=" + this.a + ", isScreenResumed=" + this.b + ", isDialogsHidden=" + this.c + ", playOnResume=" + this.d + ", fullscreenLockStateProvider=" + this.e + ')';
        }
    }

    /* compiled from: MiniPlayerViewWrapper.kt */
    public static final class b {
        public final MiniPlayerControllersWrapper.VideoInfo a;
        public final boolean b;
        public final boolean c;
        public final VideoMinimizableState d;

        public b(VideoMinimizableState videoMinimizableState, MiniPlayerControllersWrapper.VideoInfo videoInfo, boolean z, boolean z2) {
            this.a = videoInfo;
            this.b = z;
            this.c = z2;
            this.d = videoMinimizableState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c && epx.f(this.d, bVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return "MiniPlayerInfo(videoInfo=" + this.a + ", isNotInterested=" + this.b + ", isShowSubscribe=" + this.c + ", minimizableState=" + this.d + ')';
        }
    }

    /* compiled from: MiniPlayerViewWrapper.kt */
    public interface c {

        /* compiled from: MiniPlayerViewWrapper.kt */
        public static final class a implements c {
            public final boolean a;

            public a(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.a == ((a) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("AutoPlaySetting(isEnabled="), this.a, ')');
            }
        }

        /* compiled from: MiniPlayerViewWrapper.kt */
        public static final class b implements c {
            public final boolean a;

            public b(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a == ((b) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("AutoPlaySwitch(isEnabled="), this.a, ')');
            }
        }

        /* compiled from: MiniPlayerViewWrapper.kt */
        /* renamed from: xsna.ir20$c$c, reason: collision with other inner class name */
        public static final class C3075c implements c {
            public static final C3075c a = new C3075c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3075c);
            }

            public final int hashCode() {
                return -1154310180;
            }

            public final String toString() {
                return "Pause";
            }
        }

        /* compiled from: MiniPlayerViewWrapper.kt */
        public static final class d implements c {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -104095810;
            }

            public final String toString() {
                return "PauseByUser";
            }
        }

        /* compiled from: MiniPlayerViewWrapper.kt */
        public static final class e implements c {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                ((e) obj).getClass();
                return true;
            }

            public final int hashCode() {
                return Boolean.hashCode(true);
            }

            public final String toString() {
                return "PauseDueFocusLoss(ignorePauseStrategy=true)";
            }
        }

        /* compiled from: MiniPlayerViewWrapper.kt */
        public static final class f implements c {
            public static final f a = new f();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return -2015793424;
            }

            public final String toString() {
                return "PlayByUser";
            }
        }

        /* compiled from: MiniPlayerViewWrapper.kt */
        public static final class g implements c {
            public static final g a = new g();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public final int hashCode() {
                return -1363080511;
            }

            public final String toString() {
                return "Replay";
            }
        }

        /* compiled from: MiniPlayerViewWrapper.kt */
        public static final class h implements c {
            public static final h a = new h();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof h);
            }

            public final int hashCode() {
                return -1152344946;
            }

            public final String toString() {
                return "Retry";
            }
        }

        /* compiled from: MiniPlayerViewWrapper.kt */
        public static final class i implements c {
            public final TransformController.ScaleType a;

            public i(TransformController.ScaleType scaleType) {
                this.a = scaleType;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i) && this.a == ((i) obj).a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "ScaleType(scaleType=" + this.a + ')';
            }
        }

        /* compiled from: MiniPlayerViewWrapper.kt */
        public static final class j implements c {
            public final long a;

            public j(long j) {
                this.a = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof j) && this.a == ((j) obj).a;
            }

            public final int hashCode() {
                return Long.hashCode(this.a);
            }

            public final String toString() {
                return vu5.a(')', this.a, new StringBuilder("SeekTo(timeMs="));
            }
        }
    }

    /* compiled from: MiniPlayerViewWrapper.kt */
    public interface d {

        /* compiled from: MiniPlayerViewWrapper.kt */
        public static final class a implements d {
            public final VideoFile a;
            public final DonutVideoUiModel b;
            public final boolean c;
            public final boolean d;
            public final boolean e;

            public a(VideoFile videoFile, DonutVideoUiModel donutVideoUiModel, boolean z, boolean z2, boolean z3) {
                this.a = videoFile;
                this.b = donutVideoUiModel;
                this.c = z;
                this.d = z2;
                this.e = z3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e;
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                DonutVideoUiModel donutVideoUiModel = this.b;
                return Boolean.hashCode(this.e) + qoy.b(qoy.b((hashCode + (donutVideoUiModel == null ? 0 : donutVideoUiModel.hashCode())) * 31, 31, this.c), 31, this.d);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("BindFullscreenMenu(videoFile=");
                sb.append(this.a);
                sb.append(", donutVideoUiModel=");
                sb.append(this.b);
                sb.append(", isLandscape=");
                sb.append(this.c);
                sb.append(", showSubscribe=");
                sb.append(this.d);
                sb.append(", isFeedbackPollsAvailable=");
                return defpackage.q0.a(sb, this.e, ')');
            }
        }

        /* compiled from: MiniPlayerViewWrapper.kt */
        public static final class b implements d {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1761347808;
            }

            public final String toString() {
                return "DialogHideEnded";
            }
        }

        /* compiled from: MiniPlayerViewWrapper.kt */
        public static final class c implements d {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1754851535;
            }

            public final String toString() {
                return "HideExtendSeekBar";
            }
        }

        /* compiled from: MiniPlayerViewWrapper.kt */
        /* renamed from: xsna.ir20$d$d, reason: collision with other inner class name */
        public static final class C3076d implements d {
            public final boolean a;

            public C3076d(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3076d) && this.a == ((C3076d) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("HidePlayerControls(animated="), this.a, ')');
            }
        }

        /* compiled from: MiniPlayerViewWrapper.kt */
        public static final class e implements d {
            public static final e a = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 632522268;
            }

            public final String toString() {
                return "HideUIDelayed";
            }
        }

        /* compiled from: MiniPlayerViewWrapper.kt */
        public static final class f implements d {
            public static final f a = new f();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return 2074103388;
            }

            public final String toString() {
                return "PlayerFullscreenClick";
            }
        }

        /* compiled from: MiniPlayerViewWrapper.kt */
        public static final class g implements d {
            public final VideoMinimizableState a;

            public g(VideoMinimizableState videoMinimizableState) {
                this.a = videoMinimizableState;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && epx.f(this.a, ((g) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "ScreenStateChanged(state=" + this.a + ')';
            }
        }

        /* compiled from: MiniPlayerViewWrapper.kt */
        public static final class h implements d {
            public static final h a = new h();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof h);
            }

            public final int hashCode() {
                return -1930941916;
            }

            public final String toString() {
                return "ShowPlayerControls";
            }
        }
    }

    yks0.a Gc();

    boolean H4();

    void Q(VideoMinimizableState videoMinimizableState);

    void Sf(boolean z);

    void Z0(PlayerRemoteController.Properties properties);

    void a2(VideoAnnounceState videoAnnounceState);

    void b7();

    default int c2() {
        return 0;
    }

    void d();

    void dg(yks0 yks0Var);

    void e7(d dVar);

    View getPlayerView();

    void j8(b bVar, yks0 yks0Var, dxh dxhVar);

    default void jg(yg5 yg5Var) {
        sht0 sht0Var;
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_RESET_PLAYER_IF_CLOSE_IT;
        videoFeatures.getClass();
        if (com.vk.toggle.b.A.a(videoFeatures)) {
            VideoAutoPlay videoAutoPlay = yg5Var instanceof VideoAutoPlay ? (VideoAutoPlay) yg5Var : null;
            if (videoAutoPlay == null || (sht0Var = videoAutoPlay.l0) == null) {
                return;
            }
            qu5.c().f(sht0Var, false);
        }
    }

    void ji(b bVar, vfk vfkVar);

    void nm(boolean z);

    boolean o8();

    void of(ArrayList arrayList);

    void onConfigurationChanged(Configuration configuration);

    void onPause();

    void onResume();

    void t();

    void t5(c cVar);

    default void L2(lat0 lat0Var) {
    }
}
