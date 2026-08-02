package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import com.vk.libvideo.api.ui.VideoResizer;

/* compiled from: AnimationDialogCallbackFactory.kt */
/* loaded from: classes2.dex */
public final class jo2 {

    /* compiled from: AnimationDialogCallbackFactory.kt */
    public static abstract class a {

        /* compiled from: AnimationDialogCallbackFactory.kt */
        /* renamed from: xsna.jo2$a$a, reason: collision with other inner class name */
        public static final class C3134a extends a {
            public static final C3134a a = new C3134a();

            @Override // xsna.jo2.a
            public final Rect a(int i, int i2) {
                return new Rect();
            }
        }

        /* compiled from: AnimationDialogCallbackFactory.kt */
        public static final class b extends a {
            public static final b a = new b();

            @Override // xsna.jo2.a
            public final Rect a(int i, int i2) {
                return new Rect(i, 0, i * 2, i2);
            }
        }

        public abstract Rect a(int i, int i2);
    }

    public static ko2 a(Context context, a aVar) {
        DisplayMetrics displayMetrics;
        DisplayMetrics displayMetrics2;
        Resources resources = context.getResources();
        int i = 0;
        int i2 = (resources == null || (displayMetrics2 = resources.getDisplayMetrics()) == null) ? 0 : displayMetrics2.heightPixels;
        Resources resources2 = context.getResources();
        if (resources2 != null && (displayMetrics = resources2.getDisplayMetrics()) != null) {
            i = displayMetrics.widthPixels;
        }
        return new ko2(new i70(aVar.a(i, i2), 3), VideoResizer.VideoFitType.CROP);
    }
}
