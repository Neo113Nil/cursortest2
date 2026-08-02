package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class uyy0 extends n7z0 {
    public final m0z0 p;

    public uyy0(Context context, baz0 baz0Var) {
        super(context, baz0Var);
        Context context2 = getContext();
        m0z0 m0z0Var = new m0z0(context2);
        m0z0Var.setBackground(b(new rvy0(context2)));
        m0z0Var.setClipToOutline(true);
        this.p = m0z0Var;
    }

    @Override // xsna.n7z0
    public final int a(View view) {
        if (view == this.p) {
            return 8;
        }
        return super.a(view);
    }

    @Override // xsna.n7z0
    public final void e(m6z0 m6z0Var) {
        FrameLayout frameLayout = this.h;
        m0z0 m0z0Var = this.p;
        frameLayout.removeView(m0z0Var);
        this.o.c(m6z0Var, this);
        kiw kiwVar = m6z0Var.a.t;
        frameLayout.addView(m0z0Var, 0);
        if (kiwVar == null) {
            return;
        }
        m0z0Var.getImageView().setImageBitmap(kiwVar.a());
        m0z0Var.getImageView().setScaleType(ImageView.ScaleType.CENTER_CROP);
        frameLayout.post(new qe9(8, this, kiwVar));
    }

    @Override // xsna.n7z0
    @SuppressLint({"ClickableViewAccessibility"})
    public void setClickAreaActual(@NonNull k6z0 k6z0Var) {
        super.setClickAreaActual(k6z0Var);
        s8z0 s8z0Var = this.n;
        m0z0 m0z0Var = this.p;
        m0z0Var.setOnTouchListener(s8z0Var);
        if (k6z0Var.m) {
            m0z0Var.setOnClickListener(this);
        } else {
            m0z0Var.setOnClickListener(k6z0Var.d ? this : null);
        }
    }

    @Override // xsna.n7z0
    public void setClickAreaLegacy(@NonNull k6z0 k6z0Var) {
        super.setClickAreaLegacy(k6z0Var);
        boolean z = k6z0Var.m;
        m0z0 m0z0Var = this.p;
        if (z) {
            m0z0Var.setOnClickListener(this);
        } else {
            m0z0Var.setOnClickListener(k6z0Var.d ? this : null);
        }
    }
}
