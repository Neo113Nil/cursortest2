package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.util.Size;
import android.view.View;
import android.view.Window;
import com.vk.core.serialize.Serializer;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.api.dto.widgets.actions.WebActionCall;
import com.vk.superapp.api.dto.widgets.actions.WebActionCallback;
import com.vk.superapp.api.dto.widgets.actions.WebActionOpenUrl;
import com.vk.superapp.api.dto.widgets.actions.WebActionOpenVkApp;
import com.vk.superapp.api.dto.widgets.actions.WebActionRequestPermission;
import com.vk.superapp.api.dto.widgets.actions.WebActionSendMessage;
import com.vk.superapp.browser.internal.utils.analytics.MiniAppEntryPoint;
import com.vk.superapp.ui.uniwidgets.WidgetObjects;
import com.vk.superapp.ui.uniwidgets.dto.UniversalWidget;
import com.vkontakte.android.R;
import org.json.JSONObject;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import xsna.g4q0;
import xsna.ikv0;
import xsna.u7n0;

/* compiled from: VkWidgetConstructor.kt */
/* loaded from: classes11.dex */
public final class w1w0 implements nmx0 {
    public vh20 a;

    /* compiled from: VkWidgetConstructor.kt */
    /* loaded from: classes7.dex */
    public static final class a extends fnl {
        public final /* synthetic */ Peer b;
        public final /* synthetic */ WidgetObjects c;
        public final /* synthetic */ UniversalWidget d;
        public final /* synthetic */ Context e;

        public a(Peer peer, WidgetObjects widgetObjects, pk30 pk30Var, UniversalWidget universalWidget, Context context) {
            this.b = peer;
            this.c = widgetObjects;
            this.d = universalWidget;
            this.e = context;
        }

        @Override // xsna.fnl, xsna.u7n0
        public final void u0(Context context, u7n0.a aVar, WebAction webAction) {
            View decorView;
            if (webAction == null) {
                return;
            }
            Handler handler = x93.a;
            c63 c63Var = c63.a;
            Activity b = c63.b();
            Peer peer = this.b;
            String obj = ((peer != null ? Long.valueOf(peer.b) : null) == null ? MiniAppEntryPoint.UNKNOWN : MiniAppEntryPoint.IM_CHAT).toString();
            if (webAction instanceof WebActionOpenUrl) {
                if (b == null) {
                    return;
                }
                g2v.c().k().w(b, ((WebActionOpenUrl) webAction).c, obj);
                return;
            }
            if (webAction instanceof WebActionOpenVkApp) {
                if (b == null) {
                    return;
                }
                WebActionOpenVkApp webActionOpenVkApp = (WebActionOpenVkApp) webAction;
                WebApiApplication webApiApplication = this.c.b.get(Long.valueOf(webActionOpenVkApp.d));
                if (webApiApplication != null) {
                    g2v.c().k().x(b, webApiApplication, webActionOpenVkApp.e, "msg_attach", obj);
                    return;
                } else {
                    g2v.c().k().h(b, null, "msg_attach", null, obj, (int) webActionOpenVkApp.d);
                    return;
                }
            }
            if (webAction instanceof WebActionRequestPermission) {
                return;
            }
            if (!(webAction instanceof WebActionSendMessage)) {
                if (!(webAction instanceof WebActionCall)) {
                    if (!(webAction instanceof WebActionCallback)) {
                        cvk.u(R.string.vk_unsupported_action, true);
                        return;
                    } else {
                        vdx0 vdx0Var = e370.e;
                        itg0.n((vdx0Var != null ? vdx0Var : null).B().a(this.d.d().d, this.d.d().c, (WebActionCallback) webAction).h(new xvq0(new z8l0(context, 16), 9)));
                        return;
                    }
                }
                kyv j = g2v.c().j();
                long j2 = ((WebActionCall) webAction).c;
                gzs<s3q0> gzsVar = fkq0.a;
                UserId userId = new UserId(j2);
                Serializer.c<VoipCallSource> cVar = VoipCallSource.CREATOR;
                j.d(context, VoipCallSource.a.a(), userId, false);
                return;
            }
            WebActionSendMessage webActionSendMessage = (WebActionSendMessage) webAction;
            String str = webActionSendMessage.d.b;
            if (str == null || drm0.N(str)) {
                return;
            }
            String str2 = webActionSendMessage.d.b;
            Serializer.c<Peer> cVar2 = Peer.CREATOR;
            Peer b2 = Peer.a.b(webActionSendMessage.c);
            b2.getClass();
            if (b2.Ab(Peer.Type.UNKNOWN)) {
                return;
            }
            String str3 = webActionSendMessage.d.c;
            if (str3 == null) {
                str3 = "";
            }
            pz30 pz30Var = new pz30(b2, str2, null, null, str3, null, null, null, null, null, null, null, null, 16364);
            a1w a1wVar = q1w.a;
            if (a1wVar == null) {
                a1wVar = null;
            }
            ver0.c(this.e, io.reactivex.rxjava3.kotlin.c.h(a1wVar.E("Widget send", pz30Var), new dd60(this.e, 2), null, 2));
            if (!webActionSendMessage.d.d || b == null) {
                return;
            }
            Context context2 = this.e;
            Rect rect = new Rect();
            Window window = b.getWindow();
            if (window != null && (decorView = window.getDecorView()) != null) {
                decorView.getWindowVisibleDisplayFrame(rect);
            }
            int a = iah0.a(8) + e3m.d(R.attr.actionBarSize, context2) + rect.top;
            ikv0.a aVar2 = new ikv0.a(b);
            aVar2.t = new ikv0.c.C3058c(R.drawable.ic_done_in_blue_circle, (Integer) null, (Size) null, 14);
            aVar2.u = new ikv0.d(context2.getString(R.string.messages_sent), (String) null, (ikv0.d.a) null, 6);
            aVar2.o = Integer.valueOf(a);
            aVar2.b = true;
            aVar2.n();
        }
    }

    @Override // xsna.nmx0
    public final View a(Context context, JSONObject jSONObject, int i, int i2, int i3, int i4, int i5, Peer peer, pk30 pk30Var) {
        vh20 vh20Var = this.a;
        if (vh20Var == null || vh20Var.E() != i5) {
            this.a = new vh20(i5, i3, i4);
        }
        WidgetObjects a2 = WidgetObjects.a.a(jSONObject);
        UniversalWidget a3 = UniversalWidget.a.a(jSONObject.getJSONObject(DatabaseHelper.ITEM_COLUMN_NAME), a2);
        return g4q0.a(context, a3, new a(peer, a2, pk30Var, a3, context), new g4q0.a(i, this.a)).a();
    }
}
