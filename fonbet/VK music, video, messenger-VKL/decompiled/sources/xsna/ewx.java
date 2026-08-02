package xsna;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.libvideo.api.VideoAutoPlayDelayType;
import com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment.DiscoverMediaTabFragment2;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: DiscoverMediaTabFragment2.kt */
/* loaded from: classes4.dex */
public final class ewx implements wzs<s3q0, sq60, s3q0> {
    public ozf b;
    public gbh c;
    public k6k d;
    public akh e;
    public xyh f;
    public final AtomicReference<String> g;
    public final lxd h = new lxd(VideoAutoPlayDelayType.FEED);

    public ewx(ozf ozfVar, gbh gbhVar, k6k k6kVar, odm odmVar, akh akhVar, xyh xyhVar, AtomicReference atomicReference) {
        this.b = ozfVar;
        this.c = gbhVar;
        this.d = k6kVar;
        this.e = akhVar;
        this.f = xyhVar;
        this.g = atomicReference;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(s3q0 s3q0Var, sq60 sq60Var) {
        RecyclerView recyclerView;
        gbh gbhVar;
        mo60 mo60Var;
        Integer num;
        View findViewByPosition;
        final sq60 sq60Var2 = sq60Var;
        ozf ozfVar = this.b;
        if (ozfVar != null && (recyclerView = ((DiscoverMediaTabFragment2) ozfVar.c).n0) != null && (gbhVar = this.c) != null && (mo60Var = (mo60) gbhVar.invoke()) != null) {
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
            final Integer num4 = num;
            mo60Var.b().H0(recyclerView, new ja3(5, this, sq60Var2), new Runnable() { // from class: xsna.cwx
                /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
                @Override // java.lang.Runnable
                public final void run() {
                    mo60 mo60Var2;
                    k6k k6kVar;
                    Integer num5;
                    LinearLayoutManager linearLayoutManager2;
                    Integer num6 = num4;
                    if (num6 != null && (num5 = num3) != null && (linearLayoutManager2 = linearLayoutManager) != null) {
                        linearLayoutManager2.K(num6.intValue(), num5.intValue());
                    }
                    ewx ewxVar = this;
                    ozf ozfVar2 = ewxVar.b;
                    Object obj = null;
                    RecyclerView recyclerView2 = ozfVar2 != null ? ((DiscoverMediaTabFragment2) ozfVar2.c).n0 : null;
                    gbh gbhVar2 = ewxVar.c;
                    if (gbhVar2 == null || (mo60Var2 = (mo60) gbhVar2.invoke()) == null) {
                        return;
                    }
                    sq60 sq60Var3 = sq60Var2;
                    boolean z = sq60Var3.d;
                    List<ol60> list = sq60Var3.a;
                    if (z && (k6kVar = ewxVar.d) != null) {
                        k6kVar.invoke();
                    }
                    ((o170) mo60Var2.V.getValue()).b(recyclerView2);
                    mo60Var2.f().a(list);
                    akh akhVar = ewxVar.e;
                    View view = akhVar != null ? (View) akhVar.invoke() : null;
                    xyh xyhVar = ewxVar.f;
                    x5n x5nVar = xyhVar != null ? ((DiscoverMediaTabFragment2) xyhVar.c).d0 : null;
                    if (x5nVar != null) {
                        for (Object obj2 : list) {
                            ol60 ol60Var = (ol60) obj2;
                            if ((ol60Var instanceof z1c0) || (ol60Var instanceof o070)) {
                                obj = obj2;
                                break;
                            }
                        }
                        if (obj != null && !x5nVar.d) {
                            x5nVar.d = true;
                            jse0 jse0Var = x5nVar.c;
                            if (jse0Var != null) {
                                jse0Var.d(view);
                            }
                            ((yw90) x5nVar.a.invoke()).a();
                        }
                    }
                    ehv ehvVar = (ehv) mo60Var2.p.b;
                    if (ehvVar != null) {
                        ehvVar.r();
                    }
                }
            }, sq60Var2.a, sq60Var2.c);
        }
        return s3q0.a;
    }
}
