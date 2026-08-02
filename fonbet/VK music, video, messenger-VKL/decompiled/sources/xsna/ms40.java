package xsna;

import android.content.Context;
import com.vk.dto.music.MusicTrack;
import com.vk.newsfeed.posting.music_picker.presentation.model.MusicPickerListItem;
import com.vk.newsfeed.posting.music_picker.presentation.model.b;
import com.vk.newsfeed.posting.music_picker.presentation.view.MusicPickerLoadingState;
import java.util.Arrays;
import java.util.List;

/* compiled from: MusicPickerContentView.kt */
/* loaded from: classes4.dex */
public final class ms40 extends i6v0<xu40, lr40> {
    public final com.vk.newsfeed.posting.music_picker.presentation.model.b f;
    public final wax g;
    public final uw3 h;
    public final tzv i;
    public final boolean j;

    public ms40(com.vk.newsfeed.posting.music_picker.presentation.model.b bVar, tg50 tg50Var, Context context, rt40 rt40Var, uw3 uw3Var, tzv tzvVar, boolean z) {
        super(context, rt40Var);
        this.f = bVar;
        this.g = tg50Var;
        this.h = uw3Var;
        this.i = tzvVar;
        this.j = z;
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        h((xu40) ao50Var, izsVar, aVar, 512);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(xu40 xu40Var, izs<? super lr40, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        izs<? super lr40, s3q0> izsVar2 = izsVar;
        androidx.compose.runtime.a M = aVar.M(875557962);
        int c = M.c();
        int i2 = i | (M.J(xu40Var) ? 4 : 2) | (M.y(izsVar2) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(875557962, i2, -1, "com.vk.newsfeed.posting.music_picker.presentation.view.MusicPickerContentView.ThemedContent (MusicPickerContentView.kt:28)");
            }
            com.vk.newsfeed.posting.music_picker.presentation.model.b bVar = (com.vk.newsfeed.posting.music_picker.presentation.model.b) d(this.f, (n0u0[]) Arrays.copyOf(new n0u0[]{xu40Var.a}, 1), M, (((i2 << 3) & 7168) >> 3) & 896).getValue();
            if (!(bVar instanceof b.a)) {
                M.C(c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                androidx.compose.runtime.f s = M.s();
                if (s != null) {
                    s.d = new zl3(i, 3, this, xu40Var, izsVar2);
                    return;
                }
                return;
            }
            b.a aVar3 = (b.a) bVar;
            wh50 c2 = jk50.c(aVar3.l, M);
            wh50 c3 = jk50.c(aVar3.k, M);
            wh50 c4 = jk50.c(aVar3.b, M);
            wh50 c5 = jk50.c(aVar3.c, M);
            wh50 c6 = jk50.c(aVar3.a, M);
            wh50 c7 = jk50.c(aVar3.m, M);
            wh50 c8 = jk50.c(aVar3.j, M);
            wh50 c9 = jk50.c(aVar3.h, M);
            wh50 c10 = jk50.c(aVar3.d, M);
            wh50 c11 = jk50.c(aVar3.e, M);
            wh50 a = jk50.a(aVar3.f, M, 0, 3);
            wh50 c12 = jk50.c(aVar3.n, M);
            List<T> list = ((wow) c9.getValue()).b;
            boolean booleanValue = ((Boolean) c4.getValue()).booleanValue();
            boolean booleanValue2 = ((Boolean) c5.getValue()).booleanValue();
            String str = (String) c6.getValue();
            boolean booleanValue3 = ((Boolean) c2.getValue()).booleanValue();
            MusicPickerLoadingState musicPickerLoadingState = (MusicPickerLoadingState) c3.getValue();
            boolean booleanValue4 = ((Boolean) c7.getValue()).booleanValue();
            cc40 cc40Var = (cc40) c8.getValue();
            int intValue = ((Number) c10.getValue()).intValue();
            MusicPickerListItem.MusicTrackItem.PlayingState playingState = (MusicPickerListItem.MusicTrackItem.PlayingState) c11.getValue();
            MusicTrack musicTrack = (MusicTrack) a.getValue();
            aVar2 = M;
            izsVar2 = izsVar;
            lt40.c(intValue, this.g, list, cc40Var, musicPickerLoadingState, null, str, booleanValue3, booleanValue, booleanValue2, this.j, izsVar2, this.i, this.h, booleanValue4, playingState, musicTrack != null ? musicTrack.Ib() : null, ((Boolean) c12.getValue()).booleanValue(), aVar2, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s2 = aVar2.s();
        if (s2 != null) {
            s2.d = new n9d(this, xu40Var, izsVar2, i);
        }
    }
}
