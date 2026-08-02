package defpackage;

import android.net.Uri;
import com.yandex.div.legacy.view.DivView;
import com.yandex.div.state.db.StateEntry;

/* loaded from: classes11.dex */
public class k9y {
    public boolean a(Uri uri, DivView divView) {
        if (uri != null && "div-action".equals(uri.getScheme()) && "set_state".equals(uri.getAuthority())) {
            String queryParameter = uri.getQueryParameter(StateEntry.COLUMN_STATE_ID);
            if (queryParameter == null) {
                z83.j("state_id param is required");
                return false;
            }
            try {
                divView.switchToState(Integer.parseInt(queryParameter));
                return true;
            } catch (NumberFormatException e) {
                z83.k("Switch state action should contain integer stateId, but was:" + uri.toString(), e);
            }
        }
        return false;
    }
}
