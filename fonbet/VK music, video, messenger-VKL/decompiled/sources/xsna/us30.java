package xsna;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.imageloader.view.VKImageView;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;

/* compiled from: MsgPartPlaylistVC.kt */
/* loaded from: classes2.dex */
public final class us30 extends zn30 {
    public static final int A = cn70.b(16);
    public TextView v;
    public TextView w;
    public TextView x;
    public VKImageView y;
    public final heb0 z;

    public us30() {
        super(R.layout.vkim_msg_part_playlist_redesign);
        this.z = new heb0();
    }

    @Override // xsna.zn30
    public final void f() {
        ConstraintLayout constraintLayout = this.c;
        if (constraintLayout == null) {
            constraintLayout = null;
        }
        heb0 heb0Var = this.z;
        heb0Var.getClass();
        heb0Var.a = (ThumbsImageView) constraintLayout.findViewById(R.id.lowest_thumb);
        heb0Var.b = (ThumbsImageView) constraintLayout.findViewById(R.id.middle_thumb);
        heb0Var.c = (ThumbsImageView) constraintLayout.findViewById(R.id.highest_thumb);
    }

    @Override // xsna.zn30
    public final void g() {
        ConstraintLayout constraintLayout = this.c;
        if (constraintLayout == null) {
            constraintLayout = null;
        }
        this.v = (TextView) constraintLayout.findViewById(R.id.owner_name);
        ConstraintLayout constraintLayout2 = this.c;
        if (constraintLayout2 == null) {
            constraintLayout2 = null;
        }
        this.y = (VKImageView) constraintLayout2.findViewById(R.id.owner_avatar);
        ConstraintLayout constraintLayout3 = this.c;
        if (constraintLayout3 == null) {
            constraintLayout3 = null;
        }
        this.x = (TextView) constraintLayout3.findViewById(R.id.playlist_info);
        ConstraintLayout constraintLayout4 = this.c;
        TextView textView = (TextView) (constraintLayout4 != null ? constraintLayout4 : null).findViewById(R.id.playlist_name);
        textView.setOnClickListener(new a06(this, 7));
        this.w = textView;
    }
}
