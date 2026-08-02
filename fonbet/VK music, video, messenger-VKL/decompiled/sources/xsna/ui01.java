package xsna;

import android.support.v4.media.session.MediaSessionCompat;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class ui01 {

    @Nullable
    public final MediaSessionCompat.Token a;
    public final boolean b;
    public final int c;

    @Nullable
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public ui01(boolean z, int i, @Nullable String str, String str2, @Nullable MediaSessionCompat.Token token, boolean z2, boolean z3) {
        this.b = z;
        this.c = i;
        this.d = str;
        this.e = str2;
        this.a = token;
        this.f = z2;
        this.g = z3;
    }
}
