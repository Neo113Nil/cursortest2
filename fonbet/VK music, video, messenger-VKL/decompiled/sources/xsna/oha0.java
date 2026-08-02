package xsna;

import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import xsna.ab0;

/* compiled from: PickVisualMediaRequest.kt */
/* loaded from: classes11.dex */
public final class oha0 {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if (r0 >= 2) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
    
        if (r4 >= 2) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static nha0 a(ab0.g gVar) {
        int pickImagesMaxLimit;
        int extensionVersion;
        int extensionVersion2;
        int i = Build.VERSION.SDK_INT;
        if (i < 33) {
            if (i >= 30) {
                extensionVersion2 = SdkExtensions.getExtensionVersion(30);
            }
            pickImagesMaxLimit = Integer.MAX_VALUE;
            ab0.b.a aVar = ab0.b.a.a;
            if (i < 33) {
                if (i >= 30) {
                    extensionVersion = SdkExtensions.getExtensionVersion(30);
                }
                nha0 nha0Var = new nha0();
                nha0Var.a = gVar;
                nha0Var.b = pickImagesMaxLimit;
                nha0Var.c = aVar;
                return nha0Var;
            }
            MediaStore.getPickImagesMaxLimit();
            nha0 nha0Var2 = new nha0();
            nha0Var2.a = gVar;
            nha0Var2.b = pickImagesMaxLimit;
            nha0Var2.c = aVar;
            return nha0Var2;
        }
        pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
        ab0.b.a aVar2 = ab0.b.a.a;
        if (i < 33) {
        }
        MediaStore.getPickImagesMaxLimit();
        nha0 nha0Var22 = new nha0();
        nha0Var22.a = gVar;
        nha0Var22.b = pickImagesMaxLimit;
        nha0Var22.c = aVar2;
        return nha0Var22;
    }
}
