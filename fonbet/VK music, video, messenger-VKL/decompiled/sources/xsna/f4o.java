package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.provider.MediaStore;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.offline.VideoDownloadServiceV2;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class f4o implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ f4o(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        Bitmap createBitmap;
        int i = this.b;
        int i2 = this.c;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                ((atv0) obj5).e((Pair) obj4, (zzs) obj3, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                break;
            case 1:
                k9o k9oVar = (k9o) obj5;
                Context context = k9oVar.a;
                o7o o7oVar = (o7o) obj4;
                VideoFile videoFile = (VideoFile) obj3;
                Uri uri = (Uri) obj;
                if (((Throwable) obj2) == null) {
                    Bitmap bitmap = MediaStore.Images.Media.getBitmap(context.getContentResolver(), uri);
                    op4 op4Var = k9oVar.b;
                    ti70 ti70Var = k9oVar.e;
                    float E0 = videoFile.E0();
                    ti70Var.getClass();
                    if (bitmap == null || E0 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        createBitmap = null;
                    } else {
                        int a = gbg0.a(context.getResources(), 75.0f);
                        float f = a;
                        int i3 = (int) (f / E0);
                        float c = cn70.c(4);
                        createBitmap = Bitmap.createBitmap(a, i3, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        Paint paint = new Paint(1);
                        canvas.drawRoundRect(new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, i3), c, c, paint);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                        canvas.drawBitmap(bitmap, (Rect) null, new Rect(0, 0, a, i3), paint);
                    }
                    if (createBitmap != null) {
                        bitmap = createBitmap;
                    }
                    ((LinkedHashMap) op4Var.b).put(Integer.valueOf(i2), bitmap);
                    VideoDownloadServiceV2 videoDownloadServiceV2 = VideoDownloadServiceV2.this;
                    int i4 = VideoDownloadServiceV2.p;
                    List singletonList = Collections.singletonList(o7oVar);
                    androidx.media3.exoplayer.offline.c cVar = videoDownloadServiceV2.l;
                    videoDownloadServiceV2.i((cVar != null ? cVar : null).m, singletonList);
                    break;
                } else {
                    break;
                }
                break;
            default:
                ((Integer) obj2).getClass();
                jbt.a((kbt) obj5, (gzs) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ f4o(k9o k9oVar, o7o o7oVar, int i, VideoFile videoFile) {
        this.b = 1;
        this.d = k9oVar;
        this.e = o7oVar;
        this.c = i;
        this.f = videoFile;
    }
}
