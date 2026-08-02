package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import defpackage.fxu;
import defpackage.gsq0;
import defpackage.hqu;
import defpackage.i3y;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubAvailableParam;", "", "Companion", "fxu", "ENABLED", "DISABLED", "ENABLED_IF_ONLY_TOLLS", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class HubAvailableParam {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ HubAvailableParam[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final fxu Companion;
    public static final HubAvailableParam DISABLED;
    public static final HubAvailableParam ENABLED;
    public static final HubAvailableParam ENABLED_IF_ONLY_TOLLS;

    static {
        HubAvailableParam hubAvailableParam = new HubAvailableParam("ENABLED", 0);
        ENABLED = hubAvailableParam;
        HubAvailableParam hubAvailableParam2 = new HubAvailableParam("DISABLED", 1);
        DISABLED = hubAvailableParam2;
        HubAvailableParam hubAvailableParam3 = new HubAvailableParam("ENABLED_IF_ONLY_TOLLS", 2);
        ENABLED_IF_ONLY_TOLLS = hubAvailableParam3;
        HubAvailableParam[] hubAvailableParamArr = {hubAvailableParam, hubAvailableParam2, hubAvailableParam3};
        $VALUES = hubAvailableParamArr;
        $ENTRIES = kotlin.enums.a.a(hubAvailableParamArr);
        Companion = new fxu();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new hqu(4));
    }

    public static HubAvailableParam valueOf(String str) {
        return (HubAvailableParam) Enum.valueOf(HubAvailableParam.class, str);
    }

    public static HubAvailableParam[] values() {
        return (HubAvailableParam[]) $VALUES.clone();
    }
}
