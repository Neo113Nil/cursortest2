package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.dto.music.MusicTrack;
import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import com.vk.newsfeed.posting.music_picker.presentation.model.MusicPickerListItem;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: SelectedSnippetsSettingsModalBottomSheet.kt */
/* loaded from: classes4.dex */
public final class ebi0 {
    /* JADX WARN: Code restructure failed: missing block: B:42:0x010d, code lost:
    
        if (r12 == null) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(List list, String str, MusicPickerListItem.MusicTrackItem.PlayingState playingState, q630 q630Var, izs izsVar, gzs gzsVar, izs izsVar2, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        MusicPickerListItem.MusicTrackItem.PlayingState playingState2;
        String str2 = str;
        androidx.compose.runtime.a M = aVar.M(81378181);
        int i2 = i | (M.J(list) ? 4 : 2) | (M.J(str2) ? 32 : 16) | (M.o(playingState.ordinal()) ? 256 : 128) | 3072 | (M.y(izsVar) ? 16384 : 8192) | (M.y(gzsVar) ? 131072 : 65536) | (M.y(izsVar2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        boolean z = true;
        boolean z2 = false;
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            int i3 = -1;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(81378181, i2, -1, "com.vk.newsfeed.posting.music_picker.presentation.TracksList (SelectedSnippetsSettingsModalBottomSheet.kt:232)");
            }
            q630.a aVar3 = q630.a.a;
            q630 E = ahn.E(aVar3, "MusicSnippetEditorBottomSheetTracksList");
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            Iterator a2 = yu50.a(M, c, cri.a.d, -340265779, list);
            int i4 = 0;
            while (true) {
                boolean hasNext = a2.hasNext();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (hasNext) {
                    Object next = a2.next();
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        e43.t();
                        throw null;
                    }
                    MusicDto musicDto = (MusicDto) next;
                    MusicTrack musicTrack = musicDto.m;
                    if (musicTrack != null) {
                        playingState2 = epx.f(musicTrack.Ib(), str2) ? playingState : MusicPickerListItem.MusicTrackItem.PlayingState.None;
                    }
                    playingState2 = MusicPickerListItem.MusicTrackItem.PlayingState.None;
                    ae50 b = nb50.b(musicDto, z, z2);
                    boolean o = M.o(i4);
                    Object x = M.x();
                    if (o || x == c0012a) {
                        x = new ezr(i4, 1);
                        M.R(x);
                    }
                    q630 b2 = egi0.b(aVar3, z2, (izs) x);
                    boolean z3 = playingState2 != MusicPickerListItem.MusicTrackItem.PlayingState.None ? true : z2;
                    boolean z4 = playingState2 == MusicPickerListItem.MusicTrackItem.PlayingState.Playing ? true : z2;
                    boolean J = ((3670016 & i2) == 1048576) | M.J(musicDto);
                    Object x2 = M.x();
                    if (J || x2 == c0012a) {
                        x2 = new vf1(16, izsVar2, musicDto);
                        M.R(x2);
                    }
                    androidx.compose.runtime.a aVar5 = M;
                    qa50.a(b, false, z3, z4, b2, null, false, null, (gzs) x2, null, null, null, aVar5, 48, 3808);
                    i3 = -1;
                    z2 = false;
                    aVar3 = aVar3;
                    M = aVar5;
                    i4 = i5;
                    z = true;
                    str2 = str;
                    a2 = a2;
                } else {
                    androidx.compose.runtime.a aVar6 = M;
                    q630.a aVar7 = aVar3;
                    boolean z5 = z2;
                    int i6 = i3;
                    boolean z6 = z;
                    if (gp.d(aVar6)) {
                        androidx.compose.runtime.b.f(1040687336, z5 ? 1 : 0, i6, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar6.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    q630 m = hr80.m(aVar7, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a);
                    a.m mVar2 = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar2, dt1.a.n, aVar6, z5 ? 1 : 0);
                    int hashCode2 = Long.hashCode(n34.n(aVar6));
                    sy90 D2 = aVar6.D();
                    q630 c2 = qri.c(aVar6, m);
                    cri.h7.getClass();
                    LayoutNode.a aVar8 = cri.a.b;
                    if (aVar6.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar6.H();
                    if (aVar6.L()) {
                        aVar6.I(aVar8);
                    } else {
                        aVar6.f();
                    }
                    k9q0.w(aVar6, a3, cri.a.f);
                    k9q0.w(aVar6, D2, cri.a.e);
                    k9q0.w(aVar6, Integer.valueOf(hashCode2), cri.a.g);
                    k9q0.t(aVar6, cri.a.h);
                    k9q0.w(aVar6, c2, cri.a.d);
                    String N = d370.N(R.string.music_picker_ready, z5 ? 1 : 0, aVar6);
                    ButtonSize buttonSize = ButtonSize.Large;
                    ButtonStyle buttonStyle = ButtonStyle.Primary;
                    ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                    float f = 16;
                    float f2 = 12;
                    q630 E2 = ahn.E(s200.G(txj0.f(aVar7, 1.0f), f, f2, f, f2), "MusicSnippetEditorSaveButton");
                    boolean z7 = ((i2 & 14) == 4 ? z6 : z5 ? 1 : 0) | ((57344 & i2) == 16384 ? z6 : z5 ? 1 : 0) | ((i2 & 458752) == 131072 ? z6 : z5 ? 1 : 0);
                    Object x3 = aVar6.x();
                    if (z7 || x3 == c0012a) {
                        x3 = new q21(izsVar, list, gzsVar, 4);
                        aVar6.R(x3);
                    }
                    bhu0.e((gzs) x3, buttonSize, buttonStyle, buttonAppearance, E2, null, false, false, null, null, null, N, null, null, null, null, false, null, null, null, aVar6, 28080, 0, 0, 4190176);
                    aVar2 = aVar6;
                    aVar2.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    q630Var2 = aVar7;
                }
            }
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new k5l(list, str, playingState, q630Var2, izsVar, gzsVar, izsVar2, i);
        }
    }
}
