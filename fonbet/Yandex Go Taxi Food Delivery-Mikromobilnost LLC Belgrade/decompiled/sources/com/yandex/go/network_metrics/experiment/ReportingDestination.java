package com.yandex.go.network_metrics.experiment;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.vci0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/network_metrics/experiment/ReportingDestination;", "", "Companion", "$serializer", "com/yandex/go/network_metrics/experiment/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ReportingDestination {
    public static final c Companion = new c();
    public static final i3y[] c;
    public final List a;
    public final List b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new vci0(12)), kotlin.a.b(lazyThreadSafetyMode, new vci0(13))};
    }

    public /* synthetic */ ReportingDestination(List list, List list2, int i) {
        int i2 = i & 1;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.a = emptyList;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = emptyList;
        } else {
            this.b = list2;
        }
    }

    public ReportingDestination(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ReportingDestination() {
        this(r0, r0);
        EmptyList emptyList = EmptyList.a;
    }
}
