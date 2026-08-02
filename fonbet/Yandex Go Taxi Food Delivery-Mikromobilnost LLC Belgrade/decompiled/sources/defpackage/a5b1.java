package defpackage;

import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import ru.yandex.taxi.design.ButtonComponent;

/* loaded from: classes12.dex */
public abstract class a5b1 {
    public static final void a(ButtonComponent buttonComponent, y27 y27Var) {
        buttonComponent.setText(y27Var.a);
        buttonComponent.setVisibility(y27Var.b ? 0 : 8);
        buttonComponent.setButtonBackground(new bdc(y27Var.c));
        buttonComponent.setButtonTitleColor(new bdc(y27Var.d));
        buttonComponent.setDebounceClickListener(new h60(11, y27Var.e));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r0 >= 2) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(ix10 ix10Var) {
        int pickImagesMaxLimit;
        int extensionVersion;
        Long l = ix10Var.c;
        int i = Build.VERSION.SDK_INT;
        if (i < 33) {
            if (i >= 30) {
                extensionVersion = SdkExtensions.getExtensionVersion(30);
            }
            pickImagesMaxLimit = Integer.MAX_VALUE;
            return (l != null || l.longValue() >= ((long) pickImagesMaxLimit)) ? pickImagesMaxLimit : Math.toIntExact(l.longValue());
        }
        pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
        if (l != null) {
        }
    }
}
