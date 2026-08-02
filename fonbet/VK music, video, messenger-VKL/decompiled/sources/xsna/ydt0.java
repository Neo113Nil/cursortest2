package xsna;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.common.VideoAdData;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.video.VideoAlbum;
import com.vk.libvideo.ad.BaseAdsDataProvider;
import com.vk.libvideo.api.UploadVideoAction;
import com.vk.libvideo.api.VideoUrlInfo;
import com.vk.libvideo.api.ad.AdsDataProvider;
import com.vk.libvideo.api.ui.VideoFeedDialogParams;
import com.vk.libvideo.api.ui.VideoTransitionSource;
import com.vk.libvideo.models.comment.ReplyInfo;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;

/* compiled from: VideoRouter.kt */
/* loaded from: classes.dex */
public interface ydt0 {
    static /* synthetic */ void e(ydt0 ydt0Var, Activity activity, VideoAlbum videoAlbum, String str, SearchStatsLoggingInfo searchStatsLoggingInfo, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        ydt0Var.C(activity, videoAlbum, str, null, (i & 16) != 0 ? null : searchStatsLoggingInfo);
    }

    static /* synthetic */ void f(ydt0 ydt0Var, Context context, VideoFile videoFile, String str, SearchStatsLoggingInfo searchStatsLoggingInfo, String str2, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            searchStatsLoggingInfo = null;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        ydt0Var.x(context, videoFile, str, searchStatsLoggingInfo, str2);
    }

    static /* synthetic */ void p(ydt0 ydt0Var, Activity activity, VideoFile videoFile, boolean z, boolean z2, SearchStatsLoggingInfo searchStatsLoggingInfo, String str, String str2, String str3, io2 io2Var, int i) {
        String str4;
        ydt0 ydt0Var2;
        Activity activity2;
        VideoFile videoFile2;
        String str5;
        boolean z3;
        String str6 = (i & 64) != 0 ? null : str;
        if ((i & 256) != 0) {
            str4 = null;
            ydt0Var2 = ydt0Var;
            activity2 = activity;
            videoFile2 = videoFile;
            z3 = z2;
            str5 = str6;
        } else {
            str4 = str3;
            ydt0Var2 = ydt0Var;
            activity2 = activity;
            videoFile2 = videoFile;
            str5 = str6;
            z3 = z2;
        }
        ydt0Var2.n(activity2, videoFile2, z3, str5, str4);
    }

    static /* synthetic */ void s(ydt0 ydt0Var, Activity activity, VideoFile videoFile, io2 io2Var, boolean z, SearchStatsLoggingInfo searchStatsLoggingInfo, String str, BaseAdsDataProvider baseAdsDataProvider, Boolean bool, String str2, int i) {
        String str3;
        ydt0 ydt0Var2;
        Activity activity2;
        VideoFile videoFile2;
        io2 io2Var2;
        boolean z2 = (i & 32) != 0 ? false : z;
        SearchStatsLoggingInfo searchStatsLoggingInfo2 = (i & 64) != 0 ? null : searchStatsLoggingInfo;
        String str4 = (i & 128) != 0 ? null : str;
        BaseAdsDataProvider baseAdsDataProvider2 = (i & 256) != 0 ? null : baseAdsDataProvider;
        Boolean bool2 = (i & 4096) != 0 ? null : bool;
        if ((i & 8192) != 0) {
            str3 = null;
            activity2 = activity;
            videoFile2 = videoFile;
            io2Var2 = io2Var;
            ydt0Var2 = ydt0Var;
        } else {
            str3 = str2;
            ydt0Var2 = ydt0Var;
            activity2 = activity;
            videoFile2 = videoFile;
            io2Var2 = io2Var;
        }
        ydt0Var2.l(activity2, videoFile2, io2Var2, z2, searchStatsLoggingInfo2, str4, baseAdsDataProvider2, bool2, str3);
    }

    static /* synthetic */ void y(ydt0 ydt0Var, Context context, UserId userId, String str, String str2, String str3, SearchStatsLoggingInfo searchStatsLoggingInfo, String str4, String str5, String str6, int i) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        boolean z = (i & 32) == 0;
        if ((i & 64) != 0) {
            searchStatsLoggingInfo = null;
        }
        if ((i & 128) != 0) {
            str4 = null;
        }
        if ((i & 256) != 0) {
            str5 = null;
        }
        String str7 = (i & 512) != 0 ? null : str6;
        ydt0Var.m(context, userId, str, str2, str3, z, searchStatsLoggingInfo, str4, str5, str7);
    }

    default void k(Context context, VideoFile videoFile, String str, AdsDataProvider adsDataProvider, String str2, Object obj, boolean z, izs izsVar, ReplyInfo replyInfo, String str3, boolean z2, boolean z3, boolean z4, boolean z5, long j, SearchStatsLoggingInfo searchStatsLoggingInfo, jcs0 jcs0Var, boolean z6, VideoTransitionSource videoTransitionSource) {
    }

    default void D(Context context, boolean z) {
    }

    default void E(Context context, UserId userId) {
    }

    default void F(VideoAlbum videoAlbum, jbs jbsVar) {
    }

    default void r(PrivacySetting privacySetting, jbs jbsVar) {
    }

    default void t(Context context, VideoFile videoFile) {
    }

    default void a(FragmentActivity fragmentActivity, VideoAdData videoAdData, io2 io2Var) {
    }

    default void b(VideoAlbum videoAlbum, boolean z, jbs jbsVar) {
    }

    default void i(Activity activity, VideoFile videoFile, VideoFeedDialogParams videoFeedDialogParams) {
    }

    default void w(int i, Context context, UserId userId) {
    }

    default void z(Context context, VideoFile videoFile, dz20 dz20Var) {
    }

    default void d(Context context, VideoFile videoFile, String str, AdsDataProvider adsDataProvider, String str2, Object obj, boolean z, String str3, boolean z2, long j, SearchStatsLoggingInfo searchStatsLoggingInfo, ReplyInfo replyInfo, VideoUrlInfo videoUrlInfo) {
    }

    default void B(Context context, VideoFile videoFile, String str, String str2) {
    }

    default void g(Context context, VideoFile videoFile, String str, String str2) {
    }

    default void q(Context context, UserId userId, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, izs<? super qs80, s3q0> izsVar) {
    }

    default void v(Context context, String str, String str2, String str3) {
    }

    default void m(Context context, UserId userId, String str, String str2, String str3, boolean z, SearchStatsLoggingInfo searchStatsLoggingInfo, String str4, String str5, String str6) {
    }

    default void C(Activity activity, VideoAlbum videoAlbum, String str, String str2, SearchStatsLoggingInfo searchStatsLoggingInfo) {
    }

    default void c(Activity activity, UploadVideoAction uploadVideoAction, UserId userId, int i, String str) {
    }

    default void n(Activity activity, VideoFile videoFile, boolean z, String str, String str2) {
    }

    default void x(Context context, VideoFile videoFile, String str, SearchStatsLoggingInfo searchStatsLoggingInfo, String str2) {
    }

    default void A(Context context, oap<? extends Uri, UserId> oapVar, String str, boolean z, String str2, String str3, boolean z2, boolean z3, boolean z4, Boolean bool, SearchStatsLoggingInfo searchStatsLoggingInfo, String str4) {
    }

    default void l(Activity activity, VideoFile videoFile, io2 io2Var, boolean z, SearchStatsLoggingInfo searchStatsLoggingInfo, String str, AdsDataProvider adsDataProvider, Boolean bool, String str2) {
    }
}
