package xsna;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.vk.dto.music.MusicTrack;
import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import com.vk.newsfeed.posting.music_picker.presentation.model.MusicPickerListItem;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;

/* compiled from: LazyDsl.kt */
/* loaded from: classes4.dex */
public final class mbi0 implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ List b;
    public final /* synthetic */ SnapshotStateList c;
    public final /* synthetic */ zzf0 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ MusicPickerListItem.MusicTrackItem.PlayingState f;
    public final /* synthetic */ izs g;
    public final /* synthetic */ izs h;
    public final /* synthetic */ gzs i;

    public mbi0(List list, SnapshotStateList snapshotStateList, zzf0 zzf0Var, String str, MusicPickerListItem.MusicTrackItem.PlayingState playingState, izs izsVar, izs izsVar2, gzs gzsVar) {
        this.b = list;
        this.c = snapshotStateList;
        this.d = zzf0Var;
        this.e = str;
        this.f = playingState;
        this.g = izsVar;
        this.h = izsVar2;
        this.i = gzsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
    
        if (r4 == null) goto L35;
     */
    @Override // xsna.zzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s3q0 invoke(ksy ksyVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
        int i;
        MusicPickerListItem.MusicTrackItem.PlayingState playingState;
        ksy ksyVar2 = ksyVar;
        int intValue = num.intValue();
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue2 = num2.intValue();
        if ((intValue2 & 6) == 0) {
            i = (aVar2.J(ksyVar2) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= aVar2.o(intValue) ? 32 : 16;
        }
        int i2 = i;
        if (aVar2.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2039820996, i2, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            Object obj = this.b.get(intValue);
            int i3 = i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
            MusicDto musicDto = (MusicDto) obj;
            aVar2.K(863083684);
            MusicTrack musicTrack = musicDto.m;
            if (musicTrack != null) {
                playingState = epx.f(musicTrack.Ib(), this.e) ? this.f : MusicPickerListItem.MusicTrackItem.PlayingState.None;
            }
            playingState = MusicPickerListItem.MusicTrackItem.PlayingState.None;
            MusicPickerListItem.MusicTrackItem.PlayingState playingState2 = playingState;
            boolean z = this.c.size() > 1;
            us2 b = gpc0.b(musicDto);
            String str = musicDto.b;
            String str2 = b.c;
            boolean z2 = musicDto.g;
            String str3 = musicDto.h;
            String str4 = musicDto.j;
            MusicTrack musicTrack2 = musicDto.m;
            ae50 ae50Var = new ae50(str, b, str2, z2, str3, str4, musicTrack2 != null ? nb50.a(musicTrack2) : null, musicTrack2 != null ? musicTrack2.Jb() : null, z, musicTrack2 != null && musicTrack2.B(), 12288);
            aVar2.W(2106064070, musicDto.b);
            gzs gzsVar = this.i;
            SnapshotStateList snapshotStateList = this.c;
            zzf0 zzf0Var = this.d;
            vzf0.a(ksyVar2, zzf0Var, intValue, null, false, kai.c(-636864364, new kbi0(intValue, playingState2, ae50Var, zzf0Var, this.g, musicDto, this.h, gzsVar, snapshotStateList), aVar2), aVar2, (i2 & 14) | 196608 | ((i3 << 3) & 896));
            aVar2.a0();
            aVar2.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
