package xsna;

import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import com.vk.dto.hints.Hint;
import com.vkontakte.android.R;
import ru.ok.gl.tf.Tensorflow;

/* compiled from: VkFeedDateTooltip.kt */
/* loaded from: classes4.dex */
public final class huu0 {
    public Long a;

    public final void a(View view, gzs<? extends RectF> gzsVar, int i, int i2) {
        Long l = this.a;
        if (l != null && SystemClock.elapsedRealtime() - l.longValue() < 300) {
            this.a = null;
            return;
        }
        String m = i > 0 ? pvo0.m(i) : null;
        if (m == null) {
            return;
        }
        hl60.g(hl60.a, view.getContext(), view, new Hint("post_footer_full_date", m, i2 > 0 ? view.getResources().getQuantityString(R.plurals.counter_views, (int) uqm0.b(i2), iah0.f().widthPixels < 768 ? uqm0.o(i2) : uqm0.f(i2)) : null, null, 8, null), false, new r78(view, 1), true, gzsVar, new a(), null, null, Tensorflow.FRAME_HEIGHT);
    }

    /* compiled from: VkFeedDateTooltip.kt */
    public static final class a implements x6v {
        public a() {
        }

        @Override // xsna.x6v
        public final void b(String str) {
            huu0.this.a = Long.valueOf(SystemClock.elapsedRealtime());
        }

        @Override // xsna.x6v
        public final void onClick() {
        }

        @Override // xsna.x6v
        public final void a(View view, String str) {
        }
    }
}
