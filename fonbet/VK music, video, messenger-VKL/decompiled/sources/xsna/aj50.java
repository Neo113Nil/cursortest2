package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.T3;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.photos.PhotosGetAlbums;
import com.vk.attachpicker.fragment.gallery.PostingAttachGalleryFragment;
import com.vk.clips.design.view.camera.settings.ModalSettingsPrivacyOption;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.donut.impl.PaidSubscriptionsFragment;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stories.model.GetStoriesResponse;
import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;
import com.vk.feed.settings.impl.presentation.filtered.tab.b;
import com.vk.feed.settings.impl.presentation.filtered.tab.f;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.users.UserNameCase;
import com.vk.im.ui.components.viewcontrollers.msg_list.stb.ScrollToBottomAnimator;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.newsfeed.impl.posting.profilefriendslists.a;
import com.vk.newsfeed.impl.posting.profilefriendslists.holders.ProfileFriendsListHeaderVh;
import com.vk.notifications.list.impl.presentation.base.fragment.list.NotificationListFragment;
import com.vk.photos.root.selectalbum.domain.a;
import com.vk.reefton.Reef;
import com.vk.reefton.ReefEvent;
import com.vk.reefton.dto.ReefRequestReason;
import com.vk.stories.design.view.editor.SideControlPanelView;
import com.vk.video.ui.smartcrop.impl.presentation.feature.entity.SmartCropState;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.dto.RecordType;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.record.RecordDescription;
import ru.ok.android.externcalls.sdk.record.RecordDescriptionHistory;
import ru.ok.android.externcalls.sdk.record.RecordManager;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.atb0;
import xsna.bc70;
import xsna.cqc0;
import xsna.fji0;
import xsna.gm50;
import xsna.id70;
import xsna.msf0;
import xsna.mwi0;
import xsna.oem0;
import xsna.rwi0;
import xsna.s6a0;
import xsna.t6k0;
import xsna.vos;
import xsna.wd70;
import xsna.wwi0;
import xsna.z9j0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class aj50 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ aj50(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        RecyclerView recyclerView;
        RecordType recordType;
        Map map;
        lg8 lg8Var;
        hd8 hd8Var;
        RecordManager recordManager;
        Map<SessionRoomId, RecordDescriptionHistory> recordDescriptionHistory;
        Set<Map.Entry<SessionRoomId, RecordDescriptionHistory>> entrySet;
        String str;
        int i = 8;
        Object obj2 = null;
        switch (this.b) {
            case 0:
                vos.b bVar = (vos.b) obj;
                return ((zi50) this.c).a(bVar.a).l(new mau(new ut30(bVar, 4), i));
            case 1:
                nx50 nx50Var = (nx50) this.c;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : (List) obj) {
                    if (!epx.f(((sh00) obj3).a(), nx50Var.E0().k())) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 2:
                xi60 xi60Var = (xi60) this.c;
                xi60Var.c.a(b.e.a.b);
                xi60Var.d.c(new f.d.a((Throwable) obj));
                return s3q0.a;
            case 3:
                NotificationListFragment notificationListFragment = (NotificationListFragment) this.c;
                bc70 bc70Var = (bc70) obj;
                int i2 = NotificationListFragment.a0;
                if (bc70Var.equals(bc70.b.a)) {
                    notificationListFragment.finish();
                } else if (bc70Var.equals(bc70.c.a)) {
                    Context requireContext = notificationListFragment.requireContext();
                    p6y p6yVar = new p6y(notificationListFragment, 14);
                    id70.a aVar = new id70.a(requireContext, id70.a.g);
                    aVar.c(new cpo(false, iah0.a(150), 3));
                    aVar.F0(true);
                    aVar.x(0);
                    aVar.n0(0);
                    aVar.o0(0);
                    aVar.p0(0);
                    aVar.m0(0);
                    aVar.m(R.attr.vk_ui_background_modal);
                    aVar.R0(false);
                    aVar.F0(true);
                    aVar.a0(new dgm(p6yVar, 29));
                    notificationListFragment.R = aVar.I0(null);
                } else {
                    if (!(bc70Var instanceof bc70.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((ia70) notificationListFragment.Y.getValue()).a(((bc70.a) bc70Var).a, notificationListFragment.requireContext());
                }
                return s3q0.a;
            case 4:
                id70 id70Var = (id70) this.c;
                wd70 wd70Var = (wd70) obj;
                int i3 = id70.q1;
                if (wd70Var.equals(wd70.d.a)) {
                    id70Var.bo();
                    ((mh70) id70Var.l1.getValue()).c(id70Var.mo2getContext());
                } else if (wd70Var.equals(wd70.c.a)) {
                    id70Var.bo();
                    ((syk0) id70Var.p1.getValue()).c(((b25) id70Var.o1.getValue()).c());
                } else if (wd70Var.equals(wd70.b.a)) {
                    id70Var.bo();
                    ((ah00) id70Var.m1.getValue()).a(id70Var.requireContext());
                } else {
                    if (!wd70Var.equals(wd70.a.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    id70Var.bo();
                }
                return s3q0.a;
            case 5:
                PaidSubscriptionsFragment paidSubscriptionsFragment = (PaidSubscriptionsFragment) this.c;
                int i4 = PaidSubscriptionsFragment.V;
                paidSubscriptionsFragment.finish();
                return s3q0.a;
            case 6:
                s6a0 s6a0Var = (s6a0) this.c;
                u6a0 u6a0Var = s6a0Var.n;
                if (u6a0Var != null) {
                    u6a0Var.a(((s6a0.a) s6a0Var.m).a);
                }
                return s3q0.a;
            case 7:
                ((hha0) ((lha0) this.c).c).P((PhotosGetAlbums.a) obj);
                return s3q0.a;
            case 8:
                msb0 msb0Var = (msb0) this.c;
                atb0.a aVar2 = (atb0.a) obj;
                int i5 = msb0.n1;
                gm50.a.a(msb0Var, aVar2.a, new u6(26, msb0Var, aVar2));
                gm50.a.a(msb0Var, aVar2.c, new ut30(msb0Var, 9));
                gm50.a.a(msb0Var, aVar2.d, new h630(msb0Var, 19));
                return s3q0.a;
            case 9:
                PostingAttachGalleryFragment postingAttachGalleryFragment = (PostingAttachGalleryFragment) this.c;
                Boolean bool = (Boolean) obj;
                TextView textView = postingAttachGalleryFragment.W;
                if (textView != null) {
                    bwt0.p0(textView, !bool.booleanValue());
                }
                AppCompatSpinner appCompatSpinner = postingAttachGalleryFragment.V;
                if (appCompatSpinner != null) {
                    bwt0.p0(appCompatSpinner, !bool.booleanValue());
                }
                RecyclerPaginatedView recyclerPaginatedView = postingAttachGalleryFragment.g0;
                if (recyclerPaginatedView != null && (recyclerView = recyclerPaginatedView.getRecyclerView()) != null) {
                    bwt0.p0(recyclerView, !bool.booleanValue());
                }
                return s3q0.a;
            case 10:
                cqc0.c cVar = (cqc0.c) obj;
                switch (cqc0.d.$EnumSwitchMapping$1[((cqc0) this.c).f.ordinal()]) {
                    case 1:
                        ((ModalSettingsPrivacyOption) cVar.j.getValue()).setCheckVisible(true);
                        s3q0 s3q0Var = s3q0.a;
                        bwt0.p0(cVar.d, true);
                        bwt0.p0(cVar.o, false);
                        bwt0.p0(cVar.p, false);
                        bwt0.p0(cVar.v, false);
                        bwt0.p0(cVar.h, true);
                        bwt0.p0(cVar.i, false);
                        bwt0.p0(cVar.a().findViewById(R.id.posting_visibility_counter_stack_dropdown_image), true);
                        bwt0.p0(cVar.C, false);
                        bwt0.p0(cVar.D, false);
                        return s3q0.a;
                    case 2:
                        ((ModalSettingsPrivacyOption) cVar.k.getValue()).setCheckVisible(true);
                        s3q0 s3q0Var2 = s3q0.a;
                        bwt0.p0(cVar.d, true);
                        bwt0.p0(cVar.o, false);
                        bwt0.p0(cVar.p, false);
                        bwt0.p0(cVar.v, false);
                        bwt0.p0(cVar.h, true);
                        bwt0.p0(cVar.i, false);
                        bwt0.p0(cVar.a().findViewById(R.id.posting_visibility_counter_stack_dropdown_image), true);
                        bwt0.p0(cVar.C, false);
                        bwt0.p0(cVar.D, false);
                        return s3q0.a;
                    case 3:
                        ((ModalSettingsPrivacyOption) cVar.l.getValue()).setCheckVisible(true);
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        s3q0 s3q0Var3 = s3q0.a;
                        bwt0.p0(cVar.d, true);
                        bwt0.p0(cVar.o, false);
                        bwt0.p0(cVar.p, false);
                        bwt0.p0(cVar.v, false);
                        bwt0.p0(cVar.h, true);
                        bwt0.p0(cVar.i, false);
                        bwt0.p0(cVar.a().findViewById(R.id.posting_visibility_counter_stack_dropdown_image), true);
                        bwt0.p0(cVar.C, false);
                        bwt0.p0(cVar.D, false);
                        return s3q0.a;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            case 11:
                ((e5d0) this.c).Y0(true);
                return s3q0.a;
            case 12:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.h(tgi0Var, ((MarketProductTileConfig.b) this.c).b);
                qgi0.r(tgi0Var, "product_cta_button");
                qgi0.n(tgi0Var, 0);
                return s3q0.a;
            case 13:
                return new ProfileFriendsListHeaderVh((ViewGroup) obj, (a.InterfaceC1385a) this.c);
            case 14:
                tdu tduVar = (tdu) obj;
                tduVar.n(((vak0) ((zfe0) this.c).e).getFloatValue() - Float.intBitsToFloat((int) (tduVar.d() & 4294967295L)));
                return s3q0.a;
            case 15:
                wmf0 wmf0Var = (wmf0) this.c;
                ReefEvent reefEvent = (ReefEvent) obj;
                if (reefEvent instanceof ReefEvent.b) {
                    wmf0Var.a.a(wmf0Var, ReefRequestReason.APP_WAKEUP, System.currentTimeMillis());
                } else if (reefEvent instanceof ReefEvent.a) {
                    AtomicInteger atomicInteger = Reef.i;
                    com.vk.reefton.c cVar2 = Reef.j;
                    if (cVar2 != null) {
                        qof0 qof0Var = cVar2.a;
                        iof0 iof0Var = qof0Var.p;
                        if (iof0Var == null) {
                            iof0Var = qof0Var.q.invoke();
                            qof0Var.p = iof0Var;
                        }
                        if (iof0Var != null) {
                            try {
                                HashMap hashMap = new HashMap();
                                hashMap.put("snapshots_queue_length", Long.valueOf(cVar2.b.get()));
                                hashMap.put("psl_errors", Long.valueOf(cVar2.m.get()));
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("queue_limit", Long.valueOf(cVar2.c.get()));
                                hashMap2.put(X3.i.l, Long.valueOf(cVar2.d.get()));
                                hashMap2.put("offline", Long.valueOf(cVar2.e.get()));
                                hashMap2.put("wifi", Long.valueOf(cVar2.f.get()));
                                hashMap2.put("2g", Long.valueOf(cVar2.g.get()));
                                hashMap2.put(T3.a, Long.valueOf(cVar2.h.get()));
                                hashMap2.put("4g", Long.valueOf(cVar2.i.get()));
                                hashMap2.put("cellular_unknown", Long.valueOf(cVar2.j.get()));
                                hashMap2.put("other", Long.valueOf(cVar2.k.get()));
                                hashMap2.put("app_restart", Long.valueOf(cVar2.l.get()));
                                hashMap.put("lost_snapshots", hashMap2);
                                iof0Var.a(new JSONObject(pn00.t(hashMap)).toString());
                            } catch (Throwable th) {
                                qof0Var.b().b();
                                AtomicInteger atomicInteger2 = Reef.i;
                                Reef.a.a(th);
                            }
                        }
                    }
                }
                return s3q0.a;
            case 16:
                ((nsf0) this.c).C(msf0.c.b);
                return s3q0.a;
            case 17:
                ScrollToBottomAnimator scrollToBottomAnimator = (ScrollToBottomAnimator) this.c;
                View view = (View) obj;
                view.setVisibility(8);
                float f = -ScrollToBottomAnimator.f(view);
                Iterator<T> it = scrollToBottomAnimator.e(view).iterator();
                while (it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    View findViewById = scrollToBottomAnimator.a.findViewById(intValue);
                    if (findViewById != null) {
                        ScrollToBottomAnimator.Animation animation = (ScrollToBottomAnimator.Animation) scrollToBottomAnimator.c.get(Integer.valueOf(intValue));
                        if (animation == null) {
                            findViewById.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        } else {
                            long j = animation.e;
                            ViewPropertyAnimator viewPropertyAnimator = animation.d;
                            float f2 = animation.b;
                            long duration = (viewPropertyAnimator.getDuration() + viewPropertyAnimator.getStartDelay()) - (System.currentTimeMillis() - j);
                            if (duration < 0) {
                                duration = 0;
                            }
                            long duration2 = viewPropertyAnimator.getDuration();
                            if (duration > duration2) {
                                duration = duration2;
                            }
                            scrollToBottomAnimator.d(findViewById);
                            if (duration == 0) {
                                findViewById.setTranslationY(f2 + f);
                            } else {
                                findViewById.setTranslationY(findViewById.getTranslationY() + f);
                                float f3 = f2 + f;
                                ScrollToBottomAnimator.Animation.Type type = animation.a;
                                long startDelay = viewPropertyAnimator.getStartDelay() - (System.currentTimeMillis() - j);
                                scrollToBottomAnimator.a(findViewById, type, startDelay < 0 ? 0L : startDelay, animation.c, f3, duration, animation.f);
                            }
                        }
                    }
                }
                return s3q0.a;
            case 18:
                ((pf40) this.c).invoke(a.b.b);
                return s3q0.a;
            case 19:
                aji0 aji0Var = (aji0) this.c;
                gm50.a.a(aji0Var, ((fji0.a) obj).a, new arb0(aji0Var, 12));
                return s3q0.a;
            case 20:
                mwi0 mwi0Var = (mwi0) this.c;
                mwi0.a aVar3 = (mwi0.a) obj;
                if (aVar3.b instanceof wwi0.b.C3961b) {
                    mwi0Var.f.getClass();
                    y45 y45Var = OKVoipEngine.I.b;
                    OKVoipEngine.b.getClass();
                    Conversation z = OKVoipEngine.z();
                    if (z == null || (recordManager = z.getRecordManager()) == null || (recordDescriptionHistory = recordManager.getRecordDescriptionHistory()) == null || (entrySet = recordDescriptionHistory.entrySet()) == null) {
                        map = jgp.b;
                    } else {
                        Set<Map.Entry<SessionRoomId, RecordDescriptionHistory>> set = entrySet;
                        int e = on00.e(c5g.u(set, 10));
                        if (e < 16) {
                            e = 16;
                        }
                        map = new LinkedHashMap(e);
                        Iterator<T> it2 = set.iterator();
                        while (it2.hasNext()) {
                            Map.Entry entry = (Map.Entry) it2.next();
                            RecordDescription currentState = ((RecordDescriptionHistory) entry.getValue()).getCurrentState();
                            hd8 d = currentState != null ? ih8.d(currentState) : null;
                            RecordDescription previousState = ((RecordDescriptionHistory) entry.getValue()).getPreviousState();
                            Pair pair = new Pair(entry.getKey(), new lg8(d, previousState != null ? ih8.d(previousState) : null));
                            map.put(pair.i(), pair.j());
                        }
                    }
                    Iterator it3 = map.entrySet().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            Object next = it3.next();
                            if (epx.f(((Map.Entry) next).getKey(), ((wwi0.b.C3961b) aVar3.b).a.a)) {
                                obj2 = next;
                            }
                        }
                    }
                    Map.Entry entry2 = (Map.Entry) obj2;
                    if (entry2 == null || (lg8Var = (lg8) entry2.getValue()) == null || (hd8Var = lg8Var.b) == null || (recordType = hd8Var.f) == null) {
                        recordType = RecordType.NOTHING;
                    }
                } else {
                    recordType = RecordType.NOTHING;
                }
                mwi0Var.V(new rwi0.b.a(aVar3.a, recordType));
                return s3q0.a;
            case 21:
                x9j0 x9j0Var = (x9j0) this.c;
                z9j0.a aVar4 = (z9j0.a) obj;
                ProfilesSimpleInfo profilesSimpleInfo = aVar4.b;
                List B = rli0.B(rli0.t(new qli0(new i5g(aVar4.a.values()), new zcj(1)), new rh4(28, x9j0Var, profilesSimpleInfo)));
                if (!B.isEmpty()) {
                    ((ArrayList) B).add(new w9j0(B.size()));
                }
                DialogExt dialogExt = x9j0Var.e;
                qtd0 Bb = dialogExt.b.Bb(dialogExt.f);
                if (Bb == null || (str = Bb.d6(UserNameCase.GEN)) == null) {
                    str = "";
                }
                return new qsm(B, profilesSimpleInfo, null, 0, false, 0, new tkv(str, Bb != null ? Bb.r5() : false), false, 188);
            case 22:
                u76 u76Var = ((SideControlPanelView) this.c).u;
                if (u76Var != null) {
                    u76Var.d5();
                }
                return s3q0.a;
            case 23:
                return SmartCropState.a((SmartCropState) obj, null, null, (n4k0) this.c, null, 0L, false, null, false, false, null, 2043);
            case 24:
                return (t6k0.a) this.c;
            case 25:
                return qkk0.n((Context) obj, true, (VkSpinner.SpinnerSize) this.c);
            case 26:
                s3l0 s3l0Var = (s3l0) this.c;
                ArrayList arrayList2 = s3l0Var.h;
                arrayList2.clear();
                List<StickerStockItem> D0 = j5g.D0(new chf0(1), (List) obj);
                ArrayList arrayList3 = new ArrayList(c5g.u(D0, 10));
                for (StickerStockItem stickerStockItem : D0) {
                    d790 d790Var = s3l0Var.d;
                    if (d790Var == null) {
                        d790Var = null;
                    }
                    arrayList3.add(new qai0(stickerStockItem, d790Var.b.contains(stickerStockItem), true));
                }
                arrayList2.addAll(arrayList3);
                return s3q0.a;
            case 27:
                return new fhy(((ViewGroup) obj).getContext(), ((com.vk.stickers.keyboard.page.a) this.c).m);
            case 28:
                qtl0 qtl0Var = (qtl0) this.c;
                GetStoriesResponse getStoriesResponse = (GetStoriesResponse) obj;
                if (getStoriesResponse != null) {
                    qtl0Var.h(getStoriesResponse, true);
                }
                return s3q0.a;
            default:
                LinkedHashSet linkedHashSet = ((eim0) this.c).e;
                oem0 oem0Var = (oem0) obj;
                if (oem0Var instanceof oem0.a.d) {
                    linkedHashSet.add(Integer.valueOf(((oem0.a.d) oem0Var).a));
                } else if (oem0Var instanceof oem0.c.b) {
                    linkedHashSet.remove(Integer.valueOf(((oem0.c.b) oem0Var).a));
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ aj50(qkk0 qkk0Var, VkSpinner.SpinnerSize spinnerSize) {
        this.b = 25;
        this.c = spinnerSize;
    }
}
