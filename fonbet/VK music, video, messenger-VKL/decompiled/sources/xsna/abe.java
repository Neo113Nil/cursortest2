package xsna;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import com.vk.clips.design.view.component.badge.ClipBadge;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.skeleton.VkSkeleton;
import com.vkontakte.android.R;

/* compiled from: ClipsGridBlockClipItemContainer.kt */
/* loaded from: classes17.dex */
public final class abe {
    public final ViewGroup a;
    public final VkSkeleton b;
    public final VkImage c;
    public final ClipBadge d;
    public final wae e;
    public final View f;

    /* compiled from: ClipsGridBlockClipItemContainer.kt */
    public static final class a extends ViewOutlineProvider {
        public final /* synthetic */ ViewGroup a;

        public a(ViewGroup viewGroup) {
            this.a = viewGroup;
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            Integer valueOf = Integer.valueOf(view.getWidth());
            if (valueOf.intValue() <= 0) {
                valueOf = null;
            }
            int intValue = valueOf != null ? valueOf.intValue() : view.getMeasuredWidth();
            Integer valueOf2 = Integer.valueOf(view.getHeight());
            Integer num = valueOf2.intValue() > 0 ? valueOf2 : null;
            outline.setRoundRect(0, 0, intValue, num != null ? num.intValue() : view.getMeasuredHeight(), e3m.a(R.dimen.vk_ui_spacing_size_xl, this.a.getContext()));
        }
    }

    public abe(ViewGroup viewGroup) {
        this.a = viewGroup;
        this.b = (VkSkeleton) viewGroup.findViewById(R.id.clip_item_skeleton);
        VkImage vkImage = (VkImage) viewGroup.findViewById(R.id.clip_item_preview);
        this.c = vkImage;
        vkImage.setDontLoadAgainIfSameResource(true);
        ClipBadge clipBadge = (ClipBadge) viewGroup.findViewById(R.id.clip_item_badge);
        this.d = clipBadge;
        clipBadge.setVisibility(8);
        this.e = new wae(clipBadge);
        this.f = viewGroup.findViewById(R.id.clip_item_transition_overlay);
        viewGroup.setClipToOutline(true);
        viewGroup.setOutlineProvider(new a(viewGroup));
        viewGroup.setDescendantFocusability(393216);
        viewGroup.setImportantForAccessibility(1);
    }
}
