package xsna;

import com.vk.dto.newsfeed.discover.DiscoverId;
import com.vk.newsfeed.api.data.discover.NewsEntriesContainer;
import com.vk.profile.questions.impl.QuestionsListFragment;
import xsna.r1n;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class mf60 implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ mf60(o1n o1nVar, boolean z, DiscoverId discoverId) {
        this.d = o1nVar;
        this.c = z;
        this.e = discoverId;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        boolean z = this.c;
        switch (i) {
            case 0:
                NewsEntriesContainer newsEntriesContainer = (NewsEntriesContainer) obj;
                return ((((n1n) obj3).a(newsEntriesContainer, z) instanceof r1n.c) && m6n.b((DiscoverId) obj2, newsEntriesContainer)) ? io.reactivex.rxjava3.core.q.T(new ovz(newsEntriesContainer)) : io.reactivex.rxjava3.core.q.H(new IllegalStateException("Cache is not valid"));
            default:
                QuestionsListFragment questionsListFragment = (QuestionsListFragment) obj3;
                com.vk.profile.questions.impl.d dVar = (com.vk.profile.questions.impl.d) obj2;
                ikv0 ikv0Var = (ikv0) obj;
                int i2 = QuestionsListFragment.f0;
                if (z) {
                    kqe0 kqe0Var = (kqe0) questionsListFragment.S;
                    if (kqe0Var != null) {
                        kqe0Var.Dl(dVar);
                    }
                } else {
                    kqe0 kqe0Var2 = (kqe0) questionsListFragment.S;
                    if (kqe0Var2 != null) {
                        kqe0Var2.k4(dVar);
                    }
                }
                ikv0Var.a();
                return s3q0.a;
        }
    }

    public /* synthetic */ mf60(boolean z, QuestionsListFragment questionsListFragment, com.vk.profile.questions.impl.d dVar) {
        this.c = z;
        this.d = questionsListFragment;
        this.e = dVar;
    }
}
