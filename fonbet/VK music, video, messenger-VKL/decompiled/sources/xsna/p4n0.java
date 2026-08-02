package xsna;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.core.serialize.Serializer;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.user.UserProfile;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.presentation.suggested.presentation.feature.task_executors.SuggestedPostsMviExternalEventsTaskExecutor$receiver$1;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import xsna.a5n0;
import xsna.awg0;
import xsna.epx;
import xsna.jm50;
import xsna.n4n0;
import xsna.p4n0;
import xsna.qn60;
import xsna.qr60;
import xsna.zou;

/* compiled from: SuggestedPostsMviExternalEventsTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class p4n0 extends evg0<v4n0, on50, a5n0.a, a5n0, t4n0, n4n0> {
    public final qn60 f;
    public final pn60 g;
    public final Lazy h;
    public final jq60 i;
    public final a j;
    public final c k;
    public final b l;
    public final SuggestedPostsMviExternalEventsTaskExecutor$receiver$1 m;

    /* compiled from: SuggestedPostsMviExternalEventsTaskExecutor.kt */
    public static final class a implements bd70<Bundle> {
        public final m8 b;

        public a(m8 m8Var) {
            this.b = m8Var;
        }

        @Override // xsna.bd70
        public final void x0(int i, int i2, Bundle bundle) {
            Long e;
            Bundle bundle2 = bundle;
            if (epx.f(bundle2 != null ? bundle2.getString("type") : null, "wall") && (e = bo8.e(bundle2, "item_id")) != null) {
                this.b.invoke(new a5n0.a.e((int) e.longValue()));
            }
        }
    }

    /* compiled from: SuggestedPostsMviExternalEventsTaskExecutor.kt */
    public final class b implements bd70<NewsEntry> {
        public b() {
        }

        @Override // xsna.bd70
        public final void x0(int i, int i2, NewsEntry newsEntry) {
            Post R;
            NewsEntry newsEntry2 = newsEntry;
            if (i != 155 || (R = di60.R(newsEntry2)) == null) {
                return;
            }
            p4n0.this.a(new a5n0.a.f(R));
        }
    }

    /* compiled from: SuggestedPostsMviExternalEventsTaskExecutor.kt */
    public static final class c implements bd70<NewsEntry> {
        public final o8 b;

        public c(o8 o8Var) {
            this.b = o8Var;
        }

        @Override // xsna.bd70
        public final void x0(int i, int i2, NewsEntry newsEntry) {
            Post R = di60.R(newsEntry);
            if (R == null) {
                return;
            }
            this.b.invoke(new a5n0.a.d(R));
        }
    }

    public p4n0() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.vk.newsfeed.impl.presentation.suggested.presentation.feature.task_executors.SuggestedPostsMviExternalEventsTaskExecutor$receiver$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p4n0(es60 es60Var, lvc0 lvc0Var, nn50 nn50Var) {
        super(r8, nn50Var);
        jm50.a aVar = jm50.a.a;
        this.f = es60Var.a;
        this.g = es60Var.b;
        Lazy<NewsFeedComponent> lazy = es60Var.e;
        this.h = lazy;
        this.i = new jq60(es60Var.d, lazy, es60Var.l, es60Var.h, aVar, new eht(this, lvc0Var));
        this.j = new a(new m8(1, this, p4n0.class, "startTask", "startTask(Lcom/vk/mvi/MviTask;)V", 0, 11));
        this.k = new c(new o8(1, this, p4n0.class, "startTask", "startTask(Lcom/vk/mvi/MviTask;)V", 0, 13));
        this.l = new b();
        this.m = new BroadcastReceiver() { // from class: com.vk.newsfeed.impl.presentation.suggested.presentation.feature.task_executors.SuggestedPostsMviExternalEventsTaskExecutor$receiver$1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                Parcelable parcelable;
                Object parcelableExtra;
                if (epx.f(intent != null ? intent.getAction() : null, zou.a)) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelableExtra = intent.getParcelableExtra(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE, UserProfile.class);
                        parcelable = (Parcelable) parcelableExtra;
                    } else {
                        Parcelable parcelableExtra2 = intent.getParcelableExtra(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
                        parcelable = (UserProfile) (parcelableExtra2 instanceof UserProfile ? parcelableExtra2 : null);
                    }
                    UserProfile userProfile = (UserProfile) parcelable;
                    if (userProfile != null) {
                        p4n0.this.a(new a5n0.a.C2523a(userProfile));
                    }
                }
            }
        };
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        a5n0.a aVar = (a5n0.a) hn50Var;
        if (aVar instanceof a5n0.a.b) {
            return this.i.d(((a5n0.a.b) aVar).b);
        }
        if (aVar instanceof a5n0.a.c) {
            return awg0.a.b(this, new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.subjects.f(), new n240(new lyl0(this, 3), 22), io.reactivex.rxjava3.internal.functions.a.c), io.reactivex.rxjava3.internal.functions.a.d, new ig4(this, 5)), new s1u(), null, null, 6);
        }
        boolean z = aVar instanceof a5n0.a.e;
        pn60 pn60Var = this.g;
        qn60 qn60Var = this.f;
        if (z) {
            int i = ((a5n0.a.e) aVar).b;
            LinkedHashSet c2 = qn60Var.c();
            ArrayList arrayList = new ArrayList();
            for (Object obj : c2) {
                if (obj instanceof NewsEntry) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                NewsEntry newsEntry = (NewsEntry) arrayList.get(i2);
                if (newsEntry instanceof Post) {
                    Post post = (Post) newsEntry;
                    if (post.n == i && !post.isReported()) {
                        post.l.Ab(140737488355328L, true);
                        Object f = qn60Var.f(new c1g0(newsEntry, newsEntry, pn60Var, null));
                        if (!(f instanceof Result.Failure)) {
                            qn60.c cVar = (qn60.c) f;
                            e(new s4n0(new qr60.a.c(cVar.a, cVar.b, false, null, 28)));
                            c(new n4n0.b());
                            return null;
                        }
                    }
                }
                i2++;
            }
        } else if (aVar instanceof a5n0.a.C2523a) {
            UserProfile userProfile = ((a5n0.a.C2523a) aVar).b;
            LinkedHashSet c3 = qn60Var.c();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : c3) {
                if (obj2 instanceof NewsEntry) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            int size2 = arrayList2.size();
            Serializer.StreamParcelableAdapter streamParcelableAdapter = null;
            for (int i3 = 0; i3 < size2; i3++) {
                Serializer.StreamParcelableAdapter streamParcelableAdapter2 = (NewsEntry) arrayList2.get(i3);
                if (streamParcelableAdapter2 instanceof Post) {
                    Post post2 = (Post) streamParcelableAdapter2;
                    if (epx.f(post2.o.b, userProfile.c)) {
                        post2.uc(true);
                        arrayList3.add(streamParcelableAdapter2);
                        streamParcelableAdapter = streamParcelableAdapter2;
                    }
                }
            }
            Object f2 = qn60Var.f(new t0g0(arrayList3, pn60Var));
            if (!(f2 instanceof Result.Failure)) {
                qn60.c cVar2 = (qn60.c) f2;
                e(new s4n0(new qr60.a.c(cVar2.a, cVar2.b, false, null, 28)));
                Post post3 = (Post) streamParcelableAdapter;
                if (post3 != null) {
                    c(new n4n0.c(post3));
                    return null;
                }
            }
        } else if (aVar instanceof a5n0.a.f) {
            Post post4 = ((a5n0.a.f) aVar).b;
            LinkedHashSet c4 = qn60Var.c();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : c4) {
                if (obj3 instanceof NewsEntry) {
                    arrayList4.add(obj3);
                }
            }
            ArrayList arrayList5 = new ArrayList();
            int size3 = arrayList4.size();
            for (int i4 = 0; i4 < size3; i4++) {
                NewsEntry newsEntry2 = (NewsEntry) arrayList4.get(i4);
                if (newsEntry2 instanceof Post) {
                    Post post5 = (Post) newsEntry2;
                    if (epx.f(post5.o.b, post4.o.b)) {
                        post5.uc(false);
                        arrayList5.add(newsEntry2);
                    }
                }
            }
            Object f3 = qn60Var.f(new t0g0(arrayList5, pn60Var));
            if (!(f3 instanceof Result.Failure)) {
                qn60.c cVar3 = (qn60.c) f3;
                e(new s4n0(new qr60.a.c(cVar3.a, cVar3.b, false, null, 28)));
                c(new n4n0.c(post4));
                return null;
            }
        } else {
            if (!(aVar instanceof a5n0.a.d)) {
                throw new NoWhenBranchMatchedException();
            }
            Post post6 = ((a5n0.a.d) aVar).b;
            Object f4 = qn60Var.f(new c1g0(post6, post6, pn60Var, null));
            if (!(f4 instanceof Result.Failure)) {
                qn60.c cVar4 = (qn60.c) f4;
                e(new s4n0(new qr60.a.c(cVar4.a, cVar4.b, false, null, 28)));
            }
        }
        return null;
    }

    public final NewsFeedComponent s() {
        return (NewsFeedComponent) this.h.getValue();
    }
}
