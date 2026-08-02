package xsna;

import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;

/* compiled from: AudioSnippetRepositoryImpl.kt */
/* loaded from: classes3.dex */
public final class wx4 implements pjw {
    public final Object b;

    public void a(com.vk.profile.core.scheduled_clips.g gVar) {
        ((f4z) this.b).b(gVar);
    }

    @Override // xsna.pjw
    public String f(int i) {
        ImageList imageList;
        Image Bb;
        cn cnVar = (cn) this.b;
        if (i <= 0) {
            if (cnVar != null) {
                return cnVar.c;
            }
            return null;
        }
        if (cnVar == null || (imageList = cnVar.i) == null || (Bb = imageList.Bb(i, i)) == null) {
            return null;
        }
        return Bb.d;
    }

    public wx4(int i) {
        switch (i) {
            case 3:
                this.b = new ne6();
                break;
            default:
                this.b = new f4z();
                break;
        }
    }
}
