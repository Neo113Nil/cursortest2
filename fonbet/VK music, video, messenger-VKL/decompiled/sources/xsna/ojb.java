package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class ojb implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ ojb(int i, int i2) {
        this.b = i2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                break;
            case 1:
                lt40.i((tgi0) obj, this.c);
                break;
            default:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.r(tgi0Var, "playlistTrackCount");
                qgi0.h(tgi0Var, String.valueOf(this.c));
                break;
        }
        return s3q0.a;
    }
}
