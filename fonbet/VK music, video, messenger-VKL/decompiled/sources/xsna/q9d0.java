package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.tile.VkTile;
import com.vk.profile.user.api.domain.actions.ProfileAction;
import com.vk.profile.user.impl.UserProfileDialogs;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.tlo0;
import xsna.zp0;

/* compiled from: PrimaryHolder.kt */
/* loaded from: classes5.dex */
public final class q9d0 extends yp0<zp0.b.a> {
    public static final int v = iah0.a(52);
    public final View o;
    public final wzs<ProfileAction, UserProfileDialogs.ItemCallPlace, s3q0> p;
    public final gzs<Integer> q;
    public final int r;
    public int s;
    public final RecyclerView t;
    public final r9d0 u;

    /* compiled from: PrimaryHolder.kt */
    public final class a extends vif0<zp0.b.a.C4192a> {
        public final VkTile n;
        public final VkImageSimple o;
        public final p9d0 p;
        public final VkImage q;
        public final p9d0 r;

        public a(VkTile vkTile) {
            super(vkTile);
            this.n = vkTile;
            VkImageSimple vkImageSimple = new VkImageSimple(this.itemView.getContext(), null, 6, 0);
            s6(vkImageSimple);
            this.o = vkImageSimple;
            this.p = new p9d0(vkImageSimple);
            VkImage vkImage = new VkImage(this.itemView.getContext(), null, 6, 0);
            s6(vkImage);
            this.q = vkImage;
            this.r = new p9d0(vkImage);
        }

        public static void s6(AppCompatImageView appCompatImageView) {
            appCompatImageView.setId(R.id.primary_action_item_icon);
            int i = q9d0.v;
            appCompatImageView.setLayoutParams(new ViewGroup.LayoutParams(i, i));
            int a = iah0.a(12);
            appCompatImageView.setPadding(a, a, a, a);
            appCompatImageView.setBackgroundResource(R.drawable.profile_additional_action_primary_background);
            bwt0.o0(appCompatImageView, krv0.m(R.attr.vk_ui_icon_accent, appCompatImageView.getContext()));
        }

        @Override // xsna.vif0
        public final void i6(zp0.b.a.C4192a c4192a) {
            zp0.b.a.C4192a c4192a2 = c4192a;
            ProfileAction profileAction = c4192a2.a;
            Integer num = c4192a2.c;
            boolean z = num != null;
            if (num != null) {
                int intValue = num.intValue();
                tlo0.Companion.getClass();
                q6(new tlo0.f(intValue));
            }
            ztu a = profileAction.a();
            VkTile vkTile = this.n;
            if (a != null) {
                if (!z) {
                    tlo0.a aVar = tlo0.Companion;
                    int i = a.a;
                    aVar.getClass();
                    q6(new tlo0.f(i));
                }
                this.o.setImageResource(a.b);
                vkTile.setVisualContentController(this.p);
            } else {
                vv5 b = profileAction.b();
                if (b != null) {
                    if (!z) {
                        tlo0.a aVar2 = tlo0.Companion;
                        String str = b.a;
                        aVar2.getClass();
                        q6(new tlo0.h(str));
                    }
                    VkImage vkImage = this.q;
                    vkImage.clear();
                    vkImage.o0(b.b, null);
                    vkTile.setVisualContentController(this.r);
                }
            }
            Integer num2 = c4192a2.b;
            String g6 = num2 != null ? g6(num2.intValue()) : null;
            if (g6 == null) {
                g6 = "";
            }
            this.itemView.setContentDescription(g6);
            View view = this.itemView;
            q9d0 q9d0Var = q9d0.this;
            bwt0.i0(view, new mz80(9, q9d0Var, c4192a2));
            View view2 = this.itemView;
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = (q9d0Var.q.invoke().intValue() - (q9d0Var.r * 2)) / q9d0Var.s;
            view2.setLayoutParams(layoutParams);
        }

        public final void q6(tlo0 tlo0Var) {
            this.n.setTitle(new VkTile.e(tlo0Var, 0, null, null, null, null, null, 510));
        }
    }

    public q9d0(View view, xwl xwlVar, tfm0 tfm0Var) {
        super(view);
        this.o = view;
        this.p = xwlVar;
        this.q = tfm0Var;
        qcy<Object>[] qcyVarArr = bwt0.a;
        this.r = (int) view.getResources().getDimension(R.dimen.user_profile_additional_action_primary_horizontal_padding);
        this.s = 4;
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.rv_additional_actions);
        this.t = recyclerView;
        r9d0 r9d0Var = new r9d0(this);
        this.u = r9d0Var;
        recyclerView.setAdapter(r9d0Var);
    }

    @Override // xsna.vif0
    public final void i6(Object obj) {
        ArrayList arrayList = ((zp0.b.a) obj).d;
        this.s = Math.min(4, arrayList.size());
        this.u.setItems(arrayList);
    }

    @Override // xsna.yp0
    public final void q6() {
        this.t.setAdapter(this.u);
    }
}
