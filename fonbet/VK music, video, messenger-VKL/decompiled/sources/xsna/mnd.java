package xsna;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import com.vk.dto.stories.entities.StorySharingInfo;
import com.vk.dto.stories.model.web.StoryBoxPrepared;
import com.vk.superapp.api.dto.story.WebStoryAttachment;
import com.vk.superapp.api.dto.story.WebStoryBox;
import java.util.Iterator;
import java.util.List;
import ru.ok.gl.tf.Tensorflow;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class mnd implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ mnd(int i, Integer num) {
        this.b = i;
        this.c = num;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(9:40|(6:41|42|43|44|45|46)|(1:(1:(8:50|51|52|53|54|55|57|58))(6:63|64|54|55|57|58))|65|53|54|55|57|58) */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        List list;
        int i;
        float f;
        Bitmap bitmap;
        Iterator it;
        float size;
        float size2;
        float f2;
        float f3;
        float f4;
        float f5;
        int i2;
        int i3;
        switch (this.b) {
            case 0:
                List list2 = (List) obj;
                Integer num = this.c;
                int i4 = 1;
                int intValue = num != null ? num.intValue() : list2.size() == 1 ? iah0.a(24) : iah0.a(38);
                float f6 = list2.size() == 1 ? 1.0f : 0.55f;
                Bitmap createBitmap = Bitmap.createBitmap(intValue, intValue, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(3);
                Paint paint2 = new Paint(1);
                Paint paint3 = new Paint();
                paint3.setAntiAlias(true);
                paint3.setColor(-16777216);
                paint3.setAlpha(21);
                paint3.setStyle(Paint.Style.STROKE);
                paint3.setStrokeWidth(iah0.b(0.5f));
                Matrix matrix = new Matrix();
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                Iterator it2 = j5g.y0(list2).iterator();
                int i5 = intValue;
                int i6 = i5;
                int i7 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        e43.t();
                        throw null;
                    }
                    Bitmap bitmap2 = (Bitmap) next;
                    float f7 = intValue;
                    float f8 = (i4 - f6) * f7;
                    int i9 = i4;
                    try {
                        size = (f8 / list2.size()) * ((list2.size() - 1) - i7);
                        size2 = i7 * (f8 / list2.size());
                        f2 = f7 * f6;
                        list = list2;
                        f3 = f2 / 2;
                        i = intValue;
                        f4 = size + f3;
                        f = f6;
                        f5 = size2 + f3;
                        it = it2;
                        try {
                            bitmap = createBitmap;
                        } catch (Exception unused) {
                            bitmap = createBitmap;
                            i7 = i8;
                            list2 = list;
                            intValue = i;
                            f6 = f;
                            it2 = it;
                            createBitmap = bitmap;
                            i4 = 1;
                        }
                    } catch (Exception unused2) {
                        list = list2;
                        i = intValue;
                        f = f6;
                        bitmap = createBitmap;
                        it = it2;
                    }
                    if (list.size() > i9) {
                        if (i7 == 0) {
                            i5 = (int) Math.ceil(f4 + f3);
                            canvas.drawCircle(f4, f5, iah0.a(r1) + f3, paint2);
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                            matrix.reset();
                            matrix.postScale(f2 / bitmap2.getWidth(), f2 / bitmap2.getHeight());
                            matrix.postTranslate(size, size2);
                            bitmapShader.setLocalMatrix(matrix);
                            paint.setShader(bitmapShader);
                            canvas.drawCircle(f4, f5, f3, paint);
                            canvas.drawCircle(f4, f5, f3 - iah0.b(0.25f), paint3);
                            i7 = i8;
                            list2 = list;
                            intValue = i;
                            f6 = f;
                            it2 = it;
                            createBitmap = bitmap;
                            i4 = 1;
                        } else if (i7 == i9) {
                            i2 = i5;
                            try {
                                i6 = (int) Math.ceil(f5 + f3);
                                i5 = i2;
                                canvas.drawCircle(f4, f5, iah0.a(r1) + f3, paint2);
                                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                                BitmapShader bitmapShader2 = new BitmapShader(bitmap2, tileMode2, tileMode2);
                                matrix.reset();
                                matrix.postScale(f2 / bitmap2.getWidth(), f2 / bitmap2.getHeight());
                                matrix.postTranslate(size, size2);
                                bitmapShader2.setLocalMatrix(matrix);
                                paint.setShader(bitmapShader2);
                                canvas.drawCircle(f4, f5, f3, paint);
                                canvas.drawCircle(f4, f5, f3 - iah0.b(0.25f), paint3);
                            } catch (Exception unused3) {
                                i5 = i2;
                            }
                            i7 = i8;
                            list2 = list;
                            intValue = i;
                            f6 = f;
                            it2 = it;
                            createBitmap = bitmap;
                            i4 = 1;
                        }
                    }
                    i2 = i5;
                    i5 = i2;
                    canvas.drawCircle(f4, f5, iah0.a(r1) + f3, paint2);
                    Shader.TileMode tileMode22 = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader22 = new BitmapShader(bitmap2, tileMode22, tileMode22);
                    matrix.reset();
                    matrix.postScale(f2 / bitmap2.getWidth(), f2 / bitmap2.getHeight());
                    matrix.postTranslate(size, size2);
                    bitmapShader22.setLocalMatrix(matrix);
                    paint.setShader(bitmapShader22);
                    canvas.drawCircle(f4, f5, f3, paint);
                    canvas.drawCircle(f4, f5, f3 - iah0.b(0.25f), paint3);
                    i7 = i8;
                    list2 = list;
                    intValue = i;
                    f6 = f;
                    it2 = it;
                    createBitmap = bitmap;
                    i4 = 1;
                }
                Bitmap bitmap3 = createBitmap;
                return list2.size() > 1 ? Bitmap.createBitmap(bitmap3, 0, 0, i5, i6) : bitmap3;
            default:
                WebStoryBox webStoryBox = (WebStoryBox) obj;
                WebStoryAttachment webStoryAttachment = webStoryBox.g;
                StorySharingInfo storySharingInfo = null;
                storySharingInfo = null;
                if (webStoryAttachment != null) {
                    String str = webStoryAttachment.c;
                    switch (str.hashCode()) {
                        case 116079:
                            if (str.equals("url")) {
                                i3 = 11;
                                break;
                            }
                            i3 = -1;
                            break;
                        case 93166550:
                            if (str.equals("audio")) {
                                i3 = 5;
                                break;
                            }
                            i3 = -1;
                            break;
                        case 106642994:
                            if (str.equals("photo")) {
                                i3 = 18;
                                break;
                            }
                            i3 = -1;
                            break;
                        case 112202875:
                            if (str.equals("video")) {
                                i3 = 30;
                                break;
                            }
                            i3 = -1;
                            break;
                        default:
                            i3 = -1;
                            break;
                    }
                    int i10 = i3;
                    if (i10 >= 0) {
                        storySharingInfo = new StorySharingInfo(i10, webStoryAttachment.e, webStoryAttachment.f != null ? Long.valueOf(r5.intValue()) : null, webStoryAttachment.g, webStoryAttachment.d, sxc0.a().m(i10), webStoryAttachment.b, "", false, false, Tensorflow.FRAME_HEIGHT, null);
                    }
                }
                return new StoryBoxPrepared(webStoryBox, storySharingInfo, this.c, null, 8, null);
        }
    }
}
