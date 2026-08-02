package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.badge.VkBadge;
import com.vk.core.view.components.counter.VkCounter;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.fpv0;

/* compiled from: VkTabItemView.kt */
/* loaded from: classes17.dex */
public final class jpv0 extends ConstraintLayout implements too0 {
    public final ImageView t;
    public ColorStateList u;

    public jpv0(Context context) {
        super(context, null, 0);
        this.u = P4();
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setId(View.generateViewId());
        this.t = imageView;
        setPaddingRelative(0, e3m.a(R.dimen.vk_ui_spacing_size_xs, context), 0, e3m.a(R.dimen.vk_ui_spacing_size2_xs, context));
        setClipChildren(false);
        setClipToPadding(false);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.selectableItemBackground, typedValue, true);
        setBackgroundResource(typedValue.resourceId);
        setClipToOutline(true);
        setOutlineProvider(new avj(hbh0.b(8, context)));
    }

    @Override // xsna.too0
    public final void Ng() {
        this.u = P4();
        ImageView imageView = this.t;
        if (imageView.getVisibility() == 0) {
            imageView.setImageTintList(this.u);
        }
    }

    public final ColorStateList P4() {
        return new ColorStateList(new int[][]{new int[]{android.R.attr.state_selected}, new int[]{-16842913}}, new int[]{gpo0.d(R.attr.vk_ui_icon_primary, this), gpo0.d(R.attr.vk_ui_icon_tertiary_alpha, this)});
    }

    public final void setItem(fpv0.a aVar) {
        View view;
        fpv0.d dVar = aVar.b;
        removeAllViews();
        int b = hbh0.b(28, getContext());
        fpv0.a.InterfaceC2887a interfaceC2887a = aVar.a;
        boolean z = interfaceC2887a instanceof fpv0.a.InterfaceC2887a.b;
        ImageView imageView = this.t;
        if (z) {
            imageView.setImageDrawable(((fpv0.a.InterfaceC2887a.b) interfaceC2887a).a);
            imageView.setImageTintList(this.u);
            imageView.setVisibility(0);
            ConstraintLayout.b bVar = new ConstraintLayout.b(b, b);
            bVar.t = 0;
            bVar.v = 0;
            bVar.i = 0;
            bVar.l = 0;
            s3q0 s3q0Var = s3q0.a;
            addView(imageView, bVar);
        } else {
            if (!(interfaceC2887a instanceof fpv0.a.InterfaceC2887a.C2888a)) {
                throw new NoWhenBranchMatchedException();
            }
            imageView.setVisibility(8);
            VkAvatar vkAvatar = new VkAvatar(getContext(), null, 6, 0);
            vkAvatar.setId(imageView.getId());
            vkAvatar.o0("https://upload.wikimedia.org/wikipedia/commons/5/58/Shiba_inu_taiki.jpg", null);
            vkAvatar.setRound(false);
            odu0 odu0Var = ((fpv0.a.InterfaceC2887a.C2888a) interfaceC2887a).a;
            if (odu0Var != null) {
                vkAvatar.W0(odu0Var, false);
            }
            ConstraintLayout.b bVar2 = new ConstraintLayout.b(b, b);
            bVar2.t = 0;
            bVar2.v = 0;
            bVar2.i = 0;
            bVar2.l = 0;
            s3q0 s3q0Var2 = s3q0.a;
            addView(vkAvatar, bVar2);
        }
        if (dVar != null) {
            boolean z2 = dVar instanceof fpv0.d.b;
            if (z2) {
                VkBadge vkBadge = new VkBadge(getContext(), null, 6);
                vkBadge.setAppearance(VkBadge.Appearance.Design.AccentRed);
                view = vkBadge;
            } else {
                if (!(dVar instanceof fpv0.d.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                VkCounter vkCounter = new VkCounter(getContext(), null);
                vkCounter.setAppearance(VkCounter.CounterAppearance.Appearance.AccentRed);
                vkCounter.setMode(VkCounter.Mode.Primary);
                vkCounter.setSize(VkCounter.Size.Small);
                vkCounter.setCounterWithoutAnimation(5);
                view = vkCounter;
            }
            ConstraintLayout.b bVar3 = new ConstraintLayout.b(-2, -2);
            if (z2) {
                bVar3.i = imageView.getId();
                bVar3.v = imageView.getId();
                ((ViewGroup.MarginLayoutParams) bVar3).topMargin = hbh0.b(-2, getContext());
                bVar3.setMarginEnd(hbh0.b(-2, getContext()));
            } else {
                if (!(dVar instanceof fpv0.d.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar3.i = imageView.getId();
                bVar3.t = imageView.getId();
                ((ViewGroup.MarginLayoutParams) bVar3).topMargin = hbh0.b(-2, getContext());
                bVar3.setMarginStart(hbh0.b(19, getContext()));
            }
            addView(view, bVar3);
        }
    }
}
