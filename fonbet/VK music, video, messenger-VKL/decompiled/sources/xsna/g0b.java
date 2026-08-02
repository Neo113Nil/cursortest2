package xsna;

import android.net.Uri;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import xsna.ij20;

/* compiled from: ChannelImageUploader.kt */
/* loaded from: classes2.dex */
public final class g0b extends yjt<AttachImage, wni0, w8r, x0h0> {
    public final UserId k;
    public final aha0 l;
    public final Uri m;
    public final gzs<f8r> n;

    public g0b(w2w w2wVar, AttachImage attachImage, UserId userId) {
        super(w2wVar, attachImage);
        this.k = userId;
        this.l = new aha0();
        this.m = Uri.parse(((AttachImage) this.c).r.Ab().d);
        this.n = w2wVar.getConfig().a.k;
    }

    @Override // xsna.odq0
    public final boolean c(Attach attach) {
        return attach instanceof AttachImage;
    }

    @Override // xsna.yjt
    public final Uri d() {
        f8r invoke = this.n.invoke();
        w2w w2wVar = this.b;
        return invoke.a(w2wVar.getContext(), this.m, w2wVar.a1().c("jpg"), this);
    }

    @Override // xsna.yjt
    public final Uri f() {
        return this.m;
    }

    @Override // xsna.yjt
    public final wni0 h() {
        ij20.a o = bz2.o(this.l.d(this.k, Boolean.TRUE), bz2.m());
        o.i = true;
        return (wni0) bz2.f(new ij20(o), xni0.b);
    }

    @Override // xsna.yjt
    public final x0h0 j(w8r w8rVar) {
        w8r w8rVar2 = w8rVar;
        if (w8rVar2.a.length() == 0) {
            throw new VKApiExecutionException(1, "upload.php", false, "Photo data is empty!", null, null, null, null, 0, null, null, null, 4080);
        }
        ij20.a o = bz2.o(zga0.k(this.l, w8rVar2.a, null, null, null, null, Boolean.TRUE, 510), bz2.m());
        o.i = true;
        o.g = 3;
        return (x0h0) bz2.f(new ij20(o), y0h0.b);
    }

    @Override // xsna.yjt
    public final boolean l() {
        return this.n.invoke().b(this.b.getContext(), this.m);
    }

    @Override // xsna.yjt
    public final Attach n(x0h0 x0h0Var) {
        x0h0 x0h0Var2 = x0h0Var;
        AttachImage attachImage = (AttachImage) this.c;
        attachImage.getClass();
        AttachImage attachImage2 = new AttachImage(attachImage);
        attachImage2.e = x0h0Var2.a;
        attachImage2.t = x0h0Var2.d;
        attachImage2.o = x0h0Var2.b;
        ImageList imageList = x0h0Var2.c;
        attachImage2.q = imageList;
        Image Ab = imageList.Ab();
        if (Ab != null) {
            fxj0 fxj0Var = (fxj0) j5g.X(attachImage2.r);
            if (fxj0Var.getHeight() <= 0 || fxj0Var.getWidth() <= 0) {
                Serializer.c<ImageList> cVar = ImageList.CREATOR;
                attachImage2.r = new ImageList(ImageList.a.c(Ab.b, Ab.c, fxj0Var.getUrl()));
            }
        }
        return attachImage2;
    }

    @Override // xsna.yjt
    public final Object o(Uri uri, Object obj) {
        Object e;
        u6 u6Var = new u6(5, this, uri);
        x8r x8rVar = x8r.b;
        ocq0 ocq0Var = ((wni0) obj).a;
        String str = ocq0Var.a;
        try {
            e = bz2.e((akv) u6Var.invoke(str), this, x8rVar);
        } catch (Exception e2) {
            String str2 = ocq0Var.b;
            if (str2 == null || str2.equals(str)) {
                throw e2;
            }
            e = bz2.e((akv) u6Var.invoke(str2), this, x8rVar);
        }
        return (w8r) e;
    }
}
