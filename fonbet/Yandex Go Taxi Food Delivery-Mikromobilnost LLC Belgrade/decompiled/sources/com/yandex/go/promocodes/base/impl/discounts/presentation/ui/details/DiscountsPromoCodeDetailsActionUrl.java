package com.yandex.go.promocodes.base.impl.discounts.presentation.ui.details;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.k4o;
import defpackage.kyh0;
import defpackage.tqj;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/go/promocodes/base/impl/discounts/presentation/ui/details/DiscountsPromoCodeDetailsActionUrl;", "", "", AuthSdkActivity.RESPONSE_TYPE_CODE, "Ljava/lang/String;", "a", "()Ljava/lang/String;", "", "loadingStringId", CA20Status.STATUS_USER_I, "c", "()I", "Companion", "tqj", "UNKNOWN", "SCOOTERS_USE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DiscountsPromoCodeDetailsActionUrl {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DiscountsPromoCodeDetailsActionUrl[] $VALUES;
    public static final tqj Companion;
    public static final DiscountsPromoCodeDetailsActionUrl SCOOTERS_USE;
    public static final DiscountsPromoCodeDetailsActionUrl UNKNOWN;
    private final String code;
    private final int loadingStringId;

    static {
        DiscountsPromoCodeDetailsActionUrl discountsPromoCodeDetailsActionUrl = new DiscountsPromoCodeDetailsActionUrl("UNKNOWN", 0, "", 0);
        UNKNOWN = discountsPromoCodeDetailsActionUrl;
        DiscountsPromoCodeDetailsActionUrl discountsPromoCodeDetailsActionUrl2 = new DiscountsPromoCodeDetailsActionUrl("SCOOTERS_USE", 1, "scooters_use", kyh0.promocodes_scooters_use_button_loading);
        SCOOTERS_USE = discountsPromoCodeDetailsActionUrl2;
        DiscountsPromoCodeDetailsActionUrl[] discountsPromoCodeDetailsActionUrlArr = {discountsPromoCodeDetailsActionUrl, discountsPromoCodeDetailsActionUrl2};
        $VALUES = discountsPromoCodeDetailsActionUrlArr;
        $ENTRIES = kotlin.enums.a.a(discountsPromoCodeDetailsActionUrlArr);
        Companion = new tqj();
    }

    public DiscountsPromoCodeDetailsActionUrl(String str, int i, String str2, int i2) {
        this.code = str2;
        this.loadingStringId = i2;
    }

    public static k4o b() {
        return $ENTRIES;
    }

    public static DiscountsPromoCodeDetailsActionUrl valueOf(String str) {
        return (DiscountsPromoCodeDetailsActionUrl) Enum.valueOf(DiscountsPromoCodeDetailsActionUrl.class, str);
    }

    public static DiscountsPromoCodeDetailsActionUrl[] values() {
        return (DiscountsPromoCodeDetailsActionUrl[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: c, reason: from getter */
    public final int getLoadingStringId() {
        return this.loadingStringId;
    }
}
