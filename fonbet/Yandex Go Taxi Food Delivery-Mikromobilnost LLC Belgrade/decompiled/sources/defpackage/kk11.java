package defpackage;

import android.view.View;
import androidx.compose.ui.layout.o;
import core.flex.ui.OrientationAwareRecyclerView;
import flex.engine.section.model.ScrollPosition;

/* loaded from: classes12.dex */
public final /* synthetic */ class kk11 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ kk11(hzk hzkVar, OrientationAwareRecyclerView orientationAwareRecyclerView, u0x u0xVar, int i, ScrollPosition scrollPosition, int i2) {
        this.a = 2;
        this.b = hzkVar;
        this.x = orientationAwareRecyclerView;
        this.c = u0xVar;
        this.w = i;
        this.z = scrollPosition;
        this.y = i2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.y;
        Object obj2 = this.z;
        int i3 = this.w;
        Object obj3 = this.c;
        Object obj4 = this.x;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                o oVar = (o) obj5;
                o oVar2 = (o) obj4;
                o.a aVar = (o.a) obj;
                o.a.o(aVar, oVar, 0, ((to5) obj3).a(oVar.b, i3));
                o.a.o(aVar, oVar2, i2, ((to5) obj2).a(oVar2.b, i3));
                return zy11Var;
            case 1:
                o oVar3 = (o) obj5;
                o oVar4 = (o) obj4;
                o.a aVar2 = (o.a) obj;
                o.a.o(aVar2, oVar3, 0, ((to5) obj3).a(oVar3.b, i3));
                o.a.o(aVar2, oVar4, i2, ((to5) obj2).a(oVar4.b, i3));
                return zy11Var;
            default:
                return Integer.valueOf(hzk.e((OrientationAwareRecyclerView) obj4, (u0x) obj3, ((cip0) ((hzk) obj5).b).a(i3, i3 > 0), (ScrollPosition) obj2, this.y, (View) obj));
        }
    }

    public /* synthetic */ kk11(o oVar, to5 to5Var, int i, o oVar2, int i2, to5 to5Var2, int i3) {
        this.a = i3;
        this.b = oVar;
        this.c = to5Var;
        this.w = i;
        this.x = oVar2;
        this.y = i2;
        this.z = to5Var2;
    }
}
