package xsna;

import com.vk.dto.common.VideoFile;

/* compiled from: AboutVideoPresenter.kt */
/* loaded from: classes2.dex */
public final class e9 {
    public final VideoFile a;
    public final yks0 b;
    public final t8 c;
    public final io.reactivex.rxjava3.disposables.b d;

    public e9(VideoFile videoFile, yks0 yks0Var, vit0 vit0Var, ezs0 ezs0Var, boolean z) {
        this.a = videoFile;
        this.b = yks0Var;
        this.c = new t8(vit0Var, ezs0Var, null);
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.d = bVar;
        bVar.b(o25.a().m(true).subscribe(new v8(new u8(this, 0), 0)));
        bVar.b(vit0Var.f(videoFile.I0()).subscribe(new x8(new w8(this, 0), 0)));
    }
}
