package xsna;

import com.vk.ecomm.reviews.impl.reviewfriends.presentation.model.ReviewFriendsItem;
import com.vk.ecomm.reviews.model.reviewfriends.ReviewFriendsModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* compiled from: ReviewFriendsReducer.kt */
/* loaded from: classes18.dex */
public final class rhg0 implements izs<thg0, wow<ReviewFriendsItem>> {
    @Override // xsna.izs
    public final wow<ReviewFriendsItem> invoke(thg0 thg0Var) {
        ListBuilder e = e43.e();
        List<ReviewFriendsModel> list = thg0Var.c;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (ReviewFriendsModel reviewFriendsModel : list) {
            e.add(new ReviewFriendsItem(reviewFriendsModel.b, reviewFriendsModel.e, reviewFriendsModel.c, reviewFriendsModel.d));
            arrayList.add(Boolean.TRUE);
        }
        return new wow<>(e.g());
    }
}
