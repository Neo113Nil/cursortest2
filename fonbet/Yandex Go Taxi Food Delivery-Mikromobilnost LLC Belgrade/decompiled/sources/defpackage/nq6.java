package defpackage;

import io.appmetrica.analytics.coreutils.internal.buffering.BatchProcessor;
import io.appmetrica.analytics.coreutils.internal.io.BufferedFileWriter;
import io.appmetrica.analytics.impl.C0390hd;
import io.appmetrica.analytics.impl.O3;
import java.util.List;

/* loaded from: classes9.dex */
public final /* synthetic */ class nq6 implements BatchProcessor {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nq6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.buffering.BatchProcessor
    public final void processBatch(List list) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                BufferedFileWriter.a((BufferedFileWriter) obj, list);
                break;
            case 1:
                O3.a((O3) obj, list);
                break;
            default:
                C0390hd.a((C0390hd) obj, list);
                break;
        }
    }
}
