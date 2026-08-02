package xsna;

import android.util.ArraySet;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import xsna.x4d0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class u15 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u15(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z;
        ru.mail.libverify.k0.a b;
        switch (this.b) {
            case 0:
                ((b25) this.c).Y((l7r0) this.d);
                return s3q0.a;
            case 1:
                return ((zld) this.c).c((x4d0.a) this.d);
            case 2:
                ell ellVar = (ell) this.c;
                ProfilesInfo profilesInfo = (ProfilesInfo) this.d;
                ReentrantReadWriteLock.ReadLock readLock = ellVar.c.readLock();
                readLock.lock();
                try {
                    f1e0 Ab = profilesInfo.Ab();
                    readLock.unlock();
                    ProfilesInfo c = ellVar.c(Ab, Source.NETWORK);
                    ?? r2 = profilesInfo.g;
                    boolean z2 = true;
                    if (!r2.isEmpty()) {
                        Iterator it = r2.entrySet().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                wpp wppVar = (wpp) c.g.get(entry.getKey());
                                if (wppVar != null) {
                                    wpp wppVar2 = (wpp) entry.getValue();
                                    wppVar2.getClass();
                                    vpp vppVar = vpp.b;
                                    ArraySet g = wppVar2.g(wppVar);
                                    AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                                    Iterator it2 = g.iterator();
                                    while (it2.hasNext()) {
                                        Object next = it2.next();
                                        atomicBoolean.set(atomicBoolean.get() && (((Boolean) vppVar.invoke(wppVar2.c.get(next), wppVar.c.get(next))).booleanValue() || (wppVar2.j(next) && wppVar.j(next))));
                                    }
                                    z = atomicBoolean.get();
                                } else {
                                    z = false;
                                }
                                if (!z) {
                                    z2 = false;
                                }
                            }
                        }
                    }
                    if (!z2) {
                        profilesInfo.Hb(c);
                    }
                    return c;
                } catch (Throwable th) {
                    readLock.unlock();
                    throw th;
                }
            default:
                b = ((ru.mail.libverify.j0.k) this.c).b((ru.mail.verify.core.utils.b) this.d);
                return b;
        }
    }
}
