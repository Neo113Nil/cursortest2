package xsna;

import com.vk.debug.ui.dev.DebugDevImageFragment;
import com.vk.feed.design.view.newsfeed.reaction.FeedAnimatedView;
import com.vk.friends.requests.impl.requests.presentation.FriendRequestsFragment;
import com.vk.photos.ui.editalbum.domain.c;
import com.vk.superapp.advertisement.b;
import xsna.svm;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class p41 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p41(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((b.c) obj2).invoke(obj);
                break;
            case 1:
                ((qm1) obj2).invoke(obj);
                break;
            case 2:
                ((ep1) obj2).invoke(obj);
                break;
            case 3:
                ((qm1) obj2).invoke(obj);
                break;
            case 4:
                ((qm1) obj2).invoke(obj);
                break;
            case 5:
                ((qm1) obj2).invoke(obj);
                break;
            case 6:
                ((qm1) obj2).invoke(obj);
                break;
            case 7:
                ((wd3) obj2).invoke(obj);
                break;
            case 8:
                ((qm1) obj2).invoke(obj);
                break;
            case 9:
                ((qm1) obj2).invoke(obj);
                break;
            case 10:
                ((qm1) obj2).invoke(obj);
                break;
            case 11:
                ((qm1) obj2).invoke(obj);
                break;
            case 12:
                ((j76) obj2).invoke(obj);
                break;
            case 13:
                ((tb4) obj2).invoke(obj);
                break;
            case 14:
                int i2 = DebugDevImageFragment.U;
                ((u2l) obj2).invoke(obj);
                break;
            case 15:
                ((lpd) obj2).invoke(obj);
                break;
            case 16:
                ((nvm) obj2).n(new svm.a((Throwable) obj));
                break;
            case 17:
                ((arf) obj2).invoke(obj);
                break;
            case 18:
                ((arf) obj2).invoke(obj);
                break;
            case 19:
                ((c.b) obj2).invoke(obj);
                break;
            case 20:
                ((gpq) obj2).e((ipq) obj);
                break;
            case 21:
                int i3 = FeedAnimatedView.y;
                ((wd3) obj2).invoke(obj);
                break;
            case 22:
                ((wd3) obj2).invoke(obj);
                break;
            case 23:
                m1s m1sVar = (m1s) obj2;
                a1s a1sVar = (a1s) obj;
                i5f i5fVar = new i5f(m1sVar, 23);
                if (!(a1sVar instanceof e580)) {
                    if (!(a1sVar instanceof w480) && !(a1sVar instanceof b580) && !(a1sVar instanceof f580) && !(a1sVar instanceof k580) && !(a1sVar instanceof j580) && !(a1sVar instanceof l580)) {
                        if (!(a1sVar instanceof g580)) {
                            if (!(a1sVar instanceof z480)) {
                                if (!(a1sVar instanceof c580)) {
                                    if (a1sVar instanceof mb80) {
                                        m1sVar.r(new ea3(m1sVar, a1sVar, i5fVar, 5));
                                        break;
                                    }
                                } else {
                                    m1sVar.r(new defpackage.b0(19, a1sVar, m1sVar));
                                    break;
                                }
                            } else {
                                m1sVar.r(new v53(12, a1sVar, m1sVar));
                                break;
                            }
                        } else {
                            m1sVar.j.b();
                            break;
                        }
                    } else {
                        i5fVar.invoke();
                        break;
                    }
                } else {
                    e580 e580Var = (e580) a1sVar;
                    if (e580Var.e && e580Var.c.size() == 1 && e580Var.d.isEmpty()) {
                        m1sVar.r(new bv1(13, a1sVar, m1sVar));
                    }
                    i5fVar.invoke();
                    break;
                }
                break;
            case 24:
                int i4 = FriendRequestsFragment.d0;
                ((g1j) obj2).invoke(obj);
                break;
            case 25:
                ((izs) obj2).invoke(obj);
                break;
            case 26:
                ((j76) obj2).invoke(obj);
                break;
            case 27:
                ((arf) obj2).invoke(obj);
                break;
            case 28:
                ((arf) obj2).invoke(obj);
                break;
            default:
                ((yl0) obj2).invoke(obj);
                break;
        }
    }
}
