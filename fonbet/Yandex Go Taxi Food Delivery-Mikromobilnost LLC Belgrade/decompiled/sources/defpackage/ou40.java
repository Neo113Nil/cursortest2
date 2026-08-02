package defpackage;

import com.yandex.go.multimodal_route.a;
import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;

/* loaded from: classes3.dex */
public final class ou40 implements sy60 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseRootNavigationRouter b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ou40(BaseRootNavigationRouter baseRootNavigationRouter, Object obj, int i) {
        this.a = i;
        this.b = baseRootNavigationRouter;
        this.c = obj;
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = this.a;
        int i2 = 9;
        BaseRootNavigationRouter baseRootNavigationRouter = this.b;
        switch (i) {
            case 0:
                ((a) baseRootNavigationRouter).r(new qu(i2));
                break;
            default:
                ((hw40) baseRootNavigationRouter).r(new qu(i2));
                break;
        }
    }
}
