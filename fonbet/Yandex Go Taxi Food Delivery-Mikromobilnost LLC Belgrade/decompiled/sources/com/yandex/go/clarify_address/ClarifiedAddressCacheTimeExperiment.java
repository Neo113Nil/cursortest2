package com.yandex.go.clarify_address;

import defpackage.gsq0;
import defpackage.w96;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/clarify_address/ClarifiedAddressCacheTimeExperiment;", "Lw96;", "Companion", "com/yandex/go/clarify_address/b", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ClarifiedAddressCacheTimeExperiment extends w96 {
    public static final b Companion = new b();
    public static final ClarifiedAddressCacheTimeExperiment e = new ClarifiedAddressCacheTimeExperiment(0);
    public final boolean b;
    public final Integer c;
    public final boolean d;

    public /* synthetic */ ClarifiedAddressCacheTimeExperiment(int i, boolean z, Integer num, boolean z2) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 4) == 0) {
            this.d = false;
        } else {
            this.d = z2;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public ClarifiedAddressCacheTimeExperiment(int i) {
        this.b = false;
        this.c = null;
        this.d = false;
    }

    public ClarifiedAddressCacheTimeExperiment() {
        this(0);
    }
}
