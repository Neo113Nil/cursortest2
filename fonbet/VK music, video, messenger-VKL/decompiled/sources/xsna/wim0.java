package xsna;

import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vk.core.view.components.banner.VkBanner;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.skeleton.VkSkeleton;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.shimmer.ThemableShimmer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.stories.model.template.StoryTemplateData;
import com.vk.storycamera.picker.template.ui.StoryTemplateFragment;
import com.vk.toggle.features.StoriesFeatures;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.ejm0;
import xsna.tlo0;

/* compiled from: StoryTemplateAdapter.kt */
/* loaded from: classes6.dex */
public final class wim0 extends androidx.recyclerview.widget.x<ejm0, RecyclerView.e0> {
    public static final int f = iah0.a(Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE);
    public static final int g = R.layout.story_template_view_holder;
    public static final int h = R.layout.story_template_memories_banner_view_holder;
    public static final int i = R.layout.story_template_skeleton_view_holder;
    public static final a j = new a();
    public final StoryTemplateFragment c;
    public final boolean d;
    public final Object e;

    /* compiled from: StoryTemplateAdapter.kt */
    public static final class a extends m.e<ejm0> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(ejm0 ejm0Var, ejm0 ejm0Var2) {
            ejm0 ejm0Var3 = ejm0Var;
            ejm0 ejm0Var4 = ejm0Var2;
            return ((ejm0Var3 instanceof ejm0.a) && (ejm0Var4 instanceof ejm0.a)) ? ((ejm0.a) ejm0Var3).a.b == ((ejm0.a) ejm0Var4).a.b : (ejm0Var3 instanceof ejm0.c) && (ejm0Var4 instanceof ejm0.c);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(ejm0 ejm0Var, ejm0 ejm0Var2) {
            ejm0 ejm0Var3 = ejm0Var;
            ejm0 ejm0Var4 = ejm0Var2;
            if ((ejm0Var3 instanceof ejm0.a) && (ejm0Var4 instanceof ejm0.a)) {
                return true;
            }
            return (ejm0Var3 instanceof ejm0.c) && (ejm0Var4 instanceof ejm0.c);
        }
    }

    /* compiled from: StoryTemplateAdapter.kt */
    public final class b extends RecyclerView.e0 {
        public final VkBanner l;

        public b(View view) {
            super(view);
            VkBanner vkBanner = (VkBanner) this.itemView.findViewById(R.id.memories_banner);
            bwt0.i0(vkBanner, new e9i0(wim0.this, 10));
            this.l = vkBanner;
        }
    }

    /* compiled from: StoryTemplateAdapter.kt */
    public final class c extends RecyclerView.e0 {
    }

    /* compiled from: StoryTemplateAdapter.kt */
    public final class d extends RecyclerView.e0 {
        public final VkImage l;
        public final VkContentBadge m;
        public final VkText n;
        public ejm0.a o;

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
        public d(View view) {
            super(view);
            VkImage vkImage = (VkImage) this.itemView.findViewById(R.id.story_template_image);
            vkImage.setPlaceholderImage((LayerDrawable) wim0.this.e.getValue());
            this.l = vkImage;
            VkContentBadge vkContentBadge = (VkContentBadge) this.itemView.findViewById(R.id.story_template_is_new);
            vkContentBadge.setAppearance(new VkContentBadge.Appearance.a(new x7g(R.attr.vk_ui_text_contrast), new x7g(R.attr.vk_ui_accent_orange_fire), null, 12));
            this.m = vkContentBadge;
            this.n = (VkText) this.itemView.findViewById(R.id.story_template_title);
            vkImage.setPaintFilterBitmap(true);
            bwt0.i0(view, new sf4(23, this, wim0.this));
        }
    }

    public wim0(l7s l7sVar, StoryTemplateFragment storyTemplateFragment) {
        super(j);
        this.c = storyTemplateFragment;
        StoriesFeatures storiesFeatures = StoriesFeatures.ST_NEW_TEMPLATE_BADGE;
        storiesFeatures.getClass();
        this.d = com.vk.toggle.b.A.a(storiesFeatures);
        this.e = msy.a(LazyThreadSafetyMode.NONE, new kr50(l7sVar, 29));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i2) {
        ejm0 item = getItem(i2);
        if (item instanceof ejm0.a) {
            return g;
        }
        if (epx.f(item, ejm0.c.a)) {
            return i;
        }
        if (item instanceof ejm0.b) {
            return h;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i2) {
        ImageSize Cb;
        ejm0 item = getItem(i2);
        if (e0Var instanceof d) {
            d dVar = (d) e0Var;
            ejm0.a aVar = (ejm0.a) item;
            VkText vkText = dVar.n;
            StoryTemplateData storyTemplateData = aVar.a;
            dVar.o = aVar;
            bwt0.p0(dVar.m, wim0.this.d && storyTemplateData.f);
            Integer num = storyTemplateData.g;
            String quantityString = num != null ? num.intValue() < 1000 ? dVar.itemView.getContext().getResources().getQuantityString(R.plurals.stories_template_count, num.intValue(), num) : dVar.itemView.getContext().getResources().getString(R.string.stories_template_count_short, brm0.y(String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf((num.intValue() / 100) / 10)}, 1)), ".0", "")) : "";
            vkText.setText(quantityString);
            bwt0.p0(vkText, myc0.f(quantityString));
            VkImage vkImage = dVar.l;
            Image image = storyTemplateData.d;
            vkImage.o0((image == null || (Cb = image.Cb(f, false, false)) == null) ? null : Cb.d.d, null);
            return;
        }
        if (e0Var instanceof b) {
            b bVar = (b) e0Var;
            ejm0.b bVar2 = (ejm0.b) item;
            VkBanner vkBanner = bVar.l;
            vkBanner.setBackgroundImage(new vlw(bVar2.d, null));
            tlo0.h d2 = oq.d(tlo0.Companion, bVar2.a);
            tlo0.h hVar = new tlo0.h(bVar2.b);
            VkButton.Mode mode = VkButton.Mode.Primary;
            VkButton.Appearance appearance = VkButton.Appearance.Accent;
            tlo0.h hVar2 = new tlo0.h(bVar2.c);
            com.vk.core.compose.component.semantics.a a2 = com.vk.core.compose.component.semantics.b.a(null, new h3e0(8), 3);
            wim0 wim0Var = wim0.this;
            vkBanner.setMiddle(new VkBanner.e(d2, hVar, null, new VkBanner.c(hVar2, new re40(wim0Var, 29), mode, appearance, null, null, a2, 496), null, null, 116));
            vkBanner.setAfter(new VkBanner.a.b(new hk70(wim0Var, 26), null, com.vk.core.compose.component.semantics.b.a(null, new j5n(26), 3), null, 10));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i2) {
        View inflate = LayoutInflater.from(bwt0.u(viewGroup.getContext())).inflate(i2, viewGroup, false);
        if (i2 == g) {
            return new d(inflate);
        }
        if (i2 == h) {
            return new b(inflate);
        }
        c cVar = new c(inflate);
        ThemableShimmer a2 = new ThemableShimmer.a(bwt0.u(inflate.getContext())).a();
        VkSkeleton vkSkeleton = (VkSkeleton) cVar.itemView.findViewById(R.id.template_skeleton);
        vkSkeleton.setType(new VkSkeleton.a.C0862a(12.0f));
        vkSkeleton.setShimmer(a2);
        return cVar;
    }
}
