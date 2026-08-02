package defpackage;

import com.yandex.go.rida.bids.controller.BidsControllerAction;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class op5 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BidsControllerAction.values().length];
        try {
            iArr[BidsControllerAction.OnAcceptRequested.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BidsControllerAction.OnAcceptSuccess.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BidsControllerAction.OnAcceptFailed.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[BidsControllerAction.OnTimerExpired.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[BidsControllerAction.OnCancelRequested.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[BidsControllerAction.OnCancelCompleted.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[BidsControllerAction.OnItemRemovedFromUi.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
    }
}
