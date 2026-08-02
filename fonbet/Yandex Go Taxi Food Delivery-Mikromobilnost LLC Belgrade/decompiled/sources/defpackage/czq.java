package defpackage;

import com.yandex.quark.contracts.theme.ColorScheme;
import com.yandex.quark.webchat.filechooser.FileChooserColorKey;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class czq {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ColorScheme.values().length];
        try {
            iArr[ColorScheme.Light.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ColorScheme.Dark.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[FileChooserColorKey.values().length];
        try {
            iArr2[FileChooserColorKey.TextAndIconPrimary.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[FileChooserColorKey.BackgroundPrimary.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[FileChooserColorKey.Separator.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
