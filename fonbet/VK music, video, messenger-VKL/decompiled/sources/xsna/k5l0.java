package xsna;

import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: StickerPackHeaderHolder.kt */
/* loaded from: classes15.dex */
public final class k5l0 extends RecyclerView.e0 {
    public final ViewGroup l;
    public final uei0 m;
    public final i7l0 n;
    public final TextView o;
    public final ImageButton p;

    public k5l0(ViewGroup viewGroup, uei0 uei0Var, i7l0 i7l0Var) {
        super(tf3.b(viewGroup, R.layout.story_title_style_holder, viewGroup, false));
        this.l = viewGroup;
        this.m = uei0Var;
        this.n = i7l0Var;
        this.o = (TextView) this.itemView.findViewById(R.id.tv_title);
        this.p = (ImageButton) this.itemView.findViewById(R.id.btn_style_selector);
    }
}
