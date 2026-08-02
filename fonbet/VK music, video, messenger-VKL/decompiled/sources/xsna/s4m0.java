package xsna;

import com.vk.camera.drawing.gradient.StoryEditText;
import com.vk.dto.stories.entities.StoryCameraTarget;
import com.vk.stickers.api.styles.b;

/* compiled from: StoryHashtagDialogPresenter.kt */
/* loaded from: classes16.dex */
public final class s4m0 implements cc6, r9m0 {
    public final n4m0 b;
    public final StoryCameraTarget c;
    public final cvu d;
    public final com.vk.stickers.api.styles.a f;
    public final io.reactivex.rxjava3.disposables.g e = new io.reactivex.rxjava3.disposables.g();
    public boolean g = true;

    public s4m0(n4m0 n4m0Var, StoryCameraTarget storyCameraTarget, cvu cvuVar, com.vk.stickers.api.styles.b bVar, c7l0 c7l0Var) {
        this.b = n4m0Var;
        this.c = storyCameraTarget;
        this.d = cvuVar;
        this.f = b.C1791b.a(bVar, null, c7l0Var, 1);
    }

    @Override // xsna.r9m0
    public final void g() {
        this.b.h(true);
    }

    @Override // xsna.r9m0
    public final StoryCameraTarget getTarget() {
        return this.c;
    }

    public final void k() {
        n4m0 n4m0Var = this.b;
        t4m0 t4m0Var = n4m0Var.b;
        l4m0 l4m0Var = n4m0Var.c;
        StoryEditText storyEditText = n4m0Var.k;
        if (storyEditText == null) {
            storyEditText = null;
        }
        Float valueOf = Float.valueOf(storyEditText.getTextSize());
        String obj = n4m0Var.getEditText().getText().toString();
        t4m0 t4m0Var2 = new t4m0(this.f, valueOf, obj);
        boolean z = drm0.p0(obj).toString().length() > 0;
        boolean z2 = t4m0Var != null;
        if (!z || z2) {
            if (z && z2) {
                if (l4m0Var != null) {
                    l4m0Var.c(t4m0Var2);
                }
            } else if (z || !z2) {
                if (l4m0Var != null) {
                    l4m0Var.Y();
                }
            } else if (l4m0Var != null) {
                l4m0Var.a();
            }
        } else if (l4m0Var != null) {
            l4m0Var.b(new v4m0(t4m0Var2, new w2a0(10)));
        }
        n4m0Var.dismiss();
    }

    @Override // xsna.cc6
    public final void onDestroy() {
        throw null;
    }

    @Override // xsna.cc6
    public final void onPause() {
        throw null;
    }

    @Override // xsna.cc6
    public final void onResume() {
        throw null;
    }

    @Override // xsna.r9m0
    public final t9m0 x() {
        return this.b;
    }

    @Override // xsna.r9m0
    public final StoryEditText z() {
        StoryEditText storyEditText = this.b.k;
        if (storyEditText != null) {
            return storyEditText;
        }
        return null;
    }
}
