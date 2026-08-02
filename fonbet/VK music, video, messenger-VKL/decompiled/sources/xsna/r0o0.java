package xsna;

import android.content.Context;
import android.graphics.PointF;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.AttachmentWithMedia;
import com.vk.dto.photo.Photo;
import com.vk.dto.tags.Tag;
import xsna.z8u0;

/* compiled from: TaggedGoodsController.kt */
/* loaded from: classes18.dex */
public interface r0o0 {

    /* compiled from: TaggedGoodsController.kt */
    public interface a {
        void a(Context context, String str, String str2, LaunchContext launchContext);
    }

    void a(Photo photo, PointF pointF);

    void b(a aVar);

    void c(z8u0.d dVar);

    void d(Photo photo, int i, vql0 vql0Var);

    void e(Tag tag, AttachmentWithMedia attachmentWithMedia);

    void f();

    void g(z8u0.f fVar);

    void h(d390 d390Var);

    void i(Photo photo, Tag tag);

    void onDismiss();
}
