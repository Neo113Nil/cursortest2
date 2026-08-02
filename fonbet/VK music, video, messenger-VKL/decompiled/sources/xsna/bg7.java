package xsna;

import android.content.Context;
import com.google.android.gms.auth.blockstore.DeleteBytesRequest;
import com.google.android.gms.internal.auth_blockstore.zzaa;
import com.google.android.gms.tasks.Task;
import com.vk.dto.common.id.UserId;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.collections.EmptyList;
import xsna.c2r0;

/* compiled from: BlockstoreUsersStore.kt */
/* loaded from: classes11.dex */
public final class bg7 implements c2r0 {
    public static final b g = new b();
    public final c2r0 b;
    public final Executor c;
    public final io.reactivex.rxjava3.core.w d;
    public final Object e = msy.a(LazyThreadSafetyMode.NONE, new ag7(0));
    public final AtomicBoolean f = new AtomicBoolean(false);

    /* compiled from: BlockstoreUsersStore.kt */
    /* loaded from: classes6.dex */
    public static final class a extends RuntimeException {
        private final String message;

        public a(String str) {
            super(str);
            this.message = str;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.message;
        }
    }

    /* compiled from: BlockstoreUsersStore.kt */
    public static final class b {
        public static io.reactivex.rxjava3.core.x a(Context context) {
            wf7 b = b(context);
            if (b != null) {
                DeleteBytesRequest.a aVar = new DeleteBytesRequest.a();
                aVar.b(true);
                Task<Boolean> deleteBytes = b.deleteBytes(aVar.a());
                if (deleteBytes != null) {
                    return new io.reactivex.rxjava3.internal.operators.single.o(m4s.E(deleteBytes), new fu0(new cg7(context, 0), 4));
                }
            }
            return io.reactivex.rxjava3.core.x.k(Boolean.FALSE);
        }

        public static wf7 b(Context context) {
            Object failure;
            try {
                failure = new zzaa(context);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            return (wf7) failure;
        }
    }

    /* compiled from: BlockstoreUsersStore.kt */
    public static final class c {

        /* compiled from: BlockstoreUsersStore.kt */
        public static final class a {
            public static final a c = new a(0, 0);
            public final int a;
            public final long b;

            public a(int i, long j) {
                this.a = i;
                this.b = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a == aVar.a && this.b == aVar.b;
            }

            public final int hashCode() {
                return Long.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Data(expiresInSeconds=");
                sb.append(this.a);
                sb.append(", lastLaunchMs=");
                return vu5.a(')', this.b, sb);
            }
        }
    }

    public bg7(c2r0 c2r0Var, Executor executor, io.reactivex.rxjava3.core.w wVar) {
        this.b = c2r0Var;
        this.c = executor;
        this.d = wVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public final io.reactivex.rxjava3.core.x<List<c2r0.b>> a(Context context) {
        io.reactivex.rxjava3.core.x rVar;
        g.getClass();
        wf7 b2 = b.b(context);
        if (b2 == null) {
            return io.reactivex.rxjava3.core.x.k(EmptyList.b);
        }
        c cVar = (c) this.e.getValue();
        cVar.getClass();
        wf7 b3 = b.b(context);
        if (b3 == null) {
            rVar = io.reactivex.rxjava3.core.x.k(c.a.c);
        } else {
            Task<Boolean> isEndToEndEncryptionAvailable = b3.isEndToEndEncryptionAvailable();
            Executor executor = this.c;
            rVar = new io.reactivex.rxjava3.internal.operators.single.r(m4s.F(isEndToEndEncryptionAvailable, executor), new yi2(new nv2(b3, executor, cVar), 3));
        }
        int i = 7;
        io.reactivex.rxjava3.internal.operators.single.y l = new io.reactivex.rxjava3.internal.operators.single.r(rVar, new bl(new by5(1, b2, this), i)).l(new w7(new v7(10), i));
        io.reactivex.rxjava3.core.w wVar = this.d;
        int i2 = 4;
        return new io.reactivex.rxjava3.internal.operators.single.i(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.o(l.q(wVar).m(wVar), new sf(new ot(7), 5)), new tf(new g84(1, this, context), i2)).h(new ji3(new qt0(5), i2)), new l46(context, 1));
    }

    @Override // xsna.c2r0
    public final boolean b(Context context, UserId userId) {
        if (k0x.c(context)) {
            g.getClass();
            wf7 b2 = b.b(context);
            if (b2 != null) {
                DeleteBytesRequest.a aVar = new DeleteBytesRequest.a();
                aVar.b(false);
                aVar.c(Collections.singletonList(String.valueOf(userId.b)));
                wp80.i(m4s.F(b2.deleteBytes(aVar.a()), this.c).q(this.d), new ut6(this, context, userId, 1), new qm0(3));
                return true;
            }
        }
        return false;
    }

    @Override // xsna.c2r0
    public final io.reactivex.rxjava3.core.x<List<c2r0.b>> c(Context context, boolean z) {
        return !k0x.c(context) ? io.reactivex.rxjava3.core.x.k(EmptyList.b) : new File(context.getNoBackupFilesDir(), "blockstoreCompleted").exists() ? io.reactivex.rxjava3.core.x.k(EmptyList.b) : a(context).s(5L, TimeUnit.SECONDS, this.d, null);
    }

    @Override // xsna.c2r0
    public final List<c2r0.b> h(Context context, boolean z) {
        if (!k0x.c(context)) {
            return EmptyList.b;
        }
        if (new File(context.getNoBackupFilesDir(), "blockstoreCompleted").exists()) {
            return EmptyList.b;
        }
        List<c2r0.b> list = (List) wp80.a(a(context).s(5L, TimeUnit.SECONDS, this.d, null));
        return list == null ? EmptyList.b : list;
    }

    @Override // xsna.c2r0
    public final boolean i(Context context, UserId userId) {
        return false;
    }

    @Override // xsna.c2r0
    public final boolean j(Context context, c2r0.b bVar) {
        return k(context, bVar);
    }

    @Override // xsna.c2r0
    public final boolean k(Context context, c2r0.b bVar) {
        if (!fkq0.d(bVar.d()) || drm0.N(bVar.a()) || !k0x.c(context)) {
            return false;
        }
        g.getClass();
        wf7 b2 = b.b(context);
        if (b2 == null) {
            return false;
        }
        wp80.i(new io.reactivex.rxjava3.internal.operators.single.r(m4s.F(b2.isEndToEndEncryptionAvailable(), this.c), new n7(new yf7(bVar, b2, this, 0), 5)), new a60(7), new ht(6));
        return true;
    }
}
