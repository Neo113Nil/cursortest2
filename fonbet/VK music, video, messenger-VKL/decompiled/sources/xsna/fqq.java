package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import com.vk.dto.newsfeed.FaveTag;
import com.vkontakte.android.VKActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: FaveFilterByTagView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes18.dex */
public final class fqq extends omq {
    public static final /* synthetic */ int h = 0;
    public y1o0 g;

    /* compiled from: FaveFilterByTagView.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        public static final a b = new a(1, h03.class, "showToastError", "showToastError(Ljava/lang/Throwable;)V", 1);

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            h03.b(th);
            return s3q0.a;
        }
    }

    public static s3q0 g(com.vk.lists.c cVar, fqq fqqVar, List list) {
        cVar.r(false);
        fqqVar.setTags(list);
        return s3q0.a;
    }

    private final void setTags(List<FaveTag> list) {
        ArrayList u0 = j5g.u0(list, Collections.singletonList(null));
        y1o0 y1o0Var = this.g;
        if (y1o0Var != null) {
            y1o0Var.setItems(u0);
        }
    }

    @Override // xsna.omq
    public final void a(FaveTag faveTag) {
        y1o0 y1o0Var = this.g;
        if (y1o0Var != null) {
            y1o0Var.z0(1, faveTag);
        }
    }

    @Override // xsna.omq
    public final void b(FaveTag faveTag) {
        y1o0 y1o0Var = this.g;
        if (y1o0Var != null) {
            List<FaveTag> y0 = y1o0Var.y0();
            int i = faveTag.b;
            ArrayList arrayList = (ArrayList) y0;
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                }
                Object b0 = j5g.b0(i2, arrayList);
                if ((b0 instanceof FaveTag) && i == ((FaveTag) b0).b) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 >= 0) {
                FaveTag faveTag2 = y1o0Var.f;
                if (faveTag2 != null && faveTag2.b == i) {
                    y1o0Var.K0(null);
                }
                y1o0Var.D0(i2);
            }
        }
    }

    @Override // xsna.omq
    public final void c(FaveTag faveTag) {
        y1o0 y1o0Var = this.g;
        if (y1o0Var != null) {
            List<FaveTag> y0 = y1o0Var.y0();
            int i = faveTag.b;
            ArrayList arrayList = (ArrayList) y0;
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                }
                Object b0 = j5g.b0(i2, arrayList);
                if ((b0 instanceof FaveTag) && i == ((FaveTag) b0).b) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 >= 0) {
                FaveTag faveTag2 = (FaveTag) ((ArrayList) y1o0Var.y0()).get(i2);
                FaveTag faveTag3 = y1o0Var.f;
                if (faveTag3 != null && faveTag3.b == i) {
                    y1o0Var.K0(faveTag);
                }
                y1o0Var.F0(faveTag2, faveTag);
            }
        }
    }

    @Override // xsna.omq
    public final void d(List<FaveTag> list) {
        y1o0 y1o0Var = this.g;
        if (y1o0Var != null) {
            if (((ArrayList) y1o0Var.y0()).size() <= 0 || j5g.Y(y1o0Var.y0()) != null) {
                y1o0Var.setItems(list);
                return;
            }
            ArrayList arrayList = new ArrayList(list);
            arrayList.add(0, null);
            y1o0Var.setItems(arrayList);
        }
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<List<FaveTag>> hj(com.vk.lists.c cVar, boolean z) {
        return ui(0, cVar);
    }

    @Override // com.vk.lists.c.l
    public final io.reactivex.rxjava3.core.q<List<? extends FaveTag>> ui(int i, com.vk.lists.c cVar) {
        enq.a.getClass();
        return rsg0.y0(new jqq(), null, null, 3);
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<List<FaveTag>> qVar, boolean z, com.vk.lists.c cVar) {
        io.reactivex.rxjava3.disposables.c subscribe = qVar.subscribe(new lf1(new v74(12, cVar, this), 24), new zl0(a.b, 28));
        Context context = getContext();
        if (!(context instanceof VKActivity) || subscribe == null) {
            return;
        }
        ((VKActivity) context).p.b(subscribe);
    }
}
