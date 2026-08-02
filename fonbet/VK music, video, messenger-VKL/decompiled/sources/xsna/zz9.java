package xsna;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.Toast;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.material.appbar.AppBarLayout;
import com.ironsource.C4618w9;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.catalog2.feature.music.holders.artist.MusicPagePhoneHeaderNewVh;
import com.vkontakte.android.R;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.transport.log.LogThrottler;
import xsna.mfz0;
import xsna.oqx0;
import xsna.pzp0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class zz9 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zz9(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xtm xtmVar;
        Activity h;
        JSONObject jSONObject;
        String optString;
        switch (this.b) {
            case 0:
                Context context = (Context) this.c;
                pw pwVar = (pw) this.d;
                uz9 uz9Var = null;
                if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context.getApplicationContext()) == 0) {
                    try {
                        uz9Var = uz9.e(context);
                    } catch (Throwable unused) {
                    }
                }
                if (uz9Var != null) {
                    a0a.b = true;
                    Intent intent = new Intent();
                    intent.putExtra("CAST_INTENT_TO_CAST_ROUTE_ID_KEY", "ROUTE_ID_KEY");
                    intent.putExtra("CAST_INTENT_TO_CAST_DEVICE_NAME_KEY", "DEVICE_NAME_KEY");
                    intent.putExtra("CAST_INTENT_TO_CAST_NO_TOAST_KEY", true);
                    hui0 d = uz9Var.d();
                    if (d != null) {
                        o100 o100Var = hui0.c;
                        try {
                            Context context2 = d.b;
                            o100Var.c("Start session for %s", context2.getPackageName());
                            Bundle extras = intent.getExtras();
                            if (extras != null && extras.getString("CAST_INTENT_TO_CAST_ROUTE_ID_KEY") != null) {
                                String string = extras.getString("CAST_INTENT_TO_CAST_DEVICE_NAME_KEY");
                                if (!extras.getBoolean("CAST_INTENT_TO_CAST_NO_TOAST_KEY")) {
                                    Toast.makeText(context2, context2.getString(R.string.cast_connecting_to_device, string), 0).show();
                                }
                                d.a.c1(new Bundle(extras));
                                intent.removeExtra("CAST_INTENT_TO_CAST_ROUTE_ID_KEY");
                            }
                        } catch (RemoteException unused2) {
                            o100Var.b("Unable to call %s on %s.", "startSession", g001.class.getSimpleName());
                        }
                    }
                    pwVar.invoke();
                }
                break;
            case 1:
                vtm vtmVar = (vtm) this.c;
                int v = vtmVar.q.v();
                int x = vtmVar.q.x();
                int itemCount = vtmVar.q.getItemCount();
                if (v != -1 && x != -1) {
                    boolean z = itemCount > 0;
                    boolean z2 = itemCount - x <= 15;
                    if (z && z2 && (xtmVar = vtmVar.F) != null) {
                        xtmVar.j(this.d);
                        break;
                    }
                }
                break;
            case 2:
                LogThrottler.a(this.c, (LogThrottler) this.d);
                break;
            case 3:
                AppBarLayout appBarLayout = (AppBarLayout) this.c;
                MusicPagePhoneHeaderNewVh musicPagePhoneHeaderNewVh = (MusicPagePhoneHeaderNewVh) this.d;
                Context context3 = appBarLayout.getContext();
                if (context3 != null && (h = e3m.h(context3)) != null) {
                    Window window = h.getWindow();
                    oek0 oek0Var = new oek0(h.getWindow().getDecorView());
                    int i = Build.VERSION.SDK_INT;
                    (i >= 35 ? new oqx0.f(window, oek0Var) : i >= 30 ? new oqx0.d(window, oek0Var) : new oqx0.c(window, oek0Var)).f(!musicPagePhoneHeaderNewVh.f);
                    break;
                }
                break;
            case 4:
                ((View) this.c).getViewTreeObserver().removeOnDrawListener((pzp0.c) this.d);
                break;
            case 5:
                com.mbridge.msdk.config.component.common.util.d.b((String) this.c, (String) this.d);
                break;
            case 6:
                waz0 waz0Var = (waz0) this.c;
                String str = (String) this.d;
                mfz0.b bVar = waz0Var.a;
                if (!TextUtils.isEmpty(str)) {
                    try {
                        jSONObject = new JSONObject(str);
                    } catch (Throwable unused3) {
                        gu8.c(null, "WebFormVKBridgeParser: json is null, parsing copyText has been failed");
                    }
                    if (jSONObject.has("text")) {
                        optString = jSONObject.optString("text");
                        ((ClipboardManager) bVar.a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(null, optString));
                        TextUtils.isEmpty(optString);
                        break;
                    }
                } else {
                    gu8.c(null, "WebFormVKBridgeParser: json is null, parsing CopyText has been failed");
                }
                optString = null;
                ((ClipboardManager) bVar.a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(null, optString));
                TextUtils.isEmpty(optString);
            default:
                C4618w9.a((C4618w9) this.c, (IronSourceError) this.d);
                break;
        }
    }
}
