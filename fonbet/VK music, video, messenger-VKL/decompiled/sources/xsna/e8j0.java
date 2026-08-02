package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.base.VkPaginationList;
import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vk.camera.editor.stories.impl.onlinebooking.MarketOnlineBookingValuesWrapper;
import com.vk.dto.common.id.UserId;
import com.vk.story.api.domain.interactor.upload.StoryMultiData;
import com.vk.story.api.media.StoryMediaData;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.dw20;
import xsna.gm50;
import xsna.l8j0;
import xsna.mk50;

/* compiled from: ShareStoryBottomSheet.kt */
/* loaded from: classes16.dex */
public final class e8j0 extends tl50<l8j0, e9j0, x7j0> implements too0 {
    public fqd A1;
    public final Context i1;
    public final y440 j1;
    public final String k1;
    public final r1m0 l1;
    public final ofo m1;
    public final c8j0 n1;
    public final d8j0 o1;
    public final s1m0 p1;
    public final a2m0 q1;
    public final bpn0 r1 = new bpn0(new jaa0(this, 13));
    public final bpn0 s1 = new bpn0(new b990(this, 14));
    public final bpn0 t1 = new bpn0(new tu80(this, 22));
    public final bpn0 u1 = new bpn0(new dj60(this, 23));
    public final bpn0 v1 = new bpn0(new bi80(this, 18));
    public final Object w1 = msy.a(LazyThreadSafetyMode.NONE, new wmd0(this, 6));
    public final bpn0 x1 = new bpn0(new a8j0(0));
    public androidx.appcompat.app.d y1;
    public r8j0 z1;

    /* compiled from: ShareStoryBottomSheet.kt */
    public static final class a extends dw20.b {
        public final e8j0 e;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(UserId userId, y440 y440Var, StoryMultiData storyMultiData, u76 u76Var, String str, r1m0 r1m0Var, ofo ofoVar, a2m0 a2m0Var, s1m0 s1m0Var) {
            super(new l7s(r1, dhr0.u().c), null);
            Context requireContext = y440Var.getRequireContext();
            dhr0.a.getClass();
            e8j0 e8j0Var = new e8j0(this.c, y440Var, str, r1m0Var, ofoVar, new c8j0(1, u76Var, u76.class, "onOpenPrivacy", "onOpenPrivacy(Lkotlin/jvm/functions/Function1;)V", 0), new d8j0(1, y440Var, g440.class, "openLifetimeSelector", "openLifetimeSelector(Lkotlin/jvm/functions/Function1;)V", 0), s1m0Var, a2m0Var);
            e8j0Var.setArguments(yfb.b(new Pair("OWNER_ID", userId), new Pair("STORY_MULTI_DATA", storyMultiData), new Pair("HAS_GROUPS", u76Var.t6()), new Pair("PRIVACY", u76Var.getPrivacy()), new Pair("LIFETIME", Integer.valueOf(u76Var.Y6().c)), new Pair("NEED_SET_PRIVACY", Boolean.valueOf(u76Var.s6())), new Pair("MARKET_ONLINE_BOOKING_VALUES", new MarketOnlineBookingValuesWrapper(u76Var.j6()))));
            this.e = e8j0Var;
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            E0(true);
            r();
            c(new ts90(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3));
            v0(R.string.share);
            l(e3m.f(R.attr.vk_ui_background_content, this.c));
            return this.e;
        }
    }

    public e8j0(Context context, y440 y440Var, String str, r1m0 r1m0Var, ofo ofoVar, c8j0 c8j0Var, d8j0 d8j0Var, s1m0 s1m0Var, a2m0 a2m0Var) {
        this.i1 = context;
        this.j1 = y440Var;
        this.k1 = str;
        this.l1 = r1m0Var;
        this.m1 = ofoVar;
        this.n1 = c8j0Var;
        this.o1 = d8j0Var;
        this.p1 = s1m0Var;
        this.q1 = a2m0Var;
    }

    public static boolean bo(TextView textView, MotionEvent motionEvent, int i, int i2) {
        textView.setPressed(bwt0.C(textView).contains(i, i2) && motionEvent.getAction() == 0);
        if (!bwt0.C(textView).contains(i, i2) || motionEvent.getAction() != 1) {
            return false;
        }
        textView.callOnClick();
        return true;
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        Context context = this.i1;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R.id.recycler);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.e0 = new jgj(recyclerView, 0, 0, 62);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(recyclerView);
        return new mk50.c(frameLayout);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        VkPaginationList vkPaginationList;
        e9j0 e9j0Var = (e9j0) ao50Var;
        r8j0 r8j0Var = new r8j0(this.i1);
        r8j0Var.setPrivacyClickListener(new hn2(this, 11));
        r8j0Var.setLifetimeClickListener(new pi6(this, 3));
        this.z1 = r8j0Var;
        lxs lxsVar = new lxs(new ArrayList(), new Ref$ObjectRef(), this, view, 2);
        n8j0 n8j0Var = new n8j0(new lbc0(this, 14), (vu50) this.r1.getValue(), new b810(this, 26), new com.vk.movika.tools.controls.seekbar.t(lxsVar, 13), getFeature().e);
        d9j0 d9j0Var = new d9j0(new ux40(this, 27), new com.vk.movika.tools.controls.seekbar.v(lxsVar, 13), (xqu) this.x1.getValue(), getFeature().e);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler);
        r8j0 r8j0Var2 = this.z1;
        n8 n8Var = new n8(1, this, e8j0.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 9);
        gpj0 gpj0Var = (gpj0) this.u1.getValue();
        Bundle arguments = getArguments();
        if (arguments == null || (vkPaginationList = (VkPaginationList) arguments.getParcelable("HAS_GROUPS")) == null) {
            vkPaginationList = new VkPaginationList(null, 0, false, 0, 15, null);
        }
        w8j0 w8j0Var = new w8j0(this, r8j0Var2, recyclerView, n8j0Var, d9j0Var, gpj0Var, n8Var, vkPaginationList);
        gm50.a.b(w8j0Var, e9j0Var.a, new nl30(w8j0Var, 24));
        getFeature().m.a(new o8(1, this, e8j0.class, "observeSideEffect", "observeSideEffect(Lcom/vk/camera/editor/stories/impl/share/mvi/ShareStorySideEffect;)V", 0, 11), this);
        final y440 y440Var = this.j1;
        if (y440Var != null) {
            this.i0 = new f8j0(y440Var, this, this.z1);
            this.c0 = new DialogInterface.OnDismissListener() { // from class: xsna.z7j0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    u76 presenter;
                    e8j0 e8j0Var = e8j0.this;
                    r8j0 r8j0Var3 = e8j0Var.z1;
                    y440 y440Var2 = e8j0Var.j1;
                    g440 g440Var = y440Var;
                    g440Var.n7(1.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    g440Var.setDecorationVisibility(true);
                    ((FrameLayout) g440Var.b()).removeView(r8j0Var3);
                    if (y440Var2 != null) {
                        y440Var2.K();
                    }
                    if (y440Var2 != null && (presenter = y440Var2.getPresenter()) != null) {
                        presenter.g3();
                    }
                    e8j0Var.p1.invoke();
                }
            };
        }
        this.b0 = new lk1(this, 10);
        this.a0 = new gib0(this, 9);
    }

    @Override // xsna.dw20, xsna.too0
    public final void Ng() {
        y440 y440Var = this.j1;
        if (y440Var != null) {
            awt0.i(y440Var, new u14(18, y440Var, this));
        }
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Map map;
        List<StoryMediaData> list;
        UserId userId = (UserId) bundle.getParcelable("OWNER_ID");
        if (userId == null) {
            userId = UserId.d;
        }
        StoryMultiData storyMultiData = (StoryMultiData) bundle.getParcelable("STORY_MULTI_DATA");
        VkPaginationList vkPaginationList = (VkPaginationList) bundle.getParcelable("HAS_GROUPS");
        if (vkPaginationList == null) {
            vkPaginationList = new VkPaginationList(null, 0, false, 0, 15, null);
        }
        MarketOnlineBookingValuesWrapper marketOnlineBookingValuesWrapper = (MarketOnlineBookingValuesWrapper) bundle.getParcelable("MARKET_ONLINE_BOOKING_VALUES");
        if (marketOnlineBookingValuesWrapper == null || (map = marketOnlineBookingValuesWrapper.b) == null) {
            map = jgp.b;
        }
        Map map2 = map;
        boolean c = fkq0.c(userId);
        bpn0 bpn0Var = this.u1;
        if (!c) {
            userId = ((gpj0) bpn0Var.getValue()).getUid();
        }
        UserId userId2 = userId;
        StoryPrivacyType storyPrivacyType = (StoryPrivacyType) bundle.getParcelable("PRIVACY");
        if (storyPrivacyType == null) {
            storyPrivacyType = StoryPrivacyType.ALL;
        }
        StoryPrivacyType storyPrivacyType2 = storyPrivacyType;
        int i = bundle.getInt("LIFETIME");
        boolean z = bundle.getBoolean("NEED_SET_PRIVACY");
        y440 y440Var = this.j1;
        if (y440Var != null) {
            y440Var.setMultiBackgroundVisibility(((storyMultiData == null || (list = storyMultiData.b) == null) ? 0 : list.size()) > 1);
        }
        if (y440Var != null) {
            y440Var.pauseVideo();
        }
        return new l8j0(new l8j0.a(userId2, storyPrivacyType2, i, z, vkPaginationList.b, map2, this.k1), (g9m0) this.v1.getValue(), (gpj0) bpn0Var.getValue(), (gu50) this.t1.getValue(), (hkm0) this.s1.getValue(), storyMultiData, (j6v) this.w1.getValue());
    }
}
