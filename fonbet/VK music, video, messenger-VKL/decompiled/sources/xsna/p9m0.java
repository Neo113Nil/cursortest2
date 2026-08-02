package xsna;

import android.content.Context;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.a9m0;
import xsna.eam0;
import xsna.nx6;
import xsna.r1r0;
import xsna.x9m0;

/* compiled from: StoryPrivacyFeature.kt */
/* loaded from: classes16.dex */
public final class p9m0 extends wk50<lam0, fam0, a9m0, x9m0> {
    public final Context f;
    public final bpn0 g;
    public final bpn0 h;
    public final j2r0 i;
    public final f4z j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p9m0(Context context, gpj0 gpj0Var, StoryPrivacyType storyPrivacyType, StoryPrivacyType storyPrivacyType2, List<UserId> list, List<UserId> list2, List<UserId> list3) {
        super(r0, new y9m0(gpj0Var, new fam0(storyPrivacyType, storyPrivacyType2, list, list2, list3, r8, r8, r8)));
        a9m0.c cVar = a9m0.c.b;
        EmptyList emptyList = EmptyList.b;
        this.f = context;
        this.g = new bpn0(new zqf0(4));
        this.h = new bpn0(new e6k0(2));
        this.i = new j2r0();
        this.j = new f4z();
    }

    @Override // xsna.wk50
    public final void N(fam0 fam0Var, a9m0 a9m0Var) {
        fam0 fam0Var2 = fam0Var;
        a9m0 a9m0Var2 = a9m0Var;
        List<UserId> list = fam0Var2.f;
        StoryPrivacyType storyPrivacyType = fam0Var2.b;
        StoryPrivacyType storyPrivacyType2 = fam0Var2.c;
        List<UserId> list2 = fam0Var2.e;
        List<UserId> list3 = fam0Var2.d;
        if (a9m0Var2 instanceof a9m0.c) {
            U(list3, new ksg0(this, 6));
            U(list2, new lyl0(this, 1));
            U(list, new xka0(this, 15));
            T(x9m0.d.b);
            return;
        }
        boolean z = a9m0Var2 instanceof a9m0.i;
        f4z f4zVar = this.j;
        if (z) {
            ArrayList arrayList = ((a9m0.i) a9m0Var2).b;
            T(new x9m0.g(arrayList));
            U(arrayList, new mga0(this, 19));
            f4zVar.b(new eam0.c(false, false, new eam0.f(storyPrivacyType, storyPrivacyType2, list3, arrayList)));
            return;
        }
        if (a9m0Var2 instanceof a9m0.h) {
            a9m0.h hVar = (a9m0.h) a9m0Var2;
            StoryPrivacyType storyPrivacyType3 = hVar.b;
            T(new x9m0.h(storyPrivacyType3));
            ArrayList arrayList2 = hVar.c;
            T(new x9m0.f(arrayList2));
            U(arrayList2, new wug0(this, 10));
            f4zVar.b(new eam0.c(false, false, new eam0.f(storyPrivacyType3, storyPrivacyType2, arrayList2, list2)));
            return;
        }
        if (a9m0Var2 instanceof a9m0.a) {
            StoryPrivacyType storyPrivacyType4 = ((a9m0.a) a9m0Var2).b;
            T(new x9m0.h(storyPrivacyType4));
            f4zVar.b(new eam0.c(false, true, new eam0.f(storyPrivacyType4, storyPrivacyType2, list3, list2)));
            return;
        }
        if (a9m0Var2 instanceof a9m0.d) {
            List<UserId> list4 = list;
            ArrayList arrayList3 = new ArrayList(c5g.u(list4, 10));
            Iterator<T> it = list4.iterator();
            while (it.hasNext()) {
                arrayList3.add(new nx6.a.C3421a((UserId) it.next()));
            }
            hg1.e(this.e, hg1.m(rsg0.y0(new nx6(arrayList3), null, null, 3), this.f, 0L, false, 62).subscribe(new s520(new fwg(list3, this, list2, list, 1), 22), new k5j0(new mcj0(this, 5), 4)));
            return;
        }
        if (a9m0Var2 instanceof a9m0.e) {
            f4zVar.b(eam0.a.a);
            return;
        }
        if (a9m0Var2 instanceof a9m0.f) {
            f4zVar.b(new eam0.b(((a9m0.f) a9m0Var2).b));
        } else if (a9m0Var2 instanceof a9m0.g) {
            f4zVar.b(new eam0.d(new eam0.f(storyPrivacyType, storyPrivacyType2, list3, list2)));
        } else {
            if (!a9m0Var2.equals(a9m0.b.b)) {
                throw new NoWhenBranchMatchedException();
            }
            f4zVar.b(new eam0.c(true, true, new eam0.f(storyPrivacyType, storyPrivacyType2, list3, list2)));
        }
    }

    public final void U(List<UserId> list, izs<? super List<? extends ayv0>, s3q0> izsVar) {
        if (list.isEmpty()) {
            izsVar.invoke(EmptyList.b);
        } else {
            this.e.b(rsg0.W(yfb.x(r1r0.a.b((s1r0) this.h.getValue(), j5g.H0(list, 3), Collections.singletonList(UsersFieldsDto.PHOTO_BASE), null, null, 58)), 7).m(asu0.a.d()).subscribe(new hu50(new hn0(27, this, izsVar), 22)));
        }
    }
}
