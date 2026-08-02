package xsna;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.health.js.bridge.api.events.GetWorkouts$Response;
import com.vk.superapp.health.js.bridge.api.events.WorkoutsSyncCompleted$Response;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class mwo implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ mwo(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                qwo qwoVar = (qwo) this.c;
                izs<? super uvo, s3q0> izsVar = (izs) this.d;
                wh50 wh50Var = (wh50) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2142345881, intValue, -1, "com.vk.ads.easypromote.impl.presentation.EasyPromoteSettingsView.ThemedContent.<anonymous> (EasyPromoteSettingsView.kt:91)");
                    }
                    qwoVar.i((fwo) wh50Var.getValue(), izsVar, aVar, 512);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                mxt mxtVar = (mxt) this.c;
                Context context = (Context) this.d;
                String str = (String) this.e;
                Integer num = (Integer) obj;
                int intValue2 = num.intValue();
                String str2 = (String) obj2;
                long longValue = ((Long) obj3).longValue();
                com.vk.superapp.base.js.bridge.b bVar = mxtVar.b;
                com.vk.superapp.base.js.bridge.b.p(bVar, new JsMethod("VKWebAppGetWorkouts"), new GetWorkouts$Response(null, new GetWorkouts$Response.Data(new GetWorkouts$Response.Data.Result(num, str2, Integer.valueOf((int) longValue), x1w0.a(context, "com.google.android.apps.fitness"), GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) != 0 ? null : x1w0.a(context, "com.google.android.gms")), str), str, 1, null), null, null, false, null, 60);
                String b = defpackage.j0.b("VKWebAppGetWorkouts", bVar);
                bVar.n(new JsMethod("VKWebAppWorkoutsSyncCompleted"), new WorkoutsSyncCompleted$Response(null, new WorkoutsSyncCompleted$Response.Data(intValue2, b), b, 1, null));
                break;
        }
        return s3q0.a;
    }
}
