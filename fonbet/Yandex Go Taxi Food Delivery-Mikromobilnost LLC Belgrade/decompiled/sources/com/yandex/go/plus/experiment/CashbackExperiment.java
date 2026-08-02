package com.yandex.go.plus.experiment;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.n96;
import defpackage.r66;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/plus/experiment/CashbackExperiment;", "Ln96;", "Lc6z;", "Companion", "com/yandex/go/plus/experiment/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CashbackExperiment extends n96 implements c6z {
    public static final a Companion = new a();
    public static final i3y[] i = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new r66(23)), null, null, null, null, null};
    public static final CashbackExperiment j = new CashbackExperiment(0);
    public final boolean b;
    public final Map c;
    public final CashbackStyleScheme d;
    public final CompositePaymentInfo e;
    public final boolean f;
    public final boolean g;
    public final SdkCustomHosts h;

    public /* synthetic */ CashbackExperiment(int i2, boolean z, Map map, CashbackStyleScheme cashbackStyleScheme, CompositePaymentInfo compositePaymentInfo, boolean z2, boolean z3, SdkCustomHosts sdkCustomHosts) {
        if ((i2 & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i2 & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i2 & 4) == 0) {
            this.d = new CashbackStyleScheme(0);
        } else {
            this.d = cashbackStyleScheme;
        }
        if ((i2 & 8) == 0) {
            this.e = new CompositePaymentInfo(0);
        } else {
            this.e = compositePaymentInfo;
        }
        if ((i2 & 16) == 0) {
            this.f = false;
        } else {
            this.f = z2;
        }
        if ((i2 & 32) == 0) {
            this.g = false;
        } else {
            this.g = z3;
        }
        if ((i2 & 64) == 0) {
            this.h = null;
        } else {
            this.h = sdkCustomHosts;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    public CashbackExperiment() {
        this(0);
    }

    public CashbackExperiment(int i2) {
        Map f = kotlin.collections.b.f();
        CashbackStyleScheme cashbackStyleScheme = new CashbackStyleScheme(0);
        CompositePaymentInfo compositePaymentInfo = new CompositePaymentInfo(0);
        this.b = false;
        this.c = f;
        this.d = cashbackStyleScheme;
        this.e = compositePaymentInfo;
        this.f = false;
        this.g = false;
        this.h = null;
    }
}
