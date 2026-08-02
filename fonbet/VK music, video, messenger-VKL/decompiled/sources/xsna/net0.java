package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedOpenAction;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.clips.SdkNewsMonotheme;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.common.links.LaunchContext;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.libvideo.api.VideoUrlInfo;
import com.vk.libvideo.api.ad.AdsDataProvider;
import com.vk.libvideo.api.ui.VideoTransitionSource;
import com.vk.libvideo.models.comment.ReplyInfo;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.libvideo.repositories.VideoApiHelperRepository;
import com.vk.media.player.PlayerError;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.statistic.DeprecatedStatisticInterface;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Collections;
import kotlin.text.Regex;
import xsna.h7u0;
import xsna.hl10;
import xsna.qs80;
import xsna.sw50;

/* compiled from: VideoScreenResolver.kt */
/* loaded from: classes3.dex */
public final class net0 {
    public static ClipFeedTab a(VideoFile videoFile, boolean z, z1f z1fVar) {
        SdkNewsMonotheme v1;
        SdkVideoFile c = g620.f().e0().c(videoFile);
        if (z1fVar != null) {
            return new ClipFeedTab.SingleClipWithDecoration(c, null, z1fVar.e, z1fVar.a, z1fVar.b, z1fVar.c, z1fVar.d, null, z1fVar.f.invoke(), 128, null);
        }
        SdkClipVideoFile sdkClipVideoFile = c instanceof SdkClipVideoFile ? (SdkClipVideoFile) c : null;
        return (sdkClipVideoFile == null || (v1 = sdkClipVideoFile.v1()) == null) ? new ClipFeedTab.SingleClip(c, null, null, z, false, null, null, null, 246, null) : new ClipFeedTab.NewsMonotheme(v1.b, v1.c, c, null, 8, null);
    }

    public static void b(Context context, VideoFile videoFile, boolean z, boolean z2, ClipFeedOpenAction clipFeedOpenAction, z1f z1fVar) {
        if (z2) {
            ClipsRouter.b(g620.f().a(), context, a(videoFile, z, z1fVar), null, null, null, clipFeedOpenAction, true, 56);
        } else {
            ClipsRouter.c(g620.f().a(), context, Collections.singletonList(a(videoFile, z, z1fVar)), null, null, null, null, clipFeedOpenAction, true, null, 1848);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(final Context context, final VideoFile videoFile, String str, AdsDataProvider adsDataProvider, String str2, Object obj, boolean z, final izs izsVar, ReplyInfo replyInfo, String str3, boolean z2, boolean z3, boolean z4, boolean z5, long j, boolean z6, SearchStatsLoggingInfo searchStatsLoggingInfo, jcs0 jcs0Var, boolean z7, String str4, boolean z8, z1f z1fVar, VideoTransitionSource videoTransitionSource, int i) {
        AdsDataProvider adsDataProvider2;
        String str5;
        boolean z9;
        izs izsVar2;
        uk10 uk10Var;
        String str6;
        String str7;
        hl10 b;
        hl10.b bVar;
        String str8 = (i & 4) != 0 ? null : str;
        AdsDataProvider adsDataProvider3 = (i & 8) != 0 ? null : adsDataProvider;
        String str9 = (i & 16) != 0 ? null : str2;
        final Object obj2 = (i & 32) != 0 ? null : obj;
        final boolean z10 = (i & 64) != 0 ? false : z;
        ReplyInfo replyInfo2 = (i & 256) != 0 ? null : replyInfo;
        final String str10 = (i & 512) != 0 ? null : str3;
        boolean z11 = (i & 1024) != 0 ? true : z2;
        boolean z12 = (i & 2048) != 0 ? false : z3;
        boolean z13 = (i & 4096) != 0 ? false : z4;
        boolean z14 = (i & 8192) != 0 ? false : z5;
        long j2 = (i & 16384) != 0 ? -1L : j;
        final boolean z15 = (i & 32768) != 0 ? false : z6;
        SearchStatsLoggingInfo searchStatsLoggingInfo2 = (i & 65536) != 0 ? null : searchStatsLoggingInfo;
        jcs0 jcs0Var2 = (i & 131072) != 0 ? null : jcs0Var;
        boolean z16 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? false : z7;
        String str11 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str4;
        boolean z17 = (i & 2097152) != 0 ? false : z8;
        z1f z1fVar2 = (i & 4194304) != 0 ? null : z1fVar;
        VideoTransitionSource videoTransitionSource2 = (i & 8388608) != 0 ? null : videoTransitionSource;
        String str12 = "";
        VideoUrlInfo videoUrlInfo = str11 != null ? new VideoUrlInfo(str11) : null;
        if (z11 && ((videoFile.isEmpty() || videoFile.isExternal() || videoFile.s() == null) && fkq0.c(videoFile.I0()) && !videoFile.Z9() && !videoFile.x5())) {
            UserId I0 = videoFile.I0();
            int o0 = videoFile.o0();
            String C1 = videoFile.C1();
            VideoFeatures videoFeatures = VideoFeatures.VIDEO_CLIP_DEEPLINK_FALLBACK;
            videoFeatures.getClass();
            boolean a = com.vk.toggle.b.A.a(videoFeatures);
            final boolean z18 = z16;
            final VideoUrlInfo videoUrlInfo2 = videoUrlInfo;
            final String str13 = str8;
            final String str14 = str9;
            final AdsDataProvider adsDataProvider4 = adsDataProvider3;
            final boolean z19 = z14;
            final long j3 = j2;
            final boolean z20 = z17;
            final z1f z1fVar3 = z1fVar2;
            final String str15 = str11;
            final ReplyInfo replyInfo3 = replyInfo2;
            w1s0.g(context, I0, o0, C1, z20, false, a, new izs(izsVar, replyInfo3, context, str13, adsDataProvider4, str14, obj2, z10, str10, z19, j3, str15, z20, z15, z18, z1fVar3, videoUrlInfo2) { // from class: xsna.ket0
                public final /* synthetic */ izs c;
                public final /* synthetic */ ReplyInfo d;
                public final /* synthetic */ Context e;
                public final /* synthetic */ String f;
                public final /* synthetic */ AdsDataProvider g;
                public final /* synthetic */ String h;
                public final /* synthetic */ Object i;
                public final /* synthetic */ boolean j;
                public final /* synthetic */ String k;
                public final /* synthetic */ boolean l;
                public final /* synthetic */ long m;
                public final /* synthetic */ String n;
                public final /* synthetic */ boolean o;
                public final /* synthetic */ boolean p;
                public final /* synthetic */ boolean q;
                public final /* synthetic */ z1f r;

                @Override // xsna.izs
                public final Object invoke(Object obj3) {
                    VideoFile videoFile2 = (VideoFile) obj3;
                    if (videoFile2 != null) {
                        videoFile2.e4(VideoFile.this.Q());
                    }
                    izs izsVar3 = this.c;
                    if (videoFile2 != null) {
                        boolean isEmpty = videoFile2.isEmpty();
                        ReplyInfo replyInfo4 = this.d;
                        Context context2 = this.e;
                        String str16 = this.f;
                        AdsDataProvider adsDataProvider5 = this.g;
                        String str17 = this.h;
                        Object obj4 = this.i;
                        boolean z21 = this.j;
                        String str18 = this.k;
                        boolean z22 = this.l;
                        long j4 = this.m;
                        String str19 = this.n;
                        boolean z23 = this.o;
                        if (!isEmpty && replyInfo4 != null && !g620.f().d(videoFile2)) {
                            net0.c(context2, videoFile2, str16, adsDataProvider5, str17, obj4, z21, izsVar3, replyInfo4, str18, false, false, false, z22, j4, false, null, null, false, str19, z23, null, null, 9410560);
                            if (izsVar3 != null) {
                                izsVar3.invoke(new qs80.c(videoFile2));
                            }
                        } else if (!videoFile2.isEmpty() || fxc0.B().c(videoFile2) || e5o.a(videoFile2)) {
                            net0.c(context2, videoFile2, str16, adsDataProvider5, str17, obj4, z21, izsVar3, replyInfo4, str18, false, false, false, z22, j4, this.p, null, null, this.q, str19, z23, this.r, null, 9115648);
                        } else if (videoFile2.z0()) {
                            fxc0.B().Y().g(context2, videoFile2, str16, str18);
                            if (izsVar3 != null) {
                                izsVar3.invoke(new qs80.c(videoFile2));
                            }
                        } else if (izsVar3 != null) {
                            izsVar3.invoke(qs80.b.a);
                        }
                    } else if (izsVar3 != null) {
                        izsVar3.invoke(new qs80.a(new Throwable()));
                    }
                    return s3q0.a;
                }
            }, 64);
            return;
        }
        VideoUrlInfo videoUrlInfo3 = videoUrlInfo;
        boolean z21 = z16;
        final VideoFile videoFile2 = videoFile;
        boolean z22 = z15;
        long j4 = j2;
        boolean z23 = z12;
        String str16 = str10;
        ReplyInfo replyInfo4 = replyInfo2;
        if (videoFile2.Q0() && videoFile2.isEmpty()) {
            adsDataProvider2 = adsDataProvider3;
            if (!fxc0.B().c(videoFile2)) {
                cvk.u(gpt0.n(PlayerError.ERROR_NOT_PROCESSED, false), false);
                if (izsVar != null) {
                    izsVar.invoke(qs80.b.a);
                    return;
                }
                return;
            }
        } else {
            adsDataProvider2 = adsDataProvider3;
        }
        if (!videoFile2.s5() || videoFile2.isEmpty()) {
            str5 = str9;
            z9 = false;
        } else {
            str5 = str9;
            z9 = false;
            cvk.u(gpt0.n(PlayerError.ERROR_NOT_CONVERTED, false), false);
        }
        if (videoFile2.x5()) {
            String string = context.getString(gpt0.n(PlayerError.ERROR_NOT_SUPPORT, z9));
            cvk.w(string, z9);
            if (izsVar != null) {
                izsVar.invoke(new qs80.a(new IllegalArgumentException(string)));
                return;
            }
            return;
        }
        if (g620.f().d(videoFile2)) {
            VideoRestriction O = videoFile2.O();
            if (O != null && g620.f().v(videoFile2)) {
                if (z22) {
                    b(context, videoFile2, true, z21, ClipFeedOpenAction.ShowLogin.b, z1fVar2);
                    if (izsVar != null) {
                        izsVar.invoke(new qs80.c(videoFile2));
                        return;
                    }
                    return;
                }
                int i2 = h7u0.p;
                h7u0.a c = h7u0.b.c(context);
                c.h0(O.b);
                c.c0(R.string.close, new o1c());
                if (izsVar != null) {
                    c.a0(new DialogInterface.OnDismissListener() { // from class: xsna.let0
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            izs izsVar3 = izsVar;
                            if (izsVar3 != null) {
                                izsVar3.invoke(new qs80.c(videoFile2));
                            }
                        }
                    });
                }
                c.m();
                return;
            }
            try {
                Regex regex = new Regex("/clips/series/([\\d\\w.]{2,})");
                ActionLink m1 = videoFile2.m1();
                if (m1 == null || (str7 = m1.e) == null) {
                    str7 = "";
                }
                b = regex.b(str7);
            } catch (Throwable unused) {
            }
            if (b != null && (bVar = b.c) != null) {
                uk10Var = bVar.c(0);
                if (uk10Var == null) {
                    sw50.b k = rwi.d().k();
                    ActionLink m12 = videoFile2.m1();
                    if (m12 != null && (str6 = m12.e) != null) {
                        str12 = str6;
                    }
                    k.a(context, new LaunchContext(false, false, false, str8, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108855), new met0(videoFile2, izsVar), new peq0(Uri.parse(str12)));
                    return;
                }
                izsVar2 = izsVar;
                if (z22) {
                    b(context, videoFile, true, z21, ClipFeedOpenAction.ShowLogin.b, z1fVar2);
                    videoFile2 = videoFile;
                    if (izsVar2 != null) {
                        izsVar2.invoke(new qs80.c(videoFile2));
                    }
                } else if (jcs0Var2 == null || replyInfo4 == null) {
                    b(context, videoFile2, z11, z21, replyInfo4 != null ? new ClipFeedOpenAction.OpenComments(g620.f().e0().b(replyInfo4)) : null, z1fVar2);
                    videoFile2 = videoFile;
                } else {
                    jcs0Var2.a(videoFile2);
                }
            }
            uk10Var = null;
            if (uk10Var == null) {
            }
        } else {
            izsVar2 = izsVar;
            if (replyInfo4 != null) {
                fxc0.B().Y().d(context, videoFile2, str8, adsDataProvider2, str5, obj2 instanceof DeprecatedStatisticInterface ? (DeprecatedStatisticInterface) obj2 : null, z10, str16, z23, j4, searchStatsLoggingInfo2, replyInfo4, videoUrlInfo3);
                videoFile2 = videoFile2;
            } else {
                AdsDataProvider adsDataProvider5 = adsDataProvider2;
                String str17 = str5;
                SearchStatsLoggingInfo searchStatsLoggingInfo3 = searchStatsLoggingInfo2;
                String platform = videoFile2.getPlatform();
                if (platform != null && platform.length() != 0 && !videoFile2.H6()) {
                    fxc0.B().Y().B(context, videoFile2, str8, str16);
                } else if (videoFile2.q0() && videoFile2.A1() && g620.f().getExperiments().n()) {
                    ClipsRouter.l(g620.f().a(), context, videoFile2.I0(), Collections.singletonList(videoFile2), null, 24);
                } else {
                    if (videoFile2.q0() && !z23) {
                        VideoPipStateHolder.a.getClass();
                        if (!VideoPipStateHolder.h()) {
                            fxc0.B().Y().g(context, videoFile2, str8, str16);
                        }
                    }
                    fxc0.B().Y().d(context, videoFile2, str8, (r35 & 8) != 0 ? null : adsDataProvider5, (r35 & 16) != 0 ? null : str17, (r35 & 32) != 0 ? null : obj2 instanceof DeprecatedStatisticInterface ? (DeprecatedStatisticInterface) obj2 : null, (r35 & 64) != 0 ? false : z10, (r35 & 128) != 0 ? null : str16, (r35 & 256) != 0 ? false : z23, (r35 & 2048) != 0 ? -1L : j4, (r35 & 4096) != 0 ? null : searchStatsLoggingInfo3, null, (r35 & 16384) != 0 ? null : videoUrlInfo3);
                    videoFile2 = videoFile2;
                    izsVar2 = izsVar;
                }
            }
        }
        if (izsVar2 != null) {
            izsVar2.invoke(new qs80.c(videoFile2));
        }
    }

    public static void d(Context context, UserId userId, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, izs izsVar) {
        String name;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen2;
        UserId a = fkq0.a(userId);
        if (a.b == 0) {
            izsVar.invoke(new qs80.a(new IllegalArgumentException(b4q.b(userId, "Invalid groupId value "))));
            return;
        }
        w1s0 w1s0Var = w1s0.b;
        if (mobileOfficialAppsCoreNavStat$EventScreen == null || (name = mobileOfficialAppsCoreNavStat$EventScreen.name()) == null) {
            UiTrackingScreen uiTrackingScreen = UiTracker.j.b;
            name = (uiTrackingScreen == null || (mobileOfficialAppsCoreNavStat$EventScreen2 = uiTrackingScreen.a) == null) ? null : mobileOfficialAppsCoreNavStat$EventScreen2.name();
        }
        itg0.h(hg1.n(((VideoApiHelperRepository) w1s0.f.getValue()).e(a, name), context, false, new nq0(izsVar, 8), 12), new ue40(11, context, izsVar), new e9i0(izsVar, 25));
    }
}
