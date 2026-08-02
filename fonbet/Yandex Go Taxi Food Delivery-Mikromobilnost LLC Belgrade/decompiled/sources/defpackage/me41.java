package defpackage;

import com.yandex.quark.contracts.theme.ThemeMode;
import com.yandex.quark.webchat.js.WebDataFormat;
import com.yandex.quark.webchat.params.WebChatParams;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class me41 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[ThemeMode.values().length];
        try {
            iArr[ThemeMode.Light.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ThemeMode.Dark.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ThemeMode.AutoSwitch.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[WebChatParams.DialogSessionMode.values().length];
        try {
            iArr2[WebChatParams.DialogSessionMode.NATIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[WebChatParams.DialogSessionMode.SPLIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[WebChatParams.DialogSessionMode.WEB.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
        int[] iArr3 = new int[WebDataFormat.values().length];
        try {
            iArr3[WebDataFormat.JSON.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[WebDataFormat.PROTO.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        c = iArr3;
    }
}
