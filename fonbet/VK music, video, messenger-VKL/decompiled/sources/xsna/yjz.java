package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class yjz implements gzs {
    public final /* synthetic */ Ref$ObjectRef b;
    public final /* synthetic */ VideoFile c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ wv2 e;
    public final /* synthetic */ gcp0 f;

    public /* synthetic */ yjz(Ref$ObjectRef ref$ObjectRef, VideoFile videoFile, boolean z, wv2 wv2Var, gcp0 gcp0Var) {
        this.b = ref$ObjectRef;
        this.c = videoFile;
        this.d = z;
        this.e = wv2Var;
        this.f = gcp0Var;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [T, xsna.iq9] */
    @Override // xsna.gzs
    public final Object invoke() {
        d2y d2yVar = new d2y(this.f, 2);
        VideoFile videoFile = this.c;
        UserId I0 = videoFile.I0();
        int o0 = videoFile.o0();
        boolean z = this.d;
        this.b.element = new iq9(rsg0.D0(new r6z(o0, I0, z)).subscribe(new m40(new dkz(videoFile, z, d2yVar, this.e), 23)));
        return s3q0.a;
    }
}
