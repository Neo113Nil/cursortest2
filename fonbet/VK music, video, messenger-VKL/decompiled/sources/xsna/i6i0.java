package xsna;

import android.view.View;
import android.widget.TextView;
import com.vk.photos.root.selectalbum.presentation.SelectAlbumBottomSheet;
import com.vkontakte.android.R;

/* compiled from: SelectAlbumBottomView.kt */
/* loaded from: classes4.dex */
public final class i6i0 implements gm50 {
    public final SelectAlbumBottomSheet b;
    public final TextView c;

    public i6i0(View view, String str, SelectAlbumBottomSheet selectAlbumBottomSheet, pf40 pf40Var) {
        this.b = selectAlbumBottomSheet;
        TextView textView = (TextView) view.findViewById(R.id.confirm);
        textView.setText(str);
        bwt0.i0(textView, new aj50(pf40Var, 18));
        this.c = textView;
        bwt0.S(view, new arb0(pf40Var, 10));
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.b;
    }
}
