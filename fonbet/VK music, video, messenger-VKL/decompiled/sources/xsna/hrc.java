package xsna;

import android.app.Activity;
import android.content.Context;
import com.vk.clips.download.api.ClipsDownloadLauncher$ClipsDownloadQuality;
import com.vk.dto.common.ClipVideoFile;

/* compiled from: ClipDownloader.kt */
/* loaded from: classes16.dex */
public interface hrc {
    static /* synthetic */ void c(hrc hrcVar, Activity activity, ClipVideoFile clipVideoFile, boolean z, sh3 sh3Var, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        ee4 ee4Var = new ee4(4);
        if ((i & 16) != 0) {
            sh3Var = null;
        }
        hrcVar.a(activity, clipVideoFile, z2, ee4Var, sh3Var);
    }

    void a(Context context, ClipVideoFile clipVideoFile, boolean z, gzs<s3q0> gzsVar, izs<? super ClipsDownloadLauncher$ClipsDownloadQuality, s3q0> izsVar);

    void b(int i);
}
