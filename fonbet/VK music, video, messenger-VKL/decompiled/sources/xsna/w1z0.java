package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class w1z0 extends FrameLayout implements View.OnClickListener {
    public final mzy0 b;
    public final LinearLayout c;
    public final fbz0 d;
    public z9z0 e;
    public boolean f;
    public kcz0 g;
    public rvy0 h;
    public kiw i;
    public kiw j;
    public final m0z0 k;
    public int l;
    public final bzy0 m;
    public final s8z0 n;

    public w1z0(mzy0 mzy0Var, fbz0 fbz0Var, m0z0 m0z0Var, bzy0 bzy0Var, Context context) {
        super(context);
        this.e = new y9z0();
        this.f = false;
        this.n = new s8z0(new ao90(this, 14));
        this.k = m0z0Var;
        this.m = bzy0Var;
        this.b = mzy0Var;
        this.d = fbz0Var;
        ujz0 ujz0Var = new ujz0(context);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.h = new rvy0(context);
        this.l = context.getResources().getConfiguration().orientation;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(this.l == 2 ? 0 : 1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.c = linearLayout;
        c1z0.n(linearLayout, HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT);
        addView(linearLayout);
        linearLayout.addView(m0z0Var, 0);
        setBackgroundColor(this.h.a.get(rvy0.r));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, c1z0.d(112, context)));
        linearLayout2.setOrientation(1);
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
        addView(linearLayout2);
    }

    @NonNull
    public auy0 getCloseButton() {
        return this.d.getCloseButton();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        fbz0 fbz0Var = this.d;
        auy0 closeButton = fbz0Var.getCloseButton();
        bzy0 bzy0Var = this.m;
        if (view == closeButton) {
            bzy0Var.d.f(bzy0Var.e);
            return;
        }
        if (fbz0Var.getAdChoicesButton() == view) {
            wty0 wty0Var = bzy0Var.e.L;
            if (wty0Var == null) {
                return;
            }
            Context context = bzy0Var.g.getContext();
            kpy0 kpy0Var = bzy0Var.f;
            if (kpy0Var == null) {
                de.L(wty0Var.b, null, null, null, context);
                return;
            } else {
                kpy0Var.b();
                return;
            }
        }
        mzy0 mzy0Var = this.b;
        if (mzy0Var.getAdsIcon() == view) {
            wty0 wty0Var2 = bzy0Var.e.L;
            if (wty0Var2 != null) {
                de.L(wty0Var2.b, null, null, null, bzy0Var.g.getContext());
                return;
            }
            return;
        }
        kcz0 kcz0Var = this.g;
        int i = 2;
        if (kcz0Var != null && view == kcz0Var.getCtaButton() && this.g.getCtaButton().isEnabled()) {
            bzy0Var.d.b(bzy0Var.e, null, 2, wn4.d(this.f ? new viy0(64, this.e) : new akz0()), bzy0Var.g.getContext());
            return;
        }
        kcz0 kcz0Var2 = this.g;
        if (kcz0Var2 == null || view != kcz0Var2.getCtaButton()) {
            kcz0 kcz0Var3 = this.g;
            if (kcz0Var3 != null && view == kcz0Var3.getTitleTextView()) {
                i = 1;
            } else if (view == mzy0Var.getAgeRestrictionsTextView()) {
                i = 128;
            } else {
                kcz0 kcz0Var4 = this.g;
                if (kcz0Var4 == null || view != kcz0Var4.getDescriptionTextView()) {
                    i = 2048;
                }
            }
        } else {
            i = 64;
        }
        bzy0Var.d.b(bzy0Var.e, null, 1, wn4.d(this.f ? new viy0(i, this.e) : new akz0()), bzy0Var.g.getContext());
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = configuration.orientation;
        this.l = i;
        this.c.setOrientation((i != 2 || ((Activity) getContext()).isInMultiWindowMode()) ? 1 : 0);
        this.m.c();
        rvy0 rvy0Var = new rvy0(getContext());
        this.h = rvy0Var;
        setBackgroundColor(rvy0Var.a.get(rvy0.r));
    }

    public void setDescription(@NonNull String str) {
        if (this.g != null) {
            if (TextUtils.isEmpty(str)) {
                this.g.getDescriptionTextView().setVisibility(8);
            } else {
                this.g.getDescriptionTextView().setText(str);
                this.g.getDescriptionTextView().setVisibility(0);
            }
        }
    }

    public void setIcon(@Nullable kiw kiwVar) {
        if (kiwVar == null || kiwVar.a() == null) {
            return;
        }
        kcz0 kcz0Var = this.g;
        if ((kcz0Var instanceof wbz0) || kcz0Var == null || kcz0Var.getLogoImageView() == null) {
            return;
        }
        this.g.getLogoImageView().setImageBitmap(j6z0.a(kiwVar.a()));
        this.g.getLogoImageView().setVisibility(0);
    }

    public void setRemainingAllowCloseDelay(int i) {
        this.d.getProgress().setText(String.valueOf(i));
    }

    public void setShowingChoiceButton(boolean z) {
        this.d.getAdChoicesButton().setVisibility(z ? 0 : 8);
    }

    public void setTitle(@NonNull String str) {
        if (this.g != null) {
            if (TextUtils.isEmpty(str)) {
                this.g.getTitleTextView().setVisibility(8);
            } else {
                this.g.getTitleTextView().setText(str);
                this.g.getTitleTextView().setVisibility(0);
            }
        }
    }

    public void setTitleAction(@NonNull String str) {
        if (this.g != null) {
            if (TextUtils.isEmpty(str)) {
                this.g.getCtaButton().setVisibility(8);
            } else {
                this.g.getCtaButton().setText(str);
                this.g.getCtaButton().setVisibility(0);
            }
        }
    }
}
