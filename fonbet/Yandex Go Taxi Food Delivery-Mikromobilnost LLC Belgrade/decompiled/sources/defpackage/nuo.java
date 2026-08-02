package defpackage;

import com.yandex.go.explorer.impl.experiments.ExplorerExperiment;
import java.util.Comparator;

/* loaded from: classes12.dex */
public final class nuo implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Integer.valueOf(((ExplorerExperiment.ZoomToResolution) obj).a).compareTo(Integer.valueOf(((ExplorerExperiment.ZoomToResolution) obj2).a));
    }
}
