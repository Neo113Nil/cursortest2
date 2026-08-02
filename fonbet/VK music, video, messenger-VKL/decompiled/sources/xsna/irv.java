package xsna;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: IconViewHolder.kt */
/* loaded from: classes2.dex */
public final class irv extends RecyclerView.e0 {
    public final View l;
    public final ImageView m;
    public final TextView n;
    public ymy o;

    public irv(View view, ipv ipvVar) {
        super(view);
        this.l = view.findViewById(R.id.icon_selection_background);
        this.m = (ImageView) view.findViewById(R.id.icon_image_view);
        this.n = (TextView) view.findViewById(R.id.icon_title);
        view.setBackgroundResource(R.drawable.ripple);
        jjc.g(view, new h57(12, ipvVar, this));
    }
}
