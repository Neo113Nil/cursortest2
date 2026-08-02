package xsna;

import android.view.View;
import android.widget.Toast;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class qwa implements oa80 {
    @Override // xsna.oa80
    public final chj a(View view, chj chjVar) {
        if (!chjVar.a.a().getDescription().hasMimeType("image/*")) {
            return chjVar;
        }
        Toast.makeText(view.getContext(), R.string.vkim_channel_comments_writebar_not_supported_yet, 0).show();
        return null;
    }
}
