package xsna;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.camera.editor.stories.api.di.StoryEditorComponent;
import com.vk.cameraui.ShutterStates;
import com.vk.clips.config.authors.api.di.ClipsConfigAuthorsComponent;
import com.vk.clips.design.view.camera.widgets.TabsRecycler;
import com.vk.content.design.view.camera.AttachWithCounterView;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.content.design.view.camera.ShutterButton;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.dto.clips.model.ClipsEditorInitParams;
import com.vk.dto.clips.model.ClipsEditorInputData;
import com.vk.dto.clips.model.ClipsEditorSessionParams;
import com.vk.dto.clips.upload.ClipsEditorUploadParams;
import com.vk.dto.masks.Mask;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.dto.stories.model.CommonUploadParams;
import com.vk.dto.stories.model.StoryUploadParams;
import com.vk.stories.analytics.StoryPublishEvent;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import com.vk.story.settings.api.di.StoriesSettingsComponent;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vk.storycamera.screen.StoryCameraActivity;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.EmptyList;
import xsna.vyd;

/* compiled from: BaseCameraUIView.kt */
/* loaded from: classes.dex */
public abstract class n96 extends FrameLayout implements cm9, TabsRecycler.b, ShutterButton.a {
    public final dm9 b;
    public zd9 c;
    public TabsRecycler d;
    public ShutterButton e;
    public View f;
    public VkPicture g;
    public View h;
    public View i;
    public VkPicture j;
    public ImageView k;
    public AttachWithCounterView l;
    public View m;
    public ImageView n;
    public FrameLayout o;
    public StickersDrawingViewGroup p;
    public final bpn0 q;
    public final bpn0 r;
    public final HashMap s;
    public LinkedList<ShutterButton.d> t;
    public s8g0 u;
    public final LinkedHashSet v;

    public n96(Context context, dm9 dm9Var) {
        super(context);
        this.b = dm9Var;
        this.q = new bpn0(new lk(2));
        this.r = new bpn0(new com.vk.movika.sdk.base.logic.interactor.l(6));
        this.s = new HashMap();
        this.t = new LinkedList<>();
        this.v = new LinkedHashSet();
    }

    private final mhd getAuthorExperiments() {
        return ((ClipsConfigAuthorsComponent) ((bpn0) this.b.g()).getValue()).getExperiments();
    }

    private final vyd getClipsEditorProvider() {
        return ((CameraClipsComponent) ((bpn0) this.b.e()).getValue()).sf();
    }

    private final q1m0 getStoryEditorProvider() {
        return ((StoryEditorComponent) ((bpn0) this.b.n()).getValue()).Sb();
    }

    @Override // xsna.d0m0
    public final void C9() {
        m();
    }

    @Override // xsna.d0m0
    public final void G2(String str) {
        bm9 bm9Var = (bm9) getPresenter();
        if (bm9Var != null) {
            bm9Var.G2(str);
        }
    }

    @Override // xsna.nht
    public final void K0(int i, String[] strArr) {
        am9 K3;
        bm9 bm9Var = (bm9) getPresenter();
        if (bm9Var != null && (K3 = bm9Var.K3()) != null) {
            Context context = getContext();
            StoryPublishEvent storyPublishEvent = StoryPublishEvent.CAMERA_ACCESS_DENIED;
            bm9 bm9Var2 = (bm9) getPresenter();
            K3.e(context, storyPublishEvent, bm9Var2 != null ? bm9Var2.c4() : null);
        }
        s8g0 s8g0Var = this.u;
        if (s8g0Var != null) {
            s8g0Var.K0(i, strArr);
        }
    }

    @Override // xsna.d0m0
    public final void Md(Intent intent, boolean z) {
        ((CameraUIView) this).O(-1, intent, z);
    }

    @Override // xsna.d0m0
    public final void Nl() {
        t();
    }

    @Override // xsna.d0m0
    public final void T8(int i, String[] strArr, int[] iArr) {
        s8g0 s8g0Var = this.u;
        if (s8g0Var != null) {
            s8g0Var.onRequestPermissionsResult(i, strArr, iArr);
        }
        p5p e = getPositions().e();
        if (e != null) {
            e.h(i, strArr, iArr);
        }
    }

    @Override // com.vk.content.design.view.camera.ShutterButton.a
    public final void a(int i) {
        bm9 bm9Var;
        if (getShutterLock().a() || getClickLock().c() || (bm9Var = (bm9) getPresenter()) == null) {
            return;
        }
        bm9Var.r3(null);
    }

    public boolean a0() {
        bm9 bm9Var = (bm9) getPresenter();
        if (bm9Var != null) {
            return bm9Var.a0();
        }
        return false;
    }

    @Override // com.vk.content.design.view.camera.ShutterButton.a
    public final void c(long j) {
        bm9 bm9Var = (bm9) getPresenter();
        if (bm9Var != null) {
            bm9Var.b4();
        }
    }

    @Override // com.vk.content.design.view.camera.ShutterButton.a
    public final void d(int i) {
        bm9 bm9Var = (bm9) getPresenter();
        if (bm9Var != null) {
            bm9Var.R3();
        }
    }

    public final void d0() {
        mhy.b(getContext());
    }

    @Override // com.vk.content.design.view.camera.ShutterButton.a
    public final void g(int i) {
        bm9 bm9Var = (bm9) getPresenter();
        if (bm9Var != null) {
            bm9Var.x3();
        }
    }

    public final void g0() {
        StoryCameraParams cameraParams = getCameraParams();
        if (cameraParams == null || !cameraParams.Tb()) {
            cvk.w(getContext().getString(R.string.camera_ui_processing_error), false);
        }
    }

    public abstract /* synthetic */ pe8 getBroadcast();

    public abstract /* synthetic */ cg8 getBroadcastFriends();

    @Override // xsna.cm9
    public zd9 getCamera1View() {
        return this.c;
    }

    public final StoryCameraParams getCameraParams() {
        bm9 bm9Var = (bm9) getPresenter();
        StoryCameraParams A0 = bm9Var != null ? bm9Var.A0() : null;
        if (A0 != null) {
            return A0;
        }
        return null;
    }

    public final s8g0 getCameraPermissionHelper() {
        return this.u;
    }

    public final pxo0 getClickLock() {
        return (pxo0) this.q.getValue();
    }

    public abstract /* synthetic */ lmv getClipsControls();

    public final AttachWithCounterView getCollectionButton() {
        return this.l;
    }

    @Override // xsna.d0m0
    public StoryCameraParams getCurCameraParams() {
        bm9 bm9Var = (bm9) getPresenter();
        if (bm9Var != null) {
            return bm9Var.getCurCameraParams();
        }
        return null;
    }

    public abstract /* synthetic */ izs getCustomQrListener();

    public final dm9 getDeps() {
        return this.b;
    }

    public final FrameLayout getEditorContainer() {
        return this.o;
    }

    public final ImageView getFlashButton() {
        return this.k;
    }

    public abstract /* synthetic */ boolean getGesturedControl();

    public abstract /* synthetic */ boolean getIsFullHdCamera();

    public final Set<ViewTreeObserver.OnGlobalLayoutListener> getLayoutObservers() {
        return this.v;
    }

    public abstract /* synthetic */ String getLiveAuthorPhoto();

    public abstract /* synthetic */ String getLiveNameText();

    public abstract /* synthetic */ boolean getLiveNameTextEditable();

    public abstract /* synthetic */ float getLoadingProgress();

    @Override // xsna.cm9
    public int getLockedOrientation() {
        return 1;
    }

    public abstract /* synthetic */ rg10 getMaskCallback();

    public final View getMasksButton() {
        return this.m;
    }

    public final View getPhotosButtonBottom() {
        return this.f;
    }

    public final View getPhotosButtonRollBottom() {
        return this.h;
    }

    public final VkPicture getPhotosButtonThumbBottom() {
        return this.g;
    }

    public final VkPicture getPhotosButtonThumbTop() {
        return this.j;
    }

    public final View getPhotosButtonTop() {
        return this.i;
    }

    public abstract /* synthetic */ fm9 getPositions();

    public abstract /* synthetic */ qk6 getPresenter();

    public abstract /* synthetic */ Integer getQrModeIndex();

    public abstract /* synthetic */ float getSceneHeight();

    public abstract /* synthetic */ float getSceneWidth();

    @Override // xsna.d0m0
    public int getScreenLockedOrientation() {
        return getLockedOrientation();
    }

    public abstract /* synthetic */ Mask getSelectedMask();

    public final ShutterButton getShutter() {
        return this.e;
    }

    public final LinkedList<ShutterButton.d> getShutterItems() {
        return this.t;
    }

    public final pxo0 getShutterLock() {
        return (pxo0) this.r.getValue();
    }

    public final Map<ShutterStates, ShutterButton.d> getShutterStatesMap() {
        return this.s;
    }

    @Override // xsna.cm9
    public List<nov> getStickersCopy() {
        zcl0 stickersStateCopy;
        CopyOnWriteArrayList l;
        StickersDrawingViewGroup stickersDrawingViewGroup = this.p;
        return (stickersDrawingViewGroup == null || (stickersStateCopy = stickersDrawingViewGroup.getStickersStateCopy()) == null || (l = stickersStateCopy.l()) == null) ? EmptyList.b : l;
    }

    public final StickersDrawingViewGroup getStickersDrawingViewGroup() {
        return this.p;
    }

    @Override // xsna.cm9
    public zcl0 getStickersState() {
        zcl0 stickersState;
        StickersDrawingViewGroup stickersDrawingViewGroup = this.p;
        return (stickersDrawingViewGroup == null || (stickersState = stickersDrawingViewGroup.getStickersState()) == null) ? zcl0.e : stickersState;
    }

    public final evl0 getStoriesSettingsController() {
        return ((StoriesSettingsComponent) ((bpn0) this.b.m()).getValue()).B7();
    }

    public final ImageView getSwitchButton() {
        return this.n;
    }

    public final TabsRecycler getTabs() {
        return this.d;
    }

    @Override // xsna.cm9
    public int getUnLockedOrientation() {
        return -1;
    }

    @Override // xsna.d0m0
    public final void h3(Bundle bundle) {
        bm9 bm9Var = (bm9) getPresenter();
        if (bm9Var != null) {
            bm9Var.h3(bundle);
        }
    }

    @Override // com.vk.content.design.view.camera.ShutterButton.a
    public final void j() {
        bm9 bm9Var = (bm9) getPresenter();
        if (bm9Var != null) {
            bm9Var.g4();
        }
    }

    public final void k(ClipsEditorInputData clipsEditorInputData, ClipsEditorUploadParams clipsEditorUploadParams) {
        StoryCameraParams cameraParams = getCameraParams();
        boolean z = !(cameraParams != null ? cameraParams.Ab() : true);
        ClipsEditorInitParams clipsEditorInitParams = new ClipsEditorInitParams(clipsEditorInputData, clipsEditorUploadParams, new ClipsEditorSessionParams(null, z, z, z, null, false, 49, null));
        dhr0.a.getClass();
        vyd.c cVar = new vyd.c(dhr0.u().c, 12, 13);
        vyd clipsEditorProvider = getClipsEditorProvider();
        Context context = getContext();
        bpn0 bpn0Var = enj.a;
        clipsEditorProvider.c(e3m.h(context), clipsEditorInitParams, cVar);
    }

    public final p5p l(List<tam0> list, CommonUploadParams commonUploadParams, StoryUploadParams storyUploadParams, StoryCameraMode storyCameraMode, StoryCameraParams storyCameraParams) {
        p5p a = getStoryEditorProvider().a(bwt0.u(getContext()), this.o, (di9) getPresenter(), new m1m0(list, commonUploadParams, storyUploadParams, storyCameraMode, storyCameraParams.zb(), storyCameraParams.Db(), storyCameraParams.Sb()));
        getPositions().h(a);
        return a;
    }

    public void m() {
        Window window;
        if (!(getContext() instanceof Activity) || (window = ((Activity) getContext()).getWindow()) == null) {
            return;
        }
        window.addFlags(1024);
    }

    public final void n(float f, long j) {
        ShutterButton shutterButton = this.e;
        if (shutterButton != null) {
            ValueAnimator valueAnimator = shutterButton.x;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                valueAnimator.removeAllUpdateListeners();
                valueAnimator.removeAllListeners();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(shutterButton.z, f);
            ofFloat.addUpdateListener(new lkj0(shutterButton, 0));
            ofFloat.setDuration(j);
            ofFloat.setInterpolator(new OvershootInterpolator());
            ofFloat.start();
            shutterButton.x = ofFloat;
        }
    }

    public final void o(View view, gzs gzsVar) {
        if (view.getWidth() != 0) {
            gzsVar.invoke();
            return;
        }
        m96 m96Var = new m96(view, this, gzsVar);
        this.v.add(m96Var);
        getViewTreeObserver().addOnGlobalLayoutListener(m96Var);
    }

    @Override // xsna.cm9, xsna.d0m0
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        s8g0 s8g0Var = this.u;
        if (s8g0Var != null) {
            s8g0Var.onActivityResult(i, i2, intent);
        }
        p5p e = getPositions().e();
        if (e != null) {
            e.B(i, i2, intent);
        }
    }

    public void onDestroy() {
        bm9 bm9Var = (bm9) getPresenter();
        if (bm9Var != null) {
            bm9Var.onDestroy();
        }
    }

    @Override // xsna.d0m0
    public final void onPause() {
        bm9 bm9Var = (bm9) getPresenter();
        if (bm9Var != null) {
            bm9Var.onPause();
        }
    }

    @Override // xsna.h90.a
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        T8(i, strArr, iArr);
    }

    public void onResume() {
        bm9 bm9Var = (bm9) getPresenter();
        if (bm9Var != null) {
            bm9Var.onResume();
        }
    }

    @Override // xsna.d0m0
    public final void onStart() {
        bm9 bm9Var = (bm9) getPresenter();
        if (bm9Var != null) {
            bm9Var.onStart();
        }
    }

    @Override // xsna.d0m0
    public final void onStop() {
        bm9 bm9Var = (bm9) getPresenter();
        if (bm9Var != null) {
            bm9Var.onStop();
        }
    }

    public final int p(int i) {
        bm9 bm9Var = (bm9) getPresenter();
        if (bm9Var != null) {
            return bm9Var.p4(i, this.s, this.t);
        }
        return -1;
    }

    @Override // xsna.tvo.a
    public final void pc(int i, List<String> list) {
        s8g0 s8g0Var = this.u;
        if (s8g0Var != null) {
            s8g0Var.pc(i, list);
        }
        p5p e = getPositions().e();
        if (e != null) {
            e.C(i, (ArrayList) list);
        }
    }

    public final void q() {
        ImageView imageView = this.k;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.vk_icon_flash_off_outline_shadow_large_48);
        }
        ImageView imageView2 = this.k;
        if (imageView2 != null) {
            imageView2.setContentDescription(getContext().getString(R.string.story_accessibility_turn_on_flash));
        }
        zd9 camera1View = getCamera1View();
        if (camera1View != null) {
            camera1View.setFlashMode(0);
        }
    }

    public final void r() {
        StickersDrawingViewGroup stickersDrawingViewGroup = this.p;
        if (stickersDrawingViewGroup != null) {
            stickersDrawingViewGroup.o();
        }
    }

    public final void s() {
        StickersDrawingViewGroup stickersDrawingViewGroup = this.p;
        if (stickersDrawingViewGroup != null) {
            stickersDrawingViewGroup.r();
        }
    }

    public final void sc(nov novVar, yzs<? super Integer, ? super Integer, ? super nov, s3q0> yzsVar) {
        StickersDrawingViewGroup stickersDrawingViewGroup = this.p;
        if (stickersDrawingViewGroup != null) {
            stickersDrawingViewGroup.g(novVar, yzsVar);
        }
    }

    @Override // xsna.cm9
    public void setAttachCollectionSize(int i) {
        AttachWithCounterView attachWithCounterView = this.l;
        if (attachWithCounterView != null) {
            attachWithCounterView.setCount(i);
        }
    }

    public abstract /* synthetic */ void setBroadcast(pe8 pe8Var);

    public abstract /* synthetic */ void setBroadcastFriends(cg8 cg8Var);

    public void setCamera1View(zd9 zd9Var) {
        this.c = zd9Var;
    }

    public abstract /* synthetic */ void setCameraGridVisible(boolean z);

    public final void setCameraPermissionHelper(s8g0 s8g0Var) {
        this.u = s8g0Var;
    }

    public abstract /* synthetic */ void setClipsContentLoadingProgress(float f);

    public abstract /* synthetic */ void setClipsCountDownMarker(Long l);

    public abstract /* synthetic */ void setClipsProgress(float f);

    public abstract /* synthetic */ void setClipsProgressCounterVisible(boolean z);

    public abstract /* synthetic */ void setClipsProgressMaxDurationMs(int i);

    public final void setCollectionButton(AttachWithCounterView attachWithCounterView) {
        this.l = attachWithCounterView;
    }

    public abstract /* synthetic */ void setCountDownIcon(int i);

    public abstract /* synthetic */ void setCountDownLayoutVisible(boolean z);

    public abstract /* synthetic */ void setCustomQrListener(izs izsVar);

    @Override // xsna.cm9
    public void setDrawingState(vlo vloVar) {
        StickersDrawingViewGroup stickersDrawingViewGroup = this.p;
        if (stickersDrawingViewGroup != null) {
            stickersDrawingViewGroup.setDrawingState(vloVar);
        }
        StickersDrawingViewGroup stickersDrawingViewGroup2 = this.p;
        if (stickersDrawingViewGroup2 != null) {
            stickersDrawingViewGroup2.setDrawingSemiTransparent(true);
        }
    }

    public final void setEditorContainer(FrameLayout frameLayout) {
        this.o = frameLayout;
    }

    public final void setFlashButton(ImageView imageView) {
        this.k = imageView;
    }

    public abstract /* synthetic */ void setIsFullHdCamera(boolean z);

    public abstract /* synthetic */ void setLiveAuthorPhoto(String str);

    public abstract /* synthetic */ void setLiveNameText(String str);

    public abstract /* synthetic */ void setLiveNameTextEditable(boolean z);

    public final void setMasksButton(View view) {
        this.m = view;
    }

    public abstract /* synthetic */ void setNewMasksBadgeCount(String str);

    public abstract /* synthetic */ void setNewMasksBadgeVisible(boolean z);

    public abstract /* synthetic */ void setOnFirstFrameCallback(gzs gzsVar);

    public final void setPhotosButtonBottom(View view) {
        this.f = view;
    }

    public final void setPhotosButtonRollBottom(View view) {
        this.h = view;
    }

    public final void setPhotosButtonThumbBottom(VkPicture vkPicture) {
        this.g = vkPicture;
    }

    public final void setPhotosButtonThumbTop(VkPicture vkPicture) {
        this.j = vkPicture;
    }

    public final void setPhotosButtonTop(View view) {
        this.i = view;
    }

    public abstract /* synthetic */ void setPositions(fm9 fm9Var);

    public abstract /* synthetic */ void setPresenter(qk6 qk6Var);

    public abstract /* synthetic */ void setQrProcessingEnabled(boolean z);

    public abstract /* synthetic */ void setShareButtonVisible(boolean z);

    public final void setShutter(ShutterButton shutterButton) {
        this.e = shutterButton;
    }

    public abstract /* synthetic */ void setShutterEnabled(boolean z);

    @Override // xsna.cm9
    public void setShutterEndless(boolean z) {
        ShutterButton shutterButton = this.e;
        if (shutterButton != null) {
            shutterButton.setEndless(z);
        }
    }

    public final void setShutterItems(LinkedList<ShutterButton.d> linkedList) {
        this.t = linkedList;
    }

    public abstract /* synthetic */ void setShutterLoadingProgress(float f);

    public abstract /* synthetic */ void setShutterPosition(boolean z);

    public abstract /* synthetic */ void setShutterProgressListener(ShutterButton.e eVar);

    public final void setStickersDrawingViewGroup(StickersDrawingViewGroup stickersDrawingViewGroup) {
        this.p = stickersDrawingViewGroup;
    }

    public abstract /* synthetic */ void setStopwatchTime(int i);

    public abstract /* synthetic */ void setSwipeSemiposition(boolean z);

    public final void setSwitchButton(ImageView imageView) {
        this.n = imageView;
    }

    public abstract /* synthetic */ void setTab(StoryCameraMode storyCameraMode);

    public final void setTabs(TabsRecycler tabsRecycler) {
        this.d = tabsRecycler;
    }

    public abstract /* synthetic */ void setVisibleProgressView(boolean z);

    public void t() {
        Window window;
        if (!(getContext() instanceof Activity) || (getContext() instanceof StoryCameraActivity) || (window = ((Activity) getContext()).getWindow()) == null) {
            return;
        }
        window.clearFlags(1024);
    }

    public final void u() {
        ShutterButton shutterButton = this.e;
        if (shutterButton != null) {
            mkj0 mkj0Var = shutterButton.F;
            if (mkj0Var != null) {
                mkj0Var.dispose();
            }
            fte0 fte0Var = new fte0(340L, shutterButton.H.r0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            mkj0 mkj0Var2 = new mkj0(shutterButton);
            fte0Var.subscribe(mkj0Var2);
            shutterButton.F = mkj0Var2;
        }
    }

    public final void v(long j, float f, boolean z) {
        ShutterButton shutterButton = this.e;
        if (shutterButton != null) {
            okj0 okj0Var = shutterButton.H;
            okj0Var.r0 = 1.0f;
            mkj0 mkj0Var = shutterButton.F;
            if (mkj0Var != null) {
                mkj0Var.dispose();
            }
            com.vk.content.design.view.camera.d dVar = shutterButton.E;
            if (dVar != null) {
                dVar.dispose();
            }
            float f2 = okj0Var.p0;
            io.reactivex.rxjava3.core.t fte0Var = f2 > f ? new fte0(j, f2, f) : new gug0(j, f2, (!shutterButton.K || f2 >= f) ? f : 10.0f);
            com.vk.content.design.view.camera.d dVar2 = new com.vk.content.design.view.camera.d(z, shutterButton, j);
            fte0Var.subscribe(dVar2);
            shutterButton.E = dVar2;
        }
    }

    @Override // xsna.d0m0
    public final void v1(String str, String str2) {
        bm9 bm9Var = (bm9) getPresenter();
        if (bm9Var != null) {
            bm9Var.v1(str, str2);
        }
    }

    public final void w() {
        com.vk.content.design.view.camera.d dVar;
        ShutterButton shutterButton = this.e;
        if (shutterButton == null || (dVar = shutterButton.E) == null) {
            return;
        }
        dVar.dispose();
    }

    @Override // xsna.tvo.a
    public final void wi(int i, List<String> list) {
        s8g0 s8g0Var = this.u;
        if (s8g0Var != null) {
            s8g0Var.wi(i, list);
        }
        p5p e = getPositions().e();
        if (e != null) {
            e.y(i, (ArrayList) list);
        }
    }

    public final void x(boolean z) {
        ShutterButton shutterButton = this.e;
        if (shutterButton != null) {
            shutterButton.setHorizontal(z);
            shutterButton.setItems(this.t);
            shutterButton.c = p(getPositions().getState().d());
            shutterButton.d = -1;
            shutterButton.setDelta(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            shutterButton.post(new sc2(shutterButton, 8));
        }
    }

    @Override // xsna.d0m0
    public final boolean zk() {
        an9 state;
        bm9 bm9Var = (bm9) getPresenter();
        if (bm9Var == null || (state = bm9Var.getState()) == null) {
            return false;
        }
        return state.b();
    }
}
