package sg.bigo.ads.an;

import android.os.Parcel;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sg.bigo.ads.an.f;

/* loaded from: classes9.dex */
public final class n {
    public static int a(@NonNull Parcel parcel, int i) {
        return parcel.dataAvail() > 0 ? parcel.readInt() : i;
    }

    @NonNull
    public static <K extends f, V extends f> Map<K, List<V>> b(@NonNull Parcel parcel, @Nullable f.a<K> aVar, @Nullable f.a<V> aVar2) {
        HashMap hashMap = new HashMap();
        if (parcel.dataAvail() > 0) {
            for (int readInt = parcel.readInt(); readInt > 0; readInt--) {
                f b = b(parcel, aVar);
                List a = a(parcel, aVar2);
                if (b != null && !sg.bigo.ads.common.utils.l.a((Collection) a)) {
                    hashMap.put(b, a);
                }
            }
        }
        return hashMap;
    }

    public static long a(@NonNull Parcel parcel, long j) {
        return parcel.dataAvail() > 0 ? parcel.readLong() : j;
    }

    @Nullable
    public static <T extends f> T b(@NonNull Parcel parcel, @Nullable f.a<T> aVar) {
        if (parcel.dataAvail() <= 0) {
            return null;
        }
        int readInt = parcel.readInt();
        if (readInt != 0 && readInt <= parcel.dataAvail()) {
            byte[] bArr = new byte[readInt];
            parcel.readByteArray(bArr);
            r1 = aVar != null ? aVar.a() : null;
            if (r1 != null) {
                Parcel obtain = Parcel.obtain();
                obtain.unmarshall(bArr, 0, readInt);
                obtain.setDataPosition(0);
                r1.b(obtain);
            }
        }
        return r1;
    }

    public static String a(@NonNull Parcel parcel, String str) {
        return parcel.dataAvail() > 0 ? parcel.readString() : str;
    }

    public static <K extends f, V extends f> void b(@NonNull Parcel parcel, @Nullable Map<K, List<V>> map) {
        int size = map == null ? 0 : map.size();
        parcel.writeInt(size);
        if (size == 0) {
            return;
        }
        for (Map.Entry<K, List<V>> entry : map.entrySet()) {
            a(parcel, entry.getKey());
            a(parcel, entry.getValue());
        }
    }

    @NonNull
    public static <T extends f> List<T> a(@NonNull Parcel parcel, @Nullable f.a<T> aVar) {
        ArrayList arrayList = new ArrayList();
        if (parcel.dataAvail() > 0) {
            for (int readInt = parcel.readInt(); readInt > 0; readInt--) {
                f b = b(parcel, aVar);
                if (b != null) {
                    arrayList.add(b);
                }
            }
        }
        return arrayList;
    }

    public static <T extends f> boolean b(@NonNull Parcel parcel, @Nullable T t) {
        int readInt;
        if (parcel.dataAvail() <= 0 || (readInt = parcel.readInt()) == 0 || readInt > parcel.dataAvail()) {
            return false;
        }
        byte[] bArr = new byte[readInt];
        parcel.readByteArray(bArr);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, readInt);
        obtain.setDataPosition(0);
        if (t == null) {
            return true;
        }
        t.b(obtain);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Map<java.lang.String, T extends sg.bigo.ads.an.f>] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.HashMap] */
    public static <T extends f> Map<String, T> a(@NonNull Parcel parcel, @Nullable f.a<T> aVar, Map<String, T> map) {
        String readString;
        if (parcel.dataAvail() > 0) {
            map = new HashMap();
            if (parcel.dataAvail() > 0) {
                for (int readInt = parcel.readInt(); readInt > 0; readInt--) {
                    T a = aVar != null ? aVar.a() : null;
                    if (b(parcel, a) && (readString = parcel.readString()) != null && a != null) {
                        map.put(readString, a);
                    }
                }
            }
        }
        return (Map<String, T>) map;
    }

    public static boolean b(@NonNull Parcel parcel, boolean z) {
        return parcel.dataAvail() > 0 ? parcel.readInt() != 0 : z;
    }

    @NonNull
    public static <K extends f, V extends f> Map<K, V> a(@NonNull Parcel parcel, @Nullable f.a<K> aVar, @Nullable f.a<V> aVar2) {
        HashMap hashMap = new HashMap();
        if (parcel.dataAvail() > 0) {
            for (int readInt = parcel.readInt(); readInt > 0; readInt--) {
                f b = b(parcel, aVar);
                f b2 = b(parcel, aVar2);
                if (b != null && b2 != null) {
                    hashMap.put(b, b2);
                }
            }
        }
        return hashMap;
    }

    public static <T extends f> void a(@NonNull Parcel parcel, @Nullable Collection<T> collection) {
        int size = collection == null ? 0 : collection.size();
        parcel.writeInt(size);
        if (size == 0) {
            return;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            a(parcel, it.next());
        }
    }

    public static <K extends f, V extends f> void a(@NonNull Parcel parcel, @Nullable Map<K, V> map) {
        int size = map == null ? 0 : map.size();
        parcel.writeInt(size);
        if (size == 0) {
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            a(parcel, key);
            a(parcel, value);
        }
    }

    public static <T extends f> void a(@NonNull Parcel parcel, @Nullable T t) {
        if (t == null) {
            parcel.writeInt(0);
            return;
        }
        Parcel obtain = Parcel.obtain();
        t.a(obtain);
        byte[] marshall = obtain.marshall();
        parcel.writeInt(marshall.length);
        parcel.writeByteArray(marshall);
    }

    public static void a(@NonNull Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }
}
