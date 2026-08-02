package yads;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import xsna.woy0;

/* loaded from: classes10.dex */
public final class f51 extends ll3 {
    public final y31 c;
    public final b51 d;
    public final n23 e;

    public f51(ImageView imageView, y31 y31Var, b51 b51Var, n23 n23Var) {
        super(imageView);
        this.c = y31Var;
        this.d = b51Var;
        this.e = n23Var;
    }

    @Override // yads.ll3
    public final void a(View view) {
        ImageView imageView = (ImageView) view;
        imageView.setImageDrawable(null);
        this.e.a(imageView);
        imageView.setVisibility(8);
        imageView.setOnClickListener(null);
        imageView.setOnTouchListener(null);
        imageView.setSelected(false);
    }

    @Override // yads.ll3
    public final void b(View view, Object obj) {
        a((x41) obj);
    }

    public /* synthetic */ f51(ImageView imageView, nj2 nj2Var, v9 v9Var) {
        this(imageView, new y31(imageView.getContext(), new t42(v9Var), nj2Var), new b51(nj2Var), new n23());
    }

    @Override // yads.ll3
    public final boolean a(View view, Object obj) {
        eq xj0Var;
        x41 x41Var = (x41) obj;
        b51 b51Var = this.d;
        Drawable drawable = ((ImageView) view).getDrawable();
        Bitmap a = b51Var.a.a(x41Var);
        if (a == null) {
            nj2 nj2Var = b51Var.a;
            nj2Var.getClass();
            String str = x41Var.g;
            mj2 mj2Var = str != null ? new mj2(str, new c13(x41Var.a, x41Var.b)) : null;
            a = mj2Var != null ? (Bitmap) nj2Var.c.get(mj2Var) : null;
        }
        if (drawable == null || a == null) {
            return false;
        }
        b51Var.b.getClass();
        if (drawable instanceof BitmapDrawable) {
            xj0Var = new gq();
        } else {
            xj0Var = new xj0(new pt2(), new iq());
        }
        return xj0Var.a(drawable, a);
    }

    public final void a(x41 x41Var) {
        this.c.a(x41Var, new woy0(this, x41Var));
    }

    public static final void a(f51 f51Var, x41 x41Var, Drawable drawable) {
        ImageView imageView;
        if (drawable == null || (imageView = (ImageView) f51Var.b()) == null) {
            return;
        }
        if (x41Var.e != null) {
            f51Var.e.a(drawable, imageView, x41Var);
        } else {
            imageView.setImageDrawable(drawable);
        }
    }
}
