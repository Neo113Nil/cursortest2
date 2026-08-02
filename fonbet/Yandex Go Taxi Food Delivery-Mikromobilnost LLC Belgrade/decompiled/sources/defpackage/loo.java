package defpackage;

import androidx.media3.common.a;
import java.util.List;

/* loaded from: classes10.dex */
public interface loo extends l001 {
    void disable();

    void enable();

    int evaluateQueueSize(long j, List list);

    boolean excludeTrack(int i, long j);

    a getSelectedFormat();

    int getSelectedIndex();

    int getSelectedIndexInTrackGroup();

    Object getSelectionData();

    int getSelectionReason();

    boolean isTrackExcluded(int i, long j);

    default void onDiscontinuity() {
    }

    void onPlayWhenReadyChanged(boolean z);

    void onPlaybackSpeed(float f);

    default void onRebuffer() {
    }

    default boolean shouldCancelChunkLoad(long j, nsb nsbVar, List list) {
        return false;
    }

    void updateSelectedTrack(long j, long j2, long j3, List list, jb10[] jb10VarArr);
}
