package xsna;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes.dex */
public final class dl01 implements Parcelable.Creator {
    public static void a(GetServiceRequest getServiceRequest, Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        int i2 = getServiceRequest.b;
        ozg0.v(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = getServiceRequest.c;
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = getServiceRequest.d;
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(i4);
        ozg0.q(parcel, 4, getServiceRequest.e, false);
        ozg0.h(parcel, 5, getServiceRequest.f);
        ozg0.t(parcel, 6, getServiceRequest.g, i);
        ozg0.d(parcel, 7, getServiceRequest.h, false);
        ozg0.p(parcel, 8, getServiceRequest.i, i, false);
        ozg0.t(parcel, 10, getServiceRequest.j, i);
        ozg0.t(parcel, 11, getServiceRequest.k, i);
        boolean z = getServiceRequest.l;
        ozg0.v(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = getServiceRequest.m;
        ozg0.v(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = getServiceRequest.n;
        ozg0.v(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        ozg0.q(parcel, 15, getServiceRequest.o, false);
        ozg0.x(w, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        Bundle bundle = new Bundle();
        Scope[] scopeArr = GetServiceRequest.p;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        boolean z2 = false;
        Feature[] featureArr = GetServiceRequest.q;
        Feature[] featureArr2 = featureArr;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = SafeParcelReader.w(parcel, readInt);
                    break;
                case 2:
                    i2 = SafeParcelReader.w(parcel, readInt);
                    break;
                case 3:
                    i3 = SafeParcelReader.w(parcel, readInt);
                    break;
                case 4:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 5:
                    iBinder = SafeParcelReader.v(parcel, readInt);
                    break;
                case 6:
                    scopeArr = (Scope[]) SafeParcelReader.l(parcel, readInt, Scope.CREATOR);
                    break;
                case 7:
                    bundle = SafeParcelReader.b(parcel, readInt);
                    break;
                case '\b':
                    account = (Account) SafeParcelReader.h(parcel, readInt, Account.CREATOR);
                    break;
                case '\t':
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
                case '\n':
                    featureArr = (Feature[]) SafeParcelReader.l(parcel, readInt, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) SafeParcelReader.l(parcel, readInt, Feature.CREATOR);
                    break;
                case '\f':
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                case '\r':
                    i4 = SafeParcelReader.w(parcel, readInt);
                    break;
                case 14:
                    z2 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 15:
                    str2 = SafeParcelReader.i(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        return new GetServiceRequest(i, i2, i3, str, iBinder, scopeArr, bundle, account, featureArr, featureArr2, z, i4, z2, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetServiceRequest[i];
    }
}
