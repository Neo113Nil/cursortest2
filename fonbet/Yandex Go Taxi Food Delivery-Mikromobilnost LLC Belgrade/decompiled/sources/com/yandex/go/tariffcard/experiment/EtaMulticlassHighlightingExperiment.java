package com.yandex.go.tariffcard.experiment;

import defpackage.fsn;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.n96;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/tariffcard/experiment/EtaMulticlassHighlightingExperiment;", "Ln96;", "Companion", "com/yandex/go/tariffcard/experiment/b", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class EtaMulticlassHighlightingExperiment extends n96 {
    public static final b Companion = new b();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new fsn(2))};
    public static final EtaMulticlassHighlightingExperiment e = new EtaMulticlassHighlightingExperiment(0);
    public final boolean b;
    public final List c;

    public /* synthetic */ EtaMulticlassHighlightingExperiment(int i, boolean z, List list) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public EtaMulticlassHighlightingExperiment(int i) {
        this.b = false;
        this.c = EmptyList.a;
    }

    public EtaMulticlassHighlightingExperiment() {
        this(0);
    }
}
