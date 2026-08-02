package xsna;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.common.Attachment;
import com.vk.dto.profile.CatchUpBanner;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Lazy;

/* compiled from: PostViewClickListener.kt */
/* loaded from: classes4.dex */
public final class b9c0 implements s980 {
    public final Object b;
    public final Object c;
    public Object d;

    public b9c0(CommunityProfileFragment communityProfileFragment, eja ejaVar) {
        this.b = communityProfileFragment;
        this.c = ejaVar;
    }

    @Override // xsna.s980
    @ozl
    public boolean E8(Attachment attachment, NewsEntry newsEntry) {
        return ((fa60) this.b).E8(attachment, newsEntry);
    }

    @Override // xsna.s980
    @ozl
    public void Hh(View view, u1c0 u1c0Var, NewsEntry newsEntry, Attachment attachment) {
        ((fa60) this.b).Hh(view, u1c0Var, newsEntry, attachment);
    }

    @Override // xsna.s980
    @ozl
    public void Mg(View view, u1c0 u1c0Var, NewsEntry newsEntry, Attachment attachment) {
        ((fa60) this.b).Mg(view, u1c0Var, newsEntry, attachment);
    }

    @Override // xsna.s980
    @ozl
    public void U5(NewsEntry newsEntry, boolean z, int i) {
        ((fa60) this.b).getClass();
    }

    public void b(CatchUpBanner catchUpBanner) {
        jtg jtgVar;
        CommunityProfileFragment communityProfileFragment = (CommunityProfileFragment) this.b;
        FragmentActivity activity = communityProfileFragment.getActivity();
        if (activity == null || !communityProfileFragment.isAdded() || communityProfileFragment.isRemoving() || communityProfileFragment.isDetached() || p90.e(activity)) {
            return;
        }
        jtg jtgVar2 = new jtg(communityProfileFragment, catchUpBanner, (eja) this.c);
        this.d = jtgVar2;
        jtgVar2.g.a(1, true);
        if (!communityProfileFragment.isResumed() || (jtgVar = (jtg) this.d) == null) {
            return;
        }
        jtgVar.g.a(2, true);
    }

    public cbn c(String str) {
        ReentrantLock reentrantLock = (ReentrantLock) this.d;
        reentrantLock.lock();
        try {
            cbn cbnVar = (cbn) ((ConcurrentHashMap) this.b).remove(str);
            if (cbnVar == null) {
                reentrantLock.unlock();
                return null;
            }
            ((ConcurrentLinkedDeque) this.c).remove(str);
            return cbnVar;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.s980
    public void d9(NewsEntry newsEntry, NewsEntry newsEntry2, int i, int i2) {
        ((xzb0) this.d).f((Context) this.c.getValue(), new jc60(i, newsEntry, newsEntry2, i2, false, null));
    }

    @Override // xsna.s980
    @ozl
    public void r8(NewsEntry newsEntry) {
        ((fa60) this.b).r8(newsEntry);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.hi60
    public void sa(NewsfeedExternalAction newsfeedExternalAction) {
        ((xzb0) this.d).e((Context) this.c.getValue(), newsfeedExternalAction);
    }

    @Override // xsna.s980
    @ozl
    public boolean u9(View view, u1c0 u1c0Var, NewsEntry newsEntry, Attachment attachment) {
        return ((fa60) this.b).u9(view, u1c0Var, newsEntry, attachment);
    }

    public b9c0() {
        this.b = new ConcurrentHashMap();
        this.c = new ConcurrentLinkedDeque();
        this.d = new ReentrantLock();
    }

    public b9c0(Lazy lazy, xzb0 xzb0Var) {
        this.b = new fa60();
        this.c = lazy;
        this.d = xzb0Var;
    }
}
