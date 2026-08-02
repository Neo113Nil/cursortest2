package xsna;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import com.vk.core.apps.BuildInfo;
import com.vk.feed.design.view.posting.preview.image.crop.model.PreviewCropType;
import com.vkontakte.android.R;
import com.vkontakte.android.VKApplication;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CropImageDelegate.kt */
/* loaded from: classes18.dex */
public final class jhk {
    public final w3d0 a;
    public e4d0 b;
    public Bitmap e;
    public int c = 1;
    public int d = 1;
    public PreviewCropType f = PreviewCropType.SCALE;
    public final RectF g = new RectF();
    public final float[] h = new float[9];

    /* compiled from: CropImageDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PreviewCropType.values().length];
            try {
                iArr[PreviewCropType.FIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PreviewCropType.SCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public jhk(w3d0 w3d0Var) {
        this.a = w3d0Var;
    }

    public final RectF a(Matrix matrix, int i, int i2) {
        float[] fArr = this.h;
        matrix.getValues(fArr);
        float f = fArr[2];
        float f2 = fArr[5];
        return new RectF(f, f2, (i * fArr[0]) + f, (i2 * fArr[4]) + f2);
    }

    public final void b(e4d0 e4d0Var, int i, int i2) {
        w3d0 w3d0Var = this.a;
        float[] fArr = this.h;
        RectF rectF = this.g;
        if (this.e == null) {
            return;
        }
        float width = r3.getWidth() / i;
        float height = r3.getHeight() / i2;
        float f = e4d0Var.c * width;
        float f2 = e4d0Var.d * height;
        Matrix matrix = new Matrix();
        new Matrix().getValues(fArr);
        RectF rectF2 = new RectF(f, f2, (width * e4d0Var.e * 1.0f) + f, (height * e4d0Var.f * 1.0f) + f2);
        float f3 = 2;
        PointF pointF = new PointF(rectF.width() / f3, rectF.height() / f3);
        PointF pointF2 = new PointF((rectF2.width() / f3) + rectF2.left, (rectF2.height() / f3) + rectF2.top);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        matrix.getValues(fArr);
        float f4 = 1.0f / fArr[0];
        Matrix matrix2 = new Matrix();
        matrix2.postTranslate(pointF.x - pointF2.x, pointF.y - pointF2.y);
        matrix2.postScale(f4, f4, pointF.x, pointF.y);
        w3d0Var.setImageMatrix(matrix2);
        BuildInfo.Client client = BuildInfo.a;
        VKApplication vKApplication = com.vk.core.apps.a.a;
        if (BuildInfo.h()) {
            w3d0Var.setTag(R.id.posting_ui_test_photo_crop_tag, new x5a0(this.f, e4d0Var, i, i2));
        }
    }

    public final void c() {
        Matrix matrix;
        Bitmap bitmap = this.e;
        if (bitmap == null) {
            return;
        }
        e4d0 e4d0Var = this.b;
        if (e4d0Var != null) {
            b(e4d0Var, this.c, this.d);
            return;
        }
        w3d0 w3d0Var = this.a;
        RectF rectF = this.g;
        int i = a.$EnumSwitchMapping$0[this.f.ordinal()];
        if (i == 1) {
            Matrix matrix2 = new Matrix();
            matrix2.setRectToRect(a(matrix2, bitmap.getWidth(), bitmap.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
            matrix = matrix2;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Matrix matrix3 = new Matrix();
            RectF a2 = a(new Matrix(), bitmap.getWidth(), bitmap.getHeight());
            float f = 2;
            PointF pointF = new PointF(rectF.width() / f, rectF.height() / f);
            PointF pointF2 = new PointF((a2.width() / f) + a2.left, (a2.height() / f) + a2.top);
            matrix3.setRectToRect(rectF, a2, Matrix.ScaleToFit.CENTER);
            float[] fArr = this.h;
            matrix3.getValues(fArr);
            float f2 = 1.0f / fArr[0];
            matrix = new Matrix();
            matrix.postTranslate(pointF.x - pointF2.x, pointF.y - pointF2.y);
            matrix.postScale(f2, f2, pointF.x, pointF.y);
        }
        w3d0Var.setImageMatrix(matrix);
        qcy<Object>[] qcyVarArr = bwt0.a;
        BuildInfo.Client client = BuildInfo.a;
        VKApplication vKApplication = com.vk.core.apps.a.a;
        if (BuildInfo.h()) {
            w3d0Var.setTag(R.id.posting_ui_test_photo_crop_tag, new x5a0(this.f, this.b, this.c, this.d));
        }
    }
}
