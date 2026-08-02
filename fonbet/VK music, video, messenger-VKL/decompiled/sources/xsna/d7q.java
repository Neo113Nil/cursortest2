package xsna;

import androidx.annotation.Nullable;
import java.util.List;

/* compiled from: ExoTrackSelection.java */
/* loaded from: classes12.dex */
public interface d7q extends wgp0 {

    /* compiled from: ExoTrackSelection.java */
    public static final class a {
        public final pfp0 a;
        public final int[] b;

        public a(int i, pfp0 pfp0Var, int[] iArr) {
            if (iArr.length == 0) {
                ahn.o("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.a = pfp0Var;
            this.b = iArr;
        }
    }

    /* compiled from: ExoTrackSelection.java */
    public interface b {
        d7q[] a(a[] aVarArr, p06 p06Var);
    }

    boolean a(int i, long j);

    boolean d(int i, long j);

    void disable();

    void enable();

    int evaluateQueueSize(long j, List<? extends aq10> list);

    void g(long j, long j2, long j3, List<? extends aq10> list, bq10[] bq10VarArr);

    androidx.media3.common.a getSelectedFormat();

    int getSelectedIndex();

    int getSelectedIndexInTrackGroup();

    @Nullable
    Object getSelectionData();

    int getSelectionReason();

    default boolean h(long j, ccc cccVar, List<? extends aq10> list) {
        return false;
    }

    void onPlaybackSpeed(float f);

    default void e() {
    }

    default void f() {
    }

    default void c(boolean z) {
    }
}
