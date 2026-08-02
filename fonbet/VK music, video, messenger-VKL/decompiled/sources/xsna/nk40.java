package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicTrack;
import com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory;
import com.vk.catalog2.feature.music.myaudio.MusicCollectionType;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.moosic.MoosicAudio;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.k840;

/* compiled from: MusicExternalEventHandlerDelegate.kt */
/* loaded from: classes.dex */
public final class nk40 extends l5a {
    public final io.reactivex.rxjava3.disposables.b c;
    public final bpn0 d;
    public final bpn0 e;

    public nk40(q3a q3aVar) {
        super(q3aVar);
        this.c = new io.reactivex.rxjava3.disposables.b();
        this.d = new bpn0(new wa3(9));
        this.e = new bpn0(new sw1(14));
    }

    @Override // xsna.l5a
    public final void a() {
        r5v0 r5v0Var = k840.a.h;
        if (r5v0Var == null) {
            r5v0Var = null;
        }
        io.reactivex.rxjava3.subjects.f<yj40> fVar = r5v0Var.a.a;
        final mk40 mk40Var = new mk40(1, this, nk40.class, "processEvent", "processEvent(Lcom/vk/music/events/MusicEvent;)V", 0);
        this.c.b(fVar.subscribe(new io.reactivex.rxjava3.functions.f() { // from class: xsna.lk40
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                mk40.this.invoke(obj);
            }
        }));
    }

    public final boolean b(UIBlock uIBlock, MusicTrack musicTrack, MusicTrack musicTrack2, boolean z) {
        MoosicAudio moosicAudio;
        if ((myc0.f(musicTrack.y) && epx.f(musicTrack.y, musicTrack2.y)) || musicTrack.equals(musicTrack2)) {
            return true;
        }
        if (z && (moosicAudio = musicTrack.W) != null && moosicAudio.equals(musicTrack2.W)) {
            return true;
        }
        if (((Boolean) this.e.getValue()).booleanValue() && epx.f(musicTrack.Z, musicTrack2.Z)) {
            return true;
        }
        return uIBlock instanceof UIBlockMusicTrack ? ((UIBlockMusicTrack) uIBlock).Qb(musicTrack2) : uIBlock instanceof UIBlockSearchHistory.UIBlockSearchHistoryTrack ? ((UIBlockSearchHistory.UIBlockSearchHistoryTrack) uIBlock).Qb(musicTrack2) : false;
    }

    public final boolean c(UIBlockList uIBlockList) {
        String Tb = uIBlockList.Tb();
        if (Tb != null && drm0.D(Tb, MusicCollectionType.AUDIOS.m(), false)) {
            if (((Boolean) this.d.getValue()).booleanValue()) {
                ArrayList<UIBlock> Sb = uIBlockList.Sb();
                if (Sb == null || !Sb.isEmpty()) {
                    Iterator<T> it = Sb.iterator();
                    while (it.hasNext()) {
                        if (((UIBlock) it.next()) instanceof UIBlockMusicTrack) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void d(MusicTrack musicTrack, MusicTrack musicTrack2) {
        String str = "music_audios_remove";
        buz buzVar = new buz(12, new sx4(this, musicTrack, str, 6), new bx(this, musicTrack, str, musicTrack2));
        q3a q3aVar = this.b;
        q3aVar.b(buzVar, false);
        q3aVar.b(new buz(12, new qt5(18, this, musicTrack), new h0k(2, this, musicTrack)), false);
        q3aVar.b(new qon0(4, new l4k0(7), new e2s(this, 16)), false);
    }
}
