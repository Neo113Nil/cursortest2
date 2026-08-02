package xsna;

import android.animation.ValueAnimator;
import android.database.sqlite.SQLiteDatabase;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.Ya;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.friends.discover.UserDiscoverSmoothScroller;
import com.vk.friends.discover.UsersDiscoverFragment;
import com.vk.friends.discover.UsersDiscoverLayoutManager;
import com.vk.friends.discover.UsersDiscoverListView;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.metrics.trackers.my.TimeSpentException;
import com.vk.metrics.trackers.my.event.ForegroundEvent;
import com.vk.photo.editor.features.mlenhance.TextSwitcherView;
import com.vk.stat.scheme.MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stories.design.view.editor.verticalization.VerticalizationLoadingView;
import com.vk.storycamera.screen.StoryCameraModalActivity;
import com.vk.voip.ui.view.VoipActionVerticalButtonView;
import com.vkontakte.android.R;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import xsna.cm70;
import xsna.o360;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class oo6 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oo6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List u0;
        Object obj;
        int i = 14;
        switch (this.b) {
            case 0:
                po6 po6Var = (po6) this.c;
                vrl0 vrl0Var = po6Var.B.get();
                if (vrl0Var != null) {
                    vrl0Var.b(MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.SHOW_LOADER, po6Var.m, po6Var.f, po6Var.getVideoViewDuration());
                }
                po6Var.C.removeCallbacksAndMessages(null);
                po6Var.setLoadingProgressVisible(true);
                po6Var.setErrorVisible(false);
                return;
            case 1:
                ((ffc) this.c).a();
                return;
            case 2:
                k3g k3gVar = (k3g) this.c;
                k3gVar.z = true;
                dne dneVar = k3gVar.A;
                if (dneVar != null) {
                    dneVar.invoke();
                    k3gVar.A = null;
                    return;
                }
                return;
            case 3:
                j7q j7qVar = (j7q) this.c;
                synchronized (j7qVar) {
                    try {
                        j7qVar.n = null;
                        j7qVar.p = null;
                        androidx.media3.datasource.cache.c cVar = j7qVar.m;
                        if (cVar != null) {
                            cVar.o();
                        }
                        j7qVar.m = null;
                        SQLiteDatabase writableDatabase = j7qVar.f.getWritableDatabase();
                        fl3.k(writableDatabase, new q8i0(writableDatabase, 5));
                        s3q0 s3q0Var = s3q0.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                File[] listFiles = j7qVar.b.listFiles();
                if (listFiles == null || (u0 = rl3.u0(listFiles)) == null) {
                    return;
                }
                Iterator it = u0.iterator();
                while (it.hasNext()) {
                    nbr.l((File) it.next());
                }
                return;
            case 4:
                UiTrackingScreen uiTrackingScreen = (UiTrackingScreen) this.c;
                com.vk.metrics.eventtracking.b.a.l(com.vk.stat.scheme.t0.a(uiTrackingScreen.a));
                AtomicReference<ForegroundEvent> atomicReference = wo50.a;
                MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = uiTrackingScreen.a;
                mt50 mt50Var = new mt50(mobileOfficialAppsCoreNavStat$EventScreen, uiTrackingScreen.f);
                AtomicReference<MobileOfficialAppsCoreNavStat$EventScreen> atomicReference2 = wo50.b;
                AtomicReference<ForegroundEvent> atomicReference3 = wo50.a;
                Iterator it2 = ((Set) ((jo50) wo50.c.getValue()).a.getValue()).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj = it2.next();
                        if (((p9c) obj).b(mt50Var)) {
                        }
                    } else {
                        obj = null;
                    }
                }
                p9c p9cVar = (p9c) obj;
                ForegroundEvent a = p9cVar != null ? p9cVar.a() : null;
                ForegroundEvent foregroundEvent = atomicReference3.get();
                if (a == null || a == foregroundEvent) {
                    Set<nbx0> set = ((obx0) wo50.d.getValue()).a;
                    if (!(set instanceof Collection) || !set.isEmpty()) {
                        Iterator<T> it3 = set.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (((nbx0) it3.next()).a(mt50Var)) {
                                    ForegroundEvent foregroundEvent2 = atomicReference3.get();
                                    if (foregroundEvent2 != null) {
                                        atomicReference3.set(null);
                                        jt50.e(foregroundEvent2);
                                    }
                                    MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen2 = atomicReference2.get();
                                    if (mobileOfficialAppsCoreNavStat$EventScreen2 != null && mobileOfficialAppsCoreNavStat$EventScreen2 != mobileOfficialAppsCoreNavStat$EventScreen && !jt50.b()) {
                                        mobileOfficialAppsCoreNavStat$EventScreen2.toString();
                                        jt50.b.remove(mobileOfficialAppsCoreNavStat$EventScreen2);
                                    }
                                    if (mobileOfficialAppsCoreNavStat$EventScreen2 != mobileOfficialAppsCoreNavStat$EventScreen) {
                                        atomicReference2.set(mobileOfficialAppsCoreNavStat$EventScreen);
                                        if (!jt50.b()) {
                                            mobileOfficialAppsCoreNavStat$EventScreen.toString();
                                            if (!jt50.b.add(mobileOfficialAppsCoreNavStat$EventScreen)) {
                                                com.vk.metrics.eventtracking.b.a.q(new TimeSpentException("Already started wasted tracking for " + mobileOfficialAppsCoreNavStat$EventScreen));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    atomicReference3.set(a);
                    MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen3 = atomicReference2.get();
                    if (mobileOfficialAppsCoreNavStat$EventScreen3 != null) {
                        atomicReference2.set(null);
                        if (!jt50.b()) {
                            mobileOfficialAppsCoreNavStat$EventScreen3.toString();
                            jt50.b.remove(mobileOfficialAppsCoreNavStat$EventScreen3);
                        }
                    }
                    if (foregroundEvent != null) {
                        jt50.e(foregroundEvent);
                    }
                    jt50.c(a);
                }
                bpn0 bpn0Var = o360.e;
                o360.a.a().a = uiTrackingScreen.a;
                return;
            case 5:
                ((cm70) this.c).g.a(cm70.a.C2668a.a);
                return;
            case 6:
                com.vk.media.ok.b bVar = (com.vk.media.ok.b) this.c;
                if (bVar.o()) {
                    if (bVar.u() && bVar.t) {
                        bVar.H.resetEffectToInitialState();
                        bVar.t = false;
                        return;
                    } else {
                        if (bVar.u) {
                            bVar.i.start(bVar.A, false, true, bVar.D, 0L);
                        }
                        bVar.H.onStartRecording();
                        return;
                    }
                }
                return;
            case 7:
                ((m3g0) this.c).S1();
                return;
            case 8:
                StoryCameraModalActivity storyCameraModalActivity = (StoryCameraModalActivity) this.c;
                int i2 = StoryCameraModalActivity.R;
                ValueAnimator valueAnimator = storyCameraModalActivity.Q;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                storyCameraModalActivity.o5(false);
                return;
            case 9:
                TextSwitcherView textSwitcherView = (TextSwitcherView) this.c;
                int i3 = TextSwitcherView.h;
                textSwitcherView.a();
                return;
            case 10:
                ((gzs) this.c).invoke();
                return;
            case 11:
                UsersDiscoverListView usersDiscoverListView = ((UsersDiscoverFragment) this.c).U;
                if (usersDiscoverListView != null) {
                    RecyclerView.o layoutManager = usersDiscoverListView.getLayoutManager();
                    UsersDiscoverLayoutManager usersDiscoverLayoutManager = layoutManager instanceof UsersDiscoverLayoutManager ? (UsersDiscoverLayoutManager) layoutManager : null;
                    if (usersDiscoverLayoutManager == null) {
                        return;
                    }
                    UserDiscoverSmoothScroller userDiscoverSmoothScroller = new UserDiscoverSmoothScroller(UserDiscoverSmoothScroller.ScrollType.OnBoardingLeft, usersDiscoverLayoutManager);
                    userDiscoverSmoothScroller.setTargetPosition(usersDiscoverLayoutManager.f.f);
                    usersDiscoverLayoutManager.startSmoothScroll(userDiscoverSmoothScroller);
                    return;
                }
                return;
            case 12:
                VerticalizationLoadingView verticalizationLoadingView = (VerticalizationLoadingView) this.c;
                d0u0.a(verticalizationLoadingView.x.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(150L), new fyd0(verticalizationLoadingView, i)).start();
                return;
            case 13:
                VideoView videoView = (VideoView) this.c;
                qcy<Object>[] qcyVarArr = VideoView.T0;
                videoView.getViewBinding().d.setBackground(null);
                return;
            case 14:
                VoipActionVerticalButtonView voipActionVerticalButtonView = (VoipActionVerticalButtonView) this.c;
                voipActionVerticalButtonView.setTitle(R.string.voip_call_menu_actions_screencast_start);
                voipActionVerticalButtonView.setTitleTextColor(anj.b(R.color.vk_ui_text_title_color, voipActionVerticalButtonView.getContext()));
                VoipActionVerticalButtonView.P4(voipActionVerticalButtonView, m33.a(R.drawable.vk_icon_arrow_up_rectangle_outline_28, voipActionVerticalButtonView.getContext()), 0, 14);
                return;
            default:
                Ya.c((Ya) this.c);
                return;
        }
    }
}
