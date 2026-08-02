package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import com.yandex.runtime.image.ImageProvider;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes6.dex */
public final class f9v extends ImageProvider {
    public final /* synthetic */ int a = 2;
    public final String b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9v(Context context, int i) {
        super(true);
        int i2 = 1;
        this.b = String.format(Locale.US, "resource-compat:%d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        Drawable t = vng.t(i, context);
        if (t != null) {
            this.c = i5m.b(new yot(i2, t));
        } else {
            ny61.g(oyr.i(i, "No drawable found for id: "));
            throw null;
        }
    }

    @Override // com.yandex.runtime.image.ImageProvider
    public final String getId() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // com.yandex.runtime.image.ImageProvider
    /* renamed from: getImage */
    public final Bitmap get$image() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            case 1:
                byte[] decode = Base64.decode((String) obj, 0);
                return BitmapFactory.decodeByteArray(decode, 0, decode.length);
            default:
                return (Bitmap) ((xvf0) obj).get();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9v(String str, boolean z, byte[] bArr) {
        super(z);
        this.c = bArr;
        if (str == null) {
            str = "byteArray:" + UUID.randomUUID();
        }
        this.b = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9v(String str, boolean z, String str2) {
        super(z);
        this.c = str2;
        if (str == null) {
            str = "base64:" + UUID.randomUUID();
        }
        this.b = str;
    }
}
