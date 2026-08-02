package xsna;

import com.vk.music.bottomsheets.artistlist.domain.LoadingState;

/* compiled from: ArtistListView.kt */
/* loaded from: classes3.dex */
public final class tr3 implements zzs<spg0, q630, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ yq3 b;
    public final /* synthetic */ mtk0<LoadingState> c;

    /* JADX WARN: Multi-variable type inference failed */
    public tr3(yq3 yq3Var, mtk0<? extends LoadingState> mtk0Var) {
        this.b = yq3Var;
        this.c = mtk0Var;
    }

    @Override // xsna.zzs
    public final s3q0 invoke(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, Integer num) {
        q630 q630Var2 = q630Var;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if ((intValue & 48) == 0) {
            intValue |= aVar2.J(q630Var2) ? 32 : 16;
        }
        if (aVar2.t(intValue & 1, (intValue & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1559894230, intValue, -1, "com.vk.music.bottomsheets.artistlist.presentation.ArtistListView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ArtistListView.kt:108)");
            }
            xr3.a(this.c.getValue(), this.b, q630Var2, aVar2, (intValue << 3) & 896);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
