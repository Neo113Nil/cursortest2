package com.google.android.gms.wallet.button;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.gms.common.a;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import defpackage.aeh0;
import defpackage.cvw;
import defpackage.f2i0;
import defpackage.gan;
import defpackage.jxh0;
import defpackage.kva1;
import defpackage.ny61;
import defpackage.q17;
import defpackage.y2i0;
import defpackage.yuh0;

/* loaded from: classes11.dex */
public final class PayButton extends FrameLayout implements View.OnClickListener {
    private View.OnClickListener zza;
    private q17 zzb;
    private View zzc;

    public PayButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        q17 newBuilder = ButtonOptions.newBuilder();
        this.zzb = newBuilder;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y2i0.PayButtonAttributes);
        int i2 = obtainStyledAttributes.getInt(y2i0.PayButtonAttributes_buttonTheme, 1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(y2i0.PayButtonAttributes_cornerRadius, (int) TypedValue.applyDimension(1, 100.0f, Resources.getSystem().getDisplayMetrics()));
        ButtonOptions buttonOptions = newBuilder.a;
        ButtonOptions buttonOptions2 = newBuilder.a;
        buttonOptions.zzb = i2;
        buttonOptions.zzc = dimensionPixelSize;
        if (obtainStyledAttributes.hasValue(y2i0.PayButtonAttributes_cornerRadius)) {
            buttonOptions2.zze = true;
        }
        obtainStyledAttributes.recycle();
        buttonOptions2.zza = 1;
        if (isInEditMode()) {
            zza(this.zzb.a);
        }
    }

    private final void zza(ButtonOptions buttonOptions) {
        removeAllViews();
        zze zzeVar = new zze(new ContextThemeWrapper(getContext(), buttonOptions.getButtonTheme() == 2 ? f2i0.PayButtonGenericLightTheme : f2i0.PayButtonGenericDarkTheme), null);
        ((LinearLayout) LayoutInflater.from(zzeVar.getContext()).inflate(yuh0.paybutton_generic, (ViewGroup) zzeVar, true).findViewById(aeh0.pay_button_view)).setBackground(kva1.f(buttonOptions.getCornerRadius(), zzeVar.getContext()));
        zzeVar.setContentDescription(zzeVar.getContext().getString(jxh0.gpay_logo_description));
        this.zzc = zzeVar;
        addView(zzeVar);
        this.zzc.setOnClickListener(this);
    }

    public void initialize(ButtonOptions buttonOptions) {
        zzc zzcVar;
        q17 q17Var = this.zzb;
        if (buttonOptions.getButtonType() != 0) {
            q17Var.a.zza = buttonOptions.getButtonType();
        }
        if (buttonOptions.getButtonTheme() != 0) {
            q17Var.a.zzb = buttonOptions.getButtonTheme();
        }
        if (buttonOptions.zze) {
            int cornerRadius = buttonOptions.getCornerRadius();
            ButtonOptions buttonOptions2 = q17Var.a;
            buttonOptions2.zzc = cornerRadius;
            buttonOptions2.zze = true;
        }
        if (buttonOptions.getAllowedPaymentMethods() != null) {
            q17Var.a.zzd = buttonOptions.getAllowedPaymentMethods();
        }
        if (isInEditMode()) {
            zza(this.zzb.a);
            return;
        }
        removeAllViews();
        ButtonOptions buttonOptions3 = this.zzb.a;
        View view = null;
        if (buttonOptions3.zza == 9 && a.d.d(getContext(), 241500000) != 0) {
            removeAllViews();
            zzf zzfVar = new zzf(new ContextThemeWrapper(getContext(), buttonOptions3.getButtonTheme() == 2 ? f2i0.PayButtonGenericLightTheme : f2i0.PayButtonGenericDarkTheme), null);
            ((LinearLayout) LayoutInflater.from(zzfVar.getContext()).inflate(yuh0.pay_button_pix_static, (ViewGroup) zzfVar, true).findViewById(aeh0.pay_button_view)).setBackground(kva1.f(buttonOptions3.getCornerRadius(), zzfVar.getContext()));
            zzfVar.setContentDescription(zzfVar.getContext().getString(jxh0.direct_pix_payment));
            this.zzc = zzfVar;
            addView(zzfVar);
            this.zzc.setOnClickListener(this);
            Log.e("PayButton", "Failed to create latest PIX buttonView: Google Play Services version is outdated.");
            return;
        }
        if (a.d.d(getContext(), 232100000) != 0) {
            zza(buttonOptions3);
            Log.e("PayButton", "Failed to create latest buttonView: Google Play Services version is outdated.");
            return;
        }
        if (TextUtils.isEmpty(buttonOptions3.getAllowedPaymentMethods())) {
            Log.e("PayButton", "Failed to create buttonView: allowedPaymentMethods cannot be empty.");
            return;
        }
        Context context = getContext();
        cvw.l(context);
        try {
            gan c = gan.c(context, gan.b, "com.google.android.gms.wallet_dynamite");
            try {
                IBinder b = c.b("com.google.android.gms.wallet.dynamite.PayButtonCreatorChimeraImpl");
                if (b == null) {
                    zzcVar = null;
                } else {
                    IInterface queryLocalInterface = b.queryLocalInterface("com.google.android.gms.wallet.button.IPayButtonCreator");
                    zzcVar = queryLocalInterface instanceof zzc ? (zzc) queryLocalInterface : new zzc(b);
                }
                if (zzcVar != null) {
                    view = (View) ObjectWrapper.unwrap(zzcVar.zzd(ObjectWrapper.wrap(new Context[]{c.a, context}), buttonOptions3));
                } else {
                    Log.e("PayButtonProxy", "Failed to get the actual PayButtonCreatorChimeraImpl.");
                }
            } catch (RemoteException | DynamiteModule$LoadingException e) {
                Log.e("PayButtonProxy", "Failed to create PayButton using dynamite package", e);
            }
            this.zzc = view;
            if (view == null) {
                Log.e("PayButton", "Failed to create buttonView");
            } else {
                addView(view);
                this.zzc.setOnClickListener(this);
            }
        } catch (DynamiteModule$LoadingException e2) {
            ny61.o(e2);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        View.OnClickListener onClickListener = this.zza;
        if (onClickListener == null || view != this.zzc) {
            return;
        }
        onClickListener.onClick(this);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.zza = onClickListener;
    }

    public PayButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PayButton(Context context) {
        this(context, null);
    }
}
