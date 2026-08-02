package defpackage;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0012¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0012¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0016\u0010\u0015J%\u0010\u0019\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u00172\u0006\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u001c8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001dR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u001f8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lhlu;", "", "Lmlu;", "histogramReporterDelegate", "Lglu;", "histogramNameProvider", "<init>", "(Lmlu;Lglu;)V", "", "histogramName", "", RemoteBioParameters.TIME, "Lflu;", "filter", "Lzy11;", "d", "(Ljava/lang/String;JLflu;)V", "a", "(Ljava/lang/String;)Ljava/lang/String;", "duration", "f", "(JLflu;)V", "b", "", "parsingHistogramNames", "h", "(Ljava/util/Set;J)V", "Lglu;", "Lllu;", "Lllu;", "histogramReporter", "Ljava/util/concurrent/CopyOnWriteArraySet;", "c", "Ljava/util/concurrent/CopyOnWriteArraySet;", "recordedHistograms", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public class hlu {

    /* renamed from: a, reason: from kotlin metadata */
    private final glu histogramNameProvider;

    /* renamed from: b, reason: from kotlin metadata */
    private final llu histogramReporter;

    /* renamed from: c, reason: from kotlin metadata */
    private final CopyOnWriteArraySet<String> recordedHistograms = new CopyOnWriteArraySet<>();

    public hlu(mlu mluVar, glu gluVar) {
        this.histogramNameProvider = gluVar;
        this.histogramReporter = new llu(mluVar);
    }

    private String a(String histogramName) {
        return this.recordedHistograms.add(histogramName) ? "Cold" : this.histogramNameProvider != null ? "Hot" : "Warm";
    }

    public static /* synthetic */ void c(hlu hluVar, long j, flu fluVar, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: reportDivDataLoadTime");
            return;
        }
        if ((i & 2) != 0) {
            fluVar = kl40.A;
        }
        hluVar.b(j, fluVar);
    }

    private void d(String histogramName, long time, flu filter) {
        llu lluVar = this.histogramReporter;
        glu gluVar = this.histogramNameProvider;
        String d = gluVar != null ? gluVar.d() : null;
        a(histogramName);
        mlu mluVar = lluVar.a;
        if (filter.c()) {
            mluVar.getClass();
        }
        if (d == null || !filter.c()) {
            return;
        }
        mluVar.getClass();
    }

    public static /* synthetic */ void e(hlu hluVar, String str, long j, flu fluVar, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: reportDuration");
            return;
        }
        if ((i & 4) != 0) {
            fluVar = kl40.A;
        }
        hluVar.d(str, j, fluVar);
    }

    public static /* synthetic */ void g(hlu hluVar, long j, flu fluVar, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: reportTemplateLoadedTime");
            return;
        }
        if ((i & 2) != 0) {
            fluVar = kl40.A;
        }
        hluVar.f(j, fluVar);
    }

    public final void b(long duration, flu filter) {
        glu gluVar = this.histogramNameProvider;
        if (gluVar != null) {
            d(gluVar.b(), duration, filter);
        }
    }

    public final void f(long duration, flu filter) {
        glu gluVar = this.histogramNameProvider;
        if (gluVar != null) {
            d(gluVar.f(), duration, filter);
        }
    }

    public final void h(Set<String> parsingHistogramNames, long duration) {
        for (String str : parsingHistogramNames) {
            llu lluVar = this.histogramReporter;
            glu gluVar = this.histogramNameProvider;
            llu.a(lluVar, gluVar != null ? gluVar.d() : null, null, null, 24);
        }
    }
}
