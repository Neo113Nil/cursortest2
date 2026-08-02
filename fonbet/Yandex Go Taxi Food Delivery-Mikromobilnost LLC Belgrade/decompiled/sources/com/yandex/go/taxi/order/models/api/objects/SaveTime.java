package com.yandex.go.taxi.order.models.api.objects;

import android.os.SystemClock;
import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/SaveTime;", "", "Companion", "com/yandex/go/taxi/order/models/api/objects/m1", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SaveTime {
    public static final m1 Companion = new m1();
    public final long a;
    public final long b;

    public /* synthetic */ SaveTime(int i, long j, long j2) {
        if ((i & 1) == 0) {
            this.a = 0L;
        } else {
            this.a = j;
        }
        if ((i & 2) == 0) {
            this.b = 0L;
        } else {
            this.b = j2;
        }
    }

    public final long a() {
        return SystemClock.uptimeMillis() - this.a;
    }

    public final boolean b() {
        return Math.abs((System.currentTimeMillis() - SystemClock.uptimeMillis()) - (this.b - this.a)) < 600000;
    }

    public SaveTime(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public SaveTime() {
        this(0L, 0L);
    }
}
