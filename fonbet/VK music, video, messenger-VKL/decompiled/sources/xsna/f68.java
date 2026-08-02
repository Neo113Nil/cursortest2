package xsna;

import com.vk.dto.common.AttachmentWithMedia;
import com.vk.dto.music.Playlist;
import com.vk.dto.photo.Photo;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.List;
import xsna.m68.b;
import xsna.m7a0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class f68 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f68(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                m68 m68Var = (m68) this.c;
                Photo photo = (Photo) this.d;
                if (m68Var.f(photo)) {
                    AttachmentWithMedia attachmentWithMedia = m68Var.G;
                    m68Var.c(photo, m68Var.new b(((PhotoAttachment) attachmentWithMedia).l, m68Var.b));
                    break;
                }
                break;
            case 1:
                gzs gzsVar = (gzs) this.c;
                ubb ubbVar = (ubb) this.d;
                gzsVar.invoke();
                gzs<s3q0> gzsVar2 = ubbVar.n;
                if (gzsVar2 != null) {
                    gzsVar2.invoke();
                    break;
                }
                break;
            case 2:
                vh40 vh40Var = (vh40) this.c;
                vh40Var.c.a((Playlist) this.d);
                break;
            default:
                o8a0 o8a0Var = (o8a0) this.c;
                o8a0Var.h.b((List) this.d);
                o8a0Var.g.a(m7a0.c.a.a);
                break;
        }
    }
}
