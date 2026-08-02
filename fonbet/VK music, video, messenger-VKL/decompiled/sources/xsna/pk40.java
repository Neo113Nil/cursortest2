package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.vk.music.fragment.impl.EditPlaylistFragment;

/* compiled from: MusicFactoryImpl.kt */
/* loaded from: classes3.dex */
public final class pk40 implements ok40 {
    @Override // xsna.ok40
    public final Intent a(Context context, long j, String str) {
        EditPlaylistFragment.a aVar = new EditPlaylistFragment.a();
        Bundle bundle = aVar.j;
        bundle.putLong("EditPlaylistFragment.arg.dialogId", j);
        bundle.putString("EditPlaylistFragment.arg.dialogTitle", str);
        return aVar.n(context);
    }
}
