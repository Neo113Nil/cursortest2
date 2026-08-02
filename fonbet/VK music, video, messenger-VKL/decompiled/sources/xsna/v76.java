package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.StoryCameraTarget;
import com.vk.dto.stories.entities.StoryEditorMode;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import java.util.ArrayList;
import java.util.List;
import xsna.h90;
import xsna.tvo;
import xsna.w1m0;

/* compiled from: BaseCameraEditorContract.kt */
/* loaded from: classes16.dex */
public interface v76 extends dc6<u76>, tvo.a, h90.a, p5p {
    boolean C2();

    void Eg(boolean z);

    void Ha(boolean z);

    void Hk();

    boolean I4();

    void Ib();

    boolean J8();

    void J9();

    void K();

    void Oa(StoryEditorMode storyEditorMode);

    void S3(boolean z, bb bbVar, cb cbVar);

    void T(StoryCameraTarget storyCameraTarget);

    void Wa();

    void X0(w1m0.a aVar);

    void X7(float f);

    void Y8(UserId userId);

    void eb();

    fn2 getAnimationStickerManager();

    q3p getBottomControlPanel();

    iz8 getCadreSize();

    w1m0.a getDrawingHistory();

    int getDrawingHistorySize();

    int getLayoutHeight();

    int getLayoutWidth();

    kh6 getMusicDelegate();

    Context getRequireContext();

    z4p getSideControlPanel();

    t8l0 getStickerBackgroundState();

    List<nov> getStickers();

    StickersDrawingViewGroup getStickersDrawingView();

    zcl0 getStickersState();

    jpr0 getVerticalizationDelegate();

    void ik();

    void im();

    void kc(boolean z);

    void ki(Bitmap bitmap, String str);

    void m9(long j);

    boolean mi();

    void n7(float f, float f2, float f3);

    void nh(int i, v2l0 v2l0Var);

    void og();

    void onPause();

    void onResume();

    void p9(tam0 tam0Var, c230 c230Var);

    void pk(w76 w76Var);

    void r2(nov novVar);

    void release();

    void sc(nov novVar, yzs<? super Integer, ? super Integer, ? super nov, s3q0> yzsVar);

    void setBackgroundImage(Bitmap bitmap);

    void setBackgroundImage(Drawable drawable);

    void setBackgroundImageColor(int i);

    void setChangePhotoVisible(boolean z);

    void setContentLoaded(boolean z);

    void setDecorationVisibility(boolean z);

    void setDrawingUndoButtonEnabled(boolean z);

    void setDrawingViewsEnabled(boolean z);

    void setEditorViewsEnabled(boolean z);

    void setMultiBackgroundVisibility(boolean z);

    void setNeedRequestAudioFocus(boolean z);

    void setOpenCameraEnabled(boolean z);

    void setOpenCameraVisible(boolean z);

    void setStickersState(zcl0 zcl0Var);

    void setStickersViewTouchesEnabled(boolean z);

    void v2(nov novVar);

    void w0();

    void we();

    void z1(ArrayList arrayList, int i, izs izsVar);

    void z6();
}
