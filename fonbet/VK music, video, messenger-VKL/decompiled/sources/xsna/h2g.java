package xsna;

import com.vk.photo.editor.features.collage.model.stat.CollageStatEvent;

/* compiled from: CollageStatEventExt.kt */
/* loaded from: classes15.dex */
public final /* synthetic */ class h2g {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[CollageStatEvent.Format.values().length];
        try {
            iArr[CollageStatEvent.Format.CollageOriginal.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CollageStatEvent.Format.CollageFree.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CollageStatEvent.Format.CollageSquare.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CollageStatEvent.Format.Collage3X4.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[CollageStatEvent.Format.Collage4X3.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[CollageStatEvent.Format.Collage16X9.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[CollageStatEvent.Format.Collage9X16.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
