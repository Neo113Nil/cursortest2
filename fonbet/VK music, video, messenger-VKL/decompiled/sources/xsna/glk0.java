package xsna;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: SpliceScheduleCommand.java */
/* loaded from: classes12.dex */
public final class glk0 extends clk0 {
    public final List<b> a;

    /* compiled from: SpliceScheduleCommand.java */
    public static final class a {
    }

    /* compiled from: SpliceScheduleCommand.java */
    public static final class b {
        public final List<a> a;

        public b(ArrayList arrayList) {
            this.a = Collections.unmodifiableList(arrayList);
        }
    }

    public glk0(ArrayList arrayList) {
        this.a = Collections.unmodifiableList(arrayList);
    }
}
