package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.home.feature.webviews.internal.container.a;
import com.yandex.plus.home.feature.webviews.internal.stories.StoryNavigation;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.InMessage$StoryIsVisibleEvent$MiniStoryControlType;
import java.util.HashMap;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.GlobalProcessingState;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.persuggest.repository.e;

/* loaded from: classes6.dex */
public final class eg41 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eg41(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i;
        int i2 = this.a;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.b;
        switch (i2) {
            case 0:
                ((wf41) obj2).tb((pf41) obj);
                break;
            case 1:
                StoryNavigation storyNavigation = (StoryNavigation) obj;
                vk41 vk41Var = (vk41) obj2;
                PlusLogTag plusLogTag = PlusLogTag.UI;
                skd0.b(plusLogTag, "WebStories navigation event received = " + storyNavigation);
                int i3 = uk41.a[storyNavigation.ordinal()];
                if (i3 == 1) {
                    i = vk41Var.g + 1;
                } else if (i3 != 2) {
                    w511.b();
                    break;
                } else {
                    i = vk41Var.g - 1;
                }
                if (i < 0 || i >= vk41Var.f.size()) {
                    skd0.b(plusLogTag, "WebStories navigation result dismiss");
                    ((sk41) vk41Var.b).dismiss();
                } else {
                    skd0.b(plusLogTag, "WebStories navigation result new position = " + i);
                    vk41Var.i = InMessage$StoryIsVisibleEvent$MiniStoryControlType.TAP;
                    ((sk41) vk41Var.b).selectPage(i);
                }
                break;
            case 2:
                ((Boolean) obj).getClass();
                a aVar = (a) obj2;
                sls slsVar = aVar.z;
                FrameLayout frameLayout = aVar.M;
                boolean booleanValue = ((Boolean) slsVar.invoke()).booleanValue();
                View view = aVar.N;
                view.setVisibility(booleanValue ? 0 : 8);
                if (!booleanValue) {
                    frameLayout.removeView(view);
                    break;
                } else if (view.getParent() == null) {
                    frameLayout.addView(view);
                    break;
                }
                break;
            case 3:
                kj kjVar = (kj) obj;
                com.yandex.go.ypay.impl.auth.a aVar2 = (com.yandex.go.ypay.impl.auth.a) obj2;
                if (kjVar != null) {
                    r0 r0Var = aVar2.a;
                    pu11 pu11Var = new pu11(kjVar.a);
                    r0Var.getClass();
                    r0Var.m(null, pu11Var);
                    break;
                } else {
                    r0 r0Var2 = aVar2.a;
                    r0Var2.getClass();
                    r0Var2.m(null, ou11.a);
                    break;
                }
            case 4:
                break;
            case 5:
                iu51 iu51Var = (iu51) obj;
                com.yandex.go.yb.qr.ui.a aVar3 = (com.yandex.go.yb.qr.ui.a) obj2;
                GoImageView goImageView = aVar3.h;
                goImageView.setContentDescription(iu51Var.b);
                c.z(new hh31(21, aVar3, iu51Var), goImageView);
                break;
            case 6:
                ((ky51) obj2).t6((sv51) obj);
                break;
            case 7:
                ((Boolean) obj).getClass();
                ly51 ly51Var = (ly51) obj2;
                ly51Var.B.b();
                jj10 jj10Var = ly51Var.z;
                jj10Var.getClass();
                jj10Var.a.a("Menu.YandexWallet.Shown", new HashMap(), 1, new HashMap());
                break;
            case 8:
                ((e) obj2).i();
                break;
            case 9:
                zzs zzsVar = (zzs) obj;
                ze61 ze61Var = (ze61) obj2;
                gh00 gh00Var = (gh00) ze61Var.b;
                if (gh00Var.a.e(ze61Var.c)) {
                    gh00Var.L(zzsVar);
                    break;
                }
                break;
            case 10:
                GlobalProcessingState globalProcessingState = (GlobalProcessingState) obj;
                ebo eboVar = (ebo) obj2;
                if (((cbo) eboVar.a0()).a instanceof zt41) {
                    ((r0) eboVar.c0()).l(new cbo(zt41.b, pxa1.b(globalProcessingState)));
                    break;
                }
                break;
            case 11:
                p6f0 p6f0Var = (p6f0) obj2;
                ((r0) p6f0Var.c0()).l(new n6f0(pxa1.b((GlobalProcessingState) obj)));
                break;
            case 12:
                oib0 oib0Var = (oib0) obj2;
                lib0 a = lib0.a((lib0) oib0Var.a0(), null, null, false, false, false, pxa1.b((GlobalProcessingState) obj), 31);
                r0 r0Var3 = (r0) oib0Var.c0();
                r0Var3.getClass();
                r0Var3.m(null, a);
                break;
            case 13:
                yn31 yn31Var = (yn31) obj2;
                vn31 a2 = vn31.a((vn31) yn31Var.a0(), null, null, null, false, false, false, pxa1.b((GlobalProcessingState) obj), false, 383);
                r0 r0Var4 = (r0) yn31Var.c0();
                r0Var4.getClass();
                r0Var4.m(null, a2);
                break;
            case 14:
                ((vc5) obj2).d0((ys11) obj);
                break;
            default:
                ah81 ah81Var = (ah81) obj;
                ((v881) obj2).b.put(ah81Var.a, ah81Var.b);
                break;
        }
        return zy11Var;
    }
}
