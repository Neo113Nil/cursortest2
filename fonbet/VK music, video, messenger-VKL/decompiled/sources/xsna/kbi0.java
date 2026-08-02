package xsna;

import androidx.compose.runtime.a;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import com.vk.newsfeed.posting.music_picker.presentation.model.MusicPickerListItem;
import java.util.List;
import xsna.q630;

/* compiled from: SelectedTracksModalBottomSheet.kt */
/* loaded from: classes4.dex */
public final class kbi0 implements zzs<qa8, Boolean, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ int b;
    public final /* synthetic */ MusicPickerListItem.MusicTrackItem.PlayingState c;
    public final /* synthetic */ ae50 d;
    public final /* synthetic */ zzf0 e;
    public final /* synthetic */ izs<MusicDto, s3q0> f;
    public final /* synthetic */ MusicDto g;
    public final /* synthetic */ izs<List<MusicDto>, s3q0> h;
    public final /* synthetic */ gzs<s3q0> i;
    public final /* synthetic */ SnapshotStateList<MusicDto> j;

    /* JADX WARN: Multi-variable type inference failed */
    public kbi0(int i, MusicPickerListItem.MusicTrackItem.PlayingState playingState, ae50 ae50Var, zzf0 zzf0Var, izs<? super MusicDto, s3q0> izsVar, MusicDto musicDto, izs<? super List<MusicDto>, s3q0> izsVar2, gzs<s3q0> gzsVar, SnapshotStateList<MusicDto> snapshotStateList) {
        this.b = i;
        this.c = playingState;
        this.d = ae50Var;
        this.e = zzf0Var;
        this.f = izsVar;
        this.g = musicDto;
        this.h = izsVar2;
        this.i = gzsVar;
        this.j = snapshotStateList;
    }

    @Override // xsna.zzs
    public final s3q0 invoke(qa8 qa8Var, Boolean bool, androidx.compose.runtime.a aVar, Integer num) {
        boolean z;
        boolean booleanValue = bool.booleanValue();
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if ((intValue & 48) == 0) {
            intValue |= aVar2.l(booleanValue) ? 32 : 16;
        }
        boolean z2 = false;
        if (aVar2.t(intValue & 1, (intValue & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-636864364, intValue, -1, "com.vk.newsfeed.posting.music_picker.presentation.TracksList.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SelectedTracksModalBottomSheet.kt:205)");
            }
            int i = this.b;
            boolean o = aVar2.o(i);
            Object x = aVar2.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (o || x == c0012a) {
                x = new jbi0(i);
                aVar2.R(x);
            }
            q630 b = egi0.b(q630.a.a, false, (izs) x);
            MusicPickerListItem.MusicTrackItem.PlayingState playingState = MusicPickerListItem.MusicTrackItem.PlayingState.None;
            MusicPickerListItem.MusicTrackItem.PlayingState playingState2 = this.c;
            if (playingState2 != playingState) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            boolean z3 = playingState2 != MusicPickerListItem.MusicTrackItem.PlayingState.Playing ? z : true;
            izs<MusicDto, s3q0> izsVar = this.f;
            boolean J = aVar2.J(izsVar);
            MusicDto musicDto = this.g;
            boolean J2 = J | aVar2.J(musicDto);
            Object x2 = aVar2.x();
            if (J2 || x2 == c0012a) {
                x2 = new m650(1, izsVar, musicDto);
                aVar2.R(x2);
            }
            gzs gzsVar = (gzs) x2;
            boolean J3 = aVar2.J(musicDto);
            izs<List<MusicDto>, s3q0> izsVar2 = this.h;
            boolean J4 = J3 | aVar2.J(izsVar2);
            gzs<s3q0> gzsVar2 = this.i;
            boolean J5 = J4 | aVar2.J(gzsVar2);
            Object x3 = aVar2.x();
            if (J5 || x3 == c0012a) {
                fyb fybVar = new fyb(this.j, musicDto, izsVar2, gzsVar2, 1);
                aVar2.R(fybVar);
                x3 = fybVar;
            }
            qa50.a(this.d, false, z2, z3, b, null, booleanValue, this.e, gzsVar, (gzs) x3, null, null, aVar2, ((intValue << 15) & 3670016) | 48, 3104);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
