package defpackage;

import com.ybsdk.feature.pin.api.entities.ReissueActionType;
import com.ybsdk.feature.pin.internal.screens.createpin.OnFinishStrategy;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class e7f {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ReissueActionType.values().length];
        try {
            iArr[ReissueActionType.TOO_MANY_ATTEMPTS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ReissueActionType.SETUP_PIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ReissueActionType.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[OnFinishStrategy.values().length];
        try {
            iArr2[OnFinishStrategy.EXIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[OnFinishStrategy.OPEN_INITIAL_PRESENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
