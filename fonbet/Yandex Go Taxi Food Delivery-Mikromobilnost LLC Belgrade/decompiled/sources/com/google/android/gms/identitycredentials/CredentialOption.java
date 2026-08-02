package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.b64;
import defpackage.d9f;
import defpackage.evu0;
import defpackage.ny61;
import defpackage.oyr;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000  2\u00020\u0001:\u0001!BE\b\u0007\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0002\u0012\b\b\u0003\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0013\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001b\u0010\u0015R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u0013\u0012\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015¨\u0006\""}, d2 = {"Lcom/google/android/gms/identitycredentials/CredentialOption;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "", "type", "Landroid/os/Bundle;", "credentialRetrievalData", "candidateQueryData", "requestMatcher", "requestType", "protocolType", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "Landroid/os/Bundle;", "getCredentialRetrievalData", "()Landroid/os/Bundle;", "getCandidateQueryData", "getRequestMatcher", "getRequestType", "getRequestType$annotations", "()V", "getProtocolType", "getProtocolType$annotations", "Companion", "d9f", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CredentialOption extends AbstractSafeParcelable {
    private final Bundle candidateQueryData;
    private final Bundle credentialRetrievalData;
    private final String protocolType;
    private final String requestMatcher;
    private final String requestType;
    private final String type;
    public static final d9f Companion = new d9f();
    public static final Parcelable.Creator<CredentialOption> CREATOR = new CredentialOptionCreator();

    public CredentialOption(String str, Bundle bundle, Bundle bundle2, String str2, String str3, String str4) {
        this.type = str;
        this.credentialRetrievalData = bundle;
        this.candidateQueryData = bundle2;
        this.requestMatcher = str2;
        this.requestType = str3;
        this.protocolType = str4;
        boolean z = (evu0.J(str3) || evu0.J(str4)) ? false : true;
        boolean z2 = !evu0.J(str) && str3.length() == 0 && str4.length() == 0;
        if (z || z2) {
            return;
        }
        ny61.g(oyr.t(b64.v("Either type: ", str, ", or requestType: ", str3, " and protocolType: "), str4, " must be specified, but at least one contains an invalid blank value."));
        throw null;
    }

    public final Bundle getCandidateQueryData() {
        return this.candidateQueryData;
    }

    public final Bundle getCredentialRetrievalData() {
        return this.credentialRetrievalData;
    }

    public final String getProtocolType() {
        return this.protocolType;
    }

    public final String getRequestMatcher() {
        return this.requestMatcher;
    }

    public final String getRequestType() {
        return this.requestType;
    }

    public final String getType() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        CredentialOptionCreator.writeToParcel(this, dest, flags);
    }
}
