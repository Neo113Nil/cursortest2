package defpackage;

import com.yandex.go.antirobot.api.HostType;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class bmt {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[HostType.values().length];
        try {
            iArr[HostType.Narwhal.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[HostType.Taxi.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
