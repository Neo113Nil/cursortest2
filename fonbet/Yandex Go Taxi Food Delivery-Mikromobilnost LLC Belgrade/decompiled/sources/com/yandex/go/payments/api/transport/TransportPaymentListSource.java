package com.yandex.go.payments.api.transport;

import defpackage.gw00;
import defpackage.k4o;
import defpackage.tcc;
import defpackage.v411;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/payments/api/transport/TransportPaymentListSource;", "", "", "source", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "v411", "DEFAULT", "MOSMETRO", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TransportPaymentListSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransportPaymentListSource[] $VALUES;
    public static final v411 Companion;
    public static final TransportPaymentListSource DEFAULT;
    public static final TransportPaymentListSource MOSMETRO;
    private static final Map<String, TransportPaymentListSource> map;
    private final String source;

    static {
        TransportPaymentListSource transportPaymentListSource = new TransportPaymentListSource("DEFAULT", 0, "default");
        DEFAULT = transportPaymentListSource;
        TransportPaymentListSource transportPaymentListSource2 = new TransportPaymentListSource("MOSMETRO", 1, "mosmetro");
        MOSMETRO = transportPaymentListSource2;
        TransportPaymentListSource[] transportPaymentListSourceArr = {transportPaymentListSource, transportPaymentListSource2};
        $VALUES = transportPaymentListSourceArr;
        k4o a = a.a(transportPaymentListSourceArr);
        $ENTRIES = a;
        Companion = new v411();
        int d = gw00.d(tcc.n(a, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(d < 16 ? 16 : d);
        for (Object obj : a) {
            linkedHashMap.put(((TransportPaymentListSource) obj).source, obj);
        }
        map = linkedHashMap;
    }

    public TransportPaymentListSource(String str, int i, String str2) {
        this.source = str2;
    }

    public static TransportPaymentListSource valueOf(String str) {
        return (TransportPaymentListSource) Enum.valueOf(TransportPaymentListSource.class, str);
    }

    public static TransportPaymentListSource[] values() {
        return (TransportPaymentListSource[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getSource() {
        return this.source;
    }
}
