package xsna;

import com.vk.lists.c;
import com.vk.log.L;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;

/* compiled from: HighlightEditPresenter.kt */
/* loaded from: classes3.dex */
public final class a5v implements c.l<ppt> {
    public final /* synthetic */ b5v b;

    /* compiled from: HighlightEditPresenter.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    public a5v(b5v b5vVar) {
        this.b = b5vVar;
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<ppt> hj(com.vk.lists.c cVar, boolean z) {
        return ui(0, cVar);
    }

    @Override // com.vk.lists.c.l
    public final io.reactivex.rxjava3.core.q<ppt> ui(int i, com.vk.lists.c cVar) {
        b5v b5vVar = this.b;
        return b5vVar.h.b(i, b5vVar.d, cVar.k()).w().a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<ppt> qVar, boolean z, com.vk.lists.c cVar) {
        b5v b5vVar = this.b;
        b5vVar.b.b(qVar.subscribe(new b60(new z4v(z, b5vVar, 0), 28), new m20(new a(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 23)));
    }
}
