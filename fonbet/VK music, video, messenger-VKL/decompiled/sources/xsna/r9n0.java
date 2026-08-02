package xsna;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.VkCellSkeleton;
import com.vk.core.view.components.cell.VkCellSkeleton$Left$Main;
import com.vk.core.view.components.cell.f;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.dto.menu.SideMenuItem;
import com.vk.superapp.api.dto.account.ProfileNavigationInfo;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.k1u0;
import xsna.p820;
import xsna.tlo0;

/* compiled from: SuperAppMenuV3Adapter.kt */
/* loaded from: classes6.dex */
public final class r9n0 extends gf6<p820> {
    public final wgm0 e;

    /* compiled from: SuperAppMenuV3Adapter.kt */
    public static final class a extends hf6<p820> {
        public final VkCell m;
        public final VkCellSkeleton n;

        /* compiled from: SuperAppMenuV3Adapter.kt */
        /* renamed from: xsna.r9n0$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3601a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ProfileNavigationInfo.SecurityInfo.values().length];
                try {
                    iArr[ProfileNavigationInfo.SecurityInfo.NO_STATUS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ProfileNavigationInfo.SecurityInfo.NO_PHONE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ProfileNavigationInfo.SecurityInfo.HAS_WARNINGS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ProfileNavigationInfo.SecurityInfo.ALL_GOOD.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public a(View view) {
            super(view);
            this.m = (VkCell) this.itemView.findViewById(R.id.menu_item_cell);
            this.n = (VkCellSkeleton) this.itemView.findViewById(R.id.menu_item_skeleton);
        }

        public static void a6(a aVar, VkCell vkCell, VkCell.Left.Main.c cVar, tlo0 tlo0Var, tlo0 tlo0Var2, Integer num, int i) {
            VkCounter.CounterAppearance.Appearance appearance = null;
            tlo0 tlo0Var3 = (i & 4) != 0 ? null : tlo0Var2;
            Integer num2 = (i & 8) != 0 ? null : num;
            vkCell.setLeft(new VkCell.Left.b(cVar, null));
            vkCell.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(tlo0Var, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), tlo0Var3 != null ? new VkCell.Middle.d(tlo0Var3, (gzs) null, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62) : null, (VkCell.Middle.c) null, (VkCell.Middle.Size) null, 12));
            vkCell.setRight(new VkCell.Right.d(num2 != null ? new VkCell.Right.a.d(num2.intValue(), appearance, 6) : null, (VkCell.Right.e) null, (VkCell.Right.ExtraAction.a) null, new VkCell.Right.b((izs) null, (tlo0.f) null, new k1u0.a(new x7g(R.attr.vk_ui_icon_tertiary)), 3), 22));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.hf6
        public final void W5(p820 p820Var) {
            int i;
            int i2;
            p820 p820Var2 = p820Var;
            boolean z = p820Var2 instanceof p820.a;
            int i3 = R.attr.vk_ui_icon_accent;
            boolean z2 = true;
            VkCellSkeleton vkCellSkeleton = this.n;
            VkCell vkCell = this.m;
            if (z) {
                ProfileNavigationInfo profileNavigationInfo = ((p820.a) p820Var2).a;
                if (profileNavigationInfo == null) {
                    vkCellSkeleton.setLeft(new com.vk.core.view.components.cell.c(new VkCellSkeleton$Left$Main.d(VkCellSkeleton$Left$Main.Size.Medium), null));
                    vkCellSkeleton.setMiddle(new com.vk.core.view.components.cell.e(f.b.b(com.vk.core.view.components.cell.f.Companion), f.b.a(0), 12));
                    f4m.j(vkCell);
                    vkCellSkeleton.setVisibility(0);
                    return;
                }
                int i4 = C3601a.$EnumSwitchMapping$0[profileNavigationInfo.d.ordinal()];
                if (i4 == 1 || i4 == 2 || i4 == 3) {
                    i = R.drawable.vk_icon_error_circle_outline_28;
                    i3 = R.attr.vk_ui_accent_orange;
                    i2 = R.string.profile_security_level_warning;
                } else {
                    if (i4 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.itemView.getContext();
                    i = R.drawable.vk_icon_user_card_outline_28;
                    i2 = R.string.profile_security_level_all_good;
                }
                a6(this, this.m, new VkCell.Left.Main.c(i, VkCell.Left.Main.Size.Medium, new k1u0.a(new x7g(i3)), (tlo0.h) null, 8), tq.h(tlo0.Companion, R.string.vk_profile_dashboard_vkconnect_manage_vkid), new tlo0.f(i2), null, 24);
                vkCell.setVisibility(0);
                f4m.j(vkCellSkeleton);
                return;
            }
            String str = "";
            if (!(p820Var2 instanceof p820.b)) {
                if (!(p820Var2 instanceof p820.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                String str2 = ((p820.c) p820Var2).c;
                m9n0 e = q7n0.a().e();
                this.itemView.getContext();
                int a = e.a(str2);
                this.itemView.getContext();
                VkCell.Left.Main.c cVar = new VkCell.Left.Main.c(a, VkCell.Left.Main.Size.Medium, new k1u0.a(new x7g(R.attr.vk_ui_icon_accent)), (tlo0.h) null, 8);
                tlo0.a aVar = tlo0.Companion;
                String e2 = q7n0.a().e().e(this.itemView.getContext(), str2);
                String str3 = str;
                if (e2 != null) {
                    str3 = e2;
                }
                a6(this, this.m, cVar, oq.d(aVar, str3), null, null, 12);
                vkCell.setVisibility(0);
                f4m.j(vkCellSkeleton);
                return;
            }
            SideMenuItem sideMenuItem = ((p820.b) p820Var2).c;
            m9n0 e3 = q7n0.a().e();
            String str4 = sideMenuItem.b;
            this.itemView.getContext();
            int a2 = e3.a(str4);
            String str5 = sideMenuItem.e;
            if (str5 != null && !drm0.N(str5)) {
                z2 = false;
            }
            int b = q7n0.a().e().b(sideMenuItem.b);
            this.itemView.getContext();
            VkCell.Left.Main.c cVar2 = new VkCell.Left.Main.c(a2, VkCell.Left.Main.Size.Medium, new k1u0.a(new x7g(R.attr.vk_ui_icon_accent)), (tlo0.h) null, 8);
            tlo0.a aVar2 = tlo0.Companion;
            String str6 = sideMenuItem.d;
            String str7 = str;
            if (!drm0.N(str6)) {
                SideMenuItem.AdditionalInfo additionalInfo = sideMenuItem.g;
                String str8 = additionalInfo != null ? additionalInfo.b : null;
                if (str8 == null || drm0.N(str8)) {
                    str7 = str6;
                } else {
                    SpannableStringBuilder append = new SpannableStringBuilder(str6).append((CharSequence) " ").append((CharSequence) str8);
                    append.setSpan(new ForegroundColorSpan(e3m.f(R.attr.vk_ui_text_secondary, this.itemView.getContext())), append.length() - str8.length(), append.length(), 33);
                    str7 = append;
                }
            }
            a6(this, this.m, cVar2, u11.f(aVar2, str7), !z2 ? new tlo0.h(str5) : null, b > 0 ? Integer.valueOf(b) : null, 16);
            vkCell.setVisibility(0);
            f4m.j(vkCellSkeleton);
        }
    }

    public r9n0(wgm0 wgm0Var) {
        super(new com.vk.lists.a(new q820()), 2);
        this.e = wgm0Var;
    }

    @Override // xsna.gf6
    public final hf6 K0(int i, View view) {
        a aVar = new a(view);
        aVar.itemView.setOnClickListener(new f9m(2, this, aVar));
        return aVar;
    }
}
