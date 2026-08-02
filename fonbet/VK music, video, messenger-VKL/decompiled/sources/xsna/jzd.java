package xsna;

import com.vk.profile.user.impl.ui.UserProfileAction;
import xsna.lzd;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class jzd implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jzd(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                rye ryeVar = ((lzd.a) this.d).c;
                if (ryeVar != null) {
                    ryeVar.o(this.c / 100.0f);
                }
                break;
            case 1:
                ((arq0) this.d).n.a(new UserProfileAction.d.b.a.C1677d(this.c));
                break;
            default:
                ((mxq0) this.d).S7(this.c, 0);
                break;
        }
        return s3q0.a;
    }
}
