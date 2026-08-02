package xsna;

import com.vk.catalog.mvi.block.video.impl.di.CatalogVideoViewComponentImpl;
import com.vk.donut.video.api.di.DonutVideoComponent;
import com.vk.protect.di.ProtectAppComponentImpl;
import com.vkontakte.android.VKApplication;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class gia implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gia(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        ?? r1 = this.c;
        switch (i) {
            case 0:
                qcy<Object>[] qcyVarArr = CatalogVideoViewComponentImpl.y;
                return ((DonutVideoComponent) r1.getValue()).getActionHandler();
            case 1:
                return ((yol) r1).f();
            case 2:
                ewy ewyVar = ((ProtectAppComponentImpl) r1).g;
                qcy<Object> qcyVar = ProtectAppComponentImpl.i[4];
                return new f8e0((d8e0) ewyVar.c());
            default:
                VKApplication.a aVar = VKApplication.c;
                asu0.a.getClass();
                new o0d0((VKApplication) r1, asu0.h()).c();
                return s3q0.a;
        }
    }
}
