package ru.mail.libverify.z;

import androidx.annotation.NonNull;
import java.util.Hashtable;
import ru.mail.libverify.requests.j;

/* loaded from: classes9.dex */
public final class d {

    @NonNull
    private final Hashtable<String, Hashtable<ru.mail.libverify.g.a, j.c>> a = new Hashtable<>();

    @NonNull
    public final synchronized Boolean a(@NonNull String str, @NonNull ru.mail.libverify.g.a aVar, @NonNull j.c cVar) {
        Hashtable<ru.mail.libverify.g.a, j.c> hashtable;
        try {
            if (this.a.containsKey(str)) {
                hashtable = this.a.get(str);
            } else {
                hashtable = new Hashtable<>();
                this.a.put(str, hashtable);
            }
            if (hashtable == null) {
                return Boolean.FALSE;
            }
            if (!hashtable.containsKey(aVar)) {
                hashtable.put(aVar, cVar);
                return Boolean.FALSE;
            }
            if (cVar == hashtable.get(aVar)) {
                hashtable.put(aVar, cVar);
                return Boolean.FALSE;
            }
            hashtable.remove(aVar);
            return Boolean.TRUE;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a(@NonNull String str) {
        this.a.remove(str);
    }
}
