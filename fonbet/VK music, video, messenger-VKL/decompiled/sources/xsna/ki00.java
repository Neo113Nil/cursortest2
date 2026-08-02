package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import xsna.ii00;
import xsna.ui00;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ki00 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ki00(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                li00 li00Var = (li00) this.c;
                ui00.a.b bVar = (ui00.a.b) this.d;
                li00Var.d.onNext(new ii00.c(bVar.a, bVar.b));
                break;
            default:
                UserId userId = (UserId) this.c;
                srl0 srl0Var = (srl0) this.d;
                int i = fkq0.d(userId) ? R.string.user_has_been_hidden_from_stories : R.string.community_has_been_hidden_from_stories;
                Context context = srl0Var.a;
                int a = iah0.a(54);
                if ((8 & 16) != 0) {
                    a = iah0.a(88);
                }
                cmf0.d(context, null, context.getString(i), false, a, (8 & 32) != 0);
                break;
        }
    }
}
