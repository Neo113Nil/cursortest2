package xsna;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import xsna.yhq;

/* compiled from: FactoryPools.java */
/* loaded from: classes12.dex */
public final class zhq implements yhq.b<List<Object>> {
    @Override // xsna.yhq.b
    @NonNull
    public final List<Object> create() {
        return new ArrayList();
    }
}
