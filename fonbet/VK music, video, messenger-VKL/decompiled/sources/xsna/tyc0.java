package xsna;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PreferenceViewHolder.java */
/* loaded from: classes12.dex */
public final class tyc0 extends RecyclerView.e0 {

    @Nullable
    public final Drawable l;
    public final ColorStateList m;
    public final SparseArray<View> n;
    public boolean o;
    public boolean p;

    public tyc0(@NonNull View view) {
        super(view);
        SparseArray<View> sparseArray = new SparseArray<>(4);
        this.n = sparseArray;
        TextView textView = (TextView) view.findViewById(R.id.title);
        sparseArray.put(R.id.title, textView);
        sparseArray.put(R.id.summary, view.findViewById(R.id.summary));
        sparseArray.put(R.id.icon, view.findViewById(R.id.icon));
        sparseArray.put(com.vkontakte.android.R.id.icon_frame, view.findViewById(com.vkontakte.android.R.id.icon_frame));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
        this.l = view.getBackground();
        if (textView != null) {
            this.m = textView.getTextColors();
        }
    }

    public final View V5(int i) {
        SparseArray<View> sparseArray = this.n;
        View view = sparseArray.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = this.itemView.findViewById(i);
        if (findViewById != null) {
            sparseArray.put(i, findViewById);
        }
        return findViewById;
    }
}
