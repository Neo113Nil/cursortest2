package xsna;

import android.util.LruCache;
import com.vk.im.engine.models.dialogs.DialogTheme;

/* compiled from: DialogThemeCache.kt */
/* loaded from: classes2.dex */
public final class mkm {
    public static final LruCache<com.vk.im.engine.models.dialogs.c, DialogTheme> a = new LruCache<>(10);

    static {
        b25 a2 = o25.a();
        lkm lkmVar = new lkm();
        lkmVar.b = o25.a().c();
        a2.b0(lkmVar);
    }
}
