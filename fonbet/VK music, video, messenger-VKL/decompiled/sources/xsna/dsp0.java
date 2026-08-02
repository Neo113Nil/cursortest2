package xsna;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.TextView;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.design.view.movika.InteractiveDurationView;
import com.vk.profile.design.compose.header.AuthorHeaderConfig;
import com.vk.profile.design.compose.header.sink.AuthorHeaderEvent;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;
import xsna.q9u0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class dsp0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dsp0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((izs) this.c).invoke(new AuthorHeaderEvent.Info.f((AuthorHeaderConfig.Info.InfoSlotData.TrustTag) ((zak0) ((esp0) this.d).a).getValue()));
                return s3q0.a;
            case 1:
                q4q0 q4q0Var = (q4q0) this.c;
                Object obj = (Context) this.d;
                if (obj instanceof ey50) {
                    ((ey50) obj).Y().H(q4q0Var);
                }
                return s3q0.a;
            case 2:
                zjt0 zjt0Var = (zjt0) this.c;
                VideoAttachment videoAttachment = (VideoAttachment) this.d;
                boolean z = zjt0Var.J;
                InteractiveDurationView interactiveDurationView = zjt0Var.F;
                VKImageView vKImageView = zjt0Var.D;
                TextView textView = zjt0Var.E;
                if (z) {
                    interactiveDurationView.setVisibility(0);
                    textView.setVisibility(4);
                } else {
                    textView.setVisibility(0);
                    interactiveDurationView.setVisibility(4);
                }
                vKImageView.setVisibility(0);
                textView.setVisibility(0);
                f4m.j(zjt0Var.G);
                Image Ib = videoAttachment.Ib();
                ImageSize Cb = Ib != null ? Ib.Cb(vKImageView.getLayoutParams().width, true, false) : null;
                vKImageView.load(Cb != null ? Cb.d.d : null);
                f4m.j(zjt0Var.H);
                return s3q0.a;
            case 3:
                ((q9u0) this.c).O(((q9u0.a) this.d).b);
                return s3q0.a;
            case 4:
                w7k0.d(((w5v0) this.c).b(), (ContextWrapper) this.d, R.string.music_player_snack_bar_common_error);
                return s3q0.a;
            default:
                wh50 wh50Var = (wh50) this.c;
                com.vk.core.compose.component.datetime.n nVar = (com.vk.core.compose.component.datetime.n) this.d;
                ljo0 ljo0Var = (ljo0) wh50Var.getValue();
                if (ljo0Var != null) {
                    com.vk.core.compose.component.datetime.b a = nVar.a.a();
                    kf7 kf7Var = a.d;
                    j9x it = ((kf7Var == null || !a.a) ? k9x.e : swe0.q(0, kf7Var.e() + kf7Var.a)).iterator();
                    zhf0 zhf0Var = null;
                    while (it.d) {
                        zhf0 b = ljo0Var.b(it.nextInt());
                        if (zhf0Var != null) {
                            b = new zhf0(Math.min(zhf0Var.a, b.a), Math.min(zhf0Var.b, b.b), Math.max(zhf0Var.c, b.c), Math.max(zhf0Var.d, b.d));
                        }
                        zhf0Var = b;
                    }
                    if (zhf0Var != null) {
                        return zhf0Var;
                    }
                }
                return zhf0.e;
        }
    }
}
