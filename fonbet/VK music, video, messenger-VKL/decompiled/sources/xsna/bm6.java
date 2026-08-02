package xsna;

import android.os.Bundle;
import android.view.View;
import com.vk.api.likes.LikesGetList;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.dto.user.ReactionUserProfile;
import com.vk.lists.ListDataSet;
import com.vk.lists.c;
import com.vk.reactions.fragments.BaseReactionsTabFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.gl.tf.Tensorflow;
import xsna.g6f0;
import xsna.rtt;

/* compiled from: BaseReactionsTabPresenter.kt */
/* loaded from: classes5.dex */
public class bm6 implements u6f0, c.l<VKList<ReactionUserProfile>> {
    public final BaseReactionsTabFragment b;
    public final ListDataSet<g6f0> c = new ListDataSet<>();
    public final Set<UserId> d = Collections.synchronizedSet(new LinkedHashSet());
    public com.vk.lists.c e;
    public LikesGetList.Type f;
    public String g;
    public UserId h;
    public long i;
    public String j;
    public boolean k;
    public LikesGetList.Type l;
    public boolean m;
    public h6f0 n;
    public String o;
    public VKList p;
    public int q;
    public int r;
    public final zl6 s;
    public final bpn0 t;

    /* compiled from: BaseReactionsTabPresenter.kt */
    public static final class a {
        public final ArrayList<g6f0> a;
        public final VKList<ReactionUserProfile> b;
        public final boolean c;
        public final boolean d;

        public a(ArrayList<g6f0> arrayList, VKList<ReactionUserProfile> vKList, boolean z, boolean z2) {
            this.a = arrayList;
            this.b = vKList;
            this.c = z;
            this.d = z2;
        }
    }

    /* compiled from: BaseReactionsTabPresenter.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((com.vk.metrics.eventtracking.b) this.receiver).a(th);
            return s3q0.a;
        }
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [xsna.zl6] */
    public bm6(BaseReactionsTabFragment baseReactionsTabFragment) {
        this.b = baseReactionsTabFragment;
        LikesGetList.Type type = LikesGetList.Type.POST;
        this.f = type;
        this.h = UserId.d;
        this.l = type;
        this.s = new s0d0() { // from class: xsna.zl6
            @Override // xsna.s0d0
            public final u0d0 a(int i) {
                ImageSize Cb;
                g6f0 c = bm6.this.c.c(i);
                if (c != null && (c instanceof g6f0.b)) {
                    ReactionUserProfile reactionUserProfile = ((g6f0.b) c).a;
                    ReactionMeta reactionMeta = reactionUserProfile.h0;
                    if (reactionMeta != null) {
                        reactionMeta.e(x0f0.u);
                    }
                    Image image = reactionUserProfile.O;
                    if (image != null && (Cb = image.Cb(x0f0.t, true, false)) != null) {
                        String str = Cb.d.d;
                    }
                }
                return u0d0.a;
            }
        };
        this.t = new bpn0(new vg0(1));
    }

    public static ArrayList b(Set set, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ReactionUserProfile reactionUserProfile = (ReactionUserProfile) it.next();
            if (set.add(reactionUserProfile.c)) {
                arrayList.add(new g6f0.b(reactionUserProfile));
            }
        }
        return arrayList;
    }

    @Override // xsna.u6f0
    public final void E(View view) {
        h6f0 h6f0Var = this.n;
        if (h6f0Var != null) {
            h6f0Var.E(view);
        }
    }

    @Override // xsna.u6f0
    public void F(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.o = bundle.getString("title_message", this.o);
        UserId userId = (UserId) bundle.getParcelable("owner_id");
        if (userId == null) {
            userId = UserId.d;
        }
        this.h = userId;
        this.i = bundle.getLong("item_id", this.i);
        Serializable serializable = bundle.getSerializable("ltype");
        LikesGetList.Type type = serializable instanceof LikesGetList.Type ? (LikesGetList.Type) serializable : null;
        if (type == null) {
            type = this.f;
        }
        this.f = type;
        Serializable serializable2 = bundle.getSerializable("lptype");
        LikesGetList.Type type2 = serializable2 instanceof LikesGetList.Type ? (LikesGetList.Type) serializable2 : null;
        if (type2 == null) {
            type2 = this.l;
        }
        this.l = type2;
        this.g = bundle.getString("filter", this.g);
        this.m = bundle.getBoolean("friends_only", this.m);
        this.j = bundle.getString("fragment_id", this.j);
        this.k = bundle.getBoolean("friends_only", this.k);
    }

    @Override // xsna.gm6
    public final boolean a0() {
        return false;
    }

    @Override // xsna.u6f0
    public final void a2(h6f0 h6f0Var) {
        this.n = h6f0Var;
    }

    @Override // xsna.u6f0
    public final void c4() {
        this.p = null;
        this.q = 0;
        this.r = 0;
        com.vk.lists.c cVar = this.e;
        if (cVar != null) {
            cVar.q(0);
        }
        com.vk.lists.c cVar2 = this.e;
        if (cVar2 != null) {
            cVar2.r(false);
        }
        this.d.clear();
        this.c.clear();
    }

    @Override // xsna.gm6
    public final void d() {
        com.vk.lists.c cVar = this.e;
        BaseReactionsTabFragment baseReactionsTabFragment = this.b;
        if (cVar == null) {
            c.h hVar = new c.h(this);
            hVar.i = ((Number) this.t.getValue()).intValue();
            boolean z = false;
            hVar.q = false;
            hVar.s = 4;
            hVar.l = false;
            hVar.t = this.s;
            VKList vKList = this.p;
            int i = this.q;
            if (vKList != null) {
                hVar.k = String.valueOf(i);
                Set<UserId> set = this.d;
                set.clear();
                this.c.setItems(b(set, vKList));
            }
            hVar.f = baseReactionsTabFragment.getAdapter();
            com.vk.lists.c a2 = com.vk.lists.f.a(hVar, baseReactionsTabFragment.T);
            this.e = a2;
            VKList vKList2 = this.p;
            int i2 = this.q;
            int i3 = this.r;
            if (vKList2 != null) {
                a2.q(i2);
                com.vk.lists.c cVar2 = this.e;
                String j = cVar2 != null ? cVar2.j() : null;
                if (cVar2 != null) {
                    if (j != null && cVar2.i() < i3 && !vKList2.isEmpty()) {
                        z = true;
                    }
                    cVar2.r(z);
                }
            }
        } else {
            cVar.b(baseReactionsTabFragment.T, false, false, 0L, null);
        }
        baseReactionsTabFragment.lo(this.o);
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<VKList<ReactionUserProfile>> hj(com.vk.lists.c cVar, boolean z) {
        cVar.r(true);
        cVar.q(0);
        return ui(0, cVar);
    }

    @Override // xsna.u6f0
    public final void j5(rtt.a aVar) {
        VKList vKList;
        this.p = aVar.a;
        int i = aVar.b;
        this.q = i;
        int i2 = aVar.c;
        this.r = i2;
        com.vk.lists.c cVar = this.e;
        if (cVar != null) {
            cVar.q(i);
            cVar.r((cVar.j() == null || cVar.i() >= i2 || (vKList = this.p) == null || vKList.isEmpty()) ? false : true);
        }
        Set<UserId> set = this.d;
        set.clear();
        VKList vKList2 = this.p;
        this.c.setItems(vKList2 != null ? b(set, vKList2) : new ArrayList());
    }

    @Override // xsna.gm6
    public final void onDestroyView() {
        com.vk.lists.c cVar = this.e;
        if (cVar != null) {
            cVar.v();
        }
    }

    @Override // com.vk.lists.c.l
    public io.reactivex.rxjava3.core.q<VKList<ReactionUserProfile>> ui(int i, com.vk.lists.c cVar) {
        return rsg0.T(new LikesGetList(this.f, this.l, this.h, this.i, i, cVar.k(), this.m, this.g, null, Tensorflow.FRAME_HEIGHT));
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<VKList<ReactionUserProfile>> qVar, boolean z, com.vk.lists.c cVar) {
        this.b.eo(qVar.U(new bl(new am6(z, cVar, this, 0), 6)).a0(asu0.a.d()).subscribe(new um0(new jy(this, 12), 6), new eu0(new b(1, com.vk.metrics.eventtracking.b.a, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0), 4)));
    }

    @Override // xsna.u6f0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        if (!epx.f(this.g, "copies")) {
            if (!this.m) {
                switch (t6f0.$EnumSwitchMapping$0[this.f.ordinal()]) {
                    case 1:
                        mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.LIKES_LIST_PHOTO;
                        break;
                    case 2:
                        mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.LIKES_LIST_VIDEO;
                        break;
                    case 3:
                        mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.LIKES_LIST_NOTE;
                        break;
                    case 4:
                        mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.LIKES_LIST_TOPIC;
                        break;
                    case 5:
                        mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.LIKES_LIST_MARKET;
                        break;
                    case 6:
                        mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.LIKES_LIST_COMMENT;
                        break;
                    case 7:
                        mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.LIKES_LIST_POST_ADS;
                        break;
                    default:
                        mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.POST_LIKES_LIST;
                        break;
                }
            } else {
                switch (t6f0.$EnumSwitchMapping$0[this.f.ordinal()]) {
                    case 1:
                        mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.LIKES_FRIENDS_PHOTO;
                        break;
                    case 2:
                        mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.LIKES_FRIENDS_VIDEO;
                        break;
                    case 3:
                        mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.LIKES_FRIENDS_NOTE;
                        break;
                    case 4:
                        mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.LIKES_FRIENDS_TOPIC;
                        break;
                    case 5:
                        mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.LIKES_FRIENDS_MARKET;
                        break;
                    case 6:
                        mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.LIKES_FRIENDS_COMMENT;
                        break;
                    case 7:
                        mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.LIKES_FRIENDS_POST_ADS;
                        break;
                    default:
                        mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.POST_LIKES_FRIENDS;
                        break;
                }
            }
        } else {
            switch (t6f0.$EnumSwitchMapping$0[this.f.ordinal()]) {
                case 1:
                    mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.LIKES_COPIES_PHOTO;
                    break;
                case 2:
                    mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.LIKES_COPIES_VIDEO;
                    break;
                case 3:
                    mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.LIKES_COPIES_NOTE;
                    break;
                case 4:
                    mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.LIKES_COPIES_TOPIC;
                    break;
                case 5:
                    mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.LIKES_COPIES_MARKET;
                    break;
                case 6:
                    mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.LIKES_COPIES_COMMENT;
                    break;
                case 7:
                    mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.LIKES_COPIES_POST_ADS;
                    break;
                default:
                    mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.POST_COPIES_LIST;
                    break;
            }
        }
        uiTrackingScreen.a = mobileOfficialAppsCoreNavStat$EventScreen;
    }

    @Override // xsna.cc6
    public final void onDestroy() {
    }

    @Override // xsna.cc6
    public final void onPause() {
    }

    @Override // xsna.cc6
    public final void onResume() {
    }

    @Override // xsna.gm6
    public final void onStart() {
    }

    @Override // xsna.gm6
    public final void onStop() {
    }

    @Override // xsna.u6f0
    public void F0(Integer num, Integer num2) {
    }
}
