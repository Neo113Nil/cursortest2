package com.google.android.gms.wallet.button;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.cvw;
import defpackage.ooc;
import defpackage.q17;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class ButtonOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ButtonOptions> CREATOR = new zza();
    int zza;
    int zzb;
    int zzc;
    String zzd;
    boolean zze = false;

    public ButtonOptions(int i, int i2, int i3, String str) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        cvw.l(str);
        this.zzd = str;
    }

    public static q17 newBuilder() {
        return new q17(new ButtonOptions());
    }

    public boolean equals(Object obj) {
        if (obj instanceof ButtonOptions) {
            ButtonOptions buttonOptions = (ButtonOptions) obj;
            if (ooc.m(Integer.valueOf(this.zza), Integer.valueOf(buttonOptions.zza)) && ooc.m(Integer.valueOf(this.zzb), Integer.valueOf(buttonOptions.zzb)) && ooc.m(Integer.valueOf(this.zzc), Integer.valueOf(buttonOptions.zzc)) && ooc.m(this.zzd, buttonOptions.zzd)) {
                return true;
            }
        }
        return false;
    }

    public String getAllowedPaymentMethods() {
        return this.zzd;
    }

    public int getButtonTheme() {
        return this.zzb;
    }

    public int getButtonType() {
        return this.zza;
    }

    public int getCornerRadius() {
        return this.zzc;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        int buttonType = getButtonType();
        bb1.m0(1, parcel, 4);
        parcel.writeInt(buttonType);
        int buttonTheme = getButtonTheme();
        bb1.m0(2, parcel, 4);
        parcel.writeInt(buttonTheme);
        int cornerRadius = getCornerRadius();
        bb1.m0(3, parcel, 4);
        parcel.writeInt(cornerRadius);
        bb1.g0(parcel, 4, getAllowedPaymentMethods(), false);
        bb1.o0(parcel, n0);
    }

    private ButtonOptions() {
    }
}
