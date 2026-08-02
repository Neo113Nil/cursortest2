package xsna;

import android.app.Activity;
import android.content.DialogInterface;
import com.vk.gallerypicker.configuration.SpoilerConfiguration;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import java.io.File;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.t4p;

/* compiled from: PhotoEditorDelegate.kt */
/* loaded from: classes4.dex */
public final class i6a0 {
    public final PostingFragment a;
    public final gd40 b;
    public final g760 c;
    public com.vk.core.simplescreen.a d;
    public s4p e;
    public MediaStoreEntry f;
    public final g6a0 g = new g6a0(this);

    public i6a0(PostingFragment postingFragment, gd40 gd40Var, g760 g760Var) {
        this.a = postingFragment;
        this.b = gd40Var;
        this.c = g760Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(File file, Activity activity, izs<? super Boolean, s3q0> izsVar) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = izsVar;
        this.e = this.c.c(file, new a(), this.g, this.d, "", new mw0((byte) 0, 6), new SpoilerConfiguration(false, false, false, false, false, null, 63, null));
        com.vk.core.simplescreen.a aVar = this.d;
        if (aVar == null) {
            aVar = new com.vk.core.simplescreen.a(activity, false, true);
            this.d = aVar;
            aVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: xsna.f6a0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    i6a0.this.e = null;
                }
            });
        }
        s4p s4pVar = this.e;
        if (s4pVar != null) {
            this.c.a(activity, s4pVar, aVar, new p5(19, this, ref$ObjectRef));
        }
    }

    /* compiled from: PhotoEditorDelegate.kt */
    public static final class a implements t4p {
        @Override // xsna.t4p
        public final boolean b() {
            return false;
        }

        @Override // xsna.t4p
        public final void a(t4p.a aVar) {
        }
    }
}
