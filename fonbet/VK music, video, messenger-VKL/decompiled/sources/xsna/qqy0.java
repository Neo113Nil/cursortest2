package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import xsna.t5z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class qqy0 extends x6z0 {
    public final m0z0 n;

    public qqy0(mzy0 mzy0Var, fbz0 fbz0Var, m0z0 m0z0Var, a8z0 a8z0Var, t5z0.a aVar, Context context) {
        super(mzy0Var, fbz0Var, a8z0Var, aVar, context);
        this.n = m0z0Var;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        rvy0 rvy0Var = this.i;
        setBackgroundColor(rvy0Var.a.get(rvy0.r));
        this.c.addView(m0z0Var, 0);
    }

    @Override // xsna.x6z0
    public final int b(View view) {
        if (view == this.n.getImageView()) {
            return 8;
        }
        return super.b(view);
    }

    @Override // xsna.x6z0, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        rvy0 rvy0Var = this.i;
        this.n.setBackgroundColor(rvy0Var.a.get(rvy0.x));
    }

    @Override // xsna.x6z0, xsna.t5z0
    public void setBanner(@NonNull tez0 tez0Var) {
        Bitmap a;
        kiw kiwVar = tez0Var.t;
        if (kiwVar != null && (a = kiwVar.a()) != null) {
            m0z0 m0z0Var = this.n;
            m0z0Var.getImageView().setImageBitmap(a);
            m0z0Var.setLayoutParams(c(a.getWidth(), a.getHeight()));
            m0z0Var.requestLayout();
        }
        super.setBanner(tez0Var);
    }

    @Override // xsna.x6z0
    @SuppressLint({"ClickableViewAccessibility"})
    public void setClickAreaActual(@NonNull k6z0 k6z0Var) {
        super.setClickAreaActual(k6z0Var);
        m0z0 m0z0Var = this.n;
        whz0 imageView = m0z0Var.getImageView();
        s8z0 s8z0Var = this.m;
        imageView.setOnTouchListener(s8z0Var);
        m0z0Var.getLogoImageView().setOnTouchListener(s8z0Var);
        m0z0Var.getDomainTextView().setOnTouchListener(s8z0Var);
        if (k6z0Var.m) {
            m0z0Var.getImageView().setOnClickListener(this);
            m0z0Var.getLogoImageView().setOnClickListener(this);
            m0z0Var.getDomainTextView().setOnClickListener(this);
        } else {
            m0z0Var.getImageView().setOnClickListener(k6z0Var.d ? this : null);
            m0z0Var.getLogoImageView().setOnClickListener(k6z0Var.c ? this : null);
            m0z0Var.getDomainTextView().setOnClickListener(k6z0Var.j ? this : null);
        }
    }

    @Override // xsna.x6z0
    public void setClickAreaLegacy(@NonNull k6z0 k6z0Var) {
        super.setClickAreaLegacy(k6z0Var);
        m0z0 m0z0Var = this.n;
        m0z0Var.getImageView().setOnClickListener(k6z0Var.d ? this : null);
        m0z0Var.getLogoImageView().setOnClickListener(k6z0Var.c ? this : null);
        m0z0Var.getDomainTextView().setOnClickListener(k6z0Var.j ? this : null);
    }

    @Override // xsna.x6z0
    public void setDomain(@NonNull String str) {
        super.setDomain(str);
        kcz0 kcz0Var = this.h;
        boolean z = kcz0Var instanceof wbz0;
        m0z0 m0z0Var = this.n;
        if (z) {
            if (TextUtils.isEmpty(str)) {
                m0z0Var.getDomainTextView().setVisibility(8);
            } else {
                m0z0Var.getDomainTextView().setText(str);
                m0z0Var.getDomainTextView().setVisibility(0);
            }
            m0z0Var.getDomainContainer().setVisibility(0);
            return;
        }
        if (kcz0Var == null || kcz0Var.getDomainTextView() == null || TextUtils.isEmpty(str)) {
            return;
        }
        m0z0Var.getDomainContainer().setVisibility(8);
    }

    @Override // xsna.x6z0
    public void setIcon(@Nullable kiw kiwVar) {
        super.setIcon(kiwVar);
        if (kiwVar == null || kiwVar.a() == null || !(this.h instanceof wbz0)) {
            return;
        }
        this.n.getLogoImageView().setImageBitmap(j6z0.a(kiwVar.a()));
    }

    @Override // xsna.t5z0
    public final View a() {
        return this;
    }

    @Override // xsna.x6z0, xsna.t5z0
    public void setDoubleBanners(@NonNull List<m6z0> list) {
    }
}
