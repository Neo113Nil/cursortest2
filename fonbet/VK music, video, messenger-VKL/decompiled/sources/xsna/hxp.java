package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: ErrorViewHolder.kt */
/* loaded from: classes6.dex */
public final class hxp extends RecyclerView.e0 {
    public final View l;

    public hxp(View view, com.vk.superapp.miniapps.picker.b bVar) {
        super(view);
        View findViewById = view.findViewById(R.id.retry_button);
        this.l = findViewById;
        bwt0.i0(findViewById, new t3h(bVar, 18));
    }
}
