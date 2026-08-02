package defpackage;

import com.yandex.go.chargers.order.completion.pre_finish.data.model.ChargersFinishProgressResponse;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class a1a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ChargersFinishProgressResponse.ProgressState.values().length];
        try {
            iArr[ChargersFinishProgressResponse.ProgressState.RUNNING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChargersFinishProgressResponse.ProgressState.FINISHED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ChargersFinishProgressResponse.ProgressState.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
