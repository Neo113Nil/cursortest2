package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.view.TextureView;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;

/* compiled from: VideoTextureViewUtils.kt */
/* loaded from: classes17.dex */
public final class wjt0 {

    /* compiled from: VideoTextureViewUtils.kt */
    public static final class a {
        public final VideoTextureView a;

        public a(VideoTextureView videoTextureView) {
            this.a = videoTextureView;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0037 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5 A[Catch: all -> 0x00d4, TryCatch #0 {all -> 0x00d4, blocks: (B:39:0x008b, B:41:0x008f, B:43:0x0095, B:45:0x009b, B:60:0x00a5, B:63:0x00b1), top: B:38:0x008b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List a(RecyclerView.e0 e0Var) {
        List<View> q1;
        a aVar;
        Result.Failure failure;
        boolean z;
        Bitmap bitmap;
        Bitmap bitmap2;
        z8e z8eVar = e0Var instanceof z8e ? (z8e) e0Var : null;
        if (z8eVar == null || (q1 = z8eVar.q1()) == null) {
            return EmptyList.b;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : q1) {
            if (obj instanceof VideoTextureView) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            VideoTextureView videoTextureView = (VideoTextureView) it.next();
            int videoWidth = videoTextureView.getVideoWidth();
            Integer valueOf = Integer.valueOf(videoWidth);
            if (videoWidth <= 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                int videoHeight = videoTextureView.getVideoHeight();
                Integer valueOf2 = Integer.valueOf(videoHeight);
                if (videoHeight <= 0) {
                    valueOf2 = null;
                }
                if (valueOf2 != null) {
                    int intValue2 = valueOf2.intValue();
                    int width = videoTextureView.getWidth();
                    Integer valueOf3 = Integer.valueOf(width);
                    if (width <= 0) {
                        valueOf3 = null;
                    }
                    if (valueOf3 != null) {
                        int intValue3 = valueOf3.intValue();
                        int height = videoTextureView.getHeight();
                        Integer valueOf4 = Integer.valueOf(height);
                        if (height <= 0) {
                            valueOf4 = null;
                        }
                        if (valueOf4 != null) {
                            int intValue4 = valueOf4.intValue();
                            try {
                            } catch (Throwable th) {
                                failure = new Result.Failure(th);
                            }
                            if (!videoTextureView.b) {
                                View view = videoTextureView.c;
                                TextureView textureView = view instanceof TextureView ? (TextureView) view : null;
                                if (textureView != null) {
                                    bitmap2 = textureView.getBitmap(intValue, intValue2);
                                    if (bitmap2 != 0) {
                                        failure = null;
                                    } else {
                                        float f = intValue;
                                        float f2 = intValue2;
                                        float f3 = intValue3 / intValue4;
                                        if (f / f2 == f3) {
                                            failure = bitmap2;
                                        } else {
                                            int i = (int) (f / f3);
                                            Bitmap createBitmap = Bitmap.createBitmap(videoTextureView.getResources().getDisplayMetrics(), intValue, i, Bitmap.Config.ARGB_8888);
                                            new Canvas(createBitmap).drawBitmap(bitmap2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (i - f2) / 2.0f, (Paint) null);
                                            bitmap2.recycle();
                                            failure = createBitmap;
                                        }
                                    }
                                    z = failure instanceof Result.Failure;
                                    Object obj2 = failure;
                                    if (z) {
                                        obj2 = null;
                                    }
                                    bitmap = (Bitmap) obj2;
                                    if (bitmap != null) {
                                        videoTextureView.setBackground(new BitmapDrawable(videoTextureView.getResources(), bitmap));
                                        aVar = new a(videoTextureView);
                                        if (aVar == null) {
                                            arrayList2.add(aVar);
                                        }
                                    }
                                }
                            }
                            bitmap2 = 0;
                            if (bitmap2 != 0) {
                            }
                            z = failure instanceof Result.Failure;
                            Object obj22 = failure;
                            if (z) {
                            }
                            bitmap = (Bitmap) obj22;
                            if (bitmap != null) {
                            }
                        }
                    }
                }
            }
            aVar = null;
            if (aVar == null) {
            }
        }
        return arrayList2;
    }
}
