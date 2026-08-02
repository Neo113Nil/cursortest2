package defpackage;

import android.net.Uri;
import androidx.recyclerview.widget.x0;
import coil3.c;
import com.yandex.go.image.api.domain.models.ImageLoadPriority;
import core.flex.ui.OrientationAwareRecyclerView;
import kotlin.Pair;

/* loaded from: classes.dex */
public final /* synthetic */ class htk implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ htk(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Integer num;
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ktk ktkVar = new ktk((yrk) obj4);
                am2 d = ((mtk) obj3).a.d();
                String uri = ((Uri) obj).toString();
                aev aevVar = (aev) d.c;
                aevVar.c = new qbv(uri);
                d.c = aevVar;
                ImageLoadPriority imageLoadPriority = ImageLoadPriority.IMMEDIATE;
                m16 m16Var = vac.a;
                aevVar.b().b(clx.d, imageLoadPriority);
                d.c = aevVar;
                aevVar.e = new nfh(ktkVar, ktkVar, d);
                return new itk(new tac(0, ((c) ((oav) d.b)).a(aevVar.a())), ktkVar);
            default:
                flex.engine.section.c cVar = (flex.engine.section.c) obj4;
                int intValue = ((Integer) obj).intValue();
                Integer num2 = (Integer) obj2;
                int intValue2 = num2.intValue();
                j89 j89Var = cVar.I;
                j89Var.o = num2;
                j89Var.b();
                OrientationAwareRecyclerView orientationAwareRecyclerView = (OrientationAwareRecyclerView) ((nfh) obj3).b;
                d6w d6wVar = new d6w(intValue, intValue2, 1);
                int childCount = orientationAwareRecyclerView.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    x0 childViewHolder = orientationAwareRecyclerView.getChildViewHolder(orientationAwareRecyclerView.getChildAt(i2));
                    int F = childViewHolder.F();
                    if (F <= d6wVar.b && d6wVar.a <= F && (childViewHolder instanceof g170)) {
                        ((g170) childViewHolder).A();
                    }
                }
                l0z l0zVar = cVar.l0;
                if (!l0zVar.e && (num = l0zVar.c) != null) {
                    int intValue3 = num.intValue();
                    Integer num3 = l0zVar.d;
                    if (num3 != null) {
                        int intValue4 = num3.intValue();
                        if (intValue3 <= intValue2 && intValue4 >= intValue) {
                            l0zVar.e = true;
                            Pair a = cVar.e0.a();
                            if (a != null) {
                                String str = (String) a.getFirst();
                                String str2 = (String) a.getSecond();
                                wyi0 wyi0Var = cVar.B;
                                if (wyi0Var != null) {
                                    wyi0Var.p(str, str2);
                                }
                            }
                        }
                    }
                }
                return zy11.a;
        }
    }
}
