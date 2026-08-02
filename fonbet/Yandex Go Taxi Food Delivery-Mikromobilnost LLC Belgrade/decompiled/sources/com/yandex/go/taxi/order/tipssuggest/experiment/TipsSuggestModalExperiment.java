package com.yandex.go.taxi.order.tipssuggest.experiment;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.n96;
import defpackage.nhz0;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.b;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/tipssuggest/experiment/TipsSuggestModalExperiment;", "Ln96;", "Lc6z;", "Companion", "com/yandex/go/taxi/order/tipssuggest/experiment/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TipsSuggestModalExperiment extends n96 implements c6z {
    public static final a Companion = new a();
    public static final i3y[] g = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nhz0(0)), null, null, null};
    public static final TipsSuggestModalExperiment h = new TipsSuggestModalExperiment(0);
    public final boolean b;
    public final Map c;
    public final String d;
    public final int e;
    public final int f;

    public /* synthetic */ TipsSuggestModalExperiment(int i, boolean z, Map map, String str, int i2, int i3) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = "";
        } else {
            this.d = str;
        }
        if ((i & 8) == 0) {
            this.e = 10;
        } else {
            this.e = i2;
        }
        if ((i & 16) == 0) {
            this.f = 10;
        } else {
            this.f = i3;
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

    public TipsSuggestModalExperiment() {
        this(0);
    }

    public TipsSuggestModalExperiment(int i) {
        Map f = b.f();
        this.b = false;
        this.c = f;
        this.d = "";
        this.e = 10;
        this.f = 10;
    }
}
