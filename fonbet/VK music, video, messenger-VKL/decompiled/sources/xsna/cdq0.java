package xsna;

import com.vk.libvideo.upload.api.VideoUpload;
import com.vk.libvideo.upload.api.VideoUploadEvent;

/* compiled from: UploadVideoViewState.kt */
/* loaded from: classes16.dex */
public final class cdq0 {
    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final bdq0 a(VideoUploadEvent videoUploadEvent) {
        Float f;
        boolean z;
        String str;
        VideoUpload videoUpload = videoUploadEvent.b;
        if (videoUploadEvent instanceof VideoUploadEvent.Progress) {
            f = Float.valueOf(((VideoUploadEvent.Progress) videoUploadEvent).c);
        } else {
            if (videoUploadEvent instanceof VideoUploadEvent.Fail) {
                z = true;
                f = null;
                lar larVar = lar.a;
                long floatValue = f == null ? (long) (f.floatValue() * videoUpload.e) : 0L;
                larVar.getClass();
                String a = lar.a(floatValue);
                int i = videoUpload.b;
                String str2 = videoUpload.o;
                Long l = videoUpload.p;
                int longValue = l != null ? (int) (l.longValue() / 1000) : 0;
                String str3 = videoUpload.f;
                str = str3.length() > 0 ? str3 : null;
                if (str == null) {
                    str = "";
                }
                return new bdq0(str2, longValue, str, f, a, z, videoUpload.c, i);
            }
            f = null;
        }
        z = false;
        lar larVar2 = lar.a;
        if (f == null) {
        }
        larVar2.getClass();
        String a2 = lar.a(floatValue);
        int i2 = videoUpload.b;
        String str22 = videoUpload.o;
        Long l2 = videoUpload.p;
        int longValue2 = l2 != null ? (int) (l2.longValue() / 1000) : 0;
        String str32 = videoUpload.f;
        if (str32.length() > 0) {
        }
        if (str == null) {
        }
        return new bdq0(str22, longValue2, str, f, a2, z, videoUpload.c, i2);
    }
}
