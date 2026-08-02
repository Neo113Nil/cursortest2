package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.stories.design.view.editor.StickerDeleteAreaView;

/* compiled from: BaseCameraEditorContract.kt */
/* loaded from: classes16.dex */
public interface s76 {
    View getBackgroundEditorBottomView();

    View getBackgroundEditorTopView();

    View getBottomPanel();

    View getCloseButtonBackground();

    View getDrawingBottomPanel();

    View getDrawingUndoButton();

    View getDrawingUndoContainer();

    View getEndButtonsPanel();

    z4p getSideControlPanel();

    View getSizeSeekBar();

    StickerDeleteAreaView getStickerDeleteArea();

    fov getStickersView();

    View getStylePicker();

    ViewGroup getTopButtonsPanel();

    View getTopDrawingControlsPanel();

    View getTrashPreviewBtn();

    void setEditorTouchesEnabled(boolean z);

    void setStickersViewTouchesEnabled(boolean z);
}
