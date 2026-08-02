package xsna;

import android.net.Uri;
import com.vk.upload.impl.tasks.VideoUploadTaskNew;
import kotlin.Result;

/* compiled from: DevNullUploadEventSender.kt */
/* loaded from: classes6.dex */
public final class qcq0 {
    public final String a;
    public final long b;
    public final VideoUploadTaskNew.g c;
    public final String d;
    public final String e;

    public qcq0(String str, long j, VideoUploadTaskNew.g gVar) {
        Object failure;
        this.a = str;
        this.b = j;
        this.c = gVar;
        int hashCode = str.hashCode();
        ro.d(16);
        this.d = Integer.toString(hashCode, 16);
        try {
            failure = Uri.parse(str).getHost();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        this.e = (String) (failure instanceof Result.Failure ? null : failure);
    }
}
