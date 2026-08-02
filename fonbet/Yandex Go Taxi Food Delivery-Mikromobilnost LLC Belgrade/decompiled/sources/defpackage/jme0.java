package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.x0;

/* loaded from: classes10.dex */
public final class jme0 extends x0 {
    public final Drawable N;
    public final ColorStateList O;
    public final SparseArray P;
    public boolean Q;
    public boolean R;

    public jme0(View view) {
        super(view);
        SparseArray sparseArray = new SparseArray(4);
        this.P = sparseArray;
        TextView textView = (TextView) view.findViewById(R.id.title);
        sparseArray.put(R.id.title, textView);
        sparseArray.put(R.id.summary, view.findViewById(R.id.summary));
        sparseArray.put(R.id.icon, view.findViewById(R.id.icon));
        int i = mbh0.icon_frame;
        sparseArray.put(i, view.findViewById(i));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
        this.N = view.getBackground();
        if (textView != null) {
            this.O = textView.getTextColors();
        }
    }

    public final View W(int i) {
        SparseArray sparseArray = this.P;
        View view = (View) sparseArray.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = this.a.findViewById(i);
        if (findViewById != null) {
            sparseArray.put(i, findViewById);
        }
        return findViewById;
    }
}
