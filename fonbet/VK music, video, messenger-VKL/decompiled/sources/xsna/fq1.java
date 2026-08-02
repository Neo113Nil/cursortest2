package xsna;

import android.app.Activity;
import android.content.Context;
import com.vk.catalog2.common.dto.api.replacement.CatalogReplacementResponse;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.dto.common.data.VKList;
import com.vk.ecomm.market.album.MarketEditAlbumGoodsFragment;
import com.vk.ecomm.reviews.impl.allreviews.presentation.c;
import com.vk.friends.recommendations.impl.presentation.FriendsImportFragment;
import com.vk.money.MoneyTransferPagerFragment;
import com.vk.newsfeed.impl.newsfeed.presentation.base.fragment.NewsfeedFragment;
import com.vk.photos.root.photoflow.domain.AlbumsRepository;
import com.vk.voip.ui.onboarding.ui.CallOnboardingView;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import ru.ok.face.entity.FaceFigure;
import ru.ok.face.pipeline_frugal.FrugalKeypointPipeline;
import ru.ok.tensorflow.util.Predicate;
import xsna.ea6;
import xsna.vs60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class fq1 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.g, io.reactivex.rxjava3.functions.c, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.b, Predicate, SwipeDrawableRefreshLayout.g {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fq1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    public void a() {
        ((MoneyTransferPagerFragment) this.c).finish();
    }

    @Override // io.reactivex.rxjava3.functions.b
    public void accept(Object obj, Object obj2) {
        ((f4o) this.c).invoke(obj, obj2);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Boolean apply(Object obj) {
        Boolean lambda$process$5;
        lambda$process$5 = ((FrugalKeypointPipeline) this.c).lambda$process$5((FaceFigure) obj);
        return lambda$process$5;
    }

    @Override // io.reactivex.rxjava3.functions.g
    public Object d(Object obj, Object obj2, Object obj3) {
        return (hda) ((v9a) this.c).invoke(obj, obj2, obj3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006e, code lost:
    
        if ((r0.a.g ? r0.a() : r0.c.get()) != false) goto L30;
     */
    @Override // com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h() {
        iur iurVar;
        NewsfeedFragment newsfeedFragment = (NewsfeedFragment) this.c;
        qcy<Object>[] qcyVarArr = NewsfeedFragment.J0;
        ((at60) newsfeedFragment.W.getValue()).a(vs60.g.b.b);
        d070 f = newsfeedFragment.fo().f();
        Iterator<rov> it = f.o.iterator();
        while (it.hasNext()) {
            rov next = it.next();
            if (next != null) {
                if (next instanceof rql0) {
                    ((rql0) next).q6();
                }
                s3q0 s3q0Var = s3q0.a;
            } else {
                it.remove();
            }
        }
        cht chtVar = f.k;
        boolean z = true;
        if (chtVar != null) {
            chtVar.c = 0;
            chtVar.d = 0;
            chtVar.e = true;
        }
        gkq gkqVar = newsfeedFragment.C0;
        if (gkqVar != null) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            HashSet hashSet = iah0.a;
            if (!fnj.b(context)) {
            }
            z = false;
            if (!z || pla.e().b().n() || (iurVar = gkqVar.d) == null) {
                return;
            }
            Activity h = e3m.h(iurVar.a.getContext());
            lur lurVar = iurVar.d;
            lurVar.setVisibility(0);
            lurVar.b.m0();
            if (!iurVar.b || h == null) {
                return;
            }
            p90.b(h, 0, false);
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        int i = this.b;
        bz bzVar = (bz) this.c;
        switch (i) {
            case 11:
                break;
            default:
                kpp kppVar = opp.T;
                break;
        }
        return ((Boolean) bzVar.invoke(obj)).booleanValue();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (AlbumsRepository.a) ((com.vk.movika.sdk.base.observable.e) obj2).invoke(obj);
            case 1:
                return (lw4) ((s8) obj2).invoke(obj);
            case 2:
                return (ea6.d) ((com.vk.movika.sdk.base.observable.e) obj2).invoke(obj);
            case 3:
                int i2 = CallOnboardingView.j;
                return (g69) ((i37) obj2).invoke(obj);
            case 4:
                return (Boolean) ((bz) obj2).invoke(obj);
            case 5:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 18:
            case 25:
            case 27:
            default:
                return (io.reactivex.rxjava3.core.t) ((fa00) obj2).invoke(obj);
            case 6:
                return (CatalogReplacementResponse) ((du0) obj2).invoke(obj);
            case 7:
                return (io.reactivex.rxjava3.core.t) ((u8) obj2).invoke(obj);
            case 9:
                int i3 = d2h.p1;
                return (String) ((bz) obj2).invoke(obj);
            case 10:
                return (VKList) ((bz) obj2).invoke(obj);
            case 12:
                return (HashSet) ((bz) obj2).invoke(obj);
            case 16:
                return (List) ((uoh) obj2).invoke(obj);
            case 17:
                int i4 = FriendsImportFragment.a0;
                return (List) ((rvq) obj2).invoke(obj);
            case 19:
                return (Boolean) ((py) obj2).invoke(obj);
            case 20:
                return (qtd0) ((ieo) obj2).invoke(obj);
            case 21:
                return (io.reactivex.rxjava3.core.b0) ((bz) obj2).invoke(obj);
            case 22:
                return (c.l) ((ju) obj2).invoke(obj);
            case 23:
                int i5 = MarketEditAlbumGoodsFragment.c1;
                return (io.reactivex.rxjava3.core.t) ((ju) obj2).invoke(obj);
            case 24:
                return (v8v) ((ju) obj2).invoke(obj);
            case 26:
                return (List) ((yf1) obj2).invoke(obj);
            case 28:
                return (io.reactivex.rxjava3.core.b0) ((gb) obj2).invoke(obj);
        }
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (Pair) ((jue) this.c).invoke(obj, obj2);
    }
}
