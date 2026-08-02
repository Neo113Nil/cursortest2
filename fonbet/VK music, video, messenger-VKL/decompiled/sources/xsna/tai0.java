package xsna;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.vkontakte.android.R;
import xsna.nai0;

/* compiled from: SelectableViewHolder.kt */
/* loaded from: classes3.dex */
public abstract class tai0<T extends nai0> extends vfz<T> {
    public static final int m = iah0.a(24);
    public static final int n = iah0.a(22);
    public static final int o = iah0.a(-2);
    public final Drawable l;

    public tai0(View view) {
        super(view);
        Drawable a = m33.a(R.drawable.ic_done_in_blue_circle, this.itemView.getContext());
        this.l = a;
        a.setBounds(new Rect(o, 0, n, m));
    }

    @Override // xsna.vfz
    /* renamed from: h6, reason: merged with bridge method [inline-methods] */
    public void W5(T t) {
        if (t.a()) {
            j6();
        } else {
            i6();
        }
    }

    public abstract void i6();

    public abstract void j6();
}
