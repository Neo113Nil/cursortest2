package defpackage;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.widget.FrameLayout;
import androidx.core.app.s0;
import com.bumptech.glide.Glide;
import com.google.firebase.a;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.ToJson;
import com.squareup.moshi.Types;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import com.yandex.plus.pay.internal.network.SimOperator;
import core.flex.ui.contentaware.ContentAwareFrameLayout;
import io.appmetrica.analytics.AppMetricaYandex;
import java.io.File;
import java.util.List;
import java.util.UUID;
import json.state.disk.storage.feature.c;
import kotlin.io.b;

/* loaded from: classes.dex */
public final /* synthetic */ class ku2 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ ku2(Context context, a6d0 a6d0Var) {
        this.a = 14;
        this.b = context;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        PolymorphicJsonAdapterFactory polymorphicJsonAdapterFactory;
        int i = this.a;
        Context context = this.b;
        switch (i) {
            case 0:
                fi10 fi10Var = new fi10();
                fi10.b(fi10Var, context);
                return fi10Var.a();
            case 1:
                zwj zwjVar = new zwj();
                File o = b.o(context.getCacheDir(), "app_img_caches");
                String str = oq90.b;
                zwjVar.a = sms.e(o);
                zwjVar.d = 10485760L;
                zwjVar.e = 268435456L;
                zwjVar.c = 1.0d;
                return zwjVar.a();
            case 2:
                return new File(context.getFilesDir(), "banners_media");
            case 3:
                String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
                if (simOperator == null) {
                    return null;
                }
                int length = simOperator.length();
                String str2 = simOperator.length() >= 3 ? simOperator : null;
                String substring = str2 != null ? str2.substring(0, 3) : null;
                if (simOperator.length() < 4) {
                    simOperator = null;
                }
                String substring2 = simOperator != null ? simOperator.substring(3, length) : null;
                if (substring == null || substring2 == null || substring2.length() > 3) {
                    return null;
                }
                return new SimOperator(substring, substring2);
            case 4:
                return context.getSharedPreferences("logistics_hidden_deliveries_data", 0);
            case 5:
                sb3 sb3Var = new sb3(context.getDatabasePath("deliveries").toString(), "delivery_stubs.json");
                Moshi.Builder builder = new Moshi.Builder();
                isi.Companion.getClass();
                polymorphicJsonAdapterFactory = isi.jsonAdapterFactory;
                return new o1r(sb3Var, new au50(24, builder.add((JsonAdapter.Factory) polymorphicJsonAdapterFactory).add(new Object() { // from class: ru.yandex.taxi.logistics.sdk.deliveries.impl.source.data.DeliveryStubDataSourceImpl$UuidJsonAdapter
                    @FromJson
                    public final UUID fromJson(String json2) {
                        return UUID.fromString(json2);
                    }

                    @ToJson
                    public final String toJson(UUID uuid) {
                        return uuid.toString();
                    }
                }).build().adapter(Types.newParameterizedType(List.class, isi.class))));
            case 6:
                return new FrameLayout(context);
            case 7:
                return new ContentAwareFrameLayout(this.b, null, 0, 6, null);
            case 8:
                a.i(context);
                return Boolean.TRUE;
            case 9:
                File n = sb2.n(context, "firebaseSessions/sessionConfigsDataStore.data");
                o430.p(n);
                return n;
            case 10:
                File n2 = sb2.n(context, "firebaseSessions/sessionDataStore.data");
                o430.p(n2);
                return n2;
            case 11:
                return Glide.with(context);
            case 12:
                return androidx.work.impl.b.i(context);
            case 13:
                return new s0(context);
            case 14:
                return AppMetricaYandex.getReporter(context, "efc3d9ed-dd0d-44a1-a61a-3dac9b777047");
            case 15:
                return Boolean.valueOf(o430.B.o(context).a());
            case 16:
                return qje.r(context);
            case 17:
                return context.getSharedPreferences("eatskitstatic_statics_preferences", 0);
            case 18:
                return context.getSharedPreferences("stories", 0);
            case 19:
                return new c(context, "jason_superapp_suggest_storage");
            case 20:
                return sb2.n(context, "coolDownUid.json");
            case 21:
                return sb2.n(context.getApplicationContext(), "yandex-datastore".concat(".preferences_pb"));
            default:
                return sb2.n(context, "urlTemplates.json");
        }
    }

    public /* synthetic */ ku2(Context context, int i) {
        this.a = i;
        this.b = context;
    }
}
