package xsna;

import android.app.Activity;
import com.vk.dto.music.MusicTrack;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class b07 implements izs {
    public final /* synthetic */ c07 b;
    public final /* synthetic */ MusicTrack c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ms1 e;
    public final /* synthetic */ Activity f;

    public /* synthetic */ b07(c07 c07Var, MusicTrack musicTrack, boolean z, ms1 ms1Var, Activity activity) {
        this.b = c07Var;
        this.c = musicTrack;
        this.d = z;
        this.e = ms1Var;
        this.f = activity;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        c07 c07Var = this.b;
        com.vk.music.track.a aVar = c07Var.d;
        MusicTrack musicTrack = this.c;
        itg0.m(aVar.q1(musicTrack, this.d));
        if (musicTrack.S4() || musicTrack.Pb()) {
            c07Var.i.add(musicTrack.Fb());
            a630.d1(this.e, this.f, musicTrack, true);
        }
        return s3q0.a;
    }
}
