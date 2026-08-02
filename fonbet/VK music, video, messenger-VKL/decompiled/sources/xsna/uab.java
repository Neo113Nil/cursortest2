package xsna;

import android.text.SpannableString;
import android.view.View;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.text.links.VkLinkedText;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.im.design.view.wheel.ImWheelSelectorView;
import com.vkontakte.android.R;
import java.util.ArrayList;

/* compiled from: ChannelReactionQuantitySelectorView.kt */
/* loaded from: classes16.dex */
public final class uab implements gm50 {
    public final View b;
    public final iab c;
    public final jy d;
    public final VkTopBar e;
    public final VkButton f;
    public final ImWheelSelectorView g;
    public int h;

    public uab(View view, iab iabVar, jy jyVar) {
        this.b = view;
        this.c = iabVar;
        this.d = jyVar;
        VkTopBar vkTopBar = (VkTopBar) view.findViewById(R.id.top_bar);
        vkTopBar.setTransitionHeaderColor(VkTopBar.m.b.a);
        vkTopBar.setAfter(VkTopBar.a.C0875a.a(new VkTopBar.a.c.C0879c(new zg(this, 16), null), null, 6));
        this.e = vkTopBar;
        VkButton vkButton = (VkButton) view.findViewById(R.id.accept_button);
        bwt0.i0(vkButton, new com.vk.movika.sdk.base.observable.e(this, 21));
        this.f = vkButton;
        ImWheelSelectorView imWheelSelectorView = (ImWheelSelectorView) view.findViewById(R.id.wheel_selector);
        k9x k9xVar = new k9x(1, 200, 1);
        ArrayList arrayList = new ArrayList(c5g.u(k9xVar, 10));
        j9x it = k9xVar.iterator();
        while (it.d) {
            arrayList.add(String.valueOf(it.nextInt()));
        }
        imWheelSelectorView.getClass();
        imWheelSelectorView.setAdapter(new ImWheelSelectorView.a(arrayList));
        imWheelSelectorView.setOnItemSelectedListener(new ul1(this, 16));
        this.g = imWheelSelectorView;
        this.h = 1;
        VkLinkedText vkLinkedText = (VkLinkedText) this.b.findViewById(R.id.terms_of_use);
        String string = vkLinkedText.getContext().getString(R.string.vkim_channels_reaction_quantity_selector_terms_of_use);
        String string2 = vkLinkedText.getContext().getString(R.string.vkim_channels_reaction_quantity_selector_terms_of_use_link);
        int K = drm0.K(0, 6, string, string2, false);
        int length = string2.length() + K;
        int c = dhr0.t.c(R.attr.vk_ui_text_link);
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new tab(c, this), K, length, 33);
        vkLinkedText.setText(spannableString);
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.c;
    }
}
