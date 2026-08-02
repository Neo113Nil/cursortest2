package xsna;

import com.vk.core.native_loader.NativeLib;
import com.vk.core.native_loader.NativeLibLoader;
import com.vk.update.core.AvailabilityState;
import com.vk.update.core.DownloadState;
import com.vk.voip.factory.ConversationFactoryCreator;
import org.webrtc.NativeLibraryLoader;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class orj implements NativeLibraryLoader, bc80 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ orj(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.webrtc.NativeLibraryLoader
    public boolean load(String str) {
        ete0 ete0Var = (ete0) this.b;
        ConversationFactoryCreator conversationFactoryCreator = (ConversationFactoryCreator) this.c;
        ete0Var.log("NativeLoad", "loading " + str);
        if (conversationFactoryCreator.a.d()) {
            ete0Var.log("NativeLoad", "loading " + str + " result: failure is required");
            throw new ConversationFactoryCreator.ConversationFactoryCreatorException(zr.a("failed to load ", str, ": required by debug settings"));
        }
        boolean j = epx.f(str, "jingle_peerconnection_so") ? NativeLibLoader.j(NativeLibLoader.a, NativeLib.WEBRTC) : false;
        ete0Var.log("NativeLoad", "loading " + str + " result: " + j);
        if (j) {
            return true;
        }
        throw new ConversationFactoryCreator.ConversationFactoryCreatorException(go9.b("failed to load ", str));
    }

    @Override // xsna.bc80
    public void onSuccess(Object obj) {
        lsg0 lsg0Var = (lsg0) this.b;
        io.reactivex.rxjava3.core.y yVar = (io.reactivex.rxjava3.core.y) this.c;
        AppUpdateInfo appUpdateInfo = (AppUpdateInfo) obj;
        lsg0Var.getClass();
        String packageName = appUpdateInfo.getPackageName();
        long availableVersionCode = appUpdateInfo.getAvailableVersionCode();
        AvailabilityState availabilityState = lsg0Var.c ? AvailabilityState.UPDATE_NOT_AVAILABLE : (appUpdateInfo.getUpdateAvailability() == 2 && appUpdateInfo.isUpdateTypeAllowed(0)) ? AvailabilityState.UPDATE_AVAILABLE : (appUpdateInfo.getUpdateAvailability() == 3 && appUpdateInfo.isUpdateTypeAllowed(1)) ? AvailabilityState.UPDATE_AVAILABLE : AvailabilityState.UPDATE_NOT_AVAILABLE;
        int installStatus = appUpdateInfo.getInstallStatus();
        wrw wrwVar = new wrw(packageName, availableVersionCode, availabilityState, installStatus != 1 ? installStatus != 2 ? DownloadState.NOT_LOADED : DownloadState.DOWNLOADING : 3 == appUpdateInfo.getUpdateAvailability() ? DownloadState.NOT_LOADED : DownloadState.DOWNLOADED, v8o.c, appUpdateInfo);
        lsg0Var.d.l("rustore update info:" + wrwVar);
        yVar.onSuccess(wrwVar);
    }
}
