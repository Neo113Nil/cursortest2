package xsna;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.newsfeed.posting.music_picker.presentation.model.MusicPickerListItem;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: SelectedTracksModalBottomSheet.kt */
/* loaded from: classes4.dex */
public final class nbi0 {
    public static final /* synthetic */ qcy<Object>[] a;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(nbi0.class, "listItemPosition", "getListItemPosition(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1);
        fpf0.a.getClass();
        a = new qcy[]{mutablePropertyReference1Impl};
    }

    public static final void a(final List list, final String str, final MusicPickerListItem.MusicTrackItem.PlayingState playingState, q630 q630Var, final izs izsVar, final gzs gzsVar, final izs izsVar2, androidx.compose.runtime.a aVar, final int i) {
        final q630 q630Var2;
        int i2;
        int i3;
        int i4;
        final SnapshotStateList snapshotStateList;
        Throwable th;
        int i5;
        androidx.compose.runtime.a M = aVar.M(1690686694);
        int i6 = i | (M.J(list) ? 32 : 16) | (M.J(str) ? 256 : 128) | (M.o(playingState.ordinal()) ? 2048 : 1024) | (M.y(izsVar) ? 131072 : 65536) | (M.y(gzsVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.y(izsVar2) ? 8388608 : 4194304);
        if (M.t(i6 & 1, (4785299 & i6) != 4785298)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1690686694, i6, -1, "com.vk.newsfeed.posting.music_picker.presentation.TracksList (SelectedTracksModalBottomSheet.kt:165)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.d(new wow(list));
                M.R(x);
            }
            SnapshotStateList snapshotStateList2 = (SnapshotStateList) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new com.vk.movika.tools.controls.seekbar.q(snapshotStateList2, 10);
                M.R(x2);
            }
            wzs wzsVar = (wzs) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new jue(4);
                M.R(x3);
            }
            wzs wzsVar2 = (wzs) x3;
            int i7 = 458752 & i6;
            boolean z = i7 == 131072;
            Object x4 = M.x();
            if (z || x4 == c0012a) {
                x4 = new wn7(14, izsVar, snapshotStateList2);
                M.R(x4);
            }
            final zzf0 r = sp.r(wzsVar, null, wzsVar2, (wzs) x4, M, 390, 50);
            xvy xvyVar = r.o;
            i160 I = dz5.I(0, 1, M, false);
            q630.a aVar2 = q630.a.a;
            q630 t = n34.t(aVar2, I, null);
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = new sm0(6);
                M.R(x5);
            }
            q630 z2 = txj0.z(yzf0.a(ahh0.b(t, m4s.C((izs) x5, M, 6), Orientation.Vertical), r), null, 3);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            q630 E = ahn.E(z2.g(new xpy(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, false)), "MusicEditorBottomSheetTracksList");
            boolean J = ((i6 & 896) == 256) | ((i6 & 7168) == 2048) | M.J(r) | ((29360128 & i6) == 8388608) | (i7 == 131072);
            int i8 = i6 & 3670016;
            boolean z3 = J | (i8 == 1048576);
            Object x6 = M.x();
            if (z3 || x6 == c0012a) {
                i2 = 1;
                i3 = i8;
                i4 = i7;
                snapshotStateList = snapshotStateList2;
                th = null;
                i5 = 0;
                izs izsVar3 = new izs() { // from class: xsna.hbi0
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        a9b a9bVar = new a9b(8);
                        SnapshotStateList snapshotStateList3 = SnapshotStateList.this;
                        ((nvy) obj).e(snapshotStateList3.size(), new lbi0(a9bVar, snapshotStateList3), new hoj(snapshotStateList3), new jai(2039820996, new mbi0(snapshotStateList3, snapshotStateList3, r, str, playingState, izsVar2, izsVar, gzsVar), true));
                        return s3q0.a;
                    }
                };
                M.R(izsVar3);
                x6 = izsVar3;
            } else {
                i3 = i8;
                i4 = i7;
                i2 = 1;
                snapshotStateList = snapshotStateList2;
                th = null;
                i5 = 0;
            }
            int i9 = i3;
            SnapshotStateList snapshotStateList3 = snapshotStateList;
            lqy.a(E, xvyVar, null, null, null, null, false, null, (izs) x6, M, 0, IronSourceError.ERROR_CODE_INIT_FAILED);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, i5, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(aVar2, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, i5);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw th;
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
            k9q0.w(M, c, cri.a.d);
            String N = d370.N(R.string.music_picker_ready, i5, M);
            ButtonSize buttonSize = ButtonSize.Large;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            float f = 16;
            float f2 = 12;
            q630 E2 = ahn.E(s200.G(txj0.f(aVar2, 1.0f), f, f2, f, f2), "MusicEditorBottomSheetEditorButton");
            int i10 = i4 == 131072 ? i2 : i5;
            if (i9 == 1048576) {
                i5 = i2;
            }
            int i11 = i10 | i5;
            Object x7 = M.x();
            if (i11 != 0 || x7 == c0012a) {
                x7 = new jch(izsVar, snapshotStateList3, gzsVar, 4);
                M.R(x7);
            }
            bhu0.e((gzs) x7, buttonSize, buttonStyle, buttonAppearance, E2, null, false, false, null, null, null, N, null, null, null, null, false, null, null, null, M, 28080, 0, 0, 4190176);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(list, str, playingState, q630Var2, izsVar, gzsVar, izsVar2, i) { // from class: xsna.ibi0
                public final /* synthetic */ List b;
                public final /* synthetic */ String c;
                public final /* synthetic */ MusicPickerListItem.MusicTrackItem.PlayingState d;
                public final /* synthetic */ q630 e;
                public final /* synthetic */ izs f;
                public final /* synthetic */ gzs g;
                public final /* synthetic */ izs h;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I2 = ne7.I(7);
                    nbi0.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (androidx.compose.runtime.a) obj, I2);
                    return s3q0.a;
                }
            };
        }
    }
}
