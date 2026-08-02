package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vkontakte.android.R;
import xsna.rwl0;

/* compiled from: StoryActionAdapterHelper.kt */
/* loaded from: classes6.dex */
public final class twl0 {
    public final Context a;
    public final FrameLayout b;
    public final a c = new a();
    public final int d = View.MeasureSpec.makeMeasureSpec(0, 0);

    public twl0(Context context) {
        this.a = context;
        this.b = new FrameLayout(context);
    }

    public final cc<?> a(ViewGroup viewGroup, int i, rwl0.a aVar) {
        View inflate = LayoutInflater.from(bwt0.u(this.a)).inflate(i, viewGroup, false);
        return i == R.layout.pds_item_story_action_link ? new u5m0(inflate, aVar) : i == R.layout.pds_item_story_action_html5_close ? new p7m0(inflate, aVar) : i == R.layout.pds_item_story_action_like_image ? new k5m0(inflate, aVar) : i == R.layout.pds_item_story_action_image ? new wwl0(inflate, aVar) : i == R.layout.pds_item_story_action_message ? new zcm0(inflate, aVar) : i == R.layout.pds_item_story_action_stub ? new qim0(inflate, aVar) : i == R.layout.pds_item_story_statistics ? new jhm0(inflate, aVar) : new qim0(inflate, aVar);
    }

    /* compiled from: StoryActionAdapterHelper.kt */
    public static final class a implements rwl0.a {
        public a() {
        }

        @Override // xsna.v2d0
        public final View d() {
            return new View(twl0.this.a);
        }

        @Override // xsna.v2d0
        public final Rect f() {
            return new Rect();
        }

        @Override // xsna.rwl0.a
        public final void a(uwl0 uwl0Var) {
        }

        @Override // xsna.rwl0.a
        public final void b(MotionEvent motionEvent) {
        }

        @Override // xsna.v2d0
        public final void c(boolean z) {
        }

        @Override // xsna.rwl0.a
        public final void e(uwl0 uwl0Var, int i) {
        }
    }
}
