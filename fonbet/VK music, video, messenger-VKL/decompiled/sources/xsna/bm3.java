package xsna;

import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.dto.music.MusicTrack;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class bm3 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ bm3(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((hm3) this.c).b((km3) this.d, (String) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 1:
                nk40 nk40Var = (nk40) this.c;
                MusicTrack musicTrack = (MusicTrack) this.d;
                MusicTrack musicTrack2 = (MusicTrack) this.e;
                UIBlockList uIBlockList = (UIBlockList) obj;
                nk40Var.getClass();
                edi.y(uIBlockList, new l14("music_audios_download", nk40Var, musicTrack, 7), new k22(12, musicTrack2, musicTrack));
                return uIBlockList;
            default:
                ((Integer) obj2).getClass();
                com.vk.story.archive.impl.presentation.a.b((izs) this.c, (gzs) this.d, (gzs) this.e, (androidx.compose.runtime.a) obj, ne7.I(391));
                return s3q0.a;
        }
    }

    public /* synthetic */ bm3(nk40 nk40Var, MusicTrack musicTrack, MusicTrack musicTrack2) {
        this.b = 1;
        this.c = nk40Var;
        this.d = musicTrack;
        this.e = musicTrack2;
    }
}
