package xsna;

import android.content.Context;
import android.view.View;
import com.vk.common.links.LaunchContext;
import com.vk.core.view.components.text.links.VkLinkedText;
import com.vkontakte.android.R;

/* compiled from: ClipsSuggestionsProviderVK.kt */
/* loaded from: classes17.dex */
public final class s5f extends qaz {
    public final /* synthetic */ u5f m;
    public final /* synthetic */ VkLinkedText n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5f(u5f u5fVar, VkLinkedText vkLinkedText) {
        super("", 0);
        this.m = u5fVar;
        this.n = vkLinkedText;
    }

    @Override // xsna.qaz, xsna.rku0
    public final void f(Context context, View view) {
        if (context != null) {
            maz.c(((qdz) this.m.c).e(), context, a0a.d.concat("/trending"), LaunchContext.A, null, null, 24);
        }
    }

    @Override // xsna.qjc, xsna.l2v0
    public final int getColor() {
        return e3m.f(R.attr.vk_ui_text_link_themed, this.n.getContext());
    }
}
