package xsna;

import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import xsna.ab0;

/* compiled from: PickVisualMediaRequest.kt */
/* loaded from: classes11.dex */
public final class nha0 {
    public ab0.g a = ab0.c.a;
    public int b;
    public ab0.b c;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r0 >= 2) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public nha0() {
        int pickImagesMaxLimit;
        int extensionVersion;
        int i = Build.VERSION.SDK_INT;
        if (i < 33) {
            if (i >= 30) {
                extensionVersion = SdkExtensions.getExtensionVersion(30);
            }
            pickImagesMaxLimit = Integer.MAX_VALUE;
            this.b = pickImagesMaxLimit;
            this.c = ab0.b.a.a;
        }
        pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
        this.b = pickImagesMaxLimit;
        this.c = ab0.b.a.a;
    }
}
