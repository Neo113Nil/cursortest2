package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog.mvi.block.video.impl.video.trailer.VideoTrailerView$State;
import com.vk.clips.design.view.sidecontrols.side.reactions.ReactionsLoading;
import com.vk.clips.design.view.timeline.TimelineView;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.editor.timeline.state.TracksFilter;
import com.vk.log.L;
import com.vk.search.ui.api.SearchInputMethod;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryViewItem;
import com.vk.stories.design.view.stats.tabs.info.mvi.a;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.e;
import com.vk.story.viewer.stat.domain.LoadStrategy;
import com.vk.subscriptions.SubscriptionFragment;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.browser.internal.ui.changephone.VkChangePhoneResult;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.video.ad.VideoAdDialog;
import com.vk.video.profile.presentation.views.VideoNewProfileHeaderViewV2;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.vmoji.character.model.VmojiProductModel;
import com.vk.voip.dto.call_member.CallMemberId;
import java.lang.ref.WeakReference;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import one.video.exo.offline.DownloadInfo;
import org.json.JSONObject;
import xsna.eam0;
import xsna.fh8;
import xsna.gm50;
import xsna.jox0;
import xsna.lct0;
import xsna.o9w0;
import xsna.omt0;
import xsna.oyr0;
import xsna.tj50;
import xsna.v1t0;
import xsna.xn50;
import xsna.zh8;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class n9m0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n9m0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v49, types: [androidx.fragment.app.FragmentActivity] */
    /* JADX WARN: Type inference failed for: r13v54, types: [androidx.fragment.app.FragmentActivity] */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v54 */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ww50<?> Y;
        ww50<?> Y2;
        DownloadInfo c;
        dhw0 dhw0Var;
        Set<CallMemberId> set;
        dhw0 dhw0Var2;
        Set<CallMemberId> set2;
        r1 = 0;
        r1 = 0;
        r1 = 0;
        ?? r1 = 0;
        r2 = null;
        r2 = null;
        DownloadInfo.State state = null;
        switch (this.b) {
            case 0:
                p9m0 p9m0Var = (p9m0) this.c;
                L.i((Throwable) obj);
                p9m0Var.j.b(eam0.e.a);
                return s3q0.a;
            case 1:
                ebm0 ebm0Var = (ebm0) this.c;
                y0f0 y0f0Var = (y0f0) obj;
                ebm0Var.h.performHapticFeedback(0);
                nzl0 nzl0Var = ebm0Var.b;
                StoryEntry storyEntry = ebm0Var.e;
                ebm0Var.i.b(nzl0Var.i(storyEntry, true, Integer.valueOf(y0f0Var.a)).subscribe());
                ((anm0) ebm0Var.g.getValue()).q(MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.CLICK_TO_LIKE, MobileOfficialAppsCoreNavStat$EventScreen.STORY_VIEWER, ebm0Var.f, storyEntry, nzl0Var.p(), new wqb(23, ebm0Var, y0f0Var));
                return s3q0.a;
            case 2:
                ((o8) this.c).invoke(new a.C1808a(LoadStrategy.ONLY_API));
                return s3q0.a;
            case 3:
                ((com.vk.stories.design.view.stats.tabs.viewers.mvi.b) this.c).T(new e.a.c((Set) obj));
                return s3q0.a;
            case 4:
                ((zim0) this.c).l.performClick();
                ((etv0) obj).b(false);
                return s3q0.a;
            case 5:
                SubscriptionFragment subscriptionFragment = (SubscriptionFragment) this.c;
                int i = SubscriptionFragment.W;
                subscriptionFragment.finish();
                return s3q0.a;
            case 6:
                mbn0 mbn0Var = (mbn0) this.c;
                u7n0 u7n0Var = mbn0Var.p;
                Object obj2 = mbn0Var.l;
                u7n0Var.i1((obn0) (obj2 != null ? obj2 : null));
                return s3q0.a;
            case 7:
                ((rg50) this.c).C(((Integer) obj).intValue());
                return s3q0.a;
            case 8:
                TimelineView timelineView = (TimelineView) this.c;
                RectF rectF = (RectF) obj;
                igs igsVar = timelineView.l;
                rectF.left = igsVar.d.centerX();
                RectF rectF2 = igsVar.d;
                rectF.right = rectF2.centerX();
                if (timelineView.j.a.d.f(TracksFilter.ALL) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    rectF.top = rectF2.top - bmk.i;
                } else {
                    rectF.top = timelineView.k.d.bottom + bmk.h;
                }
                rectF.bottom = rectF2.bottom + bmk.i;
                return s3q0.a;
            case 9:
                k0p0 k0p0Var = (k0p0) this.c;
                Throwable th = (Throwable) obj;
                v1t0.b bVar = new v1t0.b(true);
                rwc rwcVar = k0p0Var.e;
                if (bVar.a) {
                    rwcVar.a(ReactionsLoading.LOAD_ADD_DISLIKE);
                } else {
                    rwcVar.a(ReactionsLoading.LOAD_REMOVE_DISLIKE);
                }
                rwcVar.b(bVar);
                k0p0Var.f.invoke(th);
                return s3q0.a;
            case 10:
                zrp0 zrp0Var = (zrp0) this.c;
                sfc sfcVar = (sfc) obj;
                sfc.a(sfcVar, "first", zrp0Var.a.getDescriptor());
                sfc.a(sfcVar, "second", zrp0Var.b.getDescriptor());
                sfc.a(sfcVar, "third", zrp0Var.c.getDescriptor());
                return s3q0.a;
            case 11:
                dsq0 dsq0Var = (dsq0) this.c;
                dsq0Var.s().w().b(153, dsq0Var.l);
                dsq0Var.s().w().b(159, dsq0Var.m);
                dsq0Var.s().w().b(154, dsq0Var.o);
                dsq0Var.s().w().b(158, dsq0Var.n);
                dsq0Var.s().w().b(155, dsq0Var.i);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(zou.a);
                Context context = e43.a;
                cuz.a(context != null ? context : null).b(dsq0Var.k, intentFilter);
                dsq0Var.s().w().b(9, dsq0Var.j);
                return s3q0.a;
            case 12:
                VideoAdDialog videoAdDialog = (VideoAdDialog) this.c;
                oyr0 oyr0Var = (oyr0) obj;
                int i2 = VideoAdDialog.W;
                if (oyr0Var.equals(oyr0.a.a)) {
                    videoAdDialog.b(true);
                } else if (oyr0Var.equals(oyr0.c.a)) {
                    ?? activity = videoAdDialog.getActivity();
                    ey50 ey50Var = activity instanceof ey50 ? (ey50) activity : null;
                    if (ey50Var != null && (Y2 = ey50Var.Y()) != null) {
                        Y2.S(videoAdDialog);
                    }
                } else {
                    if (!oyr0Var.equals(oyr0.b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Context mo2getContext = videoAdDialog.mo2getContext();
                    Activity h = mo2getContext != null ? e3m.h(mo2getContext) : null;
                    if (h != null && !p90.e(h) && !videoAdDialog.isDetached()) {
                        videoAdDialog.tn();
                    }
                    ?? activity2 = videoAdDialog.getActivity();
                    ey50 ey50Var2 = activity2 instanceof ey50 ? (ey50) activity2 : null;
                    if (ey50Var2 != null && (Y = ey50Var2.Y()) != null) {
                        Y.H(videoAdDialog);
                    }
                }
                return s3q0.a;
            case 13:
                TextView textView = (TextView) this.c;
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(new BitmapDrawable(textView.getResources(), (Bitmap) obj), (Drawable) null, (Drawable) null, (Drawable) null);
                return s3q0.a;
            case 14:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i3 = VideoMinimizableDiscoveryFragment.p1;
                xn50.a.c(videoMinimizableDiscoveryFragment, new c.a1.g(booleanValue));
                return s3q0.a;
            case 15:
                gd0 gd0Var = (gd0) this.c;
                ((Boolean) obj).getClass();
                int i4 = VideoNewProfileHeaderViewV2.y;
                gd0Var.invoke();
                return s3q0.a;
            case 16:
                w3t0 w3t0Var = (w3t0) this.c;
                l8l l8lVar = (l8l) obj;
                q1s0 q1s0Var = w3t0Var.e;
                if (q1s0Var != null) {
                    lwa0 lwa0Var = q1s0Var.d;
                    Integer num = w3t0Var.z;
                    lwa0Var.invoke(l8lVar, Integer.valueOf(num != null ? num.intValue() : 0));
                }
                return s3q0.a;
            case 17:
                ect0 ect0Var = (ect0) this.c;
                gm50.a.a(ect0Var, ((lct0.a) obj).a, new qjg0(ect0Var, 18));
                return s3q0.a;
            case 18:
                String str = (String) obj;
                mm80 mm80Var = ((yft0) this.c).c;
                if (mm80Var != null) {
                    if (!mm80Var.a) {
                        mm80Var = null;
                    }
                    if (mm80Var != null && (c = mm80Var.c(str)) != null) {
                        state = c.c;
                    }
                }
                return Boolean.valueOf(state == DownloadInfo.State.STATE_COMPLETED);
            case 19:
                return VideoTrailerView$State.a((VideoTrailerView$State) obj, null, null, null, null, new WeakReference(((omt0.c.a) ((omt0.c) this.c)).c), null, false, false, false, 8127);
            case 20:
                com.vk.superapp.browser.internal.ui.changephone.a aVar = (com.vk.superapp.browser.internal.ui.changephone.a) this.c;
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject == null) {
                    return null;
                }
                aVar.S = new VkChangePhoneResult.Success(jSONObject.getString("phone"));
                aVar.kn().finish();
                r3y.b();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("result", 1);
                return jSONObject2;
            case 21:
                ((wzs) this.c).invoke((String) obj, SearchInputMethod.Keyboard);
                return s3q0.a;
            case 22:
                ((mov0) this.c).c.j(JsApiMethodType.SHOW_SUBSCRIPTION_BOX, VkAppsErrors.b((Throwable) obj));
                return s3q0.a;
            case 23:
                ((r9w0) this.c).C(new o9w0.b((VmojiProductModel) obj));
                return s3q0.a;
            case 24:
                return new pyf0(((tj50.a) obj).a(new q8(((qgw0) this.c).d, 11), ao8.d));
            case 25:
                ((akw0) this.c).getClass();
                return new it80(((zh8) obj) instanceof zh8.a ? fh8.b.C2873b.a : null);
            case 26:
                return new qpw0((ViewGroup) obj, ((ipw0) this.c).i);
            case 27:
                otw0 otw0Var = (otw0) this.c;
                it80 it80Var = (it80) obj;
                int i5 = otw0.i1;
                ?? r2 = (it80Var == null || (dhw0Var2 = (dhw0) it80Var.a) == null || (set2 = dhw0Var2.h) == null || !set2.contains(otw0Var.f1)) ? false : true;
                if (it80Var != null && (dhw0Var = (dhw0) it80Var.a) != null && (set = dhw0Var.k) != null && set.contains(otw0Var.f1)) {
                    r1 = 1;
                }
                if (r2 == false || r1 != 0) {
                    otw0Var.dismiss();
                }
                return s3q0.a;
            default:
                ((gox0) this.c).T(jox0.a.b.b);
                return s3q0.a;
        }
    }
}
