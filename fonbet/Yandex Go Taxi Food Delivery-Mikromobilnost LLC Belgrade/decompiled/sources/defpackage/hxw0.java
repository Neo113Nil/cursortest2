package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import okio.ByteString;

/* loaded from: classes10.dex */
public abstract class hxw0 {
    public static final ByteString a;
    public static final ByteString b;

    static {
        ByteString byteString = new ByteString("<svg".getBytes(uza.a));
        byteString.b = "<svg";
        a = byteString;
        ByteString byteString2 = new ByteString("<".getBytes(uza.a));
        byteString2.b = "<";
        b = byteString2;
    }

    public static final boolean a(qq6 qq6Var) {
        long j;
        if (qq6Var.Q(0L, b)) {
            ByteString byteString = a;
            if (byteString.h() > 0) {
                byte m = byteString.m(0);
                long h = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID - byteString.h();
                long j2 = 0;
                while (true) {
                    if (j2 >= h) {
                        j = -1;
                        break;
                    }
                    qq6 qq6Var2 = qq6Var;
                    j = qq6Var2.e1(m, j2, h);
                    if (j == -1 || qq6Var2.Q(j, byteString)) {
                        break;
                    }
                    j2 = 1 + j;
                    qq6Var = qq6Var2;
                }
                if (j != -1) {
                    return true;
                }
            } else {
                ny61.g("bytes is empty");
            }
        }
        return false;
    }
}
