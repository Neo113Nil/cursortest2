package xsna;

import com.vkontakte.android.R;
import xsna.cq1;
import xsna.isc0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class bq1 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bq1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ysg0.b.a(new cl1(((cq1.a) this.c).a));
                break;
            case 1:
                ((b2b) this.c).e.b(R.drawable.vk_icon_unpin_24, R.string.vkim_channel_msg_action_success_unpin);
                break;
            case 2:
                ((ocl) this.c).m = false;
                break;
            case 3:
                ((com.vk.newsfeed.common.recycler.holders.b) this.c).z = false;
                break;
            case 4:
                ((isc0.a) this.c).a();
                break;
            default:
                ((com.vk.auth.ui.password.askpassword.a) this.c).b.r();
                break;
        }
    }
}
