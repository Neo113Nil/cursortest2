package ru.ok.tracer.base.manifest;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.collections.builders.ListBuilder;
import ru.ok.tracer.manifest.TracerManifest;
import xsna.e43;
import xsna.epx;
import xsna.go9;
import xsna.izs;
import xsna.j5g;
import xsna.zr;

/* compiled from: TracerManifestUtils.kt */
/* loaded from: classes9.dex */
public final class TracerManifestUtils {
    private static volatile List<? extends TracerManifest> tracerManifests;

    public static final TracerManifest findTracerManifest(String str) {
        List<TracerManifest> findTracerManifests = findTracerManifests();
        if (findTracerManifests.size() > 1) {
            throw new IllegalStateException(go9.b("More then one manifest found: ", j5g.g0(findTracerManifests, null, null, null, 0, new izs<TracerManifest, CharSequence>() { // from class: ru.ok.tracer.base.manifest.TracerManifestUtils$findTracerManifest$1$1
                @Override // xsna.izs
                public final CharSequence invoke(TracerManifest tracerManifest) {
                    return tracerManifest.getClass().getName();
                }
            }, 31)).toString());
        }
        if (findTracerManifests.size() != 1) {
            return null;
        }
        TracerManifest tracerManifest = findTracerManifests.get(0);
        if (epx.f(tracerManifest.applicationId(), str)) {
            return tracerManifest;
        }
        throw new IllegalStateException(zr.a("Unexpected ", tracerManifest.getClass().getName(), ".applicationId()").toString());
    }

    private static final List<TracerManifest> findTracerManifests() {
        List list = tracerManifests;
        if (list != null) {
            return list;
        }
        ListBuilder e = e43.e();
        Iterator it = ServiceLoader.load(TracerManifest.class, TracerManifest.class.getClassLoader()).iterator();
        while (it.hasNext()) {
            e.add(it.next());
        }
        tracerManifests = e;
        return e.g();
    }

    public static final <S> Iterator<S> loadService() {
        epx.k();
        throw null;
    }

    public static final TracerManifest requireTracerManifest(String str) {
        TracerManifest findTracerManifest = findTracerManifest(str);
        if (findTracerManifest != null) {
            return findTracerManifest;
        }
        throw new IllegalStateException("Could not find TracerApplicationManifest for applicationId ".concat(str).toString());
    }
}
