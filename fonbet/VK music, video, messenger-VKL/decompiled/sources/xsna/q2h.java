package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vk.core.compose.component.group.footer.GroupFooter;
import com.vk.profile.community.impl.ui.events.CommunityEventsState;
import com.vk.profile.community.impl.ui.events.d;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.kdh0;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class q2h implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q2h(int i, Object obj, izs izsVar) {
        this.b = i;
        this.d = obj;
        this.c = izsVar;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                CommunityEventsState.Content.Items items = (CommunityEventsState.Content.Items) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-634636648, intValue, -1, "com.vk.profile.community.impl.ui.events.CommunityEventsItems.<anonymous>.<anonymous>.<anonymous> (CommunityEventsFragment.kt:226)");
                    }
                    int i = d.a.$EnumSwitchMapping$0[items.c.ordinal()];
                    if (i == 1) {
                        aVar.K(-14263160);
                        aVar.j();
                    } else if (i == 2) {
                        aVar.K(-14182498);
                        com.vk.core.compose.component.cell.content.k0 a = Cell$Middle.a.a(Cell$Middle.d.b.a(d370.N(R.string.community_events_pagination_error, 0, aVar), null, null, 0, null, null, aVar, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, null, aVar, 196608, 30);
                        ButtonStyle buttonStyle = ButtonStyle.Tertiary;
                        ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                        ButtonSize buttonSize = ButtonSize.Small;
                        String N = d370.N(R.string.community_events_pagination_error_retry_button, 0, aVar);
                        izs izsVar = this.c;
                        boolean J = aVar.J(izsVar);
                        Object x = aVar.x();
                        if (J || x == a.C0011a.a) {
                            x = new qq5(izsVar, 2);
                            aVar.R(x);
                        }
                        wiu0.b(null, false, null, a, o.c.a(com.vk.core.compose.component.cell.content.k.a(buttonStyle, buttonAppearance, buttonSize, N, null, null, null, false, null, null, (gzs) x, aVar, 438, 1572864, 32752), null, null, null, null, aVar, 62), null, null, aVar, 0, 103);
                        aVar.j();
                    } else {
                        if (i != 3) {
                            throw alb0.c(-460778, aVar);
                        }
                        aVar.K(-13159219);
                        fxu0.a(GroupFooter.Loader.b.a.a(SpinnerState.Loading, GroupFooter.Loader.Size.S, aVar, 1572918), null, aVar, 0, 2);
                        aVar.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            default:
                kdh0.a aVar2 = (kdh0.a) this.d;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-524652573, intValue2, -1, "com.vk.video.ui.upload.impl.publish.presentation.publish.compose.screen.middleSettingsItems.<anonymous> (Loaded.kt:188)");
                    }
                    uzi0 uzi0Var = aVar2.k;
                    izs izsVar2 = this.c;
                    boolean J2 = aVar3.J(izsVar2);
                    Object x2 = aVar3.x();
                    if (J2 || x2 == a.C0011a.a) {
                        x2 = new h97(izsVar2, 3);
                        aVar3.R(x2);
                    }
                    tzi0.a(uzi0Var, (gzs) x2, ahn.E(q630.a.a, "LoadedTags.PRIVACY_WATCH"), null, aVar3, 384, 8);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
        }
    }
}
