package xsna;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Trace;
import com.ironsource.X3;
import com.vk.api.generated.account.dto.AccountCheckPasswordResponseDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionTypeDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.api.generated.catalog.dto.CatalogSectionResponseObjectDto;
import com.vk.api.generated.media.dto.MediaPopupDto;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.tool.view.disableable.DisableableRelativeLayout;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicDynamicRestriction;
import com.vk.dto.uxpolls.PollAnswer;
import com.vk.dto.uxpolls.PollQuestion;
import com.vk.ecomm.cart.impl.common.models.CourierAddress;
import com.vk.ecomm.cart.impl.courier_map.ui.fragment.CourierMapFragment;
import com.vk.friends.groupinvite.api.domain.InviteFriendsAnalytics;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.log.L;
import com.vk.superapp.api.dto.account.AccountCheckPasswordResponse;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.lwg;
import xsna.uwg;
import xsna.xn50;
import xsna.xpe0;
import xsna.xrb0;

/* compiled from: AudioRestrictionRepositoryImpl.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class tw4 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tw4(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Type inference failed for: r2v15, types: [android.view.ViewGroup, xsna.ype0] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Image image;
        BaseLinkButtonActionDto e;
        BaseLinkButtonActionTypeDto C;
        BaseLinkButtonActionDto e2;
        String str = null;
        AccountCheckPasswordResponse.SecurityLevel securityLevel = null;
        str = null;
        str = null;
        switch (this.b) {
            case 0:
                MediaPopupDto mediaPopupDto = (MediaPopupDto) obj;
                ((iv10) this.receiver).getClass();
                List<BaseImageDto> f = mediaPopupDto.f();
                if (f != null) {
                    new ne6();
                    image = ne6.a(f);
                } else {
                    image = Image.d;
                }
                Image image2 = image;
                String title = mediaPopupDto.getTitle();
                String i = mediaPopupDto.i();
                BaseLinkButtonDto d = mediaPopupDto.d();
                String title2 = d != null ? d.getTitle() : null;
                BaseLinkButtonDto d2 = mediaPopupDto.d();
                String url = (d2 == null || (e2 = d2.e()) == null) ? null : e2.getUrl();
                BaseLinkButtonDto d3 = mediaPopupDto.d();
                if (d3 != null && (e = d3.e()) != null && (C = e.C()) != null) {
                    str = C.j();
                }
                return new MusicDynamicRestriction(title, image2, i, title2, url, str, mediaPopupDto.i());
            case 1:
                L.i((Throwable) obj);
                return s3q0.a;
            case 2:
                return ((DisableableRelativeLayout) this.receiver).findViewById(((Number) obj).intValue());
            case 3:
                e2f e2fVar = (e2f) obj;
                fhe fheVar = (fhe) this.receiver;
                fheVar.getClass();
                io.reactivex.rxjava3.internal.operators.single.f0 q = io.reactivex.rxjava3.core.a.l(new hv8(1, fheVar, e2fVar)).t(e2fVar).q(fheVar.b());
                asu0.a.getClass();
                return q.m(asu0.i());
            case 4:
                lwg lwgVar = (lwg) obj;
                swg swgVar = (swg) this.receiver;
                FragmentImpl fragmentImpl = swgVar.a;
                d0i d0iVar = swgVar.f;
                if (lwgVar instanceof lwg.c) {
                    swgVar.b.g().c(new jbs(fragmentImpl), ((lwg.c) lwgVar).a, "", 3901);
                } else if (lwgVar instanceof lwg.f) {
                    swgVar.a(((lwg.f) lwgVar).a);
                } else if (lwgVar instanceof lwg.i) {
                    int i2 = c2h.p1;
                    lwg.i iVar = (lwg.i) lwgVar;
                    String str2 = iVar.b;
                    UserId userId = iVar.a;
                    c2h c2hVar = new c2h();
                    Bundle bundle = new Bundle();
                    bundle.putString("DESCRIPTION_KEY", str2);
                    bundle.putParcelable("COMMUNITY_ID_KEY", userId);
                    c2hVar.setArguments(bundle);
                    c2hVar.Td(fragmentImpl.getChildFragmentManager(), "CommunityEditDescriptionBottomSheet");
                } else if (lwgVar instanceof lwg.d) {
                    d0iVar.b(fragmentImpl.requireContext(), ((lwg.d) lwgVar).a, "live_covers");
                } else if (lwgVar instanceof lwg.b) {
                    d0iVar.b(fragmentImpl.requireContext(), ((lwg.b) lwgVar).a, X3.i.G0);
                } else if (lwgVar instanceof lwg.g) {
                    swgVar.a(((lwg.g) lwgVar).a);
                } else if (!(lwgVar instanceof lwg.m)) {
                    if (lwgVar instanceof lwg.k) {
                        lwg.k kVar = (lwg.k) lwgVar;
                        new uwg.a(kVar.a, kVar.b, fragmentImpl.requireContext()).I0(null);
                    } else if (lwgVar instanceof lwg.h) {
                        swgVar.a(((lwg.h) lwgVar).a);
                    } else if (lwgVar instanceof lwg.e) {
                        swgVar.g.X(fragmentImpl.requireContext(), ((lwg.e) lwgVar).a);
                    } else if (lwgVar instanceof lwg.j) {
                        int i3 = d2h.p1;
                        lwg.j jVar = (lwg.j) lwgVar;
                        String str3 = jVar.b;
                        UserId userId2 = jVar.a;
                        d2h d2hVar = new d2h();
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("INITIAL_ADDRESS_KEY", str3);
                        bundle2.putParcelable("COMMUNITY_ID_KEY", userId2);
                        d2hVar.setArguments(bundle2);
                        d2hVar.Td(fragmentImpl.getChildFragmentManager(), "CommunityEditShortNameBottomSheet");
                    } else if (lwgVar instanceof lwg.a) {
                        swgVar.d.a(fragmentImpl.requireContext(), swgVar.e, ((lwg.a) lwgVar).a, InviteFriendsAnalytics.InviteFriendsSource.CHECKLIST, true);
                    } else {
                        if (!(lwgVar instanceof lwg.l)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        swgVar.a(((lwg.l) lwgVar).a);
                    }
                }
                return s3q0.a;
            case 5:
                ((com.vk.profile.community.impl.ui.profile.a) this.receiver).T((com.vk.profile.community.impl.ui.profile.d) obj);
                return s3q0.a;
            case 6:
                CourierMapFragment courierMapFragment = (CourierMapFragment) this.receiver;
                qcy<Object>[] qcyVarArr = CourierMapFragment.T;
                courierMapFragment.getClass();
                Intent intent = new Intent();
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable("courier_address_key", (CourierAddress) obj);
                s3q0 s3q0Var = s3q0.a;
                courierMapFragment.Mf(-1, intent.putExtra("courier_address_extra", bundle3));
                return s3q0.a;
            case 7:
                Collection collection = (Collection) obj;
                com.vk.im.engine.internal.storage.delegates.dialogs.b bVar = (com.vk.im.engine.internal.storage.delegates.dialogs.b) this.receiver;
                bVar.getClass();
                if (collection.isEmpty()) {
                    return jgp.b;
                }
                Cursor d4 = bVar.b.b().d("SELECT * FROM dialogs_history_meta WHERE ".concat(p4g.k(collection, " OR ", new p60(22))), null);
                HashMap hashMap = new HashMap(d4.getCount());
                Trace.beginSection(ndp0.f("Cursor.forEach"));
                try {
                    try {
                        if (d4.moveToFirst()) {
                            while (!d4.isAfterLast()) {
                                Integer valueOf = Integer.valueOf(fl3.A(d4, "folder_id"));
                                DialogsFilter.a aVar = DialogsFilter.Companion;
                                int A = fl3.A(d4, "filter_id");
                                aVar.getClass();
                                hashMap.put(new Pair(valueOf, DialogsFilter.a.a(A)), com.vk.im.engine.internal.storage.delegates.dialogs.b.j(d4));
                                d4.moveToNext();
                            }
                        }
                        Trace.endSection();
                        return hashMap;
                    } finally {
                        d4.close();
                    }
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            case 8:
                xrb0 xrb0Var = (xrb0) obj;
                qrp qrpVar = (qrp) this.receiver;
                if (xrb0Var instanceof xrb0.a.d.C4042a) {
                    ?? r2 = qrpVar.d;
                    if (r2 != 0) {
                        r2.setState(new xpe0.e(((xrb0.a.d.C4042a) xrb0Var).c, xpe0.a.a));
                    }
                    xrb0.a.d.C4042a c4042a = (xrb0.a.d.C4042a) xrb0Var;
                    ((com.vk.video.polls.nav.b) qrpVar.c.invoke(qrpVar.a)).a(new yu1(9, qrpVar, on00.f(new Pair(Integer.valueOf(c4042a.b), new PollAnswer(Collections.singletonList(Integer.valueOf(c4042a.c)), null, 2, null)))));
                } else {
                    PollQuestion.RatingStar ratingStar = qrp.e;
                    qrpVar.getClass();
                }
                return s3q0.a;
            case 9:
                AccountCheckPasswordResponseDto accountCheckPasswordResponseDto = (AccountCheckPasswordResponseDto) obj;
                ((qp) this.receiver).getClass();
                AccountCheckPasswordResponse.SecurityLevel.a aVar2 = AccountCheckPasswordResponse.SecurityLevel.Companion;
                int i4 = accountCheckPasswordResponseDto.d().i();
                aVar2.getClass();
                AccountCheckPasswordResponse.SecurityLevel[] values = AccountCheckPasswordResponse.SecurityLevel.values();
                int length = values.length;
                int i5 = 0;
                while (true) {
                    if (i5 < length) {
                        AccountCheckPasswordResponse.SecurityLevel securityLevel2 = values[i5];
                        if (i4 == securityLevel2.h()) {
                            securityLevel = securityLevel2;
                        } else {
                            i5++;
                        }
                    }
                }
                if (securityLevel != null) {
                    return new AccountCheckPasswordResponse(securityLevel, accountCheckPasswordResponseDto.e());
                }
                throw new IllegalArgumentException("Unknown value for security_level field");
            case 10:
                return ((afa) this.receiver).a((CatalogSectionResponseObjectDto) obj);
            case 11:
                ge60 ge60Var = (ge60) this.receiver;
                ge60Var.getClass();
                xn50.a.c(ge60Var, (ee60) obj);
                return s3q0.a;
            case 12:
                L.i((Throwable) obj);
                return s3q0.a;
            case 13:
                ((io.reactivex.rxjava3.subjects.d) this.receiver).onNext((lm50) obj);
                return s3q0.a;
            default:
                ((f1o0) this.receiver).T((h1o0) obj);
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw4(DisableableRelativeLayout disableableRelativeLayout) {
        super(1, disableableRelativeLayout, DisableableRelativeLayout.class, "findViewById", "findViewById(I)Landroid/view/View;", 0);
        this.b = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw4(Object obj, int i) {
        super(1, obj, iv10.class, "dtoToMusicDynamicRestriction", "dtoToMusicDynamicRestriction(Lcom/vk/api/generated/media/dto/MediaPopupDto;)Lcom/vk/dto/music/MusicDynamicRestriction;", 0);
        this.b = i;
        switch (i) {
            case 1:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 3:
                super(1, obj, fhe.class, "cacheSavedInterests", "cacheSavedInterests(Lcom/vk/dto/shortvideo/ClipsSavedInterests;)Lio/reactivex/rxjava3/core/Single;", 0);
                break;
            case 10:
                super(1, obj, afa.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogSectionResponseObjectDto;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0);
                break;
            case 12:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw4(qp qpVar) {
        super(1, qpVar, qp.class, "mapToAccountCheckPasswordResponse", "mapToAccountCheckPasswordResponse(Lcom/vk/api/generated/account/dto/AccountCheckPasswordResponseDto;)Lcom/vk/superapp/api/dto/account/AccountCheckPasswordResponse;", 0);
        this.b = 9;
    }
}
