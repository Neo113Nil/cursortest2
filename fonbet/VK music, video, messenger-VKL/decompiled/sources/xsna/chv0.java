package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.preference.Preference;
import com.vkontakte.android.FragmentWrapperActivity;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptySet;
import xsna.hdh0;

/* compiled from: VkRouterImpl.kt */
/* loaded from: classes.dex */
public class chv0 implements lpg0 {
    public final fv1 a = fv1.a;
    public final bpn0 b = new bpn0(new x0f(15));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.content.Context] */
    @Override // xsna.lpg0
    public final void a(Context context, nch0 nch0Var) {
        Class cls;
        Intent intent;
        ww50<?> Y;
        iw50 a = nch0Var.a();
        hdh0 b = nch0Var.b();
        cls = FragmentWrapperActivity.class;
        boolean z = false;
        if (b instanceof hdh0.a) {
            a.a().putBoolean("_fragment_impl_key_hide_bottom_fragment", true);
            hdh0.a aVar = (hdh0.a) b;
            Bundle b2 = b(aVar.b(), a.a());
            Class a2 = aVar.a();
            intent = new Intent((Context) context, (Class<?>) (a2 != null ? a2 : FragmentWrapperActivity.class));
            intent.putExtras(b2);
            intent.putExtra("key_clear_top", a.a().getBoolean("key_clear_top", false));
            intent.putExtra("initialize_camera", a.a().getBoolean("initialize_camera", true));
        } else {
            if (!(b instanceof hdh0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            a.a().putBoolean("_fragment_impl_key_hide_bottom_fragment", true);
            Bundle b3 = b(((hdh0.b) b).a(), a.a());
            intent = new Intent((Context) context, (Class<?>) cls);
            intent.putExtras(b3);
            intent.putExtra("key_clear_top", a.a().getBoolean("key_clear_top", false));
            intent.putExtra("initialize_camera", a.a().getBoolean("initialize_camera", true));
        }
        boolean z2 = context instanceof ey50;
        if (z2) {
            ((ey50) context).Y().b0(intent);
        }
        iw50 a3 = nch0Var.a();
        a3.getClass();
        Bundle a4 = a3.a();
        if (e3m.h(context) == null) {
            context.startActivity(intent.addFlags(268435456), a4);
        } else {
            ey50 ey50Var = z2 ? (ey50) context : null;
            if (ey50Var != null && (Y = ey50Var.Y()) != null) {
                z = Y.r(intent);
            }
            if (!z) {
                Activity h = e3m.h(context);
                if (h != null) {
                    h.startActivity(intent, a3.a());
                    s3q0 s3q0Var = s3q0.a;
                } else {
                    com.vk.metrics.eventtracking.b.a.q(new IllegalArgumentException("Context is not activity context. Can't start for result!"));
                }
            }
        }
        ((Handler) this.b.getValue()).postDelayed(new kw6(10, this, intent), TimeUnit.SECONDS.toMillis(15L));
    }

    public final Bundle b(Class<? extends FragmentImpl> cls, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putSerializable("class", cls);
        bundle2.putBundle("args", bundle);
        String E0 = erm0.E0(4, UUID.randomUUID().toString());
        bundle2.putString("id", E0);
        this.a.getClass();
        fv1.b.add(E0);
        Preference preference = Preference.a;
        Preference.K(izi0.k(Preference.u(EmptySet.b, "by_version", "allowed_intent_ids_set"), E0), "by_version", "allowed_intent_ids_set");
        return bundle2;
    }
}
