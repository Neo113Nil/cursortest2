package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.ui.semantics.f;
import androidx.core.app.s0;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.dsl.views.layouts.constraint.d;
import com.yandex.messaging.internal.authorized.chat.notifications.b;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.transfer.utils.TransferCommentView;
import defpackage.iqx;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.design.ListItemWithBadgeComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.progress.CircularProgressBar;

/* loaded from: classes15.dex */
public final /* synthetic */ class f0z0 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ f0z0(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 onReadyButtonClickListener$lambda$3;
        zy11 onCloseListener$lambda$4;
        zy11 onVibrate$lambda$5;
        int i = this.a;
        boolean z = false;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                return zy11Var;
            case 1:
                return new CircularProgressBar((Context) obj, null, 0, 6, null);
            case 2:
                LottieAnimationView lottieAnimationView = new LottieAnimationView((Context) obj);
                lottieAnimationView.setAnimation(ywh0.nfc_lottie);
                lottieAnimationView.setRepeatCount(-1);
                lottieAnimationView.playAnimation();
                return lottieAnimationView;
            case 3:
                ((m2k0) obj).j(1);
                return zy11Var;
            case 4:
                iqx.a aVar = (iqx.a) obj;
                return g8e.p(aVar.a, Extension.COLON_SPACE, aVar.b);
            case 5:
                so5 so5Var = r4z0.a;
                return zy11Var;
            case 6:
                return ((n940) obj).b;
            case 7:
                b bVar = (b) obj;
                i6b i6bVar = bVar.d;
                o1b0 o1b0Var = bVar.b;
                if (o1b0Var.f && jl40.l((String) bVar.e.j.invoke(), o1b0Var.c)) {
                    if (ydz.a.a()) {
                        ydz.a();
                    }
                    s0 s0Var = new s0(bVar.a);
                    w220 w220Var = i6bVar.c;
                    s0Var.a((int) i6bVar.a.a, new uj60(w220Var.c, 24, i6bVar.b.a(), z).a().concat("_deepsync"));
                }
                return zy11Var;
            case 8:
                d dVar = (d) obj;
                dVar.e(-2);
                dVar.d(-2);
                dVar.b.x(dVar.a, 8);
                return zy11Var;
            case 9:
                n70 n70Var = (n70) obj;
                n70Var.W(new ns3(n70Var, 20));
                return zy11Var;
            case 10:
                f.d((mnq0) obj);
                return zy11Var;
            case 11:
                viy0 viy0Var = new viy0((RobotoTextView) obj, 2);
                RobotoTextView robotoTextView = (RobotoTextView) ((View) viy0Var.R);
                robotoTextView.setTextSize(tje.s(mrg0.component_text_size_title, robotoTextView.getContext()));
                robotoTextView.setTextTypeface(5);
                int r = tje.r(mrg0.go_design_m_space, robotoTextView.getContext());
                robotoTextView.setPadding(r, 0, r, tje.u(12, robotoTextView.getContext()));
                return viy0Var;
            case 12:
                ejz0 ejz0Var = new ejz0((RobotoTextView) obj);
                RobotoTextView robotoTextView2 = (RobotoTextView) ((View) ejz0Var.R);
                robotoTextView2.setTextColorAttr(xng0.textMain);
                robotoTextView2.setTextSize(tje.s(mrg0.component_text_size_title, robotoTextView2.getContext()));
                robotoTextView2.setTextTypeface(5);
                robotoTextView2.setPadding(robotoTextView2.getPaddingLeft(), robotoTextView2.getPaddingTop(), robotoTextView2.getPaddingRight(), tje.u(6, robotoTextView2.getContext()));
                return ejz0Var;
            case 13:
                m2k0 m2k0Var = (m2k0) obj;
                m2k0Var.D(m2k0Var.K.getDensity() * 8.0f);
                return zy11Var;
            case 14:
                ListItemWithBadgeComponent listItemWithBadgeComponent = new ListItemWithBadgeComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                listItemWithBadgeComponent.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                listItemWithBadgeComponent.setSubtitleMaxLines(1);
                listItemWithBadgeComponent.setSubTitleEllipsizeMode(1);
                return listItemWithBadgeComponent;
            case 15:
                ListItemWithBadgeComponent listItemWithBadgeComponent2 = new ListItemWithBadgeComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                int u = tje.u(16, listItemWithBadgeComponent2.getContext());
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                marginLayoutParams.setMargins(u, 0, u, 0);
                listItemWithBadgeComponent2.setLayoutParams(marginLayoutParams);
                listItemWithBadgeComponent2.setSubtitleMaxLines(1);
                listItemWithBadgeComponent2.setSubTitleEllipsizeMode(1);
                listItemWithBadgeComponent2.setLeadFrameMinimumWidth(tje.u(56, listItemWithBadgeComponent2.getContext()));
                return listItemWithBadgeComponent2;
            case 16:
                ((acx) obj).b = false;
                return zy11Var;
            case 17:
                wj00 b = ((y3x) obj).b();
                return new ynz0(b.p("id"), (goz0) mbb1.d(b.l(TarifficatorScenarioActivity.RESULT_KEY), new f0z0(18)).a());
            case 18:
                wj00 b2 = ((y3x) obj).b();
                return new goz0(b2.h("pmd"), b2.h("psd"));
            case 19:
                return zy11Var;
            case 20:
                return zy11Var;
            case 21:
                vxz0 vxz0Var = (vxz0) obj;
                return new yxz0(vxz0Var.c, vxz0Var.a, vxz0Var.b, vxz0Var.d);
            case 22:
                return new pbv((String) obj, (ccv) null, rev.f, (dcv) null, (vfv) null, 58);
            case 23:
                return gtq0.a();
            case 24:
                throw null;
            case 25:
                onReadyButtonClickListener$lambda$3 = TransferCommentView.onReadyButtonClickListener$lambda$3((String) obj);
                return onReadyButtonClickListener$lambda$3;
            case 26:
                onCloseListener$lambda$4 = TransferCommentView.onCloseListener$lambda$4((String) obj);
                return onCloseListener$lambda$4;
            case 27:
                onVibrate$lambda$5 = TransferCommentView.onVibrate$lambda$5((pk31) obj);
                return onVibrate$lambda$5;
            case 28:
                return new pbv((String) obj, new ccv(sxg0.ybsdk_ic_generic_card), rev.l, new ccv(sxg0.ybsdk_ic_generic_card), new ufv(4.0f, 4.0f, 4.0f, 4.0f, true), 32);
            default:
                ccv ccvVar = new ccv(txg0.ybsdk_ic_yb_placeholder);
                rev revVar = rev.o;
                return new pbv((dcv) ccvVar, (dcv) new ccv(txg0.ybsdk_ic_yb_placeholder), (tev) revVar, (vfv) h2b1.G, (String) obj, false);
        }
    }

    public /* synthetic */ f0z0(int i, Object obj) {
        this.a = i;
    }
}
