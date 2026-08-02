package sg.bigo.ads.dh;

import androidx.annotation.NonNull;
import xsna.n23;

/* loaded from: classes9.dex */
public final class j extends n {
    public boolean a;

    public j(@NonNull String str, boolean z) {
        super(str);
        this.a = z;
    }

    @Override // sg.bigo.ads.dh.n
    public final String toString() {
        StringBuilder sb = new StringBuilder("{\"Content\":\"");
        sb.append(this.b);
        sb.append("\",\"mute\":\"");
        return n23.b(sb, this.a, "\"}");
    }
}
