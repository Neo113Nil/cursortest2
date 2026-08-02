package xsna;

import kotlin.jvm.internal.Lambda;

/* compiled from: LottieDynamicProperties.kt */
/* loaded from: classes12.dex */
public final class n800<T> {
    public final T a;
    public final udy b;
    public final a c;

    /* compiled from: LottieDynamicProperties.kt */
    public static final class a extends Lambda implements izs<p800<T>, T> {
        final /* synthetic */ T $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(T t) {
            super(1);
            this.$value = t;
        }

        @Override // xsna.izs
        public final Object invoke(Object obj) {
            return this.$value;
        }
    }

    public n800() {
        throw null;
    }

    public n800(T t, udy udyVar, T t2) {
        a aVar = new a(t2);
        this.a = t;
        this.b = udyVar;
        this.c = aVar;
    }
}
