package xsna;

import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.newsfeed.impl.presentation.suggested.presentation.fragment.SuggestedPostsFragment;
import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;
import com.vk.voip.ui.broadcast.fragments.info.StreamInfoFragment;
import java.util.List;
import xsna.boq0;
import xsna.doh0;
import xsna.k4n0;
import xsna.mix0;
import xsna.xn60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class utg0 implements io.reactivex.rxjava3.functions.c, io.reactivex.rxjava3.functions.l, SwipeDrawableRefreshLayout.g, mix0.a, io.reactivex.rxjava3.functions.h, yads.ng1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ utg0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return (io.reactivex.rxjava3.core.q) ((ccm) this.c).invoke(obj, obj2);
            default:
                return (doh0.a) ((w61) this.c).invoke(obj, obj2);
        }
    }

    @Override // io.reactivex.rxjava3.functions.h
    public Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        return (VoipActionsFeatureState.b) ((tcw0) this.c).invoke(obj, obj2, obj3, obj4);
    }

    @Override // com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout.g
    public void h() {
        SuggestedPostsFragment suggestedPostsFragment = (SuggestedPostsFragment) this.c;
        qcy<Object>[] qcyVarArr = SuggestedPostsFragment.r0;
        v3n0 v3n0Var = (v3n0) suggestedPostsFragment.W.getValue();
        k4n0.c cVar = new k4n0.c(xn60.d.b.b);
        w4n0 w4n0Var = (w4n0) v3n0Var.a.invoke();
        if (w4n0Var != null) {
            w4n0Var.b(cVar);
        }
    }

    @Override // yads.ng1
    public void invoke(Object obj) {
        ((yads.nf2) obj).b(((yads.df2) this.c).f);
    }

    @Override // xsna.mix0.a
    public void onComplete(long j) {
        m1w0 m1w0Var = (m1w0) this.c;
        if (j == 1337) {
            m1w0Var.b.k();
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 2:
                return (hda) ((khj0) obj2).invoke(obj);
            case 3:
                return (io.reactivex.rxjava3.core.t) ((pod0) obj2).invoke(obj);
            case 4:
                int i2 = StreamInfoFragment.S;
                return (it80) ((oi40) obj2).invoke(obj);
            case 5:
            default:
                return (io.reactivex.rxjava3.core.t) ((ubt0) obj2).invoke(obj);
            case 6:
                return ((boq0.c) obj2).invoke(obj);
            case 7:
                return (List) ((pod0) obj2).invoke(obj);
            case 8:
                return (io.reactivex.rxjava3.core.b0) ((pod0) obj2).invoke(obj);
        }
    }
}
