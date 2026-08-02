package xsna;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.style.ClickableSpan;
import android.view.View;
import com.vk.external.miniapp.net.app.WebApiApplication;
import java.util.Map;
import java.util.concurrent.Executor;
import xsna.by1;
import xsna.d4l0;
import xsna.ihz;
import xsna.iwv;
import xsna.ub9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class ro9 implements ub9.c, ihz.a, ub80, io.reactivex.rxjava3.functions.l, yads.ng1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ro9(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return new d4l0.b((i700) obj, (String) this.c, (String) this.d);
    }

    @Override // xsna.ub9.c
    public Object attachCompleter(ub9.a aVar) {
        vo9 vo9Var = (vo9) this.c;
        Context context = (Context) this.d;
        Executor executor = vo9Var.d;
        executor.execute(new so9(vo9Var, context, executor, aVar, SystemClock.elapsedRealtime()));
        return "CameraX initInternal";
    }

    @Override // xsna.ub80
    public void c(ClickableSpan clickableSpan, View view) {
        Activity b;
        au30 au30Var;
        Map<String, WebApiApplication> map;
        WebApiApplication webApiApplication;
        zt30 zt30Var = (zt30) this.c;
        ub80 ub80Var = (ub80) this.d;
        ifq0 ifq0Var = clickableSpan instanceof ifq0 ? (ifq0) clickableSpan : null;
        if (ifq0Var == null || (b = enj.b(view)) == null || (au30Var = zt30Var.f) == null || (map = au30Var.m) == null || (webApiApplication = map.get(ifq0Var.a())) == null) {
            if (ub80Var != null) {
                ub80Var.c(clickableSpan, view);
            }
        } else {
            zdw zdwVar = i7o0.b;
            b7u0 k = (zdwVar != null ? zdwVar : null).d().k();
            String str = webApiApplication.D;
            iwv.a aVar = iwv.a;
            k.x(b, webApiApplication, str, "snippet_im", null);
        }
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        switch (this.b) {
            case 1:
                ((by1) obj).W((bpz) this.c, (pr10) this.d);
                break;
            default:
                ((yads.af) obj).getClass();
                break;
        }
    }

    public /* synthetic */ ro9(by1.a aVar, bpz bpzVar, pr10 pr10Var) {
        this.b = 1;
        this.c = bpzVar;
        this.d = pr10Var;
    }
}
