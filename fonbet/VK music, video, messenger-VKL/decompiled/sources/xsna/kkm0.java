package xsna;

import android.net.Uri;
import com.vk.dto.attaches.Attach;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.im.engine.models.attaches.AttachStory;
import com.vk.im.engine.models.camera.UploadParams;
import xsna.ij20;

/* compiled from: StoryVideoUploader.kt */
/* loaded from: classes2.dex */
public final class kkm0 extends yjt<AttachStory, ocq0, String, fcm0> {
    @Override // xsna.odq0
    public final boolean c(Attach attach) {
        return (attach instanceof AttachStory) && ((AttachStory) attach).i == null;
    }

    @Override // xsna.yjt
    public final Uri d() {
        bb3 bb3Var = this.b.getConfig().a.m;
        return new tdw().a(((AttachStory) this.c).h, this);
    }

    @Override // xsna.yjt
    public final Uri f() {
        return Uri.fromFile(((AttachStory) this.c).i1());
    }

    @Override // xsna.yjt
    public final ocq0 h() {
        AttachStory attachStory = (AttachStory) this.c;
        UploadParams uploadParams = attachStory.g;
        ij20.a aVar = new ij20.a();
        aVar.d = bz2.m();
        aVar.c = "stories.getVideoUploadServer";
        aVar.j("is_one_time", attachStory.b.i0);
        aVar.i = true;
        x7m0.a(uploadParams.b, uploadParams.c, uploadParams.d, false, new wmg(aVar, 6));
        return (ocq0) bz2.f(new ij20(aVar), jkm0.b);
    }

    @Override // xsna.yjt
    public final fcm0 j(String str) {
        ij20.a aVar = new ij20.a();
        aVar.d = bz2.m();
        aVar.c = "stories.save";
        aVar.b("upload_results", str);
        aVar.i = true;
        return (fcm0) bz2.f(new ij20(aVar), gcm0.b);
    }

    @Override // xsna.yjt
    public final boolean l() {
        return true;
    }

    @Override // xsna.yjt
    public final Attach n(fcm0 fcm0Var) {
        fcm0 fcm0Var2 = fcm0Var;
        T t = this.c;
        StoryEntry storyEntry = ((AttachStory) t).b;
        storyEntry.c = fcm0Var2.a;
        storyEntry.d = fcm0Var2.b;
        storyEntry.o = fcm0Var2.c;
        return t;
    }

    @Override // xsna.yjt
    public final Object o(Uri uri, Object obj) {
        Object e;
        ocq0 ocq0Var = (ocq0) obj;
        ozk0 ozk0Var = new ozk0(2, this, uri);
        dkm0 dkm0Var = dkm0.b;
        String str = ocq0Var.a;
        try {
            e = bz2.e((akv) ozk0Var.invoke(str), this, dkm0Var);
        } catch (Exception e2) {
            String str2 = ocq0Var.b;
            if (str2 == null || str2.equals(str)) {
                throw e2;
            }
            e = bz2.e((akv) ozk0Var.invoke(str2), this, dkm0Var);
        }
        return (String) e;
    }
}
