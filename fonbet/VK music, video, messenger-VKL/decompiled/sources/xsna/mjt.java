package xsna;

import android.util.Size;
import ru.ok.android.webrtc.layout.VideoDisplayLayout;

/* compiled from: GenericDisplayLayoutGenerator.kt */
/* loaded from: classes7.dex */
public final class mjt {
    public final zzz a;

    public mjt(zzz zzzVar) {
        this.a = zzzVar;
    }

    public final VideoDisplayLayout a(Size size) {
        int width;
        int height;
        if (size.getWidth() <= 0 || size.getHeight() <= 0) {
            return null;
        }
        if (this.a.isHorizontal()) {
            width = size.getHeight();
            height = size.getWidth();
        } else {
            width = size.getWidth();
            height = size.getHeight();
        }
        return new VideoDisplayLayout.Builder().setFit(VideoDisplayLayout.Fit.COVER).setWidth(width).setHeight(height).build();
    }
}
