package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.vkontakte.android.R;
import xsna.gz10;

/* compiled from: StoryMediaStoreItemSmallHolder.kt */
/* loaded from: classes15.dex */
public final class m6m0 extends gz10 {
    public boolean v;
    public final View w;

    public m6m0(Context context, dba0 dba0Var, gz10.a aVar) {
        super(R.layout.story_picker_layout_image_item, context, 0, 1.525238f, dba0Var, aVar);
        this.w = this.itemView.findViewById(R.id.picker_counter_container);
        this.r.setTextColor(dm10.b(R.attr.vk_ui_text_primary_invariably, -16777216, context));
        this.r.setBackground(m33.a(R.drawable.picker_bg_circle_white, context));
        this.itemView.setAccessibilityDelegate(new k6m0(this));
        this.o.setOnLoadCallback(new l6m0());
        this.o.x = null;
    }

    @Override // xsna.gz10, xsna.otx0
    public final Rect X1(Rect rect) {
        gz10.a aVar = this.n;
        if (aVar.c.invoke().intValue() < 1 && !this.v) {
            this.w.getGlobalVisibleRect(rect);
            return rect;
        }
        if (aVar.a.invoke().booleanValue()) {
            this.q.getGlobalVisibleRect(rect);
            return rect;
        }
        this.itemView.getGlobalVisibleRect(rect);
        return rect;
    }

    @Override // xsna.gz10
    public final void V5(boolean z) {
    }
}
