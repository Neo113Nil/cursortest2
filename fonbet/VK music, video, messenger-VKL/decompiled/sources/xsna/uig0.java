package xsna;

import android.content.Context;
import com.vk.ecomm.reviews.api.model.ReviewsModalBottomSheetArguments;

/* compiled from: ReviewsModalBottomSheetProvider.kt */
/* loaded from: classes18.dex */
public final class uig0 {
    public final ReviewsModalBottomSheetArguments a;
    public final izs<oig0, s3q0> b;
    public dw20 c;

    /* JADX WARN: Multi-variable type inference failed */
    public uig0(ReviewsModalBottomSheetArguments reviewsModalBottomSheetArguments, izs<? super oig0, s3q0> izsVar) {
        this.a = reviewsModalBottomSheetArguments;
        this.b = izsVar;
    }

    public final void a(Context context) {
        this.c = new pig0(context, this.a, new bl30(this, 15)).a0(new fyd0(this, 6)).I0(null);
    }
}
