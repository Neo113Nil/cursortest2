package xsna;

import io.opentelemetry.api.trace.SpanKind;
import java.util.List;

/* compiled from: Sampler.java */
/* loaded from: classes11.dex */
public interface n0h0 {
    String getDescription();

    p0h0 shouldSample(wmj wmjVar, String str, String str2, SpanKind spanKind, q94 q94Var, List<d9z> list);
}
