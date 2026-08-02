package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import xsna.pdz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class ghz0 extends FrameLayout implements bgz0 {
    public final pdz0 b;
    public ViewGroup c;
    public final pdz0.b d;
    public final pdz0 e;
    public final a8z0 f;

    public ghz0(Context context, pdz0 pdz0Var, pdz0.b bVar, pdz0 pdz0Var2) {
        super(context);
        this.b = pdz0Var;
        this.d = bVar;
        this.e = pdz0Var2;
        ujz0 ujz0Var = new ujz0(context);
        a8z0 a8z0Var = new a8z0(context);
        int i = ujz0.e;
        SparseIntArray sparseIntArray = ujz0Var.a;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, sparseIntArray.get(i));
        int i2 = ujz0.k;
        int i3 = sparseIntArray.get(i2);
        layoutParams.setMargins(i3, sparseIntArray.get(i2), i3, sparseIntArray.get(ujz0.g));
        a8z0Var.setLayoutParams(layoutParams);
        this.f = a8z0Var;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup, xsna.t5z0] */
    /* JADX WARN: Type inference failed for: r0v10, types: [android.view.ViewGroup, xsna.t5z0] */
    /* JADX WARN: Type inference failed for: r11v1, types: [android.view.ViewGroup, xsna.t5z0] */
    public final void a(tez0 tez0Var, boolean z, boolean z2) {
        ?? r0 = this.c;
        a8z0 a8z0Var = this.f;
        if (r0 != 0) {
            LinearLayout topBar = r0.getTopBar();
            if (topBar != null) {
                topBar.removeView(a8z0Var);
            }
            removeView(this.c.a());
        }
        mzy0 mzy0Var = new mzy0(getContext());
        fbz0 fbz0Var = new fbz0(getContext());
        fbz0Var.getSkipButton().setOnClickListener(new q01(this, 20));
        if (tez0Var.c0 != null) {
            dvy0 dvy0Var = new dvy0(getContext());
            x4z0 x4z0Var = new x4z0(mzy0Var, fbz0Var, new cez0(kqz0.a(dvy0Var.getContext(), z), dvy0Var, getContext(), this.d), z2 ? null : a8z0Var, this.b, this.d, getContext());
            this.c = x4z0Var;
            x4z0Var.setBanner(tez0Var);
        } else {
            qqy0 qqy0Var = new qqy0(mzy0Var, fbz0Var, new m0z0(getContext()), z2 ? null : a8z0Var, this.b, getContext());
            this.c = qqy0Var;
            qqy0Var.setBanner(tez0Var);
        }
        addView(this.c.a());
    }

    public final void b() {
        rvy0 rvy0Var = new rvy0(getContext());
        setBackgroundColor(rvy0Var.a.get(rvy0.r));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup, xsna.t5z0] */
    @Override // xsna.bgz0
    @Nullable
    public t5z0 getInterstitialView() {
        return this.c;
    }

    @Override // xsna.bgz0
    @NonNull
    public a8z0 getProgressBar() {
        return this.f;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
    }

    @Override // xsna.bgz0
    @NonNull
    public FrameLayout getRootLayout() {
        return this;
    }
}
