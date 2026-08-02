package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: FullscreenBlur.kt */
/* loaded from: classes17.dex */
public final class jxs {
    public static final void a(Context context, Bitmap bitmap, float f) {
        RenderScript create = RenderScript.create(context);
        Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
        Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
        try {
            create2.setRadius(swe0.f(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 25.0f));
            create2.setInput(createFromBitmap);
            create2.forEach(createTyped);
            createTyped.copyTo(bitmap);
        } finally {
            create2.destroy();
            createFromBitmap.destroy();
            createTyped.destroy();
            create.destroy();
        }
    }
}
