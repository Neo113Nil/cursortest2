package xsna;

import android.view.View;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.r0s;
import xsna.r2s;

/* compiled from: FoldersCreatePromoVh.kt */
/* loaded from: classes18.dex */
public final class s0s extends o2s<r0s> {
    public final r0s.a l;
    public final TextView m;

    public s0s(View view, r2s.a aVar) {
        super(view);
        this.l = aVar;
        this.m = (TextView) view.findViewById(R.id.vkim_confirm_btn);
    }

    @Override // xsna.vfz
    public final void W5(Object obj) {
        this.m.setOnClickListener(new rg0(this, 3));
    }
}
