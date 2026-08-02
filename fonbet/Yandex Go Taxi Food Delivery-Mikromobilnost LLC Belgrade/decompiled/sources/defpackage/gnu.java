package defpackage;

import android.os.SystemClock;
import java.util.List;

/* loaded from: classes10.dex */
public final class gnu extends yb5 {
    public int a;

    @Override // defpackage.loo
    public final int getSelectedIndex() {
        return this.a;
    }

    @Override // defpackage.loo
    public final Object getSelectionData() {
        return null;
    }

    @Override // defpackage.loo
    public final int getSelectionReason() {
        return 0;
    }

    @Override // defpackage.loo
    public final void updateSelectedTrack(long j, long j2, long j3, List list, jb10[] jb10VarArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (isTrackExcluded(this.a, elapsedRealtime)) {
            for (int i = this.length - 1; i >= 0; i--) {
                if (!isTrackExcluded(i, elapsedRealtime)) {
                    this.a = i;
                    return;
                }
            }
            ny61.k();
        }
    }
}
