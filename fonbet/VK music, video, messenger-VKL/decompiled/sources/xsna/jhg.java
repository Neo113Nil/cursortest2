package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import com.vk.auth.main.VkClientLibverifyInfo;
import com.vk.dialogsscreen.api.DialogsScreenFeatureComponent;
import com.vk.im.engine.di.ImUiPreferencesComponent;
import com.vk.mediastore.storage.ClipsVideoStorage;
import com.vk.music.offline.core.database.OfflineAudioDatabase;
import com.vk.music.offline.impl.di.OfflineAudioComponentImpl;
import com.vk.overlaymenu.di.OverlayMenuComponent;
import com.vk.silentauthbylogin.di.SilentAuthByLoginComponentImpl;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.di.components.LinksBridgeComponentImpl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class jhg implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jhg(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return new com.vk.music.fragment.impl.c(((khg) obj).b);
            case 1:
                return ((DialogsScreenFeatureComponent) ((LinksBridgeComponentImpl) obj).u.getValue()).g7();
            case 2:
                return (String) obj;
            case 3:
                return Boolean.valueOf(((ImUiPreferencesComponent) ((nmg0) ((ph20) obj).c.invoke()).a(fpf0.a(ImUiPreferencesComponent.class))).Z6().b());
            case 4:
                return (SharedPreferences) ((x570) obj).a.invoke();
            case 5:
                return new hf5(OfflineAudioDatabase.j.a(((OfflineAudioComponentImpl) obj).a).B());
            case 6:
                return new rey((e0w) ((a1a0) obj).c.getValue());
            case 7:
                return ((OverlayMenuComponent) ((c4j0) obj).c().a(fpf0.a(OverlayMenuComponent.class))).Z5();
            case 8:
                return new xmj0(((SilentAuthByLoginComponentImpl) obj).a);
            case 9:
                VKApplication.a aVar = VKApplication.c;
                Context applicationContext = ((VKApplication) obj).getApplicationContext();
                ClipsVideoStorage clipsVideoStorage = ClipsVideoStorage.a;
                pxv pxvVar = m63.e;
                if (pxvVar == null) {
                    pxvVar = null;
                }
                if (((pnf) pxvVar.invoke()).a) {
                    clipsVideoStorage.f();
                }
                io.reactivex.rxjava3.subjects.e eVar = frd.a;
                yqd yqdVar = new yqd(0);
                asu0.a.getClass();
                asu0.n().execute(new erd(yqdVar, applicationContext));
                io.reactivex.rxjava3.subjects.e eVar2 = sk90.a;
                sk90.a();
                return s3q0.a;
            default:
                return i5s.a(new StringBuilder("vk_"), (String) ((VkClientLibverifyInfo) obj).d.getValue(), "registration");
        }
    }
}
