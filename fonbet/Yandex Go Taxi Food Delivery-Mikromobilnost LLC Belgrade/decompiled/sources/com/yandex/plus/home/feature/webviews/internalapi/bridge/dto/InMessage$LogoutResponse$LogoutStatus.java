package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto;

import defpackage.gsq0;
import defpackage.hmv;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.syu;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage$LogoutResponse$LogoutStatus", "", "Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage$LogoutResponse$LogoutStatus;", "Companion", "hmv", "SUCCESS", "FAILED", "CANCELED", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InMessage$LogoutResponse$LogoutStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ InMessage$LogoutResponse$LogoutStatus[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final InMessage$LogoutResponse$LogoutStatus CANCELED;
    public static final hmv Companion;
    public static final InMessage$LogoutResponse$LogoutStatus FAILED;
    public static final InMessage$LogoutResponse$LogoutStatus SUCCESS;

    static {
        InMessage$LogoutResponse$LogoutStatus inMessage$LogoutResponse$LogoutStatus = new InMessage$LogoutResponse$LogoutStatus("SUCCESS", 0);
        SUCCESS = inMessage$LogoutResponse$LogoutStatus;
        InMessage$LogoutResponse$LogoutStatus inMessage$LogoutResponse$LogoutStatus2 = new InMessage$LogoutResponse$LogoutStatus("FAILED", 1);
        FAILED = inMessage$LogoutResponse$LogoutStatus2;
        InMessage$LogoutResponse$LogoutStatus inMessage$LogoutResponse$LogoutStatus3 = new InMessage$LogoutResponse$LogoutStatus("CANCELED", 2);
        CANCELED = inMessage$LogoutResponse$LogoutStatus3;
        InMessage$LogoutResponse$LogoutStatus[] inMessage$LogoutResponse$LogoutStatusArr = {inMessage$LogoutResponse$LogoutStatus, inMessage$LogoutResponse$LogoutStatus2, inMessage$LogoutResponse$LogoutStatus3};
        $VALUES = inMessage$LogoutResponse$LogoutStatusArr;
        $ENTRIES = a.a(inMessage$LogoutResponse$LogoutStatusArr);
        Companion = new hmv();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new syu(25));
    }

    public static InMessage$LogoutResponse$LogoutStatus valueOf(String str) {
        return (InMessage$LogoutResponse$LogoutStatus) Enum.valueOf(InMessage$LogoutResponse$LogoutStatus.class, str);
    }

    public static InMessage$LogoutResponse$LogoutStatus[] values() {
        return (InMessage$LogoutResponse$LogoutStatus[]) $VALUES.clone();
    }
}
