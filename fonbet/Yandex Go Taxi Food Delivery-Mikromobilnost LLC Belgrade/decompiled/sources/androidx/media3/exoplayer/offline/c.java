package androidx.media3.exoplayer.offline;

import defpackage.u6m;
import java.util.Comparator;

/* loaded from: classes10.dex */
public final /* synthetic */ class c implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compareStartTimes;
        compareStartTimes = DownloadManager$InternalHandler.compareStartTimes((u6m) obj, (u6m) obj2);
        return compareStartTimes;
    }
}
