package xsna;

import android.content.Context;
import com.vk.im.engine.models.dialogs.DialogExt;
import xsna.l2s;
import xsna.u8m;

/* compiled from: CommonFolderDialogsListExternalActionsHandler.kt */
/* loaded from: classes18.dex */
public final class xjg implements nsm {
    public final a2s b;

    public xjg(a2s a2sVar) {
        this.b = a2sVar;
    }

    @Override // xsna.nsm
    public final boolean a(Context context, u8m u8mVar, DialogExt dialogExt, io.reactivex.rxjava3.disposables.b bVar) {
        if (!(u8mVar instanceof u8m.b)) {
            return false;
        }
        this.b.a(context, new l2s.b(dialogExt.e));
        return true;
    }
}
