package xsna;

import android.view.View;
import com.vk.core.compose.component.defaults.PlaceholderMode;
import com.vk.core.compose.component.defaults.PlaceholderSize;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.placeholder.VkPlaceholder;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: CommunityProfileContentPlaceholderViewDelegate.kt */
/* loaded from: classes5.dex */
public final class mkh {
    public final View a;
    public VkPlaceholder b;
    public float c;
    public lkh d;

    public mkh(View view) {
        this.a = view;
        view.getContext();
    }

    public final void a() {
        VkPlaceholder vkPlaceholder = this.b;
        if (vkPlaceholder != null) {
            vkPlaceholder.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [xsna.tlo0] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void b(lkh lkhVar) {
        VkButton.Mode mode;
        VkButton.Size size;
        VkButton.Appearance appearance;
        VkPlaceholder.a.C0854a c0854a;
        VkPlaceholder vkPlaceholder = this.b;
        VkPlaceholder.a aVar = 0;
        r3 = null;
        VkPlaceholder.a.C0854a c0854a2 = null;
        aVar = 0;
        View view = this.a;
        if (vkPlaceholder == null) {
            this.b = new VkPlaceholder(view.getContext(), null, 6);
            view.post(new kv3(this, 5));
        }
        VkPlaceholder vkPlaceholder2 = this.b;
        if (vkPlaceholder2 != null && !epx.f(this.d, lkhVar)) {
            Integer num = lkhVar.a;
            VkPlaceholder.c bVar = num != null ? new VkPlaceholder.c.b(new gko(num.intValue()), null, null, 30) : null;
            Integer num2 = lkhVar.b;
            VkPlaceholder.b bVar2 = num2 != null ? new VkPlaceholder.b((tlo0) aVar, tq.h(tlo0.Companion, num2.intValue()), com.vk.core.compose.component.semantics.b.a(null, new lf5("ContentPlaceholderText", 3), 3), 2) : null;
            Integer num3 = lkhVar.c;
            gzs<s3q0> gzsVar = lkhVar.f;
            if (num3 != null && gzsVar != null) {
                tlo0.f h = tq.h(tlo0.Companion, num3.intValue());
                CommunityProfileContentItem.a aVar2 = lkhVar.g;
                if (aVar2 == null || (mode = aVar2.b) == null) {
                    mode = VkButton.Mode.Tertiary;
                }
                VkButton.Mode mode2 = mode;
                if (aVar2 == null || (size = aVar2.a) == null) {
                    size = VkButton.Size.Medium;
                }
                VkButton.Size size2 = size;
                if (aVar2 == null || (appearance = aVar2.c) == null) {
                    appearance = VkButton.Appearance.Accent;
                }
                VkButton.Appearance appearance2 = appearance;
                Integer num4 = lkhVar.d;
                VkPlaceholder.a.C0854a.C0855a c0855a = num4 != null ? new VkPlaceholder.a.C0854a.C0855a(new gko(num4.intValue()), new b8g(krv0.m(R.attr.vk_ui_icon_accent_themed, view.getContext()))) : null;
                String str = lkhVar.e;
                VkPlaceholder.a.C0854a c0854a3 = new VkPlaceholder.a.C0854a(h, gzsVar, c0855a, null, size2, mode2, appearance2, false, str != null ? com.vk.core.compose.component.semantics.b.a(null, new lf5(str, 3), 3) : null, 568);
                Integer num5 = lkhVar.h;
                String str2 = lkhVar.i;
                String str3 = lkhVar.j;
                gzs<s3q0> gzsVar2 = lkhVar.k;
                if (num5 == null || gzsVar2 == null) {
                    if (myc0.f(str2) && gzsVar2 != null) {
                        if (str2 == null) {
                            str2 = "";
                        }
                        c0854a = new VkPlaceholder.a.C0854a(new tlo0.h(str2), lkhVar.k, null, null, null, VkButton.Mode.Tertiary, null, false, str3 != null ? com.vk.core.compose.component.semantics.b.a(null, new lf5(str3, 3), 3) : null, 892);
                    }
                    aVar = new VkPlaceholder.a(c0854a3, c0854a2, 4);
                } else {
                    c0854a = new VkPlaceholder.a.C0854a(new tlo0.f(num5.intValue()), lkhVar.k, null, null, null, VkButton.Mode.Tertiary, null, false, str3 != null ? com.vk.core.compose.component.semantics.b.a(null, new lf5(str3, 3), 3) : null, 892);
                }
                c0854a2 = c0854a;
                aVar = new VkPlaceholder.a(c0854a3, c0854a2, 4);
            }
            vkPlaceholder2.setTop(bVar);
            vkPlaceholder2.setMiddle(bVar2);
            vkPlaceholder2.setBottom(aVar);
            this.d = lkhVar;
        }
        VkPlaceholder vkPlaceholder3 = this.b;
        if (vkPlaceholder3 != null) {
            vkPlaceholder3.setTranslationY(this.c);
        }
        VkPlaceholder vkPlaceholder4 = this.b;
        if (vkPlaceholder4 != null) {
            vkPlaceholder4.setVisibility(0);
        }
        VkPlaceholder vkPlaceholder5 = this.b;
        if (vkPlaceholder5 != null) {
            vkPlaceholder5.setSize(PlaceholderSize.Large);
        }
        VkPlaceholder vkPlaceholder6 = this.b;
        if (vkPlaceholder6 != null) {
            vkPlaceholder6.setMode(PlaceholderMode.Primary);
        }
    }
}
