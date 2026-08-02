package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.cvw;
import defpackage.jra1;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.yci0;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes11.dex */
public class TokenBinding extends AbstractSafeParcelable {
    private final TokenBindingStatus zza;
    private final String zzb;
    public static final Parcelable.Creator<TokenBinding> CREATOR = new zzaz();
    public static final TokenBinding SUPPORTED = new TokenBinding(TokenBindingStatus.SUPPORTED.toString(), null);
    public static final TokenBinding NOT_SUPPORTED = new TokenBinding(TokenBindingStatus.NOT_SUPPORTED.toString(), null);

    public enum TokenBindingStatus implements Parcelable {
        PRESENT("present"),
        SUPPORTED("supported"),
        NOT_SUPPORTED("not-supported");

        public static final Parcelable.Creator<TokenBindingStatus> CREATOR = new zzay();
        private final String zzb;

        TokenBindingStatus(String str) {
            this.zzb = str;
        }

        public static TokenBindingStatus fromString(String str) throws UnsupportedTokenBindingStatusException {
            for (TokenBindingStatus tokenBindingStatus : values()) {
                if (str.equals(tokenBindingStatus.zzb)) {
                    return tokenBindingStatus;
                }
            }
            throw new UnsupportedTokenBindingStatusException(oyr.p("TokenBindingStatus ", str, " not supported"));
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.zzb;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.zzb);
        }
    }

    public static class UnsupportedTokenBindingStatusException extends Exception {
    }

    public TokenBinding(String str, String str2) {
        cvw.l(str);
        try {
            this.zza = TokenBindingStatus.fromString(str);
            this.zzb = str2;
        } catch (UnsupportedTokenBindingStatusException e) {
            yci0.r(e);
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TokenBinding)) {
            return false;
        }
        TokenBinding tokenBinding = (TokenBinding) obj;
        return jra1.h(this.zza, tokenBinding.zza) && jra1.h(this.zzb, tokenBinding.zzb);
    }

    public String getTokenBindingId() {
        return this.zzb;
    }

    public String getTokenBindingStatusAsString() {
        return this.zza.toString();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public JSONObject toJsonObject() throws JSONException {
        try {
            return new JSONObject().put(ACSPConstants.STATUS, this.zza).put("id", this.zzb);
        } catch (JSONException e) {
            ny61.j(e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 2, getTokenBindingStatusAsString(), false);
        bb1.g0(parcel, 3, getTokenBindingId(), false);
        bb1.o0(parcel, n0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TokenBinding(String str) {
        this(r0, str);
        String tokenBindingStatus = TokenBindingStatus.PRESENT.toString();
        cvw.l(str);
    }
}
