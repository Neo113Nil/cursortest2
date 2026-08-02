package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.cvw;
import defpackage.h8u;
import defpackage.mm2;
import defpackage.ny61;
import defpackage.rvr;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes11.dex */
public class GoogleSignInOptions extends AbstractSafeParcelable implements mm2, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;
    public static final GoogleSignInOptions DEFAULT_GAMES_SIGN_IN;
    public static final GoogleSignInOptions DEFAULT_SIGN_IN;
    public static final Scope zaa;
    public static final Scope zab;
    public static final Scope zac;
    public static final Scope zad;
    public static final Scope zae;
    private static final Comparator zag;
    final int zaf;
    private final ArrayList zah;
    private Account zai;
    private boolean zaj;
    private final boolean zak;
    private final boolean zal;
    private String zam;
    private String zan;
    private ArrayList zao;
    private String zap;
    private Map zaq;

    static {
        Scope scope = new Scope("profile");
        zaa = scope;
        zab = new Scope("email");
        Scope scope2 = new Scope("openid");
        zac = scope2;
        Scope scope3 = new Scope("https://www.googleapis.com/auth/games_lite");
        zad = scope3;
        zae = new Scope("https://www.googleapis.com/auth/games");
        a aVar = new a();
        HashSet hashSet = aVar.a;
        hashSet.add(scope2);
        hashSet.add(scope);
        DEFAULT_SIGN_IN = aVar.a();
        a aVar2 = new a();
        HashSet hashSet2 = aVar2.a;
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        DEFAULT_GAMES_SIGN_IN = aVar2.a();
        CREATOR = new zae();
        zag = new rvr(18);
    }

    private GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, String str3) {
        this.zaf = i;
        this.zah = arrayList;
        this.zai = account;
        this.zaj = z;
        this.zak = z2;
        this.zal = z3;
        this.zam = str;
        this.zan = str2;
        this.zao = new ArrayList(map.values());
        this.zaq = map;
        this.zap = str3;
    }

    public static GoogleSignInOptions zab(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String optString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map zam(List list) {
        HashMap hashMap = new HashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable = (GoogleSignInOptionsExtensionParcelable) it.next();
                hashMap.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.getType()), googleSignInOptionsExtensionParcelable);
            }
        }
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0048, code lost:
    
        if (r1.equals(r4.getAccount()) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            if (this.zao.isEmpty() && googleSignInOptions.zao.isEmpty() && this.zah.size() == googleSignInOptions.getScopes().size() && this.zah.containsAll(googleSignInOptions.getScopes())) {
                Account account = this.zai;
                if (account == null) {
                    if (googleSignInOptions.getAccount() == null) {
                    }
                }
                if (TextUtils.isEmpty(this.zam)) {
                    if (TextUtils.isEmpty(googleSignInOptions.getServerClientId())) {
                    }
                } else if (!this.zam.equals(googleSignInOptions.getServerClientId())) {
                }
                if (this.zal == googleSignInOptions.isForceCodeForRefreshToken() && this.zaj == googleSignInOptions.isIdTokenRequested() && this.zak == googleSignInOptions.isServerAuthCodeRequested()) {
                    if (TextUtils.equals(this.zap, googleSignInOptions.getLogSessionId())) {
                        return true;
                    }
                }
            }
        } catch (ClassCastException unused) {
        }
        return false;
    }

    public Account getAccount() {
        return this.zai;
    }

    public ArrayList<GoogleSignInOptionsExtensionParcelable> getExtensions() {
        return this.zao;
    }

    public String getLogSessionId() {
        return this.zap;
    }

    public Scope[] getScopeArray() {
        return (Scope[]) this.zah.toArray(new Scope[this.zah.size()]);
    }

    public ArrayList<Scope> getScopes() {
        return new ArrayList<>(this.zah);
    }

    public String getServerClientId() {
        return this.zam;
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.zah;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((Scope) arrayList2.get(i)).getScopeUri());
        }
        Collections.sort(arrayList);
        h8u h8uVar = new h8u();
        h8uVar.a(arrayList);
        h8uVar.a(this.zai);
        h8uVar.a(this.zam);
        h8uVar.a = (((((h8uVar.a * 31) + (this.zal ? 1 : 0)) * 31) + (this.zaj ? 1 : 0)) * 31) + (this.zak ? 1 : 0);
        h8uVar.a(this.zap);
        return h8uVar.a;
    }

    public boolean isForceCodeForRefreshToken() {
        return this.zal;
    }

    public boolean isIdTokenRequested() {
        return this.zaj;
    }

    public boolean isServerAuthCodeRequested() {
        return this.zak;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zaf;
        int n0 = bb1.n0(parcel, 20293);
        bb1.m0(1, parcel, 4);
        parcel.writeInt(i2);
        bb1.k0(parcel, 2, getScopes(), false);
        bb1.f0(parcel, 3, getAccount(), i, false);
        boolean isIdTokenRequested = isIdTokenRequested();
        bb1.m0(4, parcel, 4);
        parcel.writeInt(isIdTokenRequested ? 1 : 0);
        boolean isServerAuthCodeRequested = isServerAuthCodeRequested();
        bb1.m0(5, parcel, 4);
        parcel.writeInt(isServerAuthCodeRequested ? 1 : 0);
        boolean isForceCodeForRefreshToken = isForceCodeForRefreshToken();
        bb1.m0(6, parcel, 4);
        parcel.writeInt(isForceCodeForRefreshToken ? 1 : 0);
        bb1.g0(parcel, 7, getServerClientId(), false);
        bb1.g0(parcel, 8, this.zan, false);
        bb1.k0(parcel, 9, getExtensions(), false);
        bb1.g0(parcel, 10, getLogSessionId(), false);
        bb1.o0(parcel, n0);
    }

    public final String zaf() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.zah, zag);
            Iterator it = this.zah.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Scope) it.next()).getScopeUri());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.zai;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.zaj);
            jSONObject.put("forceCodeForRefreshToken", this.zal);
            jSONObject.put("serverAuthRequested", this.zak);
            if (!TextUtils.isEmpty(this.zam)) {
                jSONObject.put("serverClientId", this.zam);
            }
            if (!TextUtils.isEmpty(this.zan)) {
                jSONObject.put("hostedDomain", this.zan);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            ny61.j(e);
            return null;
        }
    }

    public GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, ArrayList arrayList2, String str3) {
        this(i, arrayList, account, z, z2, z3, str, str2, zam(arrayList2), str3);
    }

    public static final class a {
        public final HashSet a;
        public boolean b;
        public boolean c;
        public final boolean d;
        public String e;
        public Account f;
        public final String g;
        public final Map h;
        public String i;

        public a(GoogleSignInOptions googleSignInOptions) {
            this.a = new HashSet();
            this.h = new HashMap();
            cvw.l(googleSignInOptions);
            this.a = new HashSet(googleSignInOptions.zah);
            this.b = googleSignInOptions.zak;
            this.c = googleSignInOptions.zal;
            this.d = googleSignInOptions.zaj;
            this.e = googleSignInOptions.zam;
            this.f = googleSignInOptions.zai;
            this.g = googleSignInOptions.zan;
            this.h = GoogleSignInOptions.zam(googleSignInOptions.zao);
            this.i = googleSignInOptions.zap;
        }

        public final GoogleSignInOptions a() {
            Scope scope = GoogleSignInOptions.zae;
            HashSet hashSet = this.a;
            if (hashSet.contains(scope)) {
                Scope scope2 = GoogleSignInOptions.zad;
                if (hashSet.contains(scope2)) {
                    hashSet.remove(scope2);
                }
            }
            if (this.d && (this.f == null || !hashSet.isEmpty())) {
                hashSet.add(GoogleSignInOptions.zac);
            }
            return new GoogleSignInOptions(new ArrayList(hashSet), this.f, this.d, this.b, this.c, this.e, this.g, this.h, this.i);
        }

        public a() {
            this.a = new HashSet();
            this.h = new HashMap();
        }
    }
}
