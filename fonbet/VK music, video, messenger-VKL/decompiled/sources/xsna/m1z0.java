package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.util.SparseIntArray;
import android.view.Window;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;
import xsna.j7z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class m1z0 extends FrameLayout implements j7z0.a, e0z0 {
    public final ujz0 b;
    public rvy0 c;
    public WeakReference d;
    public final ListView e;
    public final TextView f;
    public final TextView g;
    public FrameLayout h;
    public final kpy0 i;
    public final LinearLayout j;

    public m1z0(Context context, kpy0 kpy0Var) {
        super(context);
        ujz0 ujz0Var = new ujz0(context);
        this.b = ujz0Var;
        this.c = new rvy0(context);
        this.i = kpy0Var;
        int i = ujz0.m;
        SparseIntArray sparseIntArray = ujz0Var.a;
        int i2 = sparseIntArray.get(i);
        setPadding(i2, i2, i2, i2);
        setBackgroundColor(0);
        LinearLayout linearLayout = new LinearLayout(context);
        this.j = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setBackground(d());
        addView(linearLayout);
        int i3 = ujz0.r;
        int i4 = sparseIntArray.get(i3);
        int i5 = ujz0.k;
        int i6 = sparseIntArray.get(i5);
        linearLayout.setElevation(sparseIntArray.get(ujz0.f));
        linearLayout.setPadding(0, i4, 0, i6);
        TextView b = b(context, true);
        this.f = b;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int i7 = sparseIntArray.get(i3);
        layoutParams.setMargins(i7, 0, i7, 0);
        b.setLayoutParams(layoutParams);
        linearLayout.addView(b);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(i7, sparseIntArray.get(i5), i7, 0);
        TextView b2 = b(context, false);
        this.g = b2;
        b2.setLayoutParams(layoutParams2);
        linearLayout.addView(b2);
        ListView listView = new ListView(context);
        this.e = listView;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(0, sparseIntArray.get(i3), 0, 0);
        listView.setLayoutParams(layoutParams3);
        listView.setDivider(null);
        linearLayout.addView(listView);
    }

    @Override // xsna.e0z0
    public final void a(String str, String str2, String str3, String str4, ArrayList arrayList) {
        this.f.setText(str);
        this.g.setText(str2);
        ajy0 ajy0Var = new ajy0();
        ajy0Var.b = arrayList;
        kpy0 kpy0Var = this.i;
        Objects.requireNonNull(kpy0Var);
        ajy0Var.c = new xw70(kpy0Var, 19);
        this.e.setAdapter((ListAdapter) ajy0Var);
        try {
            j7z0 j7z0Var = new j7z0(this, getContext());
            this.d = new WeakReference(j7z0Var);
            j7z0Var.show();
            Window window = j7z0Var.getWindow();
            if (window != null) {
                window.setLayout(-1, -2);
                window.setGravity(80);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            gu8.e(null, "AdChoicesOptionsController: Unable to start adchoices dialog");
            m();
        }
    }

    @Override // xsna.j7z0.a
    public final void b(boolean z) {
    }

    @Override // xsna.j7z0.a
    public final void c(j7z0 j7z0Var, FrameLayout frameLayout) {
        this.h = frameLayout;
        frameLayout.addView(this, -1, -2);
        TranslateAnimation translateAnimation = new TranslateAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 512.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        translateAnimation.setDuration(300L);
        translateAnimation.setFillAfter(true);
        startAnimation(translateAnimation);
    }

    public final GradientDrawable d() {
        GradientDrawable a = ful0.a(0);
        a.setColor(this.c.a.get(rvy0.r));
        a.setCornerRadius(this.b.a.get(ujz0.n));
        return a;
    }

    @Override // xsna.e0z0
    public final void dismiss() {
        j7z0 j7z0Var;
        WeakReference weakReference = this.d;
        if (weakReference == null || (j7z0Var = (j7z0) weakReference.get()) == null) {
            return;
        }
        j7z0Var.dismiss();
    }

    @Override // xsna.j7z0.a
    public final void m() {
        FrameLayout frameLayout = this.h;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        WeakReference weakReference = this.d;
        if (weakReference != null) {
            weakReference.clear();
            this.d = null;
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.c = new rvy0(getContext());
        this.j.setBackground(d());
        dismiss();
    }

    public final TextView b(Context context, boolean z) {
        TextView textView = new TextView(context);
        rvy0 rvy0Var = this.c;
        textView.setTextColor(rvy0Var.a.get(rvy0.v));
        if (z) {
            textView.setTypeface(null, 1);
            return textView;
        }
        textView.setTypeface(null, 0);
        return textView;
    }
}
