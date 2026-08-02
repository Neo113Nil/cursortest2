package com.pichillilorenzo.flutter_inappwebview_android.types;

import android.content.Context;
import defpackage.oyr;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public class AndroidResource {
    private String defPackage;
    private String defType;
    private String name;

    public AndroidResource(String str, String str2, String str3) {
        this.name = str;
        this.defType = str2;
        this.defPackage = str3;
    }

    public static AndroidResource fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new AndroidResource((String) map.get("name"), (String) map.get("defType"), (String) map.get("defPackage"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AndroidResource androidResource = (AndroidResource) obj;
            if (!this.name.equals(androidResource.name)) {
                return false;
            }
            String str = this.defType;
            String str2 = androidResource.defType;
            if (str == null ? str2 != null : !str.equals(str2)) {
                return false;
            }
            String str3 = this.defPackage;
            String str4 = androidResource.defPackage;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 == null) {
                return true;
            }
        }
        return false;
    }

    public String getDefPackage() {
        return this.defPackage;
    }

    public String getDefType() {
        return this.defType;
    }

    public int getIdentifier(Context context) {
        return context.getResources().getIdentifier(this.name, this.defType, this.defPackage);
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        String str = this.defType;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.defPackage;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public void setDefPackage(String str) {
        this.defPackage = str;
    }

    public void setDefType(String str) {
        this.defType = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("name", this.name);
        hashMap.put("defType", this.defType);
        hashMap.put("defPackage", this.defPackage);
        return hashMap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AndroidResource{name='");
        sb.append(this.name);
        sb.append("', type='");
        sb.append(this.defType);
        sb.append("', defPackage='");
        return oyr.t(sb, this.defPackage, "'}");
    }
}
