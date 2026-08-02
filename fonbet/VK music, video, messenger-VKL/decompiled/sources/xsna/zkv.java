package xsna;

import android.content.Context;
import android.os.Trace;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.cachecontrol.api.CacheComponent;
import com.vk.httpexecutor.api.NetworkClient;
import com.vk.httpexecutor.api.utils.debug.FakeNetworkConditions;
import com.vk.music.pref.MusicPrefsComponent;
import com.vk.music.subscription.impl.di.MusicSubscriptionComponentImpl;
import com.vk.newsfeed.impl.di.NewsFeedComponentImpl;
import com.vk.toggle.features.ImFeatures;
import java.util.EnumSet;
import kotlin.random.Random;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class zkv implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zkv(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        ?? r1 = this.c;
        switch (i) {
            case 0:
                return (okhttp3.s) r1;
            case 1:
                pzv pzvVar = ((n3w) r1).a;
                Context context = pzvVar.a.a;
                ImFeatures imFeatures = ImFeatures.DB_CURSOR_DEVNULL_REPORT;
                imFeatures.getClass();
                boolean a = com.vk.toggle.b.A.a(imFeatures);
                boolean J = pzvVar.h.J();
                com.vk.im.engine.models.b a2 = pzvVar.h.h.a();
                if (a2 == null) {
                    com.vk.im.engine.models.b.c.getClass();
                    a2 = com.vk.im.engine.models.b.d;
                }
                Random.b.getClass();
                return new i0w(context, a, J, Random.c.i() >= a2.a ? null : new g0w(a2.b), pzvVar.O.g());
            case 2:
                NetworkClient.a.C1087a c1087a = (NetworkClient.a.C1087a) r1;
                return c1087a.b.invoke().booleanValue() ? c1087a.d.invoke() : EnumSet.noneOf(FakeNetworkConditions.class);
            case 3:
                return ((AuthBridgeComponent) ((MusicSubscriptionComponentImpl) r1).c.getValue()).s().i();
            case 4:
                qcy<Object>[] qcyVarArr = NewsFeedComponentImpl.D;
                return (CacheComponent) r1.getValue();
            case 5:
                bhl0 bhl0Var = (bhl0) r1;
                Trace.beginSection(ndp0.f("lazy StorageManager.systemStorageManager"));
                try {
                    return new grn0(bhl0Var.B());
                } finally {
                    Trace.endSection();
                }
            default:
                return ((MusicPrefsComponent) ((k7m) m7m.f((qgp0) r1)).a(fpf0.a(MusicPrefsComponent.class))).Q0();
        }
    }
}
