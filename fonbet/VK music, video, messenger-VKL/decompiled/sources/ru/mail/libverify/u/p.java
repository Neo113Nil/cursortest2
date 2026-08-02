package ru.mail.libverify.u;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.gzs;

/* loaded from: classes9.dex */
final class p extends Lambda implements gzs<Object> {
    final /* synthetic */ Context a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context) {
        super(0);
        this.a = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        ConnectivityManager connectivityManager;
        String str;
        Context context = this.a;
        JSONObject jSONObject = new JSONObject();
        if (ru.mail.libverify.n0.e.b(context, "android.permission.ACCESS_NETWORK_STATE") && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                String str2 = "Not connected";
                for (NetworkInfo networkInfo : connectivityManager.getAllNetworkInfo()) {
                    if (networkInfo.isConnected()) {
                        str2 = networkInfo.getTypeName();
                    }
                }
                str = str2;
            } else {
                str = activeNetworkInfo.getTypeName();
            }
            jSONObject.put("type", str);
        }
        return jSONObject;
    }
}
