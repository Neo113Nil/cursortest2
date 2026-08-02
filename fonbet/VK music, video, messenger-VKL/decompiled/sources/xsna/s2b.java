package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.playlists.ClipsPlaylistNamingLaunchParams;
import com.vk.clips.playlists.di.ClipsPlaylistsComponent;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.di.component.app.AppContextDiComponent;
import com.vk.dto.narratives.Narrative;
import com.vk.home.HomeFragment2;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.libvideo.author.VideoPinType;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetSideEffectOptions;
import com.vk.profile.community.subscription.impl.di.CommunitySubscriptionComponentImpl;
import com.vk.profile.core.tabs.state.CommunityProfileContent;
import com.vk.repository.data.api.di.DataRepositoryComponent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypePinVideoAction;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.h7u0;
import xsna.j3t0;
import xsna.t2b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class s2b implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ s2b(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0148  */
    /* JADX WARN: Type inference failed for: r1v40, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        MobileOfficialAppsVideoStat$TypePinVideoAction.BlockName blockName;
        boolean z;
        int i;
        Integer valueOf;
        boolean z2;
        int i2 = this.b;
        int i3 = 16;
        int i4 = 1;
        int i5 = 0;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i2) {
            case 0:
                return (t2b.a) ((l7r0) obj3).d((ij20) obj2, ((t2b) obj).i);
            case 1:
                zh.j((Canvas) obj3, (r7z) obj2, ((utx0) obj).c.a);
                return s3q0.a;
            case 2:
                smq.f(((yah) obj3).e, (Context) obj2, (Narrative) obj, null, null, null, false, null, null, IronSourceError.ERROR_CODE_INIT_FAILED);
                return s3q0.a;
            case 3:
                qcy<Object>[] qcyVarArr = CommunitySubscriptionComponentImpl.e;
                return new s6h(((AppContextDiComponent) obj3).a, null, ((BridgeComponent) obj2).F(), ((DataRepositoryComponent) obj).D(), null, null, null);
            case 4:
                qor qorVar = (qor) obj3;
                List<t0u0> list = (List) obj2;
                mpr mprVar = (mpr) obj;
                mpr g = qorVar.g(list);
                int size = list.size();
                while (i5 < size) {
                    g.c.get(i5).a = list.get(i5).a;
                    i5++;
                }
                qor.l(qorVar, mprVar, g, new x5i(qorVar, i3));
                return s3q0.a;
            case 5:
                Rect rect = (Rect) obj2;
                RectF rectF = (RectF) obj;
                int i6 = HomeFragment2.x0;
                if (((View) obj3).getGlobalVisibleRect(rect)) {
                    rect.inset(0, -cn70.b(2));
                    rectF.set(rect);
                } else {
                    rectF.setEmpty();
                }
                return rectF;
            case 6:
                vm30 vm30Var = (vm30) obj3;
                vm30Var.u.post(new qm30(vm30Var, (MsgFromUser) obj2, (fm20) obj, i5));
                return s3q0.a;
            case 7:
                Activity activity = (Activity) obj3;
                int i7 = h7u0.p;
                h7u0.a c = h7u0.b.c(activity);
                c.c = false;
                c.U(R.string.vk_permissions_notification);
                c.c0(R.string.vk_permissions_notification_button_understand, new u520(i4, (aa70) obj2, (io.reactivex.rxjava3.core.b) obj));
                l500 l500Var = new l500(c.m(), i3);
                if (Build.VERSION.SDK_INT >= 29) {
                    activity.registerActivityLifecycleCallbacks(new ga0(activity, l500Var));
                } else {
                    activity.getApplication().registerActivityLifecycleCallbacks(new ha0(activity, l500Var));
                }
                return s3q0.a;
            case 8:
                y6s0 y6s0Var = (y6s0) obj3;
                s6s0 s6s0Var = (s6s0) obj2;
                Activity activity2 = (Activity) obj;
                if (y6s0Var != null) {
                    y6s0Var.b(VideoBottomSheetSideEffectOptions.PIN, s6s0Var.a);
                }
                long j = s6s0Var.a.I0().b;
                int o0 = s6s0Var.a.o0();
                VideoPinType videoPinType = VideoPinType.SUBSCRIBERS;
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
                MobileOfficialAppsVideoStat$TypePinVideoAction.EventType eventType = MobileOfficialAppsVideoStat$TypePinVideoAction.EventType.PIN_VIDEO;
                int[] iArr = j3t0.a.$EnumSwitchMapping$0;
                int i8 = iArr[videoPinType.ordinal()];
                if (i8 == 1) {
                    blockName = MobileOfficialAppsVideoStat$TypePinVideoAction.BlockName.ALL;
                } else if (i8 == 2) {
                    blockName = MobileOfficialAppsVideoStat$TypePinVideoAction.BlockName.FOLLOWERS;
                } else {
                    if (i8 != 3) {
                        if (i8 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        z = 4;
                        blockName = null;
                        new iid0(c2, SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsVideoStat$TypePinVideoAction(j, o0, eventType, blockName, MobileOfficialAppsVideoStat$TypePinVideoAction.VideoType.VIDEO, MobileOfficialAppsVideoStat$TypePinVideoAction.EventSubtype.FROM_MAIN), 3)).q();
                        i = iArr[videoPinType.ordinal()];
                        if (i != 1) {
                            valueOf = Integer.valueOf(R.string.channel_pin_success_all);
                        } else if (i == 2) {
                            valueOf = Integer.valueOf(R.string.channel_pin_success_subscribers);
                        } else if (i == 3) {
                            valueOf = Integer.valueOf(R.string.channel_pin_success_unsubscribers);
                        } else {
                            if (i != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            valueOf = null;
                        }
                        if (valueOf != null) {
                            j3t0.a(activity2, activity2.getString(valueOf.intValue()));
                        }
                        return s3q0.a;
                    }
                    blockName = MobileOfficialAppsVideoStat$TypePinVideoAction.BlockName.NON_FOLLOWERS;
                }
                z = 4;
                new iid0(c2, SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsVideoStat$TypePinVideoAction(j, o0, eventType, blockName, MobileOfficialAppsVideoStat$TypePinVideoAction.VideoType.VIDEO, MobileOfficialAppsVideoStat$TypePinVideoAction.EventSubtype.FROM_MAIN), 3)).q();
                i = iArr[videoPinType.ordinal()];
                if (i != 1) {
                }
                if (valueOf != null) {
                }
                return s3q0.a;
            case 9:
                nqq0 nqq0Var = (nqq0) obj3;
                Context context = (Context) obj2;
                ((ClipsPlaylistsComponent) nqq0Var.c.d.getValue()).e().a(context, new ClipsPlaylistNamingLaunchParams(((CommunityProfileContent) obj).a, "", false, "community_playlist_result", 0, null, 48, null), nqq0Var.b.a.kn().getSupportFragmentManager(), null);
                Object obj4 = context;
                while (true) {
                    z2 = obj4 instanceof FragmentActivity;
                    if (!z2 && (obj4 instanceof ContextWrapper)) {
                        obj4 = ((ContextWrapper) obj4).getBaseContext();
                    }
                }
                FragmentActivity fragmentActivity = (FragmentActivity) (z2 ? (Activity) obj4 : null);
                FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                supportFragmentManager.l0("community_playlist_result", fragmentActivity, new uj0(supportFragmentManager, ((ClipsPlaylistsComponent) nqq0Var.c.d.getValue()).e().c(context, new y160(17))));
                return s3q0.a;
            default:
                q1t0 q1t0Var = (q1t0) obj3;
                wak0 wak0Var = (wak0) q1t0Var.b;
                wak0Var.C(wak0Var.getIntValue() + 1);
                q1t0Var.c(false);
                q1t0Var.b(false);
                q1t0Var.f(false);
                q1t0Var.e(false);
                q1t0Var.d(false);
                ((com.vk.repository.internal.repos.stickers.suggests.a) obj2).invoke(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                ((izs) obj).invoke(Boolean.FALSE);
                return s3q0.a;
        }
    }

    public /* synthetic */ s2b(f5f f5fVar, Canvas canvas, r7z r7zVar, utx0 utx0Var) {
        this.b = 1;
        this.c = canvas;
        this.d = r7zVar;
        this.e = utx0Var;
    }
}
