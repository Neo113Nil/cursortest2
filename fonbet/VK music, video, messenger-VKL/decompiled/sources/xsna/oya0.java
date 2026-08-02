package xsna;

import com.vk.music.player.api.helper.dto.AudioPlaybackError;
import java.io.IOException;

/* compiled from: PlaybackSourceErrorInfo.kt */
/* loaded from: classes3.dex */
public final class oya0 {
    public final AudioPlaybackError a;
    public final Throwable b;
    public final String c;
    public final Boolean d;
    public final Long e;
    public final Integer f;
    public final String g;
    public final String h;
    public final String i;
    public final Integer j;
    public final IOException k;

    public oya0(AudioPlaybackError audioPlaybackError, Throwable th, String str, Boolean bool, Long l, Integer num, String str2, String str3, String str4, Integer num2, IOException iOException) {
        this.a = audioPlaybackError;
        this.b = th;
        this.c = str;
        this.d = bool;
        this.e = l;
        this.f = num;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = num2;
        this.k = iOException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oya0)) {
            return false;
        }
        oya0 oya0Var = (oya0) obj;
        return this.a.equals(oya0Var.a) && epx.f(this.b, oya0Var.b) && epx.f(this.c, oya0Var.c) && this.d.equals(oya0Var.d) && this.e.equals(oya0Var.e) && this.f.equals(oya0Var.f) && epx.f(this.g, oya0Var.g) && this.h.equals(oya0Var.h) && epx.f(this.i, oya0Var.i) && epx.f(this.j, oya0Var.j) && epx.f(this.k, oya0Var.k);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Throwable th = this.b;
        int hashCode2 = (hashCode + (th == null ? 0 : th.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((hashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31;
        String str2 = this.g;
        int a = urd0.a((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 961, this.h);
        String str3 = this.i;
        int hashCode4 = (a + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.j;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        IOException iOException = this.k;
        return (hashCode5 + (iOException != null ? iOException.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "PlaybackSourceErrorInfo(error=" + this.a + ", sourceException=" + this.b + ", playbackState=" + this.c + ", playWhenReady=" + this.d + ", positionMs=" + this.e + ", bufferedPercentage=" + this.f + ", mediaItemId=" + this.g + ", mediaItemUri=" + this.h + ", networkAvailable=null, lastLoadUri=" + this.i + ", lastLoadDataType=" + this.j + ", lastLoadException=" + this.k + ", httpResponseCode=null)";
    }
}
