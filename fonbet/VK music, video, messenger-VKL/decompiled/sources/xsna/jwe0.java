package xsna;

import java.util.Random;
import java.util.function.Supplier;

/* compiled from: RandomSupplier.java */
/* loaded from: classes8.dex */
public final class jwe0 {
    public static Supplier<Random> a() {
        return "Dalvik".equals(System.getProperty("java.vm.name")) ? z82.INSTANCE : new iwe0(0);
    }
}
