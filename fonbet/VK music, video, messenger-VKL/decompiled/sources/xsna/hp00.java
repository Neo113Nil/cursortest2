package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.picture.VkPicture;

/* compiled from: MarketAdsItemContentRenderDelegate.kt */
/* loaded from: classes17.dex */
public final class hp00 implements b780 {
    public final /* synthetic */ gp00 b;
    public final /* synthetic */ VkPicture c;

    public hp00(gp00 gp00Var, VkPicture vkPicture) {
        this.b = gp00Var;
        this.c = vkPicture;
    }

    @Override // xsna.b780
    public final void t(int i, int i2, String str) {
        Bitmap bitmap;
        this.b.getClass();
        VkPicture vkPicture = this.c;
        Drawable drawable = vkPicture.getDrawable();
        if (drawable == null) {
            return;
        }
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        if (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) {
            return;
        }
        Context context = vkPicture.getContext();
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        RenderScript create = RenderScript.create(context);
        Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
        Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
        create2.setRadius(swe0.f(gp00.l, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 25.0f));
        create2.setInput(createFromBitmap);
        create2.forEach(createFromBitmap2);
        createFromBitmap2.copyTo(createBitmap);
        vkPicture.setImageBitmap(createBitmap);
        create.destroy();
    }

    @Override // xsna.b780
    public final void g(String str) {
    }

    @Override // xsna.b780
    public final void onCancel(String str) {
    }

    @Override // xsna.b780
    public final void b(String str, Throwable th) {
    }
}
