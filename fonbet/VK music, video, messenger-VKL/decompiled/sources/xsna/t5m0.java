package xsna;

import android.content.Context;
import com.vkontakte.android.R;

/* compiled from: StoryLinkStickerInfoFactoryImpl.kt */
/* loaded from: classes6.dex */
public final class t5m0 implements s5m0 {
    public final Context a;
    public final sdz b;

    public t5m0(Context context, sdz sdzVar) {
        this.a = context;
        this.b = sdzVar;
    }

    @Override // xsna.s5m0
    public final boolean a(String str) {
        return c(str) != null;
    }

    @Override // xsna.s5m0
    public final r5m0 b(String str, String str2, com.vk.stickers.api.styles.a aVar, com.vk.stickers.api.styles.b bVar, c7l0 c7l0Var) {
        String obj = str2 != null ? drm0.p0(str2).toString() : null;
        if (obj == null || drm0.N(obj)) {
            obj = this.a.getString(R.string.story_link_default_link_name);
        }
        String c = c(str);
        if (aVar == null) {
            aVar = bVar.d(null, c7l0Var);
        }
        if (c != null) {
            return new r5m0(c, obj, aVar, aVar.d() ? R.drawable.vk_icon_chain_outline_16 : R.drawable.vk_icon_linked_16);
        }
        return null;
    }

    public final String c(String str) {
        String obj = drm0.p0(str).toString();
        String a = naz.a(obj);
        if (!drm0.N(obj) && this.b.g(a) && drm0.D(obj, ".", false)) {
            return a;
        }
        return null;
    }
}
