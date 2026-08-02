package xsna;

import xsna.msn0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class a0l implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a0l(c0l c0lVar, int i) {
        this.d = c0lVar;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                ((c0l) this.d).c(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((zzy) this.d).a(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                break;
            default:
                ((Integer) obj2).getClass();
                ((msn0.b) this.d).a(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ a0l(zzy zzyVar, int i) {
        this.d = zzyVar;
        this.c = i;
    }

    public /* synthetic */ a0l(msn0.b bVar, int i) {
        this.d = bVar;
        this.c = i;
    }
}
