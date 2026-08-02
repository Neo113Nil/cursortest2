package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.BookingAttachment;

/* compiled from: BookingHolder.kt */
/* loaded from: classes4.dex */
public final class sq7 extends m56<BookingAttachment> implements blc0 {
    public final TextView D;
    public final View E;
    public final ImageView F;
    public boolean G;

    public sq7(ViewGroup viewGroup) {
        super(R.layout.market_booking_holder_v2, viewGroup);
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.booking_attach_icon);
        this.D = (TextView) this.itemView.findViewById(R.id.booking_attach_subtitle);
        View findViewById = this.itemView.findViewById(R.id.booking_attach_mini_app_button);
        this.E = findViewById;
        this.F = (ImageView) this.itemView.findViewById(R.id.booking_attach_remove_button);
        this.itemView.setOnClickListener(new pi6(this, 1));
        findViewById.setOnClickListener(new zh0(this, 1));
        bwt0.d(imageView, iah0.b(6.0f), (r4 & 2) != 0, (r4 & 4) != 0);
    }

    @Override // xsna.blc0
    public final void D1(boolean z) {
        bwt0.p0(this.E, !z);
        bwt0.p0(this.F, z);
    }

    @Override // xsna.m56
    public final void T6(BookingAttachment bookingAttachment) {
        Post R;
        Owner owner;
        String str = bookingAttachment.f;
        if (str == null) {
            NewsEntry q6 = q6();
            str = (q6 == null || (R = di60.R(q6)) == null || (owner = R.Q) == null) ? null : owner.c;
        }
        this.D.setText(str);
    }

    @Override // xsna.blc0
    public final void Z1(x64 x64Var) {
        this.itemView.setOnClickListener(new rq7(0, x64Var, this));
    }

    @Override // xsna.blc0
    public final void j1(View.OnClickListener onClickListener) {
        this.F.setOnClickListener(onClickListener);
    }

    @Override // xsna.blc0
    public final void p5() {
    }
}
