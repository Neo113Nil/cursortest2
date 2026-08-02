package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.market.dto.MarketSettingsDto;
import com.vk.clips.viewer.impl.grid.toolbar.profile.swap.modal.picking.PickerItem;
import com.vk.clips.viewer.impl.grid.toolbar.profile.swap.modal.picking.b;
import com.vk.clips.viewer.impl.grid.toolbar.profile.swap.models.CounterType;
import com.vk.common.links.LaunchContext;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.image.VkEnhancedImageView;
import com.vk.core.view.links.LinkedTextView;
import com.vk.dto.common.ClipStatStoryData;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.dto.shortvideo.ClipsAuthor;
import com.vk.ecomm.market.album.MarketEditAlbumCoverFragment;
import com.vk.im.ui.components.msg_view.header.MsgViewHeaderComponent;
import com.vk.log.L;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.permission.PermissionHelper;
import com.vk.photo.editor.features.filter.FilterUiModel;
import com.vk.photo.editor.ivm.filter.FilterMessage;
import com.vk.profilelist.api.ProfileListData;
import com.vk.profilelist.api.ProfileListTab;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsAnalyticsItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsPromoItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsGridItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.voip.VoipService;
import com.vk.voip.ui.VoipViewModelState;
import com.vk.voip.ui.service.BaseVoipService;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.aye;
import xsna.dme;
import xsna.dw20;
import xsna.fxe;
import xsna.grd;
import xsna.h7u0;
import xsna.o0r0;
import xsna.oxj;
import xsna.y2p0;

/* compiled from: CallContactPermissionHandler.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class u19 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u19(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z;
        int i = 1;
        switch (this.b) {
            case 0:
                L.i((Throwable) obj);
                return s3q0.a;
            case 1:
                aye ayeVar = (aye) obj;
                ebd ebdVar = (ebd) this.receiver;
                qcy<Object>[] qcyVarArr = ebd.I;
                Context context = ebdVar.h;
                fxe fxeVar = ebdVar.z;
                Context context2 = ebdVar.h;
                y2p0 y2p0Var = ebdVar.A;
                View view = ebdVar.b;
                fee feeVar = ebdVar.a;
                if (ayeVar instanceof aye.a) {
                    ClipGridParams.Data.Profile profile = ((aye.a) ayeVar).a;
                    ClipsAuthor clipsAuthor = profile.b;
                    if (ebdVar.o(clipsAuthor)) {
                        g620.f().e().x(clipsAuthor.b.b);
                    }
                    y2p0Var.b(profile);
                    feeVar.i2(profile);
                    ebdVar.B.invoke(profile);
                    ebdVar.r(clipsAuthor.e);
                } else if (ayeVar instanceof aye.b) {
                    y2p0Var.getClass();
                    y2p0Var.a(Collections.singleton(y2p0.a.c.a));
                    feeVar.Y1();
                } else if (ayeVar instanceof aye.g) {
                    ClipsAuthor clipsAuthor2 = ((aye.g) ayeVar).a;
                    jce jceVar = ebdVar.r;
                    if (jceVar != null) {
                        jceVar.c();
                    }
                    o0r0 e = xwk.e();
                    Owner owner = clipsAuthor2.b;
                    e.m(context, owner.b, new o0r0.a(false, "clips", null, null, null, owner.c, owner.e, owner.i(1024), clipsAuthor2.b.q, false, false, null, null, null, 65053));
                } else {
                    int i2 = 6;
                    if (ayeVar instanceof aye.c) {
                        yxe yxeVar = ((aye.c) ayeVar).a;
                        if (yxeVar.equals(d370.g)) {
                            ebdVar.p.a(context);
                        } else if (yxeVar.equals(n34.b)) {
                            while (true) {
                                z = context instanceof AppCompatActivity;
                                if (!z && (context instanceof ContextWrapper)) {
                                    context = ((ContextWrapper) context).getBaseContext();
                                }
                            }
                            AppCompatActivity appCompatActivity = (AppCompatActivity) (z ? (Activity) context : null);
                            if (appCompatActivity != null) {
                                appCompatActivity.getSupportFragmentManager().l0("picker_bs_result_req_key", appCompatActivity, new m40(ebdVar, i2));
                            }
                            b.a aVar = new b.a(view.getContext());
                            List D0 = j5g.D0(new h8p0(i), ebdVar.C.values());
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : D0) {
                                if (fkq0.b(((ClipGridParams.Data.Profile) obj2).b.b.b)) {
                                    arrayList.add(obj2);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((ClipGridParams.Data.Profile) it.next()).b);
                            }
                            ArrayList arrayList3 = aVar.e;
                            arrayList3.clear();
                            ArrayList arrayList4 = new ArrayList(c5g.u(arrayList2, 10));
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                ClipsAuthor clipsAuthor3 = (ClipsAuthor) it2.next();
                                String f = clipsAuthor3.b.f(200);
                                if (f == null) {
                                    f = "";
                                }
                                Owner owner2 = clipsAuthor3.b;
                                String str = owner2.c;
                                if (str == null) {
                                    str = "";
                                }
                                arrayList4.add(new PickerItem.User(f, str, false, owner2.b));
                            }
                            arrayList3.addAll(arrayList4);
                            List<UserId> n = ebdVar.n();
                            Iterator it3 = arrayList3.iterator();
                            int i3 = 0;
                            while (it3.hasNext()) {
                                Object next = it3.next();
                                int i4 = i3 + 1;
                                if (i3 < 0) {
                                    e43.t();
                                    throw null;
                                }
                                PickerItem pickerItem = (PickerItem) next;
                                if (pickerItem instanceof PickerItem.User) {
                                    PickerItem.User user = (PickerItem.User) pickerItem;
                                    if (n.contains(user.e)) {
                                        arrayList3.set(i3, PickerItem.User.a(user, true));
                                    }
                                }
                                i3 = i4;
                            }
                            PickerItem.Add add = PickerItem.Add.b;
                            if (!arrayList3.contains(add)) {
                                arrayList3.add(0, add);
                            }
                            aVar.a0(new l1(ebdVar, 23)).I0(null);
                        } else if (yxeVar.equals(f9t.c)) {
                            feeVar.q2();
                            xwk.e().p(context2);
                        } else if (yxeVar instanceof vxe) {
                            UserId userId = ((vxe) yxeVar).b;
                            SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.USER, null, null, null, null, null, 62, null), new MobileOfficialAppsClipsStat$TypeClipsGridItem(MobileOfficialAppsClipsStat$TypeClipsGridItem.EventType.CLICK_TO_VIEW_ANALYTICS, fkq0.d(userId) ? MobileOfficialAppsClipsStat$TypeClipsGridItem.ScreenType.GRID_USER : MobileOfficialAppsClipsStat$TypeClipsGridItem.ScreenType.GRID_COMMUNITY, null, null, new MobileOfficialAppsClipsStat$ClipsAnalyticsItem(MobileOfficialAppsClipsStat$ClipsAnalyticsItem.ObjectType.GRID, MobileOfficialAppsClipsStat$ClipsAnalyticsItem.EventSubtype.AUTHOR_ANALYTICS), 12, null), 2);
                            UiTracker uiTracker = UiTracker.a;
                            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                            uzp0 uzp0Var = UiTracker.h;
                            uzp0Var.getClass();
                            new bjc(c, b, uzp0Var.a).q();
                            g620.f().h().getClass();
                            if (fkq0.d(userId)) {
                                ((syk0) ebdVar.H.getValue()).b(userId, null);
                            } else {
                                jie.a(g620.f().m(), context2, userId, null, 12);
                            }
                        } else if (yxeVar instanceof wxe) {
                            if (!g620.f().k0().a(view.getContext())) {
                                g620.f().g(ebdVar.h, feeVar.getRef(), wrp.b(feeVar.b()), ((wxe) yxeVar).b.b);
                            }
                        } else if (yxeVar instanceof xxe) {
                            if (!g620.f().k0().a(view.getContext())) {
                                ebdVar.E.d(((xxe) yxeVar).b, null);
                            }
                        } else if (yxeVar instanceof txe) {
                            g620.f().k0().a(context);
                        } else {
                            if (!(yxeVar instanceof uxe)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            UserId userId2 = ((uxe) yxeVar).b;
                            SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.USER, null, null, null, null, null, 62, null), new MobileOfficialAppsClipsStat$TypeClipsGridItem(MobileOfficialAppsClipsStat$TypeClipsGridItem.EventType.CLICK_TO_PROMO, fkq0.d(userId2) ? MobileOfficialAppsClipsStat$TypeClipsGridItem.ScreenType.GRID_USER : MobileOfficialAppsClipsStat$TypeClipsGridItem.ScreenType.GRID_COMMUNITY, null, new MobileOfficialAppsClipsStat$ClipsPromoItem(MobileOfficialAppsClipsStat$ClipsPromoItem.ObjectType.GRID, MobileOfficialAppsClipsStat$ClipsPromoItem.EventSubtype.VIEW), null, 20, null), 2);
                            UiTracker uiTracker2 = UiTracker.a;
                            MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
                            uzp0 uzp0Var2 = UiTracker.h;
                            uzp0Var2.getClass();
                            new bjc(c2, b2, uzp0Var2.a).q();
                            maz.c(xwk.d().e(), ebdVar.h, ebd.J + userId2, LaunchContext.A, null, null, 24);
                        }
                    } else if (ayeVar instanceof aye.d) {
                        oxj oxjVar = ebdVar.F;
                        aye.d dVar = (aye.d) ayeVar;
                        ClipsAuthor clipsAuthor4 = dVar.a;
                        CounterType counterType = dVar.b;
                        fee feeVar2 = oxjVar.a;
                        Context context3 = oxjVar.b;
                        Owner owner3 = clipsAuthor4.b;
                        int i5 = oxj.a.$EnumSwitchMapping$0[counterType.ordinal()];
                        if (i5 != 1) {
                            if (i5 != 2) {
                                if (i5 != 3) {
                                    if (i5 != 4) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    if (!j8.d(context3)) {
                                        xwk.e().d(context3, new ProfileListData(owner3.b, context3.getString(R.string.clips_profile_followers_title), fkq0.d(owner3.b) ? e43.l(ProfileListTab.FOLLOWERS, ProfileListTab.FRIENDS) : Collections.singletonList(ProfileListTab.GROUP_MEMBERS)));
                                    }
                                } else if (!j8.d(context3) && fkq0.d(owner3.b)) {
                                    xwk.e().d(context3, new ProfileListData(owner3.b, context3.getString(R.string.clips_profile_subscriptions_title), Collections.singletonList(ProfileListTab.SUBSCRIPTIONS)));
                                }
                            } else if (feeVar2.F0() && clipsAuthor4.i() > 0) {
                                ClipStatStoryData.Type type = ClipStatStoryData.Type.Views;
                                g620.f().h().getClass();
                                oxjVar.a(clipsAuthor4, type, true);
                            }
                        } else if (feeVar2.F0() && clipsAuthor4.f() > 0) {
                            ClipStatStoryData.Type type2 = ClipStatStoryData.Type.Likes;
                            g620.f().h().getClass();
                            oxjVar.a(clipsAuthor4, type2, true);
                        }
                    } else if (ayeVar instanceof aye.e) {
                        sdz a = xwk.d().a();
                        aye.e eVar = (aye.e) ayeVar;
                        String str2 = eVar.a;
                        if (a.g(str2)) {
                            maz.c(xwk.d().e(), ebdVar.h, eVar.a, LaunchContext.A, null, null, 24);
                        } else if (xwk.d().a().e(str2)) {
                            maz.c(xwk.d().e(), ebdVar.h, "tel:".concat(str2), LaunchContext.A, null, null, 24);
                        } else if (xwk.d().a().n(str2)) {
                            maz.c(xwk.d().e(), ebdVar.h, "mailto:".concat(str2), LaunchContext.A, null, null, 24);
                        }
                    } else if (ayeVar instanceof aye.f) {
                        aye.f fVar = (aye.f) ayeVar;
                        boolean z2 = fVar.c;
                        ClipsAuthor clipsAuthor5 = fVar.a;
                        if (z2) {
                            String str3 = clipsAuthor5.i;
                            ebdVar.y = new dme.a(view.getContext(), clipsAuthor5, new fxe.a(str3 != null ? str3 : "", new g22(7, clipsAuthor5, ebdVar), new jd(ebdVar, 21), new g3b(ebdVar, 2))).I0(null);
                        } else {
                            String str4 = clipsAuthor5.i;
                            if (str4 == null) {
                                str4 = fVar.b;
                            }
                            CharSequence a2 = fxe.a(fxeVar, str4, false);
                            Context context4 = view.getContext();
                            dhr0 dhr0Var = dhr0.a;
                            boolean c3 = dhr0Var.c(view.getContext());
                            fxeVar.getClass();
                            LinkedTextView linkedTextView = new LinkedTextView(new lpj(context4, c3 ? dhr0.u().c : dhr0.C().c), null, 6, 0);
                            linkedTextView.setText(a2, TextView.BufferType.SPANNABLE);
                            float f2 = 16;
                            float f3 = 18;
                            linkedTextView.setPadding(iah0.a(f2), iah0.a(f3), iah0.a(f2), iah0.a(f3));
                            linkedTextView.setTextColor(e3m.f(R.attr.vk_ui_text_primary, linkedTextView.getContext()));
                            linkedTextView.setTextSize(2, 15.0f);
                            grd.a aVar2 = new grd.a(view.getContext(), null);
                            aVar2.e = true;
                            dw20.b v0 = aVar2.v0(R.string.clip_grid_author_information_bottomsheet_title);
                            if (dhr0Var.c(view.getContext())) {
                                v0.u0(dhr0.u().c);
                            }
                            ebdVar.y = v0.v0(R.string.clip_grid_author_information_bottomsheet_title).D0(linkedTextView, false).m(R.attr.vk_ui_background_content).c(new ts90(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3)).a0(new com.vk.movika.sdk.base.ui.g(ebdVar, 25)).I0(null);
                        }
                    } else {
                        if (!(ayeVar instanceof aye.h)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        feeVar.g2(new ClipGridParams.Data.Profile(((aye.h) ayeVar).a));
                    }
                }
                return s3q0.a;
            case 2:
                FilterUiModel filterUiModel = (FilterUiModel) obj;
                com.vk.photo.editor.ivm.filter.i iVar = ((com.vk.photo.editor.features.filter.c) this.receiver).c;
                (iVar != null ? iVar : null).b(new FilterMessage.d(filterUiModel));
                return s3q0.a;
            case 3:
                zk70.e((Throwable) obj);
                return s3q0.a;
            case 4:
                MarketSettingsDto marketSettingsDto = (MarketSettingsDto) obj;
                MarketEditAlbumCoverFragment marketEditAlbumCoverFragment = (MarketEditAlbumCoverFragment) this.receiver;
                int i6 = MarketEditAlbumCoverFragment.d0;
                marketEditAlbumCoverFragment.getClass();
                if (marketSettingsDto.d() != null && marketSettingsDto.e() != null && marketSettingsDto.d().intValue() >= marketSettingsDto.e().intValue()) {
                    String string = marketEditAlbumCoverFragment.getString(R.string.market_album_limit_message, marketSettingsDto.e());
                    int i7 = h7u0.p;
                    h7u0.a c4 = h7u0.b.c(marketEditAlbumCoverFragment.requireContext());
                    c4.g0(R.string.market_album_limit_title);
                    c4.a.f = string;
                    c4.c0(R.string.market_album_limit_confirm, new wgd(marketEditAlbumCoverFragment, i));
                    c4.c = false;
                    c4.m();
                }
                return s3q0.a;
            case 5:
                Throwable th = (Throwable) obj;
                MsgViewHeaderComponent msgViewHeaderComponent = (MsgViewHeaderComponent) this.receiver;
                f9w f9wVar = MsgViewHeaderComponent.o;
                msgViewHeaderComponent.getClass();
                MsgViewHeaderComponent.o.a(th);
                zk70.e(th);
                return s3q0.a;
            case 6:
                return ((vpc0) this.receiver).c((PostingState) obj);
            case 7:
                return ((xsl0) this.receiver).m((as80) obj);
            case 8:
                L.i((Throwable) obj);
                return s3q0.a;
            case 9:
                ((VkEnhancedImageView) this.receiver).getClass();
                return s3q0.a;
            default:
                VoipService voipService = (VoipService) this.receiver;
                Object obj3 = VoipService.q;
                voipService.getClass();
                if ((obj instanceof fjw0) || (obj instanceof g3x0)) {
                    com.vk.voip.ui.c.b.getClass();
                    if (com.vk.voip.ui.c.v0() || com.vk.voip.ui.c.K0 == VoipViewModelState.Idle) {
                        voipService.stopSelf();
                    } else {
                        voipService.h();
                    }
                } else if (obj instanceof h3x0) {
                    com.vk.voip.ui.c.b.getClass();
                    if (com.vk.voip.ui.c.v && !BaseVoipService.k) {
                        PermissionHelper permissionHelper = PermissionHelper.a;
                        String[] strArr = PermissionHelper.m;
                        permissionHelper.getClass();
                        if (PermissionHelper.b(voipService, strArr)) {
                            BaseVoipService.k = true;
                            voipService.a();
                        }
                    }
                }
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u19(Object obj, int i) {
        super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        this.b = i;
        switch (i) {
            case 2:
                super(1, obj, com.vk.photo.editor.features.filter.c.class, "handleUserRetryFilterLoading", "handleUserRetryFilterLoading(Lcom/vk/photo/editor/features/filter/FilterUiModel;)V", 0);
                break;
            case 3:
                super(1, obj, zk70.class, "show", "show(Ljava/lang/Throwable;)V", 0);
                break;
            case 4:
            default:
                break;
            case 5:
                super(1, obj, MsgViewHeaderComponent.class, "onCmdError", "onCmdError(Ljava/lang/Throwable;)V", 0);
                break;
            case 6:
                super(1, obj, vpc0.class, "mapConfirmButtonViewState", "mapConfirmButtonViewState(Lcom/vk/newsfeed/posting/impl/domain/model/PostingState;)Lcom/vk/newsfeed/posting/impl/presentation/model/PostingCreatePostButtonViewState;", 0);
                break;
            case 7:
                super(1, obj, xsl0.class, "loadStoriesContainer", "loadStoriesContainer(Lcom/vk/story/api/domain/interactor/common/OpenStoriesRequest;)Lio/reactivex/rxjava3/disposables/Disposable;", 0);
                break;
            case 8:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
        }
    }
}
