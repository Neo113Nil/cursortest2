package xsna;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.view.components.R$styleable;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.button.dropdown.VkDropdownButton;
import com.vk.voip.ui.history.past.presentation.base.fragment.VoipPastCallsFragment;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.op90;

/* compiled from: VoipPastCallHeaderDelegate.kt */
/* loaded from: classes7.dex */
public final class huw0 extends p1u0<op90.b> {
    public final VoipPastCallsFragment.c a;

    /* compiled from: VoipPastCallHeaderDelegate.kt */
    public static final class a extends vfz<op90.b> {
        public final k59<j59> l;
        public final VkDropdownButton m;

        public a(FrameLayout frameLayout, VoipPastCallsFragment.c cVar) {
            super(frameLayout);
            this.l = cVar;
            this.m = (VkDropdownButton) frameLayout.findViewById(R.id.voip_past_calls_dropdown);
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(op90.b bVar) {
            String string;
            op90.b bVar2 = bVar;
            op90.b.a.AbstractC3462a abstractC3462a = bVar2.b.b;
            if (abstractC3462a instanceof op90.b.a.AbstractC3462a.d) {
                string = this.itemView.getContext().getString(R.string.voip_history_past_calls_header_filter_personal);
            } else if (abstractC3462a instanceof op90.b.a.AbstractC3462a.c) {
                string = this.itemView.getContext().getString(R.string.voip_history_past_calls_header_filter_missed);
            } else if (abstractC3462a instanceof op90.b.a.AbstractC3462a.C3464b) {
                string = ((op90.b.a.AbstractC3462a.C3464b) abstractC3462a).b;
            } else {
                if (!(abstractC3462a instanceof op90.b.a.AbstractC3462a.C3463a)) {
                    throw new NoWhenBranchMatchedException();
                }
                string = this.itemView.getContext().getString(R.string.voip_history_past_calls_header_filter_all);
            }
            VkDropdownButton vkDropdownButton = this.m;
            vkDropdownButton.setText(string);
            bwt0.i0(vkDropdownButton, new js00(15, bVar2, this));
        }
    }

    public huw0(VoipPastCallsFragment.c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.p1u0
    public final vfz<? extends op90.b> b(ViewGroup viewGroup) {
        VkButton.Appearance appearance;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        Context context = frameLayout.getContext();
        VkDropdownButton vkDropdownButton = new VkDropdownButton(context, null, 0);
        vkDropdownButton.a0 = VkDropdownButton.Appearance.Accent;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.n, 0, 0);
        vkDropdownButton.setSize(VkButton.Size.Small);
        vkDropdownButton.setMode(VkButton.Mode.Link);
        int i = VkDropdownButton.a.$EnumSwitchMapping$0[((VkDropdownButton.Appearance) VkDropdownButton.Appearance.h().get(obtainStyledAttributes.getInteger(0, 0))).ordinal()];
        if (i == 1) {
            appearance = VkButton.Appearance.Accent;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            appearance = VkButton.Appearance.Neutral;
        }
        vkDropdownButton.setAppearance(appearance);
        vkDropdownButton.d5(Integer.valueOf(R.drawable.vk_icon_dropdown_outline_16));
        vkDropdownButton.setId(R.id.voip_past_calls_dropdown);
        vkDropdownButton.setLayoutParams(cpy.a(0, 0, e3m.a(R.dimen.vk_ui_base_padding_horizontal, vkDropdownButton.getContext()), 0, 0, e3m.a(R.dimen.vk_ui_base_padding_horizontal, vkDropdownButton.getContext()), 27));
        frameLayout.addView(vkDropdownButton);
        return new a(frameLayout, this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof op90.b;
    }
}
