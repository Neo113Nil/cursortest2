package xsna;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vk.voip.invite.AnonymCallInviteFragment;
import com.vk.voip.ui.call_invite.views.AnonymCallJoinContainer;
import com.vk.voip.ui.call_invite.views.AnonymCallJoinScrollView;
import com.vkontakte.android.R;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.dw20;
import xsna.st2;
import xsna.x89;

/* compiled from: AnonymCallInviteComponent.kt */
/* loaded from: classes7.dex */
public final class pt2 extends j8i implements w8i {
    public final Context i;
    public final w89 j;
    public final khw0 k;
    public final String l;
    public final String m;
    public st2 n;
    public boolean p;
    public AnonymCallInviteFragment.a q;
    public x89 o = x89.d.a;
    public final Object r = msy.a(LazyThreadSafetyMode.NONE, new com.vk.movika.sdk.android.defaultplayer.interactive.a(this, 5));

    /* compiled from: AnonymCallInviteComponent.kt */
    public final class a {
        public a() {
        }

        public final void a() {
            AnonymCallInviteFragment.a aVar = pt2.this.q;
            if (aVar != null) {
                aVar.a(true);
            }
        }
    }

    public pt2(Context context, w89 w89Var, khw0 khw0Var, String str, String str2) {
        this.i = context;
        this.j = w89Var;
        this.k = khw0Var;
        this.l = str;
        this.m = str2;
    }

    @Override // xsna.j8i
    public final void K0(Configuration configuration) {
        AnonymCallJoinScrollView anonymCallJoinScrollView;
        st2 st2Var = this.n;
        if (st2Var == null || (anonymCallJoinScrollView = st2Var.g) == null) {
            return;
        }
        anonymCallJoinScrollView.postDelayed(st2Var.y, 300L);
    }

    @Override // xsna.j8i
    public final View L0(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        Context context = this.i;
        String str = this.m;
        st2 st2Var = new st2(context, str);
        this.n = st2Var;
        st2Var.A = new a();
        AnonymCallJoinContainer anonymCallJoinContainer = new AnonymCallJoinContainer(context);
        st2Var.b = (TextView) anonymCallJoinContainer.findViewById(R.id.voip_call_invite_title);
        st2Var.c = (AvatarView) anonymCallJoinContainer.findViewById(R.id.voip_call_invite_chat_avatar);
        st2Var.d = (TextView) anonymCallJoinContainer.findViewById(R.id.voip_call_invite_participants_subtitle);
        st2Var.e = anonymCallJoinContainer;
        st2Var.g = (AnonymCallJoinScrollView) anonymCallJoinContainer.findViewById(R.id.voip_call_invite_scroll_view);
        st2Var.f = anonymCallJoinContainer.getInfoContainer();
        st2Var.m = anonymCallJoinContainer.getDataContainer();
        st2Var.n = anonymCallJoinContainer.getProgressContainer();
        View findViewById = anonymCallJoinContainer.findViewById(R.id.voip_call_join_logo);
        st2Var.o = findViewById;
        if (findViewById != null) {
            qcy<Object>[] qcyVarArr = bwt0.a;
            dhr0.f0(R.drawable.vk_icon_new_logo_vk_56, R.attr.vk_ui_icon_accent_themed, findViewById);
        }
        st2Var.j = anonymCallJoinContainer.findViewById(R.id.voip_call_link_share_btn);
        st2Var.k = anonymCallJoinContainer.findViewById(R.id.voip_call_invite_scan_device_qr_code_button);
        View findViewById2 = anonymCallJoinContainer.findViewById(R.id.voip_call_join_with_video);
        st2Var.h = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setEnabled(false);
        }
        View findViewById3 = anonymCallJoinContainer.findViewById(R.id.voip_call_join);
        st2Var.i = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setEnabled(false);
        }
        st2Var.l = anonymCallJoinContainer.findViewById(R.id.voip_call_invite_close);
        st2Var.p = anonymCallJoinContainer.findViewById(R.id.voip_call_invite_name_title);
        st2Var.q = (TextView) anonymCallJoinContainer.findViewById(R.id.voip_call_invite_name);
        TextView textView = (TextView) anonymCallJoinContainer.findViewById(R.id.anonym_call_legal_notes);
        Context context2 = anonymCallJoinContainer.getContext();
        int i = 2;
        new mg6(new kt2(), textView, null, krv0.m(R.attr.vk_ui_icon_accent_themed, context2), new o9(i, st2Var, context2), 36);
        TextView textView2 = st2Var.q;
        if (textView2 != null) {
            textView2.addTextChangedListener(st2Var.t);
        }
        if (str != null) {
            View view = st2Var.p;
            if (view != null) {
                view.setVisibility(8);
            }
            TextView textView3 = st2Var.q;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
        }
        TextView textView4 = st2Var.q;
        if (textView4 != null) {
            textView4.setText(str);
        }
        View findViewById4 = anonymCallJoinContainer.findViewById(R.id.voip_call_invite_join_buttons_container);
        if (findViewById4 != null) {
            bwt0.p0(findViewById4, false);
        }
        View view2 = st2Var.i;
        int i2 = 3;
        if (view2 != null) {
            bwt0.i0(view2, new k9(st2Var, i2));
        }
        View view3 = st2Var.h;
        if (view3 != null) {
            bwt0.i0(view3, new v5(st2Var, 6));
        }
        View view4 = st2Var.l;
        if (view4 != null) {
            bwt0.i0(view4, new w5(st2Var, i2));
        }
        View view5 = st2Var.j;
        if (view5 != null) {
            bwt0.i0(view5, new on(st2Var, i2));
        }
        View view6 = st2Var.k;
        if (view6 != null) {
            bwt0.p0(view6, true);
            bwt0.i0(view6, new k00(st2Var, i));
        }
        View view7 = st2Var.k;
        st2Var.s = view7 != null ? new q2x0(view7.getContext(), "add-room-by-code", R.string.voip_invite_by_qr_code_tool_tip, new r2x0(TimeUnit.DAYS.toMillis(60L)), view7, 112) : null;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.enableTransitionType(4);
        anonymCallJoinContainer.setLayoutTransition(layoutTransition);
        ViewGroup viewGroup2 = st2Var.f;
        if (viewGroup2 != null) {
            LayoutTransition layoutTransition2 = new LayoutTransition();
            layoutTransition2.enableTransitionType(4);
            viewGroup2.setLayoutTransition(layoutTransition2);
        }
        st2.a aVar = new st2.a(anonymCallJoinContainer, st2Var.x, st2Var.w);
        st2Var.r = aVar;
        int i3 = ify.a;
        ify.a(aVar);
        return anonymCallJoinContainer;
    }

    @Override // xsna.j8i
    public final void N0() {
        st2 st2Var = this.n;
        if (st2Var != null) {
            q2x0 q2x0Var = st2Var.s;
            if (q2x0Var != null) {
                s2x0 s2x0Var = q2x0Var.e;
                com.vk.core.tips.b bVar = s2x0Var.g;
                if (bVar != null) {
                    bVar.b(false);
                }
                s2x0Var.g = null;
                q2x0Var.d.d.dispose();
            }
            st2Var.A = null;
            AnonymCallJoinContainer anonymCallJoinContainer = st2Var.e;
            if (anonymCallJoinContainer == null) {
                return;
            }
            st2.a aVar = st2Var.r;
            if (aVar != null) {
                int i = ify.a;
                ify.g(aVar);
            }
            st2Var.r = null;
            anonymCallJoinContainer.removeCallbacks(new qt2(0, st2Var.w));
            AnonymCallJoinScrollView anonymCallJoinScrollView = st2Var.g;
            if (anonymCallJoinScrollView != null) {
                anonymCallJoinScrollView.removeCallbacks(st2Var.y);
            }
            st2Var.u.dispose();
        }
    }

    /* JADX WARN: Type inference failed for: r11v10, types: [T, xsna.dh6, xsna.dw20] */
    public final void X0(x89 x89Var) {
        boolean z;
        AnonymCallInviteFragment.a aVar;
        this.o = x89Var;
        if (x89Var instanceof x89.d) {
            st2 st2Var = this.n;
            if (st2Var != null) {
                View view = st2Var.n;
                if (view != null) {
                    bwt0.p0(view, true);
                }
                View view2 = st2Var.m;
                if (view2 != null) {
                    bwt0.p0(view2, false);
                }
                AnonymCallJoinContainer anonymCallJoinContainer = st2Var.e;
                if (anonymCallJoinContainer != null) {
                    anonymCallJoinContainer.requestLayout();
                }
                AnonymCallJoinScrollView anonymCallJoinScrollView = st2Var.g;
                if (anonymCallJoinScrollView != null) {
                    anonymCallJoinScrollView.postDelayed(st2Var.y, 300L);
                    return;
                }
                return;
            }
            return;
        }
        if (x89Var instanceof x89.a) {
            st2 st2Var2 = this.n;
            if (st2Var2 != null) {
                st2Var2.b(((x89.a) x89Var).a);
                return;
            }
            return;
        }
        if (!(x89Var instanceof x89.b)) {
            throw new NoWhenBranchMatchedException();
        }
        st2 st2Var3 = this.n;
        if (st2Var3 != null) {
            t89 t89Var = ((x89.b) x89Var).a;
            Context context = st2Var3.a;
            Context context2 = context;
            while (true) {
                z = context2 instanceof FragmentActivity;
                if (z || !(context2 instanceof ContextWrapper)) {
                    break;
                } else {
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
            FragmentActivity fragmentActivity = (FragmentActivity) (z ? (Activity) context2 : null);
            FragmentManager supportFragmentManager = fragmentActivity != null ? fragmentActivity.getSupportFragmentManager() : null;
            if (supportFragmentManager != null) {
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                View inflate = LayoutInflater.from(context).inflate(R.layout.voip_group_call_invite_error_state, (ViewGroup) null);
                bwt0.i0(inflate.findViewById(R.id.voip_call_invite_error_close_btn), new com.vk.newsfeed.posting.impl.presentation.base.fragment.a(ref$ObjectRef, 3));
                ((TextView) inflate.findViewById(R.id.voip_call_invite_error_title)).setText(t89Var.a);
                ((TextView) inflate.findViewById(R.id.voip_call_invite_error_message)).setText(t89Var.b);
                ?? a2 = new dw20.b(context, null).D0(inflate, false).a0(new com.vk.newsfeed.posting.mediapicker.photovk.base.a(st2Var3, 3)).a();
                ref$ObjectRef.element = a2;
                a2.Td(supportFragmentManager, null);
                return;
            }
            a aVar2 = st2Var3.A;
            if (aVar2 == null || (aVar = pt2.this.q) == null) {
                return;
            }
            AnonymCallInviteFragment anonymCallInviteFragment = AnonymCallInviteFragment.this;
            c1w0 c1w0Var = wwf0.g;
            (c1w0Var != null ? c1w0Var : null).c.getClass();
            Intent intent = new Intent();
            intent.putExtra("error_string_res_id", t89Var.a);
            intent.putExtra("error_details_string_res_id", t89Var.b);
            anonymCallInviteFragment.Mf(0, intent);
        }
    }

    public final void Y0(String str, s89 s89Var, boolean z) {
        I0(hg1.n(this.j.b(s89Var, str), this.i, false, null, 62).subscribe(new tz(new mt2(this, z), 2), new c40(new nt2(this, s89Var, z, str), 4)));
    }

    public final void Z0(lt2 lt2Var) {
        I0(io.reactivex.rxjava3.kotlin.c.e(new io.reactivex.rxjava3.internal.operators.single.n(this.j.c(this.l), new qz(new pz(this, 4), 3)).m(asu0.a.d()), new h5(this, 6), new tn0(2, this, lt2Var)));
    }
}
