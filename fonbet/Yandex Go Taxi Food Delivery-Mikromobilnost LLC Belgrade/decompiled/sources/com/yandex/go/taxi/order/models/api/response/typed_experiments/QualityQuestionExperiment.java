package com.yandex.go.taxi.order.models.api.response.typed_experiments;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.n96;
import defpackage.xlf0;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/typed_experiments/QualityQuestionExperiment;", "Ln96;", "Lc6z;", "Companion", "com/yandex/go/taxi/order/models/api/response/typed_experiments/f", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class QualityQuestionExperiment extends n96 implements c6z {
    public static final f Companion = new f();
    public static final i3y[] f = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new xlf0(27)), null, null};
    public static final QualityQuestionExperiment g = new QualityQuestionExperiment(0);
    public final boolean b;
    public final Map c;
    public final String d;
    public final String e;

    public /* synthetic */ QualityQuestionExperiment(int i, String str, String str2, Map map, boolean z) {
        this.b = (i & 1) == 0 ? false : z;
        this.c = (i & 2) == 0 ? kotlin.collections.b.f() : map;
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
        if ((i & 8) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getE() {
        return this.c;
    }

    public QualityQuestionExperiment() {
        this(0);
    }

    public QualityQuestionExperiment(int i) {
        Map f2 = kotlin.collections.b.f();
        this.b = false;
        this.c = f2;
        this.d = null;
        this.e = null;
    }
}
