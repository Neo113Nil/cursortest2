package com.vkontakte.android.actionlinks.views.fragments.addpoll;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.vk.core.compose.component.semantics.b;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.id.UserId;
import com.vk.movika.sdk.base.observable.e;
import com.vk.poll.fragments.PollEditorFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.actionlinks.views.fragments.ItemsDialogWrapper;
import com.vkontakte.android.actionlinks.views.fragments.WrappedView;
import io.reactivex.rxjava3.subjects.f;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.cz;
import xsna.fn0;
import xsna.gko;
import xsna.hpb0;
import xsna.lrk;
import xsna.pu;
import xsna.tk5;
import xsna.tlo0;
import xsna.tq;
import xsna.xpj;

/* compiled from: AddPollView.kt */
/* loaded from: classes7.dex */
public final class AddPollView extends WrappedView implements xpj {
    public static final /* synthetic */ int R = 0;
    public fn0 P;
    public PollEditorFragment Q;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.collection_items_add_poll_fragment_view, viewGroup, false);
        ItemsDialogWrapper itemsDialogWrapper = this.N;
        if (itemsDialogWrapper != null) {
            itemsDialogWrapper.Q = new pu(this, 3);
            VkTopBar vkTopBar = itemsDialogWrapper.P;
            if (vkTopBar != null) {
                vkTopBar.setAfter(VkTopBar.a.C0875a.a(new VkTopBar.a.c.f(new gko(R.drawable.vk_icon_done_outline_28), tq.h(tlo0.Companion, R.string.done), null, null, null, b.a(null, new lrk(itemsDialogWrapper, 22), 3), 28), null, 6));
            }
        }
        return inflate;
    }

    @Override // com.vkontakte.android.actionlinks.views.fragments.WrappedView, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    @SuppressLint({"CheckResult"})
    public final void onViewCreated(View view, Bundle bundle) {
        UserId userId;
        super.onViewCreated(view, bundle);
        int i = PollEditorFragment.a.m;
        fn0 fn0Var = this.P;
        if (fn0Var == null || (userId = fn0Var.c) == null) {
            userId = UserId.d;
        }
        PollEditorFragment.a a = PollEditorFragment.a.C1520a.a(userId, SignalingProtocol.KEY_CAMERA);
        a.j.putBoolean("hideToolbar", true);
        this.Q = (PollEditorFragment) a.f();
        FragmentManager childFragmentManager = getChildFragmentManager();
        a b = tk5.b(childFragmentManager, childFragmentManager);
        b.f(R.id.collection_items_add_poll_fragment_holder, this.Q, null, 1);
        b.k(false);
        f fVar = new f();
        PollEditorFragment pollEditorFragment = this.Q;
        if (pollEditorFragment != null) {
            pollEditorFragment.V = fVar;
            hpb0 hpb0Var = pollEditorFragment.S;
            if (hpb0Var != null) {
                hpb0Var.P = fVar;
            }
        }
        int i2 = 2;
        fVar.subscribe(new cz(new e(this, i2), i2));
    }
}
