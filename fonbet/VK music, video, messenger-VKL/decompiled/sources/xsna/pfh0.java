package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.superapp.ui.uniwidgets.dto.UniversalWidget;
import com.vkontakte.android.R;

/* compiled from: ScrollItemsAdapter.kt */
/* loaded from: classes6.dex */
public abstract class pfh0<T> extends RecyclerView.e0 {
    public final ViewGroup l;

    public pfh0(ViewGroup viewGroup) {
        super(viewGroup);
        this.l = viewGroup;
        viewGroup.setBackgroundResource(R.drawable.vk_highlight_radius_8);
    }

    public abstract void V5(T t, UniversalWidget universalWidget, j3q0<? extends UniversalWidget> j3q0Var, u7n0 u7n0Var);
}
