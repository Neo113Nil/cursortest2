package xsna;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.button.VkButton;
import com.vkontakte.android.R;
import java.util.Arrays;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.ecp0;

/* compiled from: LiveSubscriptionToggleButton.kt */
/* loaded from: classes16.dex */
public final class kmz implements vbp0 {
    public final Context a;
    public final ecp0.a b;
    public a c;
    public final VkButton d;
    public final Object e;
    public final Object f;

    /* compiled from: LiveSubscriptionToggleButton.kt */
    public interface a {

        /* compiled from: LiveSubscriptionToggleButton.kt */
        /* renamed from: xsna.kmz$a$a, reason: collision with other inner class name */
        public static final class C3188a implements a {
            public static final C3188a a = new C3188a();
        }

        /* compiled from: LiveSubscriptionToggleButton.kt */
        public static final class b implements a {
            public static final b a = new b();
        }

        /* compiled from: LiveSubscriptionToggleButton.kt */
        public static final class c implements a {
            public final boolean a;

            public c(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.a == ((c) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("Soon(isSubscribed="), this.a, ')');
            }
        }

        /* compiled from: LiveSubscriptionToggleButton.kt */
        public static final class d implements a {
            public final long a;

            public d(long j) {
                this.a = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.a == ((d) obj).a;
            }

            public final int hashCode() {
                return Long.hashCode(this.a);
            }

            public final String toString() {
                return vu5.a(')', this.a, new StringBuilder("Timer(startTime="));
            }
        }
    }

    public kmz(Context context, ecp0.a aVar) {
        this.a = context;
        this.b = aVar;
        VkButton vkButton = new VkButton(context, null, 6, 0);
        vkButton.setId(R.id.topshelf_button_live_subscribe_toggle);
        vkButton.setAppearance(VkButton.Appearance.Overlay);
        vkButton.setMode(VkButton.Mode.Primary);
        vkButton.setSize(VkButton.Size.Medium);
        vkButton.setLayoutParams(new ConstraintLayout.b(0, e3m.a(R.dimen.video_topshelf_button_height, vkButton.getContext())));
        bwt0.j0(vkButton, new hv7(1, this, kmz.class, "internalOnClick", "internalOnClick(Landroid/view/View;)V", 0, 3), 1000L);
        this.d = vkButton;
        a(a.C3188a.a);
        xv0 xv0Var = new xv0(13);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.e = msy.a(lazyThreadSafetyMode, xv0Var);
        this.f = msy.a(lazyThreadSafetyMode, new nuj(this, 19));
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(a aVar) {
        Integer valueOf = Integer.valueOf(R.drawable.vk_icon_play_24);
        if (aVar.equals(this.c)) {
            return;
        }
        this.c = aVar;
        if (aVar instanceof a.C3188a) {
            b(valueOf, Integer.valueOf(R.string.topshelf_watch_live), new Object[0]);
            return;
        }
        if (aVar instanceof a.c) {
            Pair pair = ((a.c) aVar).a ? new Pair(Integer.valueOf(R.drawable.vk_icon_done_outline_24), Integer.valueOf(R.string.topshelf_we_will_notify)) : new Pair(Integer.valueOf(R.drawable.vk_icon_notification_outline_20), Integer.valueOf(R.string.topshelf_remind_about_start));
            b(Integer.valueOf(((Number) pair.d()).intValue()), Integer.valueOf(((Number) pair.g()).intValue()), new Object[0]);
        } else if (aVar instanceof a.d) {
            ((Runnable) this.f.getValue()).run();
        } else {
            if (!(aVar instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            b(valueOf, Integer.valueOf(R.string.watch), new Object[0]);
        }
    }

    public final void b(Integer num, Integer num2, Object... objArr) {
        int[] iArr = VkButton.W;
        VkButton vkButton = this.d;
        vkButton.a5(true, num);
        if (objArr.length == 0) {
            vkButton.setText(num2.intValue());
            return;
        }
        vkButton.setText(this.a.getString(num2.intValue(), Arrays.copyOf(objArr, objArr.length)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.vbp0
    public final void destroy() {
        ((Handler) this.e.getValue()).removeCallbacks((Runnable) this.f.getValue());
    }

    @Override // xsna.vbp0
    public final View getView() {
        return this.d;
    }
}
