package xsna;

import android.app.Activity;
import android.content.Context;
import android.system.ErrnoException;
import android.system.OsConstants;
import com.vk.music.offline.api.model.MusicOfflineCacheStorage;
import com.vk.music.offline.api.model.storage.StorageEvent;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.Iterator;
import java.util.Set;
import kotlin.Lazy;

/* compiled from: MusicStorageTypeInteractorImpl.kt */
/* loaded from: classes.dex */
public final class n850 implements k850 {
    public final bpn0 a;
    public final bpn0 b;
    public final Lazy c;
    public final bpn0 d;
    public final bpn0 e = new bpn0(new yg9(this, 5));

    public n850(bpn0 bpn0Var, bpn0 bpn0Var2, Lazy lazy, bpn0 bpn0Var3) {
        this.a = bpn0Var;
        this.b = bpn0Var2;
        this.c = lazy;
        this.d = bpn0Var3;
        new bpn0(new uia(this, 4));
    }

    @Override // xsna.k850
    public final MusicOfflineCacheStorage a(MusicOfflineCacheStorage musicOfflineCacheStorage) {
        bpn0 bpn0Var = this.a;
        MusicOfflineCacheStorage a = ((o850) bpn0Var.getValue()).a(musicOfflineCacheStorage);
        Object obj = null;
        if (!a.l()) {
            a = null;
        }
        if (a == null) {
            Iterator<T> it = c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((MusicOfflineCacheStorage) next).l()) {
                    obj = next;
                    break;
                }
            }
            a = (MusicOfflineCacheStorage) obj;
            if (a == null) {
                MusicOfflineCacheStorage.Companion.getClass();
                a = MusicOfflineCacheStorage.EXTERNAL_OR_INTERNAL;
            }
        }
        MusicOfflineCacheStorage D = ((up40) this.c.getValue()).D(a, new ax0(this));
        ((o850) bpn0Var.getValue()).d(D);
        c63 c63Var = c63.a;
        f(c63.b(), StorageEvent.SD_CARD_REMOVED);
        return D;
    }

    @Override // xsna.k850
    public final Set<MusicOfflineCacheStorage> b() {
        return ((o850) this.a.getValue()).b();
    }

    @Override // xsna.k850
    public final Set<MusicOfflineCacheStorage> c() {
        return ((o850) this.a.getValue()).c();
    }

    @Override // xsna.k850
    public final io.reactivex.rxjava3.core.q<vgl0> d(Context context, StorageEvent storageEvent) {
        io.reactivex.rxjava3.internal.operators.observable.g0 a = ((i850) this.b.getValue()).a();
        qs6 qs6Var = new qs6(new l850(storageEvent, 0), 24);
        a.getClass();
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = new io.reactivex.rxjava3.internal.operators.observable.i0(a, qs6Var).a0(io.reactivex.rxjava3.android.schedulers.a.b());
        ow40 ow40Var = new ow40(new mgz(this, context, storageEvent), 2);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return a0.E(ow40Var, lVar, kVar, kVar);
    }

    @Override // xsna.k850
    public final boolean e(Throwable th) {
        ErrnoException errnoException;
        if (!((Boolean) this.e.getValue()).booleanValue()) {
            return false;
        }
        while (true) {
            errnoException = null;
            if (th == null) {
                break;
            }
            if (th.getClass().equals(ErrnoException.class)) {
                errnoException = (ErrnoException) th;
                break;
            }
            if (th.equals(th.getCause())) {
                break;
            }
            th = th.getCause();
        }
        if (errnoException == null || errnoException.errno != OsConstants.ENOSPC) {
            return false;
        }
        i850 i850Var = (i850) this.b.getValue();
        StorageEvent storageEvent = StorageEvent.NO_MEMORY;
        i850Var.getClass();
        c63 c63Var = c63.a;
        f(c63.b(), storageEvent);
        return true;
    }

    public final void f(Activity activity, StorageEvent... storageEventArr) {
        if (activity == null || storageEventArr.length == 0) {
            return;
        }
        itg0.i(6, ((i850) this.b.getValue()).a().t0(1L).a0(io.reactivex.rxjava3.android.schedulers.a.b()), null, new nt10(storageEventArr, activity, this), null);
    }
}
