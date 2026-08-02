package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: InnerActionItemHolder.kt */
/* loaded from: classes15.dex */
public abstract class u0x extends RecyclerView.e0 {
    public final a l;

    /* compiled from: InnerActionItemHolder.kt */
    public static final class a {
        public final gbh a;
        public final k6k b;
        public final odm c;

        public a(gbh gbhVar, k6k k6kVar, odm odmVar) {
            this.a = gbhVar;
            this.b = k6kVar;
            this.c = odmVar;
        }
    }

    public u0x(View view, a aVar) {
        super(view);
        this.l = aVar;
    }

    public abstract void V5(com.vk.attachpicker.adapter.a aVar);
}
