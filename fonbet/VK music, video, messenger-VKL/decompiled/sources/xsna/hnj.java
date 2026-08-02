package xsna;

import android.content.Context;
import com.vkontakte.android.R;

/* compiled from: ContextExt.kt */
/* loaded from: classes11.dex */
public final class hnj {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [xsna.tgn0] */
    public static final Context a(Context context) {
        int i;
        try {
        } catch (Throwable unused) {
            i = R.style.VkSuperappkit_Light;
        }
        if (context.getTheme().resolveAttribute(R.attr.vk_ui_text_accent, dbq.a, true)) {
            ?? r0 = e370.x;
            (r0 != 0 ? r0 : null).getClass();
            return context;
        }
        tgn0 tgn0Var = e370.x;
        if (tgn0Var == null) {
            tgn0Var = null;
        }
        gfx0 gfx0Var = e370.b;
        i = tgn0Var.c(gfx0Var != null ? gfx0Var : null);
        return new lpj(context, i);
    }
}
