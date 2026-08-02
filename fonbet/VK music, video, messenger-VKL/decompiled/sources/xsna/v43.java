package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.core.graphics.drawable.IconCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.NonBouncedAppBarLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.auth.modal.base.ModalAuthHostActivity;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.di.component.app.AppContextDiComponent;
import com.vk.dto.common.TimelineThumbs;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.photo.Photo;
import com.vk.dto.video.VideoNotificationsStatus;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.music.stickyplayer.domain.PlayerContext;
import com.vk.profile.user.impl.di.UserProfileComponentImpl;
import com.vk.pushes.dto.PushBusinessNotify;
import com.vk.pushes.notifications.im.BusinessNotifyNotification;
import com.vk.sharing.core.SharingActivity;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsGroupsStat$TypeGroupsEventItem;
import com.vk.stat.scheme.MobileOfficialAppsGroupsStat$VideoSubscribeEvent;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.superapp.api.dto.ad.AdInfo;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.b4;
import xsna.dz40;
import xsna.e8v0;
import xsna.js3;
import xsna.jyr0;
import xsna.jza0;
import xsna.kk70;
import xsna.sx40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class v43 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v43(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x02e6, code lost:
    
        if (r4.f() != false) goto L133;
     */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        RecyclerView.Adapter adapter;
        final VideoNotificationsStatus videoNotificationsStatus;
        owo0 owo0Var;
        TimelineThumbs B0;
        UserId userId;
        int i = this.b;
        boolean z = false;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                w43 w43Var = (w43) obj2;
                RecyclerView recyclerView = (RecyclerView) obj;
                NonBouncedAppBarLayout nonBouncedAppBarLayout = w43Var.I;
                if (nonBouncedAppBarLayout != null) {
                    if (!w43Var.T0()) {
                        if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
                            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                            if (linearLayoutManager != null) {
                                int itemCount = adapter.getItemCount();
                                int childCount = linearLayoutManager.getChildCount();
                                if (itemCount == childCount) {
                                    boolean z2 = linearLayoutManager.s() == 0;
                                    View childAt = linearLayoutManager.getChildAt(childCount - 1);
                                    if (childAt != null) {
                                        Rect rect = new Rect();
                                        childAt.getGlobalVisibleRect(rect);
                                        boolean z3 = rect.height() == childAt.getHeight();
                                        if (z2) {
                                            if (z3) {
                                                NonBouncedAppBarLayout nonBouncedAppBarLayout2 = w43Var.I;
                                                if (nonBouncedAppBarLayout2 != null) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        nonBouncedAppBarLayout.setExpandingBlocked(z);
                    }
                    z = true;
                    nonBouncedAppBarLayout.setExpandingBlocked(z);
                }
                return s3q0.a;
            case 1:
                ((izs) obj2).invoke(new js3.a(((ds3) obj).b));
                return s3q0.a;
            case 2:
                ((izs) obj2).invoke(new sx40.t(PlayerContext.FULL, ((dz40.o.a) ((zak0) ((aj4) obj).a).getValue()).a));
                return s3q0.a;
            case 3:
                final q75 q75Var = (q75) obj2;
                b4.c.b bVar = (b4.c.b) ((b4.c) obj);
                q75Var.getClass();
                if (bVar instanceof b4.c.b.C2584b) {
                    videoNotificationsStatus = VideoNotificationsStatus.NONE;
                } else if (bVar instanceof b4.c.b.a) {
                    videoNotificationsStatus = VideoNotificationsStatus.ALL;
                } else {
                    if (!(bVar instanceof b4.c.b.C2585c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    videoNotificationsStatus = VideoNotificationsStatus.PREFERRED;
                }
                VideoFile videoFile = q75Var.b.e;
                final UserId B = dz5.B(videoFile, videoFile.I0());
                q75Var.c.c(B, videoNotificationsStatus).o(asu0.a.d()).g(new io.reactivex.rxjava3.functions.a() { // from class: xsna.l75
                    @Override // io.reactivex.rxjava3.functions.a
                    public final void run() {
                        int i2;
                        int i3;
                        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
                        MobileOfficialAppsSearchStat$TypeSearchClickItem.Action action;
                        q75 q75Var2 = q75.this;
                        Context context = q75Var2.a;
                        yks0 yks0Var = q75Var2.b;
                        int[] iArr = jyr0.a.$EnumSwitchMapping$0;
                        VideoNotificationsStatus videoNotificationsStatus2 = videoNotificationsStatus;
                        int i4 = iArr[videoNotificationsStatus2.ordinal()];
                        if (i4 == 1) {
                            i2 = R.drawable.vk_icon_notification_waves_24;
                        } else if (i4 == 2) {
                            i2 = R.drawable.vk_icon_notification_outline_24;
                        } else {
                            if (i4 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i2 = R.drawable.vk_icon_notification_slash_outline_24;
                        }
                        int i5 = iArr[videoNotificationsStatus2.ordinal()];
                        if (i5 == 1) {
                            i3 = R.string.video_subscribe_all_notifications_message;
                        } else if (i5 == 2) {
                            i3 = R.string.video_subscribe_preferred_notifications_message;
                        } else {
                            if (i5 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i3 = R.string.video_unsubscribe_all_notifications_message;
                        }
                        jyr0.a(i2, i3, context);
                        int o0 = yks0Var.e.o0();
                        UiTrackingScreen uiTrackingScreen = UiTracker.j.b;
                        if (uiTrackingScreen == null || (mobileOfficialAppsCoreNavStat$EventScreen = uiTrackingScreen.a) == null) {
                            mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_DISCOVERY;
                        }
                        long j = o0;
                        UserId userId2 = B;
                        new bjc(mobileOfficialAppsCoreNavStat$EventScreen, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, Long.valueOf(j), Long.valueOf(userId2.b), null, null, null, 56, null), MobileOfficialAppsGroupsStat$TypeGroupsEventItem.a.a(userId2.b, null, null, new MobileOfficialAppsGroupsStat$VideoSubscribeEvent(kk70.a(videoNotificationsStatus2)), 30), 2)).q();
                        lzh0 lzh0Var = q75Var2.d;
                        if (lzh0Var != null) {
                            String r = yks0Var.e.r();
                            int i6 = kk70.a.$EnumSwitchMapping$0[videoNotificationsStatus2.ordinal()];
                            if (i6 == 1) {
                                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SUBSCRIBE_ALL_OUT;
                            } else if (i6 == 2) {
                                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SUBSCRIBE_NO_NOTIFY_OUT;
                            } else {
                                if (i6 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SUBSCRIBE_USEFUL_OUT;
                            }
                            lzh0Var.b(action, r);
                        }
                    }
                }).i(new defpackage.d(new n82(6), 7)).subscribe();
                return s3q0.a;
            case 4:
                BusinessNotifyNotification businessNotifyNotification = (BusinessNotifyNotification) obj;
                PushBusinessNotify pushBusinessNotify = (PushBusinessNotify) j5g.k0((List) obj2);
                String str = pushBusinessNotify != null ? pushBusinessNotify.c : null;
                BusinessNotifyNotification.BusinessNotifyNotificationContainer businessNotifyNotificationContainer = businessNotifyNotification.z;
                CharSequence charSequence = businessNotifyNotification.n;
                String str2 = businessNotifyNotificationContainer.o;
                CharSequence charSequence2 = businessNotifyNotificationContainer.e;
                if (!drm0.N(str2)) {
                    str = businessNotifyNotificationContainer.o;
                } else if (str == null || drm0.N(str)) {
                    str = (charSequence == null || drm0.N(charSequence)) ? (charSequence2 == null || drm0.N(charSequence2)) ? "?" : charSequence2 : charSequence;
                }
                Bitmap bitmap = businessNotifyNotification.d;
                IconCompat c = bitmap != null ? IconCompat.c(bitmap) : null;
                j1a0 j1a0Var = new j1a0();
                j1a0Var.a = str;
                j1a0Var.b = c;
                j1a0Var.c = null;
                j1a0Var.d = null;
                j1a0Var.e = false;
                j1a0Var.f = false;
                return j1a0Var;
            case 5:
                return ((wgb) obj2).s + ": updateExpiredProfiles: finished, profileIds=" + ((f1e0) obj);
            case 6:
                ((hzc) obj2).c((VideoFile) obj);
                return s3q0.a;
            case 7:
                ((wbh) obj2).e.d = true;
                o3h o3hVar = ((d4h) obj).h;
                if (o3hVar != null) {
                    o3hVar.w(e8v0.g.b);
                }
                return s3q0.a;
            case 8:
                com.vk.music.analytics.api.collector.strategy.a aVar = (com.vk.music.analytics.api.collector.strategy.a) obj2;
                aVar.f.a((ax1) obj);
                aVar.i.clear();
                aVar.h = null;
                return s3q0.a;
            case 9:
                return ((sal) obj2).a + "-jobs-queue[" + ((String) obj) + ']';
            case 10:
                ugl uglVar = (ugl) obj2;
                ocx ocxVar = uglVar.l;
                VideoFile c2 = uglVar.e.c((String) obj);
                if (c2 == null || (B0 = c2.B0()) == null) {
                    owo0Var = null;
                } else {
                    int i2 = B0.b;
                    int i3 = B0.c;
                    int i4 = B0.d;
                    owo0Var = new owo0(i2, i3, i4, B0.e / i4, B0.f, B0.i);
                }
                uglVar.w(ocx.a(ocxVar, null, null, false, null, null, null, false, false, null, null, owo0Var, null, null, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, 4192255));
                return s3q0.a;
            case 11:
                return Long.valueOf(((n3q) obj2).p((adx0) obj));
            case 12:
                ((z520) obj2).c((Photo) obj, true);
                return s3q0.a;
            case 13:
                ModalAuthHostActivity modalAuthHostActivity = (ModalAuthHostActivity) obj;
                List<String> list = ModalAuthHostActivity.h;
                if (((Ref$BooleanRef) obj2).element) {
                    modalAuthHostActivity.finish();
                }
                return s3q0.a;
            case 14:
                ((h7f0) obj2).T((pk50) obj);
                return s3q0.a;
            case 15:
                jza0.c cVar = (jza0.c) obj2;
                StringBuilder b = jr.b(cVar.b, "OneVideoExoPlayer.seekPositionFromPositionInfo() - positonInfo= { ", ", ", cVar.f);
                b.append(" source= ");
                b.append((sht0) obj);
                return b.toString();
            case 16:
                Activity activity = (Activity) obj2;
                g7s0 B2 = fxc0.B();
                VideoFile videoFile2 = ((VideoAttachment) obj).k;
                Owner s = videoFile2.s();
                if (s == null || (userId = s.b) == null) {
                    userId = UserId.d;
                }
                g7s0.m(B2, activity, videoFile2, userId, null, null, 24);
                return s3q0.a;
            case 17:
                SharingActivity sharingActivity = (SharingActivity) obj2;
                Bundle bundle = SharingActivity.n0;
                sharingActivity.getClass();
                ((com.vk.storycamera.builder.a) obj).C(sharingActivity);
                return null;
            case 18:
                zdn0 zdn0Var = (zdn0) obj2;
                ((zak0) zdn0Var.s).setValue(Boolean.TRUE);
                zdn0Var.r.setContent(new jai(-135737926, new cg4(8, zdn0Var, (AdInfo) obj), true));
                return s3q0.a;
            case 19:
                qcy<Object>[] qcyVarArr = UserProfileComponentImpl.m;
                return new tyk0(((AppContextDiComponent) obj2).a, ((UserProfileComponentImpl) obj).c.p().e());
            default:
                bpn0 bpn0Var = VideoOverlayView.I;
                ((VideoOverlayView.c.g) obj2).c.invoke((VideoOverlayView) obj);
                return s3q0.a;
        }
    }
}
