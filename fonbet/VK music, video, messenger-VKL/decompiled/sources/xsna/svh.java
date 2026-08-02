package xsna;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.billing.InAppPurchaseManagerException;
import com.vk.fave.api.FaveLoadState;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.newsfeed.impl.fave_feed.presentation.fragment.FaveFeedFragment;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class svh implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ svh(com.vk.billing.h hVar, String str, AtomicInteger atomicInteger, JSONObject jSONObject, String str2) {
        this.b = 2;
        this.c = hVar;
        this.e = str;
        this.d = atomicInteger;
        this.f = jSONObject;
        this.g = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r4v1, types: [io.reactivex.rxjava3.disposables.c] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r9v1, types: [xsna.vvh] */
    @Override // java.lang.Runnable
    public final void run() {
        io.reactivex.rxjava3.disposables.c subscribe;
        int i = this.b;
        Object obj = this.g;
        Object obj2 = this.f;
        ?? r4 = 0;
        r4 = 0;
        Object obj3 = this.d;
        Object obj4 = this.e;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                ?? r9 = (vvh) obj3;
                String str = (String) obj4;
                com.vk.movika.sdk.base.observable.o oVar = (com.vk.movika.sdk.base.observable.o) obj2;
                mh3 mh3Var = (mh3) obj;
                RecyclerView.e0 findViewHolderForLayoutPosition = ((RecyclerView) obj5).findViewHolderForLayoutPosition(r9.m.y.f());
                w3c0 w3c0Var = findViewHolderForLayoutPosition instanceof w3c0 ? (w3c0) findViewHolderForLayoutPosition : null;
                if (w3c0Var == null) {
                    r9.l = false;
                    return;
                }
                View findViewById = w3c0Var.itemView.findViewById(R.id.post_header_options);
                if (r9.e(findViewById, str, oVar, mh3Var)) {
                    return;
                }
                io.reactivex.rxjava3.core.q<?> qVar = r9.g;
                if (qVar != null && (subscribe = qVar.a0(io.reactivex.rxjava3.android.schedulers.a.b()).D(new um0(new yvh(r9, findViewById, str, oVar, mh3Var), 20)).subscribe()) != null) {
                    r9.a(subscribe);
                    r4 = subscribe;
                }
                r9.u = r4;
                return;
            case 1:
                Integer num = (Integer) obj5;
                Integer num2 = (Integer) obj3;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) obj4;
                FaveFeedFragment faveFeedFragment = (FaveFeedFragment) obj2;
                sq60 sq60Var = (sq60) obj;
                qcy<Object>[] qcyVarArr = FaveFeedFragment.s0;
                if (num != null && num2 != null && linearLayoutManager != null) {
                    linearLayoutManager.K(num.intValue(), num2.intValue());
                }
                boolean z = sq60Var.d;
                List<ol60> list = sq60Var.a;
                if (z) {
                    RecyclerView recyclerView = faveFeedFragment.b0;
                    RecyclerView.o layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
                    LinearLayoutManager linearLayoutManager2 = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    if (linearLayoutManager2 != null) {
                        linearLayoutManager2.K(0, 0);
                    }
                }
                ((o170) faveFeedFragment.go().r.getValue()).b(faveFeedFragment.b0);
                faveFeedFragment.go().d().a(list);
                ehv ehvVar = (ehv) faveFeedFragment.go().g.b;
                if (ehvVar != null) {
                    ehvVar.r();
                }
                if (list.isEmpty()) {
                    return;
                }
                faveFeedFragment.jo(FaveLoadState.NORMAL);
                return;
            default:
                com.vk.billing.h hVar = (com.vk.billing.h) obj5;
                String str2 = (String) obj4;
                AtomicInteger atomicInteger = (AtomicInteger) obj3;
                ysd ysdVar = new ysd((JSONObject) obj2, (String) obj, hVar, atomicInteger);
                try {
                    try {
                        o27 o27Var = hVar.b;
                        List singletonList = Collections.singletonList(str2);
                        o27Var.getClass();
                        o27.b("inapp", singletonList, ysdVar);
                    } catch (Exception e) {
                        L l = L.a;
                        l.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l, L.LogType.e, new Object[]{"Billing : PurchasesManager", "Error during tracking in-app purchase"});
                        }
                        com.vk.metrics.eventtracking.b.a.a(new InAppPurchaseManagerException(e));
                    }
                    return;
                } finally {
                    com.vk.billing.h.r(atomicInteger, null);
                }
        }
    }

    public /* synthetic */ svh(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }
}
