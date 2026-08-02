package xsna;

import android.text.Editable;
import android.view.ActionMode;
import android.view.ViewGroup;
import androidx.appcompat.widget.SwitchCompat;
import com.unity3d.ads.core.data.datasource.CachedFIdDataSource;
import com.vk.api.generated.messages.dto.MessagesConversationWithMessageDto;
import com.vk.api.generated.messages.dto.MessagesGetConversationMembersFilterDto;
import com.vk.api.generated.messages.dto.MessagesGetConversationsResponseDto;
import com.vk.balance.BalanceFragment;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionExpandBlock;
import com.vk.catalog2.common.ui.mvp.holder.group.topbar.CommunitiesSearchTopBarVh;
import com.vk.catalog2.common.ui.mvp.holder.group.topbar.a;
import com.vk.channelrestrictions.RestrictionBadge;
import com.vk.clips.favorites.impl.ui.folders.content.a;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.clips.model.ClipsEditorInputData;
import com.vk.dto.common.VideoFile;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.NotificationVariants;
import com.vk.ecomm.onlinebooking.impl.edit.a;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.TopBarSubscriptionManageType;
import com.vk.feed.blacklist.impl.presentation.blacklist.g;
import com.vk.im.channelcreation.impl.g;
import com.vk.im.ui.components.attaches_history.attaches.model.audio.c;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.libvideo.bottomsheet.about.delegate.x;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.b4;
import xsna.ca9;
import xsna.es7;
import xsna.ise;
import xsna.j0j;
import xsna.mg10;
import xsna.t5e;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class r9 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r9(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v104, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        noj0 noj0Var;
        VideoFile videoFile;
        boolean z;
        s3q0 _init_$lambda$1;
        RestrictionBadge restrictionBadge;
        switch (this.b) {
            case 0:
                x.b bVar = (x.b) this.c;
                AboutVideoItem.SimilarVideoRedesign similarVideoRedesign = bVar.z;
                if (similarVideoRedesign == null || (noj0Var = similarVideoRedesign.b) == null || (videoFile = noj0Var.a) == null) {
                    return s3q0.a;
                }
                bVar.l.d(new b4.e0(videoFile));
                return s3q0.a;
            case 1:
                UIBlockActionExpandBlock uIBlockActionExpandBlock = (UIBlockActionExpandBlock) this.c;
                ArrayList<UIBlock> arrayList = ((UIBlockList) obj).y;
                if (arrayList == null || !arrayList.isEmpty()) {
                    Iterator<T> it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (epx.f(((UIBlock) it.next()).b, uIBlockActionExpandBlock.A)) {
                            z = true;
                            return Boolean.valueOf(z);
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 2:
                ActionMode actionMode = ((uc2) this.c).h;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return s3q0.a;
            case 3:
                com.vk.im.ui.components.attaches_history.attaches.model.audio.b bVar2 = (com.vk.im.ui.components.attaches_history.attaches.model.audio.b) this.c;
                yj40 yj40Var = (yj40) obj;
                bn40.e(yj40Var);
                if (yj40Var instanceof fa50) {
                    fa50 fa50Var = (fa50) yj40Var;
                    bVar2.a.onNext(new c.a(fa50Var.b.b, fa50Var.a));
                } else if (yj40Var instanceof yd50) {
                    yd50 yd50Var = (yd50) yj40Var;
                    bVar2.a.onNext(new c.a(yd50Var.c.b, yd50Var.a));
                }
                return s3q0.a;
            case 4:
                d06 d06Var = (d06) this.c;
                h03.b((Throwable) obj);
                BalanceFragment balanceFragment = d06Var.b;
                SwitchCompat switchCompat = balanceFragment.a0;
                if (switchCompat == null) {
                    switchCompat = null;
                }
                balanceFragment.ko(!switchCompat.isChecked());
                d06Var.b();
                return s3q0.a;
            case 5:
                wx6 wx6Var = (wx6) this.c;
                List A = rli0.A(rli0.j(new i5g(((MessagesGetConversationsResponseDto) obj).f()), new md(7)));
                if (A.isEmpty()) {
                    return io.reactivex.rxjava3.core.q.T(EmptyList.b);
                }
                List<MessagesConversationWithMessageDto> list = A;
                ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
                for (MessagesConversationWithMessageDto messagesConversationWithMessageDto : list) {
                    arrayList2.add(rsg0.l0(yfb.x(sg20.h(new vg20(), messagesConversationWithMessageDto.d().g().d(), null, MessagesGetConversationMembersFilterDto.FRIENDS, null, null, null, null, null, 4070)), null, 3).U(new vx6(new pd(wx6Var, messagesConversationWithMessageDto), 0)));
                }
                return new io.reactivex.rxjava3.internal.operators.observable.e3(null, arrayList2, new q9(new zj(4), 3), io.reactivex.rxjava3.core.g.b);
            case 6:
                tj50.a aVar = (tj50.a) obj;
                pe1 pe1Var = new pe1((com.vk.feed.blacklist.impl.presentation.blacklist.e) this.c);
                ao8 ao8Var = ao8.d;
                return new g.a(aVar.a(pe1Var, ao8Var), aVar.a(new ve0(4), ao8Var));
            case 7:
                return new vk7((ViewGroup) obj, (BonusCatalogFragment) this.c);
            case 8:
                ((izs) ((zak0) ((vo7) this.c).b).getValue()).invoke(new a.f.C0964a((String) obj));
                return s3q0.a;
            case 9:
                es7 es7Var = (es7) this.c;
                Object[] array = NotificationVariants.i().toArray(new NotificationVariants[0]);
                ((nvy) obj).e(array.length, null, new es7.c(array), new jai(-1781742563, new es7.d(array, es7Var), true));
                return s3q0.a;
            case 10:
                _init_$lambda$1 = CachedFIdDataSource._init_$lambda$1((CachedFIdDataSource) this.c, (Throwable) obj);
                return _init_$lambda$1;
            case 11:
                ((com.vk.movika.sdk.base.model.e) this.c).invoke();
                return s3q0.a;
            case 12:
                m99 m99Var = (m99) this.c;
                Set set = (Set) obj;
                ca9 ca9Var = m99Var.j().c;
                if (ca9Var instanceof ca9.c) {
                    m99Var.f(s99.a(m99Var.j(), null, null, ca9.c.a((ca9.c) ca9Var, null, set, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, false, null, false, null, -8193, ApiInvocationException.ErrorCodes.IDS_BLOCKED), null, null, null, null, false, 251));
                }
                return s3q0.a;
            case 13:
                com.vk.cameraui.impl.a aVar2 = (com.vk.cameraui.impl.a) this.c;
                mg10 mg10Var = (mg10) obj;
                if (mg10Var instanceof mg10.a) {
                    rg10 maskCallback = aVar2.b.getMaskCallback();
                    if (maskCallback != null) {
                        maskCallback.f(((mg10.a) mg10Var).a);
                    }
                } else {
                    if (!(mg10Var instanceof mg10.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    rg10 maskCallback2 = aVar2.b.getMaskCallback();
                    if (maskCallback2 != null) {
                        maskCallback2.h((mg10.b) mg10Var);
                    }
                }
                return s3q0.a;
            case 14:
                com.vk.im.channelcreation.impl.h hVar = (com.vk.im.channelcreation.impl.h) this.c;
                Editable editable = (Editable) obj;
                String obj2 = editable != null ? editable.toString() : null;
                if (obj2 == null) {
                    obj2 = "";
                }
                hVar.O(new g.e(obj2));
                return s3q0.a;
            case 15:
                orb orbVar = (orb) this.c;
                mrb mrbVar = orbVar.u;
                if (mrbVar != null && (restrictionBadge = mrbVar.f) != null) {
                    orbVar.a.a(restrictionBadge);
                }
                return s3q0.a;
            case 16:
                ((ftb) this.c).e.h0((Throwable) obj);
                return s3q0.a;
            case 17:
                ((a8c) this.c).getClass();
                a8c.f((tr90) obj);
                return s3q0.a;
            case 18:
                ((tdu) obj).b(((ise.a) ((ise) this.c)).a ? 1.0f : 0.64f);
                return s3q0.a;
            case 19:
                szd szdVar = (szd) this.c;
                return uzd.a((ClipsEditorInputData) obj, szdVar.g, szdVar.h.getProvider().a());
            case 20:
                ((w2e) this.c).l.invoke(a.h.b);
                return s3q0.a;
            case 21:
                ((h5e) this.c).b.d(t5e.o.a, null);
                return s3q0.a;
            case 22:
                pae paeVar = (pae) obj;
                ?? r1 = ((com.vk.clips.sdk.shared.item.clips_grid_block.presentation.b) this.c).h.getCallback().b;
                if (paeVar instanceof oae) {
                    ((vej0) r1.getValue()).getClass();
                    new iid0(UiTracker.c(), SchemeStat$TypeAction.a.b(null, null, new SchemeStat$TypeClipViewerItem(SchemeStat$TypeClipViewerItem.ScreenType.TOP, SchemeStat$TypeClipViewerItem.EventType.SHOW_SHOPS_GRID_BLOCK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741820, null), 3)).q();
                } else {
                    if (!(paeVar instanceof nae)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((vej0) r1.getValue()).getClass();
                    new und0(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET_ITEM, null, null, null, null, null, 62, null), new SchemeStat$TypeClipViewerItem(SchemeStat$TypeClipViewerItem.ScreenType.TOP, SchemeStat$TypeClipViewerItem.EventType.UPDATE_SHOPS_GRID_BLOCK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741820, null), 2)).q();
                }
                return s3q0.a;
            case 23:
                ((p3h) this.c).invoke();
                return s3q0.a;
            case 24:
                Photo photo = (Photo) this.c;
                Photo photo2 = ((PhotoAttachment) obj).l;
                return Boolean.valueOf(epx.f(photo2.e, photo.e) && photo2.c == photo.c);
            case 25:
                ((CommunitiesSearchTopBarVh) this.c).b.invoke(new a.f((String) obj));
                return s3q0.a;
            case 26:
                vzh vzhVar = (vzh) obj;
                ((com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.f) this.c).getClass();
                boolean z2 = vzhVar.G;
                return (z2 && vzhVar.I) ? TopBarSubscriptionManageType.WithTooltip : z2 ? TopBarSubscriptionManageType.WithoutTooltip : TopBarSubscriptionManageType.None;
            case 27:
                ((i1j) this.c).e.invoke(new j0j.i((String) obj));
                return s3q0.a;
            case 28:
                aaj aajVar = (aaj) this.c;
                u9j.a(new MobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction(MobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction.EventType.MODAL_SYNC_CONTACTS_DECLINE_IMPORT_CONTACTS, null));
                aajVar.invoke();
                return s3q0.a;
            default:
                return (lm50) ((gzs) this.c).invoke();
        }
    }

    public /* synthetic */ r9(t9j t9jVar, aaj aajVar) {
        this.b = 28;
        this.c = aajVar;
    }
}
