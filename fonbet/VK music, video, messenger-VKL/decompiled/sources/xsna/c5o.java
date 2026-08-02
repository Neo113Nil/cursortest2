package xsna;

import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.vk.biometrics.lock.api.di.BiometricsLockComponent;
import com.vk.donut.video.impl.di.DonutVideoComponentImpl;
import com.vk.log.L;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.silentauthbylogin.di.SilentAuthByLoginComponent;
import com.vk.story.impl.di.StoriesComponentImpl;
import com.vk.superapp.analytics.di.SakAnalyticsComponent;
import xsna.mgn0;
import xsna.wmi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c5o implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c5o(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                DonutVideoComponentImpl donutVideoComponentImpl = (DonutVideoComponentImpl) obj;
                qcy<Object>[] qcyVarArr = DonutVideoComponentImpl.j;
                return new m5o(donutVideoComponentImpl.J(), new w4o(), donutVideoComponentImpl.d.kf());
            case 1:
                return ((SakAnalyticsComponent) ((vop) obj).k0().a(fpf0.a(SakAnalyticsComponent.class))).Oe();
            case 2:
                return ((qwk) ((k1q) obj).c.getValue()).getWritableDatabase();
            case 3:
                return ((SilentAuthByLoginComponent) ((axw) obj).c().a(fpf0.a(SilentAuthByLoginComponent.class))).a();
            case 4:
                return ((NewsFeedComponent) ((k7m) m7m.f((ek40) obj)).a(fpf0.a(NewsFeedComponent.class))).w();
            case 5:
                return ((BiometricsLockComponent) m7m.a(((nx50) obj).b).a(fpf0.a(BiometricsLockComponent.class))).b();
            case 6:
                wmi0.a aVar = (wmi0.a) obj;
                try {
                    return aVar.getWritableDatabase();
                } catch (SQLiteDatabaseCorruptException e) {
                    L.i(e);
                    aVar.b.deleteDatabase("SerializerDatabaseCache");
                    return aVar.getWritableDatabase();
                }
            case 7:
                qcy<Object>[] qcyVarArr2 = StoriesComponentImpl.N;
                return new j070(((StoriesComponentImpl) obj).te());
            default:
                mgn0.b bVar = (mgn0.b) obj;
                return new com.vk.toggle.anonymous.a(bVar.a, bVar.d);
        }
    }
}
