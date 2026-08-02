package xsna;

import android.app.Activity;
import com.vk.dto.music.MusicTrack;
import xsna.ec40;

/* compiled from: MusicBottomSheetLauncherImpl.kt */
/* loaded from: classes3.dex */
public final class jc40 implements ec40.a<MusicTrack> {
    public final /* synthetic */ a630 b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ MusicTrack d;
    public final /* synthetic */ boolean e;

    public jc40(a630 a630Var, Activity activity, MusicTrack musicTrack, boolean z) {
        this.b = a630Var;
        this.c = activity;
        this.d = musicTrack;
        this.e = z;
    }

    @Override // xsna.ec40.a
    public final /* bridge */ /* synthetic */ boolean a(MusicTrack musicTrack) {
        return false;
    }

    @Override // xsna.ec40.a
    public final boolean b(ec40<MusicTrack> ec40Var) {
        a630.d1(this.b, this.c, this.d, this.e);
        return true;
    }
}
