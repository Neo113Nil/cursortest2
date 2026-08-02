package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import com.vk.dto.stories.entities.StoryLocalPhotoSticker;

/* compiled from: CameraLocalPhotoStickerDelegate.kt */
/* loaded from: classes16.dex */
public final class yi9 {
    public final Context a;
    public final u440 b;
    public final StoryLocalPhotoSticker c;
    public final lh9 d;

    public yi9(Context context, u440 u440Var, StoryLocalPhotoSticker storyLocalPhotoSticker, lh9 lh9Var) {
        this.a = context;
        this.b = u440Var;
        this.c = storyLocalPhotoSticker;
        this.d = lh9Var;
    }

    public static Bitmap a(Bitmap bitmap, Context context, Float f) {
        mog0 mog0Var = new mog0(context.getResources(), bitmap);
        mog0Var.d.setAntiAlias(true);
        mog0Var.invalidateSelf();
        mog0Var.a();
        mog0Var.b(f.floatValue());
        return xjo.b(mog0Var, 0, 0, 7);
    }
}
