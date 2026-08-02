package xsna;

import io.michaelrocks.libphonenumber.android.Phonemetadata$PhoneMetadata;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: BlockingMetadataBootstrappingGuard.java */
/* loaded from: classes8.dex */
public final class uf7 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Serializable d;

    public uf7(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public li20 a(String str) {
        if (!((ConcurrentHashMap) this.d).containsKey(str)) {
            synchronized (this) {
                try {
                    if (!((ConcurrentHashMap) this.d).containsKey(str)) {
                        try {
                            for (Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata : ((vi20) this.b).a(((ti20) this.a).d(str))) {
                                rti rtiVar = (rti) this.c;
                                sj00<String> sj00Var = rtiVar.b;
                                if (sj00Var.b.a(phonemetadata$PhoneMetadata).equals("001")) {
                                    rtiVar.a.a(phonemetadata$PhoneMetadata);
                                } else {
                                    sj00Var.a(phonemetadata$PhoneMetadata);
                                }
                            }
                            ((ConcurrentHashMap) this.d).put(str, str);
                        } catch (IllegalArgumentException | IllegalStateException e) {
                            throw new IllegalStateException("Failed to read file " + str, e);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (rti) this.c;
    }

    public uf7(ti20 ti20Var, vi20 vi20Var, rti rtiVar) {
        this.a = ti20Var;
        this.b = vi20Var;
        this.c = rtiVar;
        this.d = new ConcurrentHashMap();
    }
}
