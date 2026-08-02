package one.video.player.error;

import java.io.IOException;
import one.video.player.OneVideoPlayer;
import xsna.epx;
import xsna.kh10;

/* compiled from: OneVideoSourceException.kt */
/* loaded from: classes8.dex */
public class OneVideoSourceException extends IOException {
    private final OneVideoPlayer.DataType dataType;
    private final a invalidResponseCodeInfo;
    private final boolean isHLSPlayListStuckException;

    /* compiled from: OneVideoSourceException.kt */
    public static final class a {
        public final int a;
        public final String b;
        public final String c;
        public final ResponseInfo d;

        public a(int i, String str, String str2, ResponseInfo responseInfo) {
            this.a = i;
            this.b = str;
            this.c = str2;
            this.d = responseInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d;
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.a) * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            ResponseInfo responseInfo = this.d;
            return hashCode3 + (responseInfo != null ? responseInfo.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder a = kh10.a(this.a, "InvalidResponseCodeInfo(responseCode=", ", responseMessage=", this.b, ", responseBody=");
            a.append(this.c);
            a.append(", responseInfo=");
            a.append(this.d);
            a.append(")");
            return a.toString();
        }
    }

    public OneVideoPlayer.DataType d() {
        return this.dataType;
    }

    public a g() {
        return this.invalidResponseCodeInfo;
    }

    public boolean h() {
        return this.isHLSPlayListStuckException;
    }
}
