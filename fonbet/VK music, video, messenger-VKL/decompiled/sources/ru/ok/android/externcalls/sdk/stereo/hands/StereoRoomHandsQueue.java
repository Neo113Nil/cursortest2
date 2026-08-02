package ru.ok.android.externcalls.sdk.stereo.hands;

import java.util.Collection;
import xsna.izs;
import xsna.s3q0;

/* compiled from: StereoRoomHandsQueue.kt */
/* loaded from: classes9.dex */
public interface StereoRoomHandsQueue {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void loadMoreElements$default(StereoRoomHandsQueue stereoRoomHandsQueue, izs izsVar, izs izsVar2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadMoreElements");
        }
        if ((i & 1) != 0) {
            izsVar = null;
        }
        if ((i & 2) != 0) {
            izsVar2 = null;
        }
        stereoRoomHandsQueue.loadMoreElements(izsVar, izsVar2);
    }

    Collection<StereoHandQueueItem> getQueue();

    int getTotalCount();

    boolean hasMore();

    void loadMoreElements(izs<? super StereoRoomHandsQueue, s3q0> izsVar, izs<? super Throwable, s3q0> izsVar2);
}
