package com.yandex.messaging.internal.view.input.emojipanel;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.LruCache;
import defpackage.e1k;
import defpackage.gvg0;
import defpackage.ptn;

/* loaded from: classes15.dex */
public final class a {
    public final LruCache a;

    public a(Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        this.a = new LruCache((int) (resources.getDimension(gvg0.emoji_view_size) * 2.0f * Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels)));
    }

    public final e1k a(ptn ptnVar, String str, int i) {
        EmojiLoader$EmojiTask emojiLoader$EmojiTask = new EmojiLoader$EmojiTask(ptnVar, this.a, i, str, 0);
        emojiLoader$EmojiTask.execute(null);
        return emojiLoader$EmojiTask;
    }
}
