package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPlaceDto;
import com.vkontakte.android.R;
import java.util.List;
import xsna.q630;

/* compiled from: PlacePickerEntryPointCell.kt */
/* loaded from: classes4.dex */
public final class vqa0 {
    public static final void a(PostingPlaceDto postingPlaceDto, List list, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        String a;
        String a2;
        String str;
        androidx.compose.runtime.a M = aVar.M(-347488353);
        if ((i & 6) == 0) {
            i2 = (M.J(postingPlaceDto) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-347488353, i2, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.steps.PlacePickerEntryPointCell (PlacePickerEntryPointCell.kt:29)");
            }
            String str2 = postingPlaceDto != null ? postingPlaceDto.c : null;
            if (str2 == null || str2.length() == 0) {
                a = zq.a(M, 1071149522, R.string.posting_step2_place_button, M, 0);
            } else {
                M.K(-1154035232);
                a = postingPlaceDto != null ? postingPlaceDto.c : null;
                if (a == null) {
                    a = zq.a(M, 1071152210, R.string.posting_step2_place_button, M, 0);
                } else {
                    M.K(1071151714);
                    M.j();
                }
                M.j();
            }
            String str3 = postingPlaceDto != null ? postingPlaceDto.c : null;
            if (str3 == null || str3.length() == 0) {
                a2 = zq.a(M, -1153862810, R.string.posting_step2_empty_place_button_content_description, M, 0);
            } else {
                M.K(-1153764447);
                a2 = d370.O(R.string.posting_step2_place_button_content_description, new Object[]{str3}, M);
                M.j();
            }
            vtu vtuVar = (vtu) M.r(uvi.l);
            String str4 = postingPlaceDto != null ? postingPlaceDto.d : null;
            String str5 = a;
            boolean z = postingPlaceDto != null;
            boolean z2 = postingPlaceDto == null && !list.isEmpty();
            int i3 = i2 & 896;
            boolean z3 = i3 == 256;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z3 || x == c0012a) {
                x = new yd1(izsVar, 6);
                M.R(x);
            }
            gzs gzsVar = (gzs) x;
            boolean z4 = i3 == 256;
            Object x2 = M.x();
            if (z4 || x2 == c0012a) {
                x2 = new mv7(izsVar, 6);
                M.R(x2);
            }
            gzs gzsVar2 = (gzs) x2;
            String N = d370.N(R.string.posting_step2_remove_place_button_content_description, 0, M);
            Object x3 = M.x();
            if (x3 == c0012a) {
                str = N;
                x3 = com.vk.core.compose.component.semantics.b.a(null, new p2u(16), 3);
                M.R(x3);
            } else {
                str = N;
            }
            SemanticsConfiguration semanticsConfiguration = (SemanticsConfiguration) x3;
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = com.vk.core.compose.component.semantics.b.a(null, new quz(14), 3);
                M.R(x4);
            }
            SemanticsConfiguration semanticsConfiguration2 = (SemanticsConfiguration) x4;
            boolean J = M.J(a2);
            Object x5 = M.x();
            if (J || x5 == c0012a) {
                x5 = com.vk.core.compose.component.semantics.b.a(SemanticsConfiguration.Mode.ClearAndSet, new rj60(a2, 7), 2);
                M.R(x5);
            }
            aVar2 = M;
            String str6 = str4;
            boolean z5 = z2;
            k2r.a(str5, str6, z, z5, q630.a.a, gzsVar, gzsVar2, str, semanticsConfiguration, semanticsConfiguration2, (SemanticsConfiguration) x5, kai.c(986749187, new n17(list, izsVar, vtuVar, 1), M), aVar2, 905994240);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new q1h(i, 5, postingPlaceDto, list, izsVar);
        }
    }
}
