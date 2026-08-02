package xsna;

import android.content.Context;
import com.vk.dto.user.RequestUserProfile;
import com.vkontakte.android.R;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class l060 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l060(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((m060) this.c).c((RequestUserProfile) this.d, false);
                break;
            default:
                ((fq60) this.c).d((Context) this.d, new yo60.g.c(R.string.ad_marker_copied));
                break;
        }
    }
}
