package xsna;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.wallet.zzaa;
import com.google.android.gms.internal.wallet.zzab;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
/* loaded from: classes13.dex */
public final class rax0 {
    public static final com.google.android.gms.common.api.a<a> a = new com.google.android.gms.common.api.a<>("Wallet.API", new exz0(), new a.g());

    /* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
    public static final class a implements a.d.InterfaceC0112a {
        public final int b;
        public final int c;
        public final boolean d;

        /* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
        /* renamed from: xsna.rax0$a$a, reason: collision with other inner class name */
        public static final class C3602a {
            public int a = 3;
        }

        public a() {
            this(new C3602a());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return dq70.b(Integer.valueOf(this.b), Integer.valueOf(aVar.b)) && dq70.b(Integer.valueOf(this.c), Integer.valueOf(aVar.c)) && dq70.b(null, null) && dq70.b(Boolean.valueOf(this.d), Boolean.valueOf(aVar.d));
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), null, Boolean.valueOf(this.d)});
        }

        public a(C3602a c3602a) {
            this.b = c3602a.a;
            this.c = 1;
            this.d = true;
        }
    }

    /* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
    public static abstract class b<R extends qdg0> extends com.google.android.gms.common.api.internal.a<R, com.google.android.gms.internal.wallet.zzv> {
        public b(com.google.android.gms.common.api.c cVar) {
            super(rax0.a, cVar);
        }

        @Override // com.google.android.gms.common.api.internal.a
        /* renamed from: zza, reason: merged with bridge method [inline-methods] */
        public abstract void doExecute(com.google.android.gms.internal.wallet.zzv zzvVar) throws RemoteException;
    }

    static {
        new com.google.android.gms.internal.wallet.zzs();
        new zzaa();
        new zzab();
    }

    /* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
    public static abstract class c extends b<Status> {
        public c(com.google.android.gms.common.api.c cVar) {
            super(cVar);
        }

        @Override // com.google.android.gms.common.api.internal.BasePendingResult
        public /* synthetic */ qdg0 createFailedResult(Status status) {
            return status;
        }
    }
}
