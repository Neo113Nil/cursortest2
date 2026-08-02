package xsna;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.function.UnaryOperator;
import xsna.dcr;

/* compiled from: FiltersContent.kt */
/* loaded from: classes18.dex */
public final class xfr implements gzs<s3q0> {
    public final /* synthetic */ SnapshotStateList<dcr> b;
    public final /* synthetic */ dcr c;

    public xfr(SnapshotStateList snapshotStateList, dcr.a aVar) {
        this.b = snapshotStateList;
        this.c = aVar;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        final dcr.a aVar = (dcr.a) this.c;
        this.b.replaceAll(new UnaryOperator() { // from class: xsna.wfr
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                dcr dcrVar = (dcr) obj;
                String a = dcrVar.a();
                dcr.a aVar2 = dcr.a.this;
                return epx.f(a, aVar2.f) ? dcr.a.b(aVar2, !aVar2.b) : dcrVar;
            }
        });
        return s3q0.a;
    }
}
