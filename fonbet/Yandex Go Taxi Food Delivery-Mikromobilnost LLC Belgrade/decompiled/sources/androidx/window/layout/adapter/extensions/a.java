package androidx.window.layout.adapter.extensions;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import defpackage.bzo;
import defpackage.e9e;
import defpackage.g9e;
import defpackage.qoi0;
import defpackage.yfa;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.EmptyList;

/* loaded from: classes10.dex */
public class a extends bzo {
    public final WindowLayoutComponent a;
    public final yfa b;
    public final ReentrantLock c = new ReentrantLock();
    public final LinkedHashMap d = new LinkedHashMap();
    public final LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();

    public a(WindowLayoutComponent windowLayoutComponent, yfa yfaVar) {
        this.a = windowLayoutComponent;
        this.b = yfaVar;
    }

    @Override // defpackage.bzo, defpackage.z551
    public void a(Context context, Executor executor, e9e e9eVar) {
        LinkedHashMap linkedHashMap = this.d;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.e;
            if (multicastConsumer != null) {
                multicastConsumer.a(e9eVar);
                linkedHashMap2.put(e9eVar, context);
            } else {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                linkedHashMap.put(context, multicastConsumer2);
                linkedHashMap2.put(e9eVar, context);
                multicastConsumer2.a(e9eVar);
                if (!(context instanceof Activity)) {
                    multicastConsumer2.accept(new WindowLayoutInfo(EmptyList.a));
                    reentrantLock.unlock();
                    return;
                } else {
                    this.f.put(multicastConsumer2, this.b.c(this.a, qoi0.a(WindowLayoutInfo.class), (Activity) context, new ExtensionWindowBackendApi1$registerLayoutChangeCallback$1$2$disposableToken$1(1, multicastConsumer2, MulticastConsumer.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0)));
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.bzo, defpackage.z551
    public void b(e9e e9eVar) {
        LinkedHashMap linkedHashMap = this.d;
        LinkedHashMap linkedHashMap2 = this.e;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(e9eVar);
            if (context == null) {
                return;
            }
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
            if (multicastConsumer == null) {
                return;
            }
            LinkedHashSet linkedHashSet = multicastConsumer.w;
            ReentrantLock reentrantLock2 = multicastConsumer.b;
            reentrantLock2.lock();
            try {
                linkedHashSet.remove(e9eVar);
                reentrantLock2.unlock();
                linkedHashMap2.remove(e9eVar);
                if (linkedHashSet.isEmpty()) {
                    linkedHashMap.remove(context);
                    g9e g9eVar = (g9e) this.f.remove(multicastConsumer);
                    if (g9eVar != null) {
                        g9eVar.a.invoke(g9eVar.b, g9eVar.c);
                    }
                }
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
