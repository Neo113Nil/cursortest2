package xsna;

import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;

/* compiled from: RxAwait.kt */
/* loaded from: classes8.dex */
public final class tsg0 implements io.reactivex.rxjava3.core.v<Object> {
    public io.reactivex.rxjava3.disposables.c b;
    public Object c;
    public boolean d;
    public final /* synthetic */ lq9 e;
    public final /* synthetic */ q230 f;

    /* compiled from: RxAwait.kt */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[q230.values().length];
            try {
                iArr[q230.FIRST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q230.FIRST_OR_DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q230.LAST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[q230.SINGLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: RxAwait.kt */
    public static final class b implements izs<Throwable, s3q0> {
        public final /* synthetic */ io.reactivex.rxjava3.disposables.c b;

        public b(io.reactivex.rxjava3.disposables.c cVar) {
            this.b = cVar;
        }

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            this.b.dispose();
            return s3q0.a;
        }
    }

    public tsg0(lq9 lq9Var, q230 q230Var) {
        this.e = lq9Var;
        this.f = q230Var;
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onComplete() {
        boolean z = this.d;
        lq9 lq9Var = this.e;
        if (z) {
            if (lq9Var.isActive()) {
                lq9Var.resumeWith(this.c);
                return;
            }
            return;
        }
        q230 q230Var = q230.FIRST_OR_DEFAULT;
        q230 q230Var2 = this.f;
        if (q230Var2 == q230Var) {
            lq9Var.resumeWith(null);
        } else if (lq9Var.isActive()) {
            lq9Var.resumeWith(new Result.Failure(new NoSuchElementException("No value received via onNext for " + q230Var2)));
        }
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
        this.e.resumeWith(new Result.Failure(th));
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onNext(Object obj) {
        int[] iArr = a.$EnumSwitchMapping$0;
        q230 q230Var = this.f;
        int i = iArr[q230Var.ordinal()];
        lq9 lq9Var = this.e;
        if (i == 1 || i == 2) {
            if (this.d) {
                return;
            }
            this.d = true;
            lq9Var.resumeWith(obj);
            io.reactivex.rxjava3.disposables.c cVar = this.b;
            (cVar != null ? cVar : null).dispose();
            return;
        }
        if (i != 3 && i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if (q230Var != q230.SINGLE || !this.d) {
            this.c = obj;
            this.d = true;
            return;
        }
        if (lq9Var.isActive()) {
            lq9Var.resumeWith(new Result.Failure(new IllegalArgumentException("More than one onNext value for " + q230Var)));
        }
        io.reactivex.rxjava3.disposables.c cVar2 = this.b;
        (cVar2 != null ? cVar2 : null).dispose();
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
        this.b = cVar;
        this.e.r(new b(cVar));
    }
}
