package xsna;

import android.media.MediaCodecInfo;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.util.Log;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.io.FileInputStream;
import java.util.List;

/* compiled from: UploadUtils.kt */
/* loaded from: classes6.dex */
public final class adq0 {
    public static final bpn0 a = new bpn0(new kr6(29));

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045 A[Catch: all -> 0x0078, TRY_LEAVE, TryCatch #3 {all -> 0x0078, blocks: (B:5:0x0013, B:7:0x0021, B:12:0x0037, B:14:0x003f, B:16:0x0045, B:19:0x005b, B:21:0x0063, B:44:0x007a), top: B:4:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(String str) {
        FileInputStream fileInputStream;
        int trackCount;
        int i;
        String string;
        MediaCodecInfo k;
        List list = (List) a.getValue();
        MediaExtractor mediaExtractor = new MediaExtractor();
        try {
            try {
                fileInputStream = new FileInputStream(str);
                try {
                    mediaExtractor.setDataSource(fileInputStream.getFD());
                    trackCount = mediaExtractor.getTrackCount();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ro.e(fileInputStream, th);
                        throw th2;
                    }
                }
            } finally {
                mediaExtractor.release();
            }
        } catch (Exception e) {
            Log.e("CompressUtils", e.getMessage(), e);
        }
        for (i = 0; i < trackCount; i++) {
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(i);
            Integer num = null;
            if (trackFormat.containsKey("mime")) {
                try {
                    string = trackFormat.getString("mime");
                } catch (Throwable unused) {
                }
                if (string != null && string.equalsIgnoreCase("video/hevc")) {
                    k = gcd0.k();
                    if (k == null) {
                        String name = k.getName();
                        if (trackFormat.containsKey(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)) {
                            try {
                                num = Integer.valueOf(trackFormat.getInteger(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE));
                            } catch (Throwable unused2) {
                            }
                        }
                        if (num != null) {
                            if (num.intValue() >= 4096 && list.contains(name)) {
                            }
                        }
                    }
                    fileInputStream.close();
                    return false;
                }
            }
            string = null;
            if (string != null) {
                k = gcd0.k();
                if (k == null) {
                }
                fileInputStream.close();
                return false;
            }
        }
        s3q0 s3q0Var = s3q0.a;
        fileInputStream.close();
        mediaExtractor.release();
        return true;
    }
}
