package xsna;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzah;
import com.vk.dto.common.ImageSizeKey;
import java.util.EnumMap;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class xwz0 {
    public static final xwz0 b = new xwz0(null, null);
    public final EnumMap a;

    public xwz0(Boolean bool, Boolean bool2) {
        EnumMap enumMap = new EnumMap(zzah.class);
        this.a = enumMap;
        enumMap.put((EnumMap) zzah.AD_STORAGE, (zzah) bool);
        enumMap.put((EnumMap) zzah.ANALYTICS_STORAGE, (zzah) bool2);
    }

    public static xwz0 a(Bundle bundle) {
        if (bundle == null) {
            return b;
        }
        EnumMap enumMap = new EnumMap(zzah.class);
        for (zzah zzahVar : zzah.values()) {
            String string = bundle.getString(zzahVar.zzd);
            Boolean bool = null;
            if (string != null) {
                if (string.equals("granted")) {
                    bool = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    bool = Boolean.FALSE;
                }
            }
            enumMap.put((EnumMap) zzahVar, (zzah) bool);
        }
        return new xwz0(enumMap);
    }

    public static xwz0 b(String str) {
        EnumMap enumMap = new EnumMap(zzah.class);
        if (str != null) {
            int i = 0;
            while (true) {
                zzah[] zzahVarArr = zzah.zzc;
                int length = zzahVarArr.length;
                if (i >= 2) {
                    break;
                }
                zzah zzahVar = zzahVarArr[i];
                int i2 = i + 2;
                if (i2 < str.length()) {
                    char charAt = str.charAt(i2);
                    Boolean bool = null;
                    if (charAt != '-') {
                        if (charAt == '0') {
                            bool = Boolean.FALSE;
                        } else if (charAt == '1') {
                            bool = Boolean.TRUE;
                        }
                    }
                    enumMap.put((EnumMap) zzahVar, (zzah) bool);
                }
                i++;
            }
        }
        return new xwz0(enumMap);
    }

    public final xwz0 c(xwz0 xwz0Var) {
        EnumMap enumMap = new EnumMap(zzah.class);
        for (zzah zzahVar : zzah.values()) {
            Boolean bool = (Boolean) this.a.get(zzahVar);
            Boolean bool2 = (Boolean) xwz0Var.a.get(zzahVar);
            if (bool == null) {
                bool = bool2;
            } else if (bool2 != null) {
                bool = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
            }
            enumMap.put((EnumMap) zzahVar, (zzah) bool);
        }
        return new xwz0(enumMap);
    }

    public final xwz0 d(xwz0 xwz0Var) {
        EnumMap enumMap = new EnumMap(zzah.class);
        for (zzah zzahVar : zzah.values()) {
            Boolean bool = (Boolean) this.a.get(zzahVar);
            if (bool == null) {
                bool = (Boolean) xwz0Var.a.get(zzahVar);
            }
            enumMap.put((EnumMap) zzahVar, (zzah) bool);
        }
        return new xwz0(enumMap);
    }

    public final String e() {
        StringBuilder sb = new StringBuilder("G1");
        zzah[] zzahVarArr = zzah.zzc;
        int length = zzahVarArr.length;
        for (int i = 0; i < 2; i++) {
            Boolean bool = (Boolean) this.a.get(zzahVarArr[i]);
            sb.append(bool == null ? '-' : bool.booleanValue() ? '1' : ImageSizeKey.SIZE_KEY_UNDEFINED);
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xwz0) {
            xwz0 xwz0Var = (xwz0) obj;
            zzah[] values = zzah.values();
            int length = values.length;
            int i = 0;
            while (true) {
                boolean z = true;
                if (i >= length) {
                    return true;
                }
                zzah zzahVar = values[i];
                Boolean bool = (Boolean) this.a.get(zzahVar);
                boolean z2 = bool == null ? false : bool.booleanValue() ? true : 2;
                Boolean bool2 = (Boolean) xwz0Var.a.get(zzahVar);
                if (bool2 == null) {
                    z = false;
                } else if (!bool2.booleanValue()) {
                    z = 2;
                }
                if (z2 != z) {
                    break;
                }
                i++;
            }
        }
        return false;
    }

    public final boolean f(zzah zzahVar) {
        Boolean bool = (Boolean) this.a.get(zzahVar);
        return bool == null || bool.booleanValue();
    }

    public final boolean g(xwz0 xwz0Var, zzah... zzahVarArr) {
        for (zzah zzahVar : zzahVarArr) {
            Boolean bool = (Boolean) this.a.get(zzahVar);
            Boolean bool2 = (Boolean) xwz0Var.a.get(zzahVar);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (Boolean bool : this.a.values()) {
            int i2 = i * 31;
            i = i2 + (bool == null ? 0 : bool.booleanValue() ? 1 : 2);
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("settings: ");
        zzah[] values = zzah.values();
        int length = values.length;
        for (int i = 0; i < length; i++) {
            zzah zzahVar = values[i];
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(zzahVar.name());
            sb.append("=");
            Boolean bool = (Boolean) this.a.get(zzahVar);
            if (bool == null) {
                sb.append("uninitialized");
            } else {
                sb.append(true != bool.booleanValue() ? "denied" : "granted");
            }
        }
        return sb.toString();
    }

    public xwz0(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(zzah.class);
        this.a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
