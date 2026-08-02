package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import com.yandex.mapkit.navigation.automotive.layer.Balloon;
import com.yandex.mapkit.navigation.automotive.layer.styling.BalloonImageProvider;
import com.yandex.mapkit.navigation.balloons.BalloonAnchor;
import com.yandex.mapkit.navigation.balloons.HorizontalPosition;
import com.yandex.mapkit.navigation.balloons.VerticalPosition;
import com.yandex.runtime.image.ImageProvider;
import java.util.List;
import java.util.UUID;
import kotlin.a;

/* loaded from: classes12.dex */
public final class da50 implements BalloonImageProvider {
    public final i3y a;
    public final ve50 b;
    public final wc50 c;
    public final xa50 d;
    public final pc50 e;
    public final xc50 f;

    public da50(ga50 ga50Var) {
        this.a = a.a(new ca50(ga50Var, 4));
        Context context = ga50Var.a;
        this.b = new ve50(ga50Var.c, context);
        this.c = new wc50(context);
        this.d = new xa50(context);
        this.e = new pc50(context);
        this.f = new xc50(context);
    }

    @Override // com.yandex.mapkit.navigation.automotive.layer.styling.BalloonImageProvider
    public final ImageProvider createImage(Balloon balloon, BalloonAnchor balloonAnchor, float f, boolean z) {
        PointF[] c;
        yo4 yo4Var = balloon.getRouteSummary() != null ? this.b : balloon.getAlternative() != null ? this.d : balloon.getManoeuvre() != null ? this.c : balloon.getLaneSign() != null ? this.e : balloon.getManoeuvreWithLaneSign() != null ? this.f : null;
        if (yo4Var == null) {
            ny61.r("Not implemented");
            return null;
        }
        xo4 a = yo4Var.a(balloon, f, z);
        float f2 = a.c;
        View a2 = a.a(balloonAnchor);
        PointF pointF = new PointF(a2.getMeasuredWidth(), a2.getMeasuredHeight());
        float f3 = a.e;
        float f4 = a.f;
        PointF pointF2 = new PointF(balloonAnchor.getHorizontal() == HorizontalPosition.LEFT ? balloonAnchor.getVertical() == VerticalPosition.CENTER ? f4 : f3 : 0.0f, balloonAnchor.getVertical() == VerticalPosition.TOP ? balloonAnchor.getHorizontal() == HorizontalPosition.CENTER ? f4 : f3 : 0.0f);
        PointF pointF3 = new PointF(pointF.x, pointF.y);
        VerticalPosition vertical = balloonAnchor.getVertical();
        VerticalPosition verticalPosition = VerticalPosition.CENTER;
        if (vertical != verticalPosition && balloonAnchor.getHorizontal() != HorizontalPosition.CENTER) {
            pointF3.x += f3;
            pointF3.y += f3;
        } else if (balloonAnchor.getVertical() != verticalPosition) {
            pointF3.y += f4;
        } else if (balloonAnchor.getHorizontal() != HorizontalPosition.CENTER) {
            pointF3.x += f4;
        }
        rgr0 rgr0Var = a.b;
        float f5 = (rgr0Var != null ? rgr0Var.b : 0.0f) * 1.0f;
        PointF pointF4 = rgr0Var != null ? rgr0Var.c : new PointF();
        RectF rectF = new RectF(0.0f, 0.0f, pointF3.x, pointF3.y);
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(pointF4.x, pointF4.y);
        float f6 = -f5;
        rectF2.inset(f6, f6);
        RectF rectF3 = new RectF(rectF);
        rectF3.union(rectF2);
        PointF pointF5 = new PointF(rectF.left - rectF3.left, rectF.top - rectF3.top);
        PointF pointF6 = new PointF(pointF5.x + pointF2.x, pointF5.y + pointF2.y);
        Bitmap createBitmap = Bitmap.createBitmap((int) (rectF3.width() * f2), (int) (rectF3.height() * f2), Bitmap.Config.ARGB_8888);
        Path path = new Path();
        PointF pointF7 = new PointF(a2.getMeasuredWidth(), a2.getMeasuredHeight());
        float f7 = pointF6.x;
        float f8 = pointF6.y;
        RectF rectF4 = new RectF(f7, f8, pointF7.x + f7, pointF7.y + f8);
        float f9 = a.a.f;
        path.addRoundRect(rectF4, f9, f9, Path.Direction.CW);
        if (balloonAnchor.getVertical() != verticalPosition || balloonAnchor.getHorizontal() != HorizontalPosition.CENTER) {
            float f10 = a.h;
            float f11 = a.g;
            Path path2 = new Path();
            float f12 = pointF.x / 2.0f;
            float f13 = pointF.y / 2.0f;
            int i = wo4.b[balloonAnchor.getVertical().ordinal()];
            if (i == 1) {
                int i2 = wo4.a[balloonAnchor.getHorizontal().ordinal()];
                if (i2 == 1) {
                    c = a.c(new PointF(f3, f3), a.b(pointF, balloonAnchor), false);
                } else if (i2 == 2) {
                    c = a.d(new PointF(f12 - f11, f10), a.b(pointF, balloonAnchor), new PointF(f12 + f11, f10), false);
                } else {
                    if (i2 != 3) {
                        w511.b();
                        return null;
                    }
                    c = a.c(new PointF(pointF.x, f3), a.b(pointF, balloonAnchor), true);
                }
            } else if (i == 2) {
                int i3 = wo4.a[balloonAnchor.getHorizontal().ordinal()];
                if (i3 == 1) {
                    c = a.d(new PointF(f10, f13 + f11), a.b(pointF, balloonAnchor), new PointF(f10, f13 - f11), false);
                } else {
                    if (i3 == 2) {
                        ny61.g("Unknown leg position");
                        return null;
                    }
                    if (i3 != 3) {
                        w511.b();
                        return null;
                    }
                    c = a.d(new PointF(pointF.x, f13 - f11), a.b(pointF, balloonAnchor), new PointF(pointF.x, f13 + f11), false);
                }
            } else {
                if (i != 3) {
                    w511.b();
                    return null;
                }
                int i4 = wo4.a[balloonAnchor.getHorizontal().ordinal()];
                if (i4 == 1) {
                    c = a.c(new PointF(f3, pointF.y), a.b(pointF, balloonAnchor), true);
                } else if (i4 == 2) {
                    c = a.d(new PointF(f12 + f11, pointF.y), a.b(pointF, balloonAnchor), new PointF(f12 - f11, pointF.y), false);
                } else {
                    if (i4 != 3) {
                        w511.b();
                        return null;
                    }
                    c = a.c(new PointF(pointF.x, pointF.y), a.b(pointF, balloonAnchor), false);
                }
            }
            path2.setFillType(Path.FillType.EVEN_ODD);
            for (PointF pointF8 : c) {
                pointF8.offset(pointF5.x, pointF5.y);
            }
            PointF pointF9 = c[0];
            path2.moveTo(pointF9.x, pointF9.y);
            PointF pointF10 = c[1];
            float f14 = pointF10.x;
            float f15 = pointF10.y;
            PointF pointF11 = c[2];
            float f16 = pointF11.x;
            float f17 = pointF11.y;
            PointF pointF12 = c[3];
            path2.cubicTo(f14, f15, f16, f17, pointF12.x, pointF12.y);
            PointF pointF13 = c[4];
            float f18 = pointF13.x;
            float f19 = pointF13.y;
            PointF pointF14 = c[5];
            float f20 = pointF14.x;
            float f21 = pointF14.y;
            PointF pointF15 = c[6];
            path2.cubicTo(f18, f19, f20, f21, pointF15.x, pointF15.y);
            PointF pointF16 = c[7];
            float f22 = pointF16.x;
            float f23 = pointF16.y;
            PointF pointF17 = c[8];
            float f24 = pointF17.x;
            float f25 = pointF17.y;
            PointF pointF18 = c[9];
            path2.cubicTo(f22, f23, f24, f25, pointF18.x, pointF18.y);
            path2.close();
            path.addPath(path2);
        }
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(f2, f2);
        canvas.drawPath(path, a.i);
        canvas.translate(pointF6.x, pointF6.y);
        a2.draw(canvas);
        canvas.translate(-pointF6.x, -pointF6.y);
        return ImageProvider.fromBitmap(createBitmap, false, "bitmap:" + UUID.randomUUID());
    }

    @Override // com.yandex.mapkit.navigation.automotive.layer.styling.BalloonImageProvider
    public final List geometriesForBalloon(Balloon balloon, float f, boolean z) {
        return ((BalloonImageProvider) this.a.getValue()).geometriesForBalloon(balloon, f, z);
    }
}
