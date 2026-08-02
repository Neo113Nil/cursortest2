package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.core.view.components.tabs.VkDefaultTabLayout;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stickers.ContextUser;
import com.vk.stickers.bridge.GiftData;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import xsna.dw20;

/* compiled from: BonusRewardsBottomSheet.kt */
/* loaded from: classes5.dex */
public final class ql7 implements fcn {
    public final GiftData b;
    public final ContextUser c;
    public final boolean d;
    public dw20 e;

    public ql7(GiftData giftData, ContextUser contextUser, boolean z) {
        this.b = giftData;
        this.c = contextUser;
        this.d = z;
    }

    @Override // xsna.fcn
    public final boolean M4() {
        return true;
    }

    @Override // xsna.fcn
    public final boolean N8() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(final Context context) {
        List l;
        View inflate = LayoutInflater.from(context).inflate(R.layout.stickers_bonus_rewards_dialog, (ViewGroup) null, false);
        VkDefaultTabLayout vkDefaultTabLayout = (VkDefaultTabLayout) inflate.findViewById(R.id.tabs);
        ViewPager2 viewPager2 = (ViewPager2) inflate.findViewById(R.id.pager);
        ul7 ul7Var = new ul7();
        ul7Var.x0(tl7.class, new l00(this, 9));
        ArrayList arrayList = new ArrayList();
        boolean z = this.d;
        if (!z) {
            arrayList.add(new tl7(false));
        }
        arrayList.add(new tl7(true));
        ul7Var.setItems(arrayList);
        viewPager2.setAdapter(ul7Var);
        new com.google.android.material.tabs.c(vkDefaultTabLayout, viewPager2, new y34(context, 5)).a();
        if (z) {
            f4m.j(vkDefaultTabLayout);
            l = Collections.singletonList(MobileOfficialAppsCoreNavStat$EventScreen.STICKERS_BONUS_REWARDS_INACTIVE);
        } else {
            vkDefaultTabLayout.setVisibility(0);
            l = e43.l(MobileOfficialAppsCoreNavStat$EventScreen.STICKERS_BONUS_REWARDS_ACTIVE, MobileOfficialAppsCoreNavStat$EventScreen.STICKERS_BONUS_REWARDS_INACTIVE);
        }
        vkDefaultTabLayout.f(new z1q0((List<? extends MobileOfficialAppsCoreNavStat$EventScreen>) l));
        this.e = ((dw20.b) new dw20.b(context, null).w0(context.getString(R.string.stickers_bonus_rewards_title)).l(dhr0.t.c(R.attr.vk_ui_background_content)).D0(inflate, false).G0()).c(new a470()).Z(new DialogInterface.OnDismissListener() { // from class: xsna.pl7
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                Object obj = context;
                if (obj instanceof ey50) {
                    ((ey50) obj).Y().H(ql7.this);
                }
            }
        }).I0("bonus_rewards");
        if (context instanceof ey50) {
            ((ey50) context).Y().S(this);
        }
    }

    @Override // xsna.fcn
    public final void b(boolean z) {
        dw20 dw20Var = this.e;
        if (dw20Var != null) {
            dw20Var.hide();
        }
    }

    @Override // xsna.fcn
    public final void dismiss() {
        b(false);
    }

    @Override // xsna.fcn
    public final boolean v6() {
        return false;
    }
}
