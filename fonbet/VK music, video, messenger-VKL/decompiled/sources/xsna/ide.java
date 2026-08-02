package xsna;

import com.vk.clips.viewer.impl.grid.lists.ClipsGridTabData;
import com.vk.dto.common.id.UserId;
import com.vk.dto.shortvideo.ClipCameraParams;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;

/* compiled from: ClipsGridHost.kt */
/* loaded from: classes.dex */
public interface ide {
    int Ba();

    void I5();

    void Je(int i);

    void K1(ClipGridParams.Data data, ClipCameraParams clipCameraParams, String str, MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint creationEntryPoint, UserId userId);

    sde w1(ClipsGridTabData clipsGridTabData);
}
