package defpackage;

import java.util.Map;

/* loaded from: classes11.dex */
public abstract class n691 implements Map.Entry {
    public final /* synthetic */ int a;

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (xya1.g(getKey(), entry.getKey()) && xya1.g(getValue(), entry.getValue())) {
                    }
                }
                break;
            case 1:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry2 = (Map.Entry) obj;
                    if (cza1.c(getKey(), entry2.getKey()) && cza1.c(getValue(), entry2.getValue())) {
                    }
                }
                break;
            case 2:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry3 = (Map.Entry) obj;
                    if (epa1.d(getKey(), entry3.getKey()) && epa1.d(getValue(), entry3.getValue())) {
                    }
                }
                break;
            default:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry4 = (Map.Entry) obj;
                    if (hua1.i(getKey(), entry4.getKey()) && hua1.i(getValue(), entry4.getValue())) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        switch (this.a) {
            case 0:
                Object key = getKey();
                Object value = getValue();
                return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
            case 1:
                Object key2 = getKey();
                Object value2 = getValue();
                return (key2 == null ? 0 : key2.hashCode()) ^ (value2 != null ? value2.hashCode() : 0);
            case 2:
                Object key3 = getKey();
                Object value3 = getValue();
                return (key3 == null ? 0 : key3.hashCode()) ^ (value3 != null ? value3.hashCode() : 0);
            default:
                Object key4 = getKey();
                Object value4 = getValue();
                return (key4 == null ? 0 : key4.hashCode()) ^ (value4 != null ? value4.hashCode() : 0);
        }
    }

    public final String toString() {
        switch (this.a) {
            case 1:
                break;
        }
        return g8e.p(String.valueOf(getKey()), "=", String.valueOf(getValue()));
    }
}
