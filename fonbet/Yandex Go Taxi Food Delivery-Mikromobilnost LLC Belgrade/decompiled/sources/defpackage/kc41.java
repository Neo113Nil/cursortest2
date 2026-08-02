package defpackage;

import com.yandex.quark.js.QuarkJsState;
import com.yandex.quark.js.implementation.facade.PreferredDirectivePayloadFormat;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class kc41 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[PreferredDirectivePayloadFormat.values().length];
        try {
            iArr[PreferredDirectivePayloadFormat.JSON.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PreferredDirectivePayloadFormat.PROTO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[QuarkJsState.values().length];
        try {
            iArr2[QuarkJsState.NOT_CONNECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[QuarkJsState.DESTROYED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[QuarkJsState.CONNECTING.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[QuarkJsState.CONNECTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
