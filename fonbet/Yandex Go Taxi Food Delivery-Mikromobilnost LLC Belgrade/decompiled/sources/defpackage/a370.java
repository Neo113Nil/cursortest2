package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.yandex.messaging.internal.avatar.AvatarImageView;

/* loaded from: classes15.dex */
public final class a370 {
    public final Context a;
    public Drawable b;

    public a370(Context context) {
        int i;
        this.a = context;
        AvatarImageView.Companion.getClass();
        i = AvatarImageView.DEFAULT_RES;
        this.b = context.getDrawable(i);
    }
}
