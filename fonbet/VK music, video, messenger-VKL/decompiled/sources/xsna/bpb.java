package xsna;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.vk.im.chat.clips.decoration.impl.presentation.bottom.screen.reply.ChatClipsReplyFragment;

/* compiled from: ChatClipsReplyFragment.kt */
/* loaded from: classes2.dex */
public final class bpb implements obs {
    public final /* synthetic */ oob b;
    public final /* synthetic */ ChatClipsReplyFragment c;

    public bpb(oob oobVar, ChatClipsReplyFragment chatClipsReplyFragment) {
        this.b = oobVar;
        this.c = chatClipsReplyFragment;
    }

    @Override // xsna.obs
    public final void onDestroy() {
        this.c.D.d(this);
    }

    @Override // xsna.obs
    public final void onDestroyView() {
        this.b.L();
    }

    @Override // xsna.obs
    public final void onPause() {
        this.b.onPause();
    }

    @Override // xsna.obs
    public final void onResume() {
        this.b.onResume();
    }

    @Override // xsna.obs
    public final void onStop() {
        this.b.onStop();
    }

    @Override // xsna.obs
    public final void b() {
    }

    @Override // xsna.obs
    public final void c() {
    }

    @Override // xsna.obs
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // xsna.obs
    public final void onCreate(Bundle bundle) {
    }

    @Override // xsna.obs
    public final void onActivityResult(int i, int i2, Intent intent) {
    }
}
