package defpackage;

import ru.yandex.video.m3.player.impl.source.CacheReadOnlyDataSourceFactory;
import ru.yandex.video.m3.player.impl.source.CachedDataSourceFactory;
import ru.yandex.video.m3.player.impl.source.DefaultMediaSourceFactory;

/* loaded from: classes7.dex */
public final /* synthetic */ class ic7 implements ipg {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ic7(CachedDataSourceFactory cachedDataSourceFactory, ra7 ra7Var) {
        this.a = 1;
        this.c = cachedDataSourceFactory;
        this.b = ra7Var;
    }

    @Override // defpackage.ipg
    public final kpg createDataSource() {
        kpg create$lambda$1$lambda$0;
        kpg provideCacheReadDataSourceFactory;
        kpg createDashMediaSourceFactory$lambda$9;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                create$lambda$1$lambda$0 = CacheReadOnlyDataSourceFactory.create$lambda$1$lambda$0((ra7) obj2, (CacheReadOnlyDataSourceFactory) obj);
                return create$lambda$1$lambda$0;
            case 1:
                provideCacheReadDataSourceFactory = ((CachedDataSourceFactory) obj).provideCacheReadDataSourceFactory((ra7) obj2);
                return provideCacheReadDataSourceFactory;
            default:
                createDashMediaSourceFactory$lambda$9 = DefaultMediaSourceFactory.createDashMediaSourceFactory$lambda$9((ipg) obj2, (cj01) obj);
                return createDashMediaSourceFactory$lambda$9;
        }
    }

    public /* synthetic */ ic7(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
