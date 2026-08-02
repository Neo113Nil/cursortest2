package xsna;

import android.animation.Animator;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.superapp.api.dto.story.WebClickablePoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ISticker.kt */
/* loaded from: classes5.dex */
public interface nov {

    /* compiled from: ISticker.kt */
    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:34:0x012b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static void a(nov novVar, Canvas canvas, boolean z) {
            Canvas canvas2;
            waq waqVar;
            waq waqVar2;
            if (!z && (waqVar2 = jcl.b) != null) {
                PointF[] fillPoints = novVar.getCommons().getFillPoints();
                bpn0 bpn0Var = waqVar2.b;
                Paint paint = waqVar2.d;
                bpn0 bpn0Var2 = waqVar2.a;
                if (((rkc) bpn0Var2.getValue()).a(novVar) && BuildInfo.h()) {
                    nr4.a().getClass();
                    o2l.a.getClass();
                    if (o2l.b("__dbg_stories_create_sticker_border", false)) {
                        paint.setColor(-16711681);
                        PointF pointF = fillPoints[0];
                        float f = pointF.x;
                        float f2 = pointF.y;
                        PointF pointF2 = fillPoints[1];
                        float f3 = pointF2.x;
                        float f4 = pointF2.y;
                        canvas2 = canvas;
                        canvas2.drawLine(f, f2, f3, f4, paint);
                        PointF pointF3 = fillPoints[1];
                        float f5 = pointF3.x;
                        float f6 = pointF3.y;
                        PointF pointF4 = fillPoints[2];
                        canvas2.drawLine(f5, f6, pointF4.x, pointF4.y, paint);
                        PointF pointF5 = fillPoints[2];
                        float f7 = pointF5.x;
                        float f8 = pointF5.y;
                        PointF pointF6 = fillPoints[3];
                        canvas2.drawLine(f7, f8, pointF6.x, pointF6.y, paint);
                        PointF pointF7 = fillPoints[3];
                        float f9 = pointF7.x;
                        float f10 = pointF7.y;
                        PointF pointF8 = fillPoints[0];
                        canvas2.drawLine(f9, f10, pointF8.x, pointF8.y, paint);
                        paint.setColor(-65281);
                        List<ClickableSticker> b = ((rkc) bpn0Var2.getValue()).b(novVar);
                        if (b != null) {
                            List<ClickableSticker> list = b;
                            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((ClickableSticker) it.next()).c);
                            }
                            int size = arrayList.size();
                            for (int i = 0; i < size; i++) {
                                List list2 = (List) arrayList.get(i);
                                ((Path) bpn0Var.getValue()).reset();
                                int size2 = list2.size();
                                for (int i2 = 0; i2 < size2; i2++) {
                                    float f11 = ((WebClickablePoint) list2.get(i2)).b;
                                    float f12 = ((WebClickablePoint) list2.get(i2)).c;
                                    if (i2 == 0) {
                                        ((Path) bpn0Var.getValue()).moveTo(f11, f12);
                                    } else {
                                        ((Path) bpn0Var.getValue()).lineTo(f11, f12);
                                    }
                                }
                                ((Path) bpn0Var.getValue()).close();
                                canvas2.drawPath((Path) bpn0Var.getValue(), paint);
                            }
                        }
                        bpn0 bpn0Var3 = z5l0.a;
                        int save = canvas2.save();
                        canvas2.concat(novVar.getStickerMatrix());
                        waqVar = jcl.b;
                        if (waqVar != null) {
                            Matrix stickerMatrix = novVar.getStickerMatrix();
                            if (BuildInfo.h()) {
                                nr4.a().getClass();
                                o2l.a.getClass();
                                if (o2l.b("__dbg_stories_create_sticker_border", false)) {
                                    canvas2.drawText("scaleX: " + pov.c(stickerMatrix) + ", scaleY: " + pov.d(stickerMatrix) + ", x: " + pov.e(stickerMatrix) + ", y: " + pov.f(stickerMatrix), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, waqVar.c);
                                }
                            }
                        }
                        novVar.G0(canvas2);
                        canvas2.restoreToCount(save);
                    }
                }
            }
            canvas2 = canvas;
            bpn0 bpn0Var32 = z5l0.a;
            int save2 = canvas2.save();
            canvas2.concat(novVar.getStickerMatrix());
            waqVar = jcl.b;
            if (waqVar != null) {
            }
            novVar.G0(canvas2);
            canvas2.restoreToCount(save2);
        }

        public static void b(nov novVar, nov novVar2) {
            novVar2.setStatic(novVar.d());
            novVar2.setStickerVisible(novVar.H0());
            novVar2.setStickerMatrix(novVar.getStickerMatrix());
            novVar2.setStickerAlpha(novVar.getStickerAlpha());
            novVar2.getCommons().m(novVar.getCommons());
            novVar2.setRemovable(novVar.v0());
            novVar2.t0();
        }

        public static float c(nov novVar) {
            return novVar.getCommons().c() * novVar.getOriginalHeight();
        }

        public static float d(nov novVar) {
            return novVar.getCommons().c() * novVar.getOriginalWidth();
        }

        public static boolean e(nov novVar, float f, float f2) {
            return novVar.getCommons().j(novVar.getCommons().l(), f, f2);
        }

        public static void f(nov novVar, float f, float f2, float f3) {
            if (novVar.getCanScale()) {
                if (novVar.getCommons().c() != novVar.getMinScaleLimit() || f > 1.0f) {
                    if (novVar.getCommons().c() != novVar.getMaxScaleLimit() || 1.0f > f) {
                        float f4 = swe0.f(novVar.getCommons().c() * f, novVar.getMinScaleLimit(), novVar.getMaxScaleLimit());
                        float c = novVar.getCommons().c() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f4 / novVar.getCommons().c() : 1.0f;
                        novVar.getStickerMatrix().postScale(c, c, f2, f3);
                        novVar.getCommons().i(f4);
                        novVar.t0();
                    }
                }
            }
        }

        public static void g(float f, nov novVar) {
            novVar.getStickerMatrix().setRotate(f, novVar.getOriginalWidth() * 0.5f, novVar.getOriginalHeight() * 0.5f);
        }

        public static void h(float f, nov novVar) {
            novVar.getCommons().i(f);
            novVar.getStickerMatrix().setScale(f, f, novVar.getOriginalWidth() * 0.5f, novVar.getOriginalHeight() * 0.5f);
        }

        public static void i(nov novVar, float f, float f2) {
            if (novVar.getCanTranslateX() && novVar.getCanTranslateY()) {
                novVar.getStickerMatrix().postTranslate(f, f2);
            } else if (novVar.getCanTranslateX()) {
                novVar.getStickerMatrix().postTranslate(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            } else if (novVar.getCanTranslateY()) {
                novVar.getStickerMatrix().postTranslate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2);
            }
            novVar.t0();
        }

        public static void j(nov novVar) {
            novVar.getCommons().h(novVar.getOriginalWidth(), novVar.getOriginalHeight());
        }
    }

    boolean A0(float f, float f2);

    boolean B0();

    nov C0();

    nov E0(nov novVar);

    void F0(Canvas canvas, boolean z);

    void G0(Canvas canvas);

    boolean H0();

    void a(float f, float f2, float f3);

    nov copy();

    boolean d();

    void e(float f, float f2);

    String getAccessibilityText();

    float getBottom();

    Animator getBounceAnimator();

    boolean getCanRotate();

    boolean getCanScale();

    boolean getCanStickToSafeZoneGuideLines();

    boolean getCanTranslateX();

    boolean getCanTranslateY();

    float getCenterX();

    float getCenterY();

    oov getCommons();

    PointF[] getFillPoints();

    boolean getInDraggingMode();

    boolean getInEditMode();

    gzs<s3q0> getInvalidator();

    float getLeft();

    float getMaxScaleLimit();

    float getMinScaleLimit();

    int getMovePointersCount();

    float getOriginalHeight();

    float getOriginalStickerScale();

    float getOriginalWidth();

    float getRealHeight();

    float getRealWidth();

    float getRight();

    int getStickerAlpha();

    int getStickerLayerType();

    Matrix getStickerMatrix();

    float getStickerRotation();

    float getStickerScale();

    float getStickerTranslationX();

    float getStickerTranslationY();

    float getTop();

    void setBounceAnimator(Animator animator);

    void setInEditMode(boolean z);

    void setInvalidator(gzs<s3q0> gzsVar);

    void setRemovable(boolean z);

    void setStatic(boolean z);

    void setStickerAccessibilityListener(o1l0 o1l0Var);

    void setStickerAlpha(int i);

    void setStickerMatrix(Matrix matrix);

    void setStickerTranslationX(float f);

    void setStickerTranslationY(float f);

    void setStickerVisible(boolean z);

    void setTimestampMsValue(int i);

    void startEncoding();

    void stopEncoding();

    void t0();

    boolean v0();

    void w0(float f, float f2);

    void x0(RectF rectF, float f, float f2);

    void y0(float f, float f2, float f3, boolean z);

    boolean z0();
}
