package xsna;

import android.content.Context;
import android.content.Intent;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vkontakte.android.R;

/* compiled from: VkImSharingBridge.kt */
/* loaded from: classes7.dex */
public final class m0v0 implements adw {
    public static final m0v0 a = new m0v0();

    @Override // xsna.adw
    public final void a(Context context, Attach attach, Peer peer) {
        kbj0.e(nr4.b(), context, wdw.b(attach, null, false, 6), false, null, false, peer, 28);
    }

    public final void c(Context context, String str) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        Intent createChooser = Intent.createChooser(intent, context.getString(R.string.share));
        createChooser.addFlags(268435456);
        context.startActivity(createChooser);
    }
}
