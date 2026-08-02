package xsna;

import android.net.Uri;
import com.vk.dto.common.VideoFile;

/* compiled from: EpisodeItem.kt */
/* loaded from: classes2.dex */
public final class atp implements hfz {
    public final VideoFile b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final String h;
    public final String i;

    public atp(VideoFile videoFile, int i, boolean z, boolean z2, boolean z3) {
        this.b = videoFile;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = z3;
        int i2 = videoFile.Y3().get(i).b;
        this.g = i2;
        gpt0 gpt0Var = gpt0.a;
        this.h = z8s.a(i2);
        this.i = videoFile.Y3().get(i).c;
    }

    public final String a() {
        String sb;
        Uri.Builder buildUpon = Uri.parse(fss0.a(this.b)).buildUpon();
        int i = this.g;
        int i2 = i / 3600;
        int i3 = (i / 60) % 60;
        int i4 = i % 60;
        if (i2 == 0 && i3 == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i4);
            sb2.append('s');
            sb = sb2.toString();
        } else if (i2 == 0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(i3);
            sb3.append('m');
            sb3.append(i4);
            sb3.append('s');
            sb = sb3.toString();
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(i2);
            sb4.append('h');
            sb4.append(i3);
            sb4.append('m');
            sb4.append(i4);
            sb4.append('s');
            sb = sb4.toString();
        }
        return buildUpon.appendQueryParameter("t", sb).build().toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof atp)) {
            return false;
        }
        atp atpVar = (atp) obj;
        return epx.f(this.b, atpVar.b) && this.c == atpVar.c && this.d == atpVar.d && this.e == atpVar.e && this.f == atpVar.f;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.c);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + qoy.b(qoy.b(shy.a(this.c, this.b.hashCode() * 31, 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EpisodeItem(videoFile=");
        sb.append(this.b);
        sb.append(", episodeNumber=");
        sb.append(this.c);
        sb.append(", isPlayingAnimation=");
        sb.append(this.d);
        sb.append(", isVisibleAnimation=");
        sb.append(this.e);
        sb.append(", isNetworkConnected=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}
