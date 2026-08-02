package com.yandex.go.inapp_calls.experiment;

import defpackage.gsq0;
import defpackage.w96;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/inapp_calls/experiment/VoipCallHangupConfirmationExperiment;", "Lw96;", "Companion", "com/yandex/go/inapp_calls/experiment/s", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VoipCallHangupConfirmationExperiment extends w96 {
    public static final s Companion = new s();
    public static final VoipCallHangupConfirmationExperiment d = new VoipCallHangupConfirmationExperiment(0);
    public final boolean b;
    public final long c;

    public /* synthetic */ VoipCallHangupConfirmationExperiment(boolean z, int i, long j) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = 5L;
        } else {
            this.c = j;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public VoipCallHangupConfirmationExperiment(int i) {
        this.b = false;
        this.c = 5L;
    }

    public VoipCallHangupConfirmationExperiment() {
        this(0);
    }
}
