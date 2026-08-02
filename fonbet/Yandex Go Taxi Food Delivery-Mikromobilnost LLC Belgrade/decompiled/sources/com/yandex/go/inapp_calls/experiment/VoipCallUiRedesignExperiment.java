package com.yandex.go.inapp_calls.experiment;

import defpackage.gsq0;
import defpackage.w96;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/inapp_calls/experiment/VoipCallUiRedesignExperiment;", "Lw96;", "Companion", "com/yandex/go/inapp_calls/experiment/t", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VoipCallUiRedesignExperiment extends w96 {
    public static final t Companion = new t();
    public static final VoipCallUiRedesignExperiment c = new VoipCallUiRedesignExperiment(0);
    public final boolean b;

    public /* synthetic */ VoipCallUiRedesignExperiment(int i, boolean z) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public VoipCallUiRedesignExperiment(int i) {
        this.b = false;
    }

    public VoipCallUiRedesignExperiment() {
        this(0);
    }
}
