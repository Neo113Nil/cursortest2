package xsna;

import android.content.Context;
import android.os.Trace;
import androidx.media3.exoplayer.scheduler.Requirements;
import com.vk.catalog2.common.dto.api.di.CatalogComponent;
import com.vk.catalog2.registry.api.di.CatalogRegistryComponent;
import com.vk.emailactualization.impl.di.EmailActualizationComponentImpl;
import com.vk.games.di.GamesCatalogComponentImpl;
import com.vk.music.offline.impl.di.OfflineAudioComponentImpl;
import com.vk.story.api.di.StoriesComponent;
import com.vkontakte.android.task.di.components.ImBridgeComponentImpl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class vbp implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vbp(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                qcy<Object>[] qcyVarArr = EmailActualizationComponentImpl.c;
                return new acp(((EmailActualizationComponentImpl) obj).getEntryPoint());
            case 1:
                qcy<Object>[] qcyVarArr2 = GamesCatalogComponentImpl.s;
                return new rbt(((GamesCatalogComponentImpl) obj).c());
            case 2:
                return ((StoriesComponent) ((ImBridgeComponentImpl) obj).d.getValue()).Pa();
            case 3:
                return ((CatalogComponent) m7m.a(((nx50) obj).b).a(fpf0.a(CatalogComponent.class))).Ce();
            case 4:
                return ((com.vk.toggle.e) obj).a.g();
            case 5:
                OfflineAudioComponentImpl offlineAudioComponentImpl = (OfflineAudioComponentImpl) obj;
                qcy<Object>[] qcyVarArr3 = OfflineAudioComponentImpl.M;
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                androidx.media3.exoplayer.offline.c cVar = new androidx.media3.exoplayer.offline.c(context, new androidx.media3.exoplayer.offline.a(offlineAudioComponentImpl.d, "index_offline_music"), new lpy(offlineAudioComponentImpl, 1));
                if (cVar.l != 3) {
                    cVar.l = 3;
                    cVar.g++;
                    cVar.d.obtainMessage(6, 3, 0).sendToTarget();
                }
                cVar.h(new Requirements(2));
                return cVar;
            case 6:
                bhl0 bhl0Var = (bhl0) obj;
                Trace.beginSection(ndp0.f("lazy StorageManager.eduContactSections"));
                try {
                    return new s490(bhl0Var.B());
                } finally {
                    Trace.endSection();
                }
            case 7:
                return Boolean.valueOf(((qks0) obj).a);
            default:
                return ((CatalogRegistryComponent) ((k7m) m7m.f((idt0) obj)).b(fpf0.a(CatalogRegistryComponent.class), new vca(""))).K3();
        }
    }
}
