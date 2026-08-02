package defpackage;

import com.yandex.messaging.internal.view.custom.ProgressIndicator$Companion$State;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class lt10 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ProgressIndicator$Companion$State.values().length];
        try {
            iArr[ProgressIndicator$Companion$State.Initial.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ProgressIndicator$Companion$State.Loading.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ProgressIndicator$Companion$State.Retry.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ProgressIndicator$Companion$State.Error.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ProgressIndicator$Companion$State.Loaded.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
