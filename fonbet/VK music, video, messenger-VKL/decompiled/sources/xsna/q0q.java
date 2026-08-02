package xsna;

/* compiled from: EventStoreModule_StoreConfigFactory.java */
/* loaded from: classes.dex */
public final class q0q implements xhq<o0q> {

    /* compiled from: EventStoreModule_StoreConfigFactory.java */
    public static final class a {
        public static final q0q a = new q0q();
    }

    @Override // xsna.e9e0
    public final Object get() {
        zl5 zl5Var = o0q.a;
        if (zl5Var != null) {
            return zl5Var;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
