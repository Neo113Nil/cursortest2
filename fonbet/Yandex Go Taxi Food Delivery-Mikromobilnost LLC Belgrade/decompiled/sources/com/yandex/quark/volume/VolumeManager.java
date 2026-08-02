package com.yandex.quark.volume;

import defpackage.pz31;
import kotlin.Metadata;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000f\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0007J7\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH&¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\tH&¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\tH&¢\u0006\u0004\b\u0018\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\tH&¢\u0006\u0004\b\u0019\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u001a\u0010\u0007J\u001f\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u001b\u0010\u0007J'\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\tH&¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\"H&¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\"H&¢\u0006\u0004\b&\u0010%J\u0017\u0010(\u001a\u00020\t2\u0006\u0010'\u001a\u00020\tH&¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\t2\u0006\u0010*\u001a\u00020\tH&¢\u0006\u0004\b+\u0010)R\u0014\u0010.\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00100\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u0010-¨\u00061"}, d2 = {"Lcom/yandex/quark/volume/VolumeManager;", "", "", "requestId", "source", "Lzy11;", "volumeUp", "(Ljava/lang/String;Ljava/lang/String;)V", "volumeDown", "", "startPercentVolume", "endPercentVolume", "percentStep", "", "stepMs", "startChangingVolume", "(Ljava/lang/String;IIIJ)V", "", "restoreVolumeLevel", "stopChangingVolume", "(Ljava/lang/String;Z)V", "getMinVolume", "()I", "getMaxVolume", "getVolumeStep", "getDefaultVolume", "mute", "unmute", "volume", "setVolume", "(Ljava/lang/String;ILjava/lang/String;)V", "aliceLimit", "setAliceVolumeMaxLimit", "(I)V", "Lpz31;", "listener", "addListener", "(Lpz31;)V", "removeListener", "platformVolume", "convertPlatformToAliceVolume", "(I)I", "aliceVolume", "convertAliceToPlatformVolume", "getSupportPercentLevel", "()Z", "supportPercentLevel", "getUseCoarseScale", "useCoarseScale", "quark-contracts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface VolumeManager {
    void addListener(pz31 listener);

    int convertAliceToPlatformVolume(int aliceVolume);

    int convertPlatformToAliceVolume(int platformVolume);

    int getDefaultVolume();

    int getMaxVolume();

    int getMinVolume();

    boolean getSupportPercentLevel();

    boolean getUseCoarseScale();

    int getVolumeStep();

    void mute(String requestId, String source);

    void removeListener(pz31 listener);

    void setAliceVolumeMaxLimit(int aliceLimit);

    void setVolume(String requestId, int volume, String source);

    void startChangingVolume(String requestId, int startPercentVolume, int endPercentVolume, int percentStep, long stepMs);

    void stopChangingVolume(String requestId, boolean restoreVolumeLevel);

    void unmute(String requestId, String source);

    void volumeDown(String requestId, String source);

    void volumeUp(String requestId, String source);
}
