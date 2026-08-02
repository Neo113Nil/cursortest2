package xsna;

import androidx.core.app.NotificationCompat;
import com.coremedia.iso.boxes.AuthorBox;
import com.unity3d.services.UnityAdsConstants;
import com.vk.push.common.Logger;
import com.vk.push.pushsdk.notifier.model.NotifierRequest;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeBulkAdLoadListener;
import com.yandex.mobile.ads.nativeads.NativeBulkAdLoader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* compiled from: GradientColorInflaterCompat.java */
/* loaded from: classes11.dex */
public final class bbu implements NativeBulkAdLoadListener {
    public final Object a;
    public final Object b;

    public /* synthetic */ bbu(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public static String a(String str, qk70 qk70Var, NotifierRequest notifierRequest) {
        JSONObject put = new JSONObject().put("push_token", str);
        JSONObject jSONObject = new JSONObject();
        qk70Var.getClass();
        return new JSONObject().put("id", qk70Var.a).put("method", notifierRequest.h()).put("params", jSONObject.put("system", 7).put(NotificationCompat.CATEGORY_EVENT, 1).put(AuthorBox.TYPE, put)).toString();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeBulkAdLoadListener
    public void onAdsFailedToLoad(AdRequestError adRequestError) {
        ((e5y0) this.a).b = true;
        ((e5y0) this.a).e.remove((NativeBulkAdLoader) this.b);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeBulkAdLoadListener
    public void onAdsLoaded(List list) {
        e5y0 e5y0Var = (e5y0) this.a;
        NativeBulkAdLoader nativeBulkAdLoader = (NativeBulkAdLoader) this.b;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e5y0Var.f.push(new kv50(new d5y0((NativeAd) it.next()), nativeBulkAdLoader));
        }
        e5y0Var.b = false;
        e5y0Var.c.set(0);
        e5y0Var.e.remove(nativeBulkAdLoader);
    }

    public bbu(Logger logger, l4w0 l4w0Var) {
        this.a = l4w0Var;
        this.b = logger.createLogger("VkpnsNotifierApi");
    }

    public bbu(zlj0 zlj0Var, dmj0 dmj0Var, edi ediVar, p3a0 p3a0Var, o19 o19Var) {
        this.a = zlj0Var;
        this.b = p3a0Var;
    }

    public bbu(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.a = new int[size];
        this.b = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.a)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.b)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public bbu(int i, int i2) {
        this.a = new int[]{i, i2};
        this.b = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f};
    }

    public bbu(int i, int i2, int i3) {
        this.a = new int[]{i, i2, i3};
        this.b = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.5f, 1.0f};
    }
}
