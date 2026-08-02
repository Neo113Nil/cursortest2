package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: VerificationTypeViewHolder.kt */
/* loaded from: classes3.dex */
public final class tnr0 extends RecyclerView.e0 {
    public final ImageView l;
    public final TextView m;
    public final TextView n;
    public final View o;
    public final Object p;

    public tnr0(ViewGroup viewGroup) {
        super(tf3.b(viewGroup, R.layout.vk_auth_method_selector_type_item, viewGroup, false));
        this.l = (ImageView) this.itemView.findViewById(R.id.method_selector_type_image);
        this.m = (TextView) this.itemView.findViewById(R.id.method_selector_type_title);
        this.n = (TextView) this.itemView.findViewById(R.id.method_selector_type_info);
        this.o = this.itemView.findViewById(R.id.method_selector_type_layout);
        this.p = msy.a(LazyThreadSafetyMode.NONE, new gd40(this, 29));
    }
}
