package xsna;

import android.os.RemoteException;
import android.util.Log;
import com.vk.core.preference.Preference;
import com.vk.media.recorder.impl.Streamer;
import ru.ok.android.api.core.ApiClient;
import ru.ok.android.onelog.ExperimentalOneLogDirect;
import ru.ok.android.onelog.OneLogItem;
import ru.ok.android.webrtc.Call;
import ru.ok.android.webrtc.CallEvents;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class w09 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ w09(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((Call) obj3).a((CallEvents) obj2, obj);
                break;
            case 1:
                ExperimentalOneLogDirect.send$lambda$2((OneLogItem) obj3, (ApiClient) obj2, (wzs) obj);
                break;
            case 2:
                jov jovVar = (jov) obj;
                Preference.h(((m0v) obj3).b, 0, "PermissionTokenManager.healthdata").edit().putString("token", (String) obj2).commit();
                try {
                    jovVar.onSuccess();
                    break;
                } catch (RemoteException e) {
                    Log.e("m0v", "HealthDataSdkService#setPermissionToken failed: " + e.getMessage());
                    return;
                }
            default:
                com.vk.media.recorder.impl.h hVar = (com.vk.media.recorder.impl.h) obj3;
                Streamer.CAPTURE_STATE capture_state = (Streamer.CAPTURE_STATE) obj;
                ((Streamer.b) obj2).b(capture_state);
                if (capture_state == Streamer.CAPTURE_STATE.STOPPED) {
                    hVar.d = null;
                    break;
                }
                break;
        }
    }
}
