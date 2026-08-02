package xsna;

import android.app.Application;
import android.content.Intent;
import androidx.core.app.JobIntentService;
import java.io.File;
import one.video.calls.sdk.upload.FileUploadEvent;
import one.video.calls.sdk.upload.FileUploadService;
import ru.ok.android.commons.app.ApplicationProvider;
import ru.ok.android.webrtc.RTCLog;
import xsna.h39;
import xsna.xar;

/* compiled from: CallFinishHandler.kt */
/* loaded from: classes8.dex */
public final class j39<T> implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ h39 b;
    public final /* synthetic */ far c;

    public j39(h39 h39Var, far farVar) {
        this.b = h39Var;
        this.c = farVar;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        h39.a aVar = (h39.a) obj;
        this.b.b.log("CallFinishHandler", "BitrateDumpFileSendTrigger handling succeeded. Enqueueing upload");
        File file = aVar.a.a;
        String str = aVar.b;
        FileUploadService.a aVar2 = FileUploadService.c;
        FileUploadEvent fileUploadEvent = new FileUploadEvent(file.getAbsolutePath(), str, true);
        RTCLog rTCLog = xar.a;
        Application application = ApplicationProvider.Companion.getApplication();
        try {
            String str2 = "enqueueWork " + fileUploadEvent;
            xar.a aVar3 = xar.b;
            (aVar3 != null ? aVar3.a : rTCLog).log("FileUploadService", str2);
            JobIntentService.enqueueWork(application, (Class<?>) FileUploadService.class, 127672123, new Intent().putExtra("eventKey", fileUploadEvent));
        } catch (Exception e) {
            xar.a aVar4 = xar.b;
            if (aVar4 != null) {
                rTCLog = aVar4.a;
            }
            rTCLog.logException("FileUploadService", "failed to enqueue work", e);
        }
    }
}
