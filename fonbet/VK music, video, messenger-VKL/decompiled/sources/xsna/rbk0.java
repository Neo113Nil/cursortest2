package xsna;

import com.vk.dto.music.MusicTrack;
import xsna.k840;

/* compiled from: SnippetAnalyticsManagerImpl.kt */
/* loaded from: classes3.dex */
public final class rbk0 implements pbk0 {
    public final hx40 a;
    public final u750 b;
    public final uzp c;
    public long d;
    public m80 e;

    public rbk0(hx40 hx40Var) {
        this.a = hx40Var;
        s750 s750Var = k840.a.e;
        this.b = s750Var == null ? null : s750Var;
        this.c = new uzp();
        this.e = m80.i;
    }

    @Override // xsna.pbk0
    public final void a(int i) {
        this.b.U0(b(), i);
    }

    public final c650 b() {
        MusicTrack musicTrack = this.e.h.c;
        int b = an10.b(this.d / 1000.0f);
        int b2 = an10.b(this.d / 1000.0f);
        m80 m80Var = this.e;
        int i = m80Var.e;
        int i2 = m80Var.d;
        String str = m80Var.c;
        int b3 = an10.b(this.a.C());
        this.c.getClass();
        return new c650(musicTrack, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(b3), Integer.valueOf(b), Integer.valueOf(b2));
    }
}
