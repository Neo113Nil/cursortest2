package xsna;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import xsna.exy0;
import xsna.j7z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class ezy0 extends LinearLayout implements j7z0.a, e0z0, View.OnClickListener {
    public WeakReference b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public FrameLayout f;
    public final Button g;
    public final kpy0 h;

    public ezy0(Context context, kpy0 kpy0Var) {
        super(context);
        ujz0 ujz0Var = new ujz0(context);
        rvy0 rvy0Var = new rvy0(context);
        this.h = kpy0Var;
        setOrientation(1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        int i = rvy0.r;
        SparseIntArray sparseIntArray = rvy0Var.a;
        gradientDrawable.setColor(sparseIntArray.get(i));
        int i2 = ujz0.n;
        SparseIntArray sparseIntArray2 = ujz0Var.a;
        float f = sparseIntArray2.get(i2);
        gradientDrawable.setCornerRadii(new float[]{f, f, f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT});
        setBackground(gradientDrawable);
        TextView textView = new TextView(context);
        textView.setTextAlignment(4);
        int i3 = rvy0.s;
        textView.setTextColor(sparseIntArray.get(i3));
        int i4 = ujz0.X;
        textView.setTextSize(sparseIntArray2.get(i4));
        textView.setTypeface(null, 1);
        int i5 = ujz0.k;
        textView.setPadding(sparseIntArray2.get(i5), 0, 0, 0);
        this.c = textView;
        auy0 auy0Var = new auy0(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(sparseIntArray2.get(ujz0.D), sparseIntArray2.get(ujz0.E));
        int i6 = ujz0.g;
        layoutParams.setMarginStart(sparseIntArray2.get(i6));
        auy0Var.setLayoutParams(layoutParams);
        int i7 = sparseIntArray2.get(i5);
        int i8 = sparseIntArray2.get(ujz0.m);
        auy0Var.f = i8;
        auy0Var.i = i8;
        auy0Var.g = i7;
        auy0Var.h = i7;
        int i9 = sparseIntArray2.get(ujz0.w);
        int i10 = rvy0.G;
        auy0Var.a(hpy0.a(context, "M 0.263 0.264 C 0.615 -0.088 1.185 -0.088 1.536 0.264 L 7 5.727 L 12.463 0.264 C 12.815 -0.088 13.385 -0.088 13.736 0.264 C 14.088 0.615 14.088 1.185 13.736 1.536 L 8.272 7 L 13.736 12.464 C 14.088 12.815 14.088 13.385 13.736 13.736 C 13.385 14.088 12.815 14.088 12.463 13.736 L 7 8.273 L 1.536 13.736 C 1.185 14.088 0.615 14.088 0.263 13.736 C -0.088 13.385 -0.088 12.815 0.263 12.464 L 5.727 7 L 0.263 1.536 C -0.088 1.185 -0.088 0.615 0.263 0.264 Z", i9, sparseIntArray.get(i10)), false);
        auy0Var.setOnClickListener(this);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.addView(auy0Var);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 16;
        textView.setLayoutParams(layoutParams2);
        linearLayout.addView(textView);
        addView(linearLayout);
        View view = new View(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, c1z0.d(1, context));
        int i11 = sparseIntArray2.get(ujz0.v);
        int i12 = ujz0.r;
        int i13 = sparseIntArray2.get(i12);
        layoutParams3.setMargins(i13, i11, i13, 0);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, sparseIntArray2.get(ujz0.d));
        int i14 = sparseIntArray2.get(i6);
        int i15 = sparseIntArray2.get(i12);
        layoutParams4.setMargins(i15, i14, i15, 0);
        view.setLayoutParams(layoutParams4);
        view.setBackgroundColor(sparseIntArray.get(rvy0.F));
        addView(view);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(17);
        int i16 = ujz0.y;
        int i17 = sparseIntArray2.get(i16);
        linearLayout2.setPadding(i17, i17, i17, i17);
        ImageView imageView = new ImageView(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        int i18 = sparseIntArray2.get(i16);
        layoutParams5.setMargins(i18, 0, i18, 0);
        layoutParams5.gravity = 1;
        imageView.setLayoutParams(layoutParams5);
        int i19 = ujz0.F;
        imageView.setImageBitmap(hpy0.a(context, "M28 4C41.2548 4 52 14.7452 52 28C52 41.2548 41.2548 52 28 52C14.7452 52 4 41.2548 4 28C4 14.7452 14.7452 4 28 4ZM28 7C16.402 7 7 16.402 7 28C7 39.598 16.402 49 28 49C39.598 49 49 39.598 49 28C49 16.402 39.598 7 28 7ZM36.9393 20.9393C37.5251 20.3536 38.4749 20.3536 39.0607 20.9393C39.6464 21.5251 39.6464 22.4749 39.0607 23.0607L25.0607 37.0607C24.4749 37.6464 23.5251 37.6464 22.9393 37.0607L15.9393 30.0607C15.3536 29.4749 15.3536 28.5251 15.9393 27.9393C16.5251 27.3536 17.4749 27.3536 18.0607 27.9393L24 33.8787L36.9393 20.9393Z", sparseIntArray2.get(i19), -1));
        imageView.setColorFilter(sparseIntArray.get(i10));
        int i20 = sparseIntArray2.get(i19);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(i20, i20));
        linearLayout2.addView(imageView);
        this.d = new TextView(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams6.setMargins(0, sparseIntArray2.get(i2), 0, 0);
        this.d.setTextSize(sparseIntArray2.get(i4));
        this.d.setTypeface(null, 1);
        this.d.setTextColor(sparseIntArray.get(i3));
        this.d.setTextAlignment(4);
        this.d.setLayoutParams(layoutParams6);
        linearLayout2.addView(this.d);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams7.setMargins(0, sparseIntArray2.get(i5), 0, 0);
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(sparseIntArray2.get(ujz0.S));
        this.e.setTextColor(sparseIntArray.get(rvy0.v));
        this.e.setTextAlignment(4);
        this.e.setLayoutParams(layoutParams7);
        linearLayout2.addView(this.e);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams8.weight = 1.0f;
        linearLayout2.setLayoutParams(layoutParams8);
        addView(linearLayout2);
        Button button = new Button(context);
        this.g = button;
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-1, -2);
        int i21 = sparseIntArray2.get(i12);
        int i22 = sparseIntArray2.get(i2);
        layoutParams9.setMargins(i21, i22, i21, i22);
        button.setLayoutParams(layoutParams9);
        button.setTextColor(sparseIntArray.get(rvy0.y));
        button.setBackground(rvy0.b(sparseIntArray2.get(i2), sparseIntArray.get(rvy0.B), sparseIntArray.get(rvy0.A), sparseIntArray.get(rvy0.C)));
        button.setOnClickListener(this);
        addView(button);
    }

    @Override // xsna.e0z0
    public final void a(String str, String str2, String str3, String str4, ArrayList arrayList) {
        if (TextUtils.isEmpty(str)) {
            str = "Жалоба";
        }
        this.c.setText(str);
        TextView textView = this.d;
        if (textView != null) {
            if (TextUtils.isEmpty(str3)) {
                str3 = "Ваша жалоба получена";
            }
            textView.setText(str3);
        }
        TextView textView2 = this.e;
        if (textView2 != null) {
            if (TextUtils.isEmpty(str2)) {
                str2 = "Модераторы рассмотрят её и обязательно примут меры, если найдут нарушения";
            }
            textView2.setText(str2);
        }
        if (TextUtils.isEmpty(str4)) {
            str4 = "Готово";
        }
        this.g.setText(str4);
        try {
            j7z0 j7z0Var = new j7z0(this, getContext());
            this.b = new WeakReference(j7z0Var);
            j7z0Var.show();
        } catch (Throwable th) {
            th.printStackTrace();
            gu8.e(null, "AdChoicesOptionsController: Unable to start adchoices dialog");
            m();
        }
    }

    @Override // xsna.j7z0.a
    public final void c(j7z0 j7z0Var, FrameLayout frameLayout) {
        this.f = frameLayout;
        frameLayout.addView(this, -1, -1);
    }

    @Override // xsna.e0z0
    public final void dismiss() {
        j7z0 j7z0Var;
        WeakReference weakReference = this.b;
        if (weakReference == null || (j7z0Var = (j7z0) weakReference.get()) == null) {
            return;
        }
        j7z0Var.dismiss();
    }

    @Override // xsna.j7z0.a
    public final void m() {
        FrameLayout frameLayout = this.f;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        WeakReference weakReference = this.b;
        if (weakReference != null) {
            weakReference.clear();
            this.b = null;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        dismiss();
        exy0.a aVar = this.h.e;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // xsna.j7z0.a
    public final void b(boolean z) {
    }
}
