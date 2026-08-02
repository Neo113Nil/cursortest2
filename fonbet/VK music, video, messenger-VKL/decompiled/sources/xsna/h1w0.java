package xsna;

import android.content.Context;
import android.content.Intent;
import com.vk.voip.VoipCallActivity;
import xsna.w2x0;

/* compiled from: VkVoipUiLauncher.kt */
/* loaded from: classes7.dex */
public final class h1w0 implements w2x0 {
    public final Context a;

    public h1w0(Context context) {
        this.a = context;
    }

    @Override // xsna.w2x0
    public final void b(w2x0.a aVar) {
        int i = VoipCallActivity.P;
        boolean z = aVar.a;
        Context context = this.a;
        Intent intent = new Intent(context, (Class<?>) VoipCallActivity.class);
        intent.setFlags(268435456);
        intent.putExtra("extra_open_participants_screen_on_start", z);
        context.startActivity(intent);
    }

    @Override // xsna.w2x0
    public final Intent c() {
        int i = VoipCallActivity.P;
        Intent intent = new Intent(this.a, (Class<?>) VoipCallActivity.class);
        intent.setFlags(268435456);
        intent.putExtra("extra_open_participants_screen_on_start", false);
        return intent;
    }
}
