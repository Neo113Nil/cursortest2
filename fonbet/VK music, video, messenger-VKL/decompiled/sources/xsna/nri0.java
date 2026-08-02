package xsna;

import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.core.view.components.picture.VkImage;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.profile.design.view.onboarding.UserProfileOnBoardingBannerView;
import com.vk.profile.user.api.domain.actions.ProfileAction;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.a280;
import xsna.gs90;
import xsna.k1u0;
import xsna.tlo0;
import xsna.yuq0;

/* compiled from: ServicesAdapter.kt */
/* loaded from: classes5.dex */
public final class nri0 extends zoj0<yuq0, RecyclerView.e0> {
    public static final int f = cn70.b(20);
    public final aa5 e;

    /* compiled from: ServicesAdapter.kt */
    public final class a extends vif0<yuq0.a> {
        public a(View view) {
            super(view);
        }

        @Override // xsna.vif0
        public final void i6(yuq0.a aVar) {
            yuq0.a aVar2 = aVar;
            View view = this.itemView;
            UserProfileOnBoardingBannerView userProfileOnBoardingBannerView = view instanceof UserProfileOnBoardingBannerView ? (UserProfileOnBoardingBannerView) view : null;
            if (userProfileOnBoardingBannerView == null) {
                return;
            }
            je80 je80Var = aVar2.b;
            String str = je80Var.b;
            String str2 = je80Var.c;
            WebImageSize f = je80Var.d.f(nri0.f);
            String str3 = f != null ? f.b : null;
            if (str3 == null) {
                str3 = "";
            }
            a280.a.b bVar = new a280.a.b(str, str2, str3);
            nri0 nri0Var = nri0.this;
            userProfileOnBoardingBannerView.setup(new a280(bVar, new dac0(7, nri0Var, je80Var), new fk(18, nri0Var, je80Var)));
        }
    }

    /* compiled from: ServicesAdapter.kt */
    public final class b extends vif0<yuq0.b> {
        public final VkImage n;
        public final pri0 o;

        public b(VkCell vkCell) {
            super(vkCell);
            VkImage vkImage = new VkImage(this.itemView.getContext(), null, 6, 0);
            qcy<Object>[] qcyVarArr = bwt0.a;
            int dimension = (int) vkImage.getResources().getDimension(R.dimen.user_profile_additional_action_third_party_icon_size);
            vkImage.setLayoutParams(new ViewGroup.LayoutParams(dimension, dimension));
            bwt0.o0(vkImage, krv0.m(R.attr.vk_ui_icon_accent, vkImage.getContext()));
            this.n = vkImage;
            this.o = new pri0(this);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x011a  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00fb  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00a0  */
        @Override // xsna.vif0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void i6(yuq0.b bVar) {
            vv5 b;
            ztu a;
            tlo0 tlo0Var;
            tlo0 h;
            VkCell.Middle.b bVar2;
            WebApiApplication webApiApplication;
            yuq0.b bVar3 = bVar;
            View view = this.itemView;
            VkCell vkCell = view instanceof VkCell ? (VkCell) view : null;
            if (vkCell == null) {
                return;
            }
            ProfileAction profileAction = bVar3.b;
            vv5 b2 = profileAction.b();
            if (b2 != null) {
                String str = b2.b;
                if (str.length() <= 0) {
                    str = null;
                }
                if (str != null) {
                    vkCell.setLeftMainViewController(this.o);
                    VkImage vkImage = this.n;
                    vkImage.clear();
                    vkImage.o0(str, null);
                    vkCell.setLeft(VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.e(new qri0(), new Size(cn70.b(28), cn70.b(28)))));
                    b = profileAction.b();
                    if (b != null) {
                        String str2 = b.a;
                        if (str2.length() <= 0) {
                            str2 = null;
                        }
                        if (str2 != null) {
                            h = oq.d(tlo0.Companion, str2);
                            tlo0Var = h;
                            gs90.a payload = profileAction.getPayload();
                            String str3 = (payload != null || (webApiApplication = payload.a) == null) ? null : webApiApplication.c;
                            if (tlo0Var != null) {
                                bVar2 = VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(tlo0Var, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), str3 != null ? new VkCell.Middle.d(oq.d(tlo0.Companion, str3), (gzs) null, 0, (TextUtils.TruncateAt) null, new VkCell.Middle.d.b.C0815b(new gko(R.drawable.vk_icon_services_12), new k1u0.a(new x7g(R.attr.vk_ui_icon_secondary)), 4), (VkCell.Middle.d.b.C0815b) null, 46) : null, null, 12);
                            } else {
                                bVar2 = null;
                            }
                            vkCell.setMiddle(bVar2);
                            vkCell.setRight(profileAction.c() > 0 ? VkCell.Right.c.a(VkCell.Right.Companion, new VkCell.Right.a.d(profileAction.c(), (VkCounter.CounterAppearance.Appearance) null, 6), null, null, null, 30) : null);
                            bwt0.i0(this.itemView, new rh4(26, nri0.this, bVar3));
                            return;
                        }
                    }
                    a = profileAction.a();
                    if (a != null) {
                        tlo0Var = null;
                        gs90.a payload2 = profileAction.getPayload();
                        if (payload2 != null) {
                        }
                        if (tlo0Var != null) {
                        }
                        vkCell.setMiddle(bVar2);
                        vkCell.setRight(profileAction.c() > 0 ? VkCell.Right.c.a(VkCell.Right.Companion, new VkCell.Right.a.d(profileAction.c(), (VkCounter.CounterAppearance.Appearance) null, 6), null, null, null, 30) : null);
                        bwt0.i0(this.itemView, new rh4(26, nri0.this, bVar3));
                        return;
                    }
                    h = tq.h(tlo0.Companion, a.a);
                    tlo0Var = h;
                    gs90.a payload22 = profileAction.getPayload();
                    if (payload22 != null) {
                    }
                    if (tlo0Var != null) {
                    }
                    vkCell.setMiddle(bVar2);
                    vkCell.setRight(profileAction.c() > 0 ? VkCell.Right.c.a(VkCell.Right.Companion, new VkCell.Right.a.d(profileAction.c(), (VkCounter.CounterAppearance.Appearance) null, 6), null, null, null, 30) : null);
                    bwt0.i0(this.itemView, new rh4(26, nri0.this, bVar3));
                    return;
                }
            }
            ztu a2 = profileAction.a();
            if (a2 != null) {
                int i = a2.b;
                vkCell.setLeftMainViewController(null);
                vkCell.setLeft(VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.c(i, VkCell.Left.Main.Size.Medium, (k1u0) null, (tlo0.h) null, 12)));
            }
            b = profileAction.b();
            if (b != null) {
            }
            a = profileAction.a();
            if (a != null) {
            }
        }
    }

    public nri0(aa5 aa5Var) {
        this.e = aa5Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((yuq0) this.c.c(i)).a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        vif0 vif0Var;
        yuq0 yuq0Var = (yuq0) this.c.c(i);
        if (yuq0Var instanceof yuq0.a) {
            vif0Var = e0Var instanceof a ? (a) e0Var : null;
            if (vif0Var != null) {
                vif0Var.V5(yuq0Var);
                return;
            }
            return;
        }
        if (!(yuq0Var instanceof yuq0.b)) {
            throw new NoWhenBranchMatchedException();
        }
        vif0Var = e0Var instanceof b ? (b) e0Var : null;
        if (vif0Var != null) {
            vif0Var.V5(yuq0Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == R.layout.item_header_onboarding_panel) {
            return new a(tf3.b(viewGroup, i, viewGroup, false));
        }
        if (i != 0) {
            throw new IllegalStateException("Incorrect view type!");
        }
        VkCell vkCell = new VkCell(viewGroup.getContext(), null, 6, 0);
        vkCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new b(vkCell);
    }
}
