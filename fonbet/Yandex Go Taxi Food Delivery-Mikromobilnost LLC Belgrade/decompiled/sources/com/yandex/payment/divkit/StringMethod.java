package com.yandex.payment.divkit;

import com.adjust.sdk.Constants;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/payment/divkit/StringMethod;", "", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "SBP", "NEW_SBP_TOKEN", "SBP_TOKEN", "NEW_CARD_LIGHT", "NEW_CARD_DARK", "ADD_CARD", "YB", "CARD", "GOOGLE", "CASH", "SPLIT", "CHALLENGE_POLLING", "divkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StringMethod {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ StringMethod[] $VALUES;
    public static final StringMethod ADD_CARD;
    public static final StringMethod CARD;
    public static final StringMethod CASH;
    public static final StringMethod CHALLENGE_POLLING;
    public static final StringMethod GOOGLE;
    public static final StringMethod NEW_CARD_DARK;
    public static final StringMethod NEW_CARD_LIGHT;
    public static final StringMethod NEW_SBP_TOKEN;
    public static final StringMethod SBP;
    public static final StringMethod SBP_TOKEN;
    public static final StringMethod SPLIT;
    public static final StringMethod YB;
    private final String value;

    static {
        StringMethod stringMethod = new StringMethod("SBP", 0, "sbp");
        SBP = stringMethod;
        StringMethod stringMethod2 = new StringMethod("NEW_SBP_TOKEN", 1, "new_sbp_token");
        NEW_SBP_TOKEN = stringMethod2;
        StringMethod stringMethod3 = new StringMethod("SBP_TOKEN", 2, "sbp_token");
        SBP_TOKEN = stringMethod3;
        StringMethod stringMethod4 = new StringMethod("NEW_CARD_LIGHT", 3, "add_new_card_light");
        NEW_CARD_LIGHT = stringMethod4;
        StringMethod stringMethod5 = new StringMethod("NEW_CARD_DARK", 4, "add_new_card_dark");
        NEW_CARD_DARK = stringMethod5;
        StringMethod stringMethod6 = new StringMethod("ADD_CARD", 5, "add_new_card");
        ADD_CARD = stringMethod6;
        StringMethod stringMethod7 = new StringMethod("YB", 6, "plus_card");
        YB = stringMethod7;
        StringMethod stringMethod8 = new StringMethod("CARD", 7, "card");
        CARD = stringMethod8;
        StringMethod stringMethod9 = new StringMethod("GOOGLE", 8, Constants.REFERRER_API_GOOGLE);
        GOOGLE = stringMethod9;
        StringMethod stringMethod10 = new StringMethod("CASH", 9, "cash");
        CASH = stringMethod10;
        StringMethod stringMethod11 = new StringMethod("SPLIT", 10, "split");
        SPLIT = stringMethod11;
        StringMethod stringMethod12 = new StringMethod("CHALLENGE_POLLING", 11, "challenge_polling");
        CHALLENGE_POLLING = stringMethod12;
        StringMethod[] stringMethodArr = {stringMethod, stringMethod2, stringMethod3, stringMethod4, stringMethod5, stringMethod6, stringMethod7, stringMethod8, stringMethod9, stringMethod10, stringMethod11, stringMethod12};
        $VALUES = stringMethodArr;
        $ENTRIES = a.a(stringMethodArr);
    }

    public StringMethod(String str, int i, String str2) {
        this.value = str2;
    }

    public static StringMethod valueOf(String str) {
        return (StringMethod) Enum.valueOf(StringMethod.class, str);
    }

    public static StringMethod[] values() {
        return (StringMethod[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
