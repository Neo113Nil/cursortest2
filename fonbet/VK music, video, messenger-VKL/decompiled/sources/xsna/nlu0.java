package xsna;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.api.generated.reports.dto.ReportsAddTypeDto;
import com.vk.catalog2.common.ui.mvp.clip.ClipDiscoverFragment;
import com.vk.catalog2.common.ui.mvp.clip.ClipMusicTemplatesCatalogFragment;
import com.vk.clips.reports.impl.ClipsReportFragment;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.viewer.experiments.models.TabsPositionConfig;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.clips.viewer.impl.grid.ClipsGridFragment;
import com.vk.clips.viewer.impl.grid.repository.cache.GridHeaderMemCache;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.preference.Preference;
import com.vk.dto.common.ClipStatStoryData;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.DuetType;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.group.Group;
import com.vk.dto.masks.Mask;
import com.vk.dto.music.MusicCameraData;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.log.L;
import com.vk.metrics.eventtracking.Event;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryPublishItem;
import com.vk.storycamera.CameraTooltipFromLink;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import com.vk.toggle.Features;
import com.vk.webapp.fragments.ReportFragment;
import com.vkontakte.android.data.b;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;
import ru.ok.android.utils.Logger;
import xsna.adt0;
import xsna.j5f;

/* compiled from: VkClipsBridge.kt */
/* loaded from: classes7.dex */
public final class nlu0 implements pkd {
    public final s2f b;
    public final xmc c;
    public final v1e d = tyx.a().getExperiments();
    public final d2f e;
    public final kwe f;
    public final vnf g;
    public final j5f.a.c h;
    public final twe i;
    public final fgd j;
    public final j5f.a.b k;
    public final GridHeaderMemCache l;
    public final kie m;

    /* compiled from: VkClipsBridge.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    public nlu0(s2f s2fVar, xmc xmcVar, zof zofVar, gx8 gx8Var) {
        this.b = s2fVar;
        this.c = xmcVar;
        this.e = new d2f(zofVar);
        kwe kweVar = new kwe();
        gx8Var.c(kweVar);
        this.f = kweVar;
        this.g = new vnf();
        j5f.a.getClass();
        this.h = j5f.a.j;
        this.i = new twe();
        this.j = new fgd();
        this.k = j5f.a.m;
        this.l = new GridHeaderMemCache();
        this.m = new kie();
    }

    public static com.vk.storycamera.builder.a D(String str, String str2, Long l, String str3, String str4, UserId userId, String str5, ClipVideoFile clipVideoFile, MusicTrack musicTrack, int i, String str6, Boolean bool, DuetType duetType, Boolean bool2, String str7, MusicCameraData musicCameraData, boolean z) {
        com.vk.storycamera.builder.a aVar;
        com.vk.storycamera.builder.a aVar2 = new com.vk.storycamera.builder.a(str, str2);
        aVar2.z0 = z;
        StoryCameraMode storyCameraMode = StoryCameraMode.CLIPS;
        aVar2.f = storyCameraMode;
        if (bool2 != null) {
            aVar2.g = bool2.booleanValue() ? xa4.q() : Collections.singletonList(storyCameraMode);
        }
        if (str4 != null) {
            aVar2.m = str4;
        }
        if (userId != null) {
            aVar2.q(userId, null, null);
        }
        if (str5 != null) {
            aVar2.Q = str5;
        }
        if (clipVideoFile != null) {
            aVar2.R = clipVideoFile;
        }
        if (musicTrack != null) {
            String str8 = musicTrack.i;
            if (str8 == null) {
                str8 = "";
            }
            aVar = aVar2;
            aVar.O = new StoryMusicInfo(musicTrack, str8, i, 0, 0, null, false, i, false, false, null, false, false, 8032, null);
        } else {
            aVar = aVar2;
        }
        if (str6 != null) {
            aVar.w = str6;
        }
        if (bool != null) {
            if (bool.booleanValue()) {
                aVar.d();
            } else {
                aVar.c();
            }
        }
        if (duetType != null) {
            aVar.S = duetType;
        }
        if (l != null) {
            aVar.B = Integer.valueOf((int) l.longValue());
        }
        if (str3 != null) {
            aVar.N = str3;
        }
        if (str7 != null) {
            CameraTooltipFromLink.Companion.getClass();
            aVar.j0 = CameraTooltipFromLink.a.a(str7);
        }
        if (musicCameraData != null) {
            aVar.u0 = musicCameraData;
        }
        return aVar;
    }

    @Override // xsna.pkd
    public final void B(Context context) {
        ClipsReportFragment.a aVar = new ClipsReportFragment.a(ClipsReportFragment.class, null, null);
        ReportsAddTypeDto reportsAddTypeDto = ReportsAddTypeDto.VIDEO;
        Bundle bundle = aVar.j;
        bundle.putSerializable("type", reportsAddTypeDto);
        bundle.putBoolean("is_original_audio", true);
        aVar.s(true);
        aVar.k(context);
    }

    @Override // xsna.pkd
    public final unf Z() {
        return this.g;
    }

    @Override // xsna.pkd
    public final ClipsRouter a() {
        return this.e;
    }

    @Override // xsna.pkd
    public final Integer b() {
        return this.d.b();
    }

    @Override // xsna.pkd
    @ozl
    public final boolean c(VideoFile videoFile) {
        return this.c.c(videoFile);
    }

    @Override // xsna.pkd
    @ozl
    public final boolean d(VideoFile videoFile) {
        return this.c.d(videoFile);
    }

    @Override // xsna.pkd
    public final jwe e() {
        return this.f;
    }

    @Override // xsna.pkd
    public final s2f e0() {
        return this.b;
    }

    @Override // xsna.pkd
    public final void f(Context context, String str) {
        ClipMusicTemplatesCatalogFragment.a aVar = new ClipMusicTemplatesCatalogFragment.a(context, true);
        aVar.j.putString("ref", str);
        aVar.s(true);
        dhr0.a.getClass();
        aVar.w(dhr0.u().c);
        aVar.k(context);
    }

    @Override // xsna.pkd
    public final void g(Context context, String str, String str2, long j) {
        o0w.x(g2v.c().b(), context, null, j, null, null, null, false, null, null, null, str, null, null, str2, null, null, null, false, null, null, null, null, null, 1073732602);
    }

    @Override // xsna.pkd
    public final v1e getExperiments() {
        return this.d;
    }

    @Override // xsna.pkd
    public final qwe getPrivacy() {
        return this.i;
    }

    @Override // xsna.pkd
    public final kgd h() {
        return this.h;
    }

    @Override // xsna.pkd
    public final void i(Activity activity, String str, MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint creationEntryPoint, Mask mask, UserId userId, String str2, ClipVideoFile clipVideoFile, MusicTrack musicTrack, int i, String str3) {
        D(str, wrp.b(creationEntryPoint), null, null, mask != null ? mask.Db() : null, userId, str2, clipVideoFile, musicTrack, i, str3, null, null, null, null, null, true).C(activity);
    }

    @Override // xsna.pkd
    public final io.reactivex.rxjava3.core.x<List<tce>> j() {
        return new io.reactivex.rxjava3.internal.operators.single.b(new yul0(5));
    }

    @Override // xsna.pkd
    public final void k(UserId userId, Context context, ClipsRouter.GridForcedTab gridForcedTab) {
        t6g0 t6g0Var = t6g0.b;
        Group C0 = t6g0.b().C0(fkq0.a(userId));
        boolean z = true;
        if (!o25.a().a(userId) && (C0 == null || !C0.e())) {
            z = false;
        }
        ClipsGridFragment.a aVar = new ClipsGridFragment.a(new ClipGridParams.OnlyId.Profile(userId));
        Bundle bundle = aVar.j;
        bundle.putBoolean("ClipsGridFragment.is_owner_grid", z);
        bundle.putSerializable("ClipsGridFragment.forced_tab", gridForcedTab);
        bundle.putParcelable("search_stats_logging_info", null);
        aVar.k(context);
    }

    @Override // xsna.pkd
    public final jgd k0() {
        return this.k;
    }

    @Override // xsna.pkd
    public final void l(Context context, String str, String str2, String str3) {
        f18 f18Var = this.f.q;
        qcy<Object> qcyVar = kwe.s[12];
        f18Var.b(true);
        hf3.d(new np20((int) InternalVkMiniApps.ADS_EASY_PROMOTE.h().a, context, new mq20(new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).authority("static.".concat(a0a.d)).appendPath("ads_easy_promote").appendEncodedPath("").appendQueryParameter("act", "publishedClip").appendQueryParameter("clip_id", str).appendQueryParameter("daily_budget", str2).appendQueryParameter("date_to", str3).build().toString(), (String) null, (String) null, (String) null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, (String) null, (String) null), null, null, 24));
    }

    @Override // xsna.pkd
    public final jie m() {
        return this.m;
    }

    @Override // xsna.pkd
    public final boolean n() {
        b0d0 b0d0Var = (b0d0) c0d0.a.getValue();
        b0d0Var.getClass();
        long a2 = qni0.a();
        Features.Type type = Features.Type.AB_PREFETCH_DEFAULT_OFF;
        type.getClass();
        return a2 - Preference.m(com.vk.toggle.b.A.a(type) ? 0L : qni0.a(), "prefetch_loading", "prefetch_loading_clips") < b0d0Var.a;
    }

    @Override // xsna.pkd
    public final void o(u90 u90Var, int i, String str, String str2, Long l, String str3, String str4, ClipVideoFile clipVideoFile, MusicTrack musicTrack, int i2, String str5, Boolean bool, DuetType duetType, Boolean bool2, String str6, MusicCameraData musicCameraData, boolean z, UserId userId) {
        D(str, str2, l, str3, str4, userId, null, clipVideoFile, musicTrack, i2, str5, bool, duetType, bool2, str6, musicCameraData, z).D(u90Var, i, null);
    }

    @Override // xsna.pkd
    public final List<ClipFeedTab> p(ClipFeedTab.WithPayload.Payload payload) {
        v1e v1eVar = this.d;
        boolean j = v1eVar.j();
        TabsPositionConfig d = v1eVar.d();
        UserId c = o25.a().c();
        TabsPositionConfig.Position position = d.b;
        ArrayList arrayList = new ArrayList();
        TabsPositionConfig.Position position2 = d.a;
        TabsPositionConfig.Position position3 = TabsPositionConfig.Position.FIRST;
        if (position2 == position3) {
            arrayList.add(new ClipFeedTab.MyClips(c));
        } else if (position == position3) {
            arrayList.add(ClipFeedTab.Discover.b);
        }
        arrayList.addAll(e43.l(new ClipFeedTab.TopVideo(null, null, null, null, payload, 15, null), ClipFeedTab.UserSubscriptions.b));
        TabsPositionConfig.Position position4 = TabsPositionConfig.Position.FOURTH;
        if (position2 == position4) {
            arrayList.add(new ClipFeedTab.MyClips(c));
        } else if (position == position4) {
            arrayList.add(ClipFeedTab.Discover.b);
        }
        if (j) {
            arrayList.add(ClipFeedTab.LivesTop.b);
        }
        TabsPositionConfig.Position position5 = TabsPositionConfig.Position.LAST;
        if (position2 == position5) {
            arrayList.add(new ClipFeedTab.MyClips(c));
        } else if (position == position5) {
            arrayList.add(ClipFeedTab.Discover.b);
        }
        return arrayList;
    }

    @Override // xsna.pkd
    public final void q(bc6 bc6Var, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint creationEntryPoint, ClipStatStoryData clipStatStoryData) {
        com.vk.storycamera.builder.a aVar = new com.vk.storycamera.builder.a(mobileOfficialAppsCoreNavStat$EventScreen, creationEntryPoint);
        aVar.M = clipStatStoryData;
        UserId userId = clipStatStoryData.d;
        StoryCameraParams.a.r(aVar, userId, clipStatStoryData.f, 2);
        if (userId.b > 0) {
            aVar.I = true;
        }
        aVar.g = xa4.t();
        aVar.C(bc6Var.a);
    }

    @Override // xsna.pkd
    @SuppressLint({"CheckResult"})
    public final void r() {
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a aVar = new Event.a();
        aVar.g("clips_open");
        aVar.i(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_MY_TRACKER);
        bVar.k(aVar.e());
        if (g620.p == -1) {
            ver0.a(rsg0.y0(new ble("shortVideo.markClipsBadgeViewed"), null, null, 3).subscribe(new nzs0(new gz30(29), 3), new mlu0(new a(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 0)));
        }
    }

    @Override // xsna.pkd
    public final void s(ClipVideoFile clipVideoFile, String str, String str2) {
        this.j.getClass();
        b.d dVar = new b.d("show_clip");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("iid", clipVideoFile.c);
        jSONObject.put("oid", clipVideoFile.b);
        s3q0 s3q0Var = s3q0.a;
        dVar.b(jSONObject, "clip");
        dVar.b(str, "ref");
        dVar.b(str2, "track_code");
        dVar.e();
    }

    @Override // xsna.pkd
    public final void t(Context context) {
        int i = ReportFragment.a0;
        ReportFragment.a a2 = ReportFragment.b.a();
        a2.K("ad");
        a2.y("mmFaSjUranT7sHFhCs2HR4AqbFxASvYzCvGkWmupQqV7Y/qLunwSOUd5TGoCh4jZ3PcsroyS8zbTR75OVGILUgExm9AzpSlMNhPr8ASEGUjKwYBH29yyKeS5Ck58Khjs*YUUi2aO3pbnvL00xhrdfGLT5xHKcbl4AHPKIxgGKVZkZ5yOo845egMwbfucohz0uLpG1oI89y*5h6iXLg0TXRgfyjmWSIw205rUYXILEmdQPOVHo6EmhrcNYa1J4*66/b/awoEUTf*pe/1FM3o43r7/*QEtXQCkh9K4RZuuhJWGCOkCQQcubrNIlc9J8/FMRaTQC/cGk7*n60O2/GE8fQAahcBbX5cfeL41vzpCCwx4x/CeoT/bAdwJQNhadS0o768Jrz4rnLSzctB4TIDAXALpRz8071MKOJNr8ID/YjO0UxjkFHaKtLQupLBghZ2hrQ513LH6RQp1tM2sQ*U62DO7mPSzsdJ6/e*19bLtYXNjtktLgect9uXn*WKWtgnQm1StF3I33eTjnW6//0Iy/Lj7iAJGPp5Bz23SWoW2ESCHW*Uj2vVA9RaWiT*/WDYXGS8eJJ7z/YrvSeUG5SuP9auOn2FN4vx/Q7f3qNN*TKfmranjh/Hn4r64efigol4AuD4LPfwVT*TID3aYNG7vN0p7VD8TyZkt8W/7GKkmZTU-");
        a2.k(context);
    }

    @Override // xsna.pkd
    public final pfu u() {
        return this.l;
    }

    @Override // xsna.pkd
    public final boolean v(VideoFile videoFile) {
        VideoRestriction O = videoFile.O();
        return (!fxc0.B().c(videoFile) || O == null || O.f) ? false : true;
    }

    @Override // xsna.pkd
    public final void w(FragmentActivity fragmentActivity, String str, String str2) {
        com.vk.storycamera.builder.a aVar = new com.vk.storycamera.builder.a(str, str2);
        aVar.f = StoryCameraMode.LIVE;
        aVar.C(fragmentActivity);
    }

    @Override // xsna.pkd
    public final FragmentImpl x(String str) {
        ClipDiscoverFragment.a aVar = new ClipDiscoverFragment.a(ClipDiscoverFragment.class, null, null);
        aVar.j.putString("ref", str);
        return aVar.j().Ab();
    }

    @Override // xsna.pkd
    public final void y(Activity activity, fju fjuVar) {
        adt0 adt0Var = (adt0) fjuVar.invoke(new adt0.a());
        int i = ReportFragment.a0;
        ReportFragment.a a2 = ReportFragment.b.a();
        a2.K("clip");
        VideoFile videoFile = adt0Var.a;
        a2.G(videoFile.I0());
        a2.D(videoFile.o0());
        String str = adt0Var.c;
        if (str != null) {
            a2.M(str);
        }
        String r = videoFile.r();
        if (r != null) {
            a2.J(r);
        }
        String str2 = adt0Var.b;
        if (str2 != null) {
            a2.I(str2);
        }
        a2.s(true);
        a2.k(activity);
    }
}
