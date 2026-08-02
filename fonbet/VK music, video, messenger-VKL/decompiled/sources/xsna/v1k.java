package xsna;

import android.util.TypedValue;
import com.vk.profile.user.impl.ui.edit.cover.crop.CoverCropActivity;
import xsna.kml0;
import xsna.lrv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class v1k implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ v1k(int i, wh50 wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    /* JADX WARN: Type inference failed for: r3v9, types: [xsna.jml0, xsna.lrv0$a] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        final wh50 wh50Var = this.c;
        switch (i) {
            case 0:
                Integer num = (Integer) obj;
                num.getClass();
                int i2 = CoverCropActivity.w;
                wh50Var.setValue(num);
                return s3q0.a;
            case 1:
                wh50Var.setValue((tho0) obj);
                return s3q0.a;
            case 2:
                wh50Var.setValue(Boolean.TRUE);
                return s3q0.a;
            default:
                ?? r3 = new lrv0.a() { // from class: xsna.jml0
                    @Override // xsna.lrv0.a
                    public final void xb() {
                        wh50 wh50Var2 = wh50.this;
                        TypedValue typedValue = krv0.a;
                        wh50Var2.setValue(Boolean.valueOf(epx.f(krv0.i(krv0.b != null ? dhr0.E() : null), Boolean.FALSE)));
                    }
                };
                TypedValue typedValue = krv0.a;
                krv0.a(r3);
                return new kml0.a(r3);
        }
    }
}
