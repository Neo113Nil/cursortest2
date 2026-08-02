package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.v3s;

/* compiled from: OtherFollowersHeaderHolder.kt */
/* loaded from: classes15.dex */
public final class zz80 extends vfz<v3s.c> {
    public final TextView l;

    public zz80(ViewGroup viewGroup) {
        super(R.layout.other_followers_header, viewGroup);
        this.l = (TextView) this.itemView.findViewById(R.id.followers_count);
    }

    @Override // xsna.vfz
    public final void W5(v3s.c cVar) {
        this.l.setText(String.valueOf(cVar.b));
    }
}
