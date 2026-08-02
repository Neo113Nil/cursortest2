package xsna;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetOwnerVideosResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetUserSettingsResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoSettingDto;
import com.vk.clips.sdk.shared.item.static_ads.events.b;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.cart.impl.search_address.ui.fragment.SearchAddressFragment;
import com.vk.ecomm.onlinebooking.impl.edit.ui.BookingEditScreenFragment;
import com.vk.ecomm.reviews.api.model.communityreviews.CreateCommunityReviewArgs;
import com.vk.im.engine.models.messages.PinnedMsg;
import com.vk.log.L;
import com.vk.profile.community.impl.ui.profile.actions.d;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.search.communities.map.api.domain.LocationCoordinate;
import com.vk.search.communities.map.impl.ui.details.SearchCommunitiesOnMapDetailsFragment;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.EcosystemProfileView;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.a;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.g;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.utils.Logger;
import xsna.b26;
import xsna.eeu0;
import xsna.foh0;
import xsna.hxo;
import xsna.o0r0;
import xsna.xn50;

/* compiled from: BaseProfileInfoModel.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class gl6 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gl6(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v8, types: [android.app.Dialog, xsna.c83, xsna.kar0] */
    /* JADX WARN: Type inference failed for: r7v6, types: [T, android.view.View, xsna.b83] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ?? r3;
        Map map;
        int i = 25;
        int i2 = 1;
        int i3 = 0;
        switch (this.b) {
            case 0:
                L.i((Throwable) obj);
                return s3q0.a;
            case 1:
                BookingEditScreenFragment bookingEditScreenFragment = (BookingEditScreenFragment) this.receiver;
                bookingEditScreenFragment.getClass();
                xn50.a.c(bookingEditScreenFragment, (com.vk.ecomm.onlinebooking.impl.edit.a) obj);
                return s3q0.a;
            case 2:
                String str = (String) obj;
                das0 das0Var = (das0) this.receiver;
                das0Var.b = str;
                das0Var.c = das0Var.d.add(str);
                das0Var.a = Long.valueOf(SystemClock.elapsedRealtime());
                return s3q0.a;
            case 3:
                ShortVideoGetOwnerVideosResponseDto shortVideoGetOwnerVideosResponseDto = (ShortVideoGetOwnerVideosResponseDto) obj;
                ((c4e) this.receiver).getClass();
                return new j3e(ums0.e(ums0.a, shortVideoGetOwnerVideosResponseDto.e(), shortVideoGetOwnerVideosResponseDto.j(), shortVideoGetOwnerVideosResponseDto.d(), false, 52), shortVideoGetOwnerVideosResponseDto.g());
            case 4:
                ShortVideoGetUserSettingsResponseDto shortVideoGetUserSettingsResponseDto = (ShortVideoGetUserSettingsResponseDto) obj;
                yye yyeVar = (yye) this.receiver;
                String str2 = yye.d;
                yyeVar.getClass();
                Boolean f = shortVideoGetUserSettingsResponseDto.f();
                List<ShortVideoSettingDto> i4 = shortVideoGetUserSettingsResponseDto.i();
                if (i4 != null) {
                    List<ShortVideoSettingDto> list = i4;
                    r3 = new ArrayList(c5g.u(list, 10));
                    for (ShortVideoSettingDto shortVideoSettingDto : list) {
                        r3.add(new ued(shortVideoSettingDto.getId(), shortVideoSettingDto.d()));
                    }
                } else {
                    r3 = EmptyList.b;
                }
                return f != null ? new ved(r3, f.booleanValue()) : new ved(r3, false);
            case 5:
                ay00 ay00Var = (ay00) obj;
                com.vk.profile.community.impl.ui.profile.a aVar = (com.vk.profile.community.impl.ui.profile.a) this.receiver;
                aVar.getClass();
                UserId q = ay00Var.q();
                if (epx.f(q != null ? fkq0.a(q) : null, fkq0.a(aVar.i.a))) {
                    aVar.Y(new d.h(ay00Var));
                    if (ay00Var instanceof fu00) {
                        aVar.T(d.t.a.c.b);
                    } else {
                        if (!(ay00Var instanceof gu00)) {
                            if (ay00Var instanceof iu00) {
                                i2 = -((iu00) ay00Var).b;
                            } else if (ay00Var instanceof hu00) {
                                hu00 hu00Var = (hu00) ay00Var;
                                i2 = hu00Var.c - hu00Var.b;
                            }
                        }
                        aVar.T(new d.t.a.f(Integer.valueOf(i2)));
                    }
                }
                return s3q0.a;
            case 6:
                pim pimVar = (pim) this.receiver;
                btk0 btk0Var = pimVar.l;
                btk0Var.c = false;
                btk0Var.a = ((ipm) obj).a(btk0Var.a.e);
                pimVar.X0();
                pimVar.d1();
                PinnedMsg a = pimVar.l.a();
                boolean b = pimVar.l.b();
                b26.f fVar = pimVar.o;
                if (fVar != null) {
                    b26 b26Var = b26.this;
                    if (a == null || !b) {
                        b26Var.g(b26.a.PINNED, b26Var.l, 0L);
                    } else {
                        b26.n(b26Var, b26.a.PINNED, b26Var.l);
                    }
                }
                return s3q0.a;
            case 7:
                com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.g gVar = (com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.g) obj;
                EcosystemProfileView ecosystemProfileView = (EcosystemProfileView) this.receiver;
                ixo ixoVar = ecosystemProfileView.i;
                if (gVar instanceof g.b) {
                    ixoVar.s(hxo.b.b);
                } else if (gVar instanceof g.d) {
                    SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                    SuperappUiRouterBridge superappUiRouterBridge2 = superappUiRouterBridge != null ? superappUiRouterBridge : null;
                    Context context = ecosystemProfileView.getContext();
                    g.d dVar = (g.d) gVar;
                    String str3 = dVar.a;
                    int i5 = EcosystemProfileView.a.$EnumSwitchMapping$0[dVar.b.ordinal()];
                    if (i5 == 1) {
                        map = jgp.b;
                    } else {
                        if (i5 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        map = dt.b(NotificationCompat.CATEGORY_RECOMMENDATION, "1");
                    }
                    superappUiRouterBridge2.V(context, map);
                    ixoVar.s(hxo.b.b);
                } else if (gVar instanceof g.c) {
                    Context context2 = ecosystemProfileView.getContext();
                    l9h l9hVar = new l9h(ecosystemProfileView, 12);
                    com.vk.movika.tools.controls.seekbar.n nVar = new com.vk.movika.tools.controls.seekbar.n(i);
                    eeu0.a aVar2 = new eeu0.a(context2, R.style.VkAlertDialogThemePositive);
                    aVar2.c = true;
                    aVar2.B(R.string.vk_multiaccount_logout_dialog_title);
                    aVar2.q(R.string.vk_multiaccount_logout_dialog_message);
                    aVar2.setNegativeButton(R.string.vk_auth_exchange_delete_dialog_cancel, new z140(nVar));
                    aVar2.j(cqm0.b(context2.getString(R.string.vk_multiaccount_logout)), new a240(l9hVar, i3));
                    aVar2.m();
                } else if (gVar instanceof g.C1896g) {
                    qro0.e(400L, new com.vk.movika.sdk.base.logic.interactor.n(ecosystemProfileView, ecosystemProfileView.getContext(), ecosystemProfileView.getContext().getString(((g.C1896g) gVar).a), i2));
                } else if (gVar instanceof g.a) {
                    ixoVar.s(hxo.b.b);
                } else if (gVar instanceof g.h) {
                    xn50.a.c(ecosystemProfileView, new a.h(((g.h) gVar).a));
                } else if (gVar instanceof g.f) {
                    xn50.a.c(ecosystemProfileView, new a.g(((g.f) gVar).a));
                } else {
                    if (!(gVar instanceof g.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    xn50.a.c(ecosystemProfileView, new a.f(((g.e) gVar).a));
                }
                return s3q0.a;
            case 8:
                ee10 ee10Var = (ee10) this.receiver;
                ee10Var.getClass();
                xn50.a.c(ee10Var, (ce10) obj);
                return s3q0.a;
            case 9:
                SearchAddressFragment searchAddressFragment = (SearchAddressFragment) this.receiver;
                searchAddressFragment.getClass();
                xn50.a.c(searchAddressFragment, (zlh0) obj);
                return s3q0.a;
            case 10:
                foh0 foh0Var = (foh0) obj;
                SearchCommunitiesOnMapDetailsFragment searchCommunitiesOnMapDetailsFragment = (SearchCommunitiesOnMapDetailsFragment) this.receiver;
                int i6 = SearchCommunitiesOnMapDetailsFragment.T;
                searchCommunitiesOnMapDetailsFragment.getClass();
                if (epx.f(foh0Var, foh0.b.a)) {
                    searchCommunitiesOnMapDetailsFragment.kn().onBackPressed();
                } else if (foh0Var instanceof foh0.c) {
                    foh0.c cVar = (foh0.c) foh0Var;
                    xwk.d().getBrowser().k(searchCommunitiesOnMapDetailsFragment.requireContext(), "https://m." + a0a.d + "/mail?community=" + fkq0.e(cVar.a), 101, cVar.b);
                } else if (foh0Var instanceof foh0.d) {
                    maz.c(xwk.d().e(), searchCommunitiesOnMapDetailsFragment.requireContext(), ((foh0.d) foh0Var).a, LaunchContext.A, null, null, 24);
                } else if (foh0Var instanceof foh0.g) {
                    foh0.g gVar2 = (foh0.g) foh0Var;
                    xwk.e().m(searchCommunitiesOnMapDetailsFragment.requireContext(), gVar2.a, new o0r0.a(false, null, null, null, gVar2.b, null, null, false, false, false, false, null, null, null, 65519));
                } else if (foh0Var instanceof foh0.h) {
                    foh0.h hVar = (foh0.h) foh0Var;
                    ((ajg0) searchCommunitiesOnMapDetailsFragment.R.getValue()).j(hVar.a, hVar.b, hVar.c, searchCommunitiesOnMapDetailsFragment.requireContext());
                } else if (foh0Var instanceof foh0.f) {
                    foh0.f fVar2 = (foh0.f) foh0Var;
                    ((ajg0) searchCommunitiesOnMapDetailsFragment.R.getValue()).n(searchCommunitiesOnMapDetailsFragment.requireContext(), new CreateCommunityReviewArgs(fVar2.a, null, null, fVar2.b, fVar2.c));
                } else if (foh0Var instanceof foh0.e) {
                    xg5.a().m(searchCommunitiesOnMapDetailsFragment.requireContext(), ((foh0.e) foh0Var).a);
                } else {
                    if (!(foh0Var instanceof foh0.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Context requireContext = searchCommunitiesOnMapDetailsFragment.requireContext();
                    LocationCoordinate locationCoordinate = ((foh0.a) foh0Var).b;
                    List r = m4s.r(requireContext, locationCoordinate.b, locationCoordinate.c);
                    if (r != null) {
                        FragmentActivity kn = searchCommunitiesOnMapDetailsFragment.kn();
                        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                        ?? c83Var = new c83(kn, ref$ObjectRef);
                        c83Var.setOnDismissListener(new x73(c83Var, ref$ObjectRef));
                        ?? b83Var = new b83(kn, r, null, c83Var);
                        c83Var.setContentView(b83Var);
                        ref$ObjectRef.element = b83Var;
                        c83Var.setCancelable(true);
                        c83Var.n(3);
                        c83Var.r = 4;
                        c83Var.Ng();
                        c83Var.show();
                    }
                }
                return s3q0.a;
            case 11:
                com.vk.clips.sdk.shared.item.static_ads.events.b bVar = (com.vk.clips.sdk.shared.item.static_ads.events.b) obj;
                com.vk.clips.sdk.shared.item.static_ads.events.a aVar3 = (com.vk.clips.sdk.shared.item.static_ads.events.a) this.receiver;
                View view = aVar3.a;
                if (bVar instanceof b.c.a) {
                    u7k0 u7k0Var = aVar3.e;
                    Context context3 = view.getContext();
                    b.c cVar2 = (b.c) bVar;
                    if (!(cVar2 instanceof b.c.a)) {
                        u7k0Var.getClass();
                        throw new NoWhenBranchMatchedException();
                    }
                    u7k0Var.a.a(context3, ((b.c.a) cVar2).a);
                } else if (bVar instanceof b.a) {
                    aVar3.b.f(false);
                } else {
                    if (!(bVar instanceof b.C0696b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Activity L = blk.L(view);
                    if (L != null) {
                        aVar3.c.a(L, new g880(aVar3, i));
                    }
                }
                return s3q0.a;
            default:
                L.i((Throwable) obj);
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gl6(BookingEditScreenFragment bookingEditScreenFragment) {
        super(1, bookingEditScreenFragment, BookingEditScreenFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0);
        this.b = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gl6(Object obj, int i) {
        super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        this.b = i;
        switch (i) {
            case 2:
                super(1, obj, das0.class, "onTabSwitchStarted", "onTabSwitchStarted(Ljava/lang/String;)V", 0);
                break;
            case 3:
                super(1, obj, c4e.class, "mapResponse", "mapResponse(Lcom/vk/api/generated/shortVideo/dto/ShortVideoGetOwnerVideosResponseDto;)Lcom/vk/clips/favorites/impl/data/model/ClipsFavoriteFolderContentResponse;", 0);
                break;
            case 12:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            default:
                break;
        }
    }
}
