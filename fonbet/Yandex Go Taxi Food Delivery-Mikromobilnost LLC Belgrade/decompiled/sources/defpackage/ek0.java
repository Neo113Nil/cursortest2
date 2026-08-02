package defpackage;

import com.yandex.go.places.models.data.entities.network.actions.AddVideoInQueueAction;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class ek0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AddVideoInQueueAction.Operation.values().length];
        try {
            iArr[AddVideoInQueueAction.Operation.ADD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AddVideoInQueueAction.Operation.REMOVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AddVideoInQueueAction.Operation.RE_ADD_TO_END.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
