package xsna;

import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.List;

/* compiled from: Extractor.java */
/* loaded from: classes12.dex */
public interface pgq {
    default List<lbk0> a() {
        ImmutableList.b bVar = ImmutableList.c;
        return com.google.common.collect.g.f;
    }

    int b(qgq qgqVar, pzb0 pzb0Var) throws IOException;

    boolean d(qgq qgqVar) throws IOException;

    void e(rgq rgqVar);

    void release();

    void seek(long j, long j2);

    default pgq c() {
        return this;
    }
}
