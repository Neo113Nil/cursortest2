package defpackage;

import com.yandex.go.experiments.api.ExperimentSource;
import java.util.ArrayList;
import kotlinx.serialization.json.c;

/* loaded from: classes9.dex */
public final class hd7 {
    public final ExperimentSource a;
    public final ArrayList b;
    public final c c;
    public final kd7 d;

    public hd7(ExperimentSource experimentSource, ArrayList arrayList, c cVar) {
        this.a = experimentSource;
        this.b = arrayList;
        this.c = cVar;
        arrayList = arrayList.isEmpty() ? null : arrayList;
        this.d = arrayList != null ? new kd7(arrayList) : null;
    }
}
