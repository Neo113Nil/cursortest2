package xsna;

import android.content.Context;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.friends.discover.UserDiscoverState;
import java.util.ArrayDeque;
import java.util.LinkedHashSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: BaseKeyPool.java */
/* loaded from: classes12.dex */
public abstract class of6 {
    public Object a;

    public void A(View view, int i, UserDiscoverState userDiscoverState) {
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
    }

    public void r(hvb0 hvb0Var) {
        ArrayDeque arrayDeque = (ArrayDeque) this.a;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(hvb0Var);
        }
    }

    public void s(kj50 kj50Var) {
        io.reactivex.rxjava3.subjects.d dVar = (io.reactivex.rxjava3.subjects.d) this.a;
        if (dVar != null) {
            dVar.onNext(kj50Var);
        }
    }

    public void t(Context context, Integer num, wzs wzsVar, izs izsVar) {
        io.reactivex.rxjava3.core.g gVar = (io.reactivex.rxjava3.core.g) wzsVar.invoke(context, Integer.valueOf((num != null ? num.intValue() : 1000) * 1000));
        gVar.getClass();
        io.reactivex.rxjava3.internal.operators.flowable.m mVar = new io.reactivex.rxjava3.internal.operators.flowable.m(new io.reactivex.rxjava3.internal.operators.flowable.i0(new io.reactivex.rxjava3.internal.operators.flowable.l(gVar)).j(io.reactivex.rxjava3.android.schedulers.a.b()), new m330(new l9a(izsVar, 2), 21), io.reactivex.rxjava3.internal.functions.a.d);
        new xpt(29);
        io.reactivex.rxjava3.disposables.c subscribe = mVar.subscribe(new cki0(), new dtb(new bqt(22), 1));
        io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) this.a;
        if (cVar != null) {
            cVar.dispose();
        }
        this.a = subscribe;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void u(View view, UserDiscoverState userDiscoverState) {
        if (view instanceof zov) {
            zov zovVar = (zov) view;
            zovVar.getForegroundPositive().setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            zovVar.getForegroundNegative().setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            zovVar.getIconPositive().setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            zovVar.getIconNegative().setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            zovVar.getTitlePositive().setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            zovVar.getTitleNegative().setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    public void z(View view, UserDiscoverState userDiscoverState) {
        view.setRotation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public of6(int i) {
        switch (i) {
            case 2:
                new bpn0(new g13(13));
                this.a = new ReentrantReadWriteLock();
                new CountDownLatch(1);
                new LinkedHashSet();
                break;
            case 3:
            default:
                char[] cArr = s2r0.a;
                this.a = new ArrayDeque(20);
                break;
            case 4:
                this.a = io.reactivex.rxjava3.subjects.d.N0();
                break;
        }
    }
}
