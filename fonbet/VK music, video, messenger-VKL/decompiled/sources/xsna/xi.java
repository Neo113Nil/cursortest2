package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.im.ui.themes.AccentColor;
import com.vkontakte.android.R;

/* compiled from: AccentColorViewHolder.kt */
/* loaded from: classes2.dex */
public final class xi extends RecyclerView.e0 {
    public final View l;
    public final View m;
    public AccentColor n;

    public xi(View view, ui uiVar) {
        super(view);
        this.l = view.findViewById(R.id.accent_color_item);
        this.m = view.findViewById(R.id.accent_color_item_selected_stroke);
        view.setBackgroundResource(R.drawable.ripple);
        jjc.g(view, new defpackage.b0(1, uiVar, this));
    }
}
