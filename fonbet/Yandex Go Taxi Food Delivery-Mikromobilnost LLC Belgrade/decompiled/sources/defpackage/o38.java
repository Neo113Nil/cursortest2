package defpackage;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;

/* loaded from: classes10.dex */
public final class o38 {
    public static final o38 g = new o38(-1, ModalContentViewContainer.BASE_SHADOW_COLOR, 0, 0, -1, null);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final Typeface f;

    public o38(int i, int i2, int i3, int i4, int i5, Typeface typeface) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = typeface;
    }

    public static o38 a(CaptioningManager.CaptionStyle captionStyle) {
        return new o38(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : -1, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : ModalContentViewContainer.BASE_SHADOW_COLOR, captionStyle.hasWindowColor() ? captionStyle.windowColor : 0, captionStyle.hasEdgeType() ? captionStyle.edgeType : 0, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : -1, captionStyle.getTypeface());
    }
}
