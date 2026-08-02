package xsna;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.preference.Preference;
import com.vk.log.L;
import java.io.IOException;
import java.util.Objects;
import org.json.JSONObject;

/* compiled from: Users.java */
/* loaded from: classes7.dex */
public final class m0r0 {

    /* compiled from: Users.java */
    public class a implements hx2<JSONObject> {
        public final /* synthetic */ SharedPreferences b;
        public final /* synthetic */ Object[] c;

        public a(SharedPreferences sharedPreferences, Object[] objArr) {
            this.b = sharedPreferences;
            this.c = objArr;
        }

        @Override // xsna.hx2
        @SuppressLint({"CommitPrefEdits"})
        public final void b(JSONObject jSONObject) {
            this.b.edit().remove("push_counter").commit();
            this.c[0] = null;
        }

        @Override // xsna.hx2
        public final void e(VKApiExecutionException vKApiExecutionException) {
            int s = vKApiExecutionException.s();
            Object[] objArr = this.c;
            if (s == -1) {
                objArr[0] = new IOException(vKApiExecutionException.toString());
            } else {
                objArr[0] = new VKApiExecutionException(vKApiExecutionException.s(), "account.setOnline", false, vKApiExecutionException.getMessage());
            }
        }
    }

    public static void a() {
        if (o25.a().b()) {
            L.p("vk", "Sending offline.");
            io.reactivex.rxjava3.core.q<R> L = rsg0.y0(new rsg0("account.setOffline"), null, null, 3).L(new uga0(5), false);
            qao qaoVar = new qao(2);
            com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
            Objects.requireNonNull(bVar);
            L.subscribe(qaoVar, new le50(bVar, 25));
        }
    }

    public static void b() throws IOException, VKApiExecutionException {
        if (o25.a().b()) {
            SharedPreferences l = Preference.l();
            int i = l.getInt("push_counter", 0);
            Object[] objArr = new Object[1];
            rsg0 rsg0Var = new rsg0("account.setOnline");
            rsg0Var.C(i, "push_count");
            new jx2(rsg0Var, new a(l, objArr)).b();
            Object obj = objArr[0];
            if (obj != null) {
                if (!(obj instanceof IOException)) {
                    throw ((VKApiExecutionException) obj);
                }
                throw ((IOException) obj);
            }
        }
    }
}
