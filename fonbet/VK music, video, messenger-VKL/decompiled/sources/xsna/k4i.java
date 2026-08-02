package xsna;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.vk.profile.community.impl.ui.item.header.model.CommunityTrustMarkItemModel;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.zq20;

/* compiled from: CommunityTrustMarkItem.kt */
/* loaded from: classes5.dex */
public final class k4i extends we6 {
    public final CommunityTrustMarkItemModel g;
    public final hh1 h;
    public final com.vk.movika.sdk.android.defaultplayer.container.e i;
    public final int j = -1018;

    /* compiled from: CommunityTrustMarkItem.kt */
    public static final class a extends vif0<k4i> {
        public final ComposeView n;
        public k4i o;

        /* compiled from: CommunityTrustMarkItem.kt */
        /* renamed from: xsna.k4i$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3163a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CommunityTrustMarkItemModel.Type.values().length];
                try {
                    iArr[CommunityTrustMarkItemModel.Type.NONE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CommunityTrustMarkItemModel.Type.DOCS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CommunityTrustMarkItemModel.Type.FRIENDS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[CommunityTrustMarkItemModel.Type.POPULAR.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[CommunityTrustMarkItemModel.Type.YCLIENTS.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[CommunityTrustMarkItemModel.Type.OZON.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[CommunityTrustMarkItemModel.Type.DATE.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[CommunityTrustMarkItemModel.Type.DELIVERY.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(ViewGroup viewGroup) {
            super(r0);
            ComposeView composeView = new ComposeView(viewGroup.getContext(), null, 6);
            composeView.setId(R.id.vk_community_trust_mark_item);
            composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            composeView.setBackgroundColor(krv0.m(R.attr.vk_ui_background_content, composeView.getContext()));
            this.n = (ComposeView) this.itemView;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x00d3  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static zq20 q6(CommunityTrustMarkItemModel.Type type, androidx.compose.runtime.a aVar) {
            int i;
            long j;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(936866483, 0, -1, "com.vk.profile.community.impl.ui.item.header.CommunityTrustMarkItem.CommunityTrustMarkViewHolder.getIcon (CommunityTrustMarkItem.kt:123)");
            }
            int[] iArr = C3163a.$EnumSwitchMapping$0;
            switch (iArr[type.ordinal()]) {
                case 1:
                    i = R.drawable.vk_icon_write_square_outline_20;
                    break;
                case 2:
                    i = R.drawable.vk_icon_check_shield_green_20;
                    break;
                case 3:
                    i = R.drawable.vk_icon_thumbs_up_20;
                    break;
                case 4:
                    i = R.drawable.vk_icon_fire_20;
                    break;
                case 5:
                    i = R.drawable.vk_icon_logo_yclients_20;
                    break;
                case 6:
                    i = R.drawable.vk_icon_logo_ozon_color_20;
                    break;
                case 7:
                    i = R.drawable.vk_icon_calendar_shield_20;
                    break;
                case 8:
                    i = R.drawable.vk_icon_market_20;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            lg90 a = pg90.a(i, 0, aVar);
            int i2 = iArr[type.ordinal()];
            if (i2 != 1 && i2 != 3) {
                if (i2 == 4) {
                    aVar.K(-1614395969);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j = ylu0Var.getIcon().h;
                    aVar.j();
                } else if (i2 != 7 && i2 != 8) {
                    aVar.K(-1614394594);
                    aVar.j();
                    j = l5g.k;
                }
                zq20 a2 = zq20.a.a(a, new l5g(j), null, aVar, 24584, 12);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return a2;
            }
            aVar.K(-1614398883);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = ylu0Var2.getIcon().a;
            aVar.j();
            zq20 a22 = zq20.a.a(a, new l5g(j), null, aVar, 24584, 12);
            if (androidx.compose.runtime.b.d()) {
            }
            return a22;
        }

        @Override // xsna.vif0
        public final void i6(k4i k4iVar) {
            com.vk.movika.sdk.android.defaultplayer.container.e eVar;
            k4i k4iVar2 = k4iVar;
            k4i k4iVar3 = this.o;
            if (epx.f(k4iVar3 != null ? k4iVar3.g : null, k4iVar2 != null ? k4iVar2.g : null)) {
                return;
            }
            this.o = k4iVar2;
            ComposeView composeView = this.n;
            composeView.setContent(new jai(567000698, new sg4(3, this, composeView), true));
            if (k4iVar2 == null || (eVar = k4iVar2.i) == null) {
                return;
            }
            eVar.invoke();
        }
    }

    public k4i(CommunityTrustMarkItemModel communityTrustMarkItemModel, hh1 hh1Var, com.vk.movika.sdk.android.defaultplayer.container.e eVar) {
        this.g = communityTrustMarkItemModel;
        this.h = hh1Var;
        this.i = eVar;
    }

    @Override // xsna.we6
    public final vif0<? extends we6> a(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    @Override // xsna.we6
    public final int h() {
        return this.j;
    }
}
