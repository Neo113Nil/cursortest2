package xsna;

import android.view.View;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.api.users.UsersSearch;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.friends.api.presentation.FriendsSelectionType;
import com.vk.friends.impl.friends.presentation.fragment.AbsFriendsFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.r1r0;

/* compiled from: FriendsSelectionPresenter.kt */
/* loaded from: classes15.dex */
public final class kts extends md6 {
    public final izs<UserProfile, s3q0> n;
    public final izs<List<? extends UserProfile>, s3q0> o;
    public final gzs<s3q0> p;
    public final io.reactivex.rxjava3.disposables.b q;
    public final its r;
    public final Object s;
    public final j2r0 t;

    /* compiled from: FriendsSelectionPresenter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FriendsSelectionType.values().length];
            try {
                iArr[FriendsSelectionType.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FriendsSelectionType.MULTIPLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public kts(jd6 jd6Var, AbsFriendsFragment absFriendsFragment, List list, FriendsSelectionType friendsSelectionType, izs izsVar, y87 y87Var, gzs gzsVar, io.reactivex.rxjava3.disposables.b bVar, its itsVar, UsersSearch.Entrypoint entrypoint, eqs eqsVar) {
        super(friendsSelectionType, jd6Var, absFriendsFragment, list, entrypoint, eqsVar);
        this.n = izsVar;
        this.o = y87Var;
        this.p = gzsVar;
        this.q = bVar;
        this.r = itsVar;
        this.s = msy.a(LazyThreadSafetyMode.NONE, new fn4(13));
        this.t = new j2r0();
    }

    @Override // xsna.md6
    public final void f(UserProfile userProfile, boolean z) {
        LinkedHashMap linkedHashMap = this.m;
        if (z) {
            linkedHashMap.put(userProfile.c, userProfile);
        } else {
            linkedHashMap.remove(userProfile.c);
        }
        int i = a.$EnumSwitchMapping$0[this.l.ordinal()];
        if (i == 1) {
            h();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.r.invoke();
        }
    }

    @Override // xsna.md6
    public final void g() {
        gzs<s3q0> gzsVar = this.p;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.md6
    public final void h() {
        LinkedHashMap linkedHashMap = this.m;
        List<? extends UserProfile> V = j5g.V(linkedHashMap.values());
        Set entrySet = linkedHashMap.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : entrySet) {
            if (((Map.Entry) obj).getValue() == null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((UserId) ((Map.Entry) it.next()).getKey());
        }
        if (arrayList2.isEmpty()) {
            i(V);
            return;
        }
        AbsFriendsFragment absFriendsFragment = this.b;
        absFriendsFragment.po().setVisibility(8);
        View view = absFriendsFragment.a0;
        if (view == null) {
            view = null;
        }
        view.setVisibility(0);
        View view2 = absFriendsFragment.b0;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        View view3 = absFriendsFragment.c0;
        if (view3 == null) {
            view3 = null;
        }
        view3.setVisibility(8);
        absFriendsFragment.so();
        this.q.b(rsg0.y0(yfb.x(r1r0.a.b((s1r0) this.s.getValue(), arrayList2, e43.l(UsersFieldsDto.ONLINE, UsersFieldsDto.VERIFIED, UsersFieldsDto.TRENDING, UsersFieldsDto.IS_NFT, UsersFieldsDto.PHOTO_BASE), null, null, 58)), null, null, 3).subscribe(new hz(new lh(15, V, this), 26)));
    }

    public final void i(List<? extends UserProfile> list) {
        izs<UserProfile, s3q0> izsVar;
        int i = a.$EnumSwitchMapping$0[this.l.ordinal()];
        if (i == 1) {
            UserProfile userProfile = (UserProfile) j5g.b0(0, list);
            if (userProfile == null || (izsVar = this.n) == null) {
                return;
            }
            izsVar.invoke(userProfile);
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        izs<List<? extends UserProfile>, s3q0> izsVar2 = this.o;
        if (izsVar2 != null) {
            izsVar2.invoke(list);
        }
    }
}
