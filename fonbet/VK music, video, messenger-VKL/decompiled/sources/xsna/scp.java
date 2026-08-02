package xsna;

import android.content.Context;
import com.vk.log.L;
import java.io.File;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class scp implements Runnable {
    public final /* synthetic */ int b;

    public /* synthetic */ scp(int i) {
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                StringBuilder sb = new StringBuilder();
                Context context = ucp.p;
                if (context == null) {
                    context = null;
                }
                sb.append(context.getFilesDir().getAbsolutePath());
                sb.append("/emoji_sprites_assets");
                nbr.l(new File(sb.toString()));
                L.e("Emoji", "removed all downloaded emoji sprites - in order to reload them");
                break;
            default:
                e1j0.a.b();
                break;
        }
    }
}
