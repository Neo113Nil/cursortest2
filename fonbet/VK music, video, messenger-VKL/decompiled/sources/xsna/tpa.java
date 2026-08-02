package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Good;
import com.vk.ecomm.moderation.api.restrictions.ModerationRestriction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import xsna.wfq0;
import xsna.wmi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class tpa implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tpa(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.b;
        int i2 = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ej90 ej90Var = (ej90) obj2;
                t0c0 t0c0Var = (t0c0) obj;
                vpa.a(ej90Var.a, t0c0Var);
                vpa.a(ej90Var.b, t0c0Var);
                return s3q0.a;
            case 1:
                return kjw.g((Context) obj2, Uri.parse((String) obj), true);
            case 2:
                String str = (String) obj;
                List singletonList = Collections.singletonList((Serializer.StreamParcelable) obj2);
                ReentrantReadWriteLock reentrantReadWriteLock = wmi0.b;
                ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i3 = 0; i3 < readHoldCount; i3++) {
                    readLock.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    wmi0.a aVar = wmi0.d;
                    if (aVar == null) {
                        aVar = null;
                    }
                    aVar.o(str, singletonList);
                    s3q0 s3q0Var = s3q0.a;
                    while (i2 < readHoldCount) {
                        readLock.lock();
                        i2++;
                    }
                    writeLock.unlock();
                    return s3q0.a;
                } catch (Throwable th) {
                    while (i2 < readHoldCount) {
                        readLock.lock();
                        i2++;
                    }
                    writeLock.unlock();
                    throw th;
                }
            default:
                lml0 lml0Var = (lml0) obj;
                List<b5u> list = (List) obj2;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (b5u b5uVar : list) {
                    Good good = b5uVar.a;
                    if (good.h0) {
                        ModerationRestriction moderationRestriction = ModerationRestriction.NONE;
                        kc10 a = lml0Var.c.a();
                        ec10 ec10Var = new ec10(b5uVar.a);
                        wfq0.e eVar = wfq0.e.a;
                        a.getClass();
                        b5uVar = b5u.a(b5uVar, good, kc10.a(ec10Var, false, eVar), moderationRestriction, 2);
                    }
                    arrayList.add(b5uVar);
                }
                return arrayList;
        }
    }

    public /* synthetic */ tpa(vpa vpaVar, ej90 ej90Var, t0c0 t0c0Var) {
        this.b = 0;
        this.c = ej90Var;
        this.d = t0c0Var;
    }
}
