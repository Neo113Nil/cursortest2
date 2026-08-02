package xsna;

import android.view.View;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: AlbumDetailsFooter.kt */
/* loaded from: classes4.dex */
public final class o6s extends vif0<e6s> {
    public final TextView n;

    public o6s(View view) {
        super(view);
        this.n = (TextView) view.findViewById(R.id.tv_photos_count);
    }

    @Override // xsna.vif0
    public final void i6(e6s e6sVar) {
        this.n.setText(enj.f(R.plurals.profile_content_photos_in_album_count, e6sVar.a, this.itemView.getContext()));
    }
}
