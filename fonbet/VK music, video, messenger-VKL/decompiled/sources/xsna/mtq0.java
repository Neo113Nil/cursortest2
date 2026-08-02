package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.button.group.VkGroupItem;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;
import com.vk.toggle.features.ComFeatures;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;

/* compiled from: UserProfilePostingViewHolder.kt */
/* loaded from: classes5.dex */
public final class mtq0 extends aq6<UserProfileAdapterItem.m> {
    public final VkButton A;
    public final slq0 n;
    public final View o;
    public final VkButton p;
    public final VkButton q;
    public final View r;
    public final VkGroupItem s;
    public final VkGroupItem t;
    public final Object u;
    public final Object v;
    public final boolean w;
    public final Object x;
    public final LinearLayout y;
    public final VkButton z;

    public mtq0(View view, hpq0 hpq0Var) {
        super(view);
        this.n = hpq0Var;
        View findViewById = this.itemView.findViewById(R.id.create_post_root_layout);
        this.o = findViewById;
        VkButton vkButton = (VkButton) this.itemView.findViewById(R.id.create_post_button);
        this.p = vkButton;
        VkButton vkButton2 = (VkButton) this.itemView.findViewById(R.id.create_post_gallery_button);
        this.q = vkButton2;
        this.r = this.itemView.findViewById(R.id.counters_container);
        VkGroupItem vkGroupItem = (VkGroupItem) this.itemView.findViewById(R.id.postponed_counter_tv);
        this.s = vkGroupItem;
        VkGroupItem vkGroupItem2 = (VkGroupItem) this.itemView.findViewById(R.id.drafts_counter_tv);
        this.t = vkGroupItem2;
        yei0 yei0Var = new yei0(this, 11);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.u = msy.a(lazyThreadSafetyMode, yei0Var);
        this.v = msy.a(lazyThreadSafetyMode, new mwm0(this, 5));
        ComFeatures comFeatures = ComFeatures.COM_PROFILE_POSTING_REDESIGN;
        comFeatures.getClass();
        boolean a = com.vk.toggle.b.A.a(comFeatures);
        this.w = a;
        this.x = msy.a(lazyThreadSafetyMode, new hp30(this, 25));
        this.y = (LinearLayout) this.itemView.findViewById(R.id.redesign_counters_container);
        VkButton vkButton3 = (VkButton) this.itemView.findViewById(R.id.postponed_button);
        this.z = vkButton3;
        VkButton vkButton4 = (VkButton) this.itemView.findViewById(R.id.drafts_button);
        this.A = vkButton4;
        bwt0.i0(vkButton2, new fuc0(this, 19));
        if (!a) {
            UserProfileAction.v.a aVar = UserProfileAction.v.a.b;
            VkCounter.CounterAppearance.Appearance appearance = VkCounter.CounterAppearance.Appearance.Neutral;
            vkGroupItem.setCounterAppearance(appearance);
            VkCounter.Mode mode = VkCounter.Mode.Tertiary;
            vkGroupItem.setCounterMode(mode);
            bwt0.i0(vkGroupItem, new hmj0(4, this, aVar));
            UserProfileAction.z.a aVar2 = UserProfileAction.z.a.b;
            vkGroupItem2.setCounterAppearance(appearance);
            vkGroupItem2.setCounterMode(mode);
            bwt0.i0(vkGroupItem2, new hmj0(4, this, aVar2));
            return;
        }
        UserProfileAction.v.a aVar3 = UserProfileAction.v.a.b;
        VkCounter.Size size = VkCounter.Size.Small;
        vkButton3.setCounterSize(size);
        VkCounter.Mode mode2 = VkCounter.Mode.Tertiary;
        VkCounter.CounterAppearance.Appearance appearance2 = VkCounter.CounterAppearance.Appearance.Neutral;
        vkButton3.setCounterAttributesOverride(new exj(mode2, appearance2));
        bwt0.i0(vkButton3, new fo6(28, this, aVar3));
        UserProfileAction.z.a aVar4 = UserProfileAction.z.a.b;
        vkButton4.setCounterSize(size);
        vkButton4.setCounterAttributesOverride(new exj(mode2, appearance2));
        bwt0.i0(vkButton4, new fo6(28, this, aVar4));
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        ConstraintLayout.b bVar = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
        if (bVar != null && bVar.k != R.id.redesign_counters_container) {
            bVar.k = R.id.redesign_counters_container;
            findViewById.setLayoutParams(bVar);
        }
        awt0.x(vkButton, 0, e3m.a(R.dimen.vk_ui_spacing_size_xl, this.itemView.getContext()), 0, 0, 13);
    }

    public static void q6(VkButton vkButton, String str, int i) {
        bwt0.p0(vkButton, i > 0);
        vkButton.setContentDescription(str + i);
        vkButton.setCount(Integer.valueOf(i));
        vkButton.setText(str);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.vif0
    public final void i6(Object obj) {
        UserProfileAdapterItem.m mVar = (UserProfileAdapterItem.m) obj;
        int i = mVar.e;
        int i2 = mVar.d;
        final boolean z = mVar.c;
        izs izsVar = new izs() { // from class: xsna.ltq0
            @Override // xsna.izs
            public final Object invoke(Object obj2) {
                slq0 slq0Var = this.n;
                View view = (View) obj2;
                if (z) {
                    slq0Var.a(new UserProfileAction.s.c.a.j(new kxa0(view, 10)));
                } else {
                    slq0Var.a(UserProfileAction.u.a.b.b);
                }
                return s3q0.a;
            }
        };
        VkButton vkButton = this.p;
        bwt0.i0(vkButton, izsVar);
        dhr0.h0(mVar.b.h(), this.itemView);
        bwt0.p0(this.q, !z);
        boolean z2 = this.w;
        Pair pair = (z && z2) ? new Pair(Integer.valueOf(R.drawable.vk_icon_add_20), Integer.valueOf(R.string.user_profile_create)) : (!z || z2) ? z ? new Pair(Integer.valueOf(R.drawable.vk_icon_write_outline_24), Integer.valueOf(R.string.user_profile_what_new)) : new Pair(Integer.valueOf(R.drawable.vk_icon_pen_outline_24), Integer.valueOf(R.string.user_profile_write_anything)) : new Pair(Integer.valueOf(R.drawable.vk_icon_add_circle_outline_24), Integer.valueOf(R.string.user_profile_publish));
        int intValue = ((Number) pair.d()).intValue();
        int intValue2 = ((Number) pair.g()).intValue();
        vkButton.setMode(z ? VkButton.Mode.Primary : VkButton.Mode.Secondary);
        vkButton.setText(this.itemView.getContext().getString(intValue2));
        boolean z3 = true;
        vkButton.a5(true, Integer.valueOf(intValue));
        if (intValue == R.drawable.vk_icon_add_20 && z2) {
            vkButton.setIconSize(Integer.valueOf(hbh0.b(20, this.itemView.getContext())));
        } else {
            vkButton.setIconSize(Integer.valueOf(hbh0.b(24, this.itemView.getContext())));
        }
        int i3 = 0;
        if (z2) {
            LinearLayout linearLayout = this.y;
            if (i2 == 0 && i == 0) {
                bwt0.p0(linearLayout, false);
                return;
            }
            if (i != 0 && i2 != 0) {
                i3 = ((Number) this.x.getValue()).intValue();
            }
            int i4 = i3;
            bwt0.f0(this.A, i4, 0, 0, 0, 14);
            bwt0.f0(this.z, 0, 0, i4, 0, 11);
            bwt0.p0(linearLayout, true);
            linearLayout.post(new i6k(5, this, mVar));
            return;
        }
        boolean z4 = i2 > 0;
        View view = this.o;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ConstraintLayout.b bVar = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
        if (bVar != null && bVar.k != R.id.counters_container) {
            bVar.k = R.id.counters_container;
            view.setLayoutParams(bVar);
        }
        boolean z5 = i > 0;
        if (!z4 && !z5) {
            z3 = false;
        }
        bwt0.p0(this.r, z3);
        VkGroupItem vkGroupItem = this.s;
        bwt0.p0(vkGroupItem, z4);
        if (z4) {
            String str = (String) this.u.getValue();
            vkGroupItem.setText(str);
            vkGroupItem.setCount(Integer.valueOf(i2));
            vkGroupItem.setContentDescription(str + i2);
        }
        VkGroupItem vkGroupItem2 = this.t;
        bwt0.p0(vkGroupItem2, z5);
        if (z5) {
            String str2 = (String) this.v.getValue();
            vkGroupItem2.setText(str2);
            vkGroupItem2.setCount(Integer.valueOf(i));
            vkGroupItem2.setContentDescription(str2 + i);
        }
    }
}
