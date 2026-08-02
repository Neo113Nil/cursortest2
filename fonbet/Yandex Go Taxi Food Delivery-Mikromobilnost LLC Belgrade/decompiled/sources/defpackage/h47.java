package defpackage;

import com.yandex.go.due_timetable.domain.model.LoadingState;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class h47 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LoadingState.values().length];
        try {
            iArr[LoadingState.BLOCKING_LOADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LoadingState.NON_BLOCKING_LOADING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LoadingState.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[LoadingState.LOADED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[LoadingState.EMPTY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
