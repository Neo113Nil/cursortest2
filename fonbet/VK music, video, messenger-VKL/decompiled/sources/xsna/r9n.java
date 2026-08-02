package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.GetStoriesResponse;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryQuestionEntry;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class r9n implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ r9n(Object obj, Object obj2, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0161 A[LOOP:2: B:44:0x015b->B:46:0x0161, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a0 A[LOOP:3: B:54:0x019c->B:56:0x01a0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b4  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        ?? r4;
        ArrayList<StoriesContainer> arrayList;
        Iterator<StoriesContainer> it;
        j9x it2;
        k9n k9nVar;
        elm0 elm0Var;
        dgm0 dgm0Var;
        int i = this.b;
        boolean z = this.c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                y9n y9nVar = (y9n) obj2;
                GetStoriesResponse getStoriesResponse = (GetStoriesResponse) obj;
                ((com.vk.lists.c) obj3).s(getStoriesResponse.d);
                y9nVar.O = true;
                k9n k9nVar2 = y9nVar.M;
                List<? extends hfz> list = k9nVar2 != null ? k9nVar2.h : null;
                if (list != null) {
                    if (z) {
                        list = null;
                    }
                    if (list != null) {
                        r4 = new ArrayList();
                        for (Object obj4 : list) {
                            if (obj4 instanceof rrl0) {
                                r4.add(obj4);
                            }
                        }
                        if (r4 == 0) {
                            r4 = EmptyList.b;
                        }
                        arrayList = getStoriesResponse.c;
                        Collection collection = (Collection) r4;
                        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(new rrl0(it.next()));
                        }
                        ArrayList u0 = j5g.u0(arrayList2, collection);
                        if (!arrayList.isEmpty() && (elm0Var = y9nVar.c) != null) {
                            elm0Var.i(arrayList);
                        }
                        k9x q = swe0.q(0, 3 - (u0.size() % 3));
                        ArrayList arrayList3 = new ArrayList(c5g.u(q, 10));
                        it2 = q.iterator();
                        while (it2.d) {
                            it2.nextInt();
                            arrayList3.add(new trl0());
                        }
                        ArrayList u02 = j5g.u0(arrayList3, u0);
                        k9nVar = y9nVar.M;
                        if (k9nVar != null) {
                            k9nVar.setItems(u02);
                        }
                        break;
                    }
                }
                r4 = 0;
                if (r4 == 0) {
                }
                arrayList = getStoriesResponse.c;
                Collection collection2 = (Collection) r4;
                ArrayList arrayList22 = new ArrayList(c5g.u(arrayList, 10));
                it = arrayList.iterator();
                while (it.hasNext()) {
                }
                ArrayList u03 = j5g.u0(arrayList22, collection2);
                if (!arrayList.isEmpty()) {
                    elm0Var.i(arrayList);
                }
                k9x q2 = swe0.q(0, 3 - (u03.size() % 3));
                ArrayList arrayList32 = new ArrayList(c5g.u(q2, 10));
                it2 = q2.iterator();
                while (it2.d) {
                }
                ArrayList u022 = j5g.u0(arrayList32, u03);
                k9nVar = y9nVar.M;
                if (k9nVar != null) {
                }
            default:
                zgm0 zgm0Var = (zgm0) obj3;
                rqe0 rqe0Var = (rqe0) obj2;
                VKList<StoryQuestionEntry> vKList = (VKList) obj;
                h0b h0bVar = zgm0Var.b.g;
                UserId userId = rqe0Var.a;
                int i2 = rqe0Var.b;
                yfm0 yfm0Var = (yfm0) h0bVar.b;
                io.reactivex.rxjava3.internal.operators.completable.e e = yfm0Var.e(i2, userId);
                int i3 = vKList.i();
                ArrayList arrayList4 = new ArrayList(c5g.u(vKList, 10));
                for (StoryQuestionEntry storyQuestionEntry : vKList) {
                    yfm0 yfm0Var2 = yfm0Var;
                    io.reactivex.rxjava3.internal.operators.completable.e eVar = e;
                    int i4 = storyQuestionEntry.b;
                    int i5 = i3;
                    int i6 = storyQuestionEntry.j;
                    UserProfile userProfile = storyQuestionEntry.g;
                    if (userProfile != null) {
                        UserId userId2 = userProfile.c;
                        String str = userProfile.e;
                        String str2 = userProfile.d;
                        Image image = userProfile.O;
                        String str3 = userProfile.g;
                        if (str3 == null) {
                            str3 = userProfile.h;
                        }
                        dgm0Var = new dgm0(userId2, str, str2, image, str3, userProfile.d(), userProfile.n(), userProfile.s.getString("name_acc"));
                    } else {
                        dgm0Var = null;
                    }
                    bgm0 bgm0Var = new bgm0(storyQuestionEntry.b, storyQuestionEntry.c, storyQuestionEntry.d, storyQuestionEntry.e, storyQuestionEntry.f, dgm0Var, storyQuestionEntry.h, storyQuestionEntry.i, storyQuestionEntry.j);
                    ArrayList arrayList5 = arrayList4;
                    arrayList5.add(new cgm0(userId, i2, i4, i6, bgm0Var));
                    yfm0Var = yfm0Var2;
                    e = eVar;
                    i3 = i5;
                    arrayList4 = arrayList5;
                }
                io.reactivex.rxjava3.internal.operators.completable.e eVar2 = e;
                int i7 = 2;
                io.reactivex.rxjava3.core.a n = io.reactivex.rxjava3.core.a.n(yfm0Var.a(arrayList4), ((egm0) h0bVar.c).c(new hgm0(userId, i2, i3)));
                if (z) {
                    n = eVar2.c(n);
                }
                n.g(new p30(vKList, zgm0Var, rqe0Var, i7)).subscribe();
                break;
        }
        return s3q0.a;
    }
}
