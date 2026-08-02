package xsna;

import android.net.Uri;
import com.vk.camera.editor.common.text.views.CreateStoryEditText;
import com.vk.richcontent.api.MimeType;
import java.util.HashSet;
import kotlin.NoWhenBranchMatchedException;
import xsna.wjg0;
import xsna.zgv0;

/* compiled from: ImageClipboardBufferInteractorImpl.kt */
/* loaded from: classes16.dex */
public final class jhw implements hhw {
    public ylo0 a;

    @Override // xsna.hhw
    public final void a(CreateStoryEditText createStoryEditText, final irc0 irc0Var, final hb40 hb40Var) {
        bpn0 bpn0Var = zgv0.a.a;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        cra a = ((zgv0) bpn0Var.getValue()).a();
        HashSet hashSet = (HashSet) a.b;
        hashSet.add(MimeType.IMAGE);
        hashSet.add(MimeType.TEXT);
        ((HashSet) a.c).add(new xjg0() { // from class: xsna.ihw
            @Override // xsna.xjg0
            public final void a(wjg0 wjg0Var) {
                ylo0 ylo0Var = jhw.this.a;
                if (wjg0Var instanceof wjg0.a) {
                    wjg0.a aVar = (wjg0.a) wjg0Var;
                    Uri uri = aVar.b;
                    if (ylo0Var != null) {
                        ylo0Var.a(uri);
                    }
                    irc0Var.invoke();
                    aVar.a();
                    return;
                }
                if (!(wjg0Var instanceof wjg0.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                wjg0.b bVar = (wjg0.b) wjg0Var;
                if (ylo0Var != null) {
                    ylo0Var.b();
                }
                hb40Var.invoke(bVar.a);
            }
        });
        a.a(createStoryEditText);
    }

    @Override // xsna.hhw
    public final void b(ylo0 ylo0Var) {
        this.a = ylo0Var;
    }
}
