package xsna;

import com.vk.newsfeed.posting.music_picker.presentation.model.MusicPickerListItem;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: LazyDsl.kt */
/* loaded from: classes4.dex */
public final class jt40 implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ wow b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ izs d;
    public final /* synthetic */ MusicPickerListItem.MusicTrackItem.PlayingState e;
    public final /* synthetic */ String f;
    public final /* synthetic */ wax g;
    public final /* synthetic */ boolean h;

    public jt40(wow wowVar, boolean z, izs izsVar, MusicPickerListItem.MusicTrackItem.PlayingState playingState, String str, wax waxVar, boolean z2) {
        this.b = wowVar;
        this.c = z;
        this.d = izsVar;
        this.e = playingState;
        this.f = str;
        this.g = waxVar;
        this.h = z2;
    }

    @Override // xsna.zzs
    public final s3q0 invoke(ksy ksyVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
        int i;
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
        if (aVar2.t(i & 1, (i & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2039820996, i, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            Object obj = this.b.b.get(intValue);
            int i2 = i & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
            aVar2.K(1212316189);
            lt40.e(intValue, (MusicPickerListItem) obj, this.c, this.d, null, this.e, this.f, this.g, this.h, aVar2, (i2 >> 3) & 14);
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
