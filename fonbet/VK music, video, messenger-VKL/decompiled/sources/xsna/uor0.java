package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.log.L;

/* compiled from: VerticalOrientationHelper.kt */
/* loaded from: classes2.dex */
public final class uor0 implements vy80 {
    public static final uor0 a = new uor0();
    public static final int[] b = {0, 0};
    public static final Rect c = new Rect();
    public static final Rect d = new Rect();

    public static boolean e(View view, Rect rect, View view2) {
        float y;
        Rect rect2 = d;
        view2.getGlobalVisibleRect(rect2);
        if (view instanceof VideoTextureView) {
            VideoTextureView videoTextureView = (VideoTextureView) view;
            y = videoTextureView.getY() - videoTextureView.getTranslationY();
        } else {
            y = view.getY();
        }
        return ((((view.getScaleY() * ((float) view.getHeight())) + y) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (((view.getScaleY() * ((float) view.getHeight())) + y) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) <= 0 || (y > ((float) view2.getHeight()) ? 1 : (y == ((float) view2.getHeight()) ? 0 : -1)) >= 0) || (rect.top >= rect2.bottom || rect.bottom <= rect2.top);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048 A[Catch: all -> 0x006d, TryCatch #0 {all -> 0x006d, blocks: (B:6:0x000b, B:9:0x0022, B:12:0x0029, B:14:0x0031, B:20:0x0048, B:27:0x0060, B:31:0x004f, B:34:0x0056, B:35:0x003a, B:38:0x0041), top: B:5:0x000b }] */
    @Override // xsna.vy80
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(View view) {
        boolean e;
        if (view != null && view.isAttachedToWindow()) {
            try {
                Rect rect = c;
                boolean globalVisibleRect = view.getGlobalVisibleRect(rect);
                float height = view.getHeight() * view.getScaleY();
                if (view.getHeight() != 0 && !rect.isEmpty()) {
                    Object parent = view.getParent();
                    View view2 = parent instanceof View ? (View) parent : null;
                    boolean z = false;
                    if (view2 != null && view2.getHeight() != 0) {
                        e = e(view, rect, view2);
                        if (!e) {
                            View rootView = view.getRootView();
                            if (rootView != null && rootView.getHeight() != 0) {
                                z = e(view, rect, rootView);
                            }
                            if (!z && globalVisibleRect) {
                                return Math.min(1.0f, rect.height() / height);
                            }
                        }
                    }
                    e = false;
                    if (!e) {
                    }
                }
            } catch (Throwable th) {
                L.i(th);
            }
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.vy80
    public final int b(RecyclerView recyclerView, View view) {
        if (view != null && view.isAttachedToWindow()) {
            try {
                int[] iArr = b;
                recyclerView.getLocationOnScreen(iArr);
                int i = iArr[1];
                int height = recyclerView.getHeight() + i;
                view.getLocationOnScreen(iArr);
                int i2 = iArr[1];
                return Math.abs((i2 + (((view.getHeight() + i2) - i2) / 2)) - (i + ((height - i) / 2)));
            } catch (Throwable th) {
                L.i(th);
            }
        }
        return -1;
    }

    @Override // xsna.vy80
    public final boolean c(RecyclerView recyclerView) {
        return !recyclerView.canScrollVertically(1);
    }

    @Override // xsna.vy80
    public final boolean d(RecyclerView recyclerView) {
        return !recyclerView.canScrollVertically(-1);
    }
}
