package xsna;

import com.vk.profile.user.impl.domain.edit.avatar.AvatarPopupChoice;
import com.vk.profile.user.impl.domain.edit.nickname.popup.NicknamePopupChoice;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.tiq0;
import xsna.wiq0;
import xsna.xiq0;
import xsna.yiq0;
import xsna.yjq0;

/* compiled from: UserEditProfileReducer.kt */
/* loaded from: classes5.dex */
public final class xjq0 extends dm50<zjq0, wiq0, yjq0> {
    public final Object d;

    public xjq0() {
        super(yjq0.v);
        this.d = msy.a(LazyThreadSafetyMode.NONE, new w5k0(3));
    }

    /* JADX WARN: Type inference failed for: r13v14, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.dm50
    public final yjq0 c(yjq0 yjq0Var, wiq0 wiq0Var) {
        yjq0 yjq0Var2 = yjq0Var;
        wiq0 wiq0Var2 = wiq0Var;
        yjq0.d dVar = yjq0Var2.o;
        yjq0.c cVar = yjq0Var2.r;
        yjq0.e eVar = yjq0Var2.i;
        yjq0.b bVar = yjq0Var2.n;
        if (wiq0Var2 instanceof tiq0) {
            tiq0 tiq0Var = (tiq0) wiq0Var2;
            if (epx.f(tiq0Var, tiq0.a.b)) {
                return yjq0.a(yjq0Var2, false, false, null, null, null, null, null, null, null, false, false, yjq0.b.a(bVar), null, null, false, null, false, false, null, 2093055);
            }
            if (!(tiq0Var instanceof tiq0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            List<AvatarPopupChoice> list = ((tiq0.b) tiq0Var).b;
            bVar.getClass();
            return yjq0.a(yjq0Var2, false, false, null, null, null, null, null, null, null, false, false, new yjq0.b(list, true), null, null, false, null, false, false, null, 2093055);
        }
        if (wiq0Var2 instanceof xiq0) {
            xiq0 xiq0Var = (xiq0) wiq0Var2;
            if (epx.f(xiq0Var, xiq0.a.b)) {
                return yjq0.a(yjq0Var2, false, false, null, null, null, null, null, null, null, false, false, null, null, null, false, null, false, false, null, 2095103);
            }
            if (epx.f(xiq0Var, xiq0.b.b)) {
                return yjq0.a(yjq0Var2, false, false, null, null, null, null, null, null, null, false, true, null, null, null, false, null, false, false, null, 2095103);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (wiq0Var2 instanceof wiq0.a) {
            wiq0.a aVar = (wiq0.a) wiq0Var2;
            if (epx.f(aVar, uiq0.b)) {
                return yjq0.a(yjq0Var2, false, false, null, null, null, null, null, null, null, false, false, null, null, null, false, null, false, false, null, 2096127);
            }
            if (epx.f(aVar, viq0.b)) {
                return yjq0.a(yjq0Var2, false, false, null, null, null, null, null, null, null, true, false, null, null, null, false, null, false, false, null, 2096127);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (wiq0Var2 instanceof ziq0) {
            return yjq0.a(yjq0Var2, false, false, null, null, null, null, yjq0.e.a(eVar, false, 2), null, null, false, false, null, null, null, false, null, false, false, null, 2097023);
        }
        if (wiq0Var2 instanceof ajq0) {
            return yjq0.a(yjq0Var2, false, false, null, null, null, null, yjq0.e.a(eVar, false, 1), null, null, false, false, null, null, null, false, null, false, false, null, 2097023);
        }
        if (wiq0Var2 instanceof bjq0) {
            bjq0 bjq0Var = (bjq0) wiq0Var2;
            akq0 akq0Var = bjq0Var.c;
            ir5 ir5Var = akq0Var.a;
            o2k o2kVar = akq0Var.b;
            ExtendedUserProfile extendedUserProfile = bjq0Var.b;
            String str = extendedUserProfile.a.e;
            String str2 = extendedUserProfile.A0;
            yjq0.e eVar2 = new yjq0.e(akq0Var.c, false);
            String str3 = akq0Var.d;
            yjq0.a aVar2 = new yjq0.a(0);
            yjq0.b a = yjq0.b.a(bVar);
            ExtendedUserProfile extendedUserProfile2 = bjq0Var.b;
            boolean z = ((Boolean) this.d.getValue()).booleanValue() ? false : extendedUserProfile2.a.b0;
            boolean z2 = akq0Var.e;
            e4s e4sVar = bjq0Var.d;
            yjq0.c cVar2 = new yjq0.c(z2, e4sVar.a, e4sVar.b);
            boolean z3 = extendedUserProfile.A1;
            ezd0 ezd0Var = bjq0Var.e;
            boolean z4 = ezd0Var.a;
            String str4 = ezd0Var.c;
            String str5 = ezd0Var.b;
            return yjq0.a(yjq0Var2, false, false, ir5Var, o2kVar, str, str2, eVar2, str3, aVar2, false, false, a, null, extendedUserProfile2, z, cVar2, z3, false, new yjq0.f(z4 && str5.length() > 0 && str4.length() > 0, str5, str4), 1318916);
        }
        if (wiq0Var2 instanceof ejq0) {
            return yjq0.v;
        }
        if (wiq0Var2 instanceof djq0) {
            return yjq0.a(yjq0Var2, false, true, null, null, null, null, null, null, null, false, false, null, null, null, false, null, false, false, null, 2097146);
        }
        if (wiq0Var2 instanceof cjq0) {
            return yjq0.a(yjq0Var2, false, false, null, null, null, null, null, null, null, false, false, null, null, null, false, null, false, false, null, 2097146);
        }
        if (wiq0Var2.equals(fjq0.b)) {
            return yjq0.a(yjq0Var2, true, false, null, null, null, null, null, null, null, false, false, null, null, null, false, null, false, false, null, 2097148);
        }
        if (wiq0Var2 instanceof gjq0) {
            ExtendedUserProfile extendedUserProfile3 = ((gjq0) wiq0Var2).b;
            return yjq0.a(yjq0Var2, false, false, null, null, extendedUserProfile3.a.e, extendedUserProfile3.A0, null, null, null, false, false, null, null, extendedUserProfile3, false, null, false, false, null, 2080671);
        }
        int i = 6;
        if (wiq0Var2 instanceof wiq0.e) {
            akq0 akq0Var2 = ((wiq0.e) wiq0Var2).b;
            return yjq0.a(yjq0Var2, false, false, akq0Var2.a, akq0Var2.b, null, null, yjq0.e.a(eVar, akq0Var2.c, 2), akq0Var2.d, null, false, false, null, null, null, false, yjq0.c.a(cVar, akq0Var2.e, false, null, 6), false, false, null, 2031207);
        }
        if (wiq0Var2 instanceof yiq0) {
            yiq0 yiq0Var = (yiq0) wiq0Var2;
            if (yiq0Var instanceof yiq0.a) {
                return yjq0.a(yjq0Var2, false, false, null, null, null, null, null, null, null, false, false, null, new yjq0.d(dVar.a, false), null, false, null, false, false, null, 2088959);
            }
            if (!(yiq0Var instanceof yiq0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            List<NicknamePopupChoice> list2 = ((yiq0.b) yiq0Var).b;
            dVar.getClass();
            return yjq0.a(yjq0Var2, false, false, null, null, null, null, null, null, null, false, false, null, new yjq0.d(list2, true), null, false, null, false, false, null, 2088959);
        }
        if (wiq0Var2 instanceof wiq0.c) {
            wiq0.c cVar3 = (wiq0.c) wiq0Var2;
            if (cVar3 instanceof wiq0.c.a) {
                return yjq0.a(yjq0Var2, false, false, null, null, null, null, null, null, null, false, false, null, null, null, false, null, ((wiq0.c.a) cVar3).b, false, null, 1966079);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (wiq0Var2 instanceof wiq0.d) {
            wiq0.d dVar2 = (wiq0.d) wiq0Var2;
            if (dVar2 instanceof wiq0.d.a) {
                return yjq0.a(yjq0Var2, false, false, null, null, null, null, null, null, null, false, false, null, null, null, false, null, false, ((wiq0.d.a) dVar2).b, null, 1835007);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (wiq0Var2 instanceof wiq0.b) {
            wiq0.b bVar2 = (wiq0.b) wiq0Var2;
            if (!(bVar2 instanceof wiq0.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            e4s e4sVar2 = ((wiq0.b.a) bVar2).b;
            return yjq0.a(yjq0Var2, false, false, null, null, null, null, null, null, null, false, false, null, null, null, false, yjq0.c.a(cVar, false, e4sVar2.a, e4sVar2.b, 1), false, false, null, 2031615);
        }
        if (!(wiq0Var2 instanceof wiq0.f)) {
            throw new NoWhenBranchMatchedException();
        }
        if (((wiq0.f) wiq0Var2).equals(wiq0.f.a.b)) {
            return yjq0.a(yjq0Var2, false, false, null, null, null, null, null, null, null, false, false, null, null, null, false, null, false, false, new yjq0.f(i), 1572863);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final zjq0 d() {
        return new zjq0(e(new nc90(22)));
    }

    @Override // xsna.dm50
    public final void h(yjq0 yjq0Var, zjq0 zjq0Var) {
        f(zjq0Var.a, yjq0Var);
    }
}
