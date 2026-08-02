package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.button.Appearance;
import com.vk.core.view.components.cell.button.IconBackgroundStyle;
import com.vk.core.view.components.cell.button.IconSize;
import com.vk.core.view.components.cell.button.VkCellButton;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ClipsAuthorSelectorCreateChannelDelegate.kt */
/* loaded from: classes14.dex */
public final class ihd extends p1u0<jhd> {
    public final fa6 a;

    /* compiled from: ClipsAuthorSelectorCreateChannelDelegate.kt */
    public static final class a extends vfz<jhd> {
        public final View l;
        public final gzs<s3q0> m;
        public final Object n;

        public a(View view, fa6 fa6Var) {
            super(view);
            this.l = view;
            this.m = fa6Var;
            this.n = msy.a(LazyThreadSafetyMode.NONE, new yc(this, 20));
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(jhd jhdVar) {
            bwt0.i0(this.l, new v5(this, 22));
            VkCellButton vkCellButton = (VkCellButton) this.n.getValue();
            vkCellButton.setTitle(R.string.clips_author_selector_create_channel);
            vkCellButton.setAppearance(Appearance.Accent);
            vkCellButton.setIconBackgroundStyle(IconBackgroundStyle.Circle);
            vkCellButton.a(true, Integer.valueOf(R.drawable.vk_icon_add_20));
            vkCellButton.setIconTint(R.attr.vk_ui_icon_accent);
            vkCellButton.setIconSize(IconSize.Small);
        }
    }

    public ihd(fa6 fa6Var) {
        this.a = fa6Var;
    }

    @Override // xsna.p1u0
    public final vfz<? extends jhd> b(ViewGroup viewGroup) {
        return new a(bwt0.I(R.layout.clips_authors_selector_create_channel_item, viewGroup, false), this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof jhd;
    }
}
