package xsna;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.vk.api.likes.LikesGetList;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Counters;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.user.ReactionUserProfile;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.lists.DefaultEmptyView;
import com.vk.reactions.fragments.ReactionsFragment;
import com.vkontakte.android.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.rtt;

/* compiled from: ReactionsPresenter.kt */
/* loaded from: classes5.dex */
public final class e6f0 implements h6f0 {
    public final ReactionsFragment b;
    public LikesGetList.Type d;
    public boolean e;
    public String f;
    public long h;
    public String i;
    public Counters j;
    public int k;
    public NewsEntry n;
    public boolean o;
    public Throwable p;
    public boolean t;
    public rtt u;
    public LikesGetList.Type c = LikesGetList.Type.POST;
    public UserId g = UserId.d;
    public boolean l = true;
    public boolean m = true;
    public final AtomicBoolean q = new AtomicBoolean(false);
    public final AtomicBoolean r = new AtomicBoolean(true);
    public final io.reactivex.rxjava3.subjects.g<Boolean> s = io.reactivex.rxjava3.subjects.g.N0();
    public final bpn0 v = new bpn0(new dgc0(4));

    /* compiled from: ReactionsPresenter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LikesGetList.Type.values().length];
            try {
                iArr[LikesGetList.Type.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: ReactionsPresenter.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((com.vk.metrics.eventtracking.b) this.receiver).a(th);
            return s3q0.a;
        }
    }

    public e6f0(ReactionsFragment reactionsFragment) {
        this.b = reactionsFragment;
    }

    @Override // xsna.h6f0
    public final void E(View view) {
        this.b.mo(view);
    }

    public final void F(Bundle bundle) {
        int i;
        Post post;
        if (bundle == null) {
            return;
        }
        UserId userId = (UserId) bundle.getParcelable("owner_id");
        if (userId == null) {
            userId = UserId.d;
        }
        this.g = userId;
        this.h = bundle.getLong("item_id", this.h);
        Serializable serializable = bundle.getSerializable("ltype");
        LikesGetList.Type type = serializable instanceof LikesGetList.Type ? (LikesGetList.Type) serializable : null;
        if (type == null) {
            type = this.c;
        }
        this.c = type;
        Serializable serializable2 = bundle.getSerializable("lptype");
        this.d = serializable2 instanceof LikesGetList.Type ? (LikesGetList.Type) serializable2 : null;
        String string = bundle.getString("filter");
        if (string == null) {
            string = this.f;
        }
        this.f = string;
        this.e = bundle.getBoolean("friends_only", this.e);
        this.k = bundle.getInt("tab", this.k);
        this.l = bundle.getBoolean("shares_available", this.l);
        this.m = bundle.getBoolean("friends_available", this.m);
        NewsEntry newsEntry = (NewsEntry) bundle.getParcelable("news_entry");
        if (newsEntry == null) {
            newsEntry = null;
        } else if (newsEntry instanceof Post) {
            Serializer.c<Post> cVar = Post.CREATOR;
            newsEntry = Post.a.b((Post) newsEntry);
        } else if (newsEntry instanceof PromoPost) {
            PromoPost promoPost = (PromoPost) newsEntry;
            Serializer.c<Post> cVar2 = Post.CREATOR;
            PromoPost Eb = PromoPost.Eb(promoPost, Post.a.b(promoPost.n));
            Eb.c = newsEntry.c;
            Eb.g = newsEntry.g;
            Eb.h = newsEntry.h;
            newsEntry = Eb;
        }
        this.n = newsEntry;
        Parcelable parcelable = bundle.getParcelable("counters");
        Counters counters = parcelable instanceof Counters ? (Counters) parcelable : null;
        if (counters == null) {
            NewsEntry newsEntry2 = this.n;
            Post post2 = newsEntry2 instanceof Post ? (Post) newsEntry2 : null;
            Counters counters2 = post2 != null ? post2.E : null;
            if (counters2 == null) {
                PromoPost promoPost2 = newsEntry2 instanceof PromoPost ? (PromoPost) newsEntry2 : null;
                counters = (promoPost2 == null || (post = promoPost2.n) == null) ? null : post.E;
            } else {
                counters = counters2;
            }
        }
        this.j = counters;
        if (counters != null && (i = counters.g) > 0) {
            this.i = y8g0.c(a.$EnumSwitchMapping$0[this.c.ordinal()] == 1 ? R.plurals.newsfeed_msg_video_shared_count : R.plurals.newsfeed_msg_post_shared_count, i);
        }
        boolean containsKey = bundle.containsKey("title");
        ReactionsFragment reactionsFragment = this.b;
        reactionsFragment.setTitle(containsKey ? bundle.getString("title") : reactionsFragment.getString(R.string.reactions_title));
        Parcelable parcelable2 = this.n;
        o2f0 o2f0Var = parcelable2 instanceof o2f0 ? (o2f0) parcelable2 : null;
        if (o2f0Var != null) {
            reactionsFragment.Fg(o2f0Var.s4(), o2f0Var.K());
        }
    }

    @Override // xsna.h6f0
    public final void L() {
        io.reactivex.rxjava3.disposables.c g = g();
        if (g != null) {
            this.b.eo(g);
        }
    }

    @Override // xsna.h6f0
    public final void N4(int i, String str, boolean z) {
        i990 g;
        ReactionsFragment reactionsFragment = this.b;
        HashMap<String, Integer> hashMap = reactionsFragment.f0;
        if (epx.f(str, "shares")) {
            Counters counters = this.j;
            i += counters != null ? counters.g : 0;
        }
        if (i > 0 || z) {
            String ko = reactionsFragment.ko(i, str);
            hashMap.put(str, Integer.valueOf(i));
            r6f0 r6f0Var = reactionsFragment.e0;
            if (r6f0Var == null || (g = r6f0Var.g(str)) == null || epx.f(g.d, ko)) {
                return;
            }
            g.d = ko;
            r6f0Var.notifyDataSetChanged();
            return;
        }
        hashMap.remove(str);
        r6f0 r6f0Var2 = reactionsFragment.e0;
        if (r6f0Var2 != null) {
            Iterator<i990> it = r6f0Var2.k.iterator();
            while (it.hasNext()) {
                if (epx.f(it.next().a, str)) {
                    it.remove();
                }
            }
            r6f0Var2.notifyDataSetChanged();
        }
    }

    @Override // xsna.gm6
    public final boolean a0() {
        return false;
    }

    public final void b() {
        rtt.a aVar;
        boolean z = this.o;
        ReactionsFragment reactionsFragment = this.b;
        if (z) {
            Throwable th = this.p;
            vid vidVar = reactionsFragment.c0;
            if (vidVar != null) {
                ReactionsFragment.b bVar = reactionsFragment.d0;
                View view = (View) vidVar.c;
                TextView textView = (TextView) vidVar.b;
                if (bVar != null) {
                    by2 c = bVar.c(th);
                    textView.setText(c.a);
                    bwt0.p0(view, c.b);
                } else {
                    textView.setText(R.string.liblists_err_text);
                    bwt0.p0(view, true);
                }
                bwt0.p0((View) vidVar.a, true);
            }
            ProgressBar progressBar = reactionsFragment.Y;
            if (progressBar != null) {
                bwt0.p0(progressBar, false);
            }
            ViewPager viewPager = reactionsFragment.W;
            if (viewPager != null) {
                bwt0.p0(viewPager, false);
            }
            DefaultEmptyView defaultEmptyView = reactionsFragment.Z;
            if (defaultEmptyView != null) {
                bwt0.p0(defaultEmptyView, false);
                return;
            }
            return;
        }
        if (this.t) {
            ProgressBar progressBar2 = reactionsFragment.Y;
            if (progressBar2 != null) {
                bwt0.p0(progressBar2, true);
            }
            vid vidVar2 = reactionsFragment.c0;
            if (vidVar2 != null) {
                vidVar2.a();
            }
            ViewPager viewPager2 = reactionsFragment.W;
            if (viewPager2 != null) {
                bwt0.p0(viewPager2, false);
            }
            DefaultEmptyView defaultEmptyView2 = reactionsFragment.Z;
            if (defaultEmptyView2 != null) {
                bwt0.p0(defaultEmptyView2, false);
                return;
            }
            return;
        }
        rtt rttVar = this.u;
        if (rttVar == null || rttVar.a.a.isEmpty()) {
            rtt rttVar2 = this.u;
            VKList<ReactionUserProfile> vKList = (rttVar2 == null || (aVar = rttVar2.c) == null) ? null : aVar.a;
            if (vKList == null || vKList.isEmpty()) {
                vid vidVar3 = reactionsFragment.c0;
                if (vidVar3 != null) {
                    vidVar3.a();
                }
                ProgressBar progressBar3 = reactionsFragment.Y;
                if (progressBar3 != null) {
                    bwt0.p0(progressBar3, false);
                }
                ViewPager viewPager3 = reactionsFragment.W;
                if (viewPager3 != null) {
                    bwt0.p0(viewPager3, false);
                }
                DefaultEmptyView defaultEmptyView3 = reactionsFragment.Z;
                if (defaultEmptyView3 != null) {
                    bwt0.p0(defaultEmptyView3, true);
                    return;
                }
                return;
            }
        }
        vid vidVar4 = reactionsFragment.c0;
        if (vidVar4 != null) {
            vidVar4.a();
        }
        ProgressBar progressBar4 = reactionsFragment.Y;
        if (progressBar4 != null) {
            bwt0.p0(progressBar4, false);
        }
        ViewPager viewPager4 = reactionsFragment.W;
        if (viewPager4 != null) {
            bwt0.p0(viewPager4, true);
        }
        DefaultEmptyView defaultEmptyView4 = reactionsFragment.Z;
        if (defaultEmptyView4 != null) {
            bwt0.p0(defaultEmptyView4, false);
        }
    }

    public final io.reactivex.rxjava3.disposables.c g() {
        io.reactivex.rxjava3.internal.operators.observable.m1 T;
        if (this.t) {
            return null;
        }
        this.t = true;
        b();
        List<String> list = utt.a;
        rsg0 a2 = utt.a(this.c, this.d, this.g, this.h, ((Number) this.v.getValue()).intValue(), this.f, this.e, this.m && o25.a().b(), 5, this.l, 5);
        if (!o25.a().b()) {
            a2.d = true;
            a2.c = true;
        }
        if (this.q.getAndSet(false)) {
            io.reactivex.rxjava3.core.q I0 = io.reactivex.rxjava3.core.q.I0(rsg0.T(a2), new io.reactivex.rxjava3.internal.operators.observable.p1(this.s.y0(500L, TimeUnit.MILLISECONDS), new nr(new kpr(22), 27)), new or(new vv7(8)));
            asu0 asu0Var = asu0.a;
            asu0Var.getClass();
            T = I0.r0(asu0.r()).a0(asu0Var.c());
        } else {
            T = rsg0.T(a2);
        }
        int i = 21;
        io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.observable.a0(new io.reactivex.rxjava3.internal.operators.observable.z(T.a0(io.reactivex.rxjava3.android.schedulers.a.b()), new lkz(new xd40(this, 14), 16)).C(new sbb(this, 5)).F(new pdw(new bnc0(this, 3), i)), new u00(this, 6)).subscribe(new lw30(new rxz(this, i), 11), new qw40(new b(1, com.vk.metrics.eventtracking.b.a, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0), 10));
        this.b.eo(subscribe);
        return subscribe;
    }

    @Override // xsna.gm6
    public final void d() {
    }

    @Override // xsna.cc6
    public final void onDestroy() {
    }

    @Override // xsna.gm6
    public final void onDestroyView() {
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
}
