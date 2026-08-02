package defpackage;

import okhttp3.OkHttpClient;

/* loaded from: classes13.dex */
public final /* synthetic */ class l0b implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ h3y b;

    public /* synthetic */ l0b(h3y h3yVar, int i) {
        this.a = i;
        this.b = h3yVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        h3y h3yVar = this.b;
        switch (i) {
            case 2:
                OkHttpClient.a b = ((OkHttpClient) h3yVar.get()).b();
                b.l = null;
                break;
            case 3:
                break;
        }
        return (dwn0) h3yVar.get();
    }
}
