package xsna;

import android.widget.FrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.vkontakte.android.R;
import java.util.List;
import xsna.bxc0;

/* compiled from: PreinflateTaskLogic.kt */
/* loaded from: classes11.dex */
public interface p0d0 {

    /* compiled from: PreinflateTaskLogic.kt */
    public static final class a {
        public static final C3485a a = new C3485a();

        /* compiled from: PreinflateTaskLogic.kt */
        /* renamed from: xsna.p0d0$a$a, reason: collision with other inner class name */
        public static final class C3485a implements p0d0 {
            @Override // xsna.p0d0
            public final List<bxc0> a() {
                return e43.l(new bxc0(R.layout.create_camera_stub_view, FrameLayout.class, true), bxc0.a.a(R.layout.fragment_home_united), new bxc0(R.layout.feed_tabs_v2, AppBarLayout.class, false), bxc0.a.a(R.layout.vk_profile_dashboard_content), bxc0.a.a(R.layout.vk_new_passport_view_loading));
            }
        }
    }

    List<bxc0> a();
}
