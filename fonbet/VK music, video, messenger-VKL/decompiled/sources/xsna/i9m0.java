package xsna;

import android.content.Context;
import com.vk.log.L;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class i9m0 implements izs {
    public final /* synthetic */ Ref$ObjectRef b;
    public final /* synthetic */ kam0 c;
    public final /* synthetic */ l9m0 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Context g;
    public final /* synthetic */ izs h;
    public final /* synthetic */ Ref$ObjectRef i;

    public /* synthetic */ i9m0(Ref$ObjectRef ref$ObjectRef, kam0 kam0Var, l9m0 l9m0Var, boolean z, boolean z2, Context context, izs izsVar, Ref$ObjectRef ref$ObjectRef2) {
        this.b = ref$ObjectRef;
        this.c = kam0Var;
        this.d = l9m0Var;
        this.e = z;
        this.f = z2;
        this.g = context;
        this.h = izsVar;
        this.i = ref$ObjectRef2;
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [T, java.lang.Object] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        L.i(th);
        wzs<Throwable, izs<? super gzs<s3q0>, s3q0>, gzs<s3q0>> wzsVar = this.c.d;
        final l9m0 l9m0Var = this.d;
        final boolean z = this.e;
        final boolean z2 = this.f;
        final Context context = this.g;
        final izs izsVar = this.h;
        final Ref$ObjectRef ref$ObjectRef = this.i;
        this.b.element = wzsVar.invoke(th, new izs() { // from class: xsna.h9m0
            @Override // xsna.izs
            public final Object invoke(Object obj2) {
                ((gzs) obj2).invoke();
                l9m0.this.p(z, z2, context, izsVar);
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) ref$ObjectRef.element;
                if (cVar != null) {
                    cVar.dispose();
                }
                return s3q0.a;
            }
        });
        return s3q0.a;
    }
}
