package xsna;

import android.view.KeyEvent;
import com.google.android.material.tabs.TabLayout;
import com.vk.newsfeed.posting.impl.domain.model.LocalAlbum;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerState;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PostingStep1View.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class znc0 extends FunctionReferenceImpl implements izs<LocalAlbum, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(LocalAlbum localAlbum) {
        LocalAlbum localAlbum2 = localAlbum;
        enc0 enc0Var = (enc0) this.receiver;
        List<MediaPickerState.Tab> list = enc0.q0;
        enc0Var.getClass();
        TabLayout.g b = enc0Var.s.b(enc0.q0.indexOf(MediaPickerState.Tab.LocalAlbum));
        String c = enc0Var.c(localAlbum2);
        KeyEvent.Callback callback = b != null ? b.f : null;
        com.vk.core.view.components.tabs.d dVar = callback instanceof com.vk.core.view.components.tabs.d ? (com.vk.core.view.components.tabs.d) callback : null;
        if (dVar != null) {
            dVar.setText(c);
        }
        enc0Var.Y = localAlbum2;
        return s3q0.a;
    }
}
