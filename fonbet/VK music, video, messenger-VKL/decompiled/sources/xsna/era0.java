package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.newsfeed.posting.geo_picker.presentation.a;
import com.vkontakte.android.R;

/* compiled from: PlacePickerPagingRetryHolder.kt */
/* loaded from: classes4.dex */
public final class era0 extends RecyclerView.e0 implements View.OnClickListener {
    public final tqa0 l;

    public era0(ViewGroup viewGroup, com.vk.newsfeed.posting.geo_picker.presentation.e eVar) {
        super(tf3.b(viewGroup, R.layout.vk_view_default_list_error_view, viewGroup, false));
        this.l = eVar;
        ((TextView) this.itemView.findViewById(R.id.error_button)).setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (jjc.b()) {
            return;
        }
        this.l.yi(a.InterfaceC1406a.e.b);
    }
}
