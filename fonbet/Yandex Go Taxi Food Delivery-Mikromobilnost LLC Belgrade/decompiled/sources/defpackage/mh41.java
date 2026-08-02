package defpackage;

import ru.yandex.taxi.messenger.domain.WebMessengerAnalyticsFacade$Action;
import ru.yandex.taxi.messenger.domain.WebMessengerAnalyticsFacade$Reason;
import ru.yandex.taxi.messenger.domain.WebMessengerAnalyticsFacade$Service;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class mh41 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[WebMessengerAnalyticsFacade$Service.values().length];
        try {
            iArr[WebMessengerAnalyticsFacade$Service.TAXI.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WebMessengerAnalyticsFacade$Service.MARKETPLACE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[WebMessengerAnalyticsFacade$Reason.values().length];
        try {
            iArr2[WebMessengerAnalyticsFacade$Reason.CLOSE_TAPPED.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[WebMessengerAnalyticsFacade$Reason.STATUS_CHANGED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[WebMessengerAnalyticsFacade$Reason.OTHER_CHAT_OPENED.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[WebMessengerAnalyticsFacade$Reason.BACK_PRESSED.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[WebMessengerAnalyticsFacade$Reason.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
        int[] iArr3 = new int[WebMessengerAnalyticsFacade$Action.values().length];
        try {
            iArr3[WebMessengerAnalyticsFacade$Action.CALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        c = iArr3;
    }
}
