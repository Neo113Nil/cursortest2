package xsna;

import android.widget.TextView;
import com.vk.voip.ui.history.friends.ui.VoipHistoryFriendsFragment;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class npw0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ npw0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                int i2 = VoipHistoryFriendsFragment.U;
                ((TextView) obj3).setText(j03.g(((VoipHistoryFriendsFragment) obj2).mo2getContext(), (Throwable) obj, R.string.error));
                break;
            default:
                gzs gzsVar = (gzs) obj2;
                ((gvw0) obj3).i = false;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                break;
        }
        return s3q0.a;
    }
}
