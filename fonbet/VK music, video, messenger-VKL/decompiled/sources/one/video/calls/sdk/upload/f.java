package one.video.calls.sdk.upload;

import java.io.File;
import one.video.calls.sdk.upload.FileUploadService;
import ru.ok.android.util.FileUtilKt;
import ru.ok.android.webrtc.RTCLog;
import xsna.xar;

/* loaded from: classes8.dex */
public final class f implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ File b;
    public final /* synthetic */ FileUploadEvent c;

    public f(File file, FileUploadEvent fileUploadEvent) {
        this.b = file;
        this.c = fileUploadEvent;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        FileUploadService.a aVar = FileUploadService.c;
        xar.a aVar2 = xar.b;
        RTCLog rTCLog = aVar2 != null ? aVar2.a : xar.a;
        File file = this.b;
        rTCLog.reportException("FileUploadService", "File uploading failed. File  " + file.getAbsolutePath(), th);
        if (this.c.d) {
            FileUtilKt.deleteSafely(file, new c(1, aVar, FileUploadService.a.class, "log", "log(Ljava/lang/String;)V", 0));
        }
    }
}
