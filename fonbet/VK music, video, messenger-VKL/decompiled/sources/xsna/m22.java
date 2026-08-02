package xsna;

import com.vk.api.generated.audio.dto.AudioGetIdsBySourceSourceDto;
import com.vk.music.common.MusicPlaybackLaunchContext;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AndroidAutoMusicTrackRepositoryImpl.kt */
/* loaded from: classes16.dex */
public final class m22 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public m22(mf2 mf2Var, nf2 nf2Var, nf2 nf2Var2, nf2 nf2Var3, nf2 nf2Var4) {
        this.a = mf2Var;
        this.b = nf2Var;
        this.c = nf2Var2;
        this.d = nf2Var3;
        this.e = nf2Var4;
    }

    public io.reactivex.rxjava3.core.x a(MusicPlaybackLaunchContext musicPlaybackLaunchContext, String str) {
        ArrayList b = ((t5a) this.d).b(str);
        if (!b.isEmpty()) {
            return io.reactivex.rxjava3.core.x.k(b);
        }
        if (str.equals("synthetic_offline_tracks")) {
            return ((bqz0) this.a).p(false);
        }
        ix4 ix4Var = (ix4) this.e;
        AudioGetIdsBySourceSourceDto audioGetIdsBySourceSourceDto = AudioGetIdsBySourceSourceDto.CATALOG;
        String string = musicPlaybackLaunchContext.b.getString("__META_CATALOG_BLOCK_ID", "");
        if (string.length() == 0) {
            string = null;
        }
        if (string == null) {
            string = musicPlaybackLaunchContext.t();
        }
        io.reactivex.rxjava3.internal.operators.single.r rVar = new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.r(rsg0.D0(yfb.x(ix4Var.e(audioGetIdsBySourceSourceDto, str, string))), new e10(new qt0(2), 4)), new com.vk.movika.sdk.base.ui.p0(new ka(this, 4), 1));
        int i = 1;
        return new io.reactivex.rxjava3.internal.operators.single.d0(new io.reactivex.rxjava3.internal.operators.single.o(rVar, new nf1(new l22(0, this, str), i)).h(new l50(new nk(1), i)), new w11(2), null);
    }

    public void b(String str, List list) {
        t5a t5aVar = (t5a) this.d;
        t5aVar.a.remove(str);
        t5aVar.a(str, "", list);
    }

    public m22(bqz0 bqz0Var, fa40 fa40Var, xf40 xf40Var, t5a t5aVar) {
        ix4 ix4Var = new ix4();
        this.a = bqz0Var;
        this.b = fa40Var;
        this.c = xf40Var;
        this.d = t5aVar;
        this.e = ix4Var;
    }
}
