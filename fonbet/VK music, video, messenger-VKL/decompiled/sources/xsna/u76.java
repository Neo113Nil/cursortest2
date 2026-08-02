package xsna;

import android.content.Intent;
import android.graphics.Bitmap;
import android.location.Location;
import com.vk.api.base.VkPaginationList;
import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vk.camera.editor.stories.impl.base.BaseCameraEditorContract$ScreenState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.im.MsgType;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.dto.stories.entities.StoryCameraTarget;
import com.vk.dto.stories.model.CommonUploadParams;
import com.vk.dto.stories.model.StoryUploadParams;
import com.vk.storycamera.builder.StoryEditorCameraParams;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import xsna.n930;

/* compiled from: BaseCameraEditorContract.kt */
/* loaded from: classes16.dex */
public interface u76 extends cc6, wsi, fyl0 {
    StoryEditorCameraParams A0();

    void A2();

    int B0();

    void B2();

    boolean B3();

    void C0(String str);

    void C1();

    void C2(boolean z);

    void C3(Bitmap bitmap, Bitmap bitmap2, boolean z);

    void C5(w1m0 w1m0Var, boolean z);

    n930.e D2();

    void D3();

    void D5();

    void E2();

    void F2();

    int G2();

    StoryUploadParams H2();

    void I2(String str, String str2);

    boolean I3();

    void J2(UserId userId);

    void K();

    void K2(int i);

    void L2();

    void M(nov novVar);

    di9 N5();

    boolean N6();

    tam0 O2();

    void P2();

    f2m0 Q2();

    void Q3(BaseCameraEditorContract$ScreenState baseCameraEditorContract$ScreenState);

    void S2(b96 b96Var);

    void T(StoryCameraTarget storyCameraTarget);

    void T2(t9l0 t9l0Var);

    void T4(izs<? super StoryPrivacyType, s3q0> izsVar);

    void U2();

    void V(boolean z);

    String W();

    void W4(boolean z, boolean z2);

    void X2();

    void Y3(boolean z);

    n930.i Y6();

    void Z2(List<? extends nov> list);

    boolean a0();

    void a3(gyl0 gyl0Var);

    void b0();

    void b3(n930 n930Var);

    String b5();

    v2l0 b7();

    a600 c3();

    void d5();

    void e3(boolean z);

    void f(nov novVar);

    boolean f3();

    void f7();

    void g3();

    iz8 getCadreSize();

    int getCurrentIndex();

    BaseCameraEditorContract$ScreenState getCurrentState();

    StoryPrivacyType getPrivacy();

    StoryCameraTarget getTarget();

    void h3();

    void i4();

    hi9 j3();

    LinkedHashMap j6();

    CommonUploadParams k3();

    void k7();

    void l();

    Location l3();

    Boolean m3();

    r76 o5();

    void onActivityResult(int i, int i2, Intent intent);

    void onClose();

    void p4(nov novVar);

    Boolean p5();

    void p6();

    void pauseVideo();

    boolean q7();

    p1m0 s4();

    boolean s6();

    void setEditorTouchesEnabled(boolean z);

    void setMsgType(MsgType msgType);

    void t();

    com.vk.stickers.api.styles.b t0();

    VkPaginationList<Group> t6();

    void v2(nov novVar);

    void w0();

    p86 w2();

    void x2(boolean z);

    StoryCameraMode x3();

    boolean y6();

    void z0();

    void z1(ArrayList arrayList, int i, izs izsVar);

    m0g0 z4();
}
