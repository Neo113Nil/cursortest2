package defpackage;

import com.yandex.messaging.paging.PagedLoader$LoadType;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class a890 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PagedLoader$LoadType.values().length];
        try {
            iArr[PagedLoader$LoadType.INIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PagedLoader$LoadType.APPEND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PagedLoader$LoadType.PREPEND.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
