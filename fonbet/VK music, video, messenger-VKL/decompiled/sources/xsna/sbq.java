package xsna;

import android.graphics.Bitmap;
import com.vk.attachpicker.screen.filters.a;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.EmptyList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class sbq implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sbq(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                com.vk.attachpicker.screen.filters.a aVar = (com.vk.attachpicker.screen.filters.a) obj2;
                int i2 = this.c;
                Bitmap bitmap = (Bitmap) obj;
                ReentrantLock reentrantLock = aVar.d;
                reentrantLock.lock();
                try {
                    aVar.e.put(Integer.valueOf(i2), a.b.C0389a.a);
                    s3q0 s3q0Var = s3q0.a;
                    reentrantLock.unlock();
                    aVar.a.onNext(new a.AbstractC0387a.c(i2, bitmap));
                    return s3q0.a;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            default:
                ((n6) obj2).invoke(new rbt0(this.c, 50, 0, 32, EmptyList.b));
                return s3q0.a;
        }
    }
}
