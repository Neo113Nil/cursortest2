package defpackage;

import com.yandex.fintechsdk.core.network.api.request.RestMethod;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class p6p {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RestMethod.values().length];
        try {
            iArr[RestMethod.DELETE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RestMethod.GET.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RestMethod.PATCH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[RestMethod.POST.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[RestMethod.PUT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
