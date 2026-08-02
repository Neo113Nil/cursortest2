package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.util.SizeF;
import com.vk.core.view.components.avatar.badge.VkAvatarBadge;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ReactionBadge.kt */
/* loaded from: classes6.dex */
public final class c0f0 extends com.vk.core.view.components.avatar.badge.d {
    public final Drawable c;
    public final Object d;

    public c0f0(Drawable drawable, VkAvatarBadge.Alignment alignment) {
        super(alignment, null);
        this.c = drawable;
        this.d = msy.a(LazyThreadSafetyMode.NONE, new e20(24));
    }

    @Override // com.vk.core.view.components.avatar.badge.d
    public final void c(Context context, aar0 aar0Var, Canvas canvas) {
        float f = kqu0.u;
        float f2 = 2;
        int i = (int) (((-g().getWidth()) / f2) + f);
        int i2 = (int) (((-g().getHeight()) / f2) + f);
        int width = (int) ((g().getWidth() / f2) + f);
        int height = (int) ((g().getHeight() / f2) + f);
        Drawable drawable = this.c;
        drawable.setBounds(i, i2, width, height);
        drawable.draw(canvas);
    }

    @Override // com.vk.core.view.components.avatar.badge.d
    public final Path f(Context context, aar0 aar0Var) {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final SizeF g() {
        return (SizeF) this.d.getValue();
    }
}
