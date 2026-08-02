package xsna;

import androidx.annotation.NonNull;
import com.vk.api.generated.kidsCollection.dto.KidsCollectionRestoreAudioResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.music.MusicTrack;

/* compiled from: MusicTrackModelImpl.java */
/* loaded from: classes3.dex */
public final class pd50 implements hx2<KidsCollectionRestoreAudioResponseDto> {
    public final /* synthetic */ MusicTrack b;
    public final /* synthetic */ nd50 c;

    public pd50(nd50 nd50Var, MusicTrack musicTrack) {
        this.c = nd50Var;
        this.b = musicTrack;
    }

    @Override // xsna.hx2
    public final void b(KidsCollectionRestoreAudioResponseDto kidsCollectionRestoreAudioResponseDto) {
        KidsCollectionRestoreAudioResponseDto kidsCollectionRestoreAudioResponseDto2 = kidsCollectionRestoreAudioResponseDto;
        if (kidsCollectionRestoreAudioResponseDto2.d() != null) {
            nd50.F(this.c, this.b, kidsCollectionRestoreAudioResponseDto2.d().intValue());
        }
    }

    @Override // xsna.hx2
    public final void e(@NonNull VKApiExecutionException vKApiExecutionException) {
        nd50.E(this.c, this.b, vKApiExecutionException);
    }
}
