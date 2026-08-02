package xsna;

import com.vk.dto.music.MusicTrack;
import xsna.prt;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c9j implements io.reactivex.rxjava3.functions.l, prt.a {
    public final /* synthetic */ izs b;

    @Override // xsna.prt.a
    public String a(MusicTrack musicTrack) {
        return (String) this.b.invoke(musicTrack);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return (Boolean) this.b.invoke(obj);
    }
}
