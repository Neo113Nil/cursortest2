package com.yandex.go.requirements.comment.summary.ui.v3.data.experiment;

import defpackage.gsq0;
import defpackage.n96;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/requirements/comment/summary/ui/v3/data/experiment/SummaryCommentValidationExperiment;", "Ln96;", "Companion", "com/yandex/go/requirements/comment/summary/ui/v3/data/experiment/b", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SummaryCommentValidationExperiment extends n96 {
    public static final b Companion = new b();
    public static final SummaryCommentValidationExperiment e = new SummaryCommentValidationExperiment(0);
    public final boolean b;
    public final int c;
    public final int d;

    public /* synthetic */ SummaryCommentValidationExperiment(int i, int i2, int i3, boolean z) {
        this.b = (i & 1) == 0 ? false : z;
        this.c = (i & 2) == 0 ? 1000 : i2;
        if ((i & 4) == 0) {
            this.d = 500;
        } else {
            this.d = i3;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public SummaryCommentValidationExperiment(int i) {
        this.b = false;
        this.c = 1000;
        this.d = 500;
    }

    public SummaryCommentValidationExperiment() {
        this(0);
    }
}
