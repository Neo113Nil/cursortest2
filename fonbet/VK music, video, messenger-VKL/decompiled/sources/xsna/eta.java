package xsna;

import androidx.compose.runtime.a;
import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.dto.stories.model.StoryEntry;
import xsna.g6v.a;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class eta implements zzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ eta(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2 = this.b;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        switch (i2) {
            case 0:
                ((gta) obj7).e((StoryEntry) obj6, (StoryPrivacyType) obj, (po6) obj5);
                break;
            default:
                g6v g6vVar = (g6v) obj7;
                v5v v5vVar = (v5v) obj6;
                Cell$Middle.Size size = (Cell$Middle.Size) obj5;
                izs izsVar = (izs) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 6) == 0) {
                    i = (aVar.y(izsVar) ? 4 : 2) | intValue;
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    i |= aVar.l(booleanValue) ? 32 : 16;
                }
                if (aVar.t(i & 1, (i & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(832267532, i, -1, "com.vk.avatarchange.HighlightedTitle.Content.<anonymous> (StoryRepostSwitchCell.kt:80)");
                    }
                    s3q0 s3q0Var = s3q0.a;
                    boolean J = aVar.J(g6vVar);
                    Object x = aVar.x();
                    if (J || x == a.C0011a.a) {
                        x = g6vVar.new a(null);
                        aVar.R(x);
                    }
                    bap.g(s3q0Var, (wzs) x, aVar, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    iyk0 iyk0Var = rrv0.a;
                    ylu0 ylu0Var = (ylu0) aVar.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    boolean s = true ^ ylu0Var.s();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var2 = (ylu0) aVar.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j = ylu0Var2.getText().o;
                    bpn0 bpn0Var = v5v.c;
                    Cell$Middle.d.b.b(d8v0.c(v5vVar, booleanValue, s, j, aVar, i & 112), null, null, null, 0, 0, null, null, izsVar, aVar, (i << 27) & 1879048192, 6, 510).c(q630.a.a, size, aVar, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
        }
        return s3q0.a;
    }
}
