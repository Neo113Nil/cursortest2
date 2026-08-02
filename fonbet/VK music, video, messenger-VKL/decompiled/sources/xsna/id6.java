package xsna;

import android.content.Context;
import com.vk.api.users.UsersSearch;
import com.vk.dto.user.UserProfile;
import com.vk.friends.api.presentation.FriendsListType;
import com.vk.friends.impl.friends.presentation.fragment.AbsFriendsFragment;
import com.vk.lists.ListDataSet;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import kotlin.LazyThreadSafetyMode;

/* compiled from: BaseFriendsListPresenter.kt */
/* loaded from: classes15.dex */
public class id6 implements xqs {
    public final jd6 a;
    public final AbsFriendsFragment b;
    public final UsersSearch.Entrypoint c;
    public final eqs d;
    public final ListDataSet<nqs> e;
    public boolean f;
    public String g;
    public com.vk.lists.c h;
    public final Object i;
    public final Object j;
    public final Object k;

    /* compiled from: BaseFriendsListPresenter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FriendsListType.values().length];
            try {
                iArr[FriendsListType.ONLINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FriendsListType.MUTUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FriendsListType.ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public id6(jd6 jd6Var, AbsFriendsFragment absFriendsFragment, UsersSearch.Entrypoint entrypoint, eqs eqsVar) {
        this.a = jd6Var;
        this.b = absFriendsFragment;
        this.c = entrypoint;
        this.d = eqsVar;
        this.e = new ListDataSet<>();
        d1 d1Var = new d1(3);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.i = msy.a(lazyThreadSafetyMode, d1Var);
        this.j = msy.a(lazyThreadSafetyMode, new s5(this, 7));
        this.k = msy.a(lazyThreadSafetyMode, new t5(this, 9));
    }

    @Override // xsna.xqs
    public final boolean a() {
        return this.f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xqs
    public final void b(String str) {
        this.g = str;
        ((oa90) this.k.getValue()).g = str;
        boolean z = this.f;
        boolean z2 = !(str == null || str.length() == 0);
        this.f = z2;
        if (z2 != z) {
            e(z2);
        }
        com.vk.lists.c cVar = this.h;
        if (cVar != null) {
            cVar.p(false);
        }
    }

    @Override // xsna.xqs
    public final void c(UserProfile userProfile, int i) {
        Context mo2getContext = this.b.mo2getContext();
        if (mo2getContext != null) {
            this.d.a(userProfile, i, this.g, this.f, mo2getContext);
        }
    }

    @Override // xsna.xqs
    public void d() {
        e(false);
        this.b.d8(this.e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public void e(boolean z) {
        ?? r0 = this.j;
        ?? r1 = this.k;
        c.l lVar = z ? (oa90) r1.getValue() : (yi6) r0.getValue();
        oa90 oa90Var = (oa90) r1.getValue();
        io.reactivex.rxjava3.disposables.c cVar = oa90Var.h;
        if (cVar != null) {
            cVar.dispose();
        }
        oa90Var.h = null;
        yi6 yi6Var = (yi6) r0.getValue();
        io.reactivex.rxjava3.disposables.c cVar2 = yi6Var.c;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        yi6Var.c = null;
        this.e.clear();
        c.h hVar = new c.h(lVar);
        com.vk.lists.c cVar3 = this.h;
        if (cVar3 != null) {
            cVar3.v();
        }
        RecyclerPaginatedView recyclerPaginatedView = this.b.Z;
        this.h = com.vk.lists.f.a(hVar, recyclerPaginatedView != null ? recyclerPaginatedView : null);
    }

    public /* synthetic */ id6(jd6 jd6Var, AbsFriendsFragment absFriendsFragment, eqs eqsVar) {
        this(jd6Var, absFriendsFragment, null, eqsVar);
    }
}
