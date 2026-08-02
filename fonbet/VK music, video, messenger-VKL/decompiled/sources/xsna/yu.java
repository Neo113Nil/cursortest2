package xsna;

import com.vk.clips.design.view.component.button.ClipActionButton;
import com.vk.clips.sdk.models.ActionLinkSnippet;
import com.vk.clips.sdk.models.SdkActionLink;
import com.vk.clips.sdk.models.SnippetStyle;
import com.vkontakte.android.R;
import xsna.lw;
import xsna.zu;

/* compiled from: ActionButtonMapper.kt */
/* loaded from: classes17.dex */
public final class yu {
    public final yof a;
    public final boolean b;

    public yu(yof yofVar, boolean z) {
        this.a = yofVar;
        this.b = z;
    }

    public static lw.a b(zu zuVar) {
        SnippetStyle snippetStyle;
        Integer num;
        if (!zuVar.e) {
            return lw.a.c;
        }
        SdkActionLink sdkActionLink = zuVar.a;
        lw.a aVar = null;
        ActionLinkSnippet actionLinkSnippet = sdkActionLink != null ? sdkActionLink.g : null;
        if (actionLinkSnippet != null && (snippetStyle = actionLinkSnippet.i) != null && (num = snippetStyle.b) != null) {
            int intValue = num.intValue();
            Integer num2 = snippetStyle.c;
            cut0 cut0Var = lw.a.c.b;
            b8g b8gVar = new b8g(intValue);
            if (num2 != null) {
                cut0Var = new b8g(num2.intValue());
            }
            aVar = new lw.a(b8gVar, cut0Var);
        }
        return aVar == null ? new lw.a(zuVar.g, zuVar.h) : aVar;
    }

    public final lw a(zu zuVar) {
        lw.c.a aVar;
        boolean z = zuVar.d;
        SdkActionLink sdkActionLink = zuVar.a;
        if (sdkActionLink == null) {
            return lw.b.a;
        }
        String str = sdkActionLink.d;
        String str2 = sdkActionLink.e;
        if (str2.equals("link_community_with_subscribe")) {
            if (!z) {
                return lw.b.a;
            }
            boolean z2 = zuVar.b;
            boolean z3 = this.b;
            if (z2) {
                aVar = new lw.c.a(tq.h(tlo0.Companion, z3 ? R.string.clips_subscription_action_button_open_redesigned : R.string.clips_subscription_action_button_open));
            } else {
                aVar = z3 ? new lw.c.a(tq.h(tlo0.Companion, R.string.clips_subscription_action_button_redesigned)) : new lw.c.a(oq.d(tlo0.Companion, str));
            }
            return z3 ? lw.b.a : new lw.d(aVar, b(zuVar), ClipActionButton.Size.SMALL);
        }
        uu uuVar = zuVar.f;
        zu.a aVar2 = zuVar.c;
        zu.a.C4202a c4202a = aVar2 instanceof zu.a.C4202a ? (zu.a.C4202a) aVar2 : null;
        boolean f = epx.f(c4202a != null ? Boolean.valueOf(c4202a.a) : null, Boolean.TRUE);
        lw.c c3304c = c4202a != null ? new lw.c.C3304c(c4202a.b, c4202a.c, c4202a.d) : uuVar != null ? new lw.c.b(str, uuVar) : new lw.c.a(oq.d(tlo0.Companion, str));
        boolean z4 = f || c4202a == null;
        boolean z5 = this.a.P().a() && str2.equals("video");
        return ((z5 || z) && z4) ? new lw.d(c3304c, (!z5 || zuVar.e) ? b(zuVar) : lw.a.c, ClipActionButton.Size.SMALL) : lw.b.a;
    }
}
