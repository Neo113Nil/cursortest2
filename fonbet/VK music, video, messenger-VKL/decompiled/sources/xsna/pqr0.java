package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.im.Image;
import com.vk.im.ui.components.msg_search.vc.RightAction;
import com.vk.imageloader.view.VKImageView;
import com.vk.stat.scheme.SchemeStat$TypeChannelSource;
import com.vkontakte.android.R;
import xsna.k1u0;
import xsna.tlo0;

/* compiled from: VhChannelSearch.kt */
/* loaded from: classes2.dex */
public final class pqr0 extends vfz<i0b> implements ldb {
    public static final /* synthetic */ int o = 0;
    public final VkCell l;
    public final mkr0 m;
    public i0b n;

    /* compiled from: VhChannelSearch.kt */
    public static final class a implements VkCell.f {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("AvatarViewParams(avatarUri="), this.a, ')');
        }
    }

    /* compiled from: VhChannelSearch.kt */
    public static final class b implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new c(context);
        }
    }

    /* compiled from: VhChannelSearch.kt */
    public static final class c implements VkCell.d {
        public final VKImageView a;

        public c(Context context) {
            VKImageView vKImageView = new VKImageView(context, null, 6, 0);
            bwt0.d(vKImageView, cn70.b(20), (r4 & 2) != 0, (r4 & 4) != 0);
            vKImageView.setPlaceholderImage(dhr0.w(R.drawable.user_placeholder, bwt0.t(context)));
            this.a = vKImageView;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            a aVar = fVar instanceof a ? (a) fVar : null;
            if (aVar != null) {
                this.a.o0(aVar.a, null);
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }
    }

    /* compiled from: VhChannelSearch.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RightAction.values().length];
            try {
                iArr[RightAction.PLUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RightAction.JUST_SUBSCRIBED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public pqr0(VkCell vkCell, mkr0 mkr0Var) {
        super(vkCell);
        this.l = vkCell;
        this.m = mkr0Var;
        jjc.g(vkCell, new yyl0(this, 9));
        vkCell.setLeftMainAvatarController(new b());
    }

    @Override // xsna.ldb
    public final SchemeStat$TypeChannelSource K4() {
        i0b i0bVar = this.n;
        if (i0bVar == null) {
            i0bVar = null;
        }
        return i0bVar instanceof lcf0 ? SchemeStat$TypeChannelSource.SEARCH_RECOMM : SchemeStat$TypeChannelSource.SEARCH;
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(i0b i0bVar) {
        i0b i0bVar2 = i0bVar;
        this.n = i0bVar2;
        int b2 = cn70.b(40);
        Image Bb = i0bVar2.i().Bb(b2, b2);
        VkCell.Right.d dVar = null;
        VkCell.Left.b a2 = VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.a(new a(String.valueOf(Bb != null ? Bb.d : null)), VkCell.Left.Main.Size.Small));
        VkCell vkCell = this.l;
        vkCell.setLeft(a2);
        vkCell.setMiddle(VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(u11.f(tlo0.Companion, i0bVar2.getName()), 1, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, i0bVar2.s6() ? new VkCell.Middle.e.b.C0817b(new gko(R.drawable.vk_icon_verified_16), new k1u0.a(new x7g(R.attr.vk_ui_icon_accent)), (tlo0.f) null, (Size) null, 12) : null, 18), null, null, 14));
        int i = d.$EnumSwitchMapping$0[i0bVar2.K9().ordinal()];
        if (i == 1) {
            dVar = VkCell.Right.c.a(VkCell.Right.Companion, null, new VkCell.Right.e.b((dko) new gko(R.drawable.vk_icon_add_square_outline_28), (k1u0) new k1u0.a(new x7g(R.attr.vk_ui_icon_accent)), (Size) null, (tlo0) new tlo0.f(R.string.vkim_accessibility_search_join_channel), false, (gzs) new j1k0(5, this, i0bVar2), 16), null, null, 29);
        } else if (i == 2) {
            dVar = VkCell.Right.c.a(VkCell.Right.Companion, null, new VkCell.Right.e.b((dko) new gko(R.drawable.vk_icon_done_outline_28), (k1u0) new k1u0.a(new x7g(R.attr.vk_ui_icon_medium)), (Size) null, (tlo0) new tlo0.f(R.string.vkim_accessibility_search_leave_channel), false, (gzs) new p5(28, this, i0bVar2), 16), null, null, 29);
        }
        vkCell.setRight(dVar);
    }

    @Override // xsna.ldb
    public final String h2() {
        i0b i0bVar = this.n;
        if (i0bVar == null) {
            i0bVar = null;
        }
        return i0bVar.r();
    }
}
