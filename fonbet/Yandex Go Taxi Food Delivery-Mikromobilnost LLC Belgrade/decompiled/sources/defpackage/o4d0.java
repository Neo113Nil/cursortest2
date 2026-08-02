package defpackage;

import com.yandex.plus.home.api.PlusSdkComponentLifecycleEvent;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class o4d0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PlusSdkComponentLifecycleEvent.values().length];
        try {
            iArr[PlusSdkComponentLifecycleEvent.FIRST_COMPONENT_CREATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlusSdkComponentLifecycleEvent.FIRST_COMPONENT_STARTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PlusSdkComponentLifecycleEvent.LAST_COMPONENT_STOPPED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PlusSdkComponentLifecycleEvent.LAST_COMPONENT_DESTROYED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
