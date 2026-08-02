package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.functions.l;
import io.reactivex.rxjava3.functions.n;
import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class ArrayListSupplier implements n<List<Object>>, l<Object, List<Object>> {
    private static final /* synthetic */ ArrayListSupplier[] $VALUES;
    public static final ArrayListSupplier INSTANCE;

    static {
        ArrayListSupplier arrayListSupplier = new ArrayListSupplier("INSTANCE", 0);
        INSTANCE = arrayListSupplier;
        $VALUES = new ArrayListSupplier[]{arrayListSupplier};
    }

    public ArrayListSupplier() {
        throw null;
    }

    public static ArrayListSupplier valueOf(String str) {
        return (ArrayListSupplier) Enum.valueOf(ArrayListSupplier.class, str);
    }

    public static ArrayListSupplier[] values() {
        return (ArrayListSupplier[]) $VALUES.clone();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public final List<Object> apply(Object obj) throws Throwable {
        return new ArrayList();
    }

    @Override // io.reactivex.rxjava3.functions.n
    public final List<Object> get() throws Throwable {
        return new ArrayList();
    }
}
