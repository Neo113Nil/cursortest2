package defpackage;

/* loaded from: classes10.dex */
public interface eav extends ybi0 {
    public static final x34 j2;
    public static final x34 k2;
    public static final x34 l2;

    static {
        Class cls = Integer.TYPE;
        j2 = new x34("camerax.core.imageInput.inputFormat", cls, null);
        k2 = new x34("camerax.core.imageInput.secondaryInputFormat", cls, null);
        l2 = new x34("camerax.core.imageInput.inputDynamicRange", q8n.class, null);
    }

    default int getInputFormat() {
        return ((Integer) f(j2)).intValue();
    }

    default q8n o() {
        q8n q8nVar = (q8n) g(l2, q8n.c);
        q8nVar.getClass();
        return q8nVar;
    }
}
