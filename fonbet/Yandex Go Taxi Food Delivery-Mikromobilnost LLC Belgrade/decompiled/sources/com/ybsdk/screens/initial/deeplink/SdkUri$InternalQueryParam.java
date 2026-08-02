package com.ybsdk.screens.initial.deeplink;

import defpackage.gsp0;
import defpackage.k4o;
import defpackage.tcc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\f¨\u0006\r"}, d2 = {"com/ybsdk/screens/initial/deeplink/SdkUri$InternalQueryParam", "", "Lcom/ybsdk/screens/initial/deeplink/SdkUri$InternalQueryParam;", "", "paramValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getParamValue", "()Ljava/lang/String;", "Companion", "gsp0", "CALL_SOURCE", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SdkUri$InternalQueryParam {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SdkUri$InternalQueryParam[] $VALUES;
    public static final SdkUri$InternalQueryParam CALL_SOURCE = new SdkUri$InternalQueryParam("CALL_SOURCE", 0, "call_source");
    public static final gsp0 Companion;
    private static final List<String> paramValues;
    private final String paramValue;

    private static final /* synthetic */ SdkUri$InternalQueryParam[] $values() {
        return new SdkUri$InternalQueryParam[]{CALL_SOURCE};
    }

    static {
        SdkUri$InternalQueryParam[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new gsp0();
        k4o entries = getEntries();
        ArrayList arrayList = new ArrayList(tcc.n(entries, 10));
        Iterator<E> it = entries.iterator();
        while (it.hasNext()) {
            arrayList.add(((SdkUri$InternalQueryParam) it.next()).paramValue);
        }
        paramValues = arrayList;
    }

    private SdkUri$InternalQueryParam(String str, int i, String str2) {
        this.paramValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static SdkUri$InternalQueryParam valueOf(String str) {
        return (SdkUri$InternalQueryParam) Enum.valueOf(SdkUri$InternalQueryParam.class, str);
    }

    public static SdkUri$InternalQueryParam[] values() {
        return (SdkUri$InternalQueryParam[]) $VALUES.clone();
    }

    public final String getParamValue() {
        return this.paramValue;
    }
}
