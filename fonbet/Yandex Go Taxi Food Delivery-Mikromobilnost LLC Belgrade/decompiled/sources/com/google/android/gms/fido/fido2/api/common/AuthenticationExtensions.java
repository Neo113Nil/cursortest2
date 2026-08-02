package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.b64;
import defpackage.bb1;
import defpackage.g8e;
import defpackage.ooc;
import defpackage.oyr;
import defpackage.z3k;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class AuthenticationExtensions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticationExtensions> CREATOR = new zzd();
    private final FidoAppIdExtension zza;
    private final zzs zzb;
    private final UserVerificationMethodExtension zzc;
    private final zzz zzd;
    private final zzab zze;
    private final zzad zzf;
    private final zzu zzg;
    private final zzag zzh;
    private final GoogleThirdPartyPaymentExtension zzi;
    private final zzak zzj;
    private final zzaw zzk;
    private final zzai zzl;

    public static final class a {
        public FidoAppIdExtension a;
        public UserVerificationMethodExtension b;
        public zzs c;
        public zzz d;
        public zzab e;
        public zzad f;
        public zzu g;
        public zzag h;
        public GoogleThirdPartyPaymentExtension i;
        public zzak j;
        public zzaw k;

        public final AuthenticationExtensions a() {
            return new AuthenticationExtensions(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, null);
        }
    }

    public AuthenticationExtensions(FidoAppIdExtension fidoAppIdExtension, zzs zzsVar, UserVerificationMethodExtension userVerificationMethodExtension, zzz zzzVar, zzab zzabVar, zzad zzadVar, zzu zzuVar, zzag zzagVar, GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension, zzak zzakVar, zzaw zzawVar, zzai zzaiVar) {
        this.zza = fidoAppIdExtension;
        this.zzc = userVerificationMethodExtension;
        this.zzb = zzsVar;
        this.zzd = zzzVar;
        this.zze = zzabVar;
        this.zzf = zzadVar;
        this.zzg = zzuVar;
        this.zzh = zzagVar;
        this.zzi = googleThirdPartyPaymentExtension;
        this.zzj = zzakVar;
        this.zzk = zzawVar;
        this.zzl = zzaiVar;
    }

    public static AuthenticationExtensions zza(JSONObject jSONObject) throws JSONException {
        a aVar = new a();
        if (jSONObject.has("fidoAppIdExtension")) {
            aVar.a = new FidoAppIdExtension(jSONObject.getJSONObject("fidoAppIdExtension").getString("appid"));
        }
        if (jSONObject.has("appid")) {
            aVar.a = new FidoAppIdExtension(jSONObject.getString("appid"));
        }
        if (jSONObject.has("prf")) {
            if (jSONObject.has("prfAlreadyHashed")) {
                z3k.c("both prf and prfAlreadyHashed extensions found");
                return null;
            }
            aVar.j = zzak.zza(jSONObject.getJSONObject("prf"), false);
        } else if (jSONObject.has("prfAlreadyHashed")) {
            aVar.j = zzak.zza(jSONObject.getJSONObject("prfAlreadyHashed"), true);
        }
        if (jSONObject.has("cableAuthenticationExtension")) {
            JSONArray jSONArray = jSONObject.getJSONArray("cableAuthenticationExtension");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                arrayList.add(new zzq(jSONObject2.getLong("version"), Base64.decode(jSONObject2.getString("clientEid"), 11), Base64.decode(jSONObject2.getString("authenticatorEid"), 11), Base64.decode(jSONObject2.getString("sessionPreKey"), 11)));
            }
            aVar.c = new zzs(arrayList);
        }
        if (jSONObject.has("userVerificationMethodExtension")) {
            aVar.b = new UserVerificationMethodExtension(jSONObject.getJSONObject("userVerificationMethodExtension").getBoolean("uvm"));
        }
        if (jSONObject.has("google_multiAssertionExtension")) {
            aVar.d = new zzz(jSONObject.getJSONObject("google_multiAssertionExtension").getBoolean("requestForMultiAssertion"));
        }
        if (jSONObject.has("google_sessionIdExtension")) {
            aVar.e = new zzab(jSONObject.getJSONObject("google_sessionIdExtension").getInt("sessionId"));
        }
        if (jSONObject.has("google_silentVerificationExtension")) {
            aVar.f = new zzad(jSONObject.getJSONObject("google_silentVerificationExtension").getBoolean("silentVerification"));
        }
        if (jSONObject.has("devicePublicKeyExtension")) {
            aVar.g = new zzu(jSONObject.getJSONObject("devicePublicKeyExtension").getBoolean("devicePublicKey"));
        }
        if (jSONObject.has("google_tunnelServerIdExtension")) {
            aVar.h = new zzag(jSONObject.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId"));
        }
        if (jSONObject.has("google_thirdPartyPaymentExtension")) {
            aVar.i = new GoogleThirdPartyPaymentExtension(jSONObject.getJSONObject("google_thirdPartyPaymentExtension").getBoolean("thirdPartyPayment"));
        }
        if (jSONObject.has("txAuthSimple")) {
            aVar.k = new zzaw(jSONObject.getString("txAuthSimple"));
        }
        return aVar.a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensions)) {
            return false;
        }
        AuthenticationExtensions authenticationExtensions = (AuthenticationExtensions) obj;
        return ooc.m(this.zza, authenticationExtensions.zza) && ooc.m(this.zzb, authenticationExtensions.zzb) && ooc.m(this.zzc, authenticationExtensions.zzc) && ooc.m(this.zzd, authenticationExtensions.zzd) && ooc.m(this.zze, authenticationExtensions.zze) && ooc.m(this.zzf, authenticationExtensions.zzf) && ooc.m(this.zzg, authenticationExtensions.zzg) && ooc.m(this.zzh, authenticationExtensions.zzh) && ooc.m(this.zzi, authenticationExtensions.zzi) && ooc.m(this.zzj, authenticationExtensions.zzj) && ooc.m(this.zzk, authenticationExtensions.zzk) && ooc.m(this.zzl, authenticationExtensions.zzl);
    }

    public FidoAppIdExtension getFidoAppIdExtension() {
        return this.zza;
    }

    public UserVerificationMethodExtension getUserVerificationMethodExtension() {
        return this.zzc;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl});
    }

    public final String toString() {
        zzaw zzawVar = this.zzk;
        zzak zzakVar = this.zzj;
        GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension = this.zzi;
        zzag zzagVar = this.zzh;
        zzu zzuVar = this.zzg;
        zzad zzadVar = this.zzf;
        zzab zzabVar = this.zze;
        zzz zzzVar = this.zzd;
        UserVerificationMethodExtension userVerificationMethodExtension = this.zzc;
        zzs zzsVar = this.zzb;
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(zzsVar);
        String valueOf3 = String.valueOf(userVerificationMethodExtension);
        String valueOf4 = String.valueOf(zzzVar);
        String valueOf5 = String.valueOf(zzabVar);
        String valueOf6 = String.valueOf(zzadVar);
        String valueOf7 = String.valueOf(zzuVar);
        String valueOf8 = String.valueOf(zzagVar);
        String valueOf9 = String.valueOf(googleThirdPartyPaymentExtension);
        String valueOf10 = String.valueOf(zzakVar);
        String valueOf11 = String.valueOf(zzawVar);
        StringBuilder v = b64.v("AuthenticationExtensions{\n fidoAppIdExtension=", valueOf, ", \n cableAuthenticationExtension=", valueOf2, ", \n userVerificationMethodExtension=");
        g8e.D(v, valueOf3, ", \n googleMultiAssertionExtension=", valueOf4, ", \n googleSessionIdExtension=");
        g8e.D(v, valueOf5, ", \n googleSilentVerificationExtension=", valueOf6, ", \n devicePublicKeyExtension=");
        g8e.D(v, valueOf7, ", \n googleTunnelServerIdExtension=", valueOf8, ", \n googleThirdPartyPaymentExtension=");
        g8e.D(v, valueOf9, ", \n prfExtension=", valueOf10, ", \n simpleTransactionAuthorizationExtension=");
        return oyr.t(v, valueOf11, "}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.f0(parcel, 2, getFidoAppIdExtension(), i, false);
        bb1.f0(parcel, 3, this.zzb, i, false);
        bb1.f0(parcel, 4, getUserVerificationMethodExtension(), i, false);
        bb1.f0(parcel, 5, this.zzd, i, false);
        bb1.f0(parcel, 6, this.zze, i, false);
        bb1.f0(parcel, 7, this.zzf, i, false);
        bb1.f0(parcel, 8, this.zzg, i, false);
        bb1.f0(parcel, 9, this.zzh, i, false);
        bb1.f0(parcel, 10, this.zzi, i, false);
        bb1.f0(parcel, 11, this.zzj, i, false);
        bb1.f0(parcel, 12, this.zzk, i, false);
        bb1.f0(parcel, 13, this.zzl, i, false);
        bb1.o0(parcel, n0);
    }

    public final zzs zzb() {
        return this.zzb;
    }

    public final zzu zzc() {
        return this.zzg;
    }

    public final zzz zzd() {
        return this.zzd;
    }

    public final zzab zze() {
        return this.zze;
    }

    public final zzad zzf() {
        return this.zzf;
    }

    public final GoogleThirdPartyPaymentExtension zzg() {
        return this.zzi;
    }

    public final zzag zzh() {
        return this.zzh;
    }

    public final zzai zzi() {
        return this.zzl;
    }

    public final zzak zzj() {
        return this.zzj;
    }

    public final zzaw zzk() {
        return this.zzk;
    }
}
