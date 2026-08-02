package defpackage;

import com.yandex.div2.DivGallery;

/* loaded from: classes.dex */
public abstract /* synthetic */ class gip0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DivGallery.ScrollMode.values().length];
        try {
            iArr[DivGallery.ScrollMode.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DivGallery.ScrollMode.PAGING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
