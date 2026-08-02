package com.yandex.go.vault.data;

import defpackage.gsq0;
import defpackage.gt;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.lq;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0081\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/vault/data/ActionButtonTypeResponse;", "", "Companion", "gt", "CLIPBOARD_COPY", "DEEPLINK", "CLOSE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ActionButtonTypeResponse {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ActionButtonTypeResponse[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final ActionButtonTypeResponse CLIPBOARD_COPY;
    public static final ActionButtonTypeResponse CLOSE;
    public static final gt Companion;
    public static final ActionButtonTypeResponse DEEPLINK;

    static {
        ActionButtonTypeResponse actionButtonTypeResponse = new ActionButtonTypeResponse("CLIPBOARD_COPY", 0);
        CLIPBOARD_COPY = actionButtonTypeResponse;
        ActionButtonTypeResponse actionButtonTypeResponse2 = new ActionButtonTypeResponse("DEEPLINK", 1);
        DEEPLINK = actionButtonTypeResponse2;
        ActionButtonTypeResponse actionButtonTypeResponse3 = new ActionButtonTypeResponse("CLOSE", 2);
        CLOSE = actionButtonTypeResponse3;
        ActionButtonTypeResponse[] actionButtonTypeResponseArr = {actionButtonTypeResponse, actionButtonTypeResponse2, actionButtonTypeResponse3};
        $VALUES = actionButtonTypeResponseArr;
        $ENTRIES = kotlin.enums.a.a(actionButtonTypeResponseArr);
        Companion = new gt();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new lq(27));
    }

    public static ActionButtonTypeResponse valueOf(String str) {
        return (ActionButtonTypeResponse) Enum.valueOf(ActionButtonTypeResponse.class, str);
    }

    public static ActionButtonTypeResponse[] values() {
        return (ActionButtonTypeResponse[]) $VALUES.clone();
    }
}
