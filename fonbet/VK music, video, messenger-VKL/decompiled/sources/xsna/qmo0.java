package xsna;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: TextStyleColorPickerAdapter.kt */
/* loaded from: classes16.dex */
public final class qmo0 extends RecyclerView.e0 {
    public final wzs<omo0, Integer, s3q0> l;
    public final View m;
    public final FrameLayout n;
    public final View o;
    public final ImageView p;
    public omo0 q;

    public qmo0(View view, f6 f6Var) {
        super(view);
        this.l = f6Var;
        this.m = this.itemView.findViewById(R.id.preview_dot);
        this.n = (FrameLayout) this.itemView.findViewById(R.id.cv_container);
        this.o = this.itemView.findViewById(R.id.v_selected);
        this.p = (ImageView) this.itemView.findViewById(R.id.pipette);
        this.itemView.setOnClickListener(new asq(this, 6));
    }
}
