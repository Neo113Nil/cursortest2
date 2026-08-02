package xsna;

import android.content.Context;
import android.view.View;
import com.vk.dto.user.UserProfile;
import com.vkontakte.android.R;
import xsna.dw20;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class y68 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ y68(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.d dVar = (com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.d) this.c;
                Context context = (Context) this.d;
                dVar.j = new dw20.b(context, tzp0.a(null, 3)).v0(R.string.posting_add).m(R.attr.vk_ui_background_content).D0((jhc0) this.e, false).c(new cpo(false, 0, 7)).I0(null);
                break;
            case 1:
                izs izsVar = (izs) this.c;
                wh50 wh50Var = (wh50) this.d;
                wh50 wh50Var2 = (wh50) this.e;
                wh50Var.setValue(Boolean.FALSE);
                izsVar.invoke(Integer.valueOf(Math.min(5, ((Number) wh50Var2.getValue()).intValue())));
                break;
            default:
                final cgq0 cgq0Var = (cgq0) this.c;
                final UserProfile userProfile = (UserProfile) this.d;
                final View view = (View) this.e;
                final Context context2 = cgq0Var.itemView.getContext();
                hg1.b(view, hg1.l(rsg0.Z(yfb.x(new es().l(userProfile.c))), context2, 62).subscribe(new io.reactivex.rxjava3.functions.a() { // from class: xsna.bgq0
                    @Override // io.reactivex.rxjava3.functions.a
                    public final void run() {
                        cgq0.this.v6(context2, userProfile, view);
                    }
                }));
                break;
        }
        return s3q0.a;
    }
}
