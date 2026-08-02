package xsna;

import android.net.Uri;
import com.ironsource.X3;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachDoc;
import com.vk.dto.attaches.VideoPreview;
import com.vk.dto.common.Peer;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import java.util.ArrayList;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.akv;
import xsna.ij20;

/* compiled from: DocUploader.kt */
/* loaded from: classes2.dex */
public final class rtn extends yjt<AttachDoc, ocq0, String, ktn> {
    public static final /* synthetic */ int l = 0;
    public final ckq<String> k;

    /* compiled from: DocUploader.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<String, akv> {
        @Override // xsna.izs
        public final akv invoke(String str) {
            rtn rtnVar = (rtn) this.receiver;
            int i = rtn.l;
            Uri f = rtnVar.f();
            Uri.Builder a = er.a(X3.i.b);
            w2w w2wVar = rtnVar.b;
            Uri f2 = oeq0.f(f, a.path(r9r.b(w2wVar.getContext(), f)).build());
            akv.a aVar = new akv.a();
            aVar.a = str;
            aVar.c(f2, X3.i.b, ((AttachDoc) rtnVar.c).g);
            aVar.f = true;
            aVar.e = w2wVar.getConfig().v;
            aVar.d = 5;
            return new akv(aVar);
        }
    }

    public rtn(w2w w2wVar, AttachDoc attachDoc) {
        super(w2wVar, attachDoc);
        this.k = new ckq<>(new a(1, this, rtn.class, "buildFileUploadCall", "buildFileUploadCall(Ljava/lang/String;)Lcom/vk/api/internal/HttpPostCall;", 0), ptn.b);
    }

    @Override // xsna.odq0
    public final boolean c(Attach attach) {
        return attach instanceof AttachDoc;
    }

    @Override // xsna.yjt
    public final Uri d() {
        throw new NotImplementedError();
    }

    @Override // xsna.yjt
    public final Uri f() {
        return Uri.parse(((AttachDoc) this.c).r);
    }

    @Override // xsna.yjt
    public final ocq0 h() {
        ij20.a aVar = new ij20.a();
        aVar.d = bz2.m();
        aVar.c = "docs.getUploadServer";
        w2w w2wVar = this.b;
        Peer Q0 = w2wVar.Q0();
        Q0.getClass();
        if (Q0.Ab(Peer.Type.GROUP)) {
            aVar.f.put("group_id", Long.valueOf(w2wVar.Q0().d).toString());
        }
        aVar.i = true;
        return (ocq0) bz2.f(new ij20(aVar), qtn.b);
    }

    @Override // xsna.yjt
    public final ktn j(String str) {
        ij20.a aVar = new ij20.a();
        aVar.d = bz2.m();
        aVar.c = "docs.save";
        aVar.b(X3.i.b, str);
        aVar.b("title", ((AttachDoc) this.c).g);
        aVar.i = true;
        aVar.g = 3;
        return (ktn) bz2.f(new ij20(aVar), ltn.b);
    }

    @Override // xsna.yjt
    public final boolean l() {
        return false;
    }

    @Override // xsna.yjt
    public final Attach n(ktn ktnVar) {
        String str;
        fxj0 fxj0Var;
        ktn ktnVar2 = ktnVar;
        AttachDoc attachDoc = (AttachDoc) this.c;
        attachDoc.getClass();
        AttachDoc attachDoc2 = new AttachDoc(attachDoc);
        attachDoc2.e = ktnVar2.a;
        attachDoc2.k = ktnVar2.b;
        VideoPreview videoPreview = (VideoPreview) j5g.a0(ktnVar2.d);
        if (videoPreview == null || (str = videoPreview.e) == null) {
            str = "";
        }
        attachDoc2.l = str;
        attachDoc2.n = new ImageList(new ArrayList(ktnVar2.c));
        attachDoc2.o = new ArrayList(ktnVar2.d);
        Image Ab = attachDoc2.n.Ab();
        if (Ab != null && (fxj0Var = (fxj0) j5g.Z(attachDoc2.p)) != null && (fxj0Var.getHeight() <= 0 || fxj0Var.getWidth() <= 0)) {
            Serializer.c<ImageList> cVar = ImageList.CREATOR;
            attachDoc2.p = new ImageList(ImageList.a.c(Ab.b, Ab.c, fxj0Var.getUrl()));
        }
        return attachDoc2;
    }

    @Override // xsna.yjt
    public final Object o(Uri uri, Object obj) {
        return this.k.a((ocq0) obj, this);
    }
}
