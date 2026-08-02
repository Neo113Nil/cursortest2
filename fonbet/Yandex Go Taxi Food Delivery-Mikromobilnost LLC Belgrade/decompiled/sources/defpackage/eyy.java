package defpackage;

import com.google.ar.core.ImageMetadata;

/* loaded from: classes4.dex */
public final class eyy extends hfb1 {
    public static final eyy b = new eyy(0);
    public static final eyy c = new eyy(1);
    public static final eyy d = new eyy(2);
    public final /* synthetic */ int a;

    public /* synthetic */ eyy(int i) {
        this.a = i;
    }

    @Override // defpackage.hfb1
    public final int c() {
        switch (this.a) {
            case 0:
                return ImageMetadata.LENS_FILTER_DENSITY;
            case 1:
                return 532481;
            default:
                return 671745;
        }
    }
}
