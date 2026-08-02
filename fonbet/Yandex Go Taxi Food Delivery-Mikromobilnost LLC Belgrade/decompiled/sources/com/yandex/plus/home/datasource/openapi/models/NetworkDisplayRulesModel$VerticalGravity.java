package com.yandex.plus.home.datasource.openapi.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/plus/home/datasource/openapi/models/NetworkDisplayRulesModel$VerticalGravity", "", "Lcom/yandex/plus/home/datasource/openapi/models/NetworkDisplayRulesModel$VerticalGravity;", "TOP", "CENTER", "BOTTOM", "plus-home-data-openapi-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NetworkDisplayRulesModel$VerticalGravity {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NetworkDisplayRulesModel$VerticalGravity[] $VALUES;
    public static final NetworkDisplayRulesModel$VerticalGravity BOTTOM;
    public static final NetworkDisplayRulesModel$VerticalGravity CENTER;
    public static final NetworkDisplayRulesModel$VerticalGravity TOP;

    static {
        NetworkDisplayRulesModel$VerticalGravity networkDisplayRulesModel$VerticalGravity = new NetworkDisplayRulesModel$VerticalGravity("TOP", 0);
        TOP = networkDisplayRulesModel$VerticalGravity;
        NetworkDisplayRulesModel$VerticalGravity networkDisplayRulesModel$VerticalGravity2 = new NetworkDisplayRulesModel$VerticalGravity("CENTER", 1);
        CENTER = networkDisplayRulesModel$VerticalGravity2;
        NetworkDisplayRulesModel$VerticalGravity networkDisplayRulesModel$VerticalGravity3 = new NetworkDisplayRulesModel$VerticalGravity("BOTTOM", 2);
        BOTTOM = networkDisplayRulesModel$VerticalGravity3;
        NetworkDisplayRulesModel$VerticalGravity[] networkDisplayRulesModel$VerticalGravityArr = {networkDisplayRulesModel$VerticalGravity, networkDisplayRulesModel$VerticalGravity2, networkDisplayRulesModel$VerticalGravity3};
        $VALUES = networkDisplayRulesModel$VerticalGravityArr;
        $ENTRIES = a.a(networkDisplayRulesModel$VerticalGravityArr);
    }

    public static NetworkDisplayRulesModel$VerticalGravity valueOf(String str) {
        return (NetworkDisplayRulesModel$VerticalGravity) Enum.valueOf(NetworkDisplayRulesModel$VerticalGravity.class, str);
    }

    public static NetworkDisplayRulesModel$VerticalGravity[] values() {
        return (NetworkDisplayRulesModel$VerticalGravity[]) $VALUES.clone();
    }
}
