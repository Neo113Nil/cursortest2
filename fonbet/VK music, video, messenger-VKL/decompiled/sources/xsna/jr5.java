package xsna;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.ui.image.VKImageController;
import com.vk.superapp.ui.uniwidgets.dto.UniversalWidget;

/* compiled from: AvatarsAdapter.kt */
/* loaded from: classes6.dex */
public final class jr5 extends RecyclerView.e0 {
    public final j3q0<? extends UniversalWidget> l;
    public final VKImageController<View> m;
    public final View n;

    public jr5(FrameLayout frameLayout, j3q0 j3q0Var) {
        super(frameLayout);
        this.l = j3q0Var;
        ifx0 ifx0Var = e370.c;
        VKImageController<View> create = (ifx0Var == null ? null : ifx0Var).b().create(frameLayout.getContext());
        this.m = create;
        View view = ((com.vk.core.ui.image.c) create).getView();
        this.n = view;
        view.setId(View.generateViewId());
        frameLayout.addView(view);
    }
}
