package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.yandex.passport.internal.ui.autologin.AutoLoginRetryActivity;
import defpackage.b64;
import defpackage.evu0;
import defpackage.fri0;
import defpackage.ly3;
import defpackage.ny61;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001\"BA\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0005\u0012\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0017\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\u0019R&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u001d\u0012\u0004\b \u0010\u001c\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/google/android/gms/identitycredentials/RegistrationRequest;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "", AutoLoginRetryActivity.KEY_USER_CREDENTIALS, "matcher", "", "type", "requestType", "", "protocolTypes", "<init>", "([B[BLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "[B", "getCredentials", "()[B", "getMatcher", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getRequestType", "getRequestType$annotations", "()V", "Ljava/util/List;", "getProtocolTypes", "()Ljava/util/List;", "getProtocolTypes$annotations", "Companion", "fri0", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RegistrationRequest extends AbstractSafeParcelable {
    public static final String TAG = "RegistrationRequest";
    private final byte[] credentials;
    private final byte[] matcher;
    private final List<String> protocolTypes;
    private final String requestType;
    private final String type;
    public static final fri0 Companion = new fri0();
    public static final Parcelable.Creator<RegistrationRequest> CREATOR = new RegistrationRequestCreator();

    public RegistrationRequest(byte[] bArr, byte[] bArr2, String str, String str2, List<String> list) {
        boolean z;
        this.credentials = bArr;
        this.matcher = bArr2;
        this.type = str;
        this.requestType = str2;
        this.protocolTypes = list;
        if (!evu0.J(str2) && !list.isEmpty()) {
            List<String> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    if (!evu0.J((String) it.next())) {
                        z = true;
                        break;
                    }
                }
            }
        }
        z = false;
        boolean z2 = !evu0.J(this.type) && this.requestType.length() == 0 && this.protocolTypes.isEmpty();
        if (z || z2) {
            return;
        }
        ny61.g(ly3.s(b64.v("Either type: ", this.type, ", or requestType: ", this.requestType, " and protocolTypes: "), this.protocolTypes, " must be specified, but all were blank, or for protocolTypes, empty or full of blank elements."));
        throw null;
    }

    public final byte[] getCredentials() {
        return this.credentials;
    }

    public final byte[] getMatcher() {
        return this.matcher;
    }

    public final List<String> getProtocolTypes() {
        return this.protocolTypes;
    }

    public final String getRequestType() {
        return this.requestType;
    }

    public final String getType() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        RegistrationRequestCreator.writeToParcel(this, dest, flags);
    }
}
