package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryOwner;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.ArrayList;
import java.util.Iterator;
import ru.ok.android.api.core.ApiInvocationException;

/* compiled from: ProfileStoriesController.kt */
/* loaded from: classes5.dex */
public final class vzd0 {
    public final m3a a;
    public final noh b;
    public final p870 c;
    public final p5e d;
    public final gul0 e;
    public final b25 f;
    public final rzd0 g = new rzd0(this, 0);
    public final szd0 h = new bd70() { // from class: xsna.szd0
        @Override // xsna.bd70
        public final void x0(int i, int i2, Object obj) {
            ArrayList<StoriesContainer> arrayList;
            StoryEntry storyEntry = (StoryEntry) obj;
            if (storyEntry == null) {
                return;
            }
            vzd0 vzd0Var = vzd0.this;
            ExtendedCommunityProfile g = vzd0Var.a.g();
            if (g == null || (arrayList = g.v1) == null) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (((StoriesContainer) obj2).Eb()) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                StoriesContainer storiesContainer = (StoriesContainer) it.next();
                if (storiesContainer.g.contains(storyEntry)) {
                    storiesContainer.g.remove(storyEntry);
                }
            }
            vzd0Var.b.a(arrayList);
        }
    };
    public final tzd0 i = new bd70() { // from class: xsna.tzd0
        @Override // xsna.bd70
        public final void x0(int i, int i2, Object obj) {
            ExtendedCommunityProfile g;
            vzd0 vzd0Var = vzd0.this;
            if (vzd0Var.c((zjm0) obj) && (g = vzd0Var.a.g()) != null) {
                ArrayList<StoriesContainer> b = vzd0Var.e.b(g.a.c, g.v1);
                g.v1 = b;
                vzd0Var.b.a(b);
            }
        }
    };
    public final uzd0 j = new bd70() { // from class: xsna.uzd0
        @Override // xsna.bd70
        public final void x0(int i, int i2, Object obj) {
            ExtendedCommunityProfile g;
            ArrayList<StoriesContainer> arrayList;
            UserId Fb;
            vzd0 vzd0Var = vzd0.this;
            m3a m3aVar = vzd0Var.a;
            zjm0 zjm0Var = (zjm0) obj;
            if (!vzd0Var.c(zjm0Var) || (g = m3aVar.g()) == null || (arrayList = g.v1) == null) {
                return;
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                StoriesContainer storiesContainer = g.v1.get(i3);
                StoryOwner storyOwner = storiesContainer.b;
                if (fkq0.d(m3aVar.h()) ? !(storyOwner == null || (Fb = storyOwner.Fb()) == null || !vzd0Var.f.a(Fb)) : !(storyOwner == null || !storyOwner.Ib(zjm0Var.j.e))) {
                    int size2 = storiesContainer.g.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        if (storiesContainer.g.get(i4).c == zjm0Var.a) {
                            storiesContainer.g.remove(i4);
                            vzd0Var.b.a(arrayList);
                            return;
                        }
                    }
                }
            }
        }
    };
    public final rsq k = new rsq(this, 1);
    public final cn3 l = new cn3(this, 2);

    /* JADX WARN: Type inference failed for: r1v2, types: [xsna.szd0] */
    /* JADX WARN: Type inference failed for: r1v3, types: [xsna.tzd0] */
    /* JADX WARN: Type inference failed for: r1v4, types: [xsna.uzd0] */
    public vzd0(m3a m3aVar, noh nohVar, p870 p870Var, p5e p5eVar, gul0 gul0Var, b25 b25Var) {
        this.a = m3aVar;
        this.b = nohVar;
        this.c = p870Var;
        this.d = p5eVar;
        this.e = gul0Var;
        this.f = b25Var;
    }

    public final void a() {
        ArrayList<StoriesContainer> arrayList;
        rzd0 rzd0Var = this.g;
        p870 p870Var = this.c;
        p870Var.b(100, rzd0Var);
        p870Var.b(108, this.h);
        p870Var.b(ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED, this.i);
        p870Var.b(102, this.k);
        p870Var.b(109, this.j);
        p870Var.b(104, this.l);
        ExtendedCommunityProfile g = this.a.g();
        if (g == null || (arrayList = g.v1) == null) {
            return;
        }
        this.b.a(arrayList);
    }

    public final void b() {
        rzd0 rzd0Var = this.g;
        p870 p870Var = this.c;
        p870Var.g(rzd0Var);
        p870Var.g(this.h);
        p870Var.g(this.i);
        p870Var.g(this.k);
        p870Var.g(this.j);
        p870Var.g(this.l);
    }

    public final boolean c(zjm0 zjm0Var) {
        if (zjm0Var == null) {
            return false;
        }
        UserId userId = zjm0Var.j.e;
        if (!fkq0.c(userId)) {
            userId = this.f.c();
        }
        return epx.f(userId, fkq0.a(this.a.h()));
    }
}
