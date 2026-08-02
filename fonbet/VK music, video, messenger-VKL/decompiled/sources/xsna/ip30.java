package xsna;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import com.vk.music.view.ThumbsImageView;

/* compiled from: MsgPartCompactAudioVC.kt */
/* loaded from: classes2.dex */
public final class ip30 extends go30 {
    public ThumbsImageView d;
    public ImageView e;
    public TextView f;
    public TextView g;
    public ImageView h;
    public TimeAndStatusView i;
    public int l;
    public final bpn0 j = new bpn0(new hp30(this, 0));
    public final bpn0 k = new bpn0(new qbj(this, 29));
    public final bpn0 m = new bpn0(new tvj(this, 27));

    public final void b(boolean z) {
        ImageView imageView = this.e;
        if (imageView == null) {
            imageView = null;
        }
        awt0.v(imageView, z);
        ImageView imageView2 = this.e;
        if (imageView2 == null) {
            imageView2 = null;
        }
        imageView2.setActivated(z);
        ThumbsImageView thumbsImageView = this.d;
        if (thumbsImageView == null) {
            thumbsImageView = null;
        }
        thumbsImageView.setContentDescription(z ? (String) this.j.getValue() : (String) this.k.getValue());
        TextView textView = this.f;
        if (textView == null) {
            textView = null;
        }
        textView.setSelected(z);
        if (z) {
            ThumbsImageView thumbsImageView2 = this.d;
            (thumbsImageView2 != null ? thumbsImageView2 : null).setEmptyPlaceholder(new ColorDrawable(ColorStateList.valueOf(this.l).withAlpha(25).getDefaultColor()));
        } else {
            ThumbsImageView thumbsImageView3 = this.d;
            (thumbsImageView3 != null ? thumbsImageView3 : null).setEmptyPlaceholder((Drawable) this.m.getValue());
        }
    }

    @Override // xsna.hux0
    public final TimeAndStatusView getTimeAndStatusView() {
        TimeAndStatusView timeAndStatusView = this.i;
        if (timeAndStatusView != null) {
            return timeAndStatusView;
        }
        return null;
    }
}
