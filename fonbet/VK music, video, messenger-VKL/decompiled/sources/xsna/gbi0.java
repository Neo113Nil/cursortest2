package xsna;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.dto.music.MusicTrack;
import com.vk.music.player.PlayState;
import com.vk.music.player.e;
import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import com.vk.newsfeed.posting.music_picker.presentation.model.MusicPickerListItem;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.cri;
import xsna.dt1;
import xsna.k840;
import xsna.q630;

/* compiled from: SelectedTracksModalBottomSheet.kt */
/* loaded from: classes4.dex */
public final class gbi0 extends jmu0 {
    public static final /* synthetic */ int o1 = 0;
    public final wh50 h1 = androidx.compose.runtime.k.b(new wow(EmptyList.b));
    public final wh50 i1 = androidx.compose.runtime.k.b(new p7x(22));
    public final wh50 j1 = androidx.compose.runtime.k.b(new c3v(22));
    public final wh50 k1 = androidx.compose.runtime.k.b(null);
    public final wh50 l1 = androidx.compose.runtime.k.b(MusicPickerListItem.MusicTrackItem.PlayingState.None);
    public final wh50 m1 = androidx.compose.runtime.k.b(k840.a.g().b());
    public final c n1 = new c();

    /* compiled from: SelectedTracksModalBottomSheet.kt */
    public static final class a extends kmu0 {
        public final List<MusicDto> h;
        public final bq00 i;
        public final o440 j;

        public a(Context context, List list, bq00 bq00Var, o440 o440Var) {
            super(context, tzp0.a(null, 3));
            this.h = list;
            this.i = bq00Var;
            this.j = o440Var;
            F0(true);
            J();
            n0(0);
            o0(0);
            p0(0);
            m0(0);
            N0();
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            gbi0 gbi0Var = new gbi0();
            ((zak0) gbi0Var.h1).setValue(new wow(this.h));
            ((zak0) gbi0Var.i1).setValue(this.i);
            ((zak0) gbi0Var.j1).setValue(this.j);
            return gbi0Var;
        }
    }

    /* compiled from: SelectedTracksModalBottomSheet.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((gbi0) this.receiver).dismiss();
            return s3q0.a;
        }
    }

    /* compiled from: SelectedTracksModalBottomSheet.kt */
    public static final class c extends e.a {

        /* compiled from: SelectedTracksModalBottomSheet.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PlayState.values().length];
                try {
                    iArr[PlayState.PLAYING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PlayState.PAUSED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public c() {
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void N3(PlayState playState, com.vk.music.player.f fVar) {
            int i = gbi0.o1;
            gbi0 gbi0Var = gbi0.this;
            wh50 wh50Var = gbi0Var.m1;
            ((zak0) gbi0Var.k1).setValue(((u2b0) ((zak0) wh50Var).getValue()).b());
            int i2 = a.$EnumSwitchMapping$0[((u2b0) ((zak0) wh50Var).getValue()).m0().ordinal()];
            ((zak0) gbi0Var.l1).setValue(i2 != 1 ? i2 != 2 ? MusicPickerListItem.MusicTrackItem.PlayingState.None : MusicPickerListItem.MusicTrackItem.PlayingState.Paused : MusicPickerListItem.MusicTrackItem.PlayingState.Playing);
        }
    }

    @Override // xsna.jmu0
    public final void co(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-2073704833);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2073704833, i2, -1, "com.vk.newsfeed.posting.music_picker.presentation.SelectedTracksModalBottomSheet.ThemedContent (SelectedTracksModalBottomSheet.kt:97)");
            }
            float f = 12;
            uog0 d = vog0.d(f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
            q630.a aVar2 = q630.a.a;
            q630 d2 = rte0.d(aVar2, d);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(d2, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, m);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            String N = d370.N(R.string.music_picker_selected_tracks_screen_close, 0, M);
            boolean y = M.y(this);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (y || x == c0012a) {
                x = new e550(this, 26);
                M.R(x);
            }
            TopBar$Before.d a3 = TopBar$Before.d.a.a(N, (gzs) x, null, null, M, 24576, 12);
            TopBar$Middle.Text a4 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(d370.N(R.string.music_picker_selected_tracks_screen_title, 0, M), null, null, null, null, M, 196608, 30), null, null, null, M, 14);
            q630 t = n34.t(aVar2, dz5.I(6, 0, M, true), null);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new k990(17);
                M.R(x2);
            }
            muv0.h(a4, ahn.E(ahh0.b(t, m4s.C((izs) x2, M, 6), Orientation.Vertical), "MusicEditorBottomSheetToolbar"), null, null, null, a3, null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8156);
            List<T> list = ((wow) ((zak0) this.h1).getValue()).b;
            MusicTrack musicTrack = (MusicTrack) ((zak0) this.k1).getValue();
            String Ib = musicTrack != null ? musicTrack.Ib() : null;
            MusicPickerListItem.MusicTrackItem.PlayingState playingState = (MusicPickerListItem.MusicTrackItem.PlayingState) ((zak0) this.l1).getValue();
            izs izsVar = (izs) ((zak0) this.i1).getValue();
            boolean y2 = M.y(this);
            Object x3 = M.x();
            if (y2 || x3 == c0012a) {
                b bVar = new b(0, this, gbi0.class, "dismiss", "dismiss()V", 0);
                M.R(bVar);
                x3 = bVar;
            }
            nbi0.a(list, Ib, playingState, null, izsVar, (gzs) ((fcy) x3), (izs) ((zak0) this.j1).getValue(), M, 6);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.p(this, i, 14);
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((u2b0) ((zak0) this.m1).getValue()).P0(this.n1, true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        ((u2b0) ((zak0) this.m1).getValue()).n0(this.n1);
        super.onDestroy();
    }
}
