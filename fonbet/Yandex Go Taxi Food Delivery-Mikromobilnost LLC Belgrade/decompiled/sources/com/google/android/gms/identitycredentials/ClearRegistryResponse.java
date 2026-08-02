package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.g1c;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u0003\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/google/android/gms/identitycredentials/ClearRegistryResponse;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "", "isDeleted", "<init>", "(Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "()Z", "Companion", "g1c", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ClearRegistryResponse extends AbstractSafeParcelable {
    private final boolean isDeleted;
    public static final g1c Companion = new g1c();
    public static final Parcelable.Creator<ClearRegistryResponse> CREATOR = new ClearRegistryResponseCreator();

    public ClearRegistryResponse(boolean z) {
        this.isDeleted = z;
    }

    /* renamed from: isDeleted, reason: from getter */
    public final boolean getIsDeleted() {
        return this.isDeleted;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        ClearRegistryResponseCreator.writeToParcel(this, dest, flags);
    }
}
