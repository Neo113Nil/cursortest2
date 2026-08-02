package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.vk.clips.config.viewers.api.experiments.models.ClipsRtmpLivePlaybackSettings;
import com.vk.clips.edit.privacy.PrivacyViewer;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedOpenAction;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.viewer.experiments.models.TabsPositionConfig;
import com.vk.clips.viewer.api.prefs.ClipsTrendsPrefs;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;

/* compiled from: ClipsStubs.kt */
/* loaded from: classes17.dex */
public interface j5f {
    public static final a a = a.a;

    /* compiled from: ClipsStubs.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final g b = new g();
        public static final l c = new l();
        public static final d d = new d();
        public static final k e = new k();
        public static final h f = new h();
        public static final m g = new m();
        public static final j h = new j();
        public static final f i = new f();
        public static final c j = new c();
        public static final i k = new i();
        public static final C3093a l = new C3093a();
        public static final b m = new b();
        public static final e n = new e();

        /* compiled from: ClipsStubs.kt */
        /* renamed from: xsna.j5f$a$a, reason: collision with other inner class name */
        public static final class C3093a {
        }

        /* compiled from: ClipsStubs.kt */
        public static final class b implements jgd {
            @Override // xsna.jgd
            public final boolean a(Context context) {
                return false;
            }

            @Override // xsna.jgd
            public final boolean b() {
                return true;
            }

            @Override // xsna.jgd
            public final io.reactivex.rxjava3.internal.operators.completable.t c() {
                return io.reactivex.rxjava3.internal.operators.completable.t.b;
            }
        }

        /* compiled from: ClipsStubs.kt */
        public static final class c implements kgd {
        }

        /* compiled from: ClipsStubs.kt */
        public static final class f implements v1e {
            public final TabsPositionConfig a;
            public final vqd b;
            public final ClipsRtmpLivePlaybackSettings c;

            public f() {
                hpf hpfVar = hpf.b;
                this.a = hpf.c;
                this.b = hpf.i;
                this.c = hpf.k;
            }

            @Override // xsna.v1e
            public final boolean a() {
                return false;
            }

            @Override // xsna.v1e
            public final Integer b() {
                return null;
            }

            @Override // xsna.v1e
            public final boolean c() {
                return false;
            }

            @Override // xsna.v1e
            public final TabsPositionConfig d() {
                return this.a;
            }

            @Override // xsna.v1e
            public final ArrayList<Integer> e() {
                return null;
            }

            @Override // xsna.v1e
            public final boolean f() {
                return false;
            }

            @Override // xsna.v1e
            public final boolean g() {
                return false;
            }

            @Override // xsna.v1e
            public final ClipsRtmpLivePlaybackSettings i() {
                return this.c;
            }

            @Override // xsna.v1e
            public final boolean j() {
                return false;
            }

            @Override // xsna.v1e
            public final boolean k() {
                return false;
            }

            @Override // xsna.v1e
            public final vqd l() {
                return this.b;
            }

            @Override // xsna.v1e
            public final boolean m() {
                return false;
            }

            @Override // xsna.v1e
            public final boolean n() {
                return false;
            }
        }

        /* compiled from: ClipsStubs.kt */
        public static final class g implements lne {
            public boolean a;
            public boolean b;
            public boolean c;
            public boolean d;
            public boolean e;

            @Override // xsna.lne
            public final boolean a() {
                return this.c;
            }

            @Override // xsna.lne
            public final boolean b() {
                return this.d;
            }

            @Override // xsna.lne
            public final boolean c() {
                return this.e;
            }

            @Override // xsna.lne
            public final void d() {
                this.e = true;
            }

            @Override // xsna.lne
            public final void e() {
                this.c = true;
            }

            @Override // xsna.lne
            public final boolean f() {
                return this.b;
            }

            @Override // xsna.lne
            public final void g() {
                this.b = true;
            }

            @Override // xsna.lne
            public final void h() {
                this.d = true;
            }

            @Override // xsna.lne
            public final void i() {
                this.a = true;
            }

            @Override // xsna.lne
            public final boolean j() {
                return this.a;
            }
        }

        /* compiled from: ClipsStubs.kt */
        public static final class k implements daf {
            public boolean a;
            public boolean b;
            public boolean c;
            public boolean d;
            public boolean e;
            public boolean f;

            @Override // xsna.daf
            public final void a() {
                this.d = true;
            }

            @Override // xsna.daf
            public final void b() {
                this.b = true;
            }

            @Override // xsna.daf
            public final boolean c() {
                return this.f;
            }

            @Override // xsna.daf
            public final boolean d() {
                return this.e;
            }

            @Override // xsna.daf
            public final boolean e() {
                return this.b;
            }

            @Override // xsna.daf
            public final void f() {
                this.e = true;
            }

            @Override // xsna.daf
            public final boolean g() {
                return this.a;
            }

            @Override // xsna.daf
            public final void h() {
                this.f = true;
            }

            @Override // xsna.daf
            public final void i() {
                this.c = true;
            }

            @Override // xsna.daf
            public final void j() {
                this.a = true;
            }

            @Override // xsna.daf
            public final boolean k() {
                return this.c;
            }

            @Override // xsna.daf
            public final boolean l() {
                return this.d;
            }
        }

        /* compiled from: ClipsStubs.kt */
        public static final class m implements unf {
            @Override // xsna.unf
            public final vcd a(Context context) {
                return null;
            }

            @Override // xsna.unf
            public final uoc b(Context context) {
                return null;
            }

            @Override // xsna.unf
            public final ucd c(vcd vcdVar, wmf wmfVar) {
                return null;
            }
        }

        /* compiled from: ClipsStubs.kt */
        public static final class d implements xid {
            public boolean a;
            public long b;

            @Override // xsna.xid
            public final boolean getEnabled() {
                return this.a;
            }

            @Override // xsna.xid
            public final long getTimestamp() {
                return this.b;
            }

            @Override // xsna.xid
            public final void setEnabled(boolean z) {
                this.a = z;
            }

            @Override // xsna.xid
            public final void setTimestamp(long j) {
                this.b = j;
            }

            @Override // xsna.xid
            public final void clear() {
            }
        }

        /* compiled from: ClipsStubs.kt */
        public static final class h implements jwe {
            public final k b;
            public final g c;
            public final l d;
            public final d e;
            public long f;
            public long g;
            public boolean h;
            public boolean i;
            public Set<String> j;
            public Set<String> k;
            public UserId l;
            public UserId[] m;
            public boolean n;
            public boolean o;
            public boolean p;
            public boolean q;
            public boolean r;

            public h() {
                a aVar = a.a;
                this.b = a.e;
                this.c = a.b;
                this.d = a.c;
                this.e = a.d;
                this.f = 0L;
                EmptySet emptySet = EmptySet.b;
                this.j = emptySet;
                this.k = emptySet;
                this.m = new UserId[0];
                this.n = false;
                this.o = true;
            }

            @Override // xsna.jwe
            public final boolean A() {
                return this.p;
            }

            @Override // xsna.jwe
            public final void B(Set<String> set) {
                this.j = set;
            }

            @Override // xsna.jwe
            public final void C(boolean z) {
                this.p = z;
            }

            @Override // xsna.jwe
            public final UserId[] D() {
                return this.m;
            }

            @Override // xsna.jwe
            public final void E(boolean z) {
                this.q = z;
            }

            @Override // xsna.jwe
            public final boolean F() {
                return this.i;
            }

            @Override // xsna.jwe
            public final void G(boolean z) {
                this.h = z;
            }

            @Override // xsna.jwe
            public final long H() {
                return this.g;
            }

            @Override // xsna.jwe
            public final daf b() {
                return this.b;
            }

            @Override // xsna.jwe
            public final Set<String> c() {
                return this.j;
            }

            @Override // xsna.jwe
            public final UserId d() {
                return this.l;
            }

            @Override // xsna.jwe
            public final ClipsTrendsPrefs e() {
                return this.d;
            }

            @Override // xsna.jwe
            public final lne f() {
                return this.c;
            }

            @Override // xsna.jwe
            public final void g() {
                this.n = true;
            }

            @Override // xsna.jwe
            public final void h(boolean z) {
                this.i = z;
            }

            @Override // xsna.jwe
            public final void i(UserId[] userIdArr) {
                this.m = userIdArr;
            }

            @Override // xsna.jwe
            public final boolean j() {
                return this.o;
            }

            @Override // xsna.jwe
            public final long k() {
                return this.f;
            }

            @Override // xsna.jwe
            public final boolean l() {
                return this.h;
            }

            @Override // xsna.jwe
            public final xid m() {
                return this.e;
            }

            @Override // xsna.jwe
            public final boolean n() {
                return false;
            }

            @Override // xsna.jwe
            public final boolean o() {
                return this.r;
            }

            @Override // xsna.jwe
            public final Set<String> p() {
                return this.k;
            }

            @Override // xsna.jwe
            public final boolean q() {
                return this.q;
            }

            @Override // xsna.jwe
            public final boolean r() {
                return this.n;
            }

            @Override // xsna.jwe
            public final void s(long j) {
                this.f = j;
            }

            @Override // xsna.jwe
            public final void t(long j) {
                this.g = j;
            }

            @Override // xsna.jwe
            public final void v(Set<String> set) {
                this.k = set;
            }

            @Override // xsna.jwe
            public final void x(UserId userId) {
                this.l = userId;
            }

            @Override // xsna.jwe
            public final void y() {
                this.o = true;
            }

            @Override // xsna.jwe
            public final void z(boolean z) {
                this.r = z;
            }

            @Override // xsna.jwe
            public final void w() {
            }
        }

        /* compiled from: ClipsStubs.kt */
        public static final class i implements qwe {
            @Override // xsna.qwe
            public final PostingVisibilityMode a() {
                return PostingVisibilityMode.ALL;
            }

            @Override // xsna.qwe
            public final List<PrivacySetting.PrivacyRule> b(PostingVisibilityMode postingVisibilityMode) {
                return EmptyList.b;
            }

            @Override // xsna.qwe
            public final List<PrivacySetting.PrivacyRule> c(boolean z, boolean z2) {
                return EmptyList.b;
            }

            @Override // xsna.qwe
            public final boolean d(VideoFile videoFile) {
                return false;
            }

            @Override // xsna.qwe
            public final io.reactivex.rxjava3.core.x<String> e(Context context, PrivacySetting privacySetting, List<UserId> list, List<Integer> list2, PrivacyViewer privacyViewer) {
                return io.reactivex.rxjava3.core.x.k("");
            }

            @Override // xsna.qwe
            public final String g(Context context) {
                return "";
            }

            @Override // xsna.qwe
            public final PostingVisibilityMode h() {
                return PostingVisibilityMode.ALL;
            }

            @Override // xsna.qwe
            public final String i() {
                return "";
            }

            @Override // xsna.qwe
            public final String k(Context context, List<UserId> list, List<Integer> list2) {
                return "";
            }

            @Override // xsna.qwe
            public final boolean m(VideoFile videoFile) {
                return false;
            }

            @Override // xsna.qwe
            public final Integer n(VideoFile videoFile) {
                return null;
            }

            @Override // xsna.qwe
            public final PostingVisibilityMode p(PrivacySetting privacySetting) {
                return null;
            }

            @Override // xsna.qwe
            public final void f(PostingVisibilityMode postingVisibilityMode) {
            }

            @Override // xsna.qwe
            public final void l(l7s l7sVar, VideoFile videoFile) {
            }

            @Override // xsna.qwe
            public final void j(l7s l7sVar, View view, VideoFile videoFile, izs izsVar) {
            }

            @Override // xsna.qwe
            public final void o(Context context, ht htVar, gzs gzsVar, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
            }
        }

        /* compiled from: ClipsStubs.kt */
        public static final class j implements ClipsRouter {
            @Override // com.vk.clips.viewer.api.routing.ClipsRouter
            public final void e(Context context, ClipVideoFile clipVideoFile) {
            }

            @Override // com.vk.clips.viewer.api.routing.ClipsRouter
            public final void h(Activity activity, VideoFile videoFile) {
            }

            @Override // com.vk.clips.viewer.api.routing.ClipsRouter
            public final void k(Context context, String str) {
            }

            @Override // com.vk.clips.viewer.api.routing.ClipsRouter
            public final void i(Context context, rfc rfcVar, ClipFeedOpenAction clipFeedOpenAction) {
            }

            @Override // com.vk.clips.viewer.api.routing.ClipsRouter
            public final void f(Context context, UserId userId, List list, io2 io2Var) {
            }

            @Override // com.vk.clips.viewer.api.routing.ClipsRouter
            public final void d(Context context, ClipGridParams clipGridParams, boolean z, ClipsRouter.GridForcedTab gridForcedTab, SearchStatsLoggingInfo searchStatsLoggingInfo, String str) {
            }

            @Override // com.vk.clips.viewer.api.routing.ClipsRouter
            public final void a(Context context, ClipFeedTab clipFeedTab, io2 io2Var, kwc kwcVar, dcy dcyVar, ClipFeedOpenAction clipFeedOpenAction, boolean z) {
            }

            @Override // com.vk.clips.viewer.api.routing.ClipsRouter
            public final void g(Context context, List list, io2 io2Var, kwc kwcVar, dcy dcyVar, SearchStatsLoggingInfo searchStatsLoggingInfo, ClipFeedOpenAction clipFeedOpenAction, boolean z, wp50 wp50Var) {
            }
        }

        /* compiled from: ClipsStubs.kt */
        public static final class l implements ClipsTrendsPrefs {
            public boolean a;

            @Override // com.vk.clips.viewer.api.prefs.ClipsTrendsPrefs
            public final void b() {
                this.a = true;
            }

            @Override // com.vk.clips.viewer.api.prefs.ClipsTrendsPrefs
            public final ClipsTrendsPrefs.BannerClosedFlag c(String str) {
                return ClipsTrendsPrefs.BannerClosedFlag.UNSET;
            }

            @Override // com.vk.clips.viewer.api.prefs.ClipsTrendsPrefs
            public final boolean d() {
                return this.a;
            }

            @Override // com.vk.clips.viewer.api.prefs.ClipsTrendsPrefs
            public final void a(long j, String str) {
            }
        }

        /* compiled from: ClipsStubs.kt */
        public static final class e implements jie {
            @Override // xsna.jie
            public final void b(Context context, UserId userId, String str, boolean z) {
            }
        }
    }
}
