package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.AttachmentsArrangementConfig;
import com.vk.log.L;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class dlc0 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dlc0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                elc0 elc0Var = (elc0) obj;
                bpn0 bpn0Var = elc0Var.a;
                try {
                    z = ((File) bpn0Var.getValue()).exists();
                } catch (SecurityException unused) {
                    z = false;
                }
                if (!z) {
                    return elc0Var.c();
                }
                byte[] B = com.vk.core.files.a.B((File) bpn0Var.getValue(), null);
                if (B == null) {
                    return elc0Var.c();
                }
                try {
                    HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                    AttachmentsArrangementConfig attachmentsArrangementConfig = (AttachmentsArrangementConfig) Serializer.b.a(B, AttachmentsArrangementConfig.class.getClassLoader());
                    if (attachmentsArrangementConfig == null) {
                        L.l("deserializedAttachConfig is null");
                    }
                    return attachmentsArrangementConfig == null ? elc0Var.c() : attachmentsArrangementConfig;
                } catch (Throwable th) {
                    L.l(ms9.b("deserializedAttachConfig deserialization error: ", th));
                    boolean delete = ((File) bpn0Var.getValue()).delete();
                    L.l(zhy0.a("deserializedAttachConfig cache file deletion status: ", delete));
                    com.vk.metrics.eventtracking.b.a.a(new RuntimeException(zhy0.a("deserializedAttachConfig deserialization error, cache file deleted: ", delete), th));
                    return elc0Var.c();
                }
            default:
                ((gzs) obj).invoke();
                return s3q0.a;
        }
    }
}
