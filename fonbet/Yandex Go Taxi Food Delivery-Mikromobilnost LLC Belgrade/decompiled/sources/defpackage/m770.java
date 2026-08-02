package defpackage;

import com.yandex.go.flex.common.api.actions.OpenWebAction;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class m770 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[OpenWebAction.AuthType.values().length];
        try {
            iArr[OpenWebAction.AuthType.TOKEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OpenWebAction.AuthType.COOKIES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OpenWebAction.AuthType.NO_AUTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
