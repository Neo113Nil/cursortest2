package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.view.PhotoStackView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.tlo0;

/* compiled from: CommunityReviewFriendsCountItemViewHolder.kt */
/* loaded from: classes18.dex */
public final class pxh extends vfz<nxh> {
    public final a0i<oxh> l;
    public final int m;
    public final PhotoStackView n;
    public final TextView o;

    public pxh(ViewGroup viewGroup, m3a m3aVar, boolean z, int i) {
        super(e0n.a(R.layout.community_review_friends_count_item, viewGroup, z));
        this.l = m3aVar;
        this.m = 3;
        PhotoStackView photoStackView = (PhotoStackView) this.itemView.findViewById(R.id.friends_reviews);
        this.n = photoStackView;
        this.o = (TextView) this.itemView.findViewById(R.id.count_text_view);
        View view = this.itemView;
        view.setPadding(view.getPaddingStart() + i, this.itemView.getPaddingTop(), this.itemView.getPaddingEnd() + i, this.itemView.getPaddingBottom());
        photoStackView.setMarginBetweenImages(1.0f);
        photoStackView.setReverseStack(true);
        photoStackView.setOverlapOffset(0.85f);
        photoStackView.setDrawBorder(true);
        bwt0.i0(this.itemView, new i50(this, 20));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(nxh nxhVar) {
        nxh nxhVar2 = nxhVar;
        int i = nxhVar2.b;
        e0n.b(this.itemView, nxhVar2.d);
        ArrayList arrayList = nxhVar2.c;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String a = js5.a(b6().getDimensionPixelSize(R.dimen.community_review_friends_count_item_friend_avatar_height), (String) it.next());
            if (a == null) {
                a = "";
            }
            arrayList2.add(a);
        }
        PhotoStackView photoStackView = this.n;
        int i2 = this.m;
        photoStackView.r(i2, arrayList2);
        int i3 = i - i2;
        boolean z = false;
        boolean z2 = i3 > 0;
        photoStackView.z = z2;
        if (z2) {
            photoStackView.m(i3);
        }
        photoStackView.requestLayout();
        photoStackView.invalidate();
        boolean z3 = i3 > 0;
        if (z3 && !photoStackView.z) {
            z = true;
        }
        photoStackView.L = z;
        if (z3) {
            photoStackView.m(i3);
        }
        photoStackView.requestLayout();
        photoStackView.invalidate();
        this.o.setText(tlo0.b.a(tlo0.a.c(R.string.community_reviews_friend_count_title, tlo0.b.a(hq.b(tlo0.Companion, R.plurals.community_reviews_friend_count_plurals, i), this.itemView.getContext()).toString()), this.itemView.getContext()));
    }
}
