package xsna;

import android.content.Context;
import com.vk.dto.common.Attachment;
import java.util.HashMap;
import xsna.o34;
import xsna.wjg0;

/* compiled from: UploadRichContentAdapter.kt */
/* loaded from: classes7.dex */
public final class icq0 implements xjg0 {
    public final cfz a;
    public final HashMap b = new HashMap();
    public final n9o0 c;

    public icq0(cfz cfzVar, Context context) {
        this.a = cfzVar;
        this.c = new n9o0(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.xjg0
    public final void a(wjg0 wjg0Var) {
        if (wjg0Var instanceof wjg0.a) {
            ju90<?> a2 = this.c.a((wjg0.a) wjg0Var);
            this.b.put(Integer.valueOf(a2.S()), wjg0Var);
            ((com.vk.writebar.c) this.a.c).a((Attachment) a2);
        }
    }

    /* compiled from: UploadRichContentAdapter.kt */
    public final class a implements o34.a {
        public a() {
        }

        @Override // xsna.o34.a
        public final void b(ju90<?> ju90Var) {
            HashMap hashMap = icq0.this.b;
            wjg0.a aVar = (wjg0.a) hashMap.get(Integer.valueOf(ju90Var.S()));
            if (aVar != null) {
                aVar.a();
            }
            hashMap.remove(Integer.valueOf(ju90Var.S()));
        }

        @Override // xsna.o34.a
        public final void c(ju90<?> ju90Var, Attachment attachment) {
        }

        @Override // xsna.o34.a
        public final void a(ju90<?> ju90Var, int i, int i2) {
        }
    }
}
