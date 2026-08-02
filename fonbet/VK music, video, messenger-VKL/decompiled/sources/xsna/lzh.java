package xsna;

import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.cell.VkMiniInfoCell;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: CommunityReviewsRatingItem.kt */
/* loaded from: classes5.dex */
public final class lzh extends we6 {
    public final mzh g;
    public final ry0 h;
    public final int i = -241;

    /* compiled from: CommunityReviewsRatingItem.kt */
    public static final class a extends vif0<lzh> {
        public final VkMiniInfoCell n;
        public lzh o;

        /* compiled from: CommunityReviewsRatingItem.kt */
        /* renamed from: xsna.lzh$a$a, reason: collision with other inner class name */
        public static final class C3312a extends VkMiniInfoCell.b {

            /* compiled from: CommunityReviewsRatingItem.kt */
            /* renamed from: xsna.lzh$a$a$a, reason: collision with other inner class name */
            public static final /* synthetic */ class C3313a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[VkMiniInfoCell.Mode.values().length];
                    try {
                        iArr[VkMiniInfoCell.Mode.BaseAccent.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public C3312a() {
                super(true);
            }

            @Override // com.vk.core.view.components.cell.VkMiniInfoCell.b, com.vk.core.view.components.cell.VkMiniInfoCell.a
            public final cut0 a(VkMiniInfoCell.Mode mode) {
                mzh mzhVar;
                if (C3313a.$EnumSwitchMapping$0[mode.ordinal()] != 1) {
                    return super.a(mode);
                }
                lzh lzhVar = a.this.o;
                return new x7g((lzhVar == null || (mzhVar = lzhVar.g) == null || mzhVar.b <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? R.attr.vk_ui_icon_secondary : R.attr.vk_ui_accent_orange_peach);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(ViewGroup viewGroup) {
            super(r0, viewGroup);
            VkMiniInfoCell vkMiniInfoCell = new VkMiniInfoCell(viewGroup.getContext(), null, 6);
            vkMiniInfoCell.setId(R.id.vk_community_reviews_rating_info_item);
            vkMiniInfoCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            vkMiniInfoCell.setBackgroundColor(krv0.m(R.attr.vk_ui_background_content, vkMiniInfoCell.getContext()));
            VkMiniInfoCell vkMiniInfoCell2 = (VkMiniInfoCell) this.itemView;
            this.n = vkMiniInfoCell2;
            jjc.g(vkMiniInfoCell2, new r3h(this, 2));
            vkMiniInfoCell2.setDecorator(new C3312a());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.vif0
        public final void i6(lzh lzhVar) {
            lzh lzhVar2 = lzhVar;
            mzh mzhVar = lzhVar2.g;
            if (epx.f(this.o, lzhVar2)) {
                return;
            }
            this.o = lzhVar2;
            VkMiniInfoCell.Mode mode = VkMiniInfoCell.Mode.BaseAccent;
            VkMiniInfoCell vkMiniInfoCell = this.n;
            vkMiniInfoCell.setMode(mode);
            if (mzhVar.b <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                vkMiniInfoCell.setIcon(new VkMiniInfoCell.d(new gko(R.drawable.vk_icon_favorite_outline_20), null, 6));
                vkMiniInfoCell.setMiddle(new VkMiniInfoCell.e(oq.d(tlo0.Companion, g6(R.string.community_reviews_empty_reviews)), false, false, false, false, null, 62));
                return;
            }
            int i = mzhVar.d;
            vkMiniInfoCell.setIcon(new VkMiniInfoCell.d(new gko(R.drawable.vk_icon_favorite_20), null, 6));
            tlo0.a aVar = tlo0.Companion;
            StringBuilder sb = new StringBuilder();
            sb.append(((lzh) this.m).g.c);
            sb.append(" · ");
            aVar.getClass();
            sb.append(tlo0.b.a(new tlo0.d(R.plurals.review_count, i), this.itemView.getContext()));
            s3q0 s3q0Var = s3q0.a;
            vkMiniInfoCell.setMiddle(new VkMiniInfoCell.e(new tlo0.h(sb.toString()), false, false, false, false, null, 62));
        }
    }

    public lzh(mzh mzhVar, ry0 ry0Var) {
        this.g = mzhVar;
        this.h = ry0Var;
    }

    @Override // xsna.we6
    public final vif0<? extends we6> a(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    @Override // xsna.we6
    public final int h() {
        return this.i;
    }
}
