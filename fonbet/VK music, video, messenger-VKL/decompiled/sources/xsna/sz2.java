package xsna;

import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog.mvi.block.video.impl.di.CatalogVideoViewComponentImpl;
import com.vk.catalog.mvi.section.di.CatalogComponent;
import com.vk.core.apps.BuildInfo;
import com.vk.music.offline.core.database.OfflineAudioDatabase_Impl;
import com.vk.settings.api.di.NotificationsSettingsComponent;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.di.components.LinksBridgeComponentImpl;
import kotlin.collections.builders.ListBuilder;
import xsna.k1v0;
import xsna.tz2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class sz2 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sz2(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0078, code lost:
    
        if (com.vk.core.apps.BuildInfo.i() != false) goto L12;
     */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return tz2.b.a((String) ((tz2) this.c).a.getValue());
            case 1:
                ?? r0 = this.c;
                qcy<Object>[] qcyVarArr = CatalogVideoViewComponentImpl.y;
                return ((CatalogComponent) r0.getValue()).Ze();
            case 2:
                return ((BridgeComponent) ((gxw) this.c).c().a(fpf0.a(BridgeComponent.class))).p();
            case 3:
                return ((NotificationsSettingsComponent) ((LinksBridgeComponentImpl) this.c).g.getValue()).a();
            case 4:
                return ((qlm) ((ph20) this.c).e.getValue()).a();
            case 5:
                return new iw4((OfflineAudioDatabase_Impl) this.c);
            case 6:
                aid0 aid0Var = (aid0) this.c;
                return aid0Var.f(aid0Var.b.b());
            default:
                v1v0 v1v0Var = (v1v0) this.c;
                ListBuilder e = e43.e();
                if (!BuildInfo.o()) {
                    e.add(k1v0.a.e.a);
                }
                e.addAll(e43.l(k1v0.b.C3160b.a, m1v0.a, u1v0.a, s1v0.a, l1v0.a, t1v0.a, r1v0.a, o1v0.a, k1v0.b.a.a, n1v0.a, p1v0.a, q1v0.a, k1v0.b.c.a));
                if (!BuildInfo.h()) {
                    break;
                } else {
                    VKApplication vKApplication = com.vk.core.apps.a.a;
                }
                e.addAll(e43.l(k1v0.a.d.a, k1v0.a.C3159a.a, k1v0.a.b.a, k1v0.a.g.a, k1v0.a.c.a));
                if (((Boolean) v1v0Var.a.invoke()).booleanValue()) {
                    e.add(k1v0.a.f.a);
                }
                return e.g();
        }
    }
}
