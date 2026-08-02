package xsna;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.users.dto.UsersOnlineInfoDto;
import com.vk.core.ui.swipes.ButtonsSwipeView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.im.ui.views.online.OnlineMode;
import com.vk.voip.ui.history.past.presentation.base.fragment.VoipPastCallsFragment;
import com.vkontakte.android.R;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import xsna.a59;
import xsna.k1u0;
import xsna.op90;
import xsna.tlo0;

/* compiled from: VoipPastCallViewHolder.kt */
/* loaded from: classes7.dex */
public final class kuw0 extends mj8 implements phh0 {
    public final k59<j59> m;
    public final ButtonsSwipeView.a n;
    public final i59 o;
    public final VkCell p;
    public final VkButton q;
    public final ButtonsSwipeView r;

    public kuw0(ViewGroup viewGroup, VoipPastCallsFragment.c cVar, os8 os8Var) {
        super(viewGroup, R.layout.voip_history_item_past_call_swipe_container, 1);
        this.m = cVar;
        this.n = os8Var;
        this.o = new i59(this.itemView.getContext(), R.string.voip_history_past_call_time_today_format, R.string.voip_history_past_call_time_yesterday_format, R.string.voip_history_past_call_time_same_year_format, R.string.voip_history_past_call_time_another_year_format);
        VkCell vkCell = new VkCell(this.itemView.getContext(), null, 6, 0);
        vkCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.p = vkCell;
        VkButton vkButton = new VkButton(this.itemView.getContext(), null, 6, 0);
        vkButton.setAppearance(VkButton.Appearance.Negative);
        vkButton.setText(R.string.voip_history_past_call_remove);
        vkButton.setContentDescription(vkButton.getContext().getString(R.string.voip_accessibility_remove));
        vkButton.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        vkButton.setCornerRadius(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        this.q = vkButton;
        View view = this.itemView;
        ButtonsSwipeView buttonsSwipeView = (ButtonsSwipeView) view;
        this.r = buttonsSwipeView;
        new com.vk.core.ui.swipes.a(view.getContext()).a(buttonsSwipeView);
        buttonsSwipeView.setContentView(vkCell);
        buttonsSwipeView.setRightViews(Collections.singletonList(vkButton));
        vkCell.setLeftMainAvatarController(new vr5());
    }

    @Override // xsna.phh0
    public final View M4() {
        return this.itemView;
    }

    @Override // xsna.mj8
    /* renamed from: j6, reason: merged with bridge method [inline-methods] */
    public final void i6(op90.a aVar) {
        int f;
        String string;
        Integer valueOf;
        VkCell.Left.a aVar2 = VkCell.Left.Companion;
        kr5 a = aVar.a();
        OnlineMode.a aVar3 = OnlineMode.Companion;
        UsersOnlineInfoDto b = aVar.b();
        aVar3.getClass();
        VkCell.Left.b a2 = VkCell.Left.a.a(aVar2, new VkCell.Left.Main.a(new xr5(a, OnlineMode.a.b(b), null), VkCell.Left.Main.Size.Medium));
        VkCell vkCell = this.p;
        vkCell.setLeft(a2);
        VkCell.Middle.a aVar4 = VkCell.Middle.Companion;
        tlo0.a aVar5 = tlo0.Companion;
        ucp ucpVar = ucp.a;
        CharSequence i = ucp.i(aVar.e());
        if (!(aVar instanceof op90.a.b)) {
            if (!(aVar instanceof op90.a.C3461a)) {
                throw new NoWhenBranchMatchedException();
            }
            StringBuilder sb = new StringBuilder();
            sb.append((Object) i);
            sb.append(" (");
            i = vu5.b(sb, ((op90.a.C3461a) aVar).h, ')');
        }
        a59.f d = aVar.d();
        boolean z = d instanceof a59.f.c;
        int i2 = R.attr.vk_ui_text_primary;
        if (z) {
            f = e3m.f(R.attr.vk_ui_text_primary, this.itemView.getContext());
        } else if (d instanceof a59.f.b) {
            f = e3m.f(R.attr.vk_ui_text_primary, this.itemView.getContext());
        } else if (d instanceof a59.f.d) {
            Context context = this.itemView.getContext();
            if (((a59.f.d) d).a) {
                i2 = R.attr.vk_ui_text_negative;
            }
            f = e3m.f(i2, context);
        } else if (d instanceof a59.f.e) {
            f = e3m.f(R.attr.vk_ui_text_negative, this.itemView.getContext());
        } else {
            if (!(d instanceof a59.f.a)) {
                throw new NoWhenBranchMatchedException();
            }
            f = e3m.f(R.attr.vk_ui_text_primary, this.itemView.getContext());
        }
        SpannableStringBuilder c = cqm0.c(f, i);
        aVar5.getClass();
        tlo0.h hVar = new tlo0.h(c);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        VkCell.Middle.e eVar = new VkCell.Middle.e(hVar, 1, truncateAt, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50);
        a59.f d2 = aVar.d();
        boolean z2 = d2 instanceof a59.f.c;
        i59 i59Var = this.o;
        if (z2) {
            a59.f.c cVar = (a59.f.c) d2;
            boolean z3 = cVar.a;
            long j = cVar.b;
            string = z3 ? this.itemView.getContext().getString(R.string.voip_history_past_call_state_p2p_completed_incoming, i59Var.a(j)) : this.itemView.getContext().getString(R.string.voip_history_past_call_state_p2p_completed_outgoing, i59Var.a(j));
        } else if (d2 instanceof a59.f.b) {
            string = this.itemView.getContext().getString(R.string.voip_history_past_call_state_group_completed, i59Var.a(((a59.f.b) d2).b));
        } else if (d2 instanceof a59.f.d) {
            string = this.itemView.getContext().getString(R.string.voip_history_past_call_state_declined, i59Var.a(((a59.f.d) d2).b));
        } else if (d2 instanceof a59.f.e) {
            string = this.itemView.getContext().getString(R.string.voip_history_past_call_state_missed, i59Var.a(((a59.f.e) d2).a));
        } else {
            if (!(d2 instanceof a59.f.a)) {
                throw new NoWhenBranchMatchedException();
            }
            string = this.itemView.getContext().getString(R.string.voip_history_past_call_state_cancalled, i59Var.a(((a59.f.a) d2).a));
        }
        tlo0.h hVar2 = new tlo0.h(string);
        a59.f d3 = aVar.d();
        boolean z4 = d3 instanceof a59.f.c;
        int i3 = R.drawable.vk_icon_arrow_up_right_12;
        if (z4) {
            if (((a59.f.c) d3).a) {
                i3 = R.drawable.vk_icon_arrow_down_left_12;
            }
            valueOf = Integer.valueOf(i3);
        } else if (d3 instanceof a59.f.a) {
            valueOf = Integer.valueOf(R.drawable.vk_icon_arrow_up_right_12);
        } else if (d3 instanceof a59.f.b) {
            valueOf = null;
        } else if (d3 instanceof a59.f.d) {
            if (((a59.f.d) d3).a) {
                i3 = R.drawable.vk_icon_arrow_down_left_12;
            }
            valueOf = Integer.valueOf(i3);
        } else {
            if (!(d3 instanceof a59.f.e)) {
                throw new NoWhenBranchMatchedException();
            }
            valueOf = Integer.valueOf(R.drawable.vk_icon_arrow_down_left_12);
        }
        vkCell.setMiddle(VkCell.Middle.a.a(aVar4, eVar, new VkCell.Middle.d(hVar2, (gzs) null, 1, truncateAt, valueOf != null ? new VkCell.Middle.d.b.C0815b(new gko(valueOf.intValue()), new k1u0.a(new x7g(R.attr.vk_ui_icon_tertiary)), 4) : null, (VkCell.Middle.d.b.C0815b) null, 34), null, 12));
        vkCell.setRight(VkCell.Right.c.a(VkCell.Right.Companion, null, null, new VkCell.Right.ExtraAction.d(new juw0(0, this, aVar), new tlo0.f(R.string.voip_accessibility_more_options), 4), null, 27));
        bwt0.i0(this.q, new evh0(12, this, aVar));
        ButtonsSwipeView buttonsSwipeView = this.r;
        if (buttonsSwipeView.getInitialScrollOffset() - buttonsSwipeView.getScrollX() != 0) {
            if (this.itemView.isAttachedToWindow()) {
                buttonsSwipeView.b();
            } else {
                buttonsSwipeView.scrollTo(buttonsSwipeView.getInitialScrollOffset(), 0);
            }
        }
        bwt0.i0(vkCell, new o0p0(3, this, aVar));
    }

    @Override // xsna.phh0
    public final ButtonsSwipeView p3() {
        return this.r;
    }
}
