package xsna;

import android.content.Context;
import com.vk.im.engine.models.dialogs.DialogExt;
import java.util.Collections;
import kotlin.collections.EmptyList;
import xsna.u8m;

/* compiled from: FoldersDialogsListExternalActionsHandler.kt */
/* loaded from: classes18.dex */
public final class u0s implements nsm {
    public final int b;
    public final v0s c;
    public final c1s d;

    public u0s(int i, v0s v0sVar, c1s c1sVar) {
        this.b = i;
        this.c = v0sVar;
        this.d = c1sVar;
    }

    @Override // xsna.nsm
    public final boolean a(Context context, u8m u8mVar, DialogExt dialogExt, io.reactivex.rxjava3.disposables.b bVar) {
        if (!(u8mVar instanceof u8m.n0)) {
            return false;
        }
        bVar.b(hg1.i(this.c.p(this.b, null, EmptyList.b, Collections.singletonList(Long.valueOf(dialogExt.e))).d(this.d.f()).K().m(asu0.a.d()), new jsg(this, context, dialogExt, bVar, 1)));
        return true;
    }
}
