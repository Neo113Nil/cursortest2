package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.core.serialize.Serializer;
import java.util.Iterator;
import java.util.List;

/* compiled from: ModelUtils.java */
/* loaded from: classes18.dex */
public final class h330 {
    public static <T extends Parcelable> void a(Parcel parcel, List<T> list, Class<T> cls) {
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            list.add(cls.cast(parcel.readParcelable(cls.getClassLoader())));
        }
    }

    public static <T extends Parcelable> void b(Serializer serializer, List<T> list, Class<T> cls) {
        int u = serializer.u();
        for (int i = 0; i < u; i++) {
            list.add(cls.cast(serializer.G(cls.getClassLoader())));
        }
    }

    public static void c(Parcel parcel, List<? extends Parcelable> list) {
        Iterator a = ao.a(parcel, list);
        while (a.hasNext()) {
            parcel.writeParcelable((Parcelable) a.next(), 0);
        }
    }

    public static void d(Serializer serializer, List<? extends Serializer.StreamParcelable> list) {
        serializer.S(list.size());
        Iterator<? extends Serializer.StreamParcelable> it = list.iterator();
        while (it.hasNext()) {
            serializer.i0(it.next());
        }
    }
}
