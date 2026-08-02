package defpackage;

import com.yandex.go.places.api.navigation.OpenNavigatorActionSubtype;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class nvs {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[OpenNavigatorActionSubtype.values().length];
        try {
            iArr[OpenNavigatorActionSubtype.GO_VIA_ACTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OpenNavigatorActionSubtype.GO_TO_ACTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
