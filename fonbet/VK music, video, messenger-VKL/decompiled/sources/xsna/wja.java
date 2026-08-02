package xsna;

import android.R;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.a;
import androidx.preference.Preference;
import com.ironsource.X2;
import com.vk.clips.interests.impl.di.ClipsInterestsComponentImpl;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.topbar.d;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.common.Image;
import com.vk.ecomm.verifiedseller.impl.screens.obtainverification.model.ObtainVerificationScreenContent;
import com.vk.im.engine.lifecycle.di.ImEngineLifecycleComponent;
import com.vk.newsfeed.impl.util.NewsEntryWatcherMode;
import io.reactivex.rxjava3.internal.operators.maybe.c;
import java.util.List;
import xsna.hb60;
import xsna.ky6;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class wja implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wja(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = 2;
        int i2 = 3;
        char c = 1;
        switch (this.b) {
            case 0:
                List list = (List) this.c;
                izs izsVar = (izs) this.d;
                ((Integer) obj2).getClass();
                zja.b(ne7.I(1), (androidx.compose.runtime.a) obj, list, izsVar);
                break;
            case 1:
                io.reactivex.rxjava3.core.l lVar = (io.reactivex.rxjava3.core.l) this.c;
                xge xgeVar = (xge) this.d;
                Image image = (Image) obj2;
                c.a aVar = (c.a) lVar;
                if (!aVar.h()) {
                    aVar.f(new hfx(image, ((ClipsInterestsComponentImpl) xgeVar.e.getValue()).Df(), new bi6(xgeVar.d, 3)));
                }
                break;
            case 2:
                izs izsVar2 = (izs) this.d;
                yhf yhfVar = (yhf) this.c;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1244420852, intValue, -1, "com.vk.clips.upload.ui.impl.compose.views.Content.<anonymous> (ClipsUploadScreen.kt:222)");
                    }
                    boolean J = aVar2.J(izsVar2);
                    Object x = aVar2.x();
                    if (J || x == c0012a) {
                        x = new wn1(izsVar2, i2);
                        aVar2.R(x);
                    }
                    gzs gzsVar = (gzs) x;
                    boolean J2 = aVar2.J(izsVar2);
                    Object x2 = aVar2.x();
                    if (J2 || x2 == c0012a) {
                        x2 = new lq0(izsVar2, i);
                        aVar2.R(x2);
                    }
                    gzs gzsVar2 = (gzs) x2;
                    boolean J3 = aVar2.J(izsVar2);
                    Object x3 = aVar2.x();
                    if (J3 || x3 == c0012a) {
                        x3 = new mnc(izsVar2, c == true ? 1 : 0);
                        aVar2.R(x3);
                    }
                    khf.a(gzsVar, gzsVar2, (gzs) x3, yhfVar.a(), null, aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 3:
                vvh vvhVar = (vvh) this.c;
                String str = (String) this.d;
                View view = (View) obj;
                hb60.a aVar3 = (hb60.a) obj2;
                hb60 hb60Var = vvhVar.m.v.a.get(NewsEntryWatcherMode.NORMAL);
                if (hb60Var != null) {
                    hb60Var.c.remove(aVar3);
                }
                bwt0.j(view, new gq0(view, str, vvhVar, i2));
                break;
            case 4:
                DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
                Preference preference = (Preference) this.d;
                CharSequence charSequence = (CharSequence) obj2;
                String[] strArr = DebugDevSettingsFragment.t0;
                if (charSequence.length() > 0) {
                    ky6.a aVar4 = (ky6.a) com.vk.core.preference.Preference.j().edit();
                    aVar4.putString(preference.n, charSequence.toString());
                    aVar4.a();
                } else {
                    ky6.a aVar5 = (ky6.a) com.vk.core.preference.Preference.j().edit();
                    aVar5.remove(preference.n);
                    aVar5.a();
                }
                ((ImEngineLifecycleComponent) j6i.b(m7m.d(debugDevSettingsFragment), ImEngineLifecycleComponent.class)).N().b();
                debugDevSettingsFragment.ko();
                break;
            case 5:
                ((Integer) obj2).getClass();
                f8t.a((c8t) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(49));
                break;
            case 6:
                ((Integer) obj2).getClass();
                ((giy) this.c).a((q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 7:
                wx20 wx20Var = (wx20) this.c;
                Context context = (Context) this.d;
                View view2 = (View) obj;
                e520 e520Var = (e520) obj2;
                if (!wx20Var.e()) {
                    wx20Var.f(view2.getContext(), e520Var);
                }
                view2.postDelayed(new i09(wx20Var, view2, e520Var, i), context.getResources().getInteger(R.integer.config_shortAnimTime));
                break;
            case 8:
                ObtainVerificationScreenContent obtainVerificationScreenContent = (ObtainVerificationScreenContent) this.c;
                izs izsVar3 = (izs) this.d;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar6.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1275283348, intValue2, -1, "com.vk.ecomm.verifiedseller.impl.screens.obtainverification.ui.ObtainVerificationScreen.<anonymous> (ObtainVerificationScreen.kt:68)");
                    }
                    boolean z = obtainVerificationScreenContent != null ? obtainVerificationScreenContent.f.b : false;
                    String str2 = obtainVerificationScreenContent != null ? obtainVerificationScreenContent.f.a : null;
                    if (str2 == null) {
                        str2 = zq.a(aVar6, -1481613767, com.vkontakte.android.R.string.get_a_checkmark, aVar6, 0);
                    } else {
                        aVar6.K(-1481615038);
                        aVar6.j();
                    }
                    String str3 = str2;
                    q630 E = ahn.E(s200.E(txj0.f(q630.a.a, 1.0f), kqu0.b, kqu0.c), "select_group_verification_proceed_button");
                    ButtonSize buttonSize = ButtonSize.Large;
                    ButtonStyle buttonStyle = ButtonStyle.Primary;
                    ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                    boolean z2 = obtainVerificationScreenContent != null ? obtainVerificationScreenContent.f.c : false;
                    boolean J4 = aVar6.J(izsVar3);
                    Object x4 = aVar6.x();
                    if (J4 || x4 == a.C0011a.a) {
                        x4 = new nhf(izsVar3, 5);
                        aVar6.R(x4);
                    }
                    bhu0.e((gzs) x4, buttonSize, buttonStyle, buttonAppearance, E, null, z2, false, null, null, null, str3, null, null, null, null, z, null, null, null, aVar6, X2.b.f, 0, 0, 4058976);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                rok0.b((String) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                ((d.c.b) this.c).e((mtk0) this.d, (androidx.compose.runtime.a) obj, ne7.I(7));
                break;
            default:
                ((Integer) obj2).getClass();
                qnr0.b((gzs) this.c, (gzs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ wja(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }

    public /* synthetic */ wja(izs izsVar, yhf yhfVar) {
        this.b = 2;
        this.d = izsVar;
        this.c = yhfVar;
    }
}
