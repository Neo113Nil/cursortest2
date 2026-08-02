package xsna;

import android.content.Context;
import com.vk.clips.coauthors.list.common.mvi.entity.state.ClipCoauthorListItem;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vkontakte.android.R;
import java.util.Iterator;
import xsna.coc;
import xsna.wv30;
import xsna.xv30;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class joc implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ joc(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        Object obj2;
        switch (this.b) {
            case 0:
                el50 el50Var = (el50) this.c;
                UserId userId = ((coc.e) this.d).b;
                Iterator it = com.vk.clips.coauthors.list.common.mvi.entity.state.a.a((ClipVideoFile) obj, false).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (((ClipCoauthorListItem) obj2).b.b.equals(userId)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                ClipCoauthorListItem clipCoauthorListItem = (ClipCoauthorListItem) obj2;
                if (clipCoauthorListItem != null) {
                    el50Var.D(el50Var, new oh3(7, userId, clipCoauthorListItem));
                    break;
                }
                break;
            default:
                wv30 wv30Var = (wv30) this.c;
                Context context = (Context) this.d;
                wv30.a aVar = (wv30.a) obj;
                Dialog dialog = aVar.a;
                if (dialog != null && !wv30Var.d(dialog.Sb().longValue())) {
                    new xv30(context, new xv30.a(aVar.a.Sb().longValue(), context.getString(R.string.vkim_msg_request_push_pending_title), context.getString(R.string.vkim_msg_request_push_pending_body, wv30Var.a(aVar))), null, null, null).h(context);
                    break;
                }
                break;
        }
    }
}
