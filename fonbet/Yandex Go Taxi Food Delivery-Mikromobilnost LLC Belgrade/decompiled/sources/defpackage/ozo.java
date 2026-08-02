package defpackage;

import com.yandex.fintechsdk.features.bdui.internal.presentation.action.ftrequest.ErrorBodyLoggingRule$Type;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class ozo {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ErrorBodyLoggingRule$Type.values().length];
        try {
            iArr[ErrorBodyLoggingRule$Type.Skip.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ErrorBodyLoggingRule$Type.Full.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ErrorBodyLoggingRule$Type.Partial.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
