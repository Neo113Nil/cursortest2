package defpackage;

import android.content.Context;
import com.yandex.quark.contracts.theme.ColorScheme;
import com.yandex.quark.webchat.filechooser.FileChooserColorKey;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import skeletor.render.SkeletonContentView;

/* loaded from: classes2.dex */
public final class dzq {
    public final Context a;

    public dzq(Context context) {
        this.a = context;
    }

    public final long a(FileChooserColorKey fileChooserColorKey) {
        int i = czq.a[b().ordinal()];
        if (i == 1) {
            int i2 = czq.b[fileChooserColorKey.ordinal()];
            if (i2 == 1) {
                return SkeletonContentView.HUNDRED_PERCENTS_ALPHA;
            }
            if (i2 == 2) {
                return _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
            }
            if (i2 == 3) {
                return 4293322474L;
            }
            w511.b();
            return 0L;
        }
        if (i != 2) {
            w511.b();
            return 0L;
        }
        int i3 = czq.b[fileChooserColorKey.ordinal()];
        if (i3 == 1) {
            return 4294243574L;
        }
        if (i3 == 2) {
            return 4279900702L;
        }
        if (i3 == 3) {
            return 4279505943L;
        }
        w511.b();
        return 0L;
    }

    public final ColorScheme b() {
        return (this.a.getResources().getConfiguration().uiMode & 48) == 32 ? ColorScheme.Dark : ColorScheme.Light;
    }
}
