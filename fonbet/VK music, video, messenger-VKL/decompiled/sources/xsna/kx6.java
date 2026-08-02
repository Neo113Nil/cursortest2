package xsna;

import com.vk.stat.scheme.SchemeStat$EventBenchmarkMain;

/* compiled from: BenchmarkEventBuilder.kt */
/* loaded from: classes11.dex */
public class kx6 extends cd6<lrk0> {
    public SchemeStat$EventBenchmarkMain.b f;

    public kx6() {
        super(false, null, 15);
    }

    @Override // xsna.cd6
    public final lrk0 p() {
        SchemeStat$EventBenchmarkMain.b bVar = (SchemeStat$EventBenchmarkMain.b) r(this.f);
        if (bVar == null) {
            return null;
        }
        return new lrk0(bVar);
    }
}
