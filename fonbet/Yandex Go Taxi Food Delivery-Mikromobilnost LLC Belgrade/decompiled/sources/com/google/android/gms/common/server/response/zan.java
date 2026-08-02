package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import defpackage.bb1;
import defpackage.cvw;
import defpackage.x4e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class zan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zan> CREATOR = new zao();
    final int zaa;
    private final HashMap zab;
    private final String zac;

    public zan(int i, ArrayList arrayList, String str) {
        this.zaa = i;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zal zalVar = (zal) arrayList.get(i2);
            String str2 = zalVar.zab;
            HashMap hashMap2 = new HashMap();
            ArrayList arrayList2 = zalVar.zac;
            cvw.l(arrayList2);
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                zam zamVar = (zam) zalVar.zac.get(i3);
                hashMap2.put(zamVar.zab, zamVar.zac);
            }
            hashMap.put(str2, hashMap2);
        }
        this.zab = hashMap;
        cvw.l(str);
        this.zac = str;
        zad();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.zab.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map map = (Map) this.zab.get(str);
            for (String str2 : map.keySet()) {
                x4e.C(sb, "  ", str2, Extension.COLON_SPACE);
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        int i2 = this.zaa;
        bb1.m0(1, parcel, 4);
        parcel.writeInt(i2);
        ArrayList arrayList = new ArrayList();
        for (String str : this.zab.keySet()) {
            arrayList.add(new zal(str, (Map) this.zab.get(str)));
        }
        bb1.k0(parcel, 2, arrayList, false);
        bb1.g0(parcel, 3, this.zac, false);
        bb1.o0(parcel, n0);
    }

    public final String zaa() {
        return this.zac;
    }

    public final Map zab(String str) {
        return (Map) this.zab.get(str);
    }

    public final void zac() {
        for (String str : this.zab.keySet()) {
            Map map = (Map) this.zab.get(str);
            HashMap hashMap = new HashMap();
            for (String str2 : map.keySet()) {
                hashMap.put(str2, ((FastJsonResponse.Field) map.get(str2)).zab());
            }
            this.zab.put(str, hashMap);
        }
    }

    public final void zad() {
        Iterator it = this.zab.keySet().iterator();
        while (it.hasNext()) {
            Map map = (Map) this.zab.get((String) it.next());
            Iterator it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                ((FastJsonResponse.Field) map.get((String) it2.next())).zai(this);
            }
        }
    }

    public final void zae(Class cls, Map map) {
        String canonicalName = cls.getCanonicalName();
        cvw.l(canonicalName);
        this.zab.put(canonicalName, map);
    }

    public final boolean zaf(Class cls) {
        String canonicalName = cls.getCanonicalName();
        cvw.l(canonicalName);
        return this.zab.containsKey(canonicalName);
    }

    public zan(Class cls) {
        this.zaa = 1;
        this.zab = new HashMap();
        String canonicalName = cls.getCanonicalName();
        cvw.l(canonicalName);
        this.zac = canonicalName;
    }
}
