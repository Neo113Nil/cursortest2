package xsna;

import android.net.Uri;
import com.ironsource.X3;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachAudio;
import com.vk.dto.attaches.AttachGraffiti;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import java.util.ArrayList;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.akv;
import xsna.ij20;

/* compiled from: GraffitiUploader.kt */
/* loaded from: classes2.dex */
public final class ddu extends yjt<AttachGraffiti, ocq0, String, zcu> {
    public static final /* synthetic */ int l = 0;
    public final ckq<String> k;

    /* compiled from: GraffitiUploader.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<String, akv> {
        @Override // xsna.izs
        public final akv invoke(String str) {
            ddu dduVar = (ddu) this.receiver;
            int i = ddu.l;
            dduVar.getClass();
            akv.a aVar = new akv.a();
            aVar.a = str;
            aVar.b(dduVar.f());
            aVar.f = true;
            aVar.e = dduVar.b.getConfig().v;
            aVar.d = 5;
            return new akv(aVar);
        }
    }

    public ddu(w2w w2wVar, AttachGraffiti attachGraffiti) {
        super(w2wVar, attachGraffiti);
        this.k = new ckq<>(new a(1, this, ddu.class, "buildFileUploadCall", "buildFileUploadCall(Ljava/lang/String;)Lcom/vk/api/internal/HttpPostCall;", 0), ptn.b);
    }

    @Override // xsna.odq0
    public final boolean c(Attach attach) {
        return attach instanceof AttachAudio;
    }

    @Override // xsna.yjt
    public final Uri d() {
        throw new NotImplementedError();
    }

    @Override // xsna.yjt
    public final Uri f() {
        return Uri.parse(((AttachGraffiti) this.c).g.Ab().d);
    }

    @Override // xsna.yjt
    public final ocq0 h() {
        ij20.a aVar = new ij20.a();
        aVar.d = bz2.m();
        aVar.c = "docs.getUploadServer";
        aVar.b("type", "graffiti");
        aVar.i = true;
        return (ocq0) bz2.f(new ij20(aVar), qtn.b);
    }

    @Override // xsna.yjt
    public final zcu j(String str) {
        ij20.a aVar = new ij20.a();
        aVar.d = bz2.m();
        aVar.c = "docs.save";
        aVar.b(X3.i.b, str);
        aVar.i = true;
        aVar.g = 3;
        return (zcu) bz2.f(new ij20(aVar), adu.b);
    }

    @Override // xsna.yjt
    public final boolean l() {
        return false;
    }

    @Override // xsna.yjt
    public final Attach n(zcu zcuVar) {
        zcu zcuVar2 = zcuVar;
        AttachGraffiti attachGraffiti = (AttachGraffiti) this.c;
        attachGraffiti.getClass();
        AttachGraffiti attachGraffiti2 = new AttachGraffiti(attachGraffiti);
        attachGraffiti2.e = zcuVar2.a;
        ImageList imageList = new ImageList(new ArrayList(zcuVar2.b));
        attachGraffiti2.f = imageList;
        attachGraffiti2.h = zcuVar2.c;
        Image Ab = imageList.Ab();
        if (Ab != null) {
            fxj0 fxj0Var = (fxj0) j5g.X(attachGraffiti2.g);
            if (fxj0Var.getHeight() <= 0 || fxj0Var.getWidth() <= 0) {
                Serializer.c<ImageList> cVar = ImageList.CREATOR;
                attachGraffiti2.g = new ImageList(ImageList.a.c(Ab.b, Ab.c, fxj0Var.getUrl()));
            }
        }
        return attachGraffiti2;
    }

    @Override // xsna.yjt
    public final Object o(Uri uri, Object obj) {
        return this.k.a((ocq0) obj, this);
    }
}
