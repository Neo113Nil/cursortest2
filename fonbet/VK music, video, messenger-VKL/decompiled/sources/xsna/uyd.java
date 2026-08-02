package xsna;

import android.content.Context;
import android.content.DialogInterface;
import com.vk.storycamera.utils.CatalogModalBottomSheetFragment;

/* compiled from: ClipsEditorMusicSelectorControllerImpl.kt */
/* loaded from: classes16.dex */
public final class uyd implements syd {
    public final n550 a;
    public io.reactivex.rxjava3.disposables.c b;

    public uyd(n550 n550Var) {
        this.a = n550Var;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [xsna.tyd] */
    @Override // xsna.syd
    public final void a(Context context, xx9 xx9Var) {
        if (j8.d(context)) {
            return;
        }
        c9d c9dVar = this.a.a;
        c9dVar.l();
        c9dVar.d(false);
        io.reactivex.rxjava3.disposables.c cVar = this.b;
        if (cVar != null) {
            cVar.dispose();
        }
        this.b = bh6.m.subscribe(new bn3(new ya(10, xx9Var, this), 10));
        int i = CatalogModalBottomSheetFragment.X;
        CatalogModalBottomSheetFragment.a.a(context, CatalogModalBottomSheetFragment.Content.CLIPS, new DialogInterface.OnDismissListener() { // from class: xsna.tyd
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                uyd.this.a.a();
            }
        }, 4);
    }

    @Override // xsna.syd
    public final void dispose() {
        io.reactivex.rxjava3.disposables.c cVar = this.b;
        if (cVar != null) {
            cVar.dispose();
        }
    }
}
