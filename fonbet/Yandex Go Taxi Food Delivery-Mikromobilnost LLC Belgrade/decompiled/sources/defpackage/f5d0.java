package defpackage;

import com.yandex.plus.adapter.auth.api.PlusAuthAdapter$Environment;
import com.yandex.plus.adapter.auth.api.PlusAuthAdapter$Theme;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class f5d0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[PlusAuthAdapter$Environment.values().length];
        try {
            iArr[PlusAuthAdapter$Environment.TESTING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlusAuthAdapter$Environment.PRODUCTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[PlusAuthAdapter$Theme.values().length];
        try {
            iArr2[PlusAuthAdapter$Theme.LIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[PlusAuthAdapter$Theme.DARK.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[PlusAuthAdapter$Theme.FOLLOW_SYSTEM.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
