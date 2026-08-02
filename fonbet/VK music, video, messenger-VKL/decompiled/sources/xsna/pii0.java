package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vk.dto.common.Peer;
import com.vk.lists.AbstractPaginatedView;
import com.vk.story.api.domain.interactor.upload.StoryMultiData;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import xsna.dw20;
import xsna.gm50;
import xsna.mk50;
import xsna.nii0;
import xsna.xn50;

/* compiled from: SendStoryUsersBottomSheet.kt */
/* loaded from: classes16.dex */
public final class pii0 extends tl50<tii0, fji0, nii0> implements w8i {
    public static final /* synthetic */ int q1 = 0;
    public final Context i1;
    public final g440 j1;
    public final i37 k1;
    public final clh l1;
    public final dlh m1;
    public final vg20 n1 = new vg20();
    public final Object o1;
    public final Object p1;

    /* compiled from: SendStoryUsersBottomSheet.kt */
    public static final class a extends dw20.b {
        public final pii0 e;

        public a(Context context, g440 g440Var, StoryMultiData storyMultiData, i37 i37Var, clh clhVar, dlh dlhVar) {
            super(context, null);
            pii0 pii0Var = new pii0(context, g440Var, i37Var, clhVar, dlhVar);
            pii0Var.setArguments(yfb.b(new Pair("STORY_MULTI_DATA", storyMultiData)));
            this.e = pii0Var;
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            c(new ts90(0.75f, 2));
            E0(true);
            s(m33.a(R.drawable.vk_icon_arrow_left_outline_28, this.c));
            t();
            v0(R.string.share_to_message);
            l(e3m.f(R.attr.vk_ui_background_content, this.c));
            return this.e;
        }
    }

    public pii0(Context context, g440 g440Var, i37 i37Var, clh clhVar, dlh dlhVar) {
        this.i1 = context;
        this.j1 = g440Var;
        this.k1 = i37Var;
        this.l1 = clhVar;
        this.m1 = dlhVar;
        qbc0 qbc0Var = new qbc0(this, 9);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.o1 = msy.a(lazyThreadSafetyMode, qbc0Var);
        this.p1 = msy.a(lazyThreadSafetyMode, new gqh0(this, 2));
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        VkRecyclerPaginatedView vkRecyclerPaginatedView = new VkRecyclerPaginatedView(this.i1, null, 6, 0);
        AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.LINEAR, vkRecyclerPaginatedView);
        dVar.f = 1;
        dVar.a();
        vkRecyclerPaginatedView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        vkRecyclerPaginatedView.setSwipeRefreshEnabled(false);
        return new mk50.c(vkRecyclerPaginatedView);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        xii0 xii0Var = new xii0(requireContext(), this.n1, new daz(16), getFeature().e, new ui(1, this, pii0.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 10), (gpj0) this.o1.getValue());
        aji0 aji0Var = new aji0(this, (VkRecyclerPaginatedView) view, xii0Var, (msj0) this.p1.getValue(), new q99(1, this, pii0.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 6));
        gm50.a.b(aji0Var, ((fji0) ao50Var).a, new aj50(aji0Var, 19));
        getFeature().g.a(new wz(this, xii0Var, aji0Var, 4), this);
        g440 g440Var = this.j1;
        if (g440Var != null) {
            this.i0 = new qii0(this, g440Var);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1212 && i2 == -1) {
            Peer peer = intent != null ? (Peer) intent.getParcelableExtra("dialog_id") : null;
            Peer peer2 = peer != null ? peer : null;
            if (peer2 != null) {
                xn50.a.c(this, new nii0.h(peer2.b));
            }
        }
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new tii0((StoryMultiData) bundle.getParcelable("STORY_MULTI_DATA"));
    }
}
