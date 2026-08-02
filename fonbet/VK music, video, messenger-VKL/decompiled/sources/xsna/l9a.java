package xsna;

import com.vk.fullscreenvideo.a;
import xsna.uvo;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class l9a implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ l9a(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.invoke(Boolean.TRUE);
                break;
            case 1:
                this.c.invoke(new uvo.b(((Float) obj).floatValue()));
                break;
            case 2:
                this.c.invoke(obj);
                break;
            default:
                this.c.invoke(new a.b(((Boolean) obj).booleanValue()));
                break;
        }
        return s3q0.a;
    }
}
