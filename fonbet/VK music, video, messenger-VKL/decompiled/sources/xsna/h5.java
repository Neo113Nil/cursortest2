package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.vk.catalog2.common.dto.api.CatalogCatalog;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.clips.sdk.shared.item.ads.events.AdsItemViewEvent;
import com.vk.clips.sdk.shared.item.clip.ClipItemAction;
import com.vk.clips.sdk.shared.item.common.error.ErrorOverlayRenderDelegate;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.messages.MsgReaction;
import com.vk.im.settings.appearance.AppearanceSettingsWithBackgroundsFragment;
import com.vk.im.ui.views.settings.CheckableLabelSettingsView;
import com.vk.instantjobs.InstantJob;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import com.vk.newsfeed.api.posting.viewpresenter.PreviewRatio;
import com.vk.photos.root.albumdetails.presentation.d;
import com.vk.profile.core.content.profilelist.fragments.AbsUserListFragment;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import one.video.player.OneVideoPlayer;
import xsna.b7c0;
import xsna.ca9;
import xsna.cwb0;
import xsna.ji8;
import xsna.m99;
import xsna.pqc;
import xsna.r5;
import xsna.x89;
import xsna.xn50;
import xsna.zy0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class h5 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h5(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = 3;
        Object obj2 = null;
        r4 = true;
        boolean z = true;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                View view = (View) obj;
                bwt0.h(view, new n0(r4 ? 1 : 0, (r5.a) obj3, view));
                return s3q0.a;
            case 1:
                int i3 = AbsUserListFragment.N0;
                ((AbsUserListFragment) obj3).No((UserProfile) obj);
                return s3q0.a;
            case 2:
                int i4 = yrr0.m;
                return new yrr0(((fj0) obj3).h.inflate(R.layout.vkim_dialog_mentions_loading, (ViewGroup) obj, false));
            case 3:
                ux0 ux0Var = (ux0) obj3;
                if (zy0.a.$EnumSwitchMapping$0[((ErrorOverlayRenderDelegate.ErrorOverlayAction) obj).ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                ux0Var.a(AdsItemViewEvent.d.b);
                return s3q0.a;
            case 4:
                ((gg1) obj3).T(new d.h((Set) obj));
                return s3q0.a;
            case 5:
                wq1 wq1Var = (wq1) obj3;
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.r(tgi0Var, "album_library_card_test_tag");
                bgi0.d(tgi0Var, wq1Var.c);
                PreviewViewState.b bVar = wq1Var.d.a().i;
                PreviewViewState.r rVar = bVar instanceof PreviewViewState.r ? (PreviewViewState.r) bVar : null;
                bgi0.b(tgi0Var, rVar != null ? Integer.valueOf(rVar.a) : null);
                return s3q0.a;
            case 6:
                ((pt2) obj3).X0(new x89.b(d370.v((Throwable) obj)));
                return s3q0.a;
            case 7:
                yp80 yp80Var = (yp80) obj3;
                if (yp80Var != null) {
                    yp80Var.onSuccess();
                }
                return s3q0.a;
            case 8:
                AppearanceSettingsWithBackgroundsFragment appearanceSettingsWithBackgroundsFragment = (AppearanceSettingsWithBackgroundsFragment) obj3;
                AppearanceSettingsWithBackgroundsFragment.c cVar = (AppearanceSettingsWithBackgroundsFragment.c) obj;
                CheckableLabelSettingsView checkableLabelSettingsView = appearanceSettingsWithBackgroundsFragment.Q;
                if (checkableLabelSettingsView == null) {
                    checkableLabelSettingsView = null;
                }
                checkableLabelSettingsView.setChecked(cVar.a);
                CheckableLabelSettingsView checkableLabelSettingsView2 = appearanceSettingsWithBackgroundsFragment.R;
                if (checkableLabelSettingsView2 == null) {
                    checkableLabelSettingsView2 = null;
                }
                checkableLabelSettingsView2.setVisibility(cVar.b ? 0 : 8);
                CheckableLabelSettingsView checkableLabelSettingsView3 = appearanceSettingsWithBackgroundsFragment.R;
                if (checkableLabelSettingsView3 == null) {
                    checkableLabelSettingsView3 = null;
                }
                checkableLabelSettingsView3.setChecked(cVar.c);
                CheckableLabelSettingsView checkableLabelSettingsView4 = appearanceSettingsWithBackgroundsFragment.S;
                if (checkableLabelSettingsView4 == null) {
                    checkableLabelSettingsView4 = null;
                }
                checkableLabelSettingsView4.setChecked(cVar.d);
                CheckableLabelSettingsView checkableLabelSettingsView5 = appearanceSettingsWithBackgroundsFragment.T;
                (checkableLabelSettingsView5 != null ? checkableLabelSettingsView5 : null).setChecked(cVar.e);
                return s3q0.a;
            case 9:
                Throwable th = (Throwable) obj;
                if (((jr4) obj3).s != null) {
                    zk70.e(th);
                }
                return s3q0.a;
            case 10:
                or7 or7Var = (or7) obj3;
                g47 g47Var = (g47) obj;
                g47Var.e(tci.l(or7Var), vr7.b);
                l370.n(g47Var, f9t.w(or7Var), new b40(3));
                g47Var.d(new dr7(or7Var, 0));
                return s3q0.a;
            case 11:
                InstantJob instantJob = (InstantJob) obj;
                return Boolean.valueOf((instantJob instanceof r28) && epx.f(((r28) instantJob).c, ((w28) obj3).d.c));
            case 12:
                ik8 ik8Var = (ik8) obj3;
                ji8.a aVar = ik8Var.s;
                if (aVar != null) {
                    Object obj4 = aVar.g ? null : aVar.a;
                    r6 r6Var = ik8Var.t;
                    if (r6Var != null) {
                        r6Var.invoke(obj4);
                    }
                }
                return s3q0.a;
            case 13:
                com.vk.voip.ui.settings.participants_view.c cVar2 = (com.vk.voip.ui.settings.participants_view.c) obj3;
                Integer num = (Integer) obj;
                Toolbar toolbar = cVar2.i;
                if (num == null) {
                    TextView titleTextView = toolbar.getTitleTextView();
                    if (titleTextView != null) {
                        bwt0.p0(titleTextView, false);
                    }
                } else {
                    TextView titleTextView2 = toolbar.getTitleTextView();
                    if (titleTextView2 != null) {
                        bwt0.p0(titleTextView2, true);
                    }
                    toolbar.setTitle(enj.f(R.plurals.voip_participants_title_participant_count, num.intValue(), cVar2.a));
                }
                return s3q0.a;
            case 14:
                return ca9.c.a((ca9.c) obj, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, false, null, false, (Boolean) ((m99.a) obj3).a, -1, 255);
            case 15:
                ((dg9) obj3).a.r2();
                return s3q0.a;
            case 16:
                ((Boolean) obj).booleanValue();
                ((CameraUIView) obj3).j1 = null;
                return s3q0.a;
            case 17:
                ((yp9) obj3).c.b((Throwable) obj);
                return s3q0.a;
            case 18:
                lu9 lu9Var = (lu9) obj3;
                float floatValue = ((Float) obj).floatValue();
                thk thkVar = lu9Var.k;
                if (thkVar != null) {
                    PreviewRatio a = lu9Var.b.a(floatValue);
                    thkVar.k.remove(Float.valueOf(a.b() / a.a()));
                }
                return s3q0.a;
            case 19:
                return ((CatalogExtendedData) obj3).b.get(String.valueOf(((UserId) obj).b));
            case 20:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj3;
                Iterator<T> it = ((UIBlockList) obj).y.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (linkedHashMap.containsKey(((UIBlock) next).b)) {
                            obj2 = next;
                        }
                    }
                }
                return Boolean.valueOf(obj2 != null);
            case 21:
                b7c0.b bVar2 = ((hpa) obj3).m;
                return s3q0.a;
            case 22:
                ((i9b) obj3).k();
                ((ikv0) obj).a();
                return s3q0.a;
            case 23:
                ymb ymbVar = (ymb) obj3;
                Map<Long, Collection<Triple<Integer, Integer, Collection<MsgReaction>>>> map = ((n980) obj).c;
                DialogExt dialogExt = ymbVar.i;
                Collection<Triple<Integer, Integer, Collection<MsgReaction>>> collection = map.get(Long.valueOf(dialogExt != null ? dialogExt.e : 0L));
                if (collection != null) {
                    ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
                    com.vk.mvi.core.internal.executors.a.b(new xy0(i2, collection, ymbVar));
                }
                return s3q0.a;
            case 24:
                azb azbVar = ((xyb) obj3).A;
                if (azbVar != null) {
                    azbVar.a().c(cwb0.b.e, new m4(azbVar, 15));
                }
                return s3q0.a;
            case 25:
                final tqc tqcVar = (tqc) obj3;
                final hda hdaVar = (hda) obj;
                final Object obj5 = hdaVar.a;
                return (!(obj5 instanceof CatalogSection) ? io.reactivex.rxjava3.internal.operators.completable.i.b : io.reactivex.rxjava3.core.a.l(new io.reactivex.rxjava3.functions.a() { // from class: xsna.sqc
                    @Override // io.reactivex.rxjava3.functions.a
                    public final void run() {
                        hda hdaVar2;
                        bpn0 bpn0Var = tqc.this.D;
                        ((pqc) bpn0Var.getValue()).getClass();
                        pqc.a P0 = pqc.g.P0();
                        if (P0 instanceof pqc.a.b) {
                            hdaVar2 = ((pqc.a.b) P0).a;
                        } else if (P0 instanceof pqc.a.c) {
                            hdaVar2 = ((pqc.a.c) P0).a;
                        } else {
                            if (!(P0 instanceof pqc.a.C3527a) && !(P0 instanceof pqc.a.d) && P0 != null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            hdaVar2 = null;
                        }
                        Object obj6 = hdaVar2 != null ? hdaVar2.a : null;
                        if (obj6 instanceof CatalogCatalog) {
                            pqc pqcVar = (pqc) bpn0Var.getValue();
                            Object obj7 = obj5;
                            CatalogCatalog zb = CatalogCatalog.zb((CatalogCatalog) obj6, Collections.singletonList(obj7), ((CatalogSection) obj7).b, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                            CatalogExtendedData catalogExtendedData = hdaVar2.b;
                            hda hdaVar3 = hdaVar;
                            catalogExtendedData.zb(hdaVar3.b);
                            s3q0 s3q0Var = s3q0.a;
                            pqcVar.b(new hda(zb, catalogExtendedData, hdaVar3.c));
                        }
                    }
                })).t(hdaVar);
            case 26:
                ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) obj3;
                String str = (String) obj;
                int i5 = ClipFeedListFragment.a2;
                ClipFeedTab Ka = clipFeedListFragment.Ka();
                Ka.getClass();
                if ((Ka instanceof ClipFeedTab.SingleClip) || (Ka instanceof ClipFeedTab.SingleClipByVideoId) || (Ka instanceof ClipFeedTab.SingleClipWithDecoration) || (Ka instanceof ClipFeedTab.SingleClipFromBlock)) {
                    FeedItem feedItem = (FeedItem) j5g.a0(clipFeedListFragment.ro());
                    if (epx.f(feedItem != null ? feedItem.F() : null, str)) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            case 27:
                o1d o1dVar = (o1d) obj3;
                o1dVar.getClass();
                xn50.a.c(o1dVar, (ClipItemAction.e) obj);
                return s3q0.a;
            case 28:
                ((w6d) obj3).e.a(l3d.b);
                return s3q0.a;
            default:
                ((OneVideoPlayer) obj).d0(((c9d) obj3).i);
                return s3q0.a;
        }
    }

    public /* synthetic */ h5(eda edaVar, LinkedHashMap linkedHashMap) {
        this.b = 20;
        this.c = linkedHashMap;
    }
}
