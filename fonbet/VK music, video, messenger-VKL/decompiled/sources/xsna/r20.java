package xsna;

import android.content.Context;
import com.vk.libvideo.design.view.actionlink.ActionLinkView;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class r20 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ r20(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                bpn0 bpn0Var = ActionLinkView.f;
                return new com.vk.libvideo.design.view.actionlink.a(context);
            default:
                ylw ylwVar = new ylw(R.drawable.vk_icon_hashtag_16);
                ylwVar.d(R.color.vk_white);
                ylwVar.c = 2;
                float f = 16;
                int a = iah0.a(f);
                int a2 = iah0.a(f);
                ylwVar.a = a;
                ylwVar.b = a2;
                return ylwVar.b(context);
        }
    }
}
