package defpackage;

import com.yandex.go.flex.screens.common.flexible.layout.manager.AdapterEvents;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class onr {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AdapterEvents.values().length];
        try {
            iArr[AdapterEvents.ADD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AdapterEvents.REMOVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AdapterEvents.MOVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AdapterEvents.UPDATE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
