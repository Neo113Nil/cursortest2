package xsna;

import android.graphics.Bitmap;
import com.vk.clips.editor.templates.impl.domain.ClipsTemplateEditorVideoItem;
import com.vk.dto.polls.PhotoPoll;
import com.vk.dto.polls.PollBackground;
import java.util.List;
import xsna.y7f;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class dk9 implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ dk9(PhotoPoll photoPoll, int i, r8m0 r8m0Var, q8m0 q8m0Var) {
        this.d = photoPoll;
        this.c = i;
        this.e = r8m0Var;
        this.f = q8m0Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                PollBackground pollBackground = (PollBackground) this.d;
                r8m0 r8m0Var = (r8m0) this.e;
                q8m0 q8m0Var = (q8m0) this.f;
                Bitmap bitmap = (Bitmap) obj;
                PhotoPoll photoPoll = (PhotoPoll) pollBackground;
                photoPoll.f = bitmap;
                int i = this.c;
                photoPoll.g = Bitmap.createScaledBitmap(bitmap, i, an10.b((i / bitmap.getWidth()) * bitmap.getHeight()), false);
                r8m0Var.h = q8m0Var;
                r8m0Var.p();
                break;
            default:
                i8f i8fVar = (i8f) this.d;
                n7f n7fVar = (n7f) this.e;
                a7f a7fVar = (a7f) this.f;
                i8fVar.getClass();
                y7f.h hVar = i8fVar.c;
                ClipsTemplateEditorVideoItem clipsTemplateEditorVideoItem = (ClipsTemplateEditorVideoItem) j5g.a0((List) obj);
                if (clipsTemplateEditorVideoItem != null) {
                    n7f a = n7f.a(n7fVar, clipsTemplateEditorVideoItem, null, null, 3);
                    y7f.this.a.Jl(a7f.a(a7fVar, rdi.I(this.c, a, a7fVar.b), 0, 5));
                    y7f.this.a.B4(a);
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ dk9(i8f i8fVar, n7f n7fVar, a7f a7fVar, int i) {
        this.d = i8fVar;
        this.e = n7fVar;
        this.f = a7fVar;
        this.c = i;
    }
}
