package xsna;

import android.os.Trace;
import com.vk.core.utils.newtork.NetworkState;
import com.vk.core.utils.newtork.NetworkType;
import com.vk.di.component.app.AppContextDiComponent;
import com.vk.games.di.GamesCatalogComponentImpl;
import com.vk.music.analytics.api.di.MusicAnalyticsComponent;
import com.vk.music.offline.api.di.OfflineAudioComponent;
import com.vk.newsfeed.impl.di.NewsFeedComponentImpl;
import com.vkontakte.android.task.di.components.ImBridgeComponentImpl;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class j90 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j90(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Set set;
        Object obj;
        Object obj2;
        List list;
        int i = this.b;
        ?? r1 = this.c;
        switch (i) {
            case 0:
                ((p7m) r1).b.clear();
                return s3q0.a;
            case 1:
                return (MusicAnalyticsComponent) ((g8m) r1).a(fpf0.a(MusicAnalyticsComponent.class));
            case 2:
                GamesCatalogComponentImpl gamesCatalogComponentImpl = (GamesCatalogComponentImpl) r1;
                qcy<Object>[] qcyVarArr = GamesCatalogComponentImpl.s;
                return new fdt(gamesCatalogComponentImpl.Df(), gamesCatalogComponentImpl.Ef());
            case 3:
                return new zyv(new mju0(((ImBridgeComponentImpl) r1).a.s()));
            case 4:
                return ((t260) r1).e.j.getValue();
            case 5:
                return ((OfflineAudioComponent) ((kc50) r1).b.getValue()).n7();
            case 6:
                nx50 nx50Var = (nx50) r1;
                return new s38((com.vk.superapp.multiaccount.api.d) nx50Var.f0.getValue(), (hlu0) nx50Var.e0.getValue(), (jlu0) nx50Var.c0.getValue(), (jwn0) nx50Var.V.getValue(), (kun0) nx50Var.U.getValue(), nx50Var.H0(), nx50Var.y0(), (g9g0) nx50Var.m0.getValue());
            case 7:
                NetworkState networkState = (NetworkState) r1;
                NetworkType.a aVar = NetworkType.Companion;
                Set<Integer> set2 = networkState.b;
                int i2 = networkState.c;
                aVar.getClass();
                if (set2.isEmpty()) {
                    return NetworkType.UNKNOWN;
                }
                set = NetworkType.TRANSPORT;
                Iterator<T> it = set2.iterator();
                while (true) {
                    obj = null;
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (set.contains(Integer.valueOf(((Number) obj2).intValue()))) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                Integer num = (Integer) obj2;
                int intValue = num != null ? num.intValue() : -1;
                list = NetworkType.SPECIFIC_TYPES;
                Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        NetworkType networkType = (NetworkType) next;
                        if (intValue == 0 ? networkType.o(i2) : networkType.m(intValue)) {
                            obj = next;
                        }
                    }
                }
                NetworkType networkType2 = (NetworkType) obj;
                return networkType2 == null ? NetworkType.UNKNOWN : networkType2;
            case 8:
                qcy<Object>[] qcyVarArr2 = NewsFeedComponentImpl.D;
                return (AppContextDiComponent) r1.getValue();
            default:
                bhl0 bhl0Var = (bhl0) r1;
                Trace.beginSection(ndp0.f("lazy StorageManager.eduOrganizations"));
                try {
                    return new m200(bhl0Var.B());
                } finally {
                    Trace.endSection();
                }
        }
    }
}
