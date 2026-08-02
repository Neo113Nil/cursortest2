package xsna;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.vk.api.generated.account.dto.AccountGetModelsResponseDto;
import com.vk.api.generated.account.dto.AccountModelDto;
import com.vk.api.generated.identity.dto.IdentityAddressResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.auth.verification.base.states.CodeState;
import com.vk.design.demo.presentation.screens.GroupMode;
import com.vk.dto.common.GroupsSuggestions;
import com.vk.dto.common.Image;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Caption;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.ecomm.configureitemlist.ConfigureItemListFragment;
import com.vk.ecomm.configureitemlist.api.model.ConfigureItem;
import com.vk.ecomm.configureitemlist.api.model.ConfigureItemId;
import com.vk.ecomm.products_multipicker.api.model.MultipickerProduct;
import com.vk.ecomm.products_multipicker.api.model.MultipickerProductId;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.music.screens.about.CommunityProfileLinksFragment;
import com.vk.profile.community.details.impl.invitelink.CommunityInviteLinkFragment;
import com.vk.profile.community.members.impl.ui.a;
import com.vk.superapp.api.dto.identity.WebIdentityAddress;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.cs00;
import xsna.gm50;
import xsna.icl;
import xsna.ikv0;
import xsna.rxh;
import xsna.s8k;
import xsna.t6k;
import xsna.tzi;
import xsna.ur20;
import xsna.uu1;
import xsna.vrg;
import xsna.y6k;
import xsna.z0o;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class dkg implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dkg(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0263, code lost:
    
        if (xsna.epx.f(r1 != null ? r1.h : null, r7) != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0228, code lost:
    
        if (xsna.epx.f(r2 != null ? r2.b : null, r7) != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0250, code lost:
    
        if (xsna.epx.f((r3 == null || (r3 = r3.o) == null) ? null : r3.b, r7) != false) goto L99;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Iterator it;
        Integer num;
        MultipickerProduct.Price price;
        MultipickerProduct.Moderation.Reject reject;
        Image image;
        MultipickerProduct.Owner owner;
        gvw0 gvw0Var;
        int i = this.b;
        int i2 = 10;
        int i3 = 29;
        boolean z = true;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((sd4) obj2).invoke((Throwable) obj);
                return s3q0.a;
            case 1:
                vqg vqgVar = (vqg) obj2;
                j5j j5jVar = ((Boolean) vqgVar.h.getValue()).booleanValue() ? j5j.d : null;
                prg prgVar = vqgVar.c.C0;
                if (prgVar == null) {
                    prgVar = null;
                }
                new com.vk.lists.c(vqgVar, null, vqgVar, null, true, 5, true, 30, 1073741823, j5jVar, "0", null, null, null, false, false, true, true, true).b(prgVar, true, true, 0L, null);
                return s3q0.a;
            case 2:
                ((vrg) ((vrg.a) obj2).m).h.invoke();
                return s3q0.a;
            case 3:
                CommunityInviteLinkFragment communityInviteLinkFragment = (CommunityInviteLinkFragment) obj2;
                int i4 = CommunityInviteLinkFragment.e0;
                ((cpu) communityInviteLinkFragment.d0.getValue()).j(communityInviteLinkFragment, communityInviteLinkFragment.b0, (r19 & 4) != 0 ? null : "/community_manage/?action=open_page&page_id=invite_links_list&group_id=" + communityInviteLinkFragment.b0, (r19 & 8) != 0 ? null : null, (r19 & 16) != 0 ? null : 2, (r19 & 32) != 0 ? null : null, (r19 & 64) == 0 ? "community_page" : null, (r19 & 128) == 0);
                return s3q0.a;
            case 4:
                g47 g47Var = (g47) obj;
                qcy<Object>[] qcyVarArr = CommunityProfileLinksFragment.P;
                u1h0 u1h0Var = ((CommunityProfileLinksFragment) obj2).O;
                qcy<Object>[] qcyVarArr2 = CommunityProfileLinksFragment.P;
                qcy<Object> qcyVar = qcyVarArr2[0];
                g47Var.e(tci.l((bn50) bu00.k(u1h0Var)), new uqh());
                qcy<Object> qcyVar2 = qcyVarArr2[0];
                g47Var.a(tci.k((bn50) bu00.k(u1h0Var)));
                qcy<Object> qcyVar3 = qcyVarArr2[0];
                g47Var.d(new rqh((bn50) bu00.k(u1h0Var)));
                return s3q0.a;
            case 5:
                return ((esh) obj2).e;
            case 6:
                wxh wxhVar = (wxh) obj2;
                wxhVar.l.c(new rxh.i(wxhVar.m));
                return s3q0.a;
            case 7:
                ConfigureItemListFragment configureItemListFragment = (ConfigureItemListFragment) obj2;
                tzi tziVar = (tzi) obj;
                int i5 = ConfigureItemListFragment.S;
                if (tziVar instanceof tzi.c) {
                    configureItemListFragment.Mf(-1, new Intent().putParcelableArrayListExtra("extra_configure_item_list_selected_goods_key", p4g.q(((tzi.c) tziVar).a)));
                } else if (tziVar instanceof tzi.b) {
                    ArrayList arrayList = ((tzi.b) tziVar).a;
                    Bundle arguments = configureItemListFragment.getArguments();
                    UserId userId = arguments != null ? (UserId) arguments.getParcelable("key_current_group_id") : null;
                    atd0 atd0Var = (atd0) configureItemListFragment.R.getValue();
                    Context requireContext = configureItemListFragment.requireContext();
                    ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ConfigureItem configureItem = (ConfigureItem) it2.next();
                        ConfigureItemId configureItemId = configureItem.b;
                        MultipickerProductId multipickerProductId = new MultipickerProductId(configureItemId.b, configureItemId.c);
                        String str = configureItem.c;
                        ConfigureItem.ProductPrice productPrice = configureItem.d;
                        MultipickerProduct.Price price2 = new MultipickerProduct.Price(productPrice.b, productPrice.c, productPrice.d, productPrice.e);
                        ConfigureItem.Moderation moderation = configureItem.l;
                        boolean z2 = moderation.b;
                        boolean z3 = moderation.c;
                        boolean z4 = moderation.d;
                        Integer num2 = moderation.e;
                        Image image2 = moderation.f;
                        ConfigureItem.Moderation.Reject reject2 = moderation.g;
                        if (reject2 != null) {
                            it = it2;
                            num = num2;
                            price = price2;
                            reject = new MultipickerProduct.Moderation.Reject(reject2.b, reject2.c, reject2.d, reject2.e);
                        } else {
                            it = it2;
                            num = num2;
                            price = price2;
                            reject = null;
                        }
                        MultipickerProduct.Moderation moderation2 = new MultipickerProduct.Moderation(z2, z3, z4, num, image2, reject);
                        Image image3 = configureItem.e;
                        boolean z5 = configureItem.g;
                        boolean z6 = configureItem.f;
                        String str2 = configureItem.h;
                        String str3 = configureItem.i;
                        ConfigureItem.Owner owner2 = configureItem.j;
                        if (owner2 != null) {
                            image = image3;
                            owner = new MultipickerProduct.Owner(owner2.b, owner2.c, owner2.d);
                        } else {
                            image = image3;
                            owner = null;
                        }
                        ConfigureItem.Rating rating = configureItem.k;
                        arrayList2.add(new MultipickerProduct(multipickerProductId, str, price, moderation2, image, z5, z6, str2, str3, owner, rating != null ? new MultipickerProduct.Rating(rating.b, rating.c, rating.d) : null));
                        it2 = it;
                    }
                    atd0Var.a(requireContext, new g910(arrayList2, 0, null, userId, new com.vk.movika.sdk.base.logic.interactor.p(configureItemListFragment, 27), 0, null, null, null, null, null, null, 16214));
                } else {
                    if (!(tziVar instanceof tzi.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ikv0.a aVar = new ikv0.a(configureItemListFragment.requireContext());
                    aVar.u = new ikv0.d(configureItemListFragment.requireContext().getString(R.string.attach_multipicker_limit_error_title), configureItemListFragment.requireContext().getString(R.string.attach_multipicker_limit_error_subtitle), (ikv0.d.a) null, 4);
                    aVar.e(iah0.a(78));
                    aVar.g(80);
                    aVar.n();
                }
                return s3q0.a;
            case 8:
                ((zak0) ((rfj) obj2).o).setValue((String) obj);
                return s3q0.a;
            case 9:
                t6k t6kVar = (t6k) obj2;
                y6k.b bVar = t6kVar.h;
                LayoutInflater layoutInflater = t6kVar.j;
                ViewGroup viewGroup = (ViewGroup) obj;
                ImFeatures imFeatures = ImFeatures.IM_START_CHAT_REDESIGN;
                imFeatures.getClass();
                return com.vk.toggle.b.A.a(imFeatures) ? new g0r0(layoutInflater.inflate(R.layout.vkim_new_chat_user_vh, viewGroup, false), bVar) : new t6k.j(layoutInflater.inflate(R.layout.vkim_new_chat_user_vh_old, viewGroup, false), bVar);
            case 10:
                ((p8k) obj2).T(new s8k.e(true));
                return s3q0.a;
            case 11:
                return new u9u(R.layout.vk_pay_checkout_buy_with_googlepay_button, (ViewGroup) obj, (icl.a) obj2);
            case 12:
                z0o.a aVar2 = (z0o.a) obj2;
                etv0 etv0Var = (etv0) obj;
                aVar2.o = false;
                z0o z0oVar = z0o.this;
                Action action = z0oVar.g.h;
                if (action != null) {
                    z0oVar.h.invoke(action);
                }
                etv0Var.b(false);
                return s3q0.a;
            case 13:
                Throwable th = (Throwable) obj;
                return ((th instanceof VKApiExecutionException) && f35.b((VKApiExecutionException) th) && (((fcp) obj2).z.b instanceof CodeState.EmailWait)) ? io.reactivex.rxjava3.core.q.T(new CodeState.EmailWait(0L, 0L, 0, null, 15, null)) : io.reactivex.rxjava3.core.q.H(th);
            case 14:
                UserId userId2 = (UserId) obj2;
                Parcelable parcelable = (NewsEntry) obj;
                if (parcelable instanceof l490) {
                    Owner s = ((l490) parcelable).s();
                    break;
                }
                boolean z7 = parcelable instanceof Post;
                if (!z7 || !epx.f(((Post) parcelable).m, userId2)) {
                    if (z7) {
                        Post post = ((Post) parcelable).D;
                        break;
                    }
                    if (z7) {
                        Caption caption = ((Post) parcelable).x;
                        break;
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 15:
                dw20 dw20Var = (dw20) ((Ref$ObjectRef) obj2).element;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 16:
                qyr qyrVar = (qyr) obj2;
                if (qyrVar.g.incrementAndGet() == 1) {
                    io.reactivex.rxjava3.disposables.b bVar2 = qyrVar.f;
                    io.reactivex.rxjava3.disposables.b bVar3 = new io.reactivex.rxjava3.disposables.b();
                    io.reactivex.rxjava3.internal.operators.observable.c0 c0Var = qyrVar.b;
                    io.reactivex.rxjava3.core.w wVar = qyrVar.i;
                    bVar3.b(c0Var.a0(wVar).subscribe(new tp0(new s6k(qyrVar, 15), i3)));
                    bVar3.b(qyrVar.a.a0(wVar).subscribe(new pf1(new vam(qyrVar, i2), 19)));
                    bVar2.b(bVar3);
                }
                return s3q0.a;
            case 17:
                ((zak0) ((v1z) obj2).i).setValue((GroupMode) obj);
                return s3q0.a;
            case 18:
                ((com.vk.attachpicker.fragment.gallery.c) obj2).k = false;
                return ((ViewPropertyAnimator) obj).alpha(1.0f).translationX(cn70.c(-14)).setDuration(300L);
            case 19:
                WebIdentityAddress webIdentityAddress = (WebIdentityAddress) obj2;
                return new WebIdentityAddress(webIdentityAddress.b, ((IdentityAddressResponseDto) obj).d(), webIdentityAddress.d, webIdentityAddress.e, webIdentityAddress.f, webIdentityAddress.g, webIdentityAddress.h);
            case 20:
                phu phuVar = (phu) obj2;
                return new tgu(phuVar.j, phuVar.k, phuVar.m, phuVar.n, (ViewGroup) obj, phuVar.o);
            case 21:
                GroupsSuggestions groupsSuggestions = (GroupsSuggestions) obj2;
                kru kruVar = (kru) obj;
                GroupsSuggestions groupsSuggestions2 = new GroupsSuggestions(groupsSuggestions.i, kruVar.getTitle(), kruVar.s1(), p4g.q(kruVar.getItems()), kruVar.o(), groupsSuggestions.n);
                groupsSuggestions2.c = groupsSuggestions.c;
                groupsSuggestions2.g = groupsSuggestions.g;
                groupsSuggestions2.h = groupsSuggestions.h;
                return groupsSuggestions2;
            case 22:
                cbv cbvVar = (cbv) obj2;
                View view = (View) obj;
                ComponentCallbacks2 h = e3m.h(view.getContext());
                evw0 evw0Var = h instanceof evw0 ? (evw0) h : null;
                if (evw0Var == null || (gvw0Var = evw0Var.getPermissions()) == null) {
                    gvw0Var = new gvw0(view.getContext(), new ivw0());
                }
                gvw0Var.g(new sbg(cbvVar, 22), new tbg(cbvVar, 23));
                return s3q0.a;
            case 23:
                r100.a(((mrw) obj2).g, "Review flow success");
                return s3q0.a;
            case 24:
                jyz jyzVar = (jyz) obj2;
                int i6 = jyz.r1;
                gm50.a.a(jyzVar, ((uyz) obj).a, new s6k(jyzVar, i3));
                return s3q0.a;
            case 25:
                bt00 bt00Var = (bt00) obj2;
                at00 at00Var = bt00Var.p;
                if (at00Var != null) {
                    bt00Var.l.a(new cs00.m(at00Var.b));
                }
                return s3q0.a;
            case 26:
                return new tij0((ViewGroup) obj, true, new m310(2, (n310) obj2, n310.class, "onShowMoreItemClick", "onShowMoreItemClick(ILcom/vk/ecomm/reviews/impl/replies/presentation/model/RepliesAdditionalInfo;)V", 0), 0);
            case 27:
                z37 z37Var = (z37) obj2;
                if (((List) obj).contains("banner")) {
                    z37Var.b(a.d.b);
                }
                return s3q0.a;
            case 28:
                ((nr20) obj2).T(new ur20.a.c((uu1.b) obj));
                return s3q0.a;
            default:
                ArrayList arrayList3 = (ArrayList) obj2;
                AccountGetModelsResponseDto accountGetModelsResponseDto = (AccountGetModelsResponseDto) obj;
                List<AccountModelDto> d = accountGetModelsResponseDto.d();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : d) {
                    AccountModelDto accountModelDto = (AccountModelDto) obj3;
                    if (!arrayList3.isEmpty()) {
                        Iterator it3 = arrayList3.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            if (brm0.w((String) it3.next(), accountModelDto.g(), true)) {
                                arrayList4.add(obj3);
                            }
                        }
                    }
                }
                return AccountGetModelsResponseDto.a(accountGetModelsResponseDto, arrayList4);
        }
    }
}
