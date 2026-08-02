package xsna;

/* compiled from: SystemLibraryLoader.java */
/* loaded from: classes12.dex */
public final class tqn0 {
    public final String a(String str) {
        return (str.startsWith("lib") && str.endsWith(".so")) ? str : System.mapLibraryName(str);
    }
}
