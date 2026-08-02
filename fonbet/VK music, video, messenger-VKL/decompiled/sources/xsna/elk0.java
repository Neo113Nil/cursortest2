package xsna;

import java.util.Collections;
import java.util.List;

/* compiled from: SpliceInsertCommand.java */
/* loaded from: classes12.dex */
public final class elk0 extends clk0 {
    public final long a;
    public final long b;
    public final List<a> c;

    /* compiled from: SpliceInsertCommand.java */
    public static final class a {
    }

    public elk0(List list, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = Collections.unmodifiableList(list);
    }

    @Override // xsna.clk0
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb.append(this.a);
        sb.append(", programSplicePlaybackPositionUs= ");
        return efz.b(this.b, " }", sb);
    }
}
