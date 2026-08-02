package xsna;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.vkontakte.android.R;
import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import xsna.dfq0;

/* compiled from: MoneyRequestNotification.kt */
/* loaded from: classes5.dex */
public final class q730 extends dfq0 {
    public final a z;

    /* compiled from: MoneyRequestNotification.kt */
    public static final class a extends dfq0.a {
        public final long o;
        public final long p;
        public final String q;
        public final String r;

        public a(Map<String, String> map) {
            super(map);
            String str = map.get("context");
            JSONObject jSONObject = str != null ? new JSONObject(str) : new JSONObject();
            this.o = jSONObject.optLong("from_id");
            this.p = jSONObject.optLong("to_id");
            this.q = jSONObject.optString("amount");
            this.r = jSONObject.optString(InAppPurchaseMetaData.KEY_CURRENCY);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q730(Context context, Map<String, String> map, Bitmap bitmap, Bitmap bitmap2, File file) {
        super(context, r2, bitmap, bitmap2, file);
        a aVar = new a(map);
        this.z = aVar;
    }

    @Override // xsna.dfq0
    public final Intent C() {
        o0w b = g2v.c().b();
        a aVar = this.z;
        return o0w.j(b, this.c, Long.valueOf(aVar.p), aVar.o, null, null, "message_push", g2v.c().b().D(), null, 100638712);
    }

    @Override // com.vk.pushes.notifications.base.a
    public final Collection<NotificationCompat.a> m() {
        a aVar = this.z;
        if (aVar.p != o25.a().c().b) {
            return EmptyList.b;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("from_id_key", aVar.o);
        bundle.putString("amount_key", aVar.q);
        bundle.putString("currency_key", aVar.r);
        NotificationCompat.a.C0022a c0022a = new NotificationCompat.a.C0022a(R.drawable.vk_icon_money_transfer_24, this.c.getResources().getString(R.string.send), l(k(bundle, "send_money")));
        c0022a.e.putBundle("android.wearable.EXTENSIONS", ar.b(7, "flags"));
        return Collections.singletonList(c0022a.b());
    }
}
