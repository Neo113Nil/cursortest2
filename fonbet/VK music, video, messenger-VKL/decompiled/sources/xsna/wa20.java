package xsna;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.vk.ecomm.design.view.message_snippet.MessageProductSnippet;
import com.vkontakte.android.R;

/* compiled from: MessageProductSnippet.kt */
/* loaded from: classes18.dex */
public final class wa20 extends ViewOutlineProvider {
    public final /* synthetic */ MessageProductSnippet a;

    public wa20(MessageProductSnippet messageProductSnippet) {
        this.a = messageProductSnippet;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.a.getContext().getResources().getDimension(R.dimen.vk_ui_border_radius_paper));
    }
}
