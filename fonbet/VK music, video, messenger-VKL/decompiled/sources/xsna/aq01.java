package xsna;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.MediaMetadata;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class aq01 {
    public static final o100 a = new o100("MediaSessionUtils", null);

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        if (r0 != 4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        if (r1.containsKey("com.google.android.gms.cast.metadata.COMPOSER") != false) goto L19;
     */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(MediaMetadata mediaMetadata) {
        Bundle bundle = mediaMetadata.c;
        Bundle bundle2 = mediaMetadata.c;
        String str = "com.google.android.gms.cast.metadata.SUBTITLE";
        if (!bundle.containsKey("com.google.android.gms.cast.metadata.SUBTITLE")) {
            int i = mediaMetadata.d;
            if (i == 1) {
                str = "com.google.android.gms.cast.metadata.STUDIO";
            } else if (i == 2) {
                str = "com.google.android.gms.cast.metadata.SERIES_TITLE";
            } else if (i == 3) {
                if (!bundle2.containsKey("com.google.android.gms.cast.metadata.ARTIST")) {
                    String str2 = bundle2.containsKey("com.google.android.gms.cast.metadata.ALBUM_ARTIST") ? "com.google.android.gms.cast.metadata.ALBUM_ARTIST" : "com.google.android.gms.cast.metadata.COMPOSER";
                    str = str2;
                }
                str = "com.google.android.gms.cast.metadata.ARTIST";
            }
        }
        return mediaMetadata.b(str);
    }

    @Nullable
    public static List b(cc01 cc01Var) {
        try {
            return cc01Var.zzf();
        } catch (RemoteException e) {
            Object[] objArr = {"getNotificationActions", cc01.class.getSimpleName()};
            o100 o100Var = a;
            Log.e(o100Var.a, o100Var.c("Unable to call %s on %s.", objArr), e);
            return null;
        }
    }

    @Nullable
    public static int[] c(cc01 cc01Var) {
        try {
            return cc01Var.zzg();
        } catch (RemoteException e) {
            Object[] objArr = {"getCompactViewActionIndices", cc01.class.getSimpleName()};
            o100 o100Var = a;
            Log.e(o100Var.a, o100Var.c("Unable to call %s on %s.", objArr), e);
            return null;
        }
    }
}
