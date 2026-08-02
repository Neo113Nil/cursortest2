package xsna;

import android.content.Context;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.log.L;
import xsna.y7f;

/* compiled from: ClipsTemplateEditorProcessingDelegateImpl.kt */
/* loaded from: classes16.dex */
public final class c8f extends ysi implements b8f {
    public final Context c;
    public final d9f d;
    public final a e;
    public final y7f.g f;
    public final j7f g;
    public io.reactivex.rxjava3.disposables.c h;

    /* compiled from: ClipsTemplateEditorProcessingDelegateImpl.kt */
    public interface a {
        int getLayoutHeight();

        int getLayoutWidth();
    }

    public c8f(Context context, d9f d9fVar, a aVar, y7f.g gVar, j7f j7fVar) {
        this.c = context;
        this.d = d9fVar;
        this.e = aVar;
        this.f = gVar;
        this.g = j7fVar;
    }

    @Override // xsna.b8f
    public final void Z(jhd0 jhd0Var) {
        try {
            j7(jhd0Var);
        } catch (Exception e) {
            this.d.b(true);
            h03.b(e);
            L.g("ClipsTemplateEditorProcessingDelegateImpl", e);
        }
    }

    @Override // xsna.ysi, xsna.wsi
    public final void dispose() {
        io.reactivex.rxjava3.disposables.c cVar = this.h;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    public final void j7(jhd0 jhd0Var) {
        StoryMusicInfo storyMusicInfo = jhd0Var.c;
        int i = 11;
        io.reactivex.rxjava3.internal.operators.observable.j1 U = ple.a(storyMusicInfo.c, storyMusicInfo.b.Fb()).U(new rx0(new r6(jhd0Var, 25), i)).U(new np1(new na7(9, this, jhd0Var), i));
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        this.h = cug0.a(U.r0(asu0.i()).a0(asu0Var.d()), this.c, new gtl(5), null, new t61(12)).subscribe(new ga(new kp5(6, this, jhd0Var), 17), new ia(new com.vk.movika.sdk.base.logic.interactor.f(10), 13));
    }
}
