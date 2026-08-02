package xsna;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import xsna.qty0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class sxy0 extends FrameLayout implements View.OnClickListener, qty0.a {
    public final huy0 b;
    public final mzy0 c;
    public final fbz0 d;
    public final qty0 e;
    public boolean f;
    public final s8z0 g;
    public z9z0 h;

    public sxy0(mzy0 mzy0Var, fbz0 fbz0Var, qty0 qty0Var, huy0 huy0Var, Context context) {
        super(context);
        this.f = false;
        this.g = new s8z0(new qca0(this, 20));
        this.h = new y9z0();
        this.b = huy0Var;
        this.e = qty0Var;
        this.c = mzy0Var;
        this.d = fbz0Var;
        ujz0 ujz0Var = new ujz0(context);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        qty0Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        rvy0 rvy0Var = new rvy0(context);
        setBackgroundColor(rvy0Var.a.get(rvy0.r));
        addView(qty0Var);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, c1z0.d(112, context)));
        linearLayout.setOrientation(1);
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
        linearLayout.addView(frameLayout);
        addView(linearLayout);
    }

    @Override // xsna.qty0.a
    public final void a(WebView webView) {
        this.b.h.a(webView);
    }

    @Override // xsna.qty0.a
    public final void b() {
        this.b.h.b();
    }

    @Override // xsna.qty0.a
    public final void f(String str) {
        this.b.h.a.j = true;
    }

    @NonNull
    public auy0 getCloseButton() {
        return this.d.getCloseButton();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        wty0 wty0Var;
        fbz0 fbz0Var = this.d;
        auy0 closeButton = fbz0Var.getCloseButton();
        huy0 huy0Var = this.b;
        if (view == closeButton) {
            huy0Var.h.f(huy0Var.c);
            return;
        }
        if (fbz0Var.getAdChoicesButton() != view) {
            if (this.c.getAdsIcon() != view || (wty0Var = huy0Var.c.L) == null) {
                return;
            }
            de.L(wty0Var.b, null, null, null, huy0Var.b.getContext());
            return;
        }
        wty0 wty0Var2 = huy0Var.c.L;
        if (wty0Var2 == null) {
            return;
        }
        Context context = huy0Var.b.getContext();
        kpy0 kpy0Var = huy0Var.g;
        if (kpy0Var == null) {
            de.L(wty0Var2.b, null, null, null, context);
        } else {
            kpy0Var.b();
        }
    }

    public void setHtmlSource(@NonNull nxy0 nxy0Var) {
        qty0 qty0Var = this.e;
        qty0Var.setBannerWebViewListener(this);
        String str = nxy0Var.a0;
        if (str == null) {
            this.b.h.a.j = true;
        } else {
            qty0Var.setData(str);
            qty0Var.setForceMediaPlayback(nxy0Var.c0);
        }
    }

    public void setRemainingAllowCloseDelay(int i) {
        this.d.getProgress().setText(String.valueOf(i));
    }

    public void setShowingChoiceButton(boolean z) {
        this.d.getAdChoicesButton().setVisibility(z ? 0 : 8);
    }

    @Override // xsna.qty0.a
    public final void a(String str) {
        dhz0 akz0Var;
        int i = this.e == this.c.getAgeRestrictionsTextView() ? 128 : 2048;
        if (this.f) {
            akz0Var = new viy0(i, this.h);
        } else {
            akz0Var = new akz0();
        }
        huy0 huy0Var = this.b;
        huy0Var.h.b(huy0Var.c, str, 1, wn4.d(akz0Var), huy0Var.b.getContext());
    }
}
