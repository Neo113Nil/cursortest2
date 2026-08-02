package xsna;

import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.stories.model.CommonUploadParams;
import com.vk.dto.stories.model.StoryUploadParams;
import com.vk.story.api.domain.interactor.upload.StoryMultiData;
import com.vk.story.api.media.StoryMediaData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import xsna.a9j0;
import xsna.q8j0;
import xsna.x7j0;

/* compiled from: ShareStoryFeature.kt */
/* loaded from: classes16.dex */
public final class l8j0 extends wk50<e9j0, c9j0, x7j0, q8j0> {
    public final a f;
    public final g9m0 g;
    public final gpj0 h;
    public final gu50 i;
    public final hkm0 j;
    public final StoryMultiData k;
    public final j6v l;
    public final f4z m;

    /* compiled from: ShareStoryFeature.kt */
    public static final class a {
        public final UserId a;
        public final StoryPrivacyType b;
        public final int c;
        public final boolean d;
        public final List<Group> e;
        public final Map<UserId, Boolean> f;
        public final String g;

        /* JADX WARN: Multi-variable type inference failed */
        public a(UserId userId, StoryPrivacyType storyPrivacyType, int i, boolean z, List<? extends Group> list, Map<UserId, Boolean> map, String str) {
            this.a = userId;
            this.b = storyPrivacyType;
            this.c = i;
            this.d = z;
            this.e = list;
            this.f = map;
            this.g = str;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l8j0(a aVar, g9m0 g9m0Var, gpj0 gpj0Var, gu50 gu50Var, hkm0 hkm0Var, StoryMultiData storyMultiData, j6v j6vVar) {
        super(r3, new u8j0(new c9j0(r7, r8, r9, r10, r11, r12, r12, false, r12, r12), gpj0Var, !r4.isEmpty()));
        x7j0.e eVar = new x7j0.e(aVar.e, aVar.f);
        UserId userId = aVar.a;
        StoryPrivacyType storyPrivacyType = aVar.b;
        int i = aVar.c;
        boolean z = aVar.d;
        EmptyList emptyList = EmptyList.b;
        jgp jgpVar = jgp.b;
        this.f = aVar;
        this.g = g9m0Var;
        this.h = gpj0Var;
        this.i = gu50Var;
        this.j = hkm0Var;
        this.k = storyMultiData;
        this.l = j6vVar;
        this.m = new f4z();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [xsna.q8j0$g] */
    @Override // xsna.wk50
    public final void N(c9j0 c9j0Var, x7j0 x7j0Var) {
        q8j0.f fVar;
        List<Integer> list;
        StoryUploadParams storyUploadParams;
        UserId uid;
        String str;
        c9j0 c9j0Var2 = c9j0Var;
        x7j0 x7j0Var2 = x7j0Var;
        Map<UserId, Set<Narrative>> map = c9j0Var2.h;
        int i = c9j0Var2.d;
        StoryPrivacyType storyPrivacyType = c9j0Var2.c;
        UserId userId = c9j0Var2.b;
        if (x7j0Var2 instanceof x7j0.e) {
            x7j0.e eVar = (x7j0.e) x7j0Var2;
            T(new q8j0.c(eVar.b, eVar.c));
            return;
        }
        String a2 = null;
        r14 = null;
        String str2 = null;
        if (x7j0Var2 instanceof x7j0.c) {
            String str3 = ((x7j0.c) x7j0Var2).b;
            hg1.e(this.e, bug0.e(gu50.e(this.i, userId, str3, null, null, null, null, 60), null, null, 6).subscribe(new c120(new n37(this, c9j0Var2.j.get(userId), userId, str3, 5), 24), new be50(new mga0(this, 14), 14)));
            return;
        }
        if (x7j0Var2 instanceof x7j0.f) {
            T(new q8j0.d(((x7j0.f) x7j0Var2).b));
            return;
        }
        boolean z = x7j0Var2 instanceof x7j0.a;
        f4z f4zVar = this.m;
        if (z) {
            Group group = ((x7j0.a) x7j0Var2).b;
            gpj0 gpj0Var = this.h;
            if (group == null || (uid = group.c) == null) {
                uid = gpj0Var.getUid();
            }
            if (epx.f(userId, uid)) {
                return;
            }
            T(new q8j0.b(group));
            if (fkq0.b(uid)) {
                str = group != null ? group.d : null;
                if (group != null) {
                    a2 = group.e;
                }
            } else {
                String name = gpj0Var.getName();
                a2 = gpj0Var.a();
                str = name;
            }
            f4zVar.b(new a9j0.a(str, a2, uid));
            return;
        }
        boolean equals = x7j0Var2.equals(x7j0.l.b);
        StoryMultiData storyMultiData = this.k;
        if (equals) {
            if (storyMultiData != null) {
                List<StoryMediaData> list2 = storyMultiData.b;
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    StoryUploadParams storyUploadParams2 = ((StoryMediaData) it.next()).d;
                    storyUploadParams2.C = (fkq0.d(userId) && !ham0.a.contains(storyPrivacyType) && c9j0Var2.e) ? storyPrivacyType.j() : null;
                    storyUploadParams2.D = Integer.valueOf(i);
                    storyUploadParams2.E = c9j0Var2.k.getOrDefault(userId, Boolean.FALSE).booleanValue();
                }
                CommonUploadParams commonUploadParams = storyMultiData.d;
                Set<Narrative> set = map.get(userId);
                commonUploadParams.c = true;
                if (fkq0.b(userId)) {
                    commonUploadParams.e = fkq0.e(userId);
                }
                if (set != null) {
                    Set<Narrative> set2 = set;
                    ArrayList arrayList = new ArrayList(c5g.u(set2, 10));
                    Iterator it2 = set2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(Integer.valueOf(((Narrative) it2.next()).b));
                    }
                    list = rdi.x(arrayList);
                } else {
                    list = null;
                }
                commonUploadParams.p = list;
                StoryMediaData storyMediaData = (StoryMediaData) j5g.a0(list2);
                if (storyMediaData != null && (storyUploadParams = storyMediaData.d) != null) {
                    str2 = storyUploadParams.C;
                }
                this.g.m(str2);
                this.j.b(storyMultiData);
                f4zVar.b(new a9j0.g(userId));
                return;
            }
            return;
        }
        if (x7j0Var2 instanceof x7j0.m) {
            T(new q8j0.h(((x7j0.m) x7j0Var2).b));
            return;
        }
        if (x7j0Var2 instanceof x7j0.n) {
            T(new q8j0.i(((x7j0.n) x7j0Var2).b));
            return;
        }
        if (x7j0Var2 instanceof x7j0.h) {
            T(new q8j0.a(((x7j0.h) x7j0Var2).b));
            return;
        }
        if (x7j0Var2 instanceof x7j0.d) {
            f4zVar.b(new a9j0.b(userId));
            return;
        }
        if (x7j0Var2 instanceof x7j0.g) {
            x7j0.g gVar = (x7j0.g) x7j0Var2;
            T(new q8j0.e(gVar.b, gVar.c, false));
            return;
        }
        if (x7j0Var2 instanceof x7j0.b) {
            Set<Narrative> set3 = map.get(userId);
            if (set3 != null) {
                Narrative narrative = ((x7j0.b) x7j0Var2).b;
                if (set3.contains(narrative)) {
                    fVar = new q8j0.g(narrative);
                    T(fVar);
                    return;
                }
            }
            fVar = new q8j0.f(((x7j0.b) x7j0Var2).b);
            T(fVar);
            return;
        }
        if (x7j0Var2.equals(x7j0.k.b)) {
            f4zVar.b(new a9j0.f(storyMultiData != null ? new StoryMultiData(storyMultiData.b, storyMultiData.c, storyMultiData.d, storyMultiData.e, Integer.valueOf(i)) : null));
            return;
        }
        if (x7j0Var2.equals(x7j0.i.b)) {
            f4zVar.b(a9j0.d.a);
        } else if (x7j0Var2.equals(x7j0.j.b) && fkq0.d(userId)) {
            f4zVar.b(a9j0.e.a);
        }
    }
}
