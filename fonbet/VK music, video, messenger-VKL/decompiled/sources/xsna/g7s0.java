package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.datasource.a;
import com.vk.api.generated.video.dto.VideoGetCommentsExtendedResponseDto;
import com.vk.api.generated.video.dto.VideoStopStreamingResponseDto;
import com.vk.catalog2.common.ui.mvp.video.VideoUploadFragment;
import com.vk.clips.config.viewers.api.experiments.models.ClipsRtmpLivePlaybackSettings;
import com.vk.dto.common.VideoAdData;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.user.UserProfile;
import com.vk.dto.video.VideoAlbum;
import com.vk.imageloader.ImageScreenSize;
import com.vk.libvideo.api.UploadVideoAction;
import com.vk.libvideo.api.VideoUrlInfo;
import com.vk.libvideo.api.ad.AdsDataProvider;
import com.vk.libvideo.api.quality.QualitySettingsInterval;
import com.vk.libvideo.api.quality.QualitySettingsType;
import com.vk.libvideo.api.ui.VideoFeedDialogParams;
import com.vk.libvideo.api.ui.VideoTransitionSource;
import com.vk.libvideo.models.comment.ReplyInfo;
import com.vk.libvideo.models.offline.VideoScreenMode;
import com.vk.libvideo.upload.api.VideoPublicationContext;
import com.vk.libvideo.upload.api.VideoUploadEvent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import one.video.exo.offline.DownloadInfo;
import org.json.JSONObject;
import xsna.adt0;
import xsna.anz;
import xsna.dot0;
import xsna.w0s0;

/* compiled from: VideoBridge.kt */
/* loaded from: classes.dex */
public interface g7s0 {
    public static final /* synthetic */ int G7 = 0;

    static {
        int i = a.a;
    }

    static /* synthetic */ void C(g7s0 g7s0Var, Context context, VideoFile videoFile, String str, uzv uzvVar, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 16) != 0) {
            uzvVar = null;
        }
        g7s0Var.l(context, videoFile, str, uzvVar);
    }

    static /* synthetic */ void X(g7s0 g7s0Var, Context context, VideoFile videoFile, String str, String str2, dr0 dr0Var, f6m0 f6m0Var, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            dr0Var = null;
        }
        if ((i & 32) != 0) {
            f6m0Var = null;
        }
        g7s0Var.m0(context, videoFile, str, str2, dr0Var, f6m0Var);
    }

    static /* synthetic */ void e(g7s0 g7s0Var, Context context, VideoFile videoFile, VideoScreenMode videoScreenMode, boolean z, gzs gzsVar, int i) {
        if ((i & 4) != 0) {
            videoScreenMode = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        g7s0Var.j(context, videoFile, videoScreenMode, z, (i & 32) == 0, (i & 64) != 0 ? null : gzsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void m(g7s0 g7s0Var, Context context, VideoFile videoFile, UserId userId, gzs gzsVar, t9 t9Var, int i) {
        if ((i & 8) != 0) {
            gzsVar = null;
        }
        if ((i & 16) != 0) {
            t9Var = null;
        }
        g7s0Var.g0(context, videoFile, userId, gzsVar, t9Var);
    }

    default void B() {
        s().H();
    }

    default String D(String str) {
        return "";
    }

    dot0 E();

    default Pair<String, dcn> I() {
        return new Pair<>(null, null);
    }

    fks0 J();

    default void K(Context context, String str, boolean z, long j, gzs gzsVar) {
        gzsVar.invoke();
    }

    oet0 N();

    l1t0 Q();

    anz T();

    default Integer W() {
        return null;
    }

    ydt0 Y();

    zxf0 b0();

    default boolean c(VideoFile videoFile) {
        return false;
    }

    default boolean c0() {
        return true;
    }

    default boolean f() {
        return false;
    }

    default boolean f0(s6s0 s6s0Var) {
        return false;
    }

    bes0 i();

    default ClipsRtmpLivePlaybackSettings j0() {
        ClipsRtmpLivePlaybackSettings clipsRtmpLivePlaybackSettings = ClipsRtmpLivePlaybackSettings.c;
        return ClipsRtmpLivePlaybackSettings.a.a();
    }

    default boolean k() {
        return false;
    }

    default dcn k0(Activity activity, VideoFile videoFile, boolean z, UserId userId, l78 l78Var) {
        return new i7s0();
    }

    default boolean o() {
        return true;
    }

    default boolean o0() {
        return false;
    }

    default boolean p() {
        return j0().a();
    }

    default QualitySettingsType p0() {
        return QualitySettingsType.MOBILE_AUTO;
    }

    default boolean r() {
        return true;
    }

    ezs0 s();

    default boolean s0() {
        return true;
    }

    default QualitySettingsType t0() {
        return QualitySettingsType.AUTO;
    }

    default boolean u() {
        return false;
    }

    o0t0 u0();

    default QualitySettingsInterval w0() {
        return QualitySettingsInterval.AUTO;
    }

    default boolean x(boolean z, boolean z2) {
        return j0().b(z, z2);
    }

    default QualitySettingsType z() {
        return QualitySettingsType.WIFI_AUTO;
    }

    /* compiled from: VideoBridge.kt */
    public static final class a {
        private static final g7s0 STUB = new C2920a();
        public static final /* synthetic */ int a = 0;

        public final g7s0 getSTUB() {
            return STUB;
        }

        /* compiled from: VideoBridge.kt */
        /* renamed from: xsna.g7s0$a$a, reason: collision with other inner class name */
        public static final class C2920a implements g7s0 {
            public final g b = new g();
            public final f c = new f();
            public final d d = new d();
            public final e e = new e();
            public final h f = new h();
            public final C2921a g = new C2921a();
            public final c h = new c();
            public final b i = new b();
            public final rks0 j = rks0.a;

            /* compiled from: VideoBridge.kt */
            /* renamed from: xsna.g7s0$a$a$b */
            public static final class b implements zxf0 {
                @Override // xsna.zxf0
                public final boolean e(VideoFile videoFile) {
                    return false;
                }
            }

            /* compiled from: VideoBridge.kt */
            /* renamed from: xsna.g7s0$a$a$c */
            public static final class c implements bes0 {
                @Override // xsna.bes0
                public final boolean a() {
                    return false;
                }

                @Override // xsna.bes0
                public final Integer b() {
                    return null;
                }

                @Override // xsna.bes0
                public final Set<VideoUrl> c() {
                    return EmptySet.b;
                }

                @Override // xsna.bes0
                public final boolean d() {
                    return false;
                }

                @Override // xsna.bes0
                public final boolean e() {
                    return false;
                }

                @Override // xsna.bes0
                public final boolean f() {
                    return false;
                }

                @Override // xsna.bes0
                public final boolean g() {
                    return false;
                }

                @Override // xsna.bes0
                public final boolean h() {
                    return false;
                }

                @Override // xsna.bes0
                public final String i() {
                    return "";
                }
            }

            @Override // xsna.g7s0
            public final String D(String str) {
                return "";
            }

            @Override // xsna.g7s0
            public final dot0 E() {
                return this.f;
            }

            @Override // xsna.g7s0
            public final fks0 J() {
                return this.j;
            }

            @Override // xsna.g7s0
            public final void K(Context context, String str, boolean z, long j, gzs gzsVar) {
                gzsVar.invoke();
            }

            @Override // xsna.g7s0
            public final oet0 N() {
                return new oet0(false, 31);
            }

            @Override // xsna.g7s0
            public final l1t0 Q() {
                return this.c;
            }

            @Override // xsna.g7s0
            public final anz T() {
                return this.g;
            }

            @Override // xsna.g7s0
            public final Integer W() {
                return null;
            }

            @Override // xsna.g7s0
            public final ydt0 Y() {
                return this.b;
            }

            @Override // xsna.g7s0
            public final zxf0 b0() {
                return this.i;
            }

            @Override // xsna.g7s0
            public final boolean c(VideoFile videoFile) {
                return false;
            }

            @Override // xsna.g7s0
            public final boolean c0() {
                return true;
            }

            @Override // xsna.g7s0
            public final boolean f() {
                return false;
            }

            @Override // xsna.g7s0
            public final boolean f0(s6s0 s6s0Var) {
                return false;
            }

            @Override // xsna.g7s0
            public final bes0 i() {
                return this.h;
            }

            @Override // xsna.g7s0
            public final ClipsRtmpLivePlaybackSettings j0() {
                ClipsRtmpLivePlaybackSettings clipsRtmpLivePlaybackSettings = ClipsRtmpLivePlaybackSettings.c;
                return ClipsRtmpLivePlaybackSettings.a.a();
            }

            @Override // xsna.g7s0
            public final boolean k() {
                return false;
            }

            @Override // xsna.g7s0
            public final dcn k0(Activity activity, VideoFile videoFile, boolean z, UserId userId, l78 l78Var) {
                return new i7s0();
            }

            @Override // xsna.g7s0
            public final boolean o() {
                return true;
            }

            @Override // xsna.g7s0
            public final boolean o0() {
                return false;
            }

            @Override // xsna.g7s0
            public final QualitySettingsType p0() {
                return QualitySettingsType.MOBILE_AUTO;
            }

            @Override // xsna.g7s0
            public final boolean r() {
                return true;
            }

            @Override // xsna.g7s0
            public final ezs0 s() {
                return this.d;
            }

            @Override // xsna.g7s0
            public final boolean s0() {
                return true;
            }

            @Override // xsna.g7s0
            public final QualitySettingsType t0() {
                return QualitySettingsType.AUTO;
            }

            @Override // xsna.g7s0
            public final boolean u() {
                return false;
            }

            @Override // xsna.g7s0
            public final o0t0 u0() {
                return this.e;
            }

            @Override // xsna.g7s0
            public final QualitySettingsInterval w0() {
                return QualitySettingsInterval.AUTO;
            }

            @Override // xsna.g7s0
            public final QualitySettingsType z() {
                return QualitySettingsType.WIFI_AUTO;
            }

            /* compiled from: VideoBridge.kt */
            /* renamed from: xsna.g7s0$a$a$a, reason: collision with other inner class name */
            public static final class C2921a implements anz {
                @Override // xsna.anz
                public final io.reactivex.rxjava3.core.q<Boolean> A(int i, UserId userId) {
                    return io.reactivex.rxjava3.internal.operators.observable.g0.b;
                }

                @Override // xsna.anz
                public final io.reactivex.rxjava3.core.q<Boolean> B(int i, UserId userId) {
                    return io.reactivex.rxjava3.internal.operators.observable.g0.b;
                }

                @Override // xsna.anz
                public final fjz D(ViewGroup viewGroup, yjk0 yjk0Var, boolean z, emz emzVar) {
                    return new zmz();
                }

                @Override // xsna.anz
                public final io.reactivex.rxjava3.core.q E(int i, UserId userId, String str, boolean z) {
                    return io.reactivex.rxjava3.internal.operators.observable.g0.b;
                }

                @Override // xsna.anz
                public final p1u0 F(int i, int i2, int i3, ImageScreenSize imageScreenSize, gzs gzsVar) {
                    return null;
                }

                @Override // xsna.anz
                public final io.reactivex.rxjava3.core.q<Boolean> G(UserId userId) {
                    return io.reactivex.rxjava3.internal.operators.observable.g0.b;
                }

                @Override // xsna.anz
                public final io.reactivex.rxjava3.core.q H(int i, UserId userId, UserId userId2) {
                    return io.reactivex.rxjava3.internal.operators.observable.g0.b;
                }

                @Override // xsna.anz
                public final ne8 I(pe8 pe8Var, String str) {
                    return new xh8();
                }

                @Override // xsna.anz
                public final io.reactivex.rxjava3.core.q<Boolean> J(int i, UserId userId) {
                    return io.reactivex.rxjava3.internal.operators.observable.g0.b;
                }

                @Override // xsna.anz
                public final io.reactivex.rxjava3.core.q<Boolean> L(int i, UserId userId, int i2) {
                    return io.reactivex.rxjava3.internal.operators.observable.g0.b;
                }

                @Override // xsna.anz
                public final io.reactivex.rxjava3.core.q<Integer> M(int i, UserId userId) {
                    return io.reactivex.rxjava3.internal.operators.observable.g0.b;
                }

                @Override // xsna.anz
                public final io.reactivex.rxjava3.core.q N(String str, JSONObject jSONObject, String str2, String str3) {
                    return io.reactivex.rxjava3.internal.operators.observable.g0.b;
                }

                @Override // xsna.anz
                public final boolean O() {
                    return false;
                }

                @Override // xsna.anz
                public final io.reactivex.rxjava3.core.q<Boolean> P(int i, UserId userId, UserId userId2) {
                    return io.reactivex.rxjava3.internal.operators.observable.g0.b;
                }

                @Override // xsna.anz
                public final oiz Q(piz pizVar) {
                    return new alz();
                }

                @Override // xsna.anz
                public final io.reactivex.rxjava3.core.q<Boolean> R(UserId userId) {
                    return io.reactivex.rxjava3.internal.operators.observable.g0.b;
                }

                @Override // xsna.anz
                public final io.reactivex.rxjava3.core.q S(int i, UserId userId) {
                    return io.reactivex.rxjava3.internal.operators.observable.g0.b;
                }

                @Override // xsna.anz
                public final io.reactivex.rxjava3.core.q T(int i, UserId userId) {
                    return io.reactivex.rxjava3.internal.operators.observable.g0.b;
                }

                @Override // xsna.anz
                public final piz U(Context context) {
                    return new znz(context);
                }

                @Override // xsna.anz
                public final boolean W() {
                    return false;
                }

                @Override // xsna.anz
                public final io.reactivex.rxjava3.core.q X(int i, UserId userId) {
                    return io.reactivex.rxjava3.internal.operators.observable.g0.b;
                }

                @Override // xsna.anz
                public final io.reactivex.rxjava3.core.q<Boolean> Y(int i, UserId userId) {
                    return io.reactivex.rxjava3.internal.operators.observable.g0.b;
                }

                @Override // xsna.anz
                public final rnz Z(piz pizVar) {
                    return new anz.a();
                }

                @Override // xsna.anz
                public final io.reactivex.rxjava3.core.q a(int i, UserId userId) {
                    return io.reactivex.rxjava3.internal.operators.observable.g0.b;
                }

                @Override // xsna.anz
                public final flz c(kxc kxcVar, r4k r4kVar) {
                    return null;
                }

                @Override // xsna.anz
                public final io.reactivex.rxjava3.core.q<Boolean> d(UserId userId, boolean z) {
                    return io.reactivex.rxjava3.internal.operators.observable.g0.b;
                }

                @Override // xsna.anz
                public final io.reactivex.rxjava3.core.q e(int i, UserId userId) {
                    return io.reactivex.rxjava3.internal.operators.observable.g0.b;
                }

                @Override // xsna.anz
                public final io.reactivex.rxjava3.core.q f(int i, UserId userId) {
                    return io.reactivex.rxjava3.internal.operators.observable.g0.b;
                }

                @Override // xsna.anz
                public final Set<UserProfile> g(String str) {
                    return EmptySet.b;
                }

                @Override // xsna.anz
                public final io.reactivex.rxjava3.core.q<Boolean> h(int i, UserId userId, String str) {
                    return io.reactivex.rxjava3.internal.operators.observable.g0.b;
                }

                @Override // xsna.anz
                public final io.reactivex.rxjava3.core.q<Boolean> i(int i, UserId userId) {
                    return io.reactivex.rxjava3.internal.operators.observable.g0.b;
                }

                @Override // xsna.anz
                public final io.reactivex.rxjava3.core.q<rit0> j() {
                    return io.reactivex.rxjava3.internal.operators.observable.g0.b;
                }

                @Override // xsna.anz
                public final io.reactivex.rxjava3.core.q<Boolean> k(int i, UserId userId) {
                    return io.reactivex.rxjava3.internal.operators.observable.g0.b;
                }

                @Override // xsna.anz
                public final io.reactivex.rxjava3.core.q<VideoGetCommentsExtendedResponseDto> l(int i, UserId userId, int i2) {
                    return io.reactivex.rxjava3.internal.operators.observable.g0.b;
                }

                @Override // xsna.anz
                public final io.reactivex.rxjava3.core.q m(int i, UserId userId) {
                    return io.reactivex.rxjava3.internal.operators.observable.g0.b;
                }

                @Override // xsna.anz
                public final boolean m0(int i, UserId userId) {
                    return false;
                }

                @Override // xsna.anz
                public final boolean n() {
                    return false;
                }

                @Override // xsna.anz
                public final io.reactivex.rxjava3.core.q<vqk0> p(wqk0 wqk0Var) {
                    return io.reactivex.rxjava3.internal.operators.observable.g0.b;
                }

                @Override // xsna.anz
                public final pe8 q(l7s l7sVar) {
                    return new jk8(l7sVar);
                }

                @Override // xsna.anz
                public final io.reactivex.rxjava3.core.q<VideoStopStreamingResponseDto> r(int i, UserId userId) {
                    return io.reactivex.rxjava3.internal.operators.observable.g0.b;
                }

                @Override // xsna.anz
                public final io.reactivex.rxjava3.core.q s(VideoFile videoFile, String str, boolean z) {
                    return io.reactivex.rxjava3.internal.operators.observable.g0.b;
                }

                @Override // xsna.anz
                public final boolean t() {
                    return false;
                }

                @Override // xsna.anz
                public final io.reactivex.rxjava3.core.a u(int i, UserId userId, boolean z) {
                    return io.reactivex.rxjava3.internal.operators.completable.i.b;
                }

                @Override // xsna.anz
                public final io.reactivex.rxjava3.core.q v(int i, UserId userId) {
                    return io.reactivex.rxjava3.internal.operators.observable.g0.b;
                }

                @Override // xsna.anz
                public final prk0 x(Context context) {
                    return new ysk0(context);
                }

                @Override // xsna.anz
                public final boolean y() {
                    return false;
                }

                @Override // xsna.anz
                public final void K() {
                }

                @Override // xsna.anz
                public final void b() {
                }

                @Override // xsna.anz
                public final void w() {
                }

                @Override // xsna.anz
                public final void C(boolean z) {
                }

                @Override // xsna.anz
                public final void o(boolean z) {
                }

                @Override // xsna.anz
                public final void z(long j) {
                }

                @Override // xsna.anz
                public final void V(UserProfile userProfile, String str) {
                }
            }

            /* compiled from: VideoBridge.kt */
            /* renamed from: xsna.g7s0$a$a$d */
            public static final class d implements ezs0 {
                @Override // xsna.ezs0
                public final io.reactivex.rxjava3.core.q<List<czs0>> B() {
                    return io.reactivex.rxjava3.internal.operators.observable.g0.b;
                }

                @Override // xsna.ezs0
                public final boolean E() {
                    return false;
                }

                @Override // xsna.ezs0
                public final boolean G() {
                    return false;
                }

                @Override // xsna.ezs0
                public final boolean c(String str) {
                    return false;
                }

                @Override // xsna.ezs0
                public final mm80 f() {
                    return null;
                }

                @Override // xsna.ezs0
                public final io.reactivex.rxjava3.core.x<List<czs0>> h() {
                    return io.reactivex.rxjava3.core.x.k(EmptyList.b);
                }

                @Override // xsna.ezs0
                public final boolean isEnabled() {
                    return false;
                }

                @Override // xsna.ezs0
                public final boolean j() {
                    return false;
                }

                @Override // xsna.ezs0
                public final boolean p() {
                    return false;
                }

                @Override // xsna.ezs0
                public final long q() {
                    return 0L;
                }

                @Override // xsna.ezs0
                public final boolean r() {
                    return false;
                }

                @Override // xsna.ezs0
                public final DownloadInfo s(String str) {
                    return null;
                }

                @Override // xsna.ezs0
                public final Map<String, DownloadInfo> u() {
                    return jgp.b;
                }

                @Override // xsna.ezs0
                public final String v(String str) {
                    return "";
                }

                @Override // xsna.ezs0
                public final boolean y() {
                    return false;
                }

                @Override // xsna.ezs0
                public final void H() {
                }

                @Override // xsna.ezs0
                public final void a() {
                }

                @Override // xsna.ezs0
                public final void e() {
                }

                @Override // xsna.ezs0
                public final void init() {
                }

                @Override // xsna.ezs0
                public final void l() {
                }

                @Override // xsna.ezs0
                public final a.InterfaceC0045a C(a.InterfaceC0045a interfaceC0045a) {
                    return interfaceC0045a;
                }

                @Override // xsna.ezs0
                public final void D(VideoFileOld videoFileOld) {
                }

                @Override // xsna.ezs0
                public final void b(boolean z) {
                }

                @Override // xsna.ezs0
                public final void g(boolean z) {
                }

                @Override // xsna.bzs0
                public final void m(String str) {
                }

                @Override // xsna.ezs0
                public final void t(hu70 hu70Var) {
                }

                @Override // xsna.ezs0
                public final void z(hu70 hu70Var) {
                }

                @Override // xsna.ezs0
                public final void F(VideoFile videoFile, VideoScreenMode videoScreenMode) {
                }

                @Override // xsna.ezs0
                public final void d(VideoFile videoFile, VideoScreenMode videoScreenMode) {
                }

                @Override // xsna.ezs0
                public final void n(VideoFile videoFile, VideoScreenMode videoScreenMode) {
                }

                @Override // xsna.ezs0
                public final void w(ths0 ths0Var, Context context, boolean z, gzs gzsVar, z2d0 z2d0Var) {
                }
            }

            /* compiled from: VideoBridge.kt */
            /* renamed from: xsna.g7s0$a$a$h */
            public static final class h implements dot0 {
                @Override // xsna.dot0
                public final io.reactivex.rxjava3.core.q<List<VideoUploadEvent>> b() {
                    return io.reactivex.rxjava3.internal.operators.observable.g0.b;
                }

                @Override // xsna.dot0
                public final SparseArray<VideoUploadEvent> e() {
                    return new SparseArray<>();
                }

                @Override // xsna.dot0
                public final void clear() {
                }

                @Override // xsna.dot0
                public final void a(int i) {
                }

                @Override // xsna.dot0
                public final void c(int i) {
                }

                @Override // xsna.dot0
                public final void d(int i) {
                }

                @Override // xsna.dot0
                public final void g(UserId userId) {
                }

                @Override // xsna.dot0
                public final void h(int i) {
                }

                @Override // xsna.dot0
                public final void j(dot0.a aVar) {
                }

                @Override // xsna.dot0
                public final void k(int i, String str) {
                }

                @Override // xsna.dot0
                public final void i(int i, Throwable th, boolean z) {
                }

                @Override // xsna.dot0
                public final void f(int i, int i2, int i3, UserId userId) {
                }
            }

            @Override // xsna.g7s0
            public final void O() {
            }

            @Override // xsna.g7s0
            public final void U() {
            }

            @Override // xsna.g7s0
            public final void a() {
            }

            @Override // xsna.g7s0
            public final void n0() {
            }

            @Override // xsna.g7s0
            public final void b(VideoFile videoFile) {
            }

            @Override // xsna.g7s0
            public final void d(VideoFile videoFile) {
            }

            @Override // xsna.g7s0
            public final void h0(QualitySettingsType qualitySettingsType) {
            }

            @Override // xsna.g7s0
            public final void q0(QualitySettingsType qualitySettingsType) {
            }

            @Override // xsna.g7s0
            public final void r0(String str) {
            }

            @Override // xsna.g7s0
            public final void t(VideoUploadFragment videoUploadFragment) {
            }

            @Override // xsna.g7s0
            public final void v(VideoUploadFragment videoUploadFragment) {
            }

            @Override // xsna.g7s0
            public final void w(int i) {
            }

            /* compiled from: VideoBridge.kt */
            /* renamed from: xsna.g7s0$a$a$g */
            public static final class g implements ydt0 {
                @Override // xsna.ydt0
                public final void k(Context context, VideoFile videoFile, String str, AdsDataProvider adsDataProvider, String str2, Object obj, boolean z, izs izsVar, ReplyInfo replyInfo, String str3, boolean z2, boolean z3, boolean z4, boolean z5, long j, SearchStatsLoggingInfo searchStatsLoggingInfo, jcs0 jcs0Var, boolean z6, VideoTransitionSource videoTransitionSource) {
                }

                @Override // xsna.ydt0
                public final void D(Context context, boolean z) {
                }

                @Override // xsna.ydt0
                public final void E(Context context, UserId userId) {
                }

                @Override // xsna.ydt0
                public final void F(VideoAlbum videoAlbum, jbs jbsVar) {
                }

                @Override // xsna.ydt0
                public final void r(PrivacySetting privacySetting, jbs jbsVar) {
                }

                @Override // xsna.ydt0
                public final void t(Context context, VideoFile videoFile) {
                }

                @Override // xsna.ydt0
                public final void a(FragmentActivity fragmentActivity, VideoAdData videoAdData, io2 io2Var) {
                }

                @Override // xsna.ydt0
                public final void b(VideoAlbum videoAlbum, boolean z, jbs jbsVar) {
                }

                @Override // xsna.ydt0
                public final void i(Activity activity, VideoFile videoFile, VideoFeedDialogParams videoFeedDialogParams) {
                }

                @Override // xsna.ydt0
                public final void w(int i, Context context, UserId userId) {
                }

                @Override // xsna.ydt0
                public final void z(Context context, VideoFile videoFile, dz20 dz20Var) {
                }

                @Override // xsna.ydt0
                public final void d(Context context, VideoFile videoFile, String str, AdsDataProvider adsDataProvider, String str2, Object obj, boolean z, String str3, boolean z2, long j, SearchStatsLoggingInfo searchStatsLoggingInfo, ReplyInfo replyInfo, VideoUrlInfo videoUrlInfo) {
                }

                @Override // xsna.ydt0
                public final void B(Context context, VideoFile videoFile, String str, String str2) {
                }

                @Override // xsna.ydt0
                public final void g(Context context, VideoFile videoFile, String str, String str2) {
                }

                @Override // xsna.ydt0
                public final void q(Context context, UserId userId, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, izs<? super qs80, s3q0> izsVar) {
                }

                @Override // xsna.ydt0
                public final void v(Context context, String str, String str2, String str3) {
                }

                @Override // xsna.ydt0
                public final void m(Context context, UserId userId, String str, String str2, String str3, boolean z, SearchStatsLoggingInfo searchStatsLoggingInfo, String str4, String str5, String str6) {
                }

                @Override // xsna.ydt0
                public final void C(Activity activity, VideoAlbum videoAlbum, String str, String str2, SearchStatsLoggingInfo searchStatsLoggingInfo) {
                }

                @Override // xsna.ydt0
                public final void c(Activity activity, UploadVideoAction uploadVideoAction, UserId userId, int i, String str) {
                }

                @Override // xsna.ydt0
                public final void n(Activity activity, VideoFile videoFile, boolean z, String str, String str2) {
                }

                @Override // xsna.ydt0
                public final void x(Context context, VideoFile videoFile, String str, SearchStatsLoggingInfo searchStatsLoggingInfo, String str2) {
                }

                @Override // xsna.ydt0
                public final void A(Context context, oap<? extends Uri, UserId> oapVar, String str, boolean z, String str2, String str3, boolean z2, boolean z3, boolean z4, Boolean bool, SearchStatsLoggingInfo searchStatsLoggingInfo, String str4) {
                }

                @Override // xsna.ydt0
                public final void l(Activity activity, VideoFile videoFile, io2 io2Var, boolean z, SearchStatsLoggingInfo searchStatsLoggingInfo, String str, AdsDataProvider adsDataProvider, Boolean bool, String str2) {
                }
            }

            /* compiled from: VideoBridge.kt */
            /* renamed from: xsna.g7s0$a$a$e */
            public static final class e implements o0t0 {
                @Override // xsna.o0t0
                public final uys0 b(Context context) {
                    return new h7s0();
                }

                @Override // xsna.o0t0
                public final void a(Context context, svd svdVar) {
                }

                @Override // xsna.o0t0
                public final void c(VideoFileOld videoFileOld, Activity activity, boolean z, boolean z2) {
                }
            }

            @Override // xsna.g7s0
            public final void A(Activity activity, VideoFile videoFile) {
            }

            @Override // xsna.g7s0
            public final void G(String str, w0s0.a aVar) {
            }

            @Override // xsna.g7s0
            public final void L(VideoFile videoFile, VideoScreenMode videoScreenMode) {
            }

            @Override // xsna.g7s0
            public final void M(Activity activity, VideoFile videoFile) {
            }

            @Override // xsna.g7s0
            public final void P(Context context, VideoFile videoFile) {
            }

            @Override // xsna.g7s0
            public final void S(Context context, VideoFile videoFile) {
            }

            @Override // xsna.g7s0
            public final void d0(Context context, izs<? super adt0.a, adt0> izsVar) {
            }

            @Override // xsna.g7s0
            public final void h(Context context, VideoAlbum videoAlbum) {
            }

            @Override // xsna.g7s0
            public final void n(Context context, UserId userId) {
            }

            /* compiled from: VideoBridge.kt */
            /* renamed from: xsna.g7s0$a$a$f */
            public static final class f implements l1t0 {
                @Override // xsna.l1t0
                public final View e(Context context, float f) {
                    return new View(context);
                }

                @Override // xsna.l1t0
                public final void b(int i, int i2, View view) {
                }

                @Override // xsna.l1t0
                public final void f(int i, int i2, View view) {
                }

                @Override // xsna.l1t0
                public final void a(View view, float f, float f2, float f3, float f4) {
                }

                @Override // xsna.l1t0
                public final void d(View view, VideoFile videoFile, View view2, izs izsVar, izs izsVar2, View view3) {
                }
            }

            @Override // xsna.g7s0
            public final void Z(Context context, String str, boolean z) {
            }

            @Override // xsna.g7s0
            public final void g(Context context, VideoAlbum videoAlbum, boolean z) {
            }

            @Override // xsna.g7s0
            public final void i0(Activity activity, UserId userId, int i) {
            }

            @Override // xsna.g7s0
            public final void q(Context context, UserId userId, boolean z) {
            }

            @Override // xsna.g7s0
            public final void y(Context context, VideoFile videoFile, int i) {
            }

            @Override // xsna.g7s0
            public final void H(Activity activity, VideoFile videoFile, boolean z, com.vk.movika.sdk.base.ui.s sVar) {
            }

            @Override // xsna.g7s0
            public final void V(Context context, Uri uri, VideoPublicationContext videoPublicationContext, int i) {
            }

            @Override // xsna.g7s0
            public final void l(Context context, VideoFile videoFile, String str, gzs gzsVar) {
            }

            @Override // xsna.g7s0
            public final void l0(Context context, VideoFile videoFile, String str, String str2) {
            }

            @Override // xsna.g7s0
            public final void v0(Context context, int i, UserId userId, gzs<s3q0> gzsVar) {
            }

            @Override // xsna.g7s0
            public final void F(ContextWrapper contextWrapper, VideoFile videoFile, boolean z, String str, String str2) {
            }

            @Override // xsna.g7s0
            public final void g0(Context context, VideoFile videoFile, UserId userId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
            }

            @Override // xsna.g7s0
            public final void a0(Activity activity, UserId userId, String str, String str2, String str3, String str4) {
            }

            @Override // xsna.g7s0
            public final void j(Context context, VideoFile videoFile, VideoScreenMode videoScreenMode, boolean z, boolean z2, gzs gzsVar) {
            }

            @Override // xsna.g7s0
            public final void m0(Context context, VideoFile videoFile, String str, String str2, wzs<? super Boolean, ? super gmq, s3q0> wzsVar, izs<? super gmq, s3q0> izsVar) {
            }

            @Override // xsna.g7s0
            public final void e0(FragmentActivity fragmentActivity, String str, int i, UserId userId, Boolean bool, m960 m960Var, tbe0 tbe0Var) {
            }
        }
    }

    default void O() {
    }

    default void U() {
    }

    default void a() {
    }

    default void n0() {
    }

    default void b(VideoFile videoFile) {
    }

    default void d(VideoFile videoFile) {
    }

    default void h0(QualitySettingsType qualitySettingsType) {
    }

    default void q0(QualitySettingsType qualitySettingsType) {
    }

    default void r0(String str) {
    }

    default void t(VideoUploadFragment videoUploadFragment) {
    }

    default void v(VideoUploadFragment videoUploadFragment) {
    }

    default void w(int i) {
    }

    default void A(Activity activity, VideoFile videoFile) {
    }

    default void G(String str, w0s0.a aVar) {
    }

    default void L(VideoFile videoFile, VideoScreenMode videoScreenMode) {
    }

    default void M(Activity activity, VideoFile videoFile) {
    }

    default void P(Context context, VideoFile videoFile) {
    }

    default void S(Context context, VideoFile videoFile) {
    }

    default void d0(Context context, izs<? super adt0.a, adt0> izsVar) {
    }

    default void h(Context context, VideoAlbum videoAlbum) {
    }

    default void n(Context context, UserId userId) {
    }

    default void Z(Context context, String str, boolean z) {
    }

    default void g(Context context, VideoAlbum videoAlbum, boolean z) {
    }

    default void i0(Activity activity, UserId userId, int i) {
    }

    default void q(Context context, UserId userId, boolean z) {
    }

    default void y(Context context, VideoFile videoFile, int i) {
    }

    default void H(Activity activity, VideoFile videoFile, boolean z, com.vk.movika.sdk.base.ui.s sVar) {
    }

    default void V(Context context, Uri uri, VideoPublicationContext videoPublicationContext, int i) {
    }

    default void l(Context context, VideoFile videoFile, String str, gzs gzsVar) {
    }

    default void l0(Context context, VideoFile videoFile, String str, String str2) {
    }

    default void v0(Context context, int i, UserId userId, gzs<s3q0> gzsVar) {
    }

    default void F(ContextWrapper contextWrapper, VideoFile videoFile, boolean z, String str, String str2) {
    }

    default void g0(Context context, VideoFile videoFile, UserId userId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
    }

    default void a0(Activity activity, UserId userId, String str, String str2, String str3, String str4) {
    }

    default void j(Context context, VideoFile videoFile, VideoScreenMode videoScreenMode, boolean z, boolean z2, gzs gzsVar) {
    }

    default void m0(Context context, VideoFile videoFile, String str, String str2, wzs<? super Boolean, ? super gmq, s3q0> wzsVar, izs<? super gmq, s3q0> izsVar) {
    }

    default void e0(FragmentActivity fragmentActivity, String str, int i, UserId userId, Boolean bool, m960 m960Var, tbe0 tbe0Var) {
    }
}
