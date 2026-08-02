package xsna;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.p7j;

/* compiled from: ExtensionWindowBackendApi1.kt */
/* loaded from: classes12.dex */
public class hdq extends gdq {
    public final WindowLayoutComponent a;
    public final p7j b;
    public final ReentrantLock c = new ReentrantLock();
    public final LinkedHashMap d = new LinkedHashMap();
    public final LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();

    /* compiled from: ExtensionWindowBackendApi1.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<WindowLayoutInfo, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(WindowLayoutInfo windowLayoutInfo) {
            ((MulticastConsumer) this.receiver).accept(windowLayoutInfo);
            return s3q0.a;
        }
    }

    public hdq(WindowLayoutComponent windowLayoutComponent, p7j p7jVar) {
        this.a = windowLayoutComponent;
        this.b = p7jVar;
    }

    @Override // xsna.gdq, xsna.opx0
    public void a(Context context, Executor executor, o7j<erx0> o7jVar) {
        LinkedHashMap linkedHashMap = this.d;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.e;
            if (multicastConsumer != null) {
                multicastConsumer.a(o7jVar);
                linkedHashMap2.put(o7jVar, context);
            } else {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                linkedHashMap.put(context, multicastConsumer2);
                linkedHashMap2.put(o7jVar, context);
                multicastConsumer2.a(o7jVar);
                if (!(context instanceof Activity)) {
                    multicastConsumer2.accept(new WindowLayoutInfo(EmptyList.b));
                    reentrantLock.unlock();
                    return;
                } else {
                    this.f.put(multicastConsumer2, this.b.a(this.a, fpf0.a(WindowLayoutInfo.class), (Activity) context, new a(1, multicastConsumer2, MulticastConsumer.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0)));
                }
            }
            s3q0 s3q0Var = s3q0.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // xsna.gdq, xsna.opx0
    public void b(o7j<erx0> o7jVar) {
        LinkedHashMap linkedHashMap = this.d;
        LinkedHashMap linkedHashMap2 = this.e;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(o7jVar);
            if (context == null) {
                reentrantLock.unlock();
                return;
            }
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
            if (multicastConsumer == null) {
                reentrantLock.unlock();
                return;
            }
            LinkedHashSet linkedHashSet = multicastConsumer.e;
            ReentrantLock reentrantLock2 = multicastConsumer.c;
            reentrantLock2.lock();
            try {
                linkedHashSet.remove(o7jVar);
                reentrantLock2.unlock();
                linkedHashMap2.remove(o7jVar);
                if (linkedHashSet.isEmpty()) {
                    linkedHashMap.remove(context);
                    p7j.b bVar = (p7j.b) this.f.remove(multicastConsumer);
                    if (bVar != null) {
                        bVar.dispose();
                    }
                }
                s3q0 s3q0Var = s3q0.a;
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
