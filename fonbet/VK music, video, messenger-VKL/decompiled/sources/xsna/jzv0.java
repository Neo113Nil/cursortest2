package xsna;

import android.app.Activity;
import android.net.Uri;
import com.vk.dto.video.VideoAlbum;
import com.vk.libvideo.upload.api.VideoPublicationContext;
import com.vk.video.ui.upload.api.router.PublishArguments;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class jzv0 implements izs {
    public final /* synthetic */ kzv0 b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ Uri d;
    public final /* synthetic */ VideoPublicationContext e;

    public /* synthetic */ jzv0(kzv0 kzv0Var, Activity activity, Uri uri, VideoPublicationContext videoPublicationContext) {
        this.b = kzv0Var;
        this.c = activity;
        this.d = uri;
        this.e = videoPublicationContext;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ((jcq0) this.b.r.getValue()).a(xa4.L(this.c), new PublishArguments.Upload(this.d, this.e, (VideoAlbum) obj));
        return s3q0.a;
    }
}
