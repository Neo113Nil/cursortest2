package xsna;

import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vk.clips.download.impl.quality.ClipDownloadQuality;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.instantjobs.InstantJob;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipViewerDescriptionItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsAnalyticsItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsExtendedFeedbackItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsMoreMenuItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsPromoItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsSubscriptionItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsTabRedDotVisibilityChangedItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$OwnerInfo;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipClickToMusicEventItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipDownloadItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipInternalNpsEventItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipInternalNpsItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsApplyConstructor;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsChooseTrendItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsClipItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsFloatingButton;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsOpenConstructor;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsOpenFullscreenItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsOpenOwnerFromSubscriptionSnackbarItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsRetentionBlockEventItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsSaaFloatingButton;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsSwipedItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsTabRedDot;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeVolumeItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;
import com.vk.stat.scheme.SchemeStat$VideoListInfo;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import java.io.File;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.Regex;
import org.json.JSONObject;
import xsna.u6x;
import xsna.xod;

/* compiled from: ClipDownloadWithRemoteTranscodingJob.kt */
/* loaded from: classes.dex */
public final class frc extends ye6 implements brc {
    public static final AtomicInteger i = new AtomicInteger((int) (System.currentTimeMillis() / 1000));
    public final a c;
    public final crc d;
    public final Context e;
    public volatile File f;
    public final bpn0 g;
    public final int h;

    /* compiled from: ClipDownloadWithRemoteTranscodingJob.kt */
    /* loaded from: classes16.dex */
    public static final class a {
        public final String a;
        public final String b;
        public final String c;
        public final ClipDownloadQuality d;
        public final long e;
        public final long f;
        public final String g;

        /* compiled from: ClipDownloadWithRemoteTranscodingJob.kt */
        /* renamed from: xsna.frc$a$a, reason: collision with other inner class name */
        public static final class C2890a {
            public static a a(ny90 ny90Var) {
                ClipDownloadQuality clipDownloadQuality;
                JSONObject jSONObject = ny90Var.a;
                String string = jSONObject.getString("ClipDownloadWithRemoteTranscodingTask.id");
                String string2 = jSONObject.getString("ClipDownloadWithRemoteTranscodingTask.url");
                String string3 = jSONObject.getString("ClipDownloadWithRemoteTranscodingTask.title");
                ClipDownloadQuality.a aVar = ClipDownloadQuality.Companion;
                String string4 = jSONObject.getString("ClipDownloadWithRemoteTranscodingTask.quality");
                aVar.getClass();
                int hashCode = string4.hashCode();
                if (hashCode == 1604548) {
                    if (string4.equals("480p")) {
                        clipDownloadQuality = ClipDownloadQuality.QUALITY_480p;
                    }
                    clipDownloadQuality = ClipDownloadQuality.QUALITY_1080p;
                } else if (hashCode != 1688155) {
                    if (hashCode == 46737913 && string4.equals("1080p")) {
                        clipDownloadQuality = ClipDownloadQuality.QUALITY_1080p;
                    }
                    clipDownloadQuality = ClipDownloadQuality.QUALITY_1080p;
                } else {
                    if (string4.equals("720p")) {
                        clipDownloadQuality = ClipDownloadQuality.QUALITY_720p;
                    }
                    clipDownloadQuality = ClipDownloadQuality.QUALITY_1080p;
                }
                return new a(string, string2, string3, clipDownloadQuality, jSONObject.getLong("ClipDownloadWithRemoteTranscodingTask.owner_id"), jSONObject.getLong("ClipDownloadWithRemoteTranscodingTask.video_id"), cqm0.a(jSONObject.getString("ClipDownloadWithRemoteTranscodingTask.track_code")));
            }
        }

        public a(String str, String str2, String str3, ClipDownloadQuality clipDownloadQuality, long j, long j2, String str4) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = clipDownloadQuality;
            this.e = j;
            this.f = j2;
            this.g = str4;
        }

        public final String a() {
            return this.a;
        }

        public final long b() {
            return this.e;
        }

        public final ClipDownloadQuality c() {
            return this.d;
        }

        public final String d() {
            return this.c;
        }

        public final String e() {
            return this.g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && epx.f(this.g, aVar.g);
        }

        public final String f() {
            return this.b;
        }

        public final long g() {
            return this.f;
        }

        public final void h(ny90 ny90Var) {
            ny90Var.o("ClipDownloadWithRemoteTranscodingTask.id", this.a);
            ny90Var.o("ClipDownloadWithRemoteTranscodingTask.url", this.b);
            ny90Var.o("ClipDownloadWithRemoteTranscodingTask.title", this.c);
            ny90Var.o("ClipDownloadWithRemoteTranscodingTask.quality", this.d.h());
            ny90Var.n("ClipDownloadWithRemoteTranscodingTask.owner_id", this.e);
            ny90Var.n("ClipDownloadWithRemoteTranscodingTask.video_id", this.f);
            String str = this.g;
            if (str == null) {
                str = "";
            }
            ny90Var.o("ClipDownloadWithRemoteTranscodingTask.track_code", str);
        }

        public final int hashCode() {
            int a = bh10.a(bh10.a((this.d.hashCode() + urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f);
            String str = this.g;
            return a + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Arguments(id=");
            sb.append(this.a);
            sb.append(", url=");
            sb.append(this.b);
            sb.append(", title=");
            sb.append(this.c);
            sb.append(", quality=");
            sb.append(this.d);
            sb.append(", ownerId=");
            sb.append(this.e);
            sb.append(", videoId=");
            sb.append(this.f);
            sb.append(", trackCode=");
            return ho8.a(sb, this.g, ')');
        }
    }

    /* compiled from: ClipDownloadWithRemoteTranscodingJob.kt */
    /* loaded from: classes16.dex */
    public static final class b {
        public static int a() {
            return frc.i.getAndIncrement();
        }
    }

    /* compiled from: ClipDownloadWithRemoteTranscodingJob.kt */
    public static final class c implements s7x<frc> {
        public final bpn0 a;

        public c(bpn0 bpn0Var) {
            this.a = bpn0Var;
        }

        @Override // xsna.s7x
        public final frc a(ny90 ny90Var) {
            return new frc(a.C2890a.a(ny90Var), (crc) this.a.getValue());
        }

        @Override // xsna.s7x
        public final void b(frc frcVar, ny90 ny90Var) {
            frcVar.c.h(ny90Var);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "ClipDownloadWithRemoteTranscodingTask";
        }
    }

    /* compiled from: ClipDownloadWithRemoteTranscodingJob.kt */
    /* loaded from: classes16.dex */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipDownloadQuality.values().length];
            try {
                iArr[ClipDownloadQuality.QUALITY_1080p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipDownloadQuality.QUALITY_720p.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipDownloadQuality.QUALITY_480p.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public frc(a aVar, crc crcVar) {
        this.c = aVar;
        this.d = crcVar;
        Context context = e43.a;
        this.e = context == null ? null : context;
        this.g = new bpn0(new se0(8));
        this.h = b.a();
    }

    @Override // xsna.ye6
    public final int G() {
        return this.c.a().hashCode() + this.h;
    }

    @Override // xsna.ye6
    public final void H() {
        cancel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ye6
    public final void J(u6x.a aVar) {
        L(MobileOfficialAppsClipsStat$TypeClipDownloadItem.DownloadState.STARTED);
        File file = (File) this.g.getValue();
        Regex regex = com.vk.core.files.a.a;
        vhk0.b(file);
        io.reactivex.rxjava3.internal.operators.observable.l2 a2 = dug0.a((File) this.g.getValue(), this.c.f());
        int i2 = 9;
        defpackage.i0 i0Var = new defpackage.i0(new n40(aVar, 20), i2);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        io.reactivex.rxjava3.internal.operators.observable.b0 E = a2.E(i0Var, lVar, kVar, kVar);
        int i3 = 10;
        new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.observable.e(E, new com.vk.movika.sdk.base.hooks.f(new dj1(i3), i2)), new is1(new s9(this, 18), i3)).c();
        File file2 = this.f;
        if (file2 != null) {
        }
        L(MobileOfficialAppsClipsStat$TypeClipDownloadItem.DownloadState.FINISHED);
    }

    @Override // xsna.ye6
    public final void K(Map map, NotificationCompat.h hVar) {
        ibr0 pe = ((ClipsViewerComponent) ((k7m) m7m.f(new grc())).a(fpf0.a(ClipsViewerComponent.class))).pe();
        hVar.C(this.e.getString(R.string.file_download));
        hVar.h(this.e.getColor(R.color.vk_blue_400));
        PendingIntent pendingIntent = null;
        hVar.k(xod.a.a(pe, this.c.d(), null, false, 14));
        hVar.z(R.drawable.vk_icon_download_outline_24);
        hVar.y();
        hVar.f(NotificationCompat.CATEGORY_PROGRESS);
        InstantJob.a aVar = (InstantJob.a) map.get(this);
        if (aVar instanceof InstantJob.a.g) {
            hVar.j(this.e.getString(R.string.file_downloade_waiting));
            this.d.c(this.h, this);
            return;
        }
        if (aVar instanceof InstantJob.a.e) {
            hVar.j("");
            InstantJob.a.e eVar = (InstantJob.a.e) aVar;
            hVar.w(eVar.a(), eVar.b(), false);
            this.d.a(eVar.b() / eVar.a(), this.h);
            return;
        }
        if (aVar instanceof InstantJob.a.c) {
            hVar.j(this.e.getString(R.string.file_download_error));
            this.d.d(this.h);
            return;
        }
        if (aVar instanceof InstantJob.a.b) {
            if (this.f == null) {
                hVar.j(this.e.getString(R.string.file_download_error));
                return;
            }
            Uri N = com.vk.core.files.a.N(this.f);
            if (N == null) {
                hVar.j(this.e.getString(R.string.file_download_error));
                return;
            }
            hVar.j(this.e.getString(R.string.file_downloaded));
            this.d.d(this.h);
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
            intent.setDataAndType(N, MimeTypes.VIDEO_MP4);
            intent.addFlags(1);
            intent.addFlags(268435456);
            if (intent.resolveActivity(this.e.getPackageManager()) != null) {
                PendingIntent a2 = t2i0.a(this.e, i35.c.e(), intent, 33554432);
                if (a2 != null) {
                    a2.send();
                    pendingIntent = a2;
                }
                hVar.i(pendingIntent);
            }
        }
    }

    public final void L(MobileOfficialAppsClipsStat$TypeClipDownloadItem.DownloadState downloadState) {
        MobileOfficialAppsClipsStat$TypeClipDownloadItem.DownloadQuality downloadQuality;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.CLIPS;
        SchemeStat$TypeClipViewerItem.ScreenType screenType = SchemeStat$TypeClipViewerItem.ScreenType.TOP;
        SchemeStat$TypeClipViewerItem.EventType eventType = SchemeStat$TypeClipViewerItem.EventType.DOWNLOAD_STATE_CHANGE;
        a aVar = this.c;
        int i2 = d.$EnumSwitchMapping$0[aVar.c().ordinal()];
        if (i2 == 1) {
            downloadQuality = MobileOfficialAppsClipsStat$TypeClipDownloadItem.DownloadQuality.TYPE_1080P;
        } else if (i2 == 2) {
            downloadQuality = MobileOfficialAppsClipsStat$TypeClipDownloadItem.DownloadQuality.TYPE_720P;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            downloadQuality = MobileOfficialAppsClipsStat$TypeClipDownloadItem.DownloadQuality.TYPE_480P;
        }
        MobileOfficialAppsClipsStat$TypeClipDownloadItem.DownloadQuality downloadQuality2 = downloadQuality;
        SchemeStat$VideoListInfo schemeStat$VideoListInfo = null;
        MobileOfficialAppsClipsStat$TypeClipsSwipedItem mobileOfficialAppsClipsStat$TypeClipsSwipedItem = null;
        MobileOfficialAppsClipsStat$TypeClipsOpenFullscreenItem mobileOfficialAppsClipsStat$TypeClipsOpenFullscreenItem = null;
        MobileOfficialAppsClipsStat$TypeClipsOpenOwnerFromSubscriptionSnackbarItem mobileOfficialAppsClipsStat$TypeClipsOpenOwnerFromSubscriptionSnackbarItem = null;
        MobileOfficialAppsClipsStat$TypeClipsChooseTrendItem mobileOfficialAppsClipsStat$TypeClipsChooseTrendItem = null;
        MobileOfficialAppsClipsStat$TypeClipsOpenConstructor mobileOfficialAppsClipsStat$TypeClipsOpenConstructor = null;
        MobileOfficialAppsClipsStat$TypeClipsApplyConstructor mobileOfficialAppsClipsStat$TypeClipsApplyConstructor = null;
        SchemeStat$EventItem schemeStat$EventItem = null;
        SchemeStat$EventItem schemeStat$EventItem2 = null;
        SchemeStat$EventItem schemeStat$EventItem3 = null;
        MobileOfficialAppsClipsStat$TypeClipsSaaFloatingButton mobileOfficialAppsClipsStat$TypeClipsSaaFloatingButton = null;
        MobileOfficialAppsClipsStat$TypeClipsFloatingButton mobileOfficialAppsClipsStat$TypeClipsFloatingButton = null;
        MobileOfficialAppsClipsStat$TypeClipInternalNpsItem mobileOfficialAppsClipsStat$TypeClipInternalNpsItem = null;
        MobileOfficialAppsClipsStat$TypeClipInternalNpsEventItem mobileOfficialAppsClipsStat$TypeClipInternalNpsEventItem = null;
        MobileOfficialAppsClipsStat$TypeClipClickToMusicEventItem mobileOfficialAppsClipsStat$TypeClipClickToMusicEventItem = null;
        MobileOfficialAppsClipsStat$TypeClipsRetentionBlockEventItem mobileOfficialAppsClipsStat$TypeClipsRetentionBlockEventItem = null;
        MobileOfficialAppsClipsStat$TypeClipsTabRedDot mobileOfficialAppsClipsStat$TypeClipsTabRedDot = null;
        MobileOfficialAppsClipsStat$ClipsTabRedDotVisibilityChangedItem mobileOfficialAppsClipsStat$ClipsTabRedDotVisibilityChangedItem = null;
        MobileOfficialAppsClipsStat$ClipsExtendedFeedbackItem mobileOfficialAppsClipsStat$ClipsExtendedFeedbackItem = null;
        MobileOfficialAppsClipsStat$ClipViewerDescriptionItem mobileOfficialAppsClipsStat$ClipViewerDescriptionItem = null;
        MobileOfficialAppsClipsStat$ClipsSubscriptionItem mobileOfficialAppsClipsStat$ClipsSubscriptionItem = null;
        MobileOfficialAppsClipsStat$ClipsMoreMenuItem mobileOfficialAppsClipsStat$ClipsMoreMenuItem = null;
        MobileOfficialAppsClipsStat$ClipsPromoItem mobileOfficialAppsClipsStat$ClipsPromoItem = null;
        MobileOfficialAppsClipsStat$ClipsAnalyticsItem mobileOfficialAppsClipsStat$ClipsAnalyticsItem = null;
        MobileOfficialAppsClipsStat$TypeClipsClipItem mobileOfficialAppsClipsStat$TypeClipsClipItem = null;
        MobileOfficialAppsClipsStat$OwnerInfo mobileOfficialAppsClipsStat$OwnerInfo = null;
        MobileOfficialAppsClipsStat$TypeVolumeItem mobileOfficialAppsClipsStat$TypeVolumeItem = null;
        new iof(mobileOfficialAppsCoreNavStat$EventScreen, new SchemeStat$TypeClipViewerItem(screenType, eventType, schemeStat$VideoListInfo, new MobileOfficialAppsClipsStat$TypeClipDownloadItem(downloadState, true, downloadQuality2, aVar.e(), Long.valueOf(aVar.b()), Long.valueOf(aVar.g())), mobileOfficialAppsClipsStat$TypeClipsSwipedItem, mobileOfficialAppsClipsStat$TypeClipsOpenFullscreenItem, mobileOfficialAppsClipsStat$TypeClipsOpenOwnerFromSubscriptionSnackbarItem, mobileOfficialAppsClipsStat$TypeClipsChooseTrendItem, mobileOfficialAppsClipsStat$TypeClipsOpenConstructor, mobileOfficialAppsClipsStat$TypeClipsApplyConstructor, schemeStat$EventItem, schemeStat$EventItem2, schemeStat$EventItem3, mobileOfficialAppsClipsStat$TypeClipsSaaFloatingButton, mobileOfficialAppsClipsStat$TypeClipsFloatingButton, mobileOfficialAppsClipsStat$TypeClipInternalNpsItem, mobileOfficialAppsClipsStat$TypeClipInternalNpsEventItem, mobileOfficialAppsClipsStat$TypeClipClickToMusicEventItem, mobileOfficialAppsClipsStat$TypeClipsRetentionBlockEventItem, mobileOfficialAppsClipsStat$TypeClipsTabRedDot, mobileOfficialAppsClipsStat$ClipsTabRedDotVisibilityChangedItem, mobileOfficialAppsClipsStat$ClipsExtendedFeedbackItem, mobileOfficialAppsClipsStat$ClipViewerDescriptionItem, mobileOfficialAppsClipsStat$ClipsSubscriptionItem, mobileOfficialAppsClipsStat$ClipsMoreMenuItem, mobileOfficialAppsClipsStat$ClipsPromoItem, mobileOfficialAppsClipsStat$ClipsAnalyticsItem, mobileOfficialAppsClipsStat$TypeClipsClipItem, mobileOfficialAppsClipsStat$OwnerInfo, mobileOfficialAppsClipsStat$TypeVolumeItem, 1073741812, null)).q();
    }

    @Override // xsna.brc
    public final int b() {
        return this.h;
    }

    @Override // xsna.brc
    public final void cancel() {
        L(MobileOfficialAppsClipsStat$TypeClipDownloadItem.DownloadState.CANCELLED);
        this.d.b(this.h);
    }

    @Override // xsna.ye6, com.vk.instantjobs.InstantJob
    public final void h(Object obj) {
        x870 x870Var = x870.a;
        Context context = this.e;
        ca70.f(context).createNotificationChannel(new NotificationChannel("downloads_group", context.getString(R.string.notification_attachments_download_title), 3));
    }

    @Override // xsna.ye6, com.vk.instantjobs.InstantJob
    public final String k(Object obj) {
        return "downloads_group";
    }

    @Override // com.vk.instantjobs.InstantJob
    public final InstantJob.NotificationShowCondition p() {
        return InstantJob.NotificationShowCondition.WHEN_SUBMITED;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String q() {
        return "ClipDownloadWithRemoteTranscodingTask";
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "ClipDownloadWithRemoteTranscodingTask";
    }

    @Override // xsna.ye6, com.vk.instantjobs.InstantJob
    public final void v(Object obj, Throwable th) {
        cancel();
        throw th;
    }
}
