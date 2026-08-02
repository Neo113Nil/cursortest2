package xsna;

import android.view.View;
import xsna.a520;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class l37 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l37(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        gzs<s3q0> gzsVar;
        switch (this.b) {
            case 0:
                one.video.controls.view.seekbar.b bVar = (one.video.controls.view.seekbar.b) this.c;
                jn80 jn80Var = (jn80) this.d;
                bVar.getClass();
                if (jn80Var.d.getProgress() != jn80Var.d.getMax() && (gzsVar = bVar.c) != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
            case 1:
                pcd pcdVar = (pcd) this.c;
                com.vk.movika.sdk.base.observable.q qVar = (com.vk.movika.sdk.base.observable.q) this.d;
                k20 k20Var = pcdVar.s;
                if (k20Var != null) {
                    qVar.invoke(k20Var);
                    break;
                }
                break;
            default:
                f2z0 f2z0Var = (f2z0) this.c;
                b520 b520Var = (b520) this.d;
                a520.a aVar = (a520.a) f2z0Var.h.get();
                if (aVar != null) {
                    aVar.a(b520Var);
                    break;
                } else {
                    gu8.c(null, "AdChoicesOptionsView: listener is null, can't call on action click.");
                    break;
                }
        }
    }
}
