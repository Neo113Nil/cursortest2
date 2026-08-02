package xsna;

import java.util.HashMap;

/* compiled from: ClipPlayTimeStampRepositoryImpl.kt */
/* loaded from: classes17.dex */
public final class w8d implements v8d {
    public final HashMap<String, Long> a = new HashMap<>();

    @Override // xsna.v8d
    public final void a(long j, String str) {
        this.a.putIfAbsent(str, Long.valueOf(j));
    }

    @Override // xsna.v8d
    public final long b(String str) {
        Long remove = this.a.remove(str);
        if (remove != null) {
            return remove.longValue();
        }
        return -1L;
    }
}
