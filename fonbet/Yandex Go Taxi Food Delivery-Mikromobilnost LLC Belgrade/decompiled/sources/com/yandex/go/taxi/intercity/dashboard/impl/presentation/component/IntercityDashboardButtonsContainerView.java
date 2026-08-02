package com.yandex.go.taxi.intercity.dashboard.impl.presentation.component;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.yandex.div.state.db.StateEntry;
import com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.f;
import com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.i;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.modal.g;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.bdc;
import defpackage.ckw;
import defpackage.cma1;
import defpackage.j8h0;
import defpackage.jl40;
import defpackage.kcw;
import defpackage.kyh0;
import defpackage.ny61;
import defpackage.pj;
import defpackage.r7v;
import defpackage.tkh0;
import defpackage.uaw;
import defpackage.ujw;
import defpackage.v9w;
import defpackage.vaw;
import defpackage.w511;
import defpackage.waw;
import defpackage.xaw;
import defpackage.xng0;
import defpackage.yaw;
import defpackage.zaw;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/component/IntercityDashboardButtonsContainerView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/modal/g;", "presenter", "<init>", "(Landroid/content/Context;Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/modal/g;)V", "Lxaw;", "buttons", "Lckw;", "selectedTariffId", "Lwaw;", "resolveButtonsData-sdzKFpM", "(Lxaw;Ljava/lang/String;)Lwaw;", "resolveButtonsData", "Lru/yandex/taxi/design/ButtonComponent;", "buttonComponent", "Lvaw;", "content", "Lzy11;", "renderButton", "(Lru/yandex/taxi/design/ButtonComponent;Lvaw;)V", "renderButtonLoading", "(Lru/yandex/taxi/design/ButtonComponent;)V", "render-sdzKFpM", "(Lxaw;Ljava/lang/String;)V", "render", "renderLoading", "()V", "Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/modal/g;", "Lyaw;", "binding", "Lyaw;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IntercityDashboardButtonsContainerView extends LinearLayout {
    private final yaw binding;
    private final g presenter;

    public IntercityDashboardButtonsContainerView(Context context, g gVar) {
        super(context);
        this.presenter = gVar;
        LayoutInflater.from(context).inflate(tkh0.intercity_dashboard_buttons_container, this);
        int i = j8h0.intercity_dashboard_button_lead;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, this);
        if (buttonComponent != null) {
            i = j8h0.intercity_dashboard_button_trail;
            ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, this);
            if (buttonComponent2 != null) {
                this.binding = new yaw(this, buttonComponent, buttonComponent2);
                setOrientation(1);
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    private final void renderButton(ButtonComponent buttonComponent, vaw content) {
        buttonComponent.setVisibility(!jl40.l(content, vaw.g) ? 0 : 8);
        buttonComponent.setText(content.a);
        int i = zaw.a[content.c.ordinal()];
        if (i == 1 || i == 2) {
            buttonComponent.setButtonBackground(new bdc(xng0.controlMain));
            buttonComponent.setButtonTitleColor(new bdc(xng0.textOnControl));
        } else if (i != 3) {
            w511.b();
            return;
        } else {
            buttonComponent.setButtonBackground(new bdc(xng0.controlMinor));
            buttonComponent.setButtonTitleColor(new bdc(xng0.textOnControlMinor));
        }
        buttonComponent.setDebounceClickListener(new r7v(5, this, content));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderButton$lambda$0(IntercityDashboardButtonsContainerView intercityDashboardButtonsContainerView, vaw vawVar) {
        String str;
        Calendar calendar;
        g gVar = intercityDashboardButtonsContainerView.presenter;
        uaw uawVar = vawVar.e;
        f fVar = gVar.z;
        ujw i = fVar.i();
        if (i != null) {
            v9w v9wVar = gVar.B;
            String str2 = i.a;
            String str3 = i.b;
            boolean a = fVar.g.a();
            kcw g = fVar.g();
            if (g == null || (calendar = g.a) == null) {
                str = null;
            } else {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z", Locale.US);
                simpleDateFormat.setTimeZone(calendar.getTimeZone());
                str = simpleDateFormat.format(calendar.getTime());
            }
            String str4 = uawVar.c;
            String str5 = uawVar.d;
            Integer num = ((i) gVar.E).a.a().j;
            pj pjVar = v9wVar.a;
            Boolean bool = Boolean.TRUE;
            if (!a) {
                bool = null;
            }
            if (a) {
                str = null;
            }
            String str6 = str5.length() > 0 ? str5 : null;
            pjVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("action", str4);
            if (str3 != null) {
                hashMap.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str3);
            }
            if (str2 != null) {
                hashMap.put("vertical", str2);
            }
            if (bool != null) {
                hashMap.put("is_ondemand", bool);
            }
            if (str != null) {
                hashMap.put("due", str);
            }
            if (str6 != null) {
                hashMap.put(StateEntry.COLUMN_PATH, str6);
            }
            if (num != null) {
                hashMap.put("seats", num);
            }
            pjVar.a.a("IntercityMain.MainButton.Tapped", hashMap, 1, new HashMap());
        }
        intercityDashboardButtonsContainerView.presenter.Og(vawVar.d);
    }

    private final void renderButtonLoading(ButtonComponent buttonComponent) {
        buttonComponent.setText(getContext().getString(kyh0.due_chart_loading_button_text));
    }

    /* renamed from: resolveButtonsData-sdzKFpM, reason: not valid java name */
    private final waw m199resolveButtonsDatasdzKFpM(xaw buttons, String selectedTariffId) {
        if (selectedTariffId == null || !buttons.b.b(new ckw(selectedTariffId))) {
            return buttons.a;
        }
        Object d = buttons.b.d(new ckw(selectedTariffId));
        if (d != null) {
            return (waw) d;
        }
        ny61.g("Required value was null.");
        return null;
    }

    /* renamed from: render-sdzKFpM, reason: not valid java name */
    public final void m200rendersdzKFpM(xaw buttons, String selectedTariffId) {
        waw m199resolveButtonsDatasdzKFpM = m199resolveButtonsDatasdzKFpM(buttons, selectedTariffId);
        renderButton(this.binding.b, m199resolveButtonsDatasdzKFpM.a);
        renderButton(this.binding.c, m199resolveButtonsDatasdzKFpM.b);
    }

    public final void renderLoading() {
        renderButtonLoading(this.binding.b);
        renderButtonLoading(this.binding.c);
    }
}
