package xsna;

import io.michaelrocks.libphonenumber.android.Phonemetadata$PhoneMetadata;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: MapBackedMetadataContainer.java */
/* loaded from: classes8.dex */
public final class sj00<T> implements li20 {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final a<T> b;

    /* compiled from: MapBackedMetadataContainer.java */
    public interface a<T> {
        T a(Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata);
    }

    public sj00(a<T> aVar) {
        this.b = aVar;
    }

    public final void a(Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata) {
        this.a.put(this.b.a(phonemetadata$PhoneMetadata), phonemetadata$PhoneMetadata);
    }
}
