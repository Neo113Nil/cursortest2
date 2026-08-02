package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.webkit.WebView;
import com.vk.api.sdk.auth.UtilityTokens;
import com.vk.auth.DefaultAuthActivity;
import com.vk.auth.main.AuthActivity;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.auth.validation.VkPassportRouterInfo;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.id.captcha.web.VKCaptchaWebViewActivity;
import com.vk.id.captcha.web.VKCaptchaWebViewActivity.g;
import com.vk.id.captcha.web.VKCaptchaWebViewActivity.h;
import com.vk.id.captcha.web.VKCaptchaWebViewActivity.i;
import com.vk.id.captcha.web.VKCaptchaWebViewActivity.j;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.chromium.net.impl.JavaUploadDataSinkBase;
import ru.ok.android.webrtc.RTCStatsObserver;
import ru.ok.android.webrtc.stat.listener.StatListenerManager;
import ru.ok.gleffects.EffectHolder;
import ru.ok.gleffects.dto.UserInfo;
import ru.ok.media.utils.PeriodicTasksManager;
import xsna.l7v;
import xsna.s8y0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class cc3 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cc3(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        Activity h;
        f3r f3rVar = null;
        switch (this.b) {
            case 0:
                String str = (String) this.c;
                UtilityTokens utilityTokens = (UtilityTokens) this.d;
                c63 c63Var = c63.a;
                Activity b = c63.b();
                if (b != null) {
                    DefaultAuthActivity defaultAuthActivity = DefaultAuthActivity.U;
                    int i = AuthActivity.W;
                    Context context2 = e43.a;
                    Intent a = AuthActivity.a.a(context2 != null ? context2 : null);
                    VkAuthMetaInfo vkAuthMetaInfo = VkAuthMetaInfo.h;
                    a.putExtra("passportData", new VkPassportRouterInfo(str, null, VkAuthMetaInfo.a.a(), utilityTokens, null, 16, null));
                    DefaultAuthActivity.b.a(a);
                    b.startActivityForResult(a, 18539);
                    return;
                }
                return;
            case 1:
                xk9 xk9Var = (xk9) this.c;
                List<UserInfo> list = (List) this.d;
                com.vk.media.ok.b bVar = xk9Var.B;
                if (bVar != null) {
                    EffectHolder effectHolder = bVar.H;
                    r3 = (effectHolder.getEffectRegistry().inputFriendsAvatarsRequired(bVar.p()) || bVar.M0.friendsAvatarRequired) ? 1 : 0;
                    if (r3 != 0) {
                        List<UserInfo> list2 = list;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            Iterator<T> it = list2.iterator();
                            while (it.hasNext()) {
                                File file = ((UserInfo) it.next()).userAvatarFile;
                                if (file == null || !file.exists()) {
                                    return;
                                }
                            }
                        }
                    }
                    if (effectHolder.getEffectRegistry().inputFriendsNamesRequired(bVar.p()) || bVar.M0.friendsGeneralInfoRequired || r3 != 0) {
                        effectHolder.setFriendsData(list);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                JavaUploadDataSinkBase.lambda$executeOnExecutor$4((String) this.c, (Runnable) this.d);
                return;
            case 3:
                ((sg40) this.d).f.a((String) this.c);
                return;
            case 4:
                ((PeriodicTasksManager) this.c).lambda$removeTask$5((Runnable) this.d);
                return;
            case 5:
                StickerStockItem stickerStockItem = (StickerStockItem) this.c;
                r6e0 r6e0Var = (r6e0) this.d;
                List<StickerItem> list3 = stickerStockItem.g;
                ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
                Iterator<T> it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Integer.valueOf(((StickerItem) it2.next()).b));
                }
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"PromotedStickersRepositoryImpl removePurchasedStickers " + arrayList});
                }
                r6e0.b().b(arrayList);
                synchronized (r6e0Var.a) {
                    r6e0Var.a.removeAll(arrayList);
                    s3q0 s3q0Var = s3q0.a;
                }
                return;
            case 6:
                m3r m3rVar = (m3r) this.d;
                String str2 = (String) this.c;
                f3r[] reactionViews = m3rVar.getScrollView().getReactionViews();
                int length = reactionViews.length;
                while (true) {
                    if (r3 < length) {
                        f3r f3rVar2 = reactionViews[r3];
                        if (f3rVar2 instanceof dxq) {
                            f3rVar = f3rVar2;
                        } else {
                            r3++;
                        }
                    }
                }
                if (f3rVar == null || (context = m3rVar.getContext()) == null || (h = e3m.h(context)) == null) {
                    return;
                }
                l7v b2 = pla.e().b();
                Rect C = bwt0.C(f3rVar);
                b2.getClass();
                l7v.b bVar2 = new l7v.b(str2, b2, C);
                bVar2.m = 48;
                bVar2.j(h);
                return;
            case 7:
                StatListenerManager.a((StatListenerManager) this.c, (RTCStatsObserver) this.d);
                return;
            case 8:
                VKCaptchaWebViewActivity vKCaptchaWebViewActivity = (VKCaptchaWebViewActivity) this.d;
                bpn0 bpn0Var = vKCaptchaWebViewActivity.i;
                String str3 = (String) this.c;
                WebView webView = vKCaptchaWebViewActivity.b;
                WebView webView2 = webView == null ? null : webView;
                webView2.getSettings().setJavaScriptEnabled(true);
                webView2.addJavascriptInterface(new osy0(vKCaptchaWebViewActivity.e, vKCaptchaWebViewActivity.new g(), new VKCaptchaWebViewActivity.k(1, vKCaptchaWebViewActivity, VKCaptchaWebViewActivity.class, "sendVKCaptchaListenSensorsChangedEvent", "sendVKCaptchaListenSensorsChangedEvent(Ljava/util/List;)V", 0), (yty0) s8y0.d.a().b.getValue(), (String) bpn0Var.getValue()), "AndroidBridge");
                webView2.setBackgroundColor(0);
                WebView webView3 = vKCaptchaWebViewActivity.b;
                webView2.setWebViewClient(new hxy0(webView3 == null ? null : webView3, (sey0) vKCaptchaWebViewActivity.h.getValue(), vKCaptchaWebViewActivity.g, vKCaptchaWebViewActivity.new h(), vKCaptchaWebViewActivity.new i(), vKCaptchaWebViewActivity.new j(), ((Boolean) vKCaptchaWebViewActivity.j.getValue()).booleanValue(), str3, (String) bpn0Var.getValue()));
                WebView webView4 = vKCaptchaWebViewActivity.b;
                if (webView4 == null) {
                    webView4 = null;
                }
                webView4.getSettings().setCacheMode(2);
                fiy0 fiy0Var = (fiy0) vKCaptchaWebViewActivity.d.getValue();
                fiy0Var.getClass();
                String str4 = "light";
                Uri.Builder buildUpon = Uri.parse(str3).buildUpon();
                int i2 = fiy0Var.a.uiMode & 48;
                if (i2 != 16 && i2 == 32) {
                    str4 = "dark";
                }
                String uri = buildUpon.appendQueryParameter("scheme", str4).build().toString();
                WebView webView5 = vKCaptchaWebViewActivity.b;
                (webView5 != null ? webView5 : null).loadUrl(uri);
                return;
            default:
                yads.ts.b((yads.ts) this.c, (yads.g9) this.d);
                return;
        }
    }

    public /* synthetic */ cc3(int i, String str, Object obj) {
        this.b = i;
        this.d = obj;
        this.c = str;
    }
}
