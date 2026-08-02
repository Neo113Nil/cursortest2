package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.room.IMultiInstanceInvalidationCallback;
import androidx.room.IMultiInstanceInvalidationService;
import defpackage.at20;
import defpackage.er60;
import defpackage.ffx;
import defpackage.fzw;
import defpackage.ike;
import defpackage.tje;
import defpackage.tse;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes10.dex */
public final class f {
    public final String a;
    public final d b;
    public final Context c;
    public final tse d;
    public final AtomicBoolean e;
    public int f;
    public IMultiInstanceInvalidationService g;
    public final n0 h;
    public final at20 i;
    public final MultiInstanceInvalidationClient$invalidationCallback$1 j;
    public final MultiInstanceInvalidationClient$serviceConnection$1 k;

    /* JADX WARN: Type inference failed for: r1v10, types: [androidx.room.MultiInstanceInvalidationClient$serviceConnection$1] */
    /* JADX WARN: Type inference failed for: r1v9, types: [androidx.room.MultiInstanceInvalidationClient$invalidationCallback$1] */
    public f(Context context, String str, d dVar) {
        this.a = str;
        this.b = dVar;
        this.c = context.getApplicationContext();
        ike ikeVar = dVar.a.a;
        this.d = ikeVar == null ? null : ikeVar;
        this.e = new AtomicBoolean(true);
        this.h = ffx.b(0, 0, BufferOverflow.SUSPEND);
        this.i = new at20(this, dVar.b, false);
        this.j = new IMultiInstanceInvalidationCallback.Stub() { // from class: androidx.room.MultiInstanceInvalidationClient$invalidationCallback$1
            @Override // androidx.room.IMultiInstanceInvalidationCallback.Stub, androidx.room.IMultiInstanceInvalidationCallback
            public void onInvalidation(String[] tables) {
                f fVar = f.this;
                tje.N(fVar.d, null, null, new MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1(tables, fVar, null), 3);
            }
        };
        this.k = new ServiceConnection() { // from class: androidx.room.MultiInstanceInvalidationClient$serviceConnection$1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName name, IBinder service) {
                f.this.g = IMultiInstanceInvalidationService.Stub.asInterface(service);
                f fVar = f.this;
                fVar.getClass();
                try {
                    IMultiInstanceInvalidationService iMultiInstanceInvalidationService = fVar.g;
                    if (iMultiInstanceInvalidationService != null) {
                        fVar.f = iMultiInstanceInvalidationService.registerCallback(fVar.j, fVar.a);
                    }
                } catch (RemoteException unused) {
                }
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName name) {
                f.this.g = null;
            }
        };
    }

    public final fzw a(String[] strArr) {
        return new fzw(13, this.h, strArr);
    }

    public final void b(Intent intent) {
        if (this.e.compareAndSet(true, false)) {
            this.c.bindService(intent, this.k, 1);
            d dVar = this.b;
            LinkedHashMap linkedHashMap = dVar.d;
            o oVar = dVar.c;
            at20 at20Var = this.i;
            Pair g = oVar.g((String[]) at20Var.a);
            String[] strArr = (String[]) g.getFirst();
            int[] iArr = (int[]) g.getSecond();
            er60 er60Var = new er60(at20Var, iArr, strArr);
            ReentrantLock reentrantLock = dVar.e;
            reentrantLock.lock();
            try {
                er60 er60Var2 = linkedHashMap.containsKey(at20Var) ? (er60) kotlin.collections.b.g(at20Var, linkedHashMap) : (er60) linkedHashMap.put(at20Var, er60Var);
                reentrantLock.unlock();
                if (er60Var2 == null) {
                    oVar.h.a(iArr);
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final void c() {
        if (this.e.compareAndSet(false, true)) {
            at20 at20Var = this.i;
            d dVar = this.b;
            ReentrantLock reentrantLock = dVar.e;
            reentrantLock.lock();
            try {
                er60 er60Var = (er60) dVar.d.remove(at20Var);
                if (er60Var != null) {
                    o oVar = dVar.c;
                    if (oVar.h.b(er60Var.b)) {
                        androidx.room.coroutines.g.a(new InvalidationTracker$removeObserver$1(dVar, null));
                    }
                }
                try {
                    IMultiInstanceInvalidationService iMultiInstanceInvalidationService = this.g;
                    if (iMultiInstanceInvalidationService != null) {
                        iMultiInstanceInvalidationService.unregisterCallback(this.j, this.f);
                    }
                } catch (RemoteException unused) {
                }
                this.c.unbindService(this.k);
            } finally {
                reentrantLock.unlock();
            }
        }
    }
}
