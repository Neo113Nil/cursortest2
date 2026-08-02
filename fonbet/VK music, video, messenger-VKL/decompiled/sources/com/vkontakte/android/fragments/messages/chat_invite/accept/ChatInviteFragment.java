package com.vkontakte.android.fragments.messages.chat_invite.accept;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.core.apps.BuildInfo;
import com.vk.core.fragments.BaseFragment;
import com.vk.im.engine.models.chats.ChatPreview;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.operators.single.n;
import java.util.concurrent.TimeUnit;
import xsna.a1w;
import xsna.anj;
import xsna.bsb;
import xsna.csb;
import xsna.d4;
import xsna.dg;
import xsna.dhr0;
import xsna.dsb;
import xsna.f60;
import xsna.fpf0;
import xsna.fsb;
import xsna.g2v;
import xsna.h20;
import xsna.hf8;
import xsna.i2w;
import xsna.iah0;
import xsna.ies;
import xsna.isb;
import xsna.j8z;
import xsna.m20;
import xsna.m7m;
import xsna.o0w;
import xsna.oz50;
import xsna.q1w;
import xsna.rsr;
import xsna.st0;
import xsna.wzb;
import xsna.y50;
import xsna.yp80;
import xsna.zx;

/* compiled from: ChatInviteFragment.kt */
/* loaded from: classes7.dex */
public final class ChatInviteFragment extends BaseFragment implements ies {
    public static final c T = new c();
    public bsb S;

    /* compiled from: ChatInviteFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: ChatInviteFragment.kt */
    public final class b {
        public b() {
        }

        public final void a(long j) {
            c cVar = ChatInviteFragment.T;
            c.a(j, ChatInviteFragment.this.getActivity());
        }

        public final void b() {
            ChatInviteFragment.this.finish();
        }
    }

    /* compiled from: ChatInviteFragment.kt */
    public static final class c {
        public static void a(long j, Context context) {
            o0w.x(g2v.c().b(), context, null, j + 2000000000, null, null, null, false, null, null, null, null, null, null, "chat_invite", null, null, null, false, null, null, null, null, null, 1073733626);
        }

        public static void c(Context context, String str, String str2, Uri uri, boolean z, ChatPreview chatPreview) {
            rsr rsrVar = oz50.k;
            if (rsrVar == null) {
                rsrVar = null;
            }
            rsrVar.getClass();
            a aVar = new a(ChatInviteFragment.class, ChatInviteActivity.class, null);
            aVar.s(true);
            aVar.x();
            aVar.w(BuildInfo.t() ? R.style.VkIm_Theme_ImChatInvite : R.style.VkIm_Theme_ChatInvite);
            String uri2 = uri.toString();
            Bundle bundle = aVar.j;
            bundle.putString("link", uri2);
            bundle.putParcelable("chat_preview", chatPreview);
            bundle.putBoolean("is_already_in_chat", z);
            if (str != null) {
                bundle.putString("ref", str);
            }
            if (str2 != null) {
                bundle.putString("refSource", str2);
            }
            aVar.k(context);
        }

        public final void b(Context context, Uri uri, String str, String str2, yp80 yp80Var, boolean z) {
            wzb wzbVar = new wzb(uri, true, null);
            a1w a1wVar = q1w.a;
            (a1wVar != null ? a1wVar : null).C(this, wzbVar).r(500L, TimeUnit.MILLISECONDS).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new f60(new csb(context, uri, str, str2, yp80Var, z), 12), new com.vk.im.ui.components.dialogs_list.b(new dsb(context, uri, str, str2), 14));
        }
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        bsb bsbVar = this.S;
        if (bsbVar == null) {
            bsbVar = null;
        }
        bsbVar.Y0().b(new h20(bsbVar, 10));
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.y = false;
        this.z = false;
        setHasOptionsMenu(true);
        bsb bsbVar = new bsb(context, i2w.a(), ((AuthBridgeComponent) m7m.d(this).a(fpf0.a(AuthBridgeComponent.class))).s(), requireArguments().getString("link"), (ChatPreview) requireArguments().getParcelable("chat_preview"), requireArguments().getBoolean("is_already_in_chat"));
        this.S = bsbVar;
        bsbVar.o = new b();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        bsb bsbVar = this.S;
        if (bsbVar == null) {
            bsbVar = null;
        }
        dhr0.a.getClass();
        return bsbVar.E0(layoutInflater.cloneInContext(dhr0.E()), viewGroup, null, bundle);
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        bsb bsbVar = this.S;
        if (bsbVar == null) {
            bsbVar = null;
        }
        bsbVar.H0();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bsb bsbVar = this.S;
        if (bsbVar == null) {
            bsbVar = null;
        }
        bsbVar.P0(bundle);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        bsb bsbVar = this.S;
        if (bsbVar == null) {
            bsbVar = null;
        }
        if (bundle == null) {
            isb Y0 = bsbVar.Y0();
            Y0.getClass();
            ColorDrawable colorDrawable = new ColorDrawable(-16777216);
            colorDrawable.setAlpha(0);
            View view2 = Y0.d;
            if (view2 == null) {
                view2 = null;
            }
            view2.setBackground(colorDrawable);
            ValueAnimator duration = ValueAnimator.ofInt(0, 102).setDuration(200L);
            duration.setInterpolator(new j8z());
            duration.addUpdateListener(new fsb(colorDrawable, 0));
            duration.start();
            Y0.a(iah0.a(370), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new j8z(), new d4(6));
        } else {
            isb Y02 = bsbVar.Y0();
            Y02.getClass();
            ColorDrawable colorDrawable2 = new ColorDrawable(-16777216);
            colorDrawable2.setAlpha(102);
            View view3 = Y02.d;
            if (view3 == null) {
                view3 = null;
            }
            view3.setBackground(colorDrawable2);
        }
        anj.d(bsbVar.i, bsbVar.n, new IntentFilter("com.vkontakte.android.DONUT_SUBSCRIPTION_PAID"), hf8.a, 4);
        ChatPreview chatPreview = bsbVar.l.b;
        if (chatPreview.b.length() != 0 || !chatPreview.m.isEmpty()) {
            bsbVar.Z0();
        } else {
            bsbVar.I0(new n(bsbVar.j.E(bsbVar, new wzb(Uri.parse(bsbVar.l.a), false, null)), new y50(new dg(bsbVar, 16), 11)).subscribe(new st0(new zx(bsbVar, 19), 4), new m20(new com.vk.im.engine.internal.api_commands.messages.a(bsbVar, 13), 12)));
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        bsb bsbVar = this.S;
        if (bsbVar == null) {
            bsbVar = null;
        }
        bsbVar.O0(bundle);
    }
}
