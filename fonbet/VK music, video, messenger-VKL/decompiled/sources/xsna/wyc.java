package xsna;

import android.view.View;
import com.vk.clips.design.view.sidecontrols.ClipFeedSideControlsStatic;
import com.vk.clips.design.view.sidecontrols.a;
import kotlin.NoWhenBranchMatchedException;
import xsna.cdl;
import xsna.hjc;
import xsna.tkj0;

/* compiled from: ClipFeedSideControlsViewsContainer.kt */
/* loaded from: classes16.dex */
public final class wyc {
    public final xr8<q6f0> a;
    public final xr8<q6f0> b;
    public final xr8<ggg> c;
    public final xr8<abj0> d;
    public final xr8<itq> e;
    public final xr8<t930> f;

    /* compiled from: ClipFeedSideControlsViewsContainer.kt */
    public static final class a {
        public static xr8 a(cdl cdlVar, com.vk.clips.design.view.sidecontrols.a aVar, ClipFeedSideControlsStatic clipFeedSideControlsStatic, final hjc hjcVar, com.vk.clips.design.view.sidecontrols.b bVar) {
            if (epx.f(cdlVar, cdl.b.a)) {
                return bVar.a(aVar, hjcVar, clipFeedSideControlsStatic);
            }
            if (!(cdlVar instanceof cdl.a)) {
                throw new NoWhenBranchMatchedException();
            }
            wof wofVar = ((cdl.a) cdlVar).a;
            tl2 o0 = wofVar.a.o0(bVar.a.getContext());
            o0.setControlOnClickListener(new qa6(hjcVar, 2));
            o0.setControlOnLongClickListener(new View.OnLongClickListener() { // from class: xsna.uof
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    hjc.this.a();
                    return true;
                }
            });
            tkj0.b bVar2 = new tkj0.b(new vof(o0));
            bVar.b(bVar2.b);
            boolean z = aVar instanceof a.b;
            hjc.a.C3002a c3002a = hjc.a.C3002a.b;
            if (z) {
                ggd a = com.vk.clips.design.view.sidecontrols.c.a(bVar2);
                hjc.a.getClass();
                return ((a.b) aVar).a(a, c3002a);
            }
            if (aVar instanceof a.InterfaceC0576a) {
                ggd a2 = com.vk.clips.design.view.sidecontrols.c.a(bVar2);
                hjc.a.getClass();
                return ((a.InterfaceC0576a) aVar).a(a2, c3002a);
            }
            if (aVar instanceof a.c) {
                eeq b = com.vk.clips.design.view.sidecontrols.c.b(bVar2);
                hjc.a.getClass();
                return ((a.c) aVar).b(b, c3002a);
            }
            if (!(aVar instanceof a.d)) {
                throw new NoWhenBranchMatchedException();
            }
            eeq b2 = com.vk.clips.design.view.sidecontrols.c.b(bVar2);
            hjc.a.getClass();
            return ((a.d) aVar).b(b2, c3002a);
        }
    }

    public wyc(xr8<q6f0> xr8Var, xr8<q6f0> xr8Var2, xr8<ggg> xr8Var3, xr8<abj0> xr8Var4, xr8<itq> xr8Var5, xr8<t930> xr8Var6) {
        this.a = xr8Var;
        this.b = xr8Var2;
        this.c = xr8Var3;
        this.d = xr8Var4;
        this.e = xr8Var5;
        this.f = xr8Var6;
    }
}
