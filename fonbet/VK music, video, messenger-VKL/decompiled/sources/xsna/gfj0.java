package xsna;

import com.vk.clips.sdk.shared.api.deps.dtos.SdkGood;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ShopsClipsGridBlockUtils.kt */
/* loaded from: classes17.dex */
public final class gfj0 {

    /* compiled from: ShopsClipsGridBlockUtils.kt */
    public static final class a {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a a(SdkClipVideoFile sdkClipVideoFile) {
        SdkGood sdkGood;
        Object obj;
        ArrayList w6 = sdkClipVideoFile.w6();
        if (w6 != null) {
            Iterator it = w6.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                SdkGood b = ((nih0) obj).b();
                if (b != null && !b.P3()) {
                    break;
                }
            }
            nih0 nih0Var = (nih0) obj;
            if (nih0Var != null) {
                sdkGood = nih0Var.b();
                if (sdkGood != null) {
                    return null;
                }
                String title = sdkGood.getTitle();
                String str = sdkGood.getPrice().i;
                return new a(title, (str == null || str.length() == 0) ? sdkGood.getPrice().e : sdkGood.getPrice().i);
            }
        }
        sdkGood = null;
        if (sdkGood != null) {
        }
    }
}
