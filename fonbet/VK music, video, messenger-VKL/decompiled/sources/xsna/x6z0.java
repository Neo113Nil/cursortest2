package xsna;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.List;
import xsna.t5z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public abstract class x6z0 extends FrameLayout implements t5z0, View.OnClickListener {
    public final mzy0 b;
    public final LinearLayout c;
    public final fbz0 d;
    public final t5z0.a e;
    public z9z0 f;
    public boolean g;
    public kcz0 h;
    public rvy0 i;
    public final LinearLayout j;
    public int k;
    public k6z0 l;
    public final s8z0 m;

    public x6z0(mzy0 mzy0Var, fbz0 fbz0Var, a8z0 a8z0Var, t5z0.a aVar, Context context) {
        super(context);
        this.f = new y9z0();
        this.g = false;
        this.m = new s8z0(new gs00(this, 25));
        this.e = aVar;
        this.b = mzy0Var;
        this.d = fbz0Var;
        ujz0 ujz0Var = new ujz0(context);
        this.i = new rvy0(context);
        this.k = getContext().getResources().getConfiguration().orientation;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(this.k == 2 ? 0 : 1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.c = linearLayout;
        c1z0.n(linearLayout, HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT);
        addView(linearLayout);
        setBackgroundColor(this.i.a.get(rvy0.r));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, c1z0.d(112, context)));
        linearLayout2.setOrientation(1);
        if (a8z0Var != null) {
            linearLayout2.addView(a8z0Var);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int i = ujz0Var.a.get(ujz0.k);
        layoutParams.setMargins(i, i, i, i);
        layoutParams.gravity = 8388659;
        mzy0Var.setLayoutParams(layoutParams);
        c1z0.n(mzy0Var, "age_restriction_view");
        frameLayout.addView(mzy0Var);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388661;
        fbz0Var.setLayoutParams(layoutParams2);
        fbz0Var.getCloseButton().setOnClickListener(this);
        fbz0Var.getAdChoicesButton().setOnClickListener(this);
        c1z0.n(fbz0Var, "buttons_view");
        frameLayout.addView(fbz0Var);
        linearLayout2.addView(frameLayout);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{1711276032, 1627389952, 1375731712, 335544320, 83886080, 0});
        gradientDrawable.setShape(0);
        gradientDrawable.setGradientType(0);
        linearLayout2.setBackground(gradientDrawable);
        this.j = linearLayout2;
        addView(linearLayout2);
    }

    private void setAdIcon(@Nullable kiw kiwVar) {
        mzy0 mzy0Var = this.b;
        if (kiwVar == null || kiwVar.a() == null) {
            mzy0Var.getAdsIcon().setVisibility(8);
        } else {
            mzy0Var.getAdsIcon().setImageBitmap(kiwVar.a());
            mzy0Var.getAdsIcon().setVisibility(0);
        }
    }

    private void setAgeRestrictions(@NonNull String str) {
        int i = TextUtils.isEmpty(str) ? 8 : 0;
        mzy0 mzy0Var = this.b;
        mzy0Var.setVisibility(i);
        mzy0Var.getAgeRestrictionsTextView().setText(str);
    }

    private void setDescription(@NonNull String str) {
        if (this.h != null) {
            if (TextUtils.isEmpty(str)) {
                this.h.getDescriptionTextView().setVisibility(8);
            } else {
                this.h.getDescriptionTextView().setText(str);
                this.h.getDescriptionTextView().setVisibility(0);
            }
        }
    }

    private void setTitle(@NonNull String str) {
        if (this.h != null) {
            if (TextUtils.isEmpty(str)) {
                this.h.getTitleTextView().setVisibility(8);
            } else {
                this.h.getTitleTextView().setText(str);
                this.h.getTitleTextView().setVisibility(0);
            }
        }
    }

    private void setTitleAction(@NonNull String str) {
        if (this.h != null) {
            if (TextUtils.isEmpty(str)) {
                this.h.getCtaButton().setVisibility(8);
            } else {
                this.h.getCtaButton().setText(str);
                this.h.getCtaButton().setVisibility(0);
            }
        }
    }

    @Override // xsna.t5z0
    public final void b() {
        fbz0 fbz0Var = this.d;
        fbz0Var.getCloseButton().setVisibility(0);
        fbz0Var.getSkipButton().setVisibility(8);
        fbz0Var.getProgressFrame().setVisibility(8);
    }

    @Override // xsna.t5z0
    public final void c() {
        this.d.getProgressFrame().setVisibility(8);
    }

    @Override // xsna.t5z0
    public final void d() {
        fbz0 fbz0Var = this.d;
        fbz0Var.getSkipButton().setVisibility(0);
        fbz0Var.getCloseButton().setVisibility(8);
        fbz0Var.getProgressFrame().setVisibility(8);
    }

    public final void e(View view) {
        t5z0.a aVar = this.e;
        if (aVar == null) {
            return;
        }
        fbz0 fbz0Var = this.d;
        if (view == fbz0Var.getCloseButton()) {
            aVar.e();
            return;
        }
        if (fbz0Var.getAdChoicesButton() == view) {
            aVar.a();
            return;
        }
        if (this.b.getAdsIcon() == view) {
            aVar.d();
            return;
        }
        kcz0 kcz0Var = this.h;
        if (kcz0Var != null && view == kcz0Var.getCtaButton() && this.h.getCtaButton().isEnabled()) {
            aVar.c(2, new akz0());
        } else {
            aVar.c(1, new akz0());
        }
    }

    @Override // xsna.t5z0
    @Nullable
    public LinearLayout getTopBar() {
        return this.j;
    }

    public void onClick(View view) {
        if (this.g) {
            d(view);
        } else {
            e(view);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.i = new rvy0(getContext());
        int i = configuration.orientation;
        this.k = i;
        int i2 = (i != 2 || ((Activity) getContext()).isInMultiWindowMode()) ? 1 : 0;
        LinearLayout linearLayout = this.c;
        linearLayout.setOrientation(i2);
        rvy0 rvy0Var = this.i;
        int i3 = rvy0.r;
        linearLayout.setBackgroundColor(rvy0Var.a.get(i3));
        setBackgroundColor(this.i.a.get(i3));
        this.e.b();
    }

    public void setBanner(@NonNull tez0 tez0Var) {
        this.d.getAdChoicesButton().setVisibility(tez0Var.L == null ? 8 : 0);
        setIcon(tez0Var.u);
        setAdIcon(tez0Var.e0);
        setDomain(tez0Var.p.equals(X3.i.U) ? tez0Var.l : tez0Var.o);
        setTitle(tez0Var.f);
        setDescription(tez0Var.c);
        setTitleAction(tez0Var.n());
        setAgeRestrictions(tez0Var.i());
        boolean z = tez0Var.T.c;
        k6z0 k6z0Var = tez0Var.v;
        this.g = z;
        this.l = k6z0Var;
        if (z) {
            setClickAreaActual(k6z0Var);
        } else {
            setClickAreaLegacy(k6z0Var);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void setClickAreaActual(@NonNull k6z0 k6z0Var) {
        LinearLayout linearLayout = this.c;
        s8z0 s8z0Var = this.m;
        linearLayout.setOnTouchListener(s8z0Var);
        mzy0 mzy0Var = this.b;
        mzy0Var.setOnTouchListener(s8z0Var);
        kcz0 kcz0Var = this.h;
        if (kcz0Var != null) {
            kcz0Var.getTitleTextView().setOnTouchListener(s8z0Var);
            this.h.getDescriptionTextView().setOnTouchListener(s8z0Var);
            this.h.getCtaButton().setOnTouchListener(s8z0Var);
            mzy0Var.getAdsIcon().setOnTouchListener(s8z0Var);
            if (this.h.getDomainTextView() != null && this.h.getLogoImageView() != null) {
                this.h.getLogoImageView().setOnTouchListener(s8z0Var);
                this.h.getDomainTextView().setOnTouchListener(s8z0Var);
            }
        }
        boolean z = k6z0Var.m;
        boolean z2 = k6z0Var.j;
        boolean z3 = k6z0Var.g;
        if (z) {
            linearLayout.setOnClickListener(this);
            mzy0Var.setOnClickListener(this);
            mzy0Var.getAdsIcon().setOnClickListener(this);
            kcz0 kcz0Var2 = this.h;
            if (kcz0Var2 != null) {
                kcz0Var2.getTitleTextView().setOnClickListener(this);
                this.h.getDescriptionTextView().setOnClickListener(this);
                this.h.getCtaButton().setOnClickListener(this);
                if (this.h.getDomainTextView() == null || this.h.getLogoImageView() == null) {
                    return;
                }
                this.h.getLogoImageView().setOnClickListener(this);
                this.h.getDomainTextView().setOnClickListener(this);
                return;
            }
            return;
        }
        linearLayout.setOnClickListener(k6z0Var.l ? this : null);
        mzy0Var.setOnClickListener((k6z0Var.h || k6z0Var.i) ? this : null);
        mzy0Var.getAdsIcon().setOnClickListener(k6z0Var.c ? this : null);
        kcz0 kcz0Var3 = this.h;
        if (kcz0Var3 != null) {
            kcz0Var3.getCtaButton().setOnClickListener(z3 ? this : null);
            this.h.getCtaButton().setEnabled(z3);
            this.h.getTitleTextView().setOnClickListener(k6z0Var.a ? this : null);
            this.h.getDescriptionTextView().setOnClickListener(k6z0Var.b ? this : null);
            if (this.h.getDomainTextView() == null || this.h.getLogoImageView() == null) {
                return;
            }
            this.h.getLogoImageView().setOnClickListener(z2 ? this : null);
            this.h.getDomainTextView().setOnClickListener(z2 ? this : null);
        }
    }

    public void setClickAreaLegacy(@NonNull k6z0 k6z0Var) {
        boolean z = k6z0Var.m;
        boolean z2 = k6z0Var.j;
        boolean z3 = k6z0Var.g;
        if (z) {
            setOnClickListener(this);
            kcz0 kcz0Var = this.h;
            if (kcz0Var != null) {
                kcz0Var.getCtaButton().setOnClickListener(this);
                return;
            }
            return;
        }
        this.c.setOnClickListener(k6z0Var.l ? this : null);
        x6z0 x6z0Var = (k6z0Var.h || k6z0Var.i) ? this : null;
        mzy0 mzy0Var = this.b;
        mzy0Var.setOnClickListener(x6z0Var);
        mzy0Var.getAdsIcon().setOnClickListener(k6z0Var.c ? this : null);
        kcz0 kcz0Var2 = this.h;
        if (kcz0Var2 != null) {
            kcz0Var2.getCtaButton().setOnClickListener(z3 ? this : null);
            this.h.getCtaButton().setEnabled(z3);
            this.h.getTitleTextView().setOnClickListener(k6z0Var.a ? this : null);
            this.h.getDescriptionTextView().setOnClickListener(k6z0Var.b ? this : null);
            if (this.h.getDomainTextView() == null || this.h.getLogoImageView() == null) {
                return;
            }
            this.h.getLogoImageView().setOnClickListener(z2 ? this : null);
            this.h.getDomainTextView().setOnClickListener(z2 ? this : null);
        }
    }

    public void setDomain(@NonNull String str) {
        kcz0 kcz0Var = this.h;
        if ((kcz0Var instanceof wbz0) || kcz0Var == null || kcz0Var.getDomainTextView() == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.h.getDomainTextView().setVisibility(8);
        } else {
            this.h.getDomainTextView().setText(str);
            this.h.getDomainTextView().setVisibility(0);
        }
    }

    public abstract /* synthetic */ void setDoubleBanners(@NonNull List list);

    public void setIcon(@Nullable kiw kiwVar) {
        if (kiwVar == null || kiwVar.a() == null) {
            return;
        }
        kcz0 kcz0Var = this.h;
        if ((kcz0Var instanceof wbz0) || kcz0Var == null || kcz0Var.getLogoImageView() == null) {
            return;
        }
        this.h.getLogoImageView().setImageBitmap(j6z0.a(kiwVar.a()));
        this.h.getLogoImageView().setVisibility(0);
    }

    @Override // xsna.t5z0
    public void setRemainingAllowCloseDelay(int i) {
        this.d.getProgress().setText(String.valueOf(i));
    }

    public final LinearLayout.LayoutParams c(int i, int i2) {
        kcz0 kcz0Var;
        LinearLayout.LayoutParams layoutParams;
        Point l = c1z0.l(getContext());
        int i3 = l.x;
        int i4 = l.y;
        double d = i / i2;
        if (d == 1.0d) {
            if (i3 >= i4) {
                i3 = (int) (i4 / d);
            }
            i4 = (int) (i3 / d);
        } else if (this.k == 2) {
            float d2 = c1z0.d(282, getContext());
            if (d > 1.0d) {
                float f = (i3 / 3.0f) * 2.0f;
                i3 = (int) (i4 * d);
                float f2 = i3;
                if (f2 < d2) {
                    i3 = (int) d2;
                } else if (f2 > f) {
                    i3 = (int) f;
                }
                i4 = (int) (i3 / d);
            } else {
                i3 = (int) (i4 * d);
                if (i3 < d2) {
                    i3 = (int) d2;
                }
            }
        } else {
            if (i2 > c1z0.d(698, getContext())) {
                float f3 = (i4 * 85.0f) / 100.0f;
                i4 = (int) f3;
                i3 = (int) (f3 * (i / f3));
            }
            i4 = (int) (i3 / d);
        }
        kcz0 kcz0Var2 = this.h;
        LinearLayout linearLayout = this.c;
        if (kcz0Var2 != null) {
            linearLayout.removeView(kcz0Var2);
        }
        Point q = c1z0.q(getContext());
        int i5 = q.x;
        int i6 = q.y;
        if (i5 <= 0 || i6 <= 0) {
            kcz0Var = null;
        } else {
            int i7 = getContext().getResources().getConfiguration().orientation;
            if (((Activity) getContext()).isInMultiWindowMode()) {
                kcz0Var = new wbz0(getContext());
            } else if (i7 == 2) {
                kcz0Var = i3 < (i5 / 3) * 2 ? new f4z0(getContext()) : new zrz0(getContext());
            } else {
                int i8 = i6 / 2;
                kcz0Var = (i4 <= i8 || i4 >= (i6 / 4) * 3 || d <= 0.699999988079071d) ? i4 < i8 ? new f4z0(getContext()) : new wbz0(getContext()) : new f4z0(getContext());
            }
        }
        this.h = kcz0Var;
        if (kcz0Var != null) {
            if (((Activity) getContext()).isInMultiWindowMode()) {
                layoutParams = new LinearLayout.LayoutParams(-1, -2);
            } else if (this.k == 2) {
                if (this.h instanceof zrz0) {
                    layoutParams = new LinearLayout.LayoutParams(-1, -1);
                } else {
                    layoutParams = new LinearLayout.LayoutParams(-2, -1);
                    layoutParams.weight = 1.0f;
                }
            } else if (this.h instanceof wbz0) {
                layoutParams = d > 0.699999988079071d ? new LinearLayout.LayoutParams(-1, -1) : new LinearLayout.LayoutParams(-1, -2);
            } else {
                layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.weight = 1.0f;
            }
            kcz0Var.setLayoutParams(layoutParams);
            linearLayout.addView(this.h);
        }
        if (((Activity) getContext()).isInMultiWindowMode()) {
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 0);
            layoutParams2.weight = 1.0f;
            return layoutParams2;
        }
        if (this.k == 2) {
            return new LinearLayout.LayoutParams(i3, -1);
        }
        if (d > 0.699999988079071d) {
            return new LinearLayout.LayoutParams(-1, i4);
        }
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams3.weight = 1.0f;
        return layoutParams3;
    }

    @Override // xsna.t5z0
    @NonNull
    public auy0 getCloseButton() {
        return this.d.getCloseButton();
    }

    public int b(View view) {
        kcz0 kcz0Var = this.h;
        if (kcz0Var != null && view == kcz0Var.getCtaButton()) {
            return 64;
        }
        kcz0 kcz0Var2 = this.h;
        if (kcz0Var2 != null && view == kcz0Var2.getTitleTextView()) {
            return 1;
        }
        if (view == this.b.getAgeRestrictionsTextView()) {
            return 128;
        }
        kcz0 kcz0Var3 = this.h;
        return (kcz0Var3 == null || view != kcz0Var3.getDescriptionTextView()) ? 2048 : 2;
    }

    public final void d(View view) {
        t5z0.a aVar = this.e;
        if (aVar == null) {
            return;
        }
        fbz0 fbz0Var = this.d;
        if (view == fbz0Var.getCloseButton()) {
            aVar.e();
            return;
        }
        if (this.b.getAdsIcon() == view) {
            aVar.d();
            return;
        }
        if (fbz0Var.getAdChoicesButton() == view) {
            aVar.a();
            return;
        }
        kcz0 kcz0Var = this.h;
        if (kcz0Var != null && view == kcz0Var.getCtaButton() && this.h.getCtaButton().isEnabled()) {
            aVar.c(2, new viy0(64, this.f));
        } else {
            aVar.c(1, new viy0(b(view), this.f));
        }
    }
}
