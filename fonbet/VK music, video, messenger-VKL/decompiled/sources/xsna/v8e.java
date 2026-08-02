package xsna;

import android.app.Activity;
import android.content.Context;
import android.widget.PopupWindow;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.preference.Preference;
import com.vk.core.view.components.tooltip.VkTooltip;
import com.vk.fcmerrorhandler.taostutils.EventType;
import com.vkontakte.android.R;
import one.video.streaming.oktp.OktpChannel;
import one.video.streaming.oktp.TransportWriter;
import ru.ok.proto.okmp.OkmpClient;
import xsna.ikv0;
import xsna.rtq;
import xsna.w8e;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class v8e implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ v8e(Activity activity, ttq ttqVar, Throwable th, EventType eventType) {
        this.b = 1;
        this.c = activity;
        this.d = th;
        this.e = eventType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.b) {
            case 0:
                w8e w8eVar = (w8e) this.c;
                q8e q8eVar = (q8e) this.d;
                w8e.a aVar = (w8e.a) this.e;
                if (w8eVar.b) {
                    q8eVar.smoothScrollBy(0, 1);
                } else {
                    q8eVar.smoothScrollBy(0, -aVar.b, aVar.d, UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS);
                    w8eVar.a.uo(true);
                }
                w8eVar.c = false;
                break;
            case 1:
                Activity activity = (Activity) this.c;
                Throwable th = (Throwable) this.d;
                EventType eventType = (EventType) this.e;
                ikv0.a aVar2 = new ikv0.a(activity);
                ztq b = ttq.b(th);
                Context context = b.g;
                if (context == null || (str = context.getString(R.string.fcm_error_check_google_play_services)) == null) {
                    str = b.f;
                }
                aVar2.u = new ikv0.d(str, (String) null, (ikv0.d.a) (0 == true ? 1 : 0), 6);
                aVar2.n();
                int[] iArr = rtq.a.$EnumSwitchMapping$0;
                if (iArr[eventType.ordinal()] != 1) {
                    Preference.C("fcm_toast", iArr[eventType.ordinal()] == 1 ? "fcm_error_key_notification" : "fcm_error_key_cold");
                    break;
                }
                break;
            case 2:
                ((OkmpClient) this.c).lambda$networkReaderLoop$1((OktpChannel) this.d, (TransportWriter) this.e);
                break;
            case 3:
                PopupWindow popupWindow = (PopupWindow) this.c;
                VkTooltip vkTooltip = (VkTooltip) this.d;
                VkTooltip.a aVar3 = (VkTooltip.a) this.e;
                if (popupWindow.isShowing()) {
                    vkTooltip.a(new hvr0(popupWindow, 18));
                }
                VkTooltip.b bVar = aVar3.n;
                if (bVar != null) {
                    bVar.b(VkTooltip.DismissReason.AUTO_DISMISS);
                    break;
                }
                break;
            default:
                ((yads.un1) this.c).a((yads.o51) this.d, (yads.zn1) this.e);
                break;
        }
    }

    public /* synthetic */ v8e(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
