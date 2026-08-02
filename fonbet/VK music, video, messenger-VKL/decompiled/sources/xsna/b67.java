package xsna;

import androidx.activity.ComponentActivity;
import com.vk.biometrics.lock.api.di.BiometricsLockComponent;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.music.offline.core.database.OfflineAudioDatabase;
import com.vk.music.offline.impl.di.OfflineAudioComponentImpl;
import com.vkontakte.android.task.di.components.BridgeComponentImpl;
import com.vkontakte.android.task.di.components.LinksBridgeComponentImpl;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b67 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b67(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        nzm onBackPressedInput_delegate$lambda$0;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                k67 k67Var = (k67) obj;
                k67Var.c.a(k67Var.b);
                return s3q0.a;
            case 1:
                BridgeComponentImpl bridgeComponentImpl = (BridgeComponentImpl) obj;
                qcy<Object>[] qcyVarArr = BridgeComponentImpl.I;
                ey0 ey0Var = new ey0(bridgeComponentImpl, 5);
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
                return new yxv0(msy.a(lazyThreadSafetyMode, ey0Var), msy.a(lazyThreadSafetyMode, new eb(bridgeComponentImpl, 6)));
            case 2:
                onBackPressedInput_delegate$lambda$0 = ComponentActivity.onBackPressedInput_delegate$lambda$0((ComponentActivity) obj);
                return onBackPressedInput_delegate$lambda$0;
            case 3:
                return new zau(dhr0.a, ((ulm) obj).a);
            case 4:
                Map<String, String> map = ((hiv) obj).a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (brm0.v(entry.getKey(), "*", false)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(on00.e(linkedHashMap.size()));
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(((String) entry2.getKey()).substring(0, ((String) entry2.getKey()).length() - 1), entry2.getValue());
                }
                return linkedHashMap2;
            case 5:
                return (BiometricsLockComponent) ((LinksBridgeComponentImpl) obj).t.getValue();
            case 6:
                return new dtp(OfflineAudioDatabase.j.a(((OfflineAudioComponentImpl) obj).a).D());
            case 7:
                a1a0 a1a0Var = (a1a0) obj;
                return a1a0Var.a.a(a1a0Var.b, rwi.b, l1j0.a);
            default:
                return ((AuthBridgeComponent) ((c4j0) obj).c().a(fpf0.a(AuthBridgeComponent.class))).s();
        }
    }
}
