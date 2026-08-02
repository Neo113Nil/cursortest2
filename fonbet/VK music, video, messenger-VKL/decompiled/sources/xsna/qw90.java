package xsna;

import android.app.Activity;
import com.vk.pushes.PushOpenActivity;
import com.vkontakte.android.LinkRedirActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class qw90 implements izs {
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Activity activity = (Activity) obj;
        return Boolean.valueOf(((activity instanceof LinkRedirActivity) || (activity instanceof PushOpenActivity)) ? false : true);
    }
}
