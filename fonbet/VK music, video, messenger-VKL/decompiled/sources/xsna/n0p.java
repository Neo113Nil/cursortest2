package xsna;

import androidx.media3.transformer.ExportException;
import androidx.media3.transformer.a0;
import com.vk.dto.music.Playlist;
import xsna.i0p;
import xsna.ihz;
import xsna.tq70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class n0p implements tq70.b, ihz.a, yads.ng1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n0p(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.tq70.b
    public void accept(Object obj) {
        ((i0p.a) obj).o((com.vk.music.fragment.impl.model.a) this.c, (Playlist) this.d);
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        switch (this.b) {
            case 1:
                androidx.media3.transformer.a0 a0Var = (androidx.media3.transformer.a0) this.c;
                ExportException exportException = (ExportException) this.d;
                a0Var.w.getClass();
                ((a0.c) obj).a(exportException);
                break;
            default:
                ((yads.af) obj).getClass();
                break;
        }
    }

    public /* synthetic */ n0p(androidx.media3.transformer.a0 a0Var, androidx.media3.transformer.t tVar, ExportException exportException) {
        this.b = 1;
        this.c = a0Var;
        this.d = exportException;
    }
}
