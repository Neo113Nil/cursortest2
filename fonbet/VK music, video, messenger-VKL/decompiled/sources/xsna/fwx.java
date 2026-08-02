package xsna;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.libvideo.api.VideoAutoPlayDelayType;
import com.vk.newsfeed.impl.newsfeed.presentation.base.fragment.NewsfeedFragment;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import xsna.hux;

/* compiled from: NewsfeedFragment.kt */
/* loaded from: classes4.dex */
public final class fwx implements wzs<s3q0, sq60, s3q0> {
    public atm b;
    public dj60 c;
    public btm d;
    public kr50 e;
    public iou f;
    public re40 g;
    public final AtomicReference<String> h;
    public final lxd i = new lxd(VideoAutoPlayDelayType.FEED);

    public fwx(atm atmVar, dj60 dj60Var, btm btmVar, kr50 kr50Var, iou iouVar, re40 re40Var, AtomicReference atomicReference) {
        this.b = atmVar;
        this.c = dj60Var;
        this.d = btmVar;
        this.e = kr50Var;
        this.f = iouVar;
        this.g = re40Var;
        this.h = atomicReference;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(s3q0 s3q0Var, sq60 sq60Var) {
        RecyclerView recyclerView;
        Integer num;
        View findViewByPosition;
        final sq60 sq60Var2 = sq60Var;
        dj60 dj60Var = this.c;
        if (dj60Var != null) {
            ct60 ct60Var = (ct60) dj60Var.invoke();
            atm atmVar = this.b;
            if (atmVar != null && (recyclerView = ((NewsfeedFragment) atmVar.c).k0) != null) {
                RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                Integer num2 = null;
                final LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                int i = 0;
                if (sq60Var2.e) {
                    num = Integer.valueOf(linearLayoutManager != null ? linearLayoutManager.v() : 0);
                } else {
                    num = null;
                }
                if (num != null) {
                    if (linearLayoutManager != null && (findViewByPosition = linearLayoutManager.findViewByPosition(num.intValue())) != null) {
                        i = findViewByPosition.getTop();
                    }
                    num2 = Integer.valueOf(i);
                }
                final Integer num3 = num2;
                ct60Var.k.g(new hux.d.b(sq60Var2.b));
                final Integer num4 = num;
                ct60Var.a().H0(recyclerView, new x6q(1, this, sq60Var2), new Runnable() { // from class: xsna.dwx
                    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
                    @Override // java.lang.Runnable
                    public final void run() {
                        btm btmVar;
                        Integer num5;
                        LinearLayoutManager linearLayoutManager2;
                        Integer num6 = num4;
                        if (num6 != null && (num5 = num3) != null && (linearLayoutManager2 = linearLayoutManager) != null) {
                            linearLayoutManager2.K(num6.intValue(), num5.intValue());
                        }
                        fwx fwxVar = this;
                        atm atmVar2 = fwxVar.b;
                        RecyclerView recyclerView2 = atmVar2 != null ? ((NewsfeedFragment) atmVar2.c).k0 : null;
                        dj60 dj60Var2 = fwxVar.c;
                        if (dj60Var2 != null) {
                            ct60 ct60Var2 = (ct60) dj60Var2.invoke();
                            sq60 sq60Var3 = sq60Var2;
                            boolean z = sq60Var3.d;
                            List<ol60> list = sq60Var3.a;
                            if (z && (btmVar = fwxVar.d) != null) {
                                btmVar.invoke();
                            }
                            Integer num7 = ct60Var2.d().d;
                            Integer num8 = ct60Var2.d().e;
                            if (sq60Var3.f && num7 != null && num8 != null) {
                                RecyclerView.o layoutManager2 = recyclerView2 != null ? recyclerView2.getLayoutManager() : null;
                                LinearLayoutManager linearLayoutManager3 = layoutManager2 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager2 : null;
                                if (linearLayoutManager3 != null) {
                                    linearLayoutManager3.K(num7.intValue(), num8.intValue());
                                }
                                rw60 d = ct60Var2.d();
                                d.d = null;
                                d.e = null;
                            }
                            ((o170) ct60Var2.c.V.getValue()).b(recyclerView2);
                            ct60Var2.e().a(list);
                            kr50 kr50Var = fwxVar.e;
                            yw90 yw90Var = kr50Var != null ? (yw90) kr50Var.invoke() : null;
                            re40 re40Var = fwxVar.g;
                            ct60Var2.g().c(list, re40Var != null ? (View) re40Var.invoke() : null, yw90Var);
                            xif0 xif0Var = ct60Var2.f().w;
                            if (xif0Var != null) {
                                xif0Var.a();
                            }
                            ehv ehvVar = (ehv) ct60Var2.m.b;
                            if (ehvVar != null) {
                                ehvVar.r();
                            }
                            iou iouVar = fwxVar.f;
                            if (iouVar != null) {
                                iouVar.invoke(null);
                            }
                        }
                    }
                }, sq60Var2.a, sq60Var2.c);
            }
        }
        return s3q0.a;
    }
}
