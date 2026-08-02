package defpackage;

import android.content.Context;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes15.dex */
public final class ewy0 {
    public final String a;
    public final tls b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ewy0(String str, int i, int i2) {
        this(str, i, 1.0f);
        switch (i2) {
            case 2:
                this(str, new ii8(i, 20));
                break;
            default:
                break;
        }
    }

    public ewy0(String str, tls tlsVar) {
        this.a = str;
        this.b = tlsVar;
    }

    public ewy0(String str, final int i, final float f) {
        this(str, new tls() { // from class: fwy0
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int g = job1.g(drb1.c(i, (Context) obj), f);
                return String.format(Locale.US, "rgba(%d, %d, %d, %.3f)", Arrays.copyOf(new Object[]{Integer.valueOf((g >> 16) & 255), Integer.valueOf((g >> 8) & 255), Integer.valueOf(g & 255), Float.valueOf(((g >> 24) & 255) / 255.0f)}, 4));
            }
        });
    }
}
