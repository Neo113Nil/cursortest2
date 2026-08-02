package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.vk.bridges.di.BridgeComponent;
import com.vk.media.qrcode.QRCodeGenerate;
import com.vkontakte.android.R;
import java.util.concurrent.Callable;
import ru.ok.android.webrtc.PeerConnectionClient;
import ru.ok.android.webrtc.SharedPeerConnectionFactory;
import xsna.e3m;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class bt90 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bt90(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        Bitmap bitmap;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return PeerConnectionClient.a((SharedPeerConnectionFactory) obj);
            default:
                c2x0 c2x0Var = (c2x0) obj;
                int i2 = c2x0.o1;
                Bundle arguments = c2x0Var.getArguments();
                if (arguments == null || (str = arguments.getString("key_join_link")) == null) {
                    str = "";
                }
                boolean b = QRCodeGenerate.b();
                if (str.length() == 0 || !b) {
                    throw new IllegalArgumentException("JoinLink=" + str + " ; QRCodeGenerate.isSupported=" + b);
                }
                int i3 = o25.b(((BridgeComponent) m7m.d(c2x0Var).a(fpf0.a(BridgeComponent.class))).s()) ? R.drawable.vk_icon_logo_sferum_color_16 : R.drawable.vk_icon_new_logo_vk_color_28;
                Context requireContext = c2x0Var.requireContext();
                e3m.a aVar = e3m.a;
                Drawable a = m33.a(i3, requireContext);
                if (a != null) {
                    int i4 = c2x0.o1;
                    bitmap = xjo.b(a, i4, i4, 4);
                } else {
                    bitmap = null;
                }
                return QRCodeGenerate.a(c2x0Var.requireContext(), str, 256, bitmap, false);
        }
    }
}
