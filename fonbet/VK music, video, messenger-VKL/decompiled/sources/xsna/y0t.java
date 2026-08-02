package xsna;

import android.content.Context;
import java.text.SimpleDateFormat;
import xsna.zrz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class y0t implements gzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ y0t(Context context, int i, z0t z0tVar) {
        this.d = context;
        this.c = i;
        this.e = z0tVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new SimpleDateFormat(((Context) this.d).getString(this.c), ((z0t) this.e).f);
            default:
                return "state: " + ((zrz.a) this.d) + " loaded from network " + ((frz) ((utk) this.e).a).getSize() + " items out of requested " + this.c + ' ';
        }
    }

    public /* synthetic */ y0t(zrz.a aVar, utk utkVar, int i) {
        this.d = aVar;
        this.e = utkVar;
        this.c = i;
    }
}
