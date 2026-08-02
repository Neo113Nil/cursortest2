package xsna;

import android.view.View;
import android.widget.PopupWindow;
import com.airbnb.lottie.LottieAnimationView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.status.StatusImagePopup;
import com.vk.stat.scheme.SchemeStat$TypeEasterEggsItem;
import com.vkontakte.android.VKActivity;
import java.util.List;
import kotlin.jvm.internal.Ref$FloatRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class yuo implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ yuo(PopupWindow popupWindow, yu1 yu1Var, gvo gvoVar, LottieAnimationView lottieAnimationView, PopupWindow popupWindow2, VKActivity vKActivity, muo muoVar, ouo ouoVar) {
        this.c = popupWindow;
        this.e = yu1Var;
        this.f = gvoVar;
        this.g = lottieAnimationView;
        this.d = popupWindow2;
        this.h = vKActivity;
        this.i = muoVar;
        this.j = ouoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                final PopupWindow popupWindow = (PopupWindow) this.c;
                final yu1 yu1Var = (yu1) this.e;
                final gvo gvoVar = (gvo) this.f;
                final LottieAnimationView lottieAnimationView = (LottieAnimationView) this.g;
                final PopupWindow popupWindow2 = (PopupWindow) this.d;
                final VKActivity vKActivity = (VKActivity) this.h;
                final muo muoVar = (muo) this.i;
                final ouo ouoVar = (ouo) this.j;
                final StatusImagePopup statusImagePopup = (StatusImagePopup) obj;
                popupWindow.getContentView().setOnClickListener(new View.OnClickListener() { // from class: xsna.bvo
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PopupWindow popupWindow3 = popupWindow2;
                        if (popupWindow3 != null) {
                            yu1Var.invoke(popupWindow3);
                        }
                        LottieAnimationView lottieAnimationView2 = lottieAnimationView;
                        if (lottieAnimationView2 != null) {
                            lottieAnimationView2.m0();
                        }
                        if (lottieAnimationView2 != null) {
                            lottieAnimationView2.U(new dvo(popupWindow3, 0));
                        }
                        gvo gvoVar2 = gvo.this;
                        xuo xuoVar = gvoVar2.a;
                        popupWindow.dismiss();
                        bpn0 bpn0Var = bbq.a;
                        if (bpn0Var == null) {
                            bpn0Var = null;
                        }
                        mzk0 mzk0Var = (mzk0) bpn0Var.getValue();
                        muo muoVar2 = muoVar;
                        ouo ouoVar2 = ouoVar;
                        xah xahVar = new xah(gvoVar2, muoVar2, ouoVar2, 2);
                        StatusImagePopup statusImagePopup2 = statusImagePopup;
                        VKActivity vKActivity2 = vKActivity;
                        mzk0Var.a(vKActivity2, statusImagePopup2, xahVar, new defpackage.s(gvoVar2, statusImagePopup2, vKActivity2));
                        xuoVar.getClass();
                        xuo.a(SchemeStat$TypeEasterEggsItem.EventType.POPUP_SHOW, muoVar2, ouoVar2);
                        xuoVar.b(muoVar2, ouoVar2);
                    }
                });
                yu1Var.invoke(popupWindow);
                break;
            default:
                wh50 wh50Var = (wh50) this.c;
                wh50 wh50Var2 = (wh50) this.d;
                wh50 wh50Var3 = (wh50) this.e;
                List list = (List) this.f;
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) this.g;
                Ref$FloatRef ref$FloatRef2 = (Ref$FloatRef) this.h;
                wh50 wh50Var4 = (wh50) this.i;
                bwf bwfVar = (bwf) this.j;
                wh50Var.setValue(Float.valueOf(((Number) wh50Var2.getValue()).floatValue() + ((Number) wh50Var.getValue()).floatValue() + ((Float) obj).floatValue()));
                wh50Var2.setValue(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                nmx.o(wh50Var3, wh50Var, list, ref$FloatRef.element, ref$FloatRef2.element);
                ((izs) wh50Var4.getValue()).invoke(Float.valueOf(nmx.m(ref$FloatRef.element, ref$FloatRef2.element, swe0.f(((Number) wh50Var3.getValue()).floatValue(), ref$FloatRef.element, ref$FloatRef2.element), ((Number) bwfVar.getStart()).floatValue(), ((Number) bwfVar.c()).floatValue())));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ yuo(wh50 wh50Var, wh50 wh50Var2, wh50 wh50Var3, List list, Ref$FloatRef ref$FloatRef, Ref$FloatRef ref$FloatRef2, wh50 wh50Var4, bwf bwfVar) {
        this.c = wh50Var;
        this.d = wh50Var2;
        this.e = wh50Var3;
        this.f = list;
        this.g = ref$FloatRef;
        this.h = ref$FloatRef2;
        this.i = wh50Var4;
        this.j = bwfVar;
    }
}
