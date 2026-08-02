package defpackage;

import com.yandex.go.mainscreen.superapp.impl.fragment.a;
import com.yandex.go.navigation.api.router.FragmentAnimation$TransitionType;
import ru.yandex.taxi.fragment.BaseFragment;

/* loaded from: classes.dex */
public abstract class dds extends h55 implements lwk0 {
    public xbs D;
    public bf4 E;

    public dds() {
        super(null);
    }

    @Override // defpackage.h55
    public void G(Object obj) {
        BaseFragment T = T(obj);
        a P = P();
        xbs xbsVar = this.D;
        if (xbsVar == null) {
            xbsVar = S(obj);
        }
        if (P.d(T, xbsVar) && T.isAttachedAndActive()) {
            bf4 R = R(T);
            P().k.a.push(R);
            this.E = R;
            Q(obj, T);
        }
        this.D = null;
    }

    @Override // defpackage.h55
    public void H(Object obj) {
        this.D = U();
        bf4 bf4Var = this.E;
        if (bf4Var != null) {
            P().k.a.remove(bf4Var);
        }
        this.E = null;
    }

    @Override // defpackage.h55
    public void I(Object obj) {
        this.D = null;
    }

    public abstract a P();

    public void Q(Object obj, BaseFragment baseFragment) {
    }

    public bf4 R(BaseFragment baseFragment) {
        return new cds(this);
    }

    public xbs S(Object obj) {
        return new wbs(FragmentAnimation$TransitionType.ENTER);
    }

    public abstract BaseFragment T(Object obj);

    public xbs U() {
        return new wbs(FragmentAnimation$TransitionType.RETURN);
    }
}
