package defpackage;

import com.yandex.plus.core.benchmark.Benchmark$State;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class nl5 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Benchmark$State.values().length];
        try {
            iArr[Benchmark$State.NOT_STARTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Benchmark$State.STARTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Benchmark$State.STOPPED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
