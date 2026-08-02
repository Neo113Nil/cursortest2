package xsna;

import android.content.Context;
import android.view.View;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.log.L;

/* compiled from: ClipsEditorPreviewControllerImpl.kt */
/* loaded from: classes16.dex */
public final class ezd implements dzd {
    public final fyd a;
    public final o4p b;
    public final boolean c;
    public boolean d;

    public ezd(fyd fydVar, o4p o4pVar, boolean z) {
        this.a = fydVar;
        this.b = o4pVar;
        this.c = z;
    }

    @Override // xsna.dzd
    public final void a() {
        boolean z = this.c;
        fyd fydVar = this.a;
        if (!z) {
            fydVar.a(false);
            fydVar.c(false);
            this.d = false;
            fydVar.d(false);
            return;
        }
        Context ctx = fydVar.getCtx();
        ClipsDraftPersistentStore.b.getClass();
        ClipsDraftVk j = ClipsDraftPersistentStore.j();
        View view = null;
        if (j != null) {
            o4p o4pVar = this.b;
            try {
                View a = o4pVar.e.a(ctx, new ztd(o4pVar.a, o4pVar.b, o4pVar.c, o4pVar.d).a(j));
                a.setAlpha(0.64f);
                a.setClickable(false);
                a.setFocusable(false);
                view = a;
            } catch (Exception e) {
                L.j(e, "failed to get overlay");
            }
        }
        boolean z2 = view != null;
        fydVar.c(z2);
        fydVar.e(view);
        fydVar.a(true);
        this.d = z2;
        fydVar.d(z2);
    }

    @Override // xsna.dzd
    public final void o() {
        boolean z = !this.d;
        this.d = z;
        this.a.d(z);
    }

    @Override // xsna.dzd
    public final void onClose() {
        if (this.c) {
            fyd fydVar = this.a;
            fydVar.c(false);
            this.d = false;
            fydVar.d(false);
        }
    }
}
