package xsna;

import android.view.MotionEvent;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.profile.user.impl.ui.viewdelegates.SnowballsCoverHolder;
import com.vk.stickers.popup.PopupStickerView;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class rn9 implements View.OnTouchListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rn9(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        f2y0 write;
        bm9 presenter;
        bm9 presenter2;
        zlq zlqVar;
        int i = this.b;
        int i2 = 1;
        Object obj = this.c;
        switch (i) {
            case 0:
                CameraUIView cameraUIView = (CameraUIView) obj;
                float f = CameraUIView.w1;
                int action = motionEvent.getAction();
                if (action == 0) {
                    pe8 pe8Var = cameraUIView.B.l;
                    if (pe8Var != null && (write = pe8Var.getWrite()) != null) {
                        write.a0();
                    }
                    cameraUIView.J = motionEvent.getRawY();
                } else if (action == 1) {
                    cameraUIView.J = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    cameraUIView.K = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    cameraUIView.L = false;
                } else if (action != 2) {
                    if (action == 3) {
                        cameraUIView.J = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        cameraUIView.K = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        cameraUIView.L = false;
                    }
                } else if (motionEvent.getPointerCount() == 1) {
                    bm9 presenter3 = cameraUIView.getPresenter();
                    if (presenter3 == null || !presenter3.q3()) {
                        if (!cameraUIView.L) {
                            if (cameraUIView.J - motionEvent.getRawY() > cameraUIView.getHeight() / 8) {
                                cameraUIView.L = true;
                                bm9 presenter4 = cameraUIView.getPresenter();
                                if (presenter4 != null && presenter4.y4() && (presenter2 = cameraUIView.getPresenter()) != null) {
                                    presenter2.z();
                                }
                            } else if (motionEvent.getRawY() - cameraUIView.J > cameraUIView.getHeight() / 8) {
                                cameraUIView.L = true;
                                bm9 presenter5 = cameraUIView.getPresenter();
                                if (presenter5 != null && presenter5.y4() && (presenter = cameraUIView.getPresenter()) != null) {
                                    presenter.A();
                                }
                            }
                        }
                    } else if (Math.abs(cameraUIView.J - motionEvent.getRawY()) > cameraUIView.z) {
                        float f2 = cameraUIView.W0;
                        View view2 = cameraUIView.L0;
                        if (view2 == null) {
                            view2 = null;
                        }
                        if (f2 == view2.getTranslationY()) {
                            if (cameraUIView.K == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                cameraUIView.K = motionEvent.getRawY();
                            }
                            float f3 = (-(motionEvent.getRawY() - cameraUIView.K)) / cameraUIView.y;
                            zd9 camera1View = cameraUIView.getCamera1View();
                            if (camera1View != null) {
                                zd9 camera1View2 = cameraUIView.getCamera1View();
                                camera1View.setZoomLevel((camera1View2 != null ? Float.valueOf(camera1View2.getZoomLevel()) : null).floatValue() + f3);
                            }
                            cameraUIView.K = motionEvent.getRawY();
                        }
                    }
                } else {
                    cameraUIView.L = true;
                }
                View view3 = cameraUIView.L0;
                cameraUIView.W0 = (view3 != null ? view3 : null).getTranslationY();
                return true;
            case 1:
                q2e q2eVar = (q2e) obj;
                Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
                if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 3)) {
                    zlq zlqVar2 = q2eVar.c;
                    if (zlqVar2 != null) {
                        zlqVar2.a(motionEvent);
                    }
                    view.setPressed(false);
                    view.setOnTouchListener(null);
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                } else if (motionEvent != null && (zlqVar = q2eVar.c) != null) {
                    zlqVar.a(motionEvent);
                }
                return true;
            case 2:
                PopupStickerView popupStickerView = (PopupStickerView) obj;
                AtomicInteger atomicInteger = PopupStickerView.q;
                if (motionEvent.getAction() == 0) {
                    xwb0 xwb0Var = popupStickerView.d;
                    if (xwb0Var != null) {
                        xwb0Var.k();
                    }
                    if (!popupStickerView.n) {
                        popupStickerView.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(200L).setListener(new dvo(popupStickerView, i2)).start();
                    }
                    xwb0 xwb0Var2 = popupStickerView.d;
                    if (xwb0Var2 != null) {
                        xwb0Var2.k();
                    }
                    view.performClick();
                }
                return false;
            default:
                com.vk.profile.user.impl.ui.a aVar = ((com.vk.profile.user.impl.ui.i) obj).h;
                SnowballsCoverHolder snowballsCoverHolder = aVar.c;
                if (!aVar.i) {
                    int action2 = motionEvent.getAction();
                    if (action2 != 0) {
                        if (action2 != 1) {
                            return true;
                        }
                        view.performClick();
                        return true;
                    }
                    if (aVar.j) {
                        return true;
                    }
                    aVar.j = true;
                } else if (bwt0.G(snowballsCoverHolder.a).contains(motionEvent.getX(), motionEvent.getY())) {
                    snowballsCoverHolder.a.onTouchEvent(motionEvent);
                }
                return false;
        }
    }
}
