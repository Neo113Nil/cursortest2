package xsna;

import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.lists.ListDataSet;
import com.vk.profile.questions.impl.QuestionsListFragment;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class vdx implements bd70 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vdx(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006b, code lost:
    
        if (r1 != (-1)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006d, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0073, code lost:
    
        if (r7 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
    
        r7 = r7.intValue();
        r1 = r0.c(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007f, code lost:
    
        if ((r1 instanceof xsna.aex.a) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0081, code lost:
    
        r1 = (xsna.aex.a) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0085, code lost:
    
        if (r1 != null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (r1.b().c != r8.c) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0096, code lost:
    
        if (r8.Tb() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0098, code lost:
    
        r3 = xsna.eex.b(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b4, code lost:
    
        if (r3 != null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b8, code lost:
    
        r0.F(r7, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a1, code lost:
    
        if (r8.Sb() == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a3, code lost:
    
        r1 = r8.m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a5, code lost:
    
        if (r1 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a7, code lost:
    
        r3 = new xsna.aex.a.C2538a(r8.c, r8, r1.y.Fb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0084, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x006f, code lost:
    
        r7 = java.lang.Integer.valueOf(r1);
     */
    @Override // xsna.bd70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x0(int i, int i2, Object obj) {
        zex zexVar;
        int i3 = this.b;
        Object obj2 = this.c;
        switch (i3) {
            case 0:
                xdx xdxVar = (xdx) obj2;
                StoryEntry storyEntry = (StoryEntry) obj;
                if (storyEntry != null) {
                    Iterator it = xdxVar.c.iterator();
                    while (it.hasNext()) {
                        zdx zdxVar = (zdx) ((WeakReference) it.next()).get();
                        if (zdxVar != null && (zexVar = zdxVar.D.Q) != null) {
                            ListDataSet<aex> listDataSet = zexVar.d;
                            tdx tdxVar = zexVar.e;
                            if (tdxVar != null) {
                                Iterator it2 = tdxVar.d.iterator();
                                int i4 = 0;
                                while (true) {
                                    aex aexVar = null;
                                    if (!it2.hasNext()) {
                                        i4 = -1;
                                        break;
                                    } else {
                                        Object next = it2.next();
                                        if (i4 < 0) {
                                            e43.t();
                                            throw null;
                                        }
                                        if (((StoriesContainer) next).g.contains(storyEntry)) {
                                            break;
                                        } else {
                                            i4++;
                                        }
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    return;
                }
                return;
            default:
                zjm0 zjm0Var = (zjm0) obj;
                int i5 = QuestionsListFragment.f0;
                kqe0 kqe0Var = (kqe0) ((QuestionsListFragment) obj2).S;
                if (kqe0Var != null) {
                    kqe0Var.e5(zjm0Var);
                    return;
                }
                return;
        }
    }
}
