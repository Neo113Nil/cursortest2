package com.yandex.go.due.experiment;

import defpackage.gsq0;
import defpackage.n96;
import defpackage.nzs;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/due/experiment/MulticlassPreorderExperiment;", "Ln96;", "Companion", "com/yandex/go/due/experiment/c", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MulticlassPreorderExperiment extends n96 {
    public static final c Companion = new c();
    public static final MulticlassPreorderExperiment c = new MulticlassPreorderExperiment(0);
    public final boolean b;

    public /* synthetic */ MulticlassPreorderExperiment(int i, boolean z) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MulticlassPreorderExperiment) && this.b == ((MulticlassPreorderExperiment) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    public final String toString() {
        return nzs.b("MulticlassPreorderExperiment(enabled=", Extension.C_BRAKE, this.b);
    }

    public MulticlassPreorderExperiment(int i) {
        this.b = false;
    }

    public MulticlassPreorderExperiment() {
        this(0);
    }
}
