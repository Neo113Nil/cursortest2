package xsna;

/* compiled from: ReflectionFactory.java */
/* loaded from: classes11.dex */
public final class hpf0 {
    public static String a(h0t h0tVar) {
        String obj = h0tVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }
}
