package xsna;

import androidx.annotation.NonNull;
import com.vk.api.generated.kidsCollection.dto.KidsCollectionAddAudioResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.music.MusicTrack;

/* compiled from: MusicTrackModelImpl.java */
/* loaded from: classes3.dex */
public final class rd50 implements hx2, byh0 {
    public Object b;
    public final Object c;

    public rd50(fj01 fj01Var) {
        this.c = fj01Var;
    }

    @Override // xsna.byh0
    public void a(izs izsVar) {
        xy2 xy2Var = (xy2) izsVar.invoke((qyh0) this.b);
        if (xy2Var != null) {
            dz2 x = yfb.x(xy2Var);
            ahn.D(x);
            io.reactivex.rxjava3.disposables.c subscribe = rsg0.T(x).subscribe(new krj(new pqz(21)), new vk40(new azt(25), 18));
            if (subscribe != null) {
                ((io.reactivex.rxjava3.disposables.b) this.c).b(subscribe);
            }
        }
    }

    @Override // xsna.hx2
    public void b(Object obj) {
        KidsCollectionAddAudioResponseDto kidsCollectionAddAudioResponseDto = (KidsCollectionAddAudioResponseDto) obj;
        if (kidsCollectionAddAudioResponseDto == null || kidsCollectionAddAudioResponseDto.e() != 1 || kidsCollectionAddAudioResponseDto.d() == null) {
            return;
        }
        nd50.F((nd50) this.c, (MusicTrack) this.b, kidsCollectionAddAudioResponseDto.d().intValue());
    }

    @Override // xsna.hx2
    public void e(@NonNull VKApiExecutionException vKApiExecutionException) {
        nd50.E((nd50) this.c, (MusicTrack) this.b, vKApiExecutionException);
    }

    public rd50(d080 d080Var, e080 e080Var) {
        this.b = d080Var;
        this.c = e080Var;
    }

    public rd50() {
        this.b = new qyh0();
        this.c = new io.reactivex.rxjava3.disposables.b();
    }

    public rd50(nd50 nd50Var, MusicTrack musicTrack) {
        this.c = nd50Var;
        this.b = musicTrack;
    }
}
