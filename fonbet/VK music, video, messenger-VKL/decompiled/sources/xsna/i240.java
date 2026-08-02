package xsna;

import com.my.tracker.MyTrackerConfig;
import kotlin.Result;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class i240 implements Runnable {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i240(com.my.tracker.obfuscated.y0 y0Var, String str, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {
        this.c = y0Var;
        this.d = str;
        this.e = okHttpClientProvider;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // java.lang.Runnable
    public final void run() {
        Object failure;
        switch (this.b) {
            case 0:
                j240 j240Var = (j240) this.c;
                izs izsVar = (izs) this.d;
                ?? r2 = (FunctionReferenceImpl) this.e;
                if (!j240Var.c()) {
                    try {
                        izsVar.invoke(j240Var.b());
                        failure = s3q0.a;
                    } catch (Throwable th) {
                        failure = new Result.Failure(th);
                    }
                    Throwable a = Result.a(failure);
                    if (a != null) {
                        r2.invoke(a);
                        break;
                    }
                } else {
                    izsVar.invoke(j240Var.c);
                    break;
                }
                break;
            default:
                ((com.my.tracker.obfuscated.y0) this.c).b((String) this.d, (MyTrackerConfig.OkHttpClientProvider) this.e);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ i240(j240 j240Var, izs izsVar, izs izsVar2) {
        this.c = j240Var;
        this.d = izsVar;
        this.e = (FunctionReferenceImpl) izsVar2;
    }
}
