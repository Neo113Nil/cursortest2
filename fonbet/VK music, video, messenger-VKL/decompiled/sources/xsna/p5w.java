package xsna;

import android.graphics.Rect;
import com.vk.catalog2.feature.music.configuration.b;
import com.vk.core.view.components.paging.list.a;
import com.vk.documents.impl.SearchDocumentsListFragment;
import com.vk.dto.articles.Article;
import com.vk.dto.group.Group;
import com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.NewsfeedCustomFragment2;
import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import xsna.d4p;
import xsna.n4t0;
import xsna.wfu;
import xsna.x940;
import xsna.y490;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class p5w implements io.reactivex.rxjava3.functions.l, ptk0, jwp, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.g, yads.ng1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p5w(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.ptk0
    public void a(lm50 lm50Var) {
        we60 we60Var = ((NewsfeedCustomFragment2) this.c).U;
        s3q0 s3q0Var = s3q0.a;
        we60Var.b.r(s3q0Var, (zg60) lm50Var);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (Pair) ((xgv) this.c).invoke(obj);
            case 1:
            case 7:
            case 14:
            case 15:
            case 22:
            case 24:
            case 26:
            default:
                return (io.reactivex.rxjava3.core.t) ((p0p0) this.c).invoke(obj);
            case 2:
                return (d4p.a) ((lt20) this.c).invoke(obj);
            case 3:
                return (io.reactivex.rxjava3.core.b0) ((g6) this.c).invoke(obj);
            case 4:
                return (hda) ((x940.b) this.c).invoke(obj);
            case 5:
                return (hda) ((b.d) this.c).invoke(obj);
            case 6:
                return (List) ((eaa) this.c).invoke(obj);
            case 8:
                return (Article) ((gzn) this.c).invoke(obj);
            case 9:
                return (wfu.a.b) ((y490.a) this.c).invoke(obj);
            case 10:
                return (it80) ((xgv) this.c).invoke(obj);
            case 11:
                return (qma0) ((h2w) this.c).invoke(obj);
            case 12:
                return (Group) ((xgv) this.c).invoke(obj);
            case 13:
                return (llh0) ((h2w) this.c).invoke(obj);
            case 16:
                return (Pair) ((zkb) this.c).invoke(obj);
            case 17:
                return (ArrayList) ((dgt) this.c).invoke(obj);
            case 18:
                return (io.reactivex.rxjava3.core.t) ((gmj0) this.c).invoke(obj);
            case 19:
                return (t6k0) ((c220) this.c).invoke(obj);
            case 20:
                return (io.reactivex.rxjava3.core.t) ((tml0) this.c).invoke(obj);
            case 21:
                return (it80) ((tml0) this.c).invoke(obj);
            case 23:
                return (hda) ((n4t0.b) this.c).invoke(obj);
            case 25:
                return (xbu0) ((eni0) this.c).invoke(obj);
            case 27:
                return (io.reactivex.rxjava3.core.t) ((tml0) this.c).invoke(obj);
        }
    }

    @Override // io.reactivex.rxjava3.functions.g
    public Object d(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 24:
                return (Rect) ((u0r) this.c).invoke(obj, obj2, obj3);
            default:
                return (VoipActionsFeatureState.p) ((ux6) this.c).invoke(obj, obj2, obj3);
        }
    }

    @Override // yads.ng1
    public void invoke(Object obj) {
        ((yads.nf2) obj).onPlayerStateChanged(r0.l, ((yads.df2) this.c).e);
    }

    @Override // xsna.jwp
    public com.vk.core.view.components.paging.list.a provide() {
        SearchDocumentsListFragment searchDocumentsListFragment = (SearchDocumentsListFragment) this.c;
        int i = SearchDocumentsListFragment.h0;
        return a.C0851a.a(searchDocumentsListFragment.requireContext(), new p1d0(searchDocumentsListFragment, 9));
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 15:
                return ((Boolean) ((fuc0) this.c).invoke(obj)).booleanValue();
            default:
                ((fuc0) this.c).invoke(obj);
                return Boolean.TRUE.booleanValue();
        }
    }
}
