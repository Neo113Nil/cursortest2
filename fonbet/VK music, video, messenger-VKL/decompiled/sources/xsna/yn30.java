package xsna;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;

/* compiled from: MsgPartArtistVC.kt */
/* loaded from: classes2.dex */
public final class yn30 extends zn30 {
    public TextView v;
    public TextView w;
    public ThumbsImageView x;

    @Override // xsna.zn30
    public final void f() {
        ConstraintLayout constraintLayout = this.c;
        if (constraintLayout == null) {
            constraintLayout = null;
        }
        this.v = (TextView) constraintLayout.findViewById(R.id.artist_info);
        ConstraintLayout constraintLayout2 = this.c;
        if (constraintLayout2 == null) {
            constraintLayout2 = null;
        }
        this.e = constraintLayout2.findViewById(R.id.dominant_color);
        ConstraintLayout constraintLayout3 = this.c;
        if (constraintLayout3 == null) {
            constraintLayout3 = null;
        }
        ThumbsImageView thumbsImageView = (ThumbsImageView) constraintLayout3.findViewById(R.id.thumb);
        thumbsImageView.setOnClickListener(new ai0(this, 5));
        this.x = thumbsImageView;
        ConstraintLayout constraintLayout4 = this.c;
        TextView textView = (TextView) (constraintLayout4 != null ? constraintLayout4 : null).findViewById(R.id.artist_name);
        textView.setOnClickListener(new r4(this, 6));
        this.w = textView;
    }
}
