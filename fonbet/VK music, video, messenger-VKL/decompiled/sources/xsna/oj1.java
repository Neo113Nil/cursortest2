package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.posting.presentation.album.a;
import com.vk.posting.presentation.album.c;
import com.vkontakte.android.attachments.AlbumAttachment;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.tj1;

/* compiled from: AlbumPickerFeature.kt */
/* loaded from: classes18.dex */
public final class oj1 extends wk50<ek1, ak1, com.vk.posting.presentation.album.a, tj1> {
    public final UserId f;
    public final yj1 g;
    public final wf90 h;
    public final tfa0 i;
    public final am50 j;
    public final f4z k;
    public final nj1 l;

    public oj1(xj1 xj1Var, UserId userId, yj1 yj1Var, wf90 wf90Var, tfa0 tfa0Var, djl djlVar) {
        super(a.e.b, xj1Var);
        this.f = userId;
        this.g = yj1Var;
        this.h = wf90Var;
        this.i = tfa0Var;
        this.j = djlVar;
        this.k = new f4z();
        this.l = new nj1(this);
    }

    @Override // xsna.wk50
    public final void N(ak1 ak1Var, com.vk.posting.presentation.album.a aVar) {
        com.vk.posting.presentation.album.a aVar2 = aVar;
        if (aVar2.equals(a.e.b)) {
            return;
        }
        boolean equals = aVar2.equals(a.b.b);
        f4z f4zVar = this.k;
        wf90 wf90Var = this.h;
        if (equals) {
            wf90Var.d = this.l;
            f4zVar.b(new c.b.a(wf90Var));
            return;
        }
        boolean z = aVar2 instanceof a.C1523a;
        am50 am50Var = this.j;
        if (z) {
            PhotoAlbum photoAlbum = ((a.C1523a) aVar2).b;
            am50Var.b();
            this.i.getClass();
            Image image = photoAlbum.y;
            if (image == null) {
                image = Image.d;
            }
            Photo photo = new Photo(image);
            photo.d = photoAlbum.b;
            photo.e = photoAlbum.c;
            photo.L = photoAlbum.s;
            photo.u = photoAlbum.g;
            f4zVar.b(new c.a.C1526a(new AlbumAttachment(photo, photoAlbum.z, photoAlbum.h, photoAlbum.x), am50Var));
            return;
        }
        if (aVar2 instanceof a.c) {
            if (!((a.c) aVar2).equals(a.c.C1524a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            wf90Var.b();
        } else {
            if (!(aVar2 instanceof a.d)) {
                throw new NoWhenBranchMatchedException();
            }
            a.d dVar = (a.d) aVar2;
            if (dVar.equals(a.d.b.b)) {
                am50Var.c();
            } else {
                if (!(dVar instanceof a.d.C1525a)) {
                    throw new NoWhenBranchMatchedException();
                }
                am50Var.d();
            }
        }
    }

    @Override // xsna.wk50
    public final List<com.vk.posting.presentation.album.a> Q(ak1 ak1Var, ak1 ak1Var2, tj1 tj1Var) {
        ak1 ak1Var3 = ak1Var;
        ak1 ak1Var4 = ak1Var2;
        tj1 tj1Var2 = tj1Var;
        if (tj1Var2 instanceof tj1.a.C3748a) {
            Throwable th = ((tj1.a.C3748a) tj1Var2).b.a;
            return Collections.singletonList(new a.d.C1525a());
        }
        if (tj1Var2 instanceof tj1.a.c) {
            return Collections.singletonList(a.d.b.b);
        }
        super.Q(ak1Var3, ak1Var4, tj1Var2);
        return null;
    }
}
