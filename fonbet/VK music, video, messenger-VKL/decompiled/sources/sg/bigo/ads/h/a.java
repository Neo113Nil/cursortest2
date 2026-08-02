package sg.bigo.ads.h;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes9.dex */
public interface a {

    /* renamed from: sg.bigo.ads.h.a$a, reason: collision with other inner class name */
    public static final class C2487a {
        Set<Integer> a = new HashSet();

        public final void a(sg.bigo.ads.api.core.b bVar, int i, long j) {
            if (this.a.contains(Integer.valueOf(i))) {
                return;
            }
            this.a.add(Integer.valueOf(i));
            sg.bigo.ads.da.b.a(bVar, i, j, (String) null, -1, (String) null, (String) null);
        }

        public final void a(sg.bigo.ads.api.core.b bVar, int i, long j, @Nullable String str, int i2, @Nullable String str2, @Nullable String str3) {
            if (this.a.contains(Integer.valueOf(i))) {
                return;
            }
            this.a.add(Integer.valueOf(i));
            sg.bigo.ads.da.b.a(bVar, i, j, str, i2, str2, str3);
        }

        public final void a(sg.bigo.ads.api.core.b bVar, int i, long j, @Nullable Map<String, String> map) {
            if (this.a.contains(Integer.valueOf(i))) {
                return;
            }
            this.a.add(Integer.valueOf(i));
            sg.bigo.ads.da.b.a(bVar, i, j, (String) null, -1, (String) null, (String) null, map);
        }
    }

    @Nullable
    View a();

    void a(int i);

    void a(int i, int i2);

    boolean a(Context context);

    boolean b();

    void c();

    void d();

    void e();

    void f();
}
