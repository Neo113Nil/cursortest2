package defpackage;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.ComposeView;
import com.yx360.design.BrandTheme;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.cashback.f;

/* loaded from: classes4.dex */
public abstract class co91 {
    public static final String[] a = {"🚗️", "🚕️", "🚙️", "🚌️", "🚎️", "🏎️", "🚓️", "🚑️", "🚒️", "🚐️", "🚚️", "🚛️", "🚜️", "🛴️", "🚲️", "🛵️", "🏍️", "🚨️", "🚔️", "🚍️", "🚘️", "🚖️", "🚡️", "🚠️", "🚟️", "🚃️", "🚋️", "🚞️", "🚝️", "🚄️", "🚅️", "🚈️", "🚂️", "🚆️", "🚇️", "🚊️", "🚉️", "🚁️", "🛩️", "✈️", "🛫️", "🛬️", "🚀️", "🛰️", "💺️", "🛶️", "⛵️", "🛥️", "🚤️", "🛳️", "⛴️", "🚢️", "⚓️", "🚧️", "⛽️", "🚏️", "🚦️", "🚥️", "🗺️", "🗿️", "🗽️", "⛲️", "🗼️", "🏰️", "🏯️", "🏟️", "🎡️", "🎢️", "🎠️", "⛱️", "🏖️", "🏝️", "⛰️", "🏔️", "🗻️", "🌋️", "🏜️", "🏕️", "⛺️", "🛤️", "🛣️", "🏗️", "🏭️", "🏠️", "🏡️", "🏘️", "🏚️", "🏢️", "🏬️", "🏣️", "🏤️", "🏥️", "🏦️", "🏨️", "🏪️", "🏫️", "🏩️", "💒️", "🏛️", "⛪️", "🕌️", "🕍️", "🕋️", "⛩️", "🗾️", "🎑️", "🏞️", "🌅️", "🌄️", "🌠️", "🎇️", "🎆️", "🌇️", "🌆️", "🏙️", "🌃️", "🌌️", "🌉️", "🌁"};

    public static final void a(oep0 oep0Var, w2d0 w2d0Var, fx60 fx60Var, z0j z0jVar, f fVar) {
        fx60Var.a(Events$Zalogin$LoginContext.DEEPLINK, new r8c0(z0jVar, oep0Var, fVar, w2d0Var, 1));
    }

    public static final xtm b(BrandTheme brandTheme) {
        yom yomVar;
        switch (xom.a[brandTheme.ordinal()]) {
            case 1:
                yomVar = wom.a;
                break;
            case 2:
                yomVar = wom.b;
                break;
            case 3:
                yomVar = wom.d;
                break;
            case 4:
                yomVar = wom.e;
                break;
            case 5:
                yomVar = wom.c;
                break;
            case 6:
                yomVar = wom.g;
                break;
            case 7:
                yomVar = wom.f;
                break;
            case 8:
                yomVar = wom.h;
                break;
            case 9:
                yomVar = wom.i;
                break;
            case 10:
                yomVar = wom.j;
                break;
            case 11:
                yomVar = wom.k;
                break;
            case 12:
                yomVar = wom.l;
                break;
            default:
                w511.b();
                return null;
        }
        return new xtm(yomVar);
    }

    public static final void c(ComposeView composeView, wls wlsVar) {
        ttd ttdVar;
        Context context = composeView.getContext();
        while (true) {
            ttdVar = null;
            if (!(context instanceof Activity)) {
                if ((context instanceof ContextWrapper) && (context = ((ContextWrapper) context).getBaseContext()) == null) {
                    break;
                }
            } else {
                ComponentCallbacks2 componentCallbacks2 = (Activity) context;
                xmr0 xmr0Var = componentCallbacks2 instanceof xmr0 ? (xmr0) componentCallbacks2 : null;
                if (xmr0Var != null) {
                    ttdVar = xmr0Var.getSharedComposeContext();
                }
            }
        }
        if (ttdVar == null) {
            composeView.setContent(new a(-1981940024, new cp1(wlsVar, 20), true));
        } else {
            composeView.setParentCompositionContext(ttdVar);
            composeView.setContent(wlsVar);
        }
    }
}
