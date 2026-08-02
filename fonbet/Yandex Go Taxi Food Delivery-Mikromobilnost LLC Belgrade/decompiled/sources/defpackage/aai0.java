package defpackage;

import com.yandex.go.flex.common.data.bdui.RawResponseBody$State;

/* loaded from: classes.dex */
public abstract /* synthetic */ class aai0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RawResponseBody$State.values().length];
        try {
            iArr[RawResponseBody$State.INITIAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RawResponseBody$State.PARSED_TO_STRING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RawResponseBody$State.TERMINAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
