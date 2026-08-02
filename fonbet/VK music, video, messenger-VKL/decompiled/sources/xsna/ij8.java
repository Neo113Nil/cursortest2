package xsna;

import android.app.Activity;
import android.content.Context;
import android.transition.Fade;
import android.transition.Slide;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.d;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.entrypoints.ui.ClipsEntryPointsFragment;
import com.vk.clips.entrypoints.ui.ClipsEntryPointsViewState;
import com.vk.clips.entrypoints.ui.a;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.PopupStickersChatSettingsModel;
import com.vk.dto.stickers.StickerPackRecommendationBlock;
import com.vk.dto.stickers.popup.PopupStickerAnimation;
import com.vk.dto.user.RequestUserProfile;
import com.vk.feed.design.view.newsfeed.avatar_stack.AvatarAnimatedStack;
import com.vk.im.engine.models.attaches.AttachSticker;
import com.vk.im.engine.models.emails.Email;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.a;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.music.offline.impl.sync.MusicOfflineSyncServiceHelper;
import com.vk.newsfeed.common.presentation.model.items.MyTargetInternalNativeAdBlsUiDto;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.search.discover.query.SearchQueryValueHelper;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.naq0;
import xsna.nj8;
import xsna.tlo0;
import xsna.ubg;
import xsna.xjs;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ij8 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ij8(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (r7 != r10) goto L10;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Type inference failed for: r0v65, types: [io.reactivex.rxjava3.disposables.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v68, types: [io.reactivex.rxjava3.disposables.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v23, types: [T, com.vk.feed.design.view.newsfeed.avatar_stack.AvatarAnimatedStack, java.lang.Object] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i;
        int i2;
        AttachSticker attachSticker;
        ChatFragment.j jVar;
        int i3 = this.b;
        int i4 = 8;
        int i5 = 4;
        int i6 = 6;
        Object obj2 = null;
        boolean z = false;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i3) {
            case 0:
                ((jj8) obj4).m.invoke(((nj8.e) obj3).c);
                return s3q0.a;
            case 1:
                ClipsEntryPointsFragment clipsEntryPointsFragment = (ClipsEntryPointsFragment) obj4;
                ClipsEntryPointsFragment.b bVar = (ClipsEntryPointsFragment.b) obj3;
                Flow flow = bVar.d;
                ConstraintLayout constraintLayout = bVar.a;
                VkText vkText = bVar.l;
                VkText vkText2 = bVar.i;
                VkText vkText3 = bVar.j;
                VkText vkText4 = bVar.k;
                View view = bVar.e;
                ViewPager2 viewPager2 = bVar.c;
                ClipsEntryPointsViewState.b bVar2 = (ClipsEntryPointsViewState.b) obj;
                int i7 = ClipsEntryPointsFragment.i0;
                int i8 = ClipsEntryPointsFragment.c.$EnumSwitchMapping$1[bVar2.a.ordinal()];
                if (i8 == 1) {
                    ClipsEntryPointsFragment.go(bVar);
                    bVar.h.setSelected(true);
                    viewPager2.e(0, true);
                } else if (i8 == 2) {
                    ClipsEntryPointsFragment.go(bVar);
                    vkText2.setSelected(true);
                    viewPager2.e(1, true);
                    xn50.a.c(clipsEntryPointsFragment, a.h.b);
                } else if (i8 == 3) {
                    ClipsEntryPointsFragment.go(bVar);
                    vkText3.setSelected(true);
                    viewPager2.e(2, true);
                } else {
                    if (i8 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ClipsEntryPointsFragment.go(bVar);
                    vkText4.setSelected(true);
                    viewPager2.e(3, true);
                }
                List<MediaStoreEntry> list = bVar2.e;
                boolean z2 = bVar2.b;
                boolean z3 = bVar2.c;
                int i9 = bVar2.d;
                p3t io2 = clipsEntryPointsFragment.io();
                if (list.isEmpty()) {
                    Fade fade = new Fade();
                    fade.setDuration(200L);
                    fade.addTarget(view);
                    TransitionManager.beginDelayedTransition(constraintLayout, fade);
                    flow.setVisibility(z2 || z3 ? 0 : 8);
                    view.setVisibility(8);
                    VkText vkText5 = clipsEntryPointsFragment.f0;
                    if (vkText5 != null) {
                        vkText5.setVisibility(8);
                    }
                    vkText.setVisibility(clipsEntryPointsFragment.h0);
                    if (z2) {
                        vkText3.setVisibility(0);
                    } else {
                        vkText3.setVisibility(8);
                    }
                    int i10 = 1;
                    bwt0.p0(vkText4, true);
                    if (!vkText4.isSelected()) {
                        com.vk.clips.entrypoints.ui.d dVar = (com.vk.clips.entrypoints.ui.d) clipsEntryPointsFragment.Y.getValue();
                        lpj ko = clipsEntryPointsFragment.ko();
                        q7v0 q7v0Var = dVar.a;
                        if (!dVar.c) {
                            dVar.c = true;
                            q7v0Var.init();
                            q7v0Var.c(new aq3(dVar, vkText4, ko, i10));
                        }
                    }
                    if (i9 > 0) {
                        vkText.setText(String.valueOf(i9));
                        i = 0;
                        vkText.setVisibility(0);
                        i2 = 8;
                    } else {
                        i = 0;
                        i2 = 8;
                        vkText.setVisibility(8);
                    }
                    clipsEntryPointsFragment.h0 = vkText.getVisibility();
                    if (z3) {
                        vkText2.setVisibility(i);
                    } else {
                        vkText2.setVisibility(i2);
                    }
                    if (io2 != null) {
                        io2.V8(i);
                    }
                    if (io2 != null) {
                        io2.E7();
                    }
                } else {
                    Slide slide = new Slide(80);
                    slide.setDuration(200L);
                    slide.addTarget(view);
                    TransitionManager.beginDelayedTransition(constraintLayout, slide);
                    flow.setVisibility(8);
                    view.setVisibility(0);
                    VkText vkText6 = clipsEntryPointsFragment.f0;
                    if (vkText6 != null) {
                        vkText6.setVisibility(0);
                    }
                    clipsEntryPointsFragment.h0 = vkText.getVisibility();
                    vkText.setVisibility(8);
                    if (io2 != null) {
                        io2.V8(view.getHeight());
                    }
                }
                ((n4a0) bVar.f.getAdapter()).submitList(j5g.O0(list));
                return s3q0.a;
            case 2:
                vve.e(((com.vk.clips.playlists.di.a) obj4).c, pve.a, false, ((Boolean) ((nm0) obj3).invoke()).booleanValue(), 2);
                return s3q0.a;
            case 3:
                z7f z7fVar = (z7f) obj;
                k8f k8fVar = ((o6f) obj4).d;
                List list2 = (List) obj3;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((n7f) it.next()).a));
                }
                return k8fVar.a(z7fVar, j5g.S0(arrayList));
            case 4:
                ubg.a aVar = (ubg.a) obj3;
                xbg xbgVar = ((ubg) obj4).r;
                if (xbgVar != null) {
                    aVar.b(xbgVar.b);
                }
                return s3q0.a;
            case 5:
                tmh tmhVar = (tmh) obj4;
                RecyclerView recyclerView = (RecyclerView) obj3;
                io.reactivex.rxjava3.disposables.c cVar = tmhVar.h;
                if (cVar != null) {
                    cVar.dispose();
                }
                ucp ucpVar = ucp.a;
                tmhVar.h = ucp.a().subscribe(new c60(new mmf(recyclerView, i4), 14));
                return s3q0.a;
            case 6:
                swj swjVar = (swj) obj4;
                String str = (String) obj3;
                swjVar.c.remove(str);
                swjVar.d.remove(str);
                return s3q0.a;
            case 7:
                ((p8k) obj4).Y((c9k) obj3, (cak) obj);
                return s3q0.a;
            case 8:
                mem memVar = (mem) obj4;
                List list3 = (List) obj3;
                if (((Boolean) obj).booleanValue()) {
                    edw edwVar = edw.a;
                    edw.g(R.string.vkim_already_downloaded, memVar.i);
                }
                a1w a1wVar = memVar.j;
                String str2 = memVar.m;
                Peer peer = memVar.r.c;
                List list4 = list3;
                ArrayList arrayList2 = new ArrayList(c5g.u(list4, 10));
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Integer.valueOf(((Msg) it2.next()).b));
                }
                return a1wVar.C(str2, new mi30(peer, arrayList2)).q(asu0.a.c());
            case 9:
                elm0 elm0Var = (elm0) obj4;
                b2n b2nVar = (b2n) obj3;
                if (elm0Var != null) {
                    elm0Var.h();
                    bwt0.p0(b2nVar.f, true);
                    bwt0.p0(b2nVar.g, false);
                    bwt0.p0(b2nVar.h, false);
                }
                return s3q0.a;
            case 10:
                com.vk.notifications.dnd.impl.a aVar2 = (com.vk.notifications.dnd.impl.a) obj3;
                ((io.reactivex.rxjava3.core.r) obj4).onNext(Integer.valueOf((int) ((Long) obj).longValue()));
                if (!aVar2.c.h()) {
                    aVar2.c.dispose();
                }
                return s3q0.a;
            case 11:
                g1h0 g1h0Var = (g1h0) obj;
                ((com.vk.attachpicker.screen.h) obj4).p(g1h0Var.b, (r4p) obj3, g1h0Var.a, g1h0Var.c);
                return s3q0.a;
            case 12:
                ocp ocpVar = (ocp) obj4;
                Collection<Email> collection = (Collection) obj3;
                SQLiteStatement g = ((e0w) obj).g("REPLACE INTO emails(id, email) VALUES (?,?)");
                try {
                    for (Email email : collection) {
                        g.bindLong(1, email.b);
                        g.bindString(2, email.c);
                        g.executeInsert();
                    }
                    s3q0 s3q0Var = s3q0.a;
                    g.close();
                    ocpVar.b.I0().v().s(collection);
                    return s3q0.a;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                    }
                }
            case 13:
                return ((dtp) obj4).a.g(String.valueOf(((UserId) obj3).b), (List) obj);
            case 14:
                ?? avatarAnimatedStack = new AvatarAnimatedStack((Context) obj, null, 6);
                tlo0.Companion.getClass();
                avatarAnimatedStack.setText(new tlo0.h("Нравится Ивану и ещё 5 людям плюс очень длинный текст, чтобы не помещался в одну строку"));
                avatarAnimatedStack.a("https://vk.ru/reaction/3-reactions-0?c_uniq_tag=c0390bed2f5fe4bef86e18a800618094e818e47ec5210c33d15d298e27829c5e", (List) obj4);
                ((Ref$ObjectRef) obj3).element = avatarAnimatedStack;
                return avatarAnimatedStack;
            case 15:
                tho0 tho0Var = (tho0) obj;
                ((wh50) obj3).setValue(tho0Var);
                ((wh50) obj4).setValue(rfr.d(tho0Var.a.c));
                return s3q0.a;
            case 16:
                ((xjs.a) obj4).n.invoke((RequestUserProfile) obj3);
                return s3q0.a;
            case 17:
                gru gruVar = (gru) obj4;
                Collection collection2 = (Collection) obj3;
                gruVar.getClass();
                tgl0 tgl0Var = gruVar.b;
                SQLiteStatement g2 = ((e0w) obj).g("\n                REPLACE INTO groups(\n                    id, title, domain, avatar, type, is_verified,\n                    can_send_msg_to_me, can_send_notify_to_me,\n                    online_status, answer_minutes,\n                    sync_time, members_count, activity, avatar_is_nft, \n                    member_status, \n                    admin_level,\n                    description,\n                    can_message,\n                    is_closed,\n                    url,\n                    deactivated, deactivated_message, deactivated_type, is_premium_business, is_confirmed_business,\n                    can_post_donut, age_limits, warning_notification, is_non_profit_organization, need_show_onboarding, \n                    is_monetization_available)\n                VALUES (\n                    ?,?,?,?,?,?,\n                    ?,?,\n                    ?,?,\n                    ?,?,?,?,\n                    ?,\n                    ?,\n                    ?,\n                    ?,\n                    ?,\n                    ?,\n                    ?,?,?,?,?,\n                    ?,?,?,?,?,\n                    ?\n                )\n                ");
                try {
                    Iterator it3 = collection2.iterator();
                    while (it3.hasNext()) {
                        gru.j(g2, (Group) it3.next());
                        g2.executeInsert();
                    }
                    s3q0 s3q0Var2 = s3q0.a;
                    g2.close();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj5 : collection2) {
                        if (tgl0Var.I0().b().e().c(((Group) obj5).G3()) != null) {
                            arrayList3.add(obj5);
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        tgl0Var.I0().v().p(arrayList3);
                    }
                    return s3q0.a;
                } finally {
                }
            case 18:
                nbv nbvVar = (nbv) obj4;
                naq0 naq0Var = (naq0) obj3;
                ((ikv0) obj).a();
                nbvVar.d = null;
                if (naq0Var instanceof naq0.b) {
                    VideoFile videoFile = ((naq0.b) naq0Var).d;
                    c63 c63Var = c63.a;
                    Activity b = c63.b();
                    FragmentActivity fragmentActivity = b instanceof FragmentActivity ? (FragmentActivity) b : null;
                    if (fragmentActivity != null) {
                        fxc0.B().Y().k(fragmentActivity, videoFile, (r43 & 4) != 0 ? null : null, (r43 & 8) != 0 ? null : null, (r43 & 16) != 0 ? null : null, (r43 & 32) != 0 ? null : null, (r43 & 64) != 0 ? false : false, (r43 & 128) != 0 ? null : null, (r43 & 256) != 0 ? null : null, (r43 & 512) != 0 ? null : null, true, (r43 & 2048) != 0 ? false : false, (r43 & 4096) == 0, (r43 & 8192) == 0, (r43 & 16384) != 0 ? -1L : 0L, (32768 & r43) != 0 ? null : null, (65536 & r43) != 0 ? null : null, (524288 & r43) != 0 ? false : false, (r43 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : null);
                    }
                } else {
                    if (!(naq0Var instanceof naq0.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    UserId userId = ((naq0.a) naq0Var).c;
                    c63 c63Var2 = c63.a;
                    Activity b2 = c63.b();
                    FragmentActivity fragmentActivity2 = b2 instanceof FragmentActivity ? (FragmentActivity) b2 : null;
                    if (fragmentActivity2 != null) {
                        ClipsRouter.b((ClipsRouter) nbvVar.h.getValue(), fragmentActivity2, new ClipFeedTab.Profile(null, userId), null, null, null, null, false, 252);
                    }
                }
                return s3q0.a;
            case 19:
                return ((izs) obj4).invoke((f0w) obj3);
            case 20:
                com.vk.im.ui.components.msg_list.a aVar3 = (com.vk.im.ui.components.msg_list.a) obj4;
                Msg msg = (Msg) obj3;
                Pair pair = (Pair) obj;
                boolean booleanValue = ((Boolean) pair.i()).booleanValue();
                boolean zb = ((PopupStickersChatSettingsModel) pair.j()).zb();
                if (booleanValue && zb) {
                    MsgFromUser msgFromUser = msg instanceof MsgFromUser ? (MsgFromUser) msg : null;
                    if (msgFromUser != null && (attachSticker = (AttachSticker) a.C1125a.a(msgFromUser, AttachSticker.class)) != null) {
                        boolean z9 = attachSticker.g.z9();
                        PopupStickerAnimation popupStickerAnimation = attachSticker.g.k;
                        if (popupStickerAnimation != null && popupStickerAnimation.b) {
                            z = true;
                        }
                        if (z9 && z && (jVar = aVar3.s) != null) {
                            jVar.c(attachSticker);
                        }
                    }
                }
                return s3q0.a;
            case 21:
                List list5 = (List) obj4;
                int intValue = ((Integer) obj).intValue() * 100;
                List subList = list5.subList(intValue, Math.min(intValue + 100, list5.size()));
                tfx tfxVar = new tfx("audio.getMigrationAlbumIds", new rr(5), new io.reactivex.rxjava3.subjects.b(i6));
                tfxVar.i("album_ids", subList);
                return rsg0.a0(yfb.x(tfxVar)).F(new ca10(new qey((MusicOfflineSyncServiceHelper) obj3, 11), i5));
            case 22:
                tho0 tho0Var2 = (tho0) obj;
                ((wh50) obj3).setValue(tho0Var2);
                ((izs) obj4).invoke(tho0Var2.a.c);
                return s3q0.a;
            case 23:
                ((fr50) obj4).D.sa(new NewsfeedExternalAction.Navigation.n(((MyTargetInternalNativeAdBlsUiDto) obj3).i));
                return s3q0.a;
            case 24:
                ((com.vk.attachpicker.stat.data.b) obj4).h((hyg0) obj3, (x500) obj);
                return s3q0.a;
            case 25:
                View inflate = ((LayoutInflater) obj3).inflate(R.layout.vk_error_screen, (ViewGroup) obj, false);
                inflate.findViewById(R.id.error_retry).setOnClickListener(new i1f((tfb0) obj4, 7));
                return inflate;
            case 26:
                ((m2f0) obj4).l.invoke(((d1f0) obj3).b);
                return s3q0.a;
            case 27:
                StickerPackRecommendationBlock stickerPackRecommendationBlock = (StickerPackRecommendationBlock) obj;
                ((rdf0) obj4).a.put((String) obj3, new cbf0(stickerPackRecommendationBlock.c, stickerPackRecommendationBlock.d, stickerPackRecommendationBlock.e));
                return s3q0.a;
            case 28:
                n160 n160Var = (n160) obj4;
                zhh0 zhh0Var = (zhh0) obj3;
                d.b bVar3 = (d.b) obj;
                float f = bVar3.b ? -1.0f : 1.0f;
                long j = bVar3.a;
                n160Var.a(1, ov70.g(f, zhh0Var.d == Orientation.Horizontal ? ov70.a(1, j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : ov70.a(2, j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)));
                return s3q0.a;
            default:
                VkSearchView vkSearchView = (VkSearchView) obj3;
                SearchQueryValueHelper.a aVar4 = (SearchQueryValueHelper.a) obj;
                if (!((Ref$BooleanRef) obj4).element) {
                    Reference<Object> reference = aVar4.c;
                    if (reference != null) {
                        obj2 = reference.get();
                        break;
                    }
                }
                z = true;
                return Boolean.valueOf(z);
        }
    }
}
