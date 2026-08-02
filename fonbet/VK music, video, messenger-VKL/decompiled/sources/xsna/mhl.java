package xsna;

import android.content.Context;
import android.view.View;
import kotlin.LazyThreadSafetyMode;

/* compiled from: DefaultLazyViewControllerFactory.kt */
/* loaded from: classes16.dex */
public final class mhl<V extends View> implements wut0 {
    public final izs<Context, V> b;
    public final wzs<V, rzt0, s3q0> c;

    /* compiled from: DefaultLazyViewControllerFactory.kt */
    public static final class a implements vut0 {
        public final Object b;
        public final /* synthetic */ mhl<V> c;

        public a(mhl<V> mhlVar, Context context) {
            this.c = mhlVar;
            this.b = msy.a(LazyThreadSafetyMode.NONE, new com.vk.movika.sdk.base.ui.l(8, mhlVar, context));
        }

        @Override // xsna.vut0
        public final void c(rzt0 rzt0Var) {
            this.c.c.invoke(getView(), rzt0Var);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.vut0
        public final V getView() {
            return (V) this.b.getValue();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public mhl(izs<? super Context, ? extends V> izsVar, wzs<? super V, ? super rzt0, s3q0> wzsVar) {
        this.b = izsVar;
        this.c = wzsVar;
    }

    @Override // xsna.wut0
    public final vut0 create(Context context) {
        return new a(this, context);
    }
}
