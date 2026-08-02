package xsna;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.tips.Tooltip;
import com.vk.core.tips.c;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.right.VkCellRight;
import com.vk.dto.music.MusicTrack;
import com.vk.photo.editor.PhotoEditorView;
import com.vkontakte.android.R;
import one.video.ad.ux.controls.OneVideoAdBaseControls;
import one.video.ad.ux.controls.OneVideoAdControlsView;
import one.video.ad.ux.playpause.PlayPauseFrameView;
import one.video.controls.views.PlayerControlsView;
import xsna.jgz0;
import xsna.kkz0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class ep6 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ep6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zd9 camera1View;
        ywp0 controlsListener;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                fp6 fp6Var = (fp6) obj;
                jpo0 jpo0Var = fp6Var.q;
                if (jpo0Var != null) {
                    fp6Var.l.c(jpo0Var);
                    break;
                }
                break;
            case 1:
                CameraUIView cameraUIView = (CameraUIView) obj;
                float f = CameraUIView.w1;
                if (!cameraUIView.getClickLock().a() && !cameraUIView.getShutterLock().a() && (camera1View = cameraUIView.getCamera1View()) != null) {
                    if (camera1View.getFlashMode() == 2) {
                        cameraUIView.q();
                    } else {
                        ImageView imageView = cameraUIView.k;
                        if (imageView != null) {
                            imageView.setImageResource(R.drawable.vk_icon_flash_outline_shadow_large_48);
                        }
                        ImageView imageView2 = cameraUIView.k;
                        if (imageView2 != null) {
                            imageView2.setContentDescription(cameraUIView.getContext().getString(R.string.story_accessibility_turn_off_flash));
                        }
                        zd9 camera1View2 = cameraUIView.getCamera1View();
                        if (camera1View2 != null) {
                            camera1View2.setFlashMode(2);
                        }
                    }
                    bm9 bm9Var = (bm9) cameraUIView.getPresenter();
                    if (bm9Var != null) {
                        bm9Var.o4();
                        break;
                    }
                }
                break;
            case 2:
                vqu.m((vqu) obj);
                break;
            case 3:
                int i2 = OneVideoAdControlsView.A;
                OneVideoAdBaseControls.a listener = ((OneVideoAdControlsView) obj).getListener();
                if (listener != null) {
                    listener.b();
                    break;
                }
                break;
            case 4:
                int i3 = PhotoEditorView.c0;
                ((PhotoEditorView) obj).q();
                break;
            case 5:
                PlayPauseFrameView.b((PlayPauseFrameView) obj);
                break;
            case 6:
                PlayerControlsView playerControlsView = (PlayerControlsView) obj;
                PlayerControlsView.b bVar = PlayerControlsView.O;
                Object tag = view.getTag();
                if (!epx.f(tag, "play")) {
                    if (!epx.f(tag, "replay")) {
                        if (!epx.f(tag, "settings")) {
                            if (!epx.f(tag, "vk_logo")) {
                                if (!epx.f(tag, "fullscreen")) {
                                    if (!epx.f(tag, "resize")) {
                                        if (!epx.f(tag, "pip")) {
                                            if (!epx.f(tag, "chrome_cast")) {
                                                if (!epx.f(tag, "smart_cast")) {
                                                    if (!epx.f(tag, "bugreport")) {
                                                        if (!epx.f(tag, "share_feedback")) {
                                                            if (epx.f(tag, "intervals") && (controlsListener = playerControlsView.getControlsListener()) != null) {
                                                                controlsListener.i();
                                                                break;
                                                            }
                                                        } else {
                                                            ywp0 controlsListener2 = playerControlsView.getControlsListener();
                                                            if (controlsListener2 != null) {
                                                                controlsListener2.y();
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        ywp0 controlsListener3 = playerControlsView.getControlsListener();
                                                        if (controlsListener3 != null) {
                                                            controlsListener3.k();
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    ywp0 controlsListener4 = playerControlsView.getControlsListener();
                                                    if (controlsListener4 != null) {
                                                        controlsListener4.f();
                                                        break;
                                                    }
                                                }
                                            } else {
                                                ywp0 controlsListener5 = playerControlsView.getControlsListener();
                                                if (controlsListener5 != null) {
                                                    controlsListener5.x();
                                                    break;
                                                }
                                            }
                                        } else {
                                            ywp0 controlsListener6 = playerControlsView.getControlsListener();
                                            if (controlsListener6 != null) {
                                                controlsListener6.d();
                                                break;
                                            }
                                        }
                                    } else {
                                        ywp0 controlsListener7 = playerControlsView.getControlsListener();
                                        if (controlsListener7 != null) {
                                            controlsListener7.e();
                                            break;
                                        }
                                    }
                                } else {
                                    ywp0 controlsListener8 = playerControlsView.getControlsListener();
                                    if (controlsListener8 != null) {
                                        controlsListener8.c();
                                        break;
                                    }
                                }
                            } else {
                                ywp0 controlsListener9 = playerControlsView.getControlsListener();
                                if (controlsListener9 != null) {
                                    controlsListener9.r();
                                    break;
                                }
                            }
                        } else {
                            ywp0 controlsListener10 = playerControlsView.getControlsListener();
                            if (controlsListener10 != null) {
                                controlsListener10.t();
                                break;
                            }
                        }
                    } else {
                        ywp0 controlsListener11 = playerControlsView.getControlsListener();
                        if (controlsListener11 != null) {
                            controlsListener11.s();
                            break;
                        }
                    }
                } else {
                    ywp0 controlsListener12 = playerControlsView.getControlsListener();
                    if (controlsListener12 != null) {
                        controlsListener12.w();
                        break;
                    }
                }
                break;
            case 7:
                ((zvk0) obj).b.a(bxk0.b);
                break;
            case 8:
                b5p0 b5p0Var = (b5p0) obj;
                b5p0Var.h6();
                Rect rect = new Rect();
                View view2 = b5p0Var.p;
                view2.getGlobalVisibleRect(rect);
                float f2 = 2;
                rect.inset(-iah0.a(f2), -iah0.a(f2));
                b5p0Var.l = Tooltip.l(new Tooltip(b5p0Var.itemView.getContext(), "Title", "Description", Tooltip.WindowStyle.FULLSCREEN, null, null, null, 0, 0, null, 1.0f, null, 0, true, null, 0, false, null, null, new c.d(iah0.a(4)), null, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, 0, null, null, null, null, -533520, 15), view2.getContext(), new RectF(rect), false, false, false, false, 252);
                break;
            case 9:
                ghp0 ghp0Var = (ghp0) obj;
                uv20 uv20Var = ghp0Var.a;
                MusicTrack musicTrack = ghp0Var.g;
                if (musicTrack == null) {
                    musicTrack = null;
                }
                uv20Var.invoke(musicTrack);
                break;
            case 10:
                int i4 = VkCellRight.z;
                gzs<s3q0> gzsVar = ((VkCell.Right.ExtraAction.a) obj).b;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
            default:
                kkz0.a aVar = ((ydz0) obj).t;
                if (aVar != null) {
                    ((jgz0.b) aVar).c();
                    break;
                }
                break;
        }
    }
}
