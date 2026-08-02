package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.mediastore.system.MediaStoreVideoEntry;
import com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.LocalPlaceholderImageView;
import com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.e;
import com.vkontakte.android.R;

/* compiled from: BottomPanelPostingGalleryViewHolder.kt */
/* loaded from: classes4.dex */
public final class z68 extends vfz<e.b> {
    public final izs<MediaStoreEntry, s3q0> l;
    public final LocalPlaceholderImageView m;
    public final View n;
    public final TextView o;
    public final View p;
    public e.b q;

    public z68(ViewGroup viewGroup, gy gyVar) {
        super(R.layout.item_posting_bottom_panel_gallery, viewGroup);
        this.l = gyVar;
        LocalPlaceholderImageView localPlaceholderImageView = (LocalPlaceholderImageView) this.itemView.findViewById(R.id.icon_gallery);
        localPlaceholderImageView.setPlaceholderImage(R.drawable.bg_holder_attachment_posting);
        this.m = localPlaceholderImageView;
        this.n = this.itemView.findViewById(R.id.done_button);
        this.o = (TextView) this.itemView.findViewById(R.id.video_duration);
        View findViewById = this.itemView.findViewById(R.id.attach_layout);
        bwt0.s0(findViewById, 0.96f);
        this.p = findViewById;
        bwt0.i0(findViewById, new com.vk.im.ui.components.viewcontrollers.dialog_header.info.a(this, 10));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(e.b bVar) {
        String string;
        e.b bVar2 = bVar;
        this.q = bVar2;
        MediaStoreEntry mediaStoreEntry = bVar2.b;
        this.m.W0(mediaStoreEntry);
        bwt0.p0(this.n, bVar2.c);
        boolean z = mediaStoreEntry instanceof MediaStoreVideoEntry;
        TextView textView = this.o;
        if (z) {
            bwt0.p0(textView, true);
            textView.setText(pvo0.b(((MediaStoreVideoEntry) mediaStoreEntry).q / 1000));
        } else {
            bwt0.p0(textView, false);
        }
        boolean z2 = bVar2.c;
        int i = bVar2.d + 1;
        int i2 = bVar2.e;
        if (z) {
            string = this.itemView.getContext().getString(z2 ? R.string.posting_attachments_button_attach_selected_video : R.string.posting_attachments_button_attach_video, new coo(this.itemView.getContext()).c((int) (((MediaStoreVideoEntry) mediaStoreEntry).q / 1000)), Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            string = this.itemView.getContext().getString(z2 ? R.string.posting_attachments_button_attach_selected_photo : R.string.posting_attachments_button_attach_photo, Integer.valueOf(i), Integer.valueOf(i2));
        }
        View view = this.p;
        view.setContentDescription(string);
        boolean z3 = !z2;
        iut0.q(view, new xm(z3, this.itemView.getContext().getString(R.string.posting_attachments_action_add)));
        view.setClickable(z3);
    }
}
