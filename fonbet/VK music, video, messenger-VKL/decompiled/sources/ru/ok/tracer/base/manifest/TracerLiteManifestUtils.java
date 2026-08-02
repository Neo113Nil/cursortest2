package ru.ok.tracer.base.manifest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.collections.builders.SetBuilder;
import ru.ok.tracer.manifest.TracerLiteManifest;
import xsna.epx;
import xsna.izs;
import xsna.j5g;
import xsna.y57;

/* compiled from: TracerLiteManifestUtils.kt */
/* loaded from: classes11.dex */
public final class TracerLiteManifestUtils {
    private static volatile Set<? extends TracerLiteManifest> tracerLiteManifests;

    public static final Set<TracerLiteManifest> findTracerLiteManifests() {
        Set set = tracerLiteManifests;
        if (set != null) {
            return set;
        }
        SetBuilder setBuilder = new SetBuilder();
        Iterator it = ServiceLoader.load(TracerLiteManifest.class, TracerLiteManifest.class.getClassLoader()).iterator();
        while (it.hasNext()) {
            setBuilder.add(it.next());
        }
        tracerLiteManifests = setBuilder;
        return setBuilder.d();
    }

    public static final TracerLiteManifest requireTracerLiteManifest(String str) throws NoSuchElementException {
        Set<TracerLiteManifest> findTracerLiteManifests = findTracerLiteManifests();
        ArrayList arrayList = new ArrayList();
        for (Object obj : findTracerLiteManifests) {
            if (epx.f(((TracerLiteManifest) obj).namespace(), str)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() > 1) {
            throw new IllegalStateException(y57.a("More then one manifest found for ", str, ": ", j5g.g0(arrayList, null, null, null, 0, new izs<TracerLiteManifest, CharSequence>() { // from class: ru.ok.tracer.base.manifest.TracerLiteManifestUtils$requireTracerLiteManifest$1$1
                @Override // xsna.izs
                public final CharSequence invoke(TracerLiteManifest tracerLiteManifest) {
                    return tracerLiteManifest.getClass().getName();
                }
            }, 31)).toString());
        }
        if (arrayList.size() == 1) {
            return (TracerLiteManifest) arrayList.get(0);
        }
        try {
            String str2 = str + ".TracerLibraryManifest";
            TracerLiteManifest tracerLiteManifest = (TracerLiteManifest) Class.forName(str2).newInstance();
            if (epx.f(tracerLiteManifest.namespace(), str)) {
                return tracerLiteManifest;
            }
            throw new IllegalStateException(("Unexpected " + str2 + ".namespace()").toString());
        } catch (Throwable th) {
            NoSuchElementException noSuchElementException = new NoSuchElementException("No manifest found for ".concat(str));
            noSuchElementException.initCause(th);
            throw noSuchElementException;
        }
    }
}
