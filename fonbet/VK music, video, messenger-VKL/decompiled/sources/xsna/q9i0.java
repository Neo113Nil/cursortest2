package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.user.UserProfile;
import com.vk.libvideo.design.view.live.LiveView;
import com.vk.libvideo.live.impl.fragment.VideoLiveFragment;
import com.vk.libvideo.live.impl.views.liveswipe.LiveSwipeView;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.StoryStatisticsViewersFragment;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.i;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import xsna.adw0;
import xsna.bjw0;
import xsna.bsm;
import xsna.e9j0;
import xsna.eo70;
import xsna.gaw0;
import xsna.gm50;
import xsna.khm0;
import xsna.n3t0;
import xsna.p7w0;
import xsna.tj50;
import xsna.tww0;
import xsna.xcw0;
import xsna.xn50;
import xsna.z0x0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class q9i0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q9i0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ac, code lost:
    
        r1.add(r4);
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        LiveSwipeView liveSwipeView;
        LiveView currentLiveView;
        oiz presenter;
        int i = this.b;
        r2 = null;
        r2 = null;
        r2 = null;
        rnz rnzVar = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ixi0 ixi0Var = (ixi0) obj2;
                int i2 = r9i0.j1;
                ixi0Var.h = (List) obj;
                ixi0Var.b();
                return s3q0.a;
            case 1:
                z2j0 z2j0Var = (z2j0) obj2;
                jr20 jr20Var = z2j0Var.p;
                Object obj3 = z2j0Var.l;
                jr20Var.A4(((bjf0) (obj3 != null ? obj3 : null)).a.d(), z2j0Var.getAdapterPosition());
                return s3q0.a;
            case 2:
                u8j0 u8j0Var = (u8j0) obj2;
                tj50.a aVar = (tj50.a) obj;
                qr0 qr0Var = new qr0(u8j0Var, 11);
                ao8 ao8Var = ao8.d;
                return new e9j0.a(aVar.a(qr0Var, ao8Var), aVar.a(new s8j0(1, u8j0Var, u8j0.class, "getPrivacy", "getPrivacy(Lcom/vk/camera/editor/stories/impl/share/mvi/ShareStoryState;)Lcom/vk/camera/editor/stories/impl/share/mvi/ShareStoryViewState$Privacy;", 0), ao8Var), aVar.a(t8j0.b, ao8Var));
            case 3:
                ((com.vk.sharing.core.view.l) obj2).setToggleFaveActionIsEnabled(true);
                return s3q0.a;
            case 4:
                return com.vk.sharing.core.view.f.w0((com.vk.sharing.core.view.f) obj2, (CharSequence) obj);
            case 5:
                List list = (List) obj;
                ListBuilder listBuilder = new ListBuilder(list.size());
                Iterator<com.vk.upload.impl.b<StoryEntry>> it = ((azl0) obj2).l.iterator();
                while (it.hasNext()) {
                    com.vk.upload.impl.b<StoryEntry> next = it.next();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        if (next == ((com.vk.upload.impl.b) next2)) {
                            break;
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    break;
                }
                return listBuilder.g();
            case 6:
                ((cws) obj2).invoke((View) obj);
                return s3q0.a;
            case 7:
                ((mfm0) obj2).e.setPreviewSelection((khm0.b) obj);
                return s3q0.a;
            case 8:
                ikv0 ikv0Var = (ikv0) obj;
                int i3 = StoryStatisticsViewersFragment.f0;
                gzs<s3q0> gzsVar = ((i.c) obj2).c;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                ikv0Var.a();
                return s3q0.a;
            case 9:
                bsm.i iVar = ((oqr0) obj2).n;
                if (iVar != null) {
                    iVar.g();
                }
                return s3q0.a;
            case 10:
                VideoLiveFragment videoLiveFragment = (VideoLiveFragment) obj2;
                n3t0 n3t0Var = (n3t0) obj;
                VideoLiveFragment.a aVar2 = videoLiveFragment.O;
                if (aVar2 != null && (liveSwipeView = aVar2.a) != null && (currentLiveView = liveSwipeView.getCurrentLiveView()) != null && (presenter = currentLiveView.getPresenter()) != null) {
                    rnzVar = presenter.C1();
                }
                if (n3t0Var instanceof n3t0.c) {
                    n3t0.c cVar = (n3t0.c) n3t0Var;
                    if (epx.f(cVar.a, videoLiveFragment.d0)) {
                        if (cVar.b) {
                            if (rnzVar != null) {
                                rnzVar.b();
                            }
                        } else if (rnzVar != null) {
                            rnzVar.d();
                        }
                    }
                } else if (!(n3t0Var instanceof n3t0.b) && !(n3t0Var instanceof n3t0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return s3q0.a;
            case 11:
                com.vk.superapp.verification.account.d dVar = (com.vk.superapp.verification.account.d) obj2;
                eo70 eo70Var = (eo70) obj;
                if (eo70Var instanceof eo70.e) {
                    tyv0 tyv0Var = dVar.M;
                    eo70.e eVar = (eo70.e) eo70Var;
                    (tyv0Var != null ? tyv0Var : null).d(eVar.a, eVar.b, eVar.c);
                } else if (eo70Var instanceof eo70.a) {
                    tyv0 tyv0Var2 = dVar.M;
                    (tyv0Var2 != null ? tyv0Var2 : null).c();
                }
                return s3q0.a;
            case 12:
                ((m6w0) obj2).T((p7w0.e.b) obj);
                return s3q0.a;
            case 13:
                return new q6w0((ViewGroup) obj, (b8w0) obj2);
            case 14:
                daw0 daw0Var = (daw0) obj2;
                gaw0.a aVar3 = (gaw0.a) obj;
                gm50.a.a(daw0Var, aVar3.a, new aer0(daw0Var, 6));
                gm50.a.a(daw0Var, aVar3.b, new yyl0(daw0Var, 24));
                gm50.a.a(daw0Var, aVar3.c, new lbt0(daw0Var, 2));
                return s3q0.a;
            case 15:
                cdw0 cdw0Var = (cdw0) obj2;
                int i4 = cdw0.o1;
                adw0.d.a aVar4 = adw0.d.a.b;
                cdw0Var.getClass();
                xn50.a.c(cdw0Var, aVar4);
                return s3q0.a;
            case 16:
                return new bjw0.f(((tj50.a) obj).a(new tiw0(1, (viw0) obj2, viw0.class, "composeSearchStateOld", "composeSearchStateOld(Lcom/vk/voip/ui/calls/presentation/model/state/VoipCallServiceState$SearchOld;)Ljava/util/List;", 0), ao8.d));
            case 17:
                return Boolean.valueOf(!((Set) obj2).contains(((UserProfile) obj).c));
            case 18:
                nrw0 nrw0Var = (nrw0) obj2;
                nrw0Var.q(new xcw0.x(nrw0Var.e));
                return s3q0.a;
            case 19:
                ((gvw0) obj2).f = false;
                return s3q0.a;
            case 20:
                ((pww0) obj2).T(tww0.l.b.b);
                return s3q0.a;
            case 21:
                ((w0x0) obj2).T(new z0x0.c.a((Throwable) obj));
                return s3q0.a;
            default:
                ((Boolean) obj).getClass();
                ((h6m0) obj2).invoke();
                return s3q0.a;
        }
    }
}
