package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.divider.CardDivider;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.RideCardCompanionSectionView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.RideCardDriverSimpleSectionView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.RideCardPhotoView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.RideCardPickupCodeView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.cost_breakdown.RideCardCostBreakdownView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.feedback.comment.RideCardCommentItemView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.feedback.question.FeedbackQuestionLayout;
import com.yandex.go.taxi.order.details.v2.ui.view.item.feedback.question.FeedbackQuestionSelectorLayout;
import com.yandex.go.taxi.order.details.v2.ui.view.item.feedback.rating_selector.RideCardCoherentRatingSelectorView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.feedback.rating_selector.RideCardRatingSelectorView;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.h;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Promoblock;
import com.ybsdk.feature.autotopup.internal.presentation.saver.RoundingFragment;
import java.util.Collections;
import kotlin.Pair;
import ru.yandex.taxi.communications.model.CommunicationItem;
import ru.yandex.taxi.design.SliderButtonView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final /* synthetic */ class jdk0 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ jdk0(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        boolean viewBinding$lambda$9$lambda$4;
        switch (this.a) {
            case 0:
                return yw31.a(((ViewGroup) obj).getContext(), CardDivider.Type.TOP, 0);
            case 1:
                ViewGroup viewGroup = (ViewGroup) obj;
                return yw31.a(viewGroup.getContext(), CardDivider.Type.BOTH, viewGroup.getResources().getDimensionPixelSize(mrg0.go_design_card_divider_default_size));
            case 2:
                RideCardCoherentRatingSelectorView rideCardCoherentRatingSelectorView = new RideCardCoherentRatingSelectorView(((ViewGroup) obj).getContext(), null, 0, 6, null);
                rideCardCoherentRatingSelectorView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                rideCardCoherentRatingSelectorView.setOrientation(1);
                rideCardCoherentRatingSelectorView.setGravity(1);
                xw31.B(tje.u(16, rideCardCoherentRatingSelectorView.getContext()), rideCardCoherentRatingSelectorView);
                return rideCardCoherentRatingSelectorView;
            case 3:
                RideCardCommentItemView rideCardCommentItemView = new RideCardCommentItemView(((ViewGroup) obj).getContext());
                rideCardCommentItemView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                rideCardCommentItemView.setOrientation(1);
                return rideCardCommentItemView;
            case 4:
                int i = h.V;
                Context context = ((ViewGroup) obj).getContext();
                RecyclerView recyclerView = new RecyclerView(context);
                RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -2);
                layoutParams.setMargins(tje.u(8, recyclerView.getContext()), tje.u(12, recyclerView.getContext()), tje.u(8, recyclerView.getContext()), tje.u(8, recyclerView.getContext()));
                recyclerView.setLayoutParams(layoutParams);
                recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
                recyclerView.setClipChildren(false);
                recyclerView.setClipToPadding(false);
                recyclerView.setItemAnimator(null);
                recyclerView.setNestedScrollingEnabled(false);
                recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return recyclerView;
            case 5:
                GoFrameLayout goFrameLayout = new GoFrameLayout(((ViewGroup) obj).getContext(), null, 0, 0, 14, null);
                goFrameLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
                return goFrameLayout;
            case 6:
                RideCardCompanionSectionView rideCardCompanionSectionView = new RideCardCompanionSectionView(((ViewGroup) obj).getContext(), null, 0, 6, null);
                rideCardCompanionSectionView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                rideCardCompanionSectionView.setPadding(tje.r(mrg0.go_design_s_space, rideCardCompanionSectionView.getContext()), tje.r(wug0.companion_item_vertical_margin, rideCardCompanionSectionView.getContext()), tje.r(mrg0.go_design_s_space, rideCardCompanionSectionView.getContext()), tje.r(wug0.companion_item_vertical_margin, rideCardCompanionSectionView.getContext()));
                rideCardCompanionSectionView.setFocusable(false);
                rideCardCompanionSectionView.setImportantForAccessibility(1);
                return rideCardCompanionSectionView;
            case 7:
                RideCardCostBreakdownView rideCardCostBreakdownView = new RideCardCostBreakdownView(((ViewGroup) obj).getContext(), null, 0, 6, null);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                marginLayoutParams.setMargins(tje.u(36, rideCardCostBreakdownView.getContext()), marginLayoutParams.topMargin, tje.u(36, rideCardCostBreakdownView.getContext()), marginLayoutParams.bottomMargin);
                rideCardCostBreakdownView.setLayoutParams(marginLayoutParams);
                rideCardCostBreakdownView.setOrientation(1);
                rideCardCostBreakdownView.setFocusable(false);
                rideCardCostBreakdownView.setImportantForAccessibility(1);
                return rideCardCostBreakdownView;
            case 8:
                RideCardDriverSimpleSectionView rideCardDriverSimpleSectionView = new RideCardDriverSimpleSectionView(((ViewGroup) obj).getContext());
                rideCardDriverSimpleSectionView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                rideCardDriverSimpleSectionView.setFocusable(false);
                rideCardDriverSimpleSectionView.setImportantForAccessibility(1);
                return rideCardDriverSimpleSectionView;
            case 9:
                ComposeView composeView = new ComposeView(((ViewGroup) obj).getContext(), null, 0, 6, null);
                composeView.setViewCompositionStrategy(s.a);
                return composeView;
            case 10:
                FeedbackQuestionSelectorLayout feedbackQuestionSelectorLayout = new FeedbackQuestionSelectorLayout(((ViewGroup) obj).getContext(), null, 0, 0, 14, null);
                feedbackQuestionSelectorLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return feedbackQuestionSelectorLayout;
            case 11:
                FeedbackQuestionLayout feedbackQuestionLayout = new FeedbackQuestionLayout(((ViewGroup) obj).getContext(), null, 0, 0, 14, null);
                feedbackQuestionLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return feedbackQuestionLayout;
            case 12:
                return new ComposeView(((ViewGroup) obj).getContext(), null, 0, 6, null);
            case 13:
                ViewGroup viewGroup2 = (ViewGroup) obj;
                View inflate = LayoutInflater.from(viewGroup2.getContext()).inflate(zkh0.ride_card_group_title, viewGroup2, false);
                if (inflate != null) {
                    return (RobotoTextView) inflate;
                }
                ny61.t("rootView");
                return null;
            case 14:
                zjk0 zjk0Var = (zjk0) obj;
                return zjk0Var instanceof vdk0 ? ((vdk0) zjk0Var).c : Collections.singletonList(zjk0Var);
            case 15:
                return yw31.b(16, ((ViewGroup) obj).getContext());
            case 16:
                return yw31.b(56, ((ViewGroup) obj).getContext());
            case 17:
                return ((TaxiOrder) obj).h.getB();
            case 18:
                RideCardPhotoView rideCardPhotoView = new RideCardPhotoView(((ViewGroup) obj).getContext());
                rideCardPhotoView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return rideCardPhotoView;
            case 19:
                RideCardPickupCodeView rideCardPickupCodeView = new RideCardPickupCodeView(((ViewGroup) obj).getContext(), null, 0, 0, 14, null);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams2.setMargins(tje.u(16, rideCardPickupCodeView.getContext()), ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin, tje.u(16, rideCardPickupCodeView.getContext()), ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
                rideCardPickupCodeView.setLayoutParams(layoutParams2);
                return rideCardPickupCodeView;
            case 20:
                RideCardItemDto$Promoblock rideCardItemDto$Promoblock = (RideCardItemDto$Promoblock) obj;
                String str = rideCardItemDto$Promoblock.a;
                String str2 = rideCardItemDto$Promoblock.b;
                CommunicationItem communicationItem = rideCardItemDto$Promoblock.c;
                String str3 = communicationItem != null ? communicationItem.a : null;
                if (str3 == null || str3.length() == 0) {
                    return null;
                }
                return new Pair(str3, new dmk0(str, str2, communicationItem));
            case 21:
                RideCardRatingSelectorView rideCardRatingSelectorView = new RideCardRatingSelectorView(((ViewGroup) obj).getContext(), null, 0, 6, null);
                rideCardRatingSelectorView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return rideCardRatingSelectorView;
            case 22:
                SliderButtonView sliderButtonView = new SliderButtonView(((ViewGroup) obj).getContext(), null, 0, 6, null);
                ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
                marginLayoutParams2.setMargins(tje.u(16, sliderButtonView.getContext()), marginLayoutParams2.topMargin, tje.u(16, sliderButtonView.getContext()), marginLayoutParams2.bottomMargin);
                sliderButtonView.setLayoutParams(marginLayoutParams2);
                return sliderButtonView;
            case 23:
                GoView goView = new GoView(((ViewGroup) obj).getContext(), null, 0, 0, 14, null);
                goView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                goView.setBackgroundColor(goView.getContext().getColor(xqg0.transparent));
                goView.setFocusable(false);
                goView.setImportantForAccessibility(4);
                return goView;
            case 24:
                CardDivider cardDivider = new CardDivider(((ViewGroup) obj).getContext(), null, 0, 6, null);
                cardDivider.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                return cardDivider;
            case 25:
                return new rxk0((CardDivider) obj);
            case 26:
                return Boolean.valueOf(jl40.l(((uxk0) obj).e, "RequiredAltChoiceSection"));
            case 27:
                ((m2k0) obj).g(false);
                return zy11.a;
            case 28:
                viewBinding$lambda$9$lambda$4 = RoundingFragment.getViewBinding$lambda$9$lambda$4(((Integer) obj).intValue());
                return Boolean.valueOf(viewBinding$lambda$9$lambda$4);
            default:
                ((c1l0) obj).n1();
                return zy11.a;
        }
    }
}
