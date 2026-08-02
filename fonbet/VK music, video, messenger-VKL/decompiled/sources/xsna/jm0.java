package xsna;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import androidx.fragment.app.FragmentManager;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.articles.authorpage.ui.ArticleAuthorPageFragment;
import com.vk.channels.api.Channel;
import com.vk.clips.attachments.impl.views.video.ClipsVideoAttachmentPickerFragment;
import com.vk.clips.favorites.impl.ui.folders.renaming.a;
import com.vk.common.links.LaunchContext;
import com.vk.common.links.LinksParserData;
import com.vk.core.ui.modal.VkModal;
import com.vk.core.ui.modal.b;
import com.vk.core.view.BottomConfirmButton;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.core.view.components.topbar.VkTopBar$Middle$Cell$Middle$Text;
import com.vk.dto.common.im.Image;
import com.vk.dto.hints.HintId;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.catalog.impl.catalog.root.ClassifiedsCatalogRootVh;
import com.vk.ecomm.onlinebooking.impl.common.BookingError;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.b;
import com.vk.ecomm.onlinebooking.impl.services.presentation.c;
import com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServicesScreenFragment;
import com.vk.ecomm.reviews.api.model.ReviewsActionType;
import com.vk.ecomm.reviews.api.model.ReviewsModalBottomSheetArguments;
import com.vk.ecomm.reviews.api.model.communityreviews.CreateCommunityReviewArgs;
import com.vk.ecomm.reviews.api.model.communityreviews.CreateCommunityReviewSuccessResult;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.ecomm.reviews.impl.communities.yclients.c;
import com.vk.ecomm.reviews.impl.replies.presentation.actionbuilder.ReplyAction;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.conversations.PushSettings;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.ui.components.common.AvatarAction;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vk.mvi.binder.compose.rx.RxBindingScopeExtKt$bindStates$$inlined$map$1;
import com.vk.upload.impl.UploadNotification;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import xsna.as7;
import xsna.bre;
import xsna.c5v0;
import xsna.dzh;
import xsna.e3m;
import xsna.f4b;
import xsna.gy50;
import xsna.h7u0;
import xsna.ij20;
import xsna.inc;
import xsna.kyh;
import xsna.le8;
import xsna.mm7;
import xsna.npb;
import xsna.p8k;
import xsna.qn60;
import xsna.qyg;
import xsna.snx;
import xsna.t6k;
import xsna.tlo0;
import xsna.tma0;
import xsna.xn50;
import xsna.z7k;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class jm0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jm0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v0, types: [xsna.c5v0$a$a] */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r8v2 */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        mm7 aVar;
        as7 aVar2;
        dpb dpbVar;
        snx.b c;
        CharSequence a;
        int i = this.b;
        int i2 = 14;
        int i3 = 12;
        int i4 = 2;
        int i5 = 6;
        int i6 = 3;
        r8 = null;
        String str = null;
        int i7 = 1;
        int i8 = 0;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                dw20 dw20Var = ((km0) obj2).h;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 1:
                int i9 = ArticleAuthorPageFragment.f0;
                ((ArticleAuthorPageFragment) obj2).s();
                return s3q0.a;
            case 2:
                BookingServicesScreenFragment bookingServicesScreenFragment = (BookingServicesScreenFragment) obj2;
                com.vk.ecomm.onlinebooking.impl.services.presentation.c cVar = (com.vk.ecomm.onlinebooking.impl.services.presentation.c) obj;
                qcy<Object>[] qcyVarArr = BookingServicesScreenFragment.S;
                com.vk.ecomm.onlinebooking.impl.services.presentation.d dVar = (com.vk.ecomm.onlinebooking.impl.services.presentation.d) bookingServicesScreenFragment.P.getValue();
                BookingScreenParams bookingScreenParams = dVar.a;
                if (cVar instanceof c.InterfaceC0982c) {
                    c.InterfaceC0982c interfaceC0982c = (c.InterfaceC0982c) cVar;
                    if (epx.f(interfaceC0982c, c.InterfaceC0982c.b.a)) {
                        aVar2 = as7.b.a;
                    } else if (interfaceC0982c instanceof c.InterfaceC0982c.C0983c) {
                        aVar2 = new as7.j(((c.InterfaceC0982c.C0983c) interfaceC0982c).a);
                    } else {
                        if (!epx.f(interfaceC0982c, c.InterfaceC0982c.a.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar2 = new as7.a(bookingScreenParams.q);
                    }
                    wr7.a(bookingServicesScreenFragment, aVar2);
                } else if (cVar instanceof c.a) {
                    b.j jVar = bookingServicesScreenFragment.N;
                    c.a aVar3 = (c.a) cVar;
                    if (aVar3 instanceof c.a.C0981c) {
                        aVar = new mm7.b.g(((c.a.C0981c) aVar3).a, Integer.valueOf(bookingScreenParams.l), bookingScreenParams.q, false);
                    } else if (aVar3 instanceof c.a.C0980a) {
                        aVar = new mm7.b.C3352b(((c.a.C0980a) aVar3).a, Integer.valueOf(bookingScreenParams.l), bookingScreenParams.q);
                    } else if (aVar3 instanceof c.a.b) {
                        aVar = new mm7.b.e(((c.a.b) aVar3).a, null);
                    } else {
                        if (!(aVar3 instanceof c.a.d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c.a.d dVar2 = (c.a.d) aVar3;
                        aVar = new mm7.c.a(dVar2.a, dVar2.b);
                    }
                    wr7.b(bookingServicesScreenFragment, jVar, aVar);
                } else {
                    if (!(cVar instanceof c.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Context requireContext = bookingServicesScreenFragment.requireContext();
                    Exception exc = ((c.b) cVar).a;
                    dVar.b = rwp.a(requireContext, exc, exc instanceof BookingError.ServiceIsNotAvailableForRebooking);
                }
                return s3q0.a;
            case 3:
                BottomConfirmButton.a aVar4 = (BottomConfirmButton.a) obj2;
                int i10 = BottomConfirmButton.n;
                if (aVar4 != null) {
                    aVar4.c();
                }
                return s3q0.a;
            case 4:
                ke8 ke8Var = (ke8) obj2;
                ke8Var.b(new le8.e(ke8Var.b));
                return s3q0.a;
            case 5:
                gy50.l lVar = (gy50.l) obj2;
                lVar.getClass();
                Bundle b = yfb.b(new Pair("participant_id", null), new Pair("participant_name", lVar.a), new Pair("media_option", lVar.b));
                msw0 msw0Var = new msw0();
                msw0Var.setArguments(b);
                msw0Var.x = null;
                msw0Var.Td((FragmentManager) obj, "");
                return s3q0.a;
            case 6:
                ((Boolean) obj).booleanValue();
                ((hoa) obj2).b.invoke();
                return s3q0.a;
            case 7:
                ((com.vk.channels.impl.comments.b) obj2).u((Throwable) obj);
                return s3q0.a;
            case 8:
                ((ij20.a) obj).l(((i1b) obj2).d);
                return s3q0.a;
            case 9:
                Channel channel = (Channel) obj;
                ((y3b) obj2).T(new f4b.d(channel.N, channel.O));
                return s3q0.a;
            case 10:
                lpb lpbVar = (lpb) obj2;
                DialogExt a2 = ((npb.c) obj).a.a();
                if (a2 != null && (dpbVar = lpbVar.h) != null) {
                    VkTopBar vkTopBar = dpbVar.e;
                    if (vkTopBar == null) {
                        vkTopBar = null;
                    }
                    zji0 zji0Var = dpbVar.c;
                    if (zji0Var == null) {
                        zji0Var = null;
                    }
                    zji0Var.getClass();
                    Dialog Cb = a2.Cb();
                    ProfilesSimpleInfo Ob = a2.b.Ob();
                    ChatSettings Hb = Cb != null ? Cb.Hb() : null;
                    if (Cb == null) {
                        c = new snx.b.a(new b8g(R.drawable.user_placeholder));
                    } else if (Cb.Jc()) {
                        c = new snx.b.c(new slw(new qmm(iah0.a(36))), null, null, 14);
                    } else if (Hb != null) {
                        Image Ab = Hb.c.Ab();
                        String str2 = Ab != null ? Ab.d : null;
                        c = str2 == null ? new snx.b.c(new slw(zji0Var.b.c(Hb, Cb.Sb().longValue(), Cb.hc())), null, null, 14) : new snx.b.c(new vlw(str2, null), null, null, 14);
                    } else {
                        c = zji0Var.c(Ob.Ab(Cb.Sb()));
                    }
                    com.vk.core.view.components.topbar.b bVar = new com.vk.core.view.components.topbar.b(new snx(c), null, 6);
                    Context context = dpbVar.d;
                    if (context == null) {
                        context = null;
                    }
                    VkTopBar$Middle$Cell$Middle$Text.Title title = new VkTopBar$Middle$Cell$Middle$Text.Title(context.getString(R.string.im_chat_clips_recommendation), null, 30);
                    Context context2 = dpbVar.d;
                    vkTopBar.setMiddle(new VkTopBar.Middle.a(bVar, new VkTopBar$Middle$Cell$Middle$Text(title, new VkTopBar$Middle$Cell$Middle$Text.a((context2 != null ? context2 : 0).getString(R.string.im_chat_clips_by_clips_in_chat)), 4)));
                }
                return s3q0.a;
            case 11:
                ClassifiedsCatalogRootVh.this.n0();
                return s3q0.a;
            case 12:
                qnc qncVar = (qnc) obj2;
                g47 g47Var = (g47) obj;
                int i11 = inc.l1;
                g47Var.b(new h1m(new RxBindingScopeExtKt$bindStates$$inlined$map$1(cdn.a(d370.z(qncVar)), new pf(i3)), new xm1(qncVar, 18)));
                l370.m(g47Var, f9t.w(qncVar));
                g47Var.d(new inc.b(qncVar));
                return s3q0.a;
            case 13:
                String str3 = com.vk.clips.favorites.impl.ui.folders.renaming.b.m1;
                xn50.a.c((com.vk.clips.favorites.impl.ui.folders.renaming.b) obj2, new a.d(((tho0) obj).a.c));
                return s3q0.a;
            case 14:
                return (io.reactivex.rxjava3.internal.operators.maybe.k) obj2;
            case 15:
                bre.b bVar2 = bre.s1;
                ((bre) obj2).dismiss();
                return s3q0.a;
            case 16:
                ClipsVideoAttachmentPickerFragment.b bVar3 = (ClipsVideoAttachmentPickerFragment.b) obj2;
                String str4 = (String) obj;
                int i12 = ClipsVideoAttachmentPickerFragment.W;
                bVar3.c.setText(str4);
                bVar3.c.setContentDescription(str4);
                return s3q0.a;
            case 17:
                kyh kyhVar = (kyh) obj;
                final ryh ryhVar = (ryh) ((CommunityReviewsFragment) obj2).Y.getValue();
                qdz qdzVar = ryhVar.d;
                Integer valueOf = Integer.valueOf(R.string.reviews_alert_dialog_button_text);
                vbs vbsVar = ryhVar.c;
                Context context3 = ryhVar.a;
                if (kyhVar instanceof kyh.i) {
                    kyh.i iVar = (kyh.i) kyhVar;
                    HintId hintId = HintId.GROUP_COMMUNITY_REVIEW_BOTTOMSHEET_PIN_ONBOARDING;
                    List<ReviewsActionType> list = iVar.a;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        t10 a3 = cig0.a((ReviewsActionType) it.next());
                        if (a3 != null) {
                            arrayList.add(a3);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        boolean z = iVar.b.k && ryhVar.e.m(hintId);
                        if (z) {
                            ArrayList arrayList2 = new ArrayList(arrayList);
                            arrayList = new ArrayList(c5g.u(arrayList2, 10));
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                t10 t10Var = (t10) it2.next();
                                u60 u60Var = t10Var.a;
                                if (u60Var == ReviewsActionType.ACTION_PIN) {
                                    t10Var = new t10(u60Var, t10Var.b, t10Var.c, t10Var.d, t10Var.e, true);
                                }
                                arrayList.add(t10Var);
                            }
                        }
                        new v70(arrayList, new lfa(i6, ryhVar, iVar), new yuh(z, ryhVar, hintId, i7)).a(context3);
                    }
                } else if (kyhVar instanceof kyh.c) {
                    kyh.c cVar2 = (kyh.c) kyhVar;
                    new qyg.a(context3, new CreateCommunityReviewArgs(cVar2.a, cVar2.d, null, cVar2.b, cVar2.c, 4, null)).a().Td(vbsVar.a, null);
                } else if (kyhVar instanceof kyh.g) {
                    kyh.g gVar = (kyh.g) kyhVar;
                    CreateCommunityReviewSuccessResult createCommunityReviewSuccessResult = gVar.a;
                    new uig0(new ReviewsModalBottomSheetArguments(R.drawable.vk_icon_check_circle_outline_56, createCommunityReviewSuccessResult.b, createCommunityReviewSuccessResult.c, gVar.b, valueOf, null, false, 96, null), new qyh(1, ryhVar, ryh.class, "handleInformativeReviewsBottomSheetActions", "handleInformativeReviewsBottomSheetActions(Lcom/vk/ecomm/reviews/api/model/ReviewsModalBottomSheetAction;)V", 0)).a(context3);
                } else if (kyhVar instanceof kyh.b) {
                    kyh.b bVar4 = (kyh.b) kyhVar;
                    new uig0(new ReviewsModalBottomSheetArguments(R.drawable.vk_icon_error_outline_56, bVar4.a, bVar4.b, null, valueOf, null, false, 104, null), new oyh(1, ryhVar, ryh.class, "handleInformativeReviewsBottomSheetActions", "handleInformativeReviewsBottomSheetActions(Lcom/vk/ecomm/reviews/api/model/ReviewsModalBottomSheetAction;)V", 0)).a(context3);
                } else if (kyhVar instanceof kyh.e) {
                    new uig0(new ReviewsModalBottomSheetArguments(R.drawable.vk_icon_check_circle_outline_56, context3.getString(R.string.community_reviews_confirm_dialog_title), context3.getString(R.string.community_reviews_confirm_dialog_description), null, Integer.valueOf(R.string.community_reviews_dialog_cancel_button), Integer.valueOf(R.string.community_reviews_dialog_close_button), false, 72, null), new jnb(1, ryhVar, ryh.class, "handleConfirmExitReviewsBottomSheetActions", "handleConfirmExitReviewsBottomSheetActions(Lcom/vk/ecomm/reviews/api/model/ReviewsModalBottomSheetAction;)V", 0, 5)).a(context3);
                } else if (kyhVar instanceof kyh.f) {
                    kyh.f fVar = (kyh.f) kyhVar;
                    CharSequence a4 = tlo0.b.a(fVar.a, context3);
                    String obj3 = a4 != null ? a4.toString() : null;
                    tlo0 tlo0Var = fVar.b;
                    if (tlo0Var != null && (a = tlo0Var.a(context3)) != null) {
                        str = a.toString();
                    }
                    new uig0(new ReviewsModalBottomSheetArguments(R.drawable.vk_icon_error_outline_56, obj3, str, null, null, Integer.valueOf(R.string.community_reviews_back_to_review), true, 8, null), new pyh(1, ryhVar, ryh.class, "handleInformativeReviewsBottomSheetActions", "handleInformativeReviewsBottomSheetActions(Lcom/vk/ecomm/reviews/api/model/ReviewsModalBottomSheetAction;)V", 0)).a(context3);
                } else if (kyhVar instanceof kyh.j) {
                    maz e = qdzVar.e();
                    Context context4 = ryhVar.a;
                    ((kyh.j) kyhVar).getClass();
                    maz.c(e, context4, null, LaunchContext.A, null, null, 24);
                } else if (kyhVar instanceof kyh.h) {
                    kyh.h hVar = (kyh.h) kyhVar;
                    ListBuilder listBuilder = hVar.c;
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it3 = listBuilder.iterator();
                    while (true) {
                        ListBuilder.a aVar5 = (ListBuilder.a) it3;
                        if (aVar5.hasNext()) {
                            t10 a5 = cig0.a((ReplyAction) aVar5.next());
                            if (a5 != null) {
                                arrayList3.add(a5);
                            }
                        } else if (!arrayList3.isEmpty()) {
                            new v70(arrayList3, new s53(i2, ryhVar, hVar), null).a(context3);
                        }
                    }
                } else if (kyhVar instanceof kyh.d) {
                    new c.a(context3, ((kyh.d) kyhVar).a).H0(vbsVar.a, null);
                } else {
                    if (!(kyhVar instanceof kyh.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kyh.a aVar6 = (kyh.a) kyhVar;
                    mla0 mla0Var = ryhVar.f;
                    i5f i5fVar = ryhVar.h;
                    if (aVar6 instanceof kyh.a.l) {
                        new tma0.a(context3, ((kyh.a.l) aVar6).a).H0(vbsVar.a, null);
                    } else if (aVar6 instanceof kyh.a.C3215a) {
                        kyh.a.C3215a c3215a = (kyh.a.C3215a) aVar6;
                        mla0Var.t(c3215a.g, c3215a.a, String.valueOf(c3215a.b));
                        ryhVar.g = new jyh(ryhVar.a, c3215a.c, c3215a.d, c3215a.e, (SpannableStringBuilder) qdzVar.a().d(c3215a.f, new LinksParserData(16384, (Bundle) null, 0, 0, (String) null, (String) null, 0, 0, (LinksParserData.HashtagService) null, (saz) null, 0, (taz) null, false, 16382)), new c5f(ryhVar, i5), new wcg(ryhVar, i6)).a0(i5fVar).I0("ReviewsModalCardWithBottomText");
                    } else if (aVar6 instanceof kyh.a.g) {
                        kyh.a.g gVar2 = (kyh.a.g) aVar6;
                        int i13 = gVar2.b;
                        mla0Var.s(gVar2.a, String.valueOf(i13));
                        ryhVar.g = new VkModal(VkModal.Mode.Card, new b.a.C0790b(new c5v0.c.b(new gko(R.drawable.vk_icon_question_outline_56), new x7g(R.attr.vk_ui_icon_accent), null, 12), new c5v0.b(i3, tq.h(tlo0.Companion, R.string.pin_review_replace_review_title), new tlo0.f(R.string.pin_review_replace_review_description)), null, new c5v0.a(new c5v0.a.C2643a(new tlo0.f(R.string.pin_review_replace_review_button_text), new q4u(ryhVar, i13, i4), null, null, null, false, IronSourceError.ERROR_CODE_INIT_FAILED), (c5v0.a.C2643a) r8, i5), 52), i5fVar, false, 20).b(context3, "ReplacePinnedReview");
                    } else {
                        int i14 = 5;
                        if (aVar6 instanceof kyh.a.q) {
                            kyh.a.q qVar = (kyh.a.q) aVar6;
                            mla0Var.m(qVar.a);
                            ryhVar.g = new VkModal(VkModal.Mode.Card, new b.a.C0790b(new c5v0.c.b(new gko(R.drawable.vk_icon_pin_outline_56), new x7g(R.attr.vk_ui_icon_accent), null, 12), new c5v0.b(i3, tq.h(tlo0.Companion, R.string.pin_review_suspend_subscription_title), tlo0.a.c(R.string.pin_review_suspend_subscription_description, qVar.b)), null, new c5v0.a(new c5v0.a.C2643a(new tlo0.f(R.string.pin_review_suspend_subscription_first_button_text), new yqf(ryhVar, i14), null, VkButton.Mode.Secondary, null, false, 444), new c5v0.a.C2643a(new tlo0.f(R.string.pin_review_suspend_subscription_second_button_text), new zqf(ryhVar, i5), null, null, null, false, IronSourceError.ERROR_CODE_INIT_FAILED), 4), 52), i5fVar, false, 20).b(context3, "SuspendSubscription");
                        } else if (aVar6 instanceof kyh.a.n) {
                            kyh.a.n nVar = (kyh.a.n) aVar6;
                            ryhVar.g = new VkModal(VkModal.Mode.Card, new b.a.C0790b(new c5v0.c.b(new gko(R.drawable.vk_icon_pin_outline_56), new x7g(R.attr.vk_ui_icon_accent), null, 12), new c5v0.b(i3, oq.d(tlo0.Companion, nVar.a), new tlo0.h(nVar.b)), null, new c5v0.a(new c5v0.a.C2643a(new tlo0.f(R.string.pin_review_to_all_reviews), new fbh(ryhVar, 4), null, null, null, false, IronSourceError.ERROR_CODE_INIT_FAILED), (c5v0.a.C2643a) r8, i5), 52), i5fVar, false, 20).b(context3, "SubscriptionResumed");
                        } else if (aVar6 instanceof kyh.a.p) {
                            kyh.a.p pVar = (kyh.a.p) aVar6;
                            mla0Var.p(pVar.a);
                            ryhVar.g = new VkModal(VkModal.Mode.Card, new b.a.C0790b(new c5v0.c.b(new gko(R.drawable.vk_icon_info_outline_56), new x7g(R.attr.vk_ui_icon_accent), null, 12), new c5v0.b(i3, oq.d(tlo0.Companion, pVar.b), new tlo0.h(pVar.c)), null, new c5v0.a(new c5v0.a.C2643a(new tlo0.f(R.string.pin_review_resume_subscription), new p3h(ryhVar, i6), null, null, null, false, IronSourceError.ERROR_CODE_INIT_FAILED), (c5v0.a.C2643a) r8, i5), 52), i5fVar, false, 20).b(context3, "SubscriptionSuspended");
                        } else {
                            int i15 = 27;
                            if (aVar6 instanceof kyh.a.i) {
                                kyh.a.i iVar2 = (kyh.a.i) aVar6;
                                mla0Var.r(iVar2.a, String.valueOf(iVar2.b));
                                ryhVar.g = new VkModal(VkModal.Mode.Card, new b.a.C0790b(new c5v0.c.b(new gko(R.drawable.vk_icon_pin_outline_56), new x7g(R.attr.vk_ui_icon_accent), null, 12), new c5v0.b(i3, tq.h(tlo0.Companion, R.string.pin_review_pin_success_title), new tlo0.f(R.string.pin_review_pin_success_description)), null, new c5v0.a(new c5v0.a.C2643a(new tlo0.f(R.string.pin_review_to_all_reviews), new com.vk.movika.sdk.android.defaultplayer.interactive.a(ryhVar, i15), null, null, null, false, IronSourceError.ERROR_CODE_INIT_FAILED), (c5v0.a.C2643a) r8, i5), 52), i5fVar, false, 20).b(context3, "ReviewPinSuccess");
                            } else if (aVar6 instanceof kyh.a.h) {
                                kyh.a.h hVar2 = (kyh.a.h) aVar6;
                                final int i16 = hVar2.b;
                                mla0Var.u(hVar2.a, String.valueOf(i16));
                                final boolean z2 = hVar2.c;
                                ryhVar.g = new VkModal(VkModal.Mode.Card, new b.a.C0790b(new c5v0.c.b(new gko(R.drawable.vk_icon_error_outline_56), new x7g(R.attr.vk_ui_icon_secondary), null, 12), new c5v0.b(i3, tq.h(tlo0.Companion, R.string.pin_review_pin_error_title), new tlo0.f(R.string.pin_review_error_description)), null, new c5v0.a(new c5v0.a.C2643a(new tlo0.f(R.string.pin_review_retry_button_text), new gzs() { // from class: xsna.nyh
                                    @Override // xsna.gzs
                                    public final Object invoke() {
                                        ryh ryhVar2 = ryh.this;
                                        ryhVar2.b.c(new dzh.n.g(i16, z2));
                                        dw20 dw20Var2 = ryhVar2.g;
                                        if (dw20Var2 != null) {
                                            dw20Var2.dismiss();
                                        }
                                        return s3q0.a;
                                    }
                                }, null, null, null, false, IronSourceError.ERROR_CODE_INIT_FAILED), (c5v0.a.C2643a) r8, i5), 52), i5fVar, false, 20).b(context3, "ReviewPinError");
                            } else if (epx.f(aVar6, kyh.a.k.a)) {
                                ryhVar.g = new VkModal(VkModal.Mode.Card, new b.a.C0790b(new c5v0.c.b(new gko(R.drawable.vk_icon_pin_outline_56), new x7g(R.attr.vk_ui_icon_accent), null, 12), new c5v0.b(i3, tq.h(tlo0.Companion, R.string.pin_review_unpin_success_title), new tlo0.f(R.string.pin_review_unpin_success_description)), null, new c5v0.a(new c5v0.a.C2643a(new tlo0.f(R.string.pin_review_to_all_reviews), new myh(ryhVar, 0), null, null, null, false, IronSourceError.ERROR_CODE_INIT_FAILED), (c5v0.a.C2643a) r8, i5), 52), i5fVar, false, 20).b(context3, "ReviewUnpinSuccess");
                            } else if (aVar6 instanceof kyh.a.j) {
                                kyh.a.j jVar2 = (kyh.a.j) aVar6;
                                final int i17 = jVar2.b;
                                mla0Var.d(jVar2.a, String.valueOf(i17));
                                ryhVar.g = new VkModal(VkModal.Mode.Card, new b.a.C0790b(new c5v0.c.b(new gko(R.drawable.vk_icon_error_outline_56), new x7g(R.attr.vk_ui_icon_secondary), null, 12), new c5v0.b(i3, tq.h(tlo0.Companion, R.string.pin_review_unpin_error_title), new tlo0.f(R.string.pin_review_error_description)), null, new c5v0.a(new c5v0.a.C2643a(new tlo0.f(R.string.pin_review_retry_button_text), new gzs() { // from class: xsna.lyh
                                    @Override // xsna.gzs
                                    public final Object invoke() {
                                        ryh ryhVar2 = ryh.this;
                                        dw20 dw20Var2 = ryhVar2.g;
                                        if (dw20Var2 != null) {
                                            dw20Var2.dismiss();
                                        }
                                        ryhVar2.b.c(new dzh.n.h(i17));
                                        return s3q0.a;
                                    }
                                }, null, null, null, false, IronSourceError.ERROR_CODE_INIT_FAILED), (c5v0.a.C2643a) r8, i5), 52), i5fVar, false, 20).b(context3, "ReviewUnpinError");
                            } else if (epx.f(aVar6, kyh.a.m.a)) {
                                ryhVar.b(new cnh(ryhVar, 1));
                            } else if (epx.f(aVar6, kyh.a.o.a)) {
                                ryhVar.b(new defpackage.j(ryhVar, 27));
                            } else if (epx.f(aVar6, kyh.a.e.a)) {
                                ryhVar.b(new dne(ryhVar, 10));
                            } else if (epx.f(aVar6, kyh.a.d.a)) {
                                ryhVar.b(new krh(ryhVar, 1));
                            } else if (aVar6 instanceof kyh.a.f) {
                                kyh.a.f fVar2 = (kyh.a.f) aVar6;
                                mla0Var.u(fVar2.a, String.valueOf(fVar2.b));
                                ryhVar.b(new p5(9, ryhVar, aVar6));
                            } else if (epx.f(aVar6, kyh.a.c.a)) {
                                ryhVar.g = new VkModal(VkModal.Mode.Card, new b.a.C0790b(new c5v0.c.b(new gko(R.drawable.vk_icon_pin_outline_56), new x7g(R.attr.vk_ui_icon_accent), null, 12), new c5v0.b(i3, tq.h(tlo0.Companion, R.string.pin_review_payment_success_dialog_title), new tlo0.f(R.string.pin_review_payment_success_dialog_subtitle)), null, new c5v0.a(new c5v0.a.C2643a(new tlo0.f(R.string.pin_review_payment_success_dialog_button), new g5(ryhVar, 29), null, null, null, false, IronSourceError.ERROR_CODE_INIT_FAILED), (c5v0.a.C2643a) r8, i5), 52), i5fVar, false, 20).b(context3, "ReviewPaymentSuccess");
                            } else {
                                if (!epx.f(aVar6, kyh.a.b.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                ryhVar.b(new m2g(ryhVar, 5));
                            }
                        }
                    }
                }
                return s3q0.a;
            case 18:
                u1j u1jVar = (u1j) obj2;
                int i18 = h7u0.p;
                h7u0.a c2 = h7u0.b.c(u1jVar.t.requireContext());
                c2.g0(R.string.voip_session_room_admin_recreate_rooms_title);
                c2.U(R.string.voip_session_room_admin_recreate_rooms_description);
                c2.c0(R.string.voip_session_room_admin_recreate_rooms_confirm, new p1j(u1jVar, i8));
                c2.W(R.string.voip_session_room_admin_recreate_rooms_cancel, null);
                c2.m();
                return s3q0.a;
            case 19:
                ((x2j) obj2).dismiss();
                return s3q0.a;
            case 20:
                paj pajVar = (paj) obj2;
                i8j i8jVar = pajVar.l;
                t8j t8jVar = pajVar.B;
                i8jVar.w(t8jVar != null ? t8jVar : null, false);
                return s3q0.a;
            case 21:
                com.vk.im.ui.components.contacts.c cVar3 = (com.vk.im.ui.components.contacts.c) obj2;
                if (o25.b(cVar3.k)) {
                    cVar3.Y0().d();
                }
                return s3q0.a;
            case 22:
                ((mm50) obj2).b((xij) obj);
                return s3q0.a;
            case 23:
                t6k.h hVar3 = (t6k.h) obj2;
                int i19 = t6k.h.a.$EnumSwitchMapping$0[((AvatarAction) obj).ordinal()];
                if (i19 == 1) {
                    hVar3.l.d();
                } else if (i19 == 2) {
                    hVar3.l.e();
                } else if (i19 == 3) {
                    hVar3.l.b();
                } else {
                    if (i19 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hVar3.o.U0();
                    AvatarView avatarView = hVar3.o;
                    Context context5 = hVar3.itemView.getContext();
                    e3m.a aVar7 = e3m.a;
                    avatarView.T0(null, m33.a(R.drawable.ic_camera_outline_placeholder, context5));
                }
                return s3q0.a;
            case 24:
                p8k p8kVar = (p8k) obj2;
                UploadNotification.b bVar5 = (UploadNotification.b) obj;
                int i20 = bVar5.a;
                int i21 = p8k.a.$EnumSwitchMapping$0[bVar5.b.ordinal()];
                if (i21 == 1) {
                    p8kVar.C(new z7k.f.b(i20));
                } else if (i21 == 2) {
                    Parcelable parcelable = bVar5.e;
                    Photo photo = parcelable instanceof Photo ? (Photo) parcelable : null;
                    p8kVar.C(new z7k.f.a(i20, photo != null ? Integer.valueOf(photo.c) : null));
                } else if (i21 == 3) {
                    p8kVar.C(new z7k.f.g(i20));
                }
                return s3q0.a;
            case 25:
                int intValue = ((rg50) obj2).getIntValue();
                if (intValue < 0) {
                    intValue = 0;
                }
                return new h9x((0 << 32) | (intValue & 4294967295L));
            case 26:
                ((e1l) obj2).d(((Long) obj).longValue());
                return s3q0.a;
            case 27:
                Throwable th = (Throwable) obj;
                xam.y.a(th);
                if (((xam) obj2).u != null) {
                    zk70.e(th);
                }
                return s3q0.a;
            case 28:
                return com.vk.im.engine.models.dialogs.b.a((com.vk.im.engine.models.dialogs.b) obj, null, null, null, 0, 0, 0, 0, 0, 0, false, null, null, (PushSettings) obj2, null, null, false, null, false, null, null, null, false, null, null, null, null, 0, false, false, null, null, 0, null, 0, -16385, 2097151);
            default:
                x960 x960Var = (x960) obj2;
                qn60.c cVar4 = (qn60.c) obj;
                return new j170(cVar4.a, cVar4.b, x960Var.a().c, x960Var.a().b.b, false, false);
        }
    }
}
