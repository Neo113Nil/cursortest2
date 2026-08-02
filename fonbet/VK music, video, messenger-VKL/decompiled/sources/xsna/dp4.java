package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.audio.dto.AudioGetResponseDto;
import com.vk.clips.playlists.di.ClipsPlaylistsComponentImpl;
import com.vk.clips.playlists.ui.modal.EmptyPlaylistBottomSheet;
import com.vk.dto.music.MusicTrack;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.fp4;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class dp4 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dp4(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    /* JADX WARN: Type inference failed for: r9v14, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                fp4 fp4Var = (fp4) this.d;
                fp4.a aVar = fp4Var.b;
                List<AudioAudioDto> d = ((AudioGetResponseDto) obj).d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                Iterator<T> it = d.iterator();
                while (it.hasNext()) {
                    arrayList.add(oc4.d((AudioAudioDto) it.next()));
                }
                ArrayList<MusicTrack> arrayList2 = new ArrayList<>();
                j5g.K0(arrayList, arrayList2);
                aVar.b = arrayList2;
                return this.c ? rsg0.D0(yfb.x(hx4.t(fp4Var.a, fp4Var.c, 1, null, null, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE))).l(new bk1(new vs(fp4Var, 6), 2)) : io.reactivex.rxjava3.core.x.k(aVar);
            case 1:
                EmptyPlaylistBottomSheet emptyPlaylistBottomSheet = (EmptyPlaylistBottomSheet) this.d;
                L.i((Throwable) obj);
                vve.e(((ClipsPlaylistsComponentImpl) emptyPlaylistBottomSheet.m.getValue()).Ff(), sve.a, this.c, false, 4);
                return s3q0.a;
            default:
                ((c4s) this.d).e(true, Boolean.valueOf(this.c));
                return io.reactivex.rxjava3.internal.operators.completable.i.b;
        }
    }
}
