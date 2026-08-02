package com.yandex.go.places.models.data.entities.network;

import defpackage.du;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.vv;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/yandex/go/places/models/data/entities/network/ActionDto$WebAuthType", "", "Lcom/yandex/go/places/models/data/entities/network/ActionDto$WebAuthType;", "Companion", "vv", "OAUTH", "COOKIES", "NO_AUTH", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ActionDto$WebAuthType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ActionDto$WebAuthType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final ActionDto$WebAuthType COOKIES;
    public static final vv Companion;
    public static final ActionDto$WebAuthType NO_AUTH;
    public static final ActionDto$WebAuthType OAUTH;

    static {
        ActionDto$WebAuthType actionDto$WebAuthType = new ActionDto$WebAuthType("OAUTH", 0);
        OAUTH = actionDto$WebAuthType;
        ActionDto$WebAuthType actionDto$WebAuthType2 = new ActionDto$WebAuthType("COOKIES", 1);
        COOKIES = actionDto$WebAuthType2;
        ActionDto$WebAuthType actionDto$WebAuthType3 = new ActionDto$WebAuthType("NO_AUTH", 2);
        NO_AUTH = actionDto$WebAuthType3;
        ActionDto$WebAuthType[] actionDto$WebAuthTypeArr = {actionDto$WebAuthType, actionDto$WebAuthType2, actionDto$WebAuthType3};
        $VALUES = actionDto$WebAuthTypeArr;
        $ENTRIES = kotlin.enums.a.a(actionDto$WebAuthTypeArr);
        Companion = new vv();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new du(12));
    }

    public static ActionDto$WebAuthType valueOf(String str) {
        return (ActionDto$WebAuthType) Enum.valueOf(ActionDto$WebAuthType.class, str);
    }

    public static ActionDto$WebAuthType[] values() {
        return (ActionDto$WebAuthType[]) $VALUES.clone();
    }
}
