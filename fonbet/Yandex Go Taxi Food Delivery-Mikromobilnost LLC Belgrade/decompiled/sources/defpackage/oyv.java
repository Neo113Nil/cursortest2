package defpackage;

import com.yandex.messaging.input.InputState;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class oyv {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[InputState.values().length];
        try {
            iArr[InputState.EMPTY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InputState.WRITING_WITHOUT_AUTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[InputState.WRITING_WITH_AUTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[InputState.CHANNEL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[InputState.EDIT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[InputState.JOIN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[InputState.UNBLOCKING.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[InputState.AUTHORIZATION.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[InputState.AUTHORIZATION_WITHOUT_PHONE.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[InputState.SEARCH_NAVIGATION.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        a = iArr;
    }
}
