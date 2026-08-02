package xsna;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.vk.music.attach.AttachMusicActivity;
import xsna.bcw0;

/* compiled from: AttachMusicActivity.java */
/* loaded from: classes3.dex */
public final class q24 extends bcw0 {
    public final /* synthetic */ AttachMusicActivity a;

    public q24(AttachMusicActivity attachMusicActivity) {
        this.a = attachMusicActivity;
    }

    @Override // xsna.bcw0
    public final void a(@Nullable bcw0.a aVar) {
        AttachMusicActivity attachMusicActivity = this.a;
        attachMusicActivity.w.dispose();
        String str = aVar.a;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        attachMusicActivity.W1().En(str);
    }
}
