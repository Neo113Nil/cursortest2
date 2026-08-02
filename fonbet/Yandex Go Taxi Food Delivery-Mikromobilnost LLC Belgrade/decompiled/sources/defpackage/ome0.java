package defpackage;

import android.content.Context;
import com.yandex.plus.home.datasource.local.preferences.a;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class ome0 {
    public final Context a;
    public final String b;
    public final sbx c;
    public final jse d;
    public final ReentrantLock e = new ReentrantLock();
    public final WeakHashMap f = new WeakHashMap();

    public ome0(Context context, String str, zcx zcxVar, jse jseVar) {
        this.a = context;
        this.b = str;
        this.c = zcxVar;
        this.d = jseVar;
    }

    public final a a(String str, KSerializer kSerializer) {
        WeakHashMap weakHashMap = this.f;
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            Object obj = weakHashMap.get(kSerializer);
            a aVar = obj instanceof a ? (a) obj : null;
            if (aVar == null) {
                a aVar2 = new a(this.a, this.b, str, kSerializer, this.c, this.d);
                weakHashMap.put(kSerializer, aVar2);
                aVar = aVar2;
            }
            reentrantLock.unlock();
            return aVar;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
