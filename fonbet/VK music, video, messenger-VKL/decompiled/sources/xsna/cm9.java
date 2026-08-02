package xsna;

import android.content.Intent;
import com.vk.content.design.view.camera.ShutterButton;
import com.vk.dto.masks.Mask;
import com.vk.dto.music.StoryMusicInfo;
import java.util.List;

/* compiled from: CameraUI.kt */
/* loaded from: classes.dex */
public interface cm9 extends sr6<bm9>, d0m0 {
    void Qh();

    void bf();

    void ff(boolean z, lno lnoVar, StoryMusicInfo storyMusicInfo);

    cg8 getBroadcastFriends();

    zd9 getCamera1View();

    lmv getClipsControls();

    boolean getGesturedControl();

    boolean getIsFullHdCamera();

    String getLiveNameText();

    default int getLockedOrientation() {
        return 1;
    }

    rg10 getMaskCallback();

    fm9 getPositions();

    Integer getQrModeIndex();

    float getSceneHeight();

    float getSceneWidth();

    Mask getSelectedMask();

    List<nov> getStickersCopy();

    zcl0 getStickersState();

    default int getUnLockedOrientation() {
        return -1;
    }

    @Override // xsna.d0m0
    default void onActivityResult(int i, int i2, Intent intent) {
        bm9 presenter = getPresenter();
        if (presenter != null) {
            presenter.onActivityResult(i, i2, intent);
        }
    }

    void setAttachCollectionSize(int i);

    void setBroadcast(pe8 pe8Var);

    void setCameraGridVisible(boolean z);

    void setClipsContentLoadingProgress(float f);

    void setClipsCountDownMarker(Long l);

    void setClipsProgress(float f);

    void setClipsProgressCounterVisible(boolean z);

    void setClipsProgressMaxDurationMs(int i);

    void setCountDownLayoutVisible(boolean z);

    void setDrawingState(vlo vloVar);

    void setLiveAuthorPhoto(String str);

    void setLiveNameText(String str);

    void setLiveNameTextEditable(boolean z);

    void setNewMasksBadgeCount(String str);

    void setNewMasksBadgeVisible(boolean z);

    void setQrProcessingEnabled(boolean z);

    void setShareButtonVisible(boolean z);

    void setShutterEnabled(boolean z);

    void setShutterEndless(boolean z);

    void setShutterLoadingProgress(float f);

    void setShutterPosition(boolean z);

    void setShutterProgressListener(ShutterButton.e eVar);

    void setStopwatchTime(int i);
}
