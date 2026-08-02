package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseCityDto;
import com.vk.api.generated.base.dto.BaseCountryDto;
import com.vk.api.generated.base.dto.BaseSexDto;
import com.vk.api.generated.groups.dto.GroupsGroupAdminLevelDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullAgeLimitsDto;
import com.vk.api.generated.identity.dto.IdentityAddressDto;
import com.vk.api.generated.identity.dto.IdentityEmailDto;
import com.vk.api.generated.identity.dto.IdentityGetCardResponseDto;
import com.vk.api.generated.identity.dto.IdentityLimitDto;
import com.vk.api.generated.identity.dto.IdentityPhoneDto;
import com.vk.api.generated.search.dto.SearchCoOwnersDto;
import com.vk.api.generated.search.dto.SearchGetCoOwnersResponseDto;
import com.vk.api.generated.search.dto.SearchGroupExtendedDto;
import com.vk.api.generated.search.dto.SearchProfileExtendedDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetPlaylistsResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoPlaylistFullDto;
import com.vk.clips.coauthors.domain.model.ClipsCoauthorSelectorUserItem;
import com.vk.clips.coauthors.domain.model.ClipsCoauthorsException;
import com.vk.clips.coauthors.domain.model.CoauthorType;
import com.vk.clips.coauthors.domain.model.Restriction;
import com.vk.clips.coauthors.domain.model.b;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.configureitemlist.ConfigureItemListFragment;
import com.vk.ecomm.market.api.ctabutton.ProductTileCtaButtonType;
import com.vk.gallerypicker.configuration.GalleryPickerSourceConfiguration;
import com.vk.log.L;
import com.vk.photos.root.albumdetails.presentation.AlbumDetailsFragment;
import com.vk.photos.root.albumdetails.presentation.a;
import com.vk.photos.root.albumdetails.presentation.i;
import com.vk.photos.root.selectalbum.domain.PhotoAlbumWrapper;
import com.vk.photos.root.selectalbum.presentation.SelectAlbumBottomSheet;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.sharing.api.di.SharingComponent;
import com.vk.sharing.api.dto.ActionsInfo;
import com.vk.sharing.api.dto.AttachmentInfo;
import com.vk.sharing.api.dto.SharingDataType;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryPublishItem;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import com.vk.superapp.api.dto.identity.WebCity;
import com.vk.superapp.api.dto.identity.WebCountry;
import com.vk.superapp.api.dto.identity.WebIdentityAddress;
import com.vk.superapp.api.dto.identity.WebIdentityCardData;
import com.vk.superapp.api.dto.identity.WebIdentityEmail;
import com.vk.superapp.api.dto.identity.WebIdentityLimit;
import com.vk.superapp.api.dto.identity.WebIdentityPhone;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.EcosystemProfileView;
import com.vk.superapp.qr.web2app.data.CheckSignInOpenArguments;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.chromium.net.NetError;
import ru.ok.android.utils.Logger;
import xsna.dw20;
import xsna.h7u0;
import xsna.j1c;
import xsna.kh1;
import xsna.qfa0;
import xsna.tlo0;
import xsna.wkh0;
import xsna.xn50;

/* compiled from: AlbumDetailsFragment.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class wg1 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wg1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0555 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0529  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v42, types: [android.content.Context, androidx.fragment.app.FragmentActivity] */
    /* JADX WARN: Type inference failed for: r2v89, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v90 */
    /* JADX WARN: Type inference failed for: r2v92, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v117, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v118 */
    /* JADX WARN: Type inference failed for: r3v120, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v121 */
    /* JADX WARN: Type inference failed for: r3v128, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v129, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v35, types: [xsna.oga0] */
    /* JADX WARN: Type inference failed for: r6v16, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v22, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v35, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v36, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v37, types: [java.util.ArrayList] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        com.vk.core.view.components.spinner.c cVar;
        ww50<?> Y;
        FragmentImpl u;
        Long l;
        Restriction none;
        boolean z;
        ClipsCoauthorSelectorUserItem clipsCoauthorSelectorUserItem;
        Restriction restriction;
        Restriction none2;
        Restriction restriction2;
        ?? r6;
        ?? r62;
        ?? r63;
        ?? r3;
        ?? r32;
        ?? r2;
        int i = 2;
        int i2 = 3;
        int i3 = 1;
        int i4 = 0;
        switch (this.b) {
            case 0:
                com.vk.photos.root.albumdetails.presentation.i iVar = (com.vk.photos.root.albumdetails.presentation.i) obj;
                final AlbumDetailsFragment albumDetailsFragment = (AlbumDetailsFragment) this.receiver;
                int i5 = AlbumDetailsFragment.p0;
                albumDetailsFragment.getClass();
                bpn0 bpn0Var = albumDetailsFragment.e0;
                bpn0 bpn0Var2 = albumDetailsFragment.c0;
                ?? r10 = albumDetailsFragment.l0;
                if (iVar instanceof i.q) {
                    i.q qVar = (i.q) iVar;
                    ArrayList<uh1> arrayList = qVar.a;
                    View view = qVar.b;
                    Photo photo = qVar.c;
                    int l2 = krv0.l(R.attr.vk_ui_icon_accent);
                    view.getContext();
                    e.b bVar = new e.b(view, null, null, l2, 6);
                    bVar.w = R.layout.ds_internal_context_menu_item;
                    Context requireContext = albumDetailsFragment.requireContext();
                    for (uh1 uh1Var : arrayList) {
                        VkContextMenu.c.d(bVar, uh1Var.a(requireContext), dhr0.t.b(uh1Var.b, uh1Var.c), false, new og1(albumDetailsFragment, uh1Var, photo, i4), 28);
                    }
                    VkContextMenu a = bVar.a();
                    com.vk.core.view.components.context.menu.e eVar = (com.vk.core.view.components.context.menu.e) a;
                    eVar.p = new pg1(view, i4);
                    eVar.q = new vg1(view, i4);
                    pli.r(a, view, true);
                } else if (iVar instanceof i.j) {
                    com.vk.photos.root.albumdetails.presentation.c cVar2 = albumDetailsFragment.m0;
                    (cVar2 != null ? cVar2 : null).j.smoothScrollToPosition(0);
                } else if (iVar instanceof i.k) {
                    i.k kVar = (i.k) iVar;
                    ?? activity = albumDetailsFragment.getActivity();
                    if (activity != 0) {
                        lh1 lh1Var = (lh1) albumDetailsFragment.k0.getValue();
                        kh1 kh1Var = kVar.a;
                        UserId userId = lh1Var.b;
                        ?? r33 = lh1Var.a;
                        if (kh1Var.equals(kh1.a.a)) {
                            ey50 ey50Var = activity instanceof ey50 ? (ey50) activity : null;
                            if (ey50Var != null && (Y = ey50Var.Y()) != null && (u = Y.u()) != null) {
                                h3p0.b(u);
                            }
                        } else if (kh1Var instanceof kh1.b) {
                            oga0.a(r33, activity, ((kh1.b) kh1Var).a, null, 28);
                        } else if (kh1Var.equals(kh1.d.a)) {
                            r33.s(activity, userId);
                        } else {
                            if (!kh1Var.equals(kh1.c.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            r33.d(activity, userId, false);
                        }
                        s3q0 s3q0Var = s3q0.a;
                    }
                } else if (iVar instanceof i.o) {
                    i.o oVar = (i.o) iVar;
                    Context mo2getContext = albumDetailsFragment.mo2getContext();
                    if (mo2getContext != null) {
                        dw20.b bVar2 = new dw20.b(mo2getContext, tzp0.a(null, 3));
                        bVar2.F0(true);
                        bVar2.x(0);
                        bVar2.l(dhr0.Y(R.attr.vk_ui_background_content, albumDetailsFragment.mo2getContext()));
                        bVar2.C0(Integer.valueOf(R.attr.vk_ui_icon_accent));
                        zg1 zg1Var = new zg1(mo2getContext);
                        zg1Var.setAlbumName(oVar.a);
                        String str = oVar.b;
                        zg1Var.setAlbumDescription(str != null ? str : "");
                        bVar2.D0(zg1Var, false);
                        bVar2.c(new cpo(false, 0, 6));
                        dw20 I0 = bVar2.I0(null);
                        zg1Var.setOnCloseClickListener(new w40(I0, i2));
                        zg1Var.setOnDescriptionLinkClickListener(new ca(I0, i2));
                    }
                } else if (iVar instanceof i.b.C1484b) {
                    albumDetailsFragment.fo((i.b) iVar);
                } else if (iVar instanceof i.b.a) {
                    albumDetailsFragment.fo((i.b) iVar);
                } else if (iVar instanceof i.C1485i) {
                    com.vk.photos.root.albumdetails.presentation.c cVar3 = albumDetailsFragment.m0;
                    com.vk.lists.c cVar4 = (cVar3 != null ? cVar3 : null).B;
                    if (cVar4 != null) {
                        cVar4.p(true);
                    }
                } else if (iVar instanceof i.n) {
                    final i.n nVar = (i.n) iVar;
                    Context mo2getContext2 = albumDetailsFragment.mo2getContext();
                    if (mo2getContext2 != null) {
                        int i6 = h7u0.p;
                        h7u0.a c = h7u0.b.c(mo2getContext2);
                        c.h0(nVar.a.a(mo2getContext2));
                        tlo0.f fVar = nVar.b;
                        fVar.getClass();
                        c.a.f = tlo0.b.a(fVar, mo2getContext2);
                        tlo0.f fVar2 = nVar.c;
                        fVar2.getClass();
                        c.d0(tlo0.b.a(fVar2, mo2getContext2), new DialogInterface.OnClickListener() { // from class: xsna.tg1
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i7) {
                                int i8 = AlbumDetailsFragment.p0;
                                a.h hVar = new a.h(nVar.d);
                                AlbumDetailsFragment albumDetailsFragment2 = AlbumDetailsFragment.this;
                                albumDetailsFragment2.getClass();
                                xn50.a.c(albumDetailsFragment2, hVar);
                            }
                        });
                        c.W(R.string.cancel, new ug1());
                        c.m();
                    }
                } else if (iVar instanceof i.r) {
                    Context mo2getContext3 = albumDetailsFragment.mo2getContext();
                    if (mo2getContext3 != null) {
                        if (albumDetailsFragment.n0 == 0) {
                            com.vk.core.view.components.spinner.c e = qv20.e(mo2getContext3, Integer.valueOf(R.string.rx_loading));
                            e.setCancelable(false);
                            e.show();
                            albumDetailsFragment.o0 = e;
                        }
                        albumDetailsFragment.n0++;
                    }
                } else if (iVar instanceof i.e) {
                    int i7 = albumDetailsFragment.n0 - 1;
                    albumDetailsFragment.n0 = i7;
                    if (i7 == 0 && (cVar = albumDetailsFragment.o0) != null) {
                        qv20.b(cVar);
                    }
                } else if (iVar instanceof i.m) {
                    i.m mVar = (i.m) iVar;
                    Context mo2getContext4 = albumDetailsFragment.mo2getContext();
                    if (mo2getContext4 != null) {
                        kbj0.e((kbj0) albumDetailsFragment.g0.getValue(), mo2getContext4, new PhotoAttachment(mVar.a), false, null, false, null, 60);
                    }
                } else if (iVar instanceof i.l) {
                    i.l lVar = (i.l) iVar;
                    ActionsInfo a2 = ((SharingComponent) r10.getValue()).v().a(lVar.a);
                    AttachmentInfo a3 = ((SharingComponent) r10.getValue()).u().a(lVar.a);
                    tbj0 a4 = ((SharingComponent) r10.getValue()).F2().a(albumDetailsFragment.requireContext());
                    a4.d = a2;
                    a4.c = a3;
                    a4.h = Integer.valueOf(SharingDataType.ALBUM.ordinal());
                    a4.c();
                } else if (iVar instanceof i.t) {
                    ((i.t) iVar).a.a(albumDetailsFragment.requireContext(), new com.vk.photos.root.albumdetails.presentation.b(1, albumDetailsFragment, AlbumDetailsFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0)).c();
                } else if (iVar instanceof i.f) {
                    ((qfa0.b) bpn0Var.getValue()).l(albumDetailsFragment.go());
                    ((oga0) bpn0Var2.getValue()).e(albumDetailsFragment, GalleryPickerSourceConfiguration.EntryPoint.ALBUM);
                } else if (iVar instanceof i.c) {
                    i.c cVar5 = (i.c) iVar;
                    if (cVar5.a.b == -9000) {
                        xn50.a.c(albumDetailsFragment, a.o.b);
                        ((oga0) bpn0Var2.getValue()).h(albumDetailsFragment.kn());
                    } else {
                        m6k m6kVar = new m6k();
                        m6kVar.C(albumDetailsFragment.io());
                        m6kVar.y(cVar5.a);
                        m6kVar.g(CommonConstant.RETCODE.NEED_UPDATE_STATICKIT, albumDetailsFragment);
                    }
                } else if (epx.f(iVar, i.a.a)) {
                    albumDetailsFragment.finish();
                } else if (iVar instanceof i.s) {
                    i.s sVar = (i.s) iVar;
                    Context mo2getContext5 = albumDetailsFragment.mo2getContext();
                    if (mo2getContext5 != null) {
                        new SelectAlbumBottomSheet.Builder(mo2getContext5, new SelectAlbumBottomSheet.Builder.Arguments(albumDetailsFragment.io(), mo2getContext5.getString(R.string.album_details_move_photo_popup_title), mo2getContext5.getString(R.string.album_details_move_photo_action_text), Collections.singletonList(new PhotoAlbumWrapper.SpecialPhotoAlbum(NetError.ERR_ECH_NOT_NEGOTIATED, albumDetailsFragment.getString(R.string.album_move_popup_photo_flow_album), false)), Collections.singleton(Integer.valueOf(albumDetailsFragment.go())), null, 32, null), new defpackage.y(i3, albumDetailsFragment, sVar)).I0(null);
                    }
                } else if (iVar instanceof i.g) {
                    i.g gVar = (i.g) iVar;
                    VKList<Photo> vKList = gVar.b;
                    VKList<Photo> vKList2 = gVar.b;
                    dea0 dea0Var = new dea0(vKList.i(), vKList2.size(), vKList2.j(), new com.vk.voip.ui.menu.feature.a(albumDetailsFragment, i), new com.vk.movika.sdk.base.logic.interactor.j(albumDetailsFragment, 4), new com.vk.movika.sdk.base.ui.q0(albumDetailsFragment, i3), null);
                    dea0Var.j = ((oga0) bpn0Var2.getValue()).n(albumDetailsFragment.requireContext(), gVar.a, vKList2, dea0Var);
                } else if (iVar instanceof i.p) {
                    i.p pVar = (i.p) iVar;
                    Context mo2getContext6 = albumDetailsFragment.mo2getContext();
                    if (mo2getContext6 != null) {
                        int i8 = h7u0.p;
                        h7u0.a c2 = h7u0.b.c(mo2getContext6);
                        tlo0.f fVar3 = pVar.a;
                        fVar3.getClass();
                        c2.h0(tlo0.b.a(fVar3, mo2getContext6));
                        tlo0.f fVar4 = pVar.b;
                        fVar4.getClass();
                        c2.a.f = tlo0.b.a(fVar4, mo2getContext6);
                        tlo0.f fVar5 = pVar.c;
                        fVar5.getClass();
                        c2.d0(tlo0.b.a(fVar5, mo2getContext6), new rg1(pVar, i4));
                        c2.W(R.string.cancel, new sg1(i4));
                        c2.m();
                    }
                } else if (iVar instanceof i.d) {
                    ProfileFragmentProviderComponent profileFragmentProviderComponent = (ProfileFragmentProviderComponent) m7m.d(albumDetailsFragment).a(fpf0.a(ProfileFragmentProviderComponent.class));
                    UserId userId2 = ((i.d) iVar).a;
                    ProfileFragmentProviderComponent.Companion companion = ProfileFragmentProviderComponent.Companion;
                    profileFragmentProviderComponent.ye(userId2, null).l(albumDetailsFragment);
                    albumDetailsFragment.finish();
                } else {
                    if (!(iVar instanceof i.h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List<String> list = ((i.h) iVar).a;
                    ((krl0) albumDetailsFragment.i0.getValue()).f(albumDetailsFragment.requireContext(), MobileOfficialAppsCoreNavStat$EventScreen.ALBUM, MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.PHOTO_ALBUM, list);
                    ((qfa0.b) bpn0Var.getValue()).p(albumDetailsFragment.go(), list.size());
                }
                return s3q0.a;
            case 1:
                L.i((Throwable) obj);
                return s3q0.a;
            case 2:
                String str2 = (String) obj;
                das0 das0Var = (das0) this.receiver;
                if (epx.f(das0Var.b, str2) && (l = das0Var.a) != null) {
                    long longValue = l.longValue();
                    das0Var.a = null;
                    long elapsedRealtime = SystemClock.elapsedRealtime() - longValue;
                    String str3 = das0Var.c ? "cold" : "hot";
                    l5m l5mVar = new l5m(null, null, 3);
                    l5mVar.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.CATALOG_TAB_SWITCH_DURATION.h(), null, String.valueOf(elapsedRealtime), null, str2, null, "OLD CATALOG TAB SWITCH DURATION", null, str3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, NetError.ERR_UNEXPECTED_SECURITY_LIBRARY_STATUS, 3, null);
                    l5mVar.q();
                }
                return s3q0.a;
            case 3:
                j1c j1cVar = (j1c) obj;
                a1c a1cVar = (a1c) this.receiver;
                int i9 = a1c.k1;
                a1cVar.getClass();
                if (epx.f(j1cVar, j1c.b.a)) {
                    RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                    frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.MOBILE_QR_CLOSE_ALERT_TAP, null, null, null, null, null, null, 254);
                    FragmentActivity activity2 = a1cVar.getActivity();
                    if (activity2 != null) {
                        activity2.onBackPressed();
                    }
                } else if (epx.f(j1cVar, j1c.c.a)) {
                    FragmentActivity activity3 = a1cVar.getActivity();
                    if (activity3 != null) {
                        activity3.onBackPressed();
                    }
                } else if (epx.f(j1cVar, j1c.a.a)) {
                    CheckSignInOpenArguments checkSignInOpenArguments = a1cVar.i1;
                    String str4 = checkSignInOpenArguments != null ? checkSignInOpenArguments.b : null;
                    com.vk.registration.funnels.b bVar3 = com.vk.registration.funnels.b.a;
                    SchemeStatSak$EventScreen schemeStatSak$EventScreen = SchemeStatSak$EventScreen.MOBILE_QR_ALERT_AUTH_ERROR;
                    SchemeStatSak$TypeRegistrationItem.Error error = SchemeStatSak$TypeRegistrationItem.Error.MOBILE_QR_AUTH_ERROR;
                    ArrayList arrayList2 = new ArrayList();
                    if (str4 != null) {
                        SchemeStatSak$RegistrationFieldItem.Name name = SchemeStatSak$RegistrationFieldItem.Name.QR_CODE_ID;
                        bVar3.getClass();
                        arrayList2.add(com.vk.registration.funnels.b.d(name, str4));
                    }
                    com.vk.registration.funnels.b.z(bVar3, schemeStatSak$EventScreen, arrayList2, null, error, 12);
                } else {
                    if (!epx.f(j1cVar, j1c.d.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    FragmentActivity activity4 = a1cVar.getActivity();
                    if (activity4 != null) {
                        activity4.onBackPressed();
                    }
                }
                return s3q0.a;
            case 4:
                SearchGetCoOwnersResponseDto searchGetCoOwnersResponseDto = (SearchGetCoOwnersResponseDto) obj;
                ((com.vk.clips.coauthors.domain.model.b) this.receiver).getClass();
                List<SearchCoOwnersDto> d = searchGetCoOwnersResponseDto.d();
                ArrayList arrayList3 = new ArrayList();
                for (SearchCoOwnersDto searchCoOwnersDto : d) {
                    SearchProfileExtendedDto e2 = searchCoOwnersDto.e();
                    if (e2 != null) {
                        UserId j = e2.j();
                        String i10 = e2.i();
                        String str5 = i10 == null ? "" : i10;
                        String k = e2.k();
                        String str6 = k == null ? "" : k;
                        String l3 = e2.l();
                        String str7 = l3 == null ? "" : l3;
                        BaseBoolIntDto f = e2.f();
                        BaseBoolIntDto baseBoolIntDto = BaseBoolIntDto.YES;
                        if (f == baseBoolIntDto) {
                            none2 = Restriction.BlacklistedByMe.b;
                        } else if (e2.e() == baseBoolIntDto) {
                            BaseSexDto n = e2.n();
                            int i11 = n == null ? -1 : b.a.$EnumSwitchMapping$0[n.ordinal()];
                            none2 = i11 != 1 ? i11 != 2 ? Restriction.Blacklisted.Male : Restriction.Blacklisted.Female : Restriction.Blacklisted.Male;
                        } else {
                            Integer d2 = e2.d();
                            if ((d2 != null ? d2.intValue() : 0) != 16) {
                                Integer d3 = e2.d();
                                if ((d3 != null ? d3.intValue() : 0) != 18) {
                                    none2 = epx.f(e2.g(), Boolean.FALSE) ? e2.n() == BaseSexDto.FEMALE ? Restriction.DisabledByPrivacy.Female : Restriction.DisabledByPrivacy.Male : new Restriction.None(searchCoOwnersDto.getDescription());
                                }
                            }
                            restriction2 = null;
                            if (restriction2 != null) {
                                clipsCoauthorSelectorUserItem = new ClipsCoauthorSelectorUserItem(j, str5, str6, str7, restriction2, qr.f(e2.j()), e2.n() == BaseSexDto.FEMALE ? CoauthorType.Female : CoauthorType.Male);
                                if (clipsCoauthorSelectorUserItem == null) {
                                    arrayList3.add(clipsCoauthorSelectorUserItem);
                                }
                            }
                            clipsCoauthorSelectorUserItem = null;
                            if (clipsCoauthorSelectorUserItem == null) {
                            }
                        }
                        restriction2 = none2;
                        if (restriction2 != null) {
                        }
                        clipsCoauthorSelectorUserItem = null;
                        if (clipsCoauthorSelectorUserItem == null) {
                        }
                    } else {
                        SearchGroupExtendedDto d4 = searchCoOwnersDto.d();
                        if (d4 != null) {
                            UserId e3 = fkq0.e(fkq0.a(d4.i()));
                            String j2 = d4.j();
                            String str8 = j2 == null ? "" : j2;
                            String k2 = d4.k();
                            String str9 = k2 == null ? "" : k2;
                            if (epx.f(d4.g(), "banned")) {
                                restriction = Restriction.CommunityBanned.b;
                            } else if (epx.f(d4.f(), Boolean.FALSE)) {
                                restriction = Restriction.DisabledByPrivacy.Community;
                            } else {
                                none = (d4.e() == GroupsGroupFullAgeLimitsDto.OVER_16 || d4.e() == GroupsGroupFullAgeLimitsDto.OVER_18) ? null : new Restriction.None(searchCoOwnersDto.getDescription());
                                if (none != null) {
                                    if (d4.l() == BaseBoolIntDto.YES) {
                                        GroupsGroupAdminLevelDto d5 = d4.d();
                                        if ((d5 != null ? d5.i() : 0) >= GroupsGroupAdminLevelDto.EDITOR.i()) {
                                            z = true;
                                            clipsCoauthorSelectorUserItem = new ClipsCoauthorSelectorUserItem(e3, str8, "", str9, none, z, CoauthorType.Community);
                                            if (clipsCoauthorSelectorUserItem == null) {
                                            }
                                        }
                                    }
                                    z = false;
                                    clipsCoauthorSelectorUserItem = new ClipsCoauthorSelectorUserItem(e3, str8, "", str9, none, z, CoauthorType.Community);
                                    if (clipsCoauthorSelectorUserItem == null) {
                                    }
                                }
                            }
                            none = restriction;
                            if (none != null) {
                            }
                        }
                        clipsCoauthorSelectorUserItem = null;
                        if (clipsCoauthorSelectorUserItem == null) {
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList4 = new ArrayList();
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (hashSet.add(((ClipsCoauthorSelectorUserItem) next).b)) {
                        arrayList4.add(next);
                    }
                }
                return new Result(!arrayList4.isEmpty() ? new smd(arrayList4, searchGetCoOwnersResponseDto.e()) : new Result.Failure(new ClipsCoauthorsException.CoauthorsEmptyResponseException()));
            case 5:
                ShortVideoGetPlaylistsResponseDto shortVideoGetPlaylistsResponseDto = (ShortVideoGetPlaylistsResponseDto) obj;
                ((c4e) this.receiver).getClass();
                List<ShortVideoPlaylistFullDto> d6 = shortVideoGetPlaylistsResponseDto.d();
                ArrayList arrayList5 = new ArrayList(c5g.u(d6, 10));
                Iterator it2 = d6.iterator();
                while (it2.hasNext()) {
                    arrayList5.add(c4e.a((ShortVideoPlaylistFullDto) it2.next()));
                }
                String g = shortVideoGetPlaylistsResponseDto.g();
                int count = shortVideoGetPlaylistsResponseDto.getCount();
                Integer e4 = shortVideoGetPlaylistsResponseDto.e();
                int intValue = e4 != null ? e4.intValue() : 25;
                Integer f2 = shortVideoGetPlaylistsResponseDto.f();
                return new b4e(arrayList5, g, count, intValue, f2 != null ? f2.intValue() : 100);
            case 6:
                ay00 ay00Var = (ay00) obj;
                com.vk.profile.community.impl.ui.profile.a aVar = (com.vk.profile.community.impl.ui.profile.a) this.receiver;
                aVar.getClass();
                UserId q = ay00Var.q();
                if (epx.f(q != null ? fkq0.a(q) : null, fkq0.a(aVar.i.a))) {
                    if (ay00Var instanceof gu00) {
                        aVar.T(new d.t.a.C1621d(((gu00) ay00Var).a, ProductTileCtaButtonType.GO_TO_CART));
                    } else if (ay00Var instanceof iu00) {
                        aVar.T(new d.t.a.C1621d(((iu00) ay00Var).a, ProductTileCtaButtonType.ADD_TO_CART));
                    } else if (ay00Var instanceof hu00) {
                        hu00 hu00Var = (hu00) ay00Var;
                        aVar.T(new d.t.a.C1621d(hu00Var.a, hu00Var.c == 0 ? ProductTileCtaButtonType.ADD_TO_CART : ProductTileCtaButtonType.GO_TO_CART));
                    } else if (ay00Var instanceof ju00) {
                        aVar.T(new d.t.a.C1620a(((ju00) ay00Var).a));
                    } else if (ay00Var instanceof fu00) {
                        aVar.T(new d.t.a.C1620a(((fu00) ay00Var).a));
                    } else if (ay00Var instanceof ku00) {
                        ku00 ku00Var = (ku00) ay00Var;
                        aVar.T(new d.t.a.b(ku00Var.b, ku00Var.a));
                    }
                }
                return s3q0.a;
            case 7:
                ConfigureItemListFragment configureItemListFragment = (ConfigureItemListFragment) this.receiver;
                configureItemListFragment.getClass();
                xn50.a.c(configureItemListFragment, (izi) obj);
                return s3q0.a;
            case 8:
                n1j n1jVar = (n1j) this.receiver;
                n1jVar.getClass();
                xn50.a.c(n1jVar, (v1j) obj);
                return s3q0.a;
            case 9:
                Throwable th = (Throwable) obj;
                pim pimVar = (pim) this.receiver;
                f9w f9wVar = pim.q;
                pimVar.getClass();
                pim.q.a(th);
                btk0 btk0Var = pimVar.l;
                btk0Var.c = false;
                btk0Var.e = th;
                pimVar.d1();
                return s3q0.a;
            case 10:
                ((alm) this.receiver).i.onNext((com.vk.im.engine.models.dialogs.c) obj);
                return s3q0.a;
            case 11:
                EcosystemProfileView ecosystemProfileView = (EcosystemProfileView) this.receiver;
                ecosystemProfileView.getClass();
                xn50.a.c(ecosystemProfileView, (com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.a) obj);
                return s3q0.a;
            case 12:
                IdentityGetCardResponseDto identityGetCardResponseDto = (IdentityGetCardResponseDto) obj;
                ((mvv) this.receiver).getClass();
                List<IdentityPhoneDto> j3 = identityGetCardResponseDto.j();
                if (j3 != null) {
                    List<IdentityPhoneDto> list2 = j3;
                    r6 = new ArrayList(c5g.u(list2, 10));
                    for (IdentityPhoneDto identityPhoneDto : list2) {
                        Integer d7 = identityPhoneDto.d();
                        if (d7 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        r6.add(new WebIdentityPhone(mvv.a(identityPhoneDto.e()), identityPhoneDto.f(), d7.intValue()));
                    }
                } else {
                    r6 = EmptyList.b;
                }
                ArrayList arrayList6 = new ArrayList((Collection) r6);
                List<IdentityEmailDto> g2 = identityGetCardResponseDto.g();
                if (g2 != null) {
                    List<IdentityEmailDto> list3 = g2;
                    r62 = new ArrayList(c5g.u(list3, 10));
                    for (IdentityEmailDto identityEmailDto : list3) {
                        Integer e5 = identityEmailDto.e();
                        if (e5 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        r62.add(new WebIdentityEmail(mvv.a(identityEmailDto.f()), identityEmailDto.d(), e5.intValue()));
                    }
                } else {
                    r62 = EmptyList.b;
                }
                ArrayList arrayList7 = new ArrayList((Collection) r62);
                List<IdentityAddressDto> d8 = identityGetCardResponseDto.d();
                if (d8 != null) {
                    List<IdentityAddressDto> list4 = d8;
                    r63 = new ArrayList(c5g.u(list4, 10));
                    for (IdentityAddressDto identityAddressDto : list4) {
                        Integer g3 = identityAddressDto.g();
                        if (g3 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        r63.add(new WebIdentityAddress(mvv.a(identityAddressDto.i()), identityAddressDto.f(), identityAddressDto.j(), identityAddressDto.k(), g3.intValue(), identityAddressDto.d(), identityAddressDto.e()));
                    }
                } else {
                    r63 = EmptyList.b;
                }
                ArrayList arrayList8 = new ArrayList((Collection) r63);
                List<BaseCountryDto> f3 = identityGetCardResponseDto.f();
                if (f3 != null) {
                    List<BaseCountryDto> list5 = f3;
                    r3 = new ArrayList(c5g.u(list5, 10));
                    for (BaseCountryDto baseCountryDto : list5) {
                        WebCountry webCountry = new WebCountry();
                        webCountry.b = baseCountryDto.getId();
                        webCountry.c = baseCountryDto.getTitle();
                        r3.add(webCountry);
                    }
                } else {
                    r3 = EmptyList.b;
                }
                ArrayList arrayList9 = new ArrayList((Collection) r3);
                List<BaseCityDto> e6 = identityGetCardResponseDto.e();
                if (e6 != null) {
                    List<BaseCityDto> list6 = e6;
                    r32 = new ArrayList(c5g.u(list6, 10));
                    for (BaseCityDto baseCityDto : list6) {
                        WebCity webCity = new WebCity();
                        webCity.b = baseCityDto.getId();
                        webCity.c = baseCityDto.getTitle();
                        webCity.d = "";
                        webCity.e = "";
                        webCity.f = false;
                        r32.add(webCity);
                    }
                } else {
                    r32 = EmptyList.b;
                }
                ArrayList arrayList10 = new ArrayList((Collection) r32);
                List<IdentityLimitDto> i12 = identityGetCardResponseDto.i();
                if (i12 != null) {
                    List<IdentityLimitDto> list7 = i12;
                    r2 = new ArrayList(c5g.u(list7, 10));
                    for (IdentityLimitDto identityLimitDto : list7) {
                        r2.add(new WebIdentityLimit(identityLimitDto.getType(), identityLimitDto.d()));
                    }
                } else {
                    r2 = EmptyList.b;
                }
                return new WebIdentityCardData(arrayList6, arrayList7, arrayList8, arrayList9, arrayList10, new ArrayList((Collection) r2));
            case 13:
                ee10 ee10Var = (ee10) this.receiver;
                ee10Var.getClass();
                xn50.a.c(ee10Var, (ce10) obj);
                return s3q0.a;
            case 14:
                ((io.reactivex.rxjava3.core.r) this.receiver).onNext((List) obj);
                return s3q0.a;
            case 15:
                return ((sxa0) this.receiver).i((com.vk.music.player.playback.e) obj);
            case 16:
                xne0 xne0Var = (xne0) this.receiver;
                int i13 = xne0.j;
                xne0Var.c((rne0) obj);
                return s3q0.a;
            case 17:
                qwk0 qwk0Var = (qwk0) obj;
                nxk0 nxk0Var = (nxk0) this.receiver;
                Context context = nxk0Var.a;
                lxk0 lxk0Var = nxk0Var.c;
                if (qwk0Var instanceof owk0) {
                    lxk0Var.b(context, ((owk0) qwk0Var).a, wkh0.b.a.a, new tsk0(nxk0Var, i3));
                } else if (qwk0Var instanceof nwk0) {
                    lxk0Var.b(context, ((nwk0) qwk0Var).a, wkh0.b.C3939b.a, null);
                } else {
                    if (!(qwk0Var instanceof pwk0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    lxk0Var.a(context, ((pwk0) qwk0Var).a);
                }
                return s3q0.a;
            case 18:
                ((weo0) this.receiver).a((jeo0) obj);
                return s3q0.a;
            default:
                L.i((Throwable) obj);
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg1(ConfigureItemListFragment configureItemListFragment) {
        super(1, configureItemListFragment, ConfigureItemListFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0);
        this.b = 7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg1(AlbumDetailsFragment albumDetailsFragment) {
        super(1, albumDetailsFragment, AlbumDetailsFragment.class, "handleSideEffect", "handleSideEffect(Lcom/vk/photos/root/albumdetails/presentation/AlbumDetailsSideEffect;)V", 0);
        this.b = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg1(Object obj, int i) {
        super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        this.b = i;
        switch (i) {
            case 2:
                super(1, obj, das0.class, "onTabVhResumed", "onTabVhResumed(Ljava/lang/String;)V", 0);
                break;
            case 5:
                super(1, obj, c4e.class, "mapGetPlaylistsResponse", "mapGetPlaylistsResponse(Lcom/vk/api/generated/shortVideo/dto/ShortVideoGetPlaylistsResponseDto;)Lcom/vk/clips/favorites/impl/data/model/ClipsFavoriteFoldersResponse;", 0);
                break;
            case 15:
                super(1, obj, sxa0.class, "getPlaybackQueueCache", "getPlaybackQueueCache(Lcom/vk/music/player/playback/StartPlaySourceQueueMeta;)Lio/reactivex/rxjava3/core/Single;", 0);
                break;
            case 16:
                super(1, obj, xne0.class, "processQrInfo", "processQrInfo(Lcom/vk/qrcode/QrInfo;)V", 0);
                break;
            case 18:
                super(1, obj, weo0.class, "consume", "consume(Lcom/vk/photo/editor/markup/dialog/mvi/model/TextEditMessage;)V", 0);
                break;
            case 19:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            default:
                break;
        }
    }
}
