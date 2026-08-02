package com.yandex.plus.home.datasource.openapi.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/plus/home/datasource/openapi/models/NetworkDisplayRulesModel$HorizontalGravity", "", "Lcom/yandex/plus/home/datasource/openapi/models/NetworkDisplayRulesModel$HorizontalGravity;", "LEFT", "CENTER", "RIGHT", "plus-home-data-openapi-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NetworkDisplayRulesModel$HorizontalGravity {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NetworkDisplayRulesModel$HorizontalGravity[] $VALUES;
    public static final NetworkDisplayRulesModel$HorizontalGravity CENTER;
    public static final NetworkDisplayRulesModel$HorizontalGravity LEFT;
    public static final NetworkDisplayRulesModel$HorizontalGravity RIGHT;

    static {
        NetworkDisplayRulesModel$HorizontalGravity networkDisplayRulesModel$HorizontalGravity = new NetworkDisplayRulesModel$HorizontalGravity("LEFT", 0);
        LEFT = networkDisplayRulesModel$HorizontalGravity;
        NetworkDisplayRulesModel$HorizontalGravity networkDisplayRulesModel$HorizontalGravity2 = new NetworkDisplayRulesModel$HorizontalGravity("CENTER", 1);
        CENTER = networkDisplayRulesModel$HorizontalGravity2;
        NetworkDisplayRulesModel$HorizontalGravity networkDisplayRulesModel$HorizontalGravity3 = new NetworkDisplayRulesModel$HorizontalGravity("RIGHT", 2);
        RIGHT = networkDisplayRulesModel$HorizontalGravity3;
        NetworkDisplayRulesModel$HorizontalGravity[] networkDisplayRulesModel$HorizontalGravityArr = {networkDisplayRulesModel$HorizontalGravity, networkDisplayRulesModel$HorizontalGravity2, networkDisplayRulesModel$HorizontalGravity3};
        $VALUES = networkDisplayRulesModel$HorizontalGravityArr;
        $ENTRIES = a.a(networkDisplayRulesModel$HorizontalGravityArr);
    }

    public static NetworkDisplayRulesModel$HorizontalGravity valueOf(String str) {
        return (NetworkDisplayRulesModel$HorizontalGravity) Enum.valueOf(NetworkDisplayRulesModel$HorizontalGravity.class, str);
    }

    public static NetworkDisplayRulesModel$HorizontalGravity[] values() {
        return (NetworkDisplayRulesModel$HorizontalGravity[]) $VALUES.clone();
    }
}
