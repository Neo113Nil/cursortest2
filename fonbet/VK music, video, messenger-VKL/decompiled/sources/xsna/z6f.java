package xsna;

import android.util.Size;
import com.vk.clips.design.view.templates.ClipsTemplateEditorCropperView;
import com.vk.clips.editor.templates.impl.domain.ClipsTemplateEditorVideoItem;
import java.util.Collections;

/* compiled from: ClipsTemplateEditorCropperPresenter.kt */
/* loaded from: classes16.dex */
public final class z6f implements r6f {
    public final ClipsTemplateEditorCropperView a;
    public final io.reactivex.rxjava3.disposables.b b = new io.reactivex.rxjava3.disposables.b();
    public a7f c;
    public p6f d;

    public z6f(ClipsTemplateEditorCropperView clipsTemplateEditorCropperView) {
        this.a = clipsTemplateEditorCropperView;
    }

    @Override // xsna.r6f
    public final f6f a() {
        p6f p6fVar = this.d;
        if (p6fVar != null) {
            return p6fVar.a();
        }
        return null;
    }

    @Override // xsna.r6f
    public final z8d b() {
        p6f p6fVar = this.d;
        if (p6fVar != null) {
            return p6fVar.b();
        }
        return null;
    }

    @Override // xsna.r6f
    public final void c(n7f n7fVar) {
        a7f a7fVar = this.c;
        if (a7fVar == null) {
            return;
        }
        this.c = a7f.a(a7fVar, rdi.I(a7fVar.c, n7fVar, a7fVar.b), 0, 5);
    }

    public final void d(n7f n7fVar) {
        r8f videoView;
        p6f p6fVar;
        i9f d;
        z8d b;
        p6f p6fVar2 = this.d;
        if (p6fVar2 == null || (videoView = p6fVar2.getVideoView()) == null) {
            return;
        }
        ClipsTemplateEditorVideoItem clipsTemplateEditorVideoItem = n7fVar.c;
        if (clipsTemplateEditorVideoItem != null) {
            long j = clipsTemplateEditorVideoItem.f;
            long j2 = n7fVar.b.b;
            p6f p6fVar3 = this.d;
            if (p6fVar3 != null && (b = p6fVar3.b()) != null) {
                b.e = j2 - j;
            }
            videoView.c(j);
            videoView.d(clipsTemplateEditorVideoItem.g);
            videoView.b(j, Collections.singletonList(yds0.a(clipsTemplateEditorVideoItem.d(), null, clipsTemplateEditorVideoItem.e, 927)));
        }
        ClipsTemplateEditorVideoItem clipsTemplateEditorVideoItem2 = n7fVar.c;
        if (clipsTemplateEditorVideoItem2 == null || (p6fVar = this.d) == null || (d = p6fVar.d()) == null) {
            return;
        }
        d.a(new Size(clipsTemplateEditorVideoItem2.c, clipsTemplateEditorVideoItem2.d), clipsTemplateEditorVideoItem2.j);
    }

    @Override // xsna.r6f
    public final r8f getVideoView() {
        p6f p6fVar = this.d;
        if (p6fVar != null) {
            return p6fVar.getVideoView();
        }
        return null;
    }
}
