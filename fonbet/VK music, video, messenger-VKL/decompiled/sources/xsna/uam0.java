package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vkontakte.android.R;
import xsna.dw20;
import xsna.tlo0;

/* compiled from: StoryReactionBottomSheet.kt */
/* loaded from: classes6.dex */
public final class uam0 extends dw20 {

    /* compiled from: StoryReactionBottomSheet.kt */
    public static final class a extends dw20.b {
        public ViewGroup e;
        public RecyclerView f;
        public ViewGroup g;
        public t8i0 h;
        public VkButton i;
        public b6f0 j;
        public xsw k;
        public fyd0 l;

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            View inflate = LayoutInflater.from(this.c).inflate(R.layout.highlights_bottom_sheet, (ViewGroup) null, false);
            dhr0.a.getClass();
            u0(dhr0.u().c);
            ViewGroup viewGroup = (ViewGroup) inflate.findViewById(R.id.container);
            this.e = viewGroup;
            if (viewGroup != null) {
                viewGroup.setBackgroundResource(R.drawable.bg_bottom_sheet_redesign);
            }
            ViewGroup viewGroup2 = this.e;
            if (viewGroup2 != null) {
                viewGroup2.setBackgroundTintList(null);
            }
            VkTopBar vkTopBar = (VkTopBar) inflate.findViewById(R.id.toolbar);
            vkTopBar.setBefore(new VkTopBar.c.d(tq.h(tlo0.Companion, R.string.accessibility_cancel), new in60(this, 22), null, com.vk.core.compose.component.semantics.b.a(null, new f6w(24), 3), 4));
            vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(new tlo0.f(R.string.highlight_add_story_into_highlight), null, null, null, com.vk.core.compose.component.semantics.b.a(null, new fo20(23), 3), 14), null, null, null, 14));
            vkTopBar.setShowBottomDivider(true);
            this.g = (ViewGroup) inflate.findViewById(R.id.empty_highlights_layout);
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.highlightsRecyclerView);
            recyclerView.setAdapter(this.h);
            this.f = recyclerView;
            VkButton vkButton = (VkButton) inflate.findViewById(R.id.saveButton);
            bwt0.i0(vkButton, new alj0(this, 7));
            vkButton.setEnabled(false);
            this.i = vkButton;
            bwt0.i0((VkText) inflate.findViewById(R.id.create_highlight_text_view), new m2l0(this, 3));
            z(inflate);
            N0();
            return new uam0();
        }
    }
}
