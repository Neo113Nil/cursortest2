package defpackage;

import com.yandex.go.design.view.GoFrameLayout;

/* loaded from: classes6.dex */
public final /* synthetic */ class f4j implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ d4j b;
    public final /* synthetic */ wls c;

    public /* synthetic */ f4j(d4j d4jVar, wls wlsVar, int i) {
        this.a = i;
        this.b = d4jVar;
        this.c = wlsVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        wls wlsVar = this.c;
        d4j d4jVar = this.b;
        GoFrameLayout goFrameLayout = (GoFrameLayout) obj;
        switch (i) {
            case 0:
                return new g4j(goFrameLayout, d4jVar, wlsVar, 0);
            default:
                return new g4j(goFrameLayout, d4jVar, wlsVar, 1);
        }
    }
}
