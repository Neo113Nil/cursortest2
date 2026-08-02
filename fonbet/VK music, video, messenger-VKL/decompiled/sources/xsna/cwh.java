package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.api.communites.ReviewsDialogType;
import com.vk.ecomm.reviews.api.model.ReviewsModalBottomSheetArguments;
import com.vk.ecomm.reviews.api.model.communityreviews.CreateCommunityReviewArgs;
import com.vk.ecomm.reviews.api.model.communityreviews.CreateCommunityReviewErrorResult;
import com.vk.ecomm.reviews.api.model.communityreviews.CreateCommunityReviewResult;
import com.vk.ecomm.reviews.api.model.communityreviews.CreateCommunityReviewSuccessResult;
import com.vk.ecomm.reviews.api.model.communityreviews.ReviewSavedData;
import com.vk.ecomm.reviews.api.model.createreview.CreateCommunityReviewData;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;

/* compiled from: CommunityRatingDialogsDelegate.kt */
/* loaded from: classes5.dex */
public final class cwh {
    public final FragmentImpl a;
    public final ajg0 b;
    public final gzs<s3q0> c;
    public final gyh d;
    public final UserId e;
    public final maz f;
    public ExtendedCommunityProfile.d g;
    public CreateCommunityReviewData h;

    /* compiled from: View.kt */
    public static final class a implements Runnable {
        public final /* synthetic */ Bundle c;

        public a(Bundle bundle) {
            this.c = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object obj;
            Object parcelable;
            cwh cwhVar = cwh.this;
            FragmentImpl fragmentImpl = cwhVar.a;
            Integer valueOf = Integer.valueOf(R.string.community_reviews_back_to_review);
            String l = fpf0.a(CreateCommunityReviewResult.class).l();
            if (l == null) {
                l = "";
            }
            int i = Build.VERSION.SDK_INT;
            Bundle bundle = this.c;
            if (i >= 33) {
                parcelable = bundle.getParcelable(l, CreateCommunityReviewResult.class);
                obj = (Parcelable) parcelable;
            } else {
                Object parcelable2 = bundle.getParcelable(l);
                if (!(parcelable2 instanceof CreateCommunityReviewResult)) {
                    parcelable2 = null;
                }
                obj = (CreateCommunityReviewResult) parcelable2;
            }
            CreateCommunityReviewResult createCommunityReviewResult = (CreateCommunityReviewResult) obj;
            Context requireContext = fragmentImpl.requireContext();
            ReviewSavedData reviewSavedData = createCommunityReviewResult != null ? createCommunityReviewResult.d : null;
            cwhVar.h = reviewSavedData instanceof CreateCommunityReviewData ? (CreateCommunityReviewData) reviewSavedData : null;
            if ((createCommunityReviewResult != null ? createCommunityReviewResult.c : null) != null) {
                CreateCommunityReviewSuccessResult createCommunityReviewSuccessResult = createCommunityReviewResult.c;
                cwh.c(cwhVar, new ReviewsModalBottomSheetArguments(R.drawable.vk_icon_check_circle_outline_56, createCommunityReviewSuccessResult != null ? createCommunityReviewSuccessResult.b : null, createCommunityReviewSuccessResult != null ? createCommunityReviewSuccessResult.c : null, createCommunityReviewResult.e, Integer.valueOf(R.string.reviews_alert_dialog_button_text), null, false, 96, null));
                return;
            }
            if ((createCommunityReviewResult != null ? createCommunityReviewResult.b : null) == null) {
                if ((createCommunityReviewResult != null ? createCommunityReviewResult.d : null) != null) {
                    ReviewsModalBottomSheetArguments reviewsModalBottomSheetArguments = new ReviewsModalBottomSheetArguments(R.drawable.vk_icon_check_circle_outline_56, requireContext.getString(R.string.community_reviews_confirm_dialog_title), requireContext.getString(R.string.community_reviews_confirm_dialog_description), null, Integer.valueOf(R.string.community_reviews_dialog_cancel_button), Integer.valueOf(R.string.community_reviews_dialog_close_button), false, 72, null);
                    ReviewsDialogType reviewsDialogType = ReviewsDialogType.CONFIRM;
                    cwhVar.b.d(reviewsModalBottomSheetArguments, fragmentImpl.requireContext(), new xv2(1, cwhVar, cwh.class, "handleConfirmExitBottomSheetAction", "handleConfirmExitBottomSheetAction(Lcom/vk/ecomm/reviews/api/model/ReviewsModalBottomSheetAction;)V", 0, 9));
                    return;
                }
                return;
            }
            CreateCommunityReviewErrorResult createCommunityReviewErrorResult = createCommunityReviewResult.b;
            if ((createCommunityReviewErrorResult != null ? createCommunityReviewErrorResult.b : null) == null) {
                cwh.c(cwhVar, new ReviewsModalBottomSheetArguments(R.drawable.vk_icon_error_outline_56, requireContext.getString(R.string.community_reviews_error_dialog_title), requireContext.getString(R.string.community_reviews_error_dialog_description), null, null, valueOf, true, 24, null));
            } else {
                String str = createCommunityReviewErrorResult != null ? createCommunityReviewErrorResult.b : null;
                cwh.c(cwhVar, new ReviewsModalBottomSheetArguments(R.drawable.vk_icon_error_outline_56, str == null ? "" : str, createCommunityReviewErrorResult != null ? createCommunityReviewErrorResult.c : null, null, null, valueOf, true, 24, null));
            }
        }
    }

    public cwh(FragmentImpl fragmentImpl, ajg0 ajg0Var, gzs<s3q0> gzsVar, gyh gyhVar, UserId userId, maz mazVar) {
        this.a = fragmentImpl;
        this.b = ajg0Var;
        this.c = gzsVar;
        this.d = gyhVar;
        this.e = userId;
        this.f = mazVar;
        fragmentImpl.getChildFragmentManager().l0("create_community_review_result", fragmentImpl, new h8(this, 13));
    }

    public static void c(cwh cwhVar, ReviewsModalBottomSheetArguments reviewsModalBottomSheetArguments) {
        izs<? super oig0, s3q0> q69Var;
        ReviewsDialogType reviewsDialogType = ReviewsDialogType.DEFAULT;
        ajg0 ajg0Var = cwhVar.b;
        Context requireContext = cwhVar.a.requireContext();
        if (reviewsDialogType == ReviewsDialogType.CONFIRM) {
            q69Var = new xv2(1, cwhVar, cwh.class, "handleConfirmExitBottomSheetAction", "handleConfirmExitBottomSheetAction(Lcom/vk/ecomm/reviews/api/model/ReviewsModalBottomSheetAction;)V", 0, 9);
        } else {
            q69Var = new q69(1, cwhVar, cwh.class, "handleInfoBottomSheetAction", "handleInfoBottomSheetAction(Lcom/vk/ecomm/reviews/api/model/ReviewsModalBottomSheetAction;)V", 0, 5);
        }
        ajg0Var.d(reviewsModalBottomSheetArguments, requireContext, q69Var);
    }

    public final void a(String str) {
        ExtendedCommunityProfile.b bVar;
        CreateCommunityReviewData createCommunityReviewData = this.h;
        if ((createCommunityReviewData != null ? createCommunityReviewData.e : null) == null) {
            ExtendedCommunityProfile.d dVar = this.g;
            if ((dVar != null ? dVar.e : null) != null) {
                if (dVar == null || (bVar = dVar.e) == null) {
                    return;
                }
                c(this, new ReviewsModalBottomSheetArguments(R.drawable.vk_icon_error_outline_56, bVar.a, bVar.b, null, Integer.valueOf(R.string.reviews_alert_dialog_button_text), null, false, 104, null));
                return;
            }
        }
        this.b.n(this.a.requireContext(), new CreateCommunityReviewArgs(this.e, createCommunityReviewData, str, null, null, 24, null));
        this.h = null;
    }

    public final void b() {
        long j = this.e.b;
        ExtendedCommunityProfile.d dVar = this.g;
        this.d.b(j, dVar != null ? dVar.a : null, dVar != null ? dVar.b : null);
        a(null);
    }
}
