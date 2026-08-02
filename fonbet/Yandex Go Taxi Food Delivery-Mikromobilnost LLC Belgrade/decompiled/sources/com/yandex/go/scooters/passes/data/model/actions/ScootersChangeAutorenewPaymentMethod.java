package com.yandex.go.scooters.passes.data.model.actions;

import defpackage.gsq0;
import defpackage.gz;
import defpackage.i3y;
import defpackage.kr;
import defpackage.qje;
import defpackage.s3n0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/scooters/passes/data/model/actions/ScootersChangeAutorenewPaymentMethod;", "Lkr;", "Lgz;", "Companion", "$serializer", "com/yandex/go/scooters/passes/data/model/actions/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersChangeAutorenewPaymentMethod extends kr implements gz {
    public static final e Companion = new e();
    public static final i3y[] d;
    public final String a;
    public final kr b;
    public final kr c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new s3n0(5)), kotlin.a.b(lazyThreadSafetyMode, new s3n0(6))};
    }

    public /* synthetic */ ScootersChangeAutorenewPaymentMethod(int i, String str, kr krVar, kr krVar2) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, ScootersChangeAutorenewPaymentMethod$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = krVar;
        this.c = krVar2;
    }

    @Override // defpackage.gz
    /* renamed from: a, reason: from getter */
    public final kr getB() {
        return this.b;
    }

    @Override // defpackage.gz
    /* renamed from: b, reason: from getter */
    public final kr getC() {
        return this.c;
    }
}
