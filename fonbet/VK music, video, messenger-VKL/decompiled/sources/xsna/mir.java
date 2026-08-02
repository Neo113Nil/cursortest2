package xsna;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.vk.log.L;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import org.chromium.base.TimeUtils;
import xsna.bkr;
import xsna.it80;
import xsna.mir;

/* compiled from: FirebaseConfig.kt */
/* loaded from: classes.dex */
public final class mir {
    public final boolean a;
    public final vjr b;
    public zjr c;
    public io.reactivex.rxjava3.disposables.c e;
    public final AtomicBoolean d = new AtomicBoolean();
    public final io.reactivex.rxjava3.subjects.d<it80<String>> f = io.reactivex.rxjava3.subjects.d.N0();
    public final io.reactivex.rxjava3.subjects.d<it80<String>> g = io.reactivex.rxjava3.subjects.d.N0();

    /* compiled from: FirebaseConfig.kt */
    public static abstract class a {

        /* compiled from: FirebaseConfig.kt */
        /* renamed from: xsna.mir$a$a, reason: collision with other inner class name */
        public static final class C3345a extends a {
            public final Exception a;

            public C3345a(Exception exc) {
                this.a = exc;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3345a) && epx.f(this.a, ((C3345a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Error(error=" + this.a + ')';
            }
        }

        /* compiled from: FirebaseConfig.kt */
        public static final class b extends a {
            public static final b a = new b();
        }

        /* compiled from: FirebaseConfig.kt */
        public static final class c extends a {
            public static final c a = new c();
        }
    }

    public mir(boolean z, vjr vjrVar) {
        this.a = z;
        this.b = vjrVar;
    }

    public static void b(a aVar, String str, io.reactivex.rxjava3.core.v vVar) {
        if (aVar instanceof a.b) {
            if (drm0.N(str)) {
                return;
            }
            it80.b.getClass();
            vVar.onNext(new it80(str));
            return;
        }
        if (aVar instanceof a.c) {
            it80.b.getClass();
            vVar.onNext(new it80(str));
        } else {
            if (!(aVar instanceof a.C3345a)) {
                throw new NoWhenBranchMatchedException();
            }
            it80.b.getClass();
            vVar.onNext(it80.a.a());
        }
    }

    public static void c(String str) {
        SharedPreferences sharedPreferences;
        String d = ((yuf0) vhr.d().b(yuf0.class)).a("firebase").d(str);
        if (drm0.N(d) || TextUtils.isEmpty(str) || (sharedPreferences = bl20.a) == null) {
            return;
        }
        sharedPreferences.edit().putString(str, d).apply();
    }

    public final void a(a aVar) {
        vjr vjrVar = this.b;
        b(aVar, vjrVar.a.getString("config_network_proxy", ""), this.f);
        b(aVar, vjrVar.a.getString("config_network_proxy_certs", ""), this.g);
    }

    public final void d(zjr zjrVar) {
        io.reactivex.rxjava3.disposables.c cVar = this.e;
        if (cVar != null) {
            cVar.dispose();
        }
        this.b.getClass();
        long j = TimeUtils.SECONDS_PER_HOUR;
        try {
            j = bl20.a.getLong("config_app_update_interval", TimeUtils.SECONDS_PER_HOUR);
        } catch (Exception unused) {
        }
        if (j > 0) {
            this.e = io.reactivex.rxjava3.core.q.R(j, TimeUnit.MINUTES).subscribe(new lir(new kir(0, this, zjrVar), 0), new n8r(new bod(1), 1));
        }
    }

    public final void e(final zjr zjrVar) {
        if (this.d.compareAndSet(false, true)) {
            L.e("Firebase start updating...");
            bkr.a aVar = new bkr.a();
            long j = this.a ? 1L : TimeUtils.SECONDS_PER_HOUR;
            if (j < 0) {
                throw new IllegalArgumentException(qlb0.a(j, "Minimum interval between fetches has to be a non-negative number. ", " is an invalid argument"));
            }
            aVar.b = j;
            final bkr bkrVar = new bkr(aVar);
            Tasks.call(zjrVar.b, new Callable() { // from class: xsna.yjr
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zjr zjrVar2 = zjr.this;
                    bkr bkrVar2 = bkrVar;
                    com.google.firebase.remoteconfig.internal.c cVar = zjrVar2.g;
                    synchronized (cVar.b) {
                        cVar.a.edit().putLong("fetch_timeout_in_seconds", bkrVar2.a).putLong("minimum_fetch_interval_in_seconds", bkrVar2.b).commit();
                    }
                    return null;
                }
            });
            Task<Boolean> a2 = zjrVar.a();
            final fir firVar = new fir(this, zjrVar);
            a2.addOnSuccessListener(new OnSuccessListener() { // from class: xsna.gir
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    fir.this.invoke(obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: xsna.hir
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    L.g("Firebase remote fetching config failure", exc);
                    mir mirVar = mir.this;
                    mirVar.d(zjrVar);
                    mirVar.a(new mir.a.C3345a(exc));
                }
            }).addOnCanceledListener(new OnCanceledListener() { // from class: xsna.iir
                @Override // com.google.android.gms.tasks.OnCanceledListener
                public final void onCanceled() {
                    L.e("Firebase remote fetching config cancel!");
                    mir mirVar = mir.this;
                    mirVar.d(zjrVar);
                    mirVar.a(mir.a.c.a);
                }
            }).addOnCompleteListener(new OnCompleteListener() { // from class: xsna.jir
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    mir.this.d.set(false);
                }
            });
        }
    }
}
