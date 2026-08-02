package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import com.vk.stories.StoryPostInfo;
import com.vkontakte.android.R;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.e3m;

/* compiled from: CameraPostDelegate.kt */
/* loaded from: classes16.dex */
public final class hk9 {
    public final v76 a;
    public final u440 b;
    public final StoryPostInfo c;
    public final lh9 d;
    public final v7c0 e = new v7c0();

    /* compiled from: CameraPostDelegate.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements izs<Bitmap, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Bitmap bitmap) {
            lh9.d((lh9) this.receiver, bitmap);
            return s3q0.a;
        }
    }

    public hk9(v76 v76Var, u440 u440Var, StoryPostInfo storyPostInfo, lh9 lh9Var) {
        this.a = v76Var;
        this.b = u440Var;
        this.c = storyPostInfo;
        this.d = lh9Var;
    }

    public final void a(p7c0 p7c0Var) {
        String contentImageUrl = p7c0Var.getContentImageUrl();
        lh9 lh9Var = this.d;
        if (contentImageUrl != null) {
            lh9Var.b(contentImageUrl, new a(1, lh9Var, lh9.class, "setBlurredBackground", "setBlurredBackground(Landroid/graphics/Bitmap;Z)V", 0));
            return;
        }
        Context requireContext = this.a.getRequireContext();
        e3m.a aVar = e3m.a;
        Bitmap createBitmap = Bitmap.createBitmap(new int[]{requireContext.getColor(R.color.vk_gray_700)}, 1, 1, Bitmap.Config.ARGB_8888);
        u440 u440Var = lh9Var.b;
        gyl0 gyl0Var = u440Var.p;
        if (gyl0Var != null) {
            gyl0Var.L5(createBitmap);
        }
        u440Var.N7(createBitmap);
        tam0 tam0Var = u440Var.B0;
        if (tam0Var != null) {
            tam0Var.t = createBitmap;
        }
    }
}
