package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.fido.f;
import com.google.android.gms.internal.fido.g;
import defpackage.bb1;
import defpackage.bwa1;
import defpackage.cvw;
import defpackage.mw4;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.z3k;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class zzak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzak> CREATOR = new zzal();
    private static final byte[] zza = "WebAuthn PRF\u0000".getBytes(StandardCharsets.UTF_8);
    private final byte[][] zzb;

    public zzak(byte[][] bArr) {
        cvw.e(bArr != null);
        cvw.e(1 == ((bArr.length & 1) ^ 1));
        int i = 0;
        while (i < bArr.length) {
            cvw.e(i == 0 || bArr[i] != null);
            int i2 = i + 1;
            cvw.e(bArr[i2] != null);
            int length = bArr[i2].length;
            cvw.e(length == 32 || length == 64);
            i += 2;
        }
        this.zzb = bArr;
    }

    public static zzak zza(JSONObject jSONObject, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList();
        try {
            if (jSONObject.has("eval")) {
                arrayList.add(null);
                if (z) {
                    arrayList.add(zzd(jSONObject.getJSONObject("eval")));
                } else {
                    arrayList.add(zze(jSONObject.getJSONObject("eval")));
                }
            }
            if (jSONObject.has("evalByCredential")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("evalByCredential");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    arrayList.add(mw4.a(next));
                    if (z) {
                        arrayList.add(zzd(jSONObject2.getJSONObject(next)));
                    } else {
                        arrayList.add(zze(jSONObject2.getJSONObject(next)));
                    }
                }
            }
            return new zzak((byte[][]) arrayList.toArray(new byte[0][]));
        } catch (IllegalArgumentException unused) {
            z3k.c("invalid base64url value");
            return null;
        }
    }

    private static JSONObject zzb(byte[] bArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (bArr.length == 32) {
            jSONObject.put("first", Base64.encodeToString(bArr, 11));
            return jSONObject;
        }
        jSONObject.put("first", Base64.encodeToString(bArr, 0, 32, 11));
        jSONObject.put("second", Base64.encodeToString(bArr, 32, 32, 11));
        return jSONObject;
    }

    private static byte[] zzc(byte[] bArr) {
        g g = f.a.g();
        MessageDigest messageDigest = g.a;
        byte[] bArr2 = zza;
        bArr2.getClass();
        int length = bArr2.length;
        if (g.c) {
            ny61.r("Cannot re-use a Hasher after calling hash() on it");
            return null;
        }
        messageDigest.update(bArr2, 0, length);
        bArr.getClass();
        int length2 = bArr.length;
        if (g.c) {
            ny61.r("Cannot re-use a Hasher after calling hash() on it");
            return null;
        }
        messageDigest.update(bArr, 0, length2);
        return g.a().a();
    }

    private static byte[] zzd(JSONObject jSONObject) throws JSONException {
        byte[] a = mw4.a(jSONObject.getString("first"));
        if (a.length != 32) {
            z3k.c("hashed PRF value with wrong length");
            return null;
        }
        if (!jSONObject.has("second")) {
            return a;
        }
        byte[] a2 = mw4.a(jSONObject.getString("second"));
        if (a2.length == 32) {
            return bwa1.g(a, a2);
        }
        z3k.c("hashed PRF value with wrong length");
        return null;
    }

    private static byte[] zze(JSONObject jSONObject) throws JSONException {
        byte[] zzc = zzc(mw4.a(jSONObject.getString("first")));
        return !jSONObject.has("second") ? zzc : bwa1.g(zzc, zzc(mw4.a(jSONObject.getString("second"))));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzak) {
            return Arrays.deepEquals(this.zzb, ((zzak) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        for (byte[] bArr : this.zzb) {
            if (bArr != null) {
                i ^= Arrays.hashCode(new Object[]{bArr});
            }
        }
        return i;
    }

    public final String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            int i = 0;
            JSONObject jSONObject2 = null;
            while (true) {
                byte[][] bArr = this.zzb;
                if (i >= bArr.length) {
                    return "PrfExtension{" + jSONObject.toString() + "}";
                }
                if (bArr[i] == null) {
                    jSONObject.put("eval", zzb(bArr[i + 1]));
                } else {
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                        jSONObject.put("evalByCredential", jSONObject2);
                    }
                    jSONObject2.put(mw4.b(this.zzb[i]), zzb(this.zzb[i + 1]));
                }
                i += 2;
            }
        } catch (JSONException e) {
            return oyr.p("PrfExtension{Exception:", e.getMessage(), "}");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[][] bArr = this.zzb;
        int n0 = bb1.n0(parcel, 20293);
        bb1.W(parcel, 1, bArr);
        bb1.o0(parcel, n0);
    }
}
