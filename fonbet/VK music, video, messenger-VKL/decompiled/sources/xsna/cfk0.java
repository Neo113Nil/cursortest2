package xsna;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: NavigationTabVh.kt */
/* loaded from: classes16.dex */
public final class cfk0 extends RecyclerView.e0 {
    public static final /* synthetic */ int q = 0;
    public final ViewGroup l;
    public final TextView m;
    public final ImageView n;
    public dfk0 o;
    public bp7 p;

    public cfk0(ViewGroup viewGroup) {
        super(viewGroup);
        this.l = viewGroup;
        this.m = (TextView) viewGroup.findViewById(R.id.title);
        this.n = (ImageView) viewGroup.findViewById(R.id.selected_icon);
        jjc.g(viewGroup, new r6i0(this, 1));
    }
}
