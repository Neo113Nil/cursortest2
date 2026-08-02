package xsna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Predicates.java */
/* loaded from: classes13.dex */
public abstract class mxc0 implements jxc0<Object> {
    private static final /* synthetic */ mxc0[] $VALUES;
    public static final mxc0 ALWAYS_FALSE;
    public static final mxc0 ALWAYS_TRUE;
    public static final mxc0 IS_NULL;
    public static final mxc0 NOT_NULL;

    static {
        mxc0 mxc0Var = new mxc0() { // from class: xsna.mxc0.a
            @Override // xsna.jxc0
            public final boolean apply(Object obj) {
                return true;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.alwaysTrue()";
            }
        };
        ALWAYS_TRUE = mxc0Var;
        mxc0 mxc0Var2 = new mxc0() { // from class: xsna.mxc0.b
            @Override // xsna.jxc0
            public final boolean apply(Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.alwaysFalse()";
            }
        };
        ALWAYS_FALSE = mxc0Var2;
        mxc0 mxc0Var3 = new mxc0() { // from class: xsna.mxc0.c
            @Override // xsna.jxc0
            public final boolean apply(Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.isNull()";
            }
        };
        IS_NULL = mxc0Var3;
        mxc0 mxc0Var4 = new mxc0() { // from class: xsna.mxc0.d
            @Override // xsna.jxc0
            public final boolean apply(Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.notNull()";
            }
        };
        NOT_NULL = mxc0Var4;
        $VALUES = new mxc0[]{mxc0Var, mxc0Var2, mxc0Var3, mxc0Var4};
    }

    public mxc0() {
        throw null;
    }

    public static mxc0 valueOf(String str) {
        return (mxc0) Enum.valueOf(mxc0.class, str);
    }

    public static mxc0[] values() {
        return (mxc0[]) $VALUES.clone();
    }
}
