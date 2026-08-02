package one.video.calls.sdk.upload;

import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import one.video.calls.sdk.upload.FileUploadService;
import one.video.calls.sdk.upload.d;
import ru.ok.android.util.FileUtilKt;

/* loaded from: classes8.dex */
public final class e implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ File b;
    public final /* synthetic */ FileUploadEvent c;

    public e(File file, FileUploadEvent fileUploadEvent) {
        this.b = file;
        this.c = fileUploadEvent;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        d dVar = (d) obj;
        boolean z = dVar instanceof d.a;
        File file = this.b;
        if (z) {
            FileUploadService.a.a(FileUploadService.c, "Upload failed. Reason: " + ((d.a) dVar).a + ", File " + file.getAbsolutePath());
        } else {
            if (!dVar.equals(d.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            FileUploadService.a.a(FileUploadService.c, "Upload successful. File " + file.getAbsolutePath());
        }
        if (this.c.d) {
            FileUtilKt.deleteSafely(file, new a(1, FileUploadService.c, FileUploadService.a.class, "log", "log(Ljava/lang/String;)V", 0));
        }
    }
}
