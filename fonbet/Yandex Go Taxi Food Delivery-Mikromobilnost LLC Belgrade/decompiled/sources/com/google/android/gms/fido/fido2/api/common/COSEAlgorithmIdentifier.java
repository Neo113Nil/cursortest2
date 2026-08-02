package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cvw;
import defpackage.oyr;
import java.util.Arrays;

/* loaded from: classes11.dex */
public class COSEAlgorithmIdentifier implements Parcelable {
    public static final Parcelable.Creator<COSEAlgorithmIdentifier> CREATOR = new zzp();
    private final a zza;

    public static class UnsupportedAlgorithmIdentifierException extends Exception {
    }

    public COSEAlgorithmIdentifier(a aVar) {
        cvw.l(aVar);
        this.zza = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static COSEAlgorithmIdentifier fromCoseValue(int i) throws UnsupportedAlgorithmIdentifierException {
        RSAAlgorithm rSAAlgorithm;
        if (i == RSAAlgorithm.LEGACY_RS1.a()) {
            rSAAlgorithm = RSAAlgorithm.RS1;
        } else {
            RSAAlgorithm[] values = RSAAlgorithm.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    for (RSAAlgorithm rSAAlgorithm2 : EC2Algorithm.values()) {
                        if (rSAAlgorithm2.a() == i) {
                            rSAAlgorithm = rSAAlgorithm2;
                        }
                    }
                    throw new UnsupportedAlgorithmIdentifierException(oyr.j(i, "Algorithm with COSE value ", " not supported"));
                }
                RSAAlgorithm rSAAlgorithm3 = values[i2];
                if (rSAAlgorithm3.a() == i) {
                    rSAAlgorithm = rSAAlgorithm3;
                    break;
                }
                i2++;
            }
        }
        return new COSEAlgorithmIdentifier(rSAAlgorithm);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof COSEAlgorithmIdentifier) && this.zza.a() == ((COSEAlgorithmIdentifier) obj).zza.a();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    public int toCoseValue() {
        return this.zza.a();
    }

    public final String toString() {
        return oyr.p("COSEAlgorithmIdentifier{algorithm=", String.valueOf(this.zza), "}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zza.a());
    }
}
