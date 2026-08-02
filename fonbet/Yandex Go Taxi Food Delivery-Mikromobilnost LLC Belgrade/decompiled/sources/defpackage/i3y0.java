package defpackage;

import com.yandex.go.taxi.order.chat.domain.model.MessagePresentationModel$State;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class i3y0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MessagePresentationModel$State.values().length];
        try {
            iArr[MessagePresentationModel$State.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MessagePresentationModel$State.PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
