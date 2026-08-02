package xsna;

import com.vk.log.L;
import kotlin.Lazy;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;

/* compiled from: VoipExecutorImpl.kt */
/* loaded from: classes11.dex */
public final class bow0 implements aow0 {
    public final Lazy<fhw0> a;

    /* compiled from: VoipExecutorImpl.kt */
    /* loaded from: classes7.dex */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        public a(Object obj) {
            super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public bow0(Lazy<? extends fhw0> lazy) {
        this.a = lazy;
    }

    @Override // xsna.aow0
    public final void a(gzs<s3q0> gzsVar) {
        io.reactivex.rxjava3.kotlin.c.d(this.a.getValue().a(), new sxn(1, gzsVar), new a(L.a));
    }
}
