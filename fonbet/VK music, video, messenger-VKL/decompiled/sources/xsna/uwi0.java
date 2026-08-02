package xsna;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.stickers.settings.b;
import com.vk.voip.ui.watchmovie.selectsource.tabs.fragments.VoipVideoListFragment;
import kotlin.NoWhenBranchMatchedException;
import xsna.d1x0;
import xsna.gm50;
import xsna.j3v0;
import xsna.kxi0;
import xsna.msw0;
import xsna.qtt0;
import xsna.wlp0;
import xsna.wqs0;
import xsna.ywi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class uwi0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ uwi0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v20, types: [xsna.e5z, xsna.i3v0] */
    /* JADX WARN: Type inference failed for: r11v26, types: [xsna.msw0$a] */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.lifecycle.Lifecycle] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        final Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                kxi0 kxi0Var = (kxi0) obj2;
                gm50.a.a((vwi0) obj3, ((ywi0.a) obj).a, new qz40(kxi0Var, 23));
                kxi0Var.a.onNext(kxi0.a.MAIN_CALL_ADMIN);
                return s3q0.a;
            case 1:
                ((u6l0) obj3).l.a.c.invoke(new b.i(((v6l0) obj2).c.b));
                return s3q0.a;
            case 2:
                ((View) obj3).getParent().requestDisallowInterceptTouchEvent(false);
                ((com.vk.story.viewer.impl.presentation.stories.view.storyview.b) obj2).c();
                return s3q0.a;
            case 3:
                return new rmp0((wlp0) obj3, (wlp0.a) obj2);
            case 4:
                ((izs) obj3).invoke(new wqs0.l.c((BlockId.CompositeId) obj2, (zhf0) obj));
                return s3q0.a;
            case 5:
                s2u0 s2u0Var = (s2u0) obj;
                ((izs) obj3).invoke(new qtt0.e(((rtt0) obj2).b, s2u0Var.a, s2u0Var.b));
                return s3q0.a;
            case 6:
                ?? r3 = (Lifecycle) obj3;
                ?? r11 = new androidx.lifecycle.l() { // from class: xsna.i3v0
                    @Override // androidx.lifecycle.l
                    public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
                        jm00 jm00Var = (jm00) obj2;
                        switch (j3v0.d.$EnumSwitchMapping$0[event.ordinal()]) {
                            case 1:
                                jm00Var.d(new Bundle());
                                ofx.b();
                                return;
                            case 2:
                                jm00Var.b();
                                return;
                            case 3:
                                jm00Var.e();
                                return;
                            case 4:
                                jm00Var.a();
                                return;
                            case 5:
                                jm00Var.g();
                                return;
                            case 6:
                                jm00Var.f();
                                return;
                            case 7:
                                throw new IllegalStateException();
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    }
                };
                r3.addObserver(r11);
                return new j3v0.a(r3, r11);
            case 7:
                ((d7w0) obj3).l.b(((e7w0) obj2).b, true);
                return s3q0.a;
            case 8:
                msw0 msw0Var = (msw0) obj3;
                msw0.c cVar = (msw0.c) obj2;
                Object obj4 = msw0Var.h1;
                ?? r112 = obj4;
                if (obj4 == null) {
                    r112 = 0;
                }
                r112.b(cVar);
                msw0Var.dismiss();
                return s3q0.a;
            default:
                uzw0 uzw0Var = (uzw0) obj3;
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) obj2;
                d1x0.b bVar = (d1x0.b) obj;
                int i2 = VoipVideoListFragment.S;
                if (!(bVar instanceof d1x0.b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                uzw0Var.setItems(((d1x0.b.a) bVar).a);
                swipeRefreshLayout.setRefreshing(false);
                return s3q0.a;
        }
    }
}
