package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.attachpicker.widget.TabImageView;
import com.vk.attachpicker.widget.TabTextView;
import com.vkontakte.android.R;
import xsna.cyn0;

/* compiled from: TabHolder.kt */
/* loaded from: classes15.dex */
public final class jsn0 extends RecyclerView.e0 {
    public final cyn0.a l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public jsn0(Context context, cyn0.a aVar, cyn0.c cVar) {
        super(r0);
        qtn0 qtn0Var = new qtn0(context);
        LayoutInflater.from(context).inflate(R.layout.picker_adapter_tabs, qtn0Var);
        qtn0Var.b = (TabImageView) qtn0Var.findViewById(R.id.iv_icon);
        qtn0Var.c = (TabTextView) qtn0Var.findViewById(R.id.tv_title);
        qtn0Var.d = (ImageView) qtn0Var.findViewById(R.id.attach_badge);
        this.l = aVar;
        qtn0 qtn0Var2 = (qtn0) this.itemView;
        int i = cVar.a;
        int i2 = cVar.b;
        int i3 = cVar.c;
        int i4 = cVar.d;
        int i5 = cVar.e;
        int i6 = cVar.f;
        TabImageView tabImageView = qtn0Var2.b;
        tabImageView.d = i;
        tabImageView.e = i2;
        tabImageView.f = i3;
        tabImageView.g = i4;
        tabImageView.invalidate();
        TabTextView tabTextView = qtn0Var2.c;
        tabTextView.b = i5;
        tabTextView.c = i6;
        tabTextView.invalidate();
    }
}
