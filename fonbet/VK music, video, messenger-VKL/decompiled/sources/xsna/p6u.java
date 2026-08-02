package xsna;

import android.view.ViewTreeObserver;
import com.vk.core.view.components.text.VkText;
import java.util.List;
import kotlin.Pair;

/* compiled from: GoodPreviewItemViewHolder.kt */
/* loaded from: classes18.dex */
public final class p6u implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ VkText b;
    public final /* synthetic */ q6u c;

    public p6u(VkText vkText, q6u q6uVar) {
        this.b = vkText;
        this.c = q6uVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.b.getViewTreeObserver().removeOnPreDrawListener(this);
        q6u q6uVar = this.c;
        if (q6uVar.u.getHeight() / q6uVar.u.getLineHeight() >= 2) {
            q6uVar.u.setMaxLines(2);
        } else {
            VkText vkText = q6uVar.u;
            vkText.setMaxLines(vkText.getHeight() / q6uVar.u.getLineHeight());
        }
        o6u o6uVar = q6uVar.w;
        if (o6uVar == null) {
            o6uVar = null;
        }
        List<Pair<String, String>> list = o6uVar.b.b;
        if (list == null || list.isEmpty()) {
            q6uVar.v.setVisibility(jno0.b(q6uVar.u) ? 0 : 8);
            return true;
        }
        q6uVar.v.setVisibility(0);
        return true;
    }
}
