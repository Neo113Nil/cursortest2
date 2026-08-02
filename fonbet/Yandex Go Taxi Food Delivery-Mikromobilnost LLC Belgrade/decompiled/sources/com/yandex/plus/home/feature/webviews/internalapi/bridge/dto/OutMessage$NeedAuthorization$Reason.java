package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.ot80;
import defpackage.yi80;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$NeedAuthorization$Reason", "", "Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$NeedAuthorization$Reason;", "Companion", "ot80", "AUTHORIZATION_ACTION", Card.EXPIRED, "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OutMessage$NeedAuthorization$Reason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OutMessage$NeedAuthorization$Reason[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final OutMessage$NeedAuthorization$Reason AUTHORIZATION_ACTION;
    public static final ot80 Companion;
    public static final OutMessage$NeedAuthorization$Reason EXPIRED;

    static {
        OutMessage$NeedAuthorization$Reason outMessage$NeedAuthorization$Reason = new OutMessage$NeedAuthorization$Reason("AUTHORIZATION_ACTION", 0);
        AUTHORIZATION_ACTION = outMessage$NeedAuthorization$Reason;
        OutMessage$NeedAuthorization$Reason outMessage$NeedAuthorization$Reason2 = new OutMessage$NeedAuthorization$Reason(Card.EXPIRED, 1);
        EXPIRED = outMessage$NeedAuthorization$Reason2;
        OutMessage$NeedAuthorization$Reason[] outMessage$NeedAuthorization$ReasonArr = {outMessage$NeedAuthorization$Reason, outMessage$NeedAuthorization$Reason2};
        $VALUES = outMessage$NeedAuthorization$ReasonArr;
        $ENTRIES = a.a(outMessage$NeedAuthorization$ReasonArr);
        Companion = new ot80();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new yi80(19));
    }

    public static OutMessage$NeedAuthorization$Reason valueOf(String str) {
        return (OutMessage$NeedAuthorization$Reason) Enum.valueOf(OutMessage$NeedAuthorization$Reason.class, str);
    }

    public static OutMessage$NeedAuthorization$Reason[] values() {
        return (OutMessage$NeedAuthorization$Reason[]) $VALUES.clone();
    }
}
