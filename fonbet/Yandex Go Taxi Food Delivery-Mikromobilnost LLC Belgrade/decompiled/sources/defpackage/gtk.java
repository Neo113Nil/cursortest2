package defpackage;

import android.widget.ImageView;

/* loaded from: classes.dex */
public interface gtk {
    default Boolean hasSvgSupport() {
        return Boolean.FALSE;
    }

    default hxy loadAnimatedImage(String str, btk btkVar) {
        return loadImageBytes(str, btkVar);
    }

    default hxy loadImage(String str, ImageView imageView) {
        return new gjf(2);
    }

    hxy loadImage(String str, btk btkVar);

    default hxy loadImageBytes(String str, btk btkVar) {
        return loadImage(str, btkVar);
    }

    default boolean needLimitBitmapSize() {
        return true;
    }

    default hxy loadImageBytes(String str, btk btkVar, int i) {
        return loadImageBytes(str, btkVar);
    }

    default hxy loadImage(String str, btk btkVar, int i) {
        return loadImage(str, btkVar);
    }
}
