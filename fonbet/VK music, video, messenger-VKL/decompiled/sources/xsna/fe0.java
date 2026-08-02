package xsna;

import android.content.Context;
import android.view.View;
import com.unity3d.ads.BuildConfig;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.dzenarticle.impl.ui.view.ad.AdActions;
import com.vk.dzenarticle.impl.ui.view.ad.BaseTopAdView;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: AdChoicesController.kt */
/* loaded from: classes18.dex */
public final class fe0 implements i620 {
    public fvy0 b;
    public final ArrayList<b520> c = new ArrayList<>();
    public BaseTopAdView.a d;

    public final void a() {
        b520 b520Var;
        fvy0 fvy0Var;
        Iterator<b520> it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                b520Var = null;
                break;
            } else {
                b520Var = it.next();
                if (epx.f(b520Var.b, "cancel")) {
                    break;
                }
            }
        }
        b520 b520Var2 = b520Var;
        if (b520Var2 == null || (fvy0Var = this.b) == null) {
            return;
        }
        fvy0Var.a(b520Var2);
    }

    @Override // xsna.i620
    public final a520 b() {
        return new a();
    }

    public final void c(String str) {
        b520 b520Var;
        fvy0 fvy0Var;
        Iterator<b520> it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                b520Var = null;
                break;
            } else {
                b520Var = it.next();
                if (epx.f(b520Var.c, str)) {
                    break;
                }
            }
        }
        b520 b520Var2 = b520Var;
        if (b520Var2 == null || (fvy0Var = this.b) == null) {
            return;
        }
        fvy0Var.a(b520Var2);
    }

    /* compiled from: AdChoicesController.kt */
    public static final class a implements a520 {
        public a() {
        }

        @Override // xsna.a520
        public final void a(fvy0 fvy0Var) {
            fe0.this.b = fvy0Var;
        }

        @Override // xsna.a520
        public final void b(b520 b520Var) {
            fe0.this.c.add(b520Var);
        }

        /* JADX WARN: Code restructure failed: missing block: B:78:0x01c6, code lost:
        
            r0.x0(new xsna.ch0(r9, r6, null, ((java.lang.Number) r11.getValue()).intValue()));
         */
        /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.a520
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void c(Context context) {
            BaseTopAdView baseTopAdView;
            fe0 adChoicesController;
            boolean z;
            fe0 fe0Var = fe0.this;
            ArrayList<b520> arrayList = fe0Var.c;
            ArrayList arrayList2 = new ArrayList();
            Iterator<b520> it = arrayList.iterator();
            while (it.hasNext()) {
                b520 next = it.next();
                b520 b520Var = next;
                if (epx.f(b520Var.b, BuildConfig.FLAVOR) || epx.f(b520Var.b, "copy")) {
                    arrayList2.add(next);
                }
            }
            BaseTopAdView.a aVar = fe0Var.d;
            if (aVar == null || (adChoicesController = (baseTopAdView = BaseTopAdView.this).getAdChoicesController()) == null) {
                return;
            }
            String str = aVar.a;
            ArrayList<b520> arrayList3 = adChoicesController.c;
            ip6 ip6Var = new ip6(adChoicesController, baseTopAdView, aVar, 0);
            View view = aVar.b;
            kg0 kg0Var = new kg0();
            kg0Var.e = ip6Var;
            if (str != null) {
                AdActions.DISCLAIMER.getClass();
                kg0Var.x0(new fh0(str));
            }
            if (arrayList3 != null) {
                Iterator<b520> it2 = arrayList3.iterator();
                z = false;
                while (it2.hasNext()) {
                    b520 next2 = it2.next();
                    String str2 = next2.b;
                    String str3 = next2.c;
                    if (epx.f(str2, "complain")) {
                        z = true;
                    } else {
                        String str4 = next2.a;
                        AdActions adActions = AdActions.DEBUG;
                        if (epx.f(str3, adActions.h())) {
                            kg0.K0(kg0Var, adActions.h(), "Ads Debug", R.drawable.vk_icon_bug_outline_28);
                        } else {
                            AdActions adActions2 = AdActions.ADS_COPY_URL;
                            boolean f = epx.f(str3, adActions2.h());
                            ?? r11 = kg0Var.g;
                            if (f) {
                                String h = adActions2.h();
                                int intValue = ((Number) r11.getValue()).intValue();
                                Context context2 = e43.a;
                                if (context2 == null) {
                                    context2 = null;
                                }
                                CharSequence text = context2.getText(R.string.ads_copy_url);
                                Context context3 = e43.a;
                                if (context3 == null) {
                                    context3 = null;
                                }
                                kg0Var.x0(new ch0(h, text, m33.a(R.drawable.vk_icon_copy_outline_24, context3), intValue));
                            } else {
                                AdActions adActions3 = AdActions.SHOW_ADVERTISER_INFO;
                                if (epx.f(str3, adActions3.h()) || epx.f(str3, AdActions.ADV_INFO.h())) {
                                    String h2 = adActions3.h();
                                    int intValue2 = ((Number) r11.getValue()).intValue();
                                    Context context4 = e43.a;
                                    if (context4 == null) {
                                        context4 = null;
                                    }
                                    CharSequence text2 = context4.getText(R.string.show_advertiser_info);
                                    Context context5 = e43.a;
                                    if (context5 == null) {
                                        context5 = null;
                                    }
                                    kg0Var.x0(new ch0(h2, text2, m33.a(R.drawable.vk_icon_link_circle_24, context5), intValue2));
                                } else {
                                    AdActions adActions4 = AdActions.ADS_RECOMMENDATIONS_INFO;
                                    if (epx.f(str3, adActions4.h())) {
                                        String h3 = adActions4.h();
                                        int intValue3 = ((Number) r11.getValue()).intValue();
                                        Context context6 = e43.a;
                                        if (context6 == null) {
                                            context6 = null;
                                        }
                                        CharSequence text3 = context6.getText(R.string.ads_recommendations_info);
                                        Context context7 = e43.a;
                                        if (context7 == null) {
                                            context7 = null;
                                        }
                                        kg0Var.x0(new ch0(h3, text3, m33.a(R.drawable.vk_icon_advertising_outline_24, context7), intValue3));
                                    } else {
                                        AdActions adActions5 = AdActions.AD_MARKER_TEMPLATE;
                                        if (epx.f(str3, adActions5.h())) {
                                            kg0.K0(kg0Var, adActions5.h(), str4, R.drawable.vk_icon_info_circle_outline_24);
                                        } else {
                                            AdActions adActions6 = AdActions.ERID;
                                            if (epx.f(str3, adActions6.h())) {
                                                kg0.K0(kg0Var, adActions6.h(), str4, R.drawable.vk_icon_info_circle_outline_24);
                                            } else {
                                                AdActions adActions7 = AdActions.NOT_INTERESTED;
                                                if (epx.f(str3, adActions7.h())) {
                                                    kg0.K0(kg0Var, adActions7.h(), str4, R.drawable.vk_icon_block_outline_24);
                                                } else if (epx.f(str3, AdActions.PURCHASED.h()) || epx.f(str3, AdActions.TOO_MANY.h()) || epx.f(str3, AdActions.OFFENSIVE_HIDE.h()) || epx.f(str3, AdActions.SEXUAL_HIDE.h()) || epx.f(str3, AdActions.ILLEGAL_HIDE.h()) || epx.f(str3, AdActions.SCAM_HIDE.h())) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                z = false;
            }
            if (z) {
                String h4 = AdActions.REPORT.h();
                int c = dhr0.t.c(R.attr.vk_ui_background_negative);
                Context context8 = e43.a;
                if (context8 == null) {
                    context8 = null;
                }
                CharSequence text4 = context8.getText(R.string.report_content);
                Context context9 = e43.a;
                kg0Var.x0(new ch0(h4, text4, m33.a(R.drawable.vk_icon_report_outline_24, context9 != null ? context9 : null), c));
            }
            int l = krv0.l(R.attr.vk_ui_icon_accent);
            view.getContext();
            e.b bVar = new e.b(view, null, null, l, 6);
            bVar.w = R.layout.ds_internal_context_menu_item;
            bVar.e = context;
            bVar.l = kg0Var;
            bVar.r = cn70.b(16);
            bVar.m = cn70.b(8);
            VkContextMenu a = bVar.a();
            kg0Var.f = new WeakReference<>(a);
            ((com.vk.core.view.components.context.menu.e) a).q = new com.vk.movika.sdk.base.logic.processor.actions.h(adChoicesController, 6);
            a.j(false);
        }

        @Override // xsna.a520
        public final void dismiss() {
        }

        @Override // xsna.a520
        public final void d(String str) {
        }
    }
}
