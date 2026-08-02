package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import xsna.y230;

/* compiled from: ModelCache.java */
/* loaded from: classes12.dex */
public final class x230 extends l900<y230.a<Object>, Object> {
    @Override // xsna.l900
    public final void c(@NonNull y230.a<Object> aVar, @Nullable Object obj) {
        y230.a<Object> aVar2 = aVar;
        aVar2.getClass();
        ArrayDeque arrayDeque = y230.a.b;
        synchronized (arrayDeque) {
            arrayDeque.offer(aVar2);
        }
    }
}
