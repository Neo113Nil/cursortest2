package xsna;

import android.content.Context;
import com.vk.core.preference.Preference;
import com.vkontakte.android.MainActivity;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class bd00 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bd00(Context context, Object obj, int i) {
        this.b = i;
        this.c = context;
        this.d = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.d;
        switch (i) {
            case 0:
                String str = MainActivity.P;
                ((MainActivity) this.c).b2((String) obj);
                return s3q0.a;
            default:
                ReentrantLock reentrantLock = Preference.n;
                ReentrantReadWriteLock reentrantReadWriteLock = Preference.o;
                return new mvj0(reentrantLock, reentrantReadWriteLock.writeLock(), reentrantReadWriteLock.writeLock(), this.c, ((im20) obj).a);
        }
    }
}
