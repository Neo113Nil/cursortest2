package xsna;

import android.view.View;
import com.vk.catalog2.common.ui.holders.friend.FriendsItemSearchListVh;
import com.vk.dto.stories.model.clickable.ClickablePhoto;
import com.vk.profile.questions.impl.d;
import com.vk.stat.scheme.SchemeStat$TypeQuestionItem;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class hkc implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hkc(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                qkc qkcVar = (qkc) this.c;
                ClickablePhoto clickablePhoto = (ClickablePhoto) this.d;
                qkcVar.m(clickablePhoto);
                izs<ClickablePhoto, Boolean> izsVar = qkcVar.d.f;
                if (izsVar != null) {
                    izsVar.invoke(clickablePhoto);
                    break;
                }
                break;
            case 1:
                ((izs) this.c).invoke(((FriendsItemSearchListVh.c) this.d).a);
                break;
            case 2:
                sq50 sq50Var = (sq50) this.c;
                lp50 lp50Var = (lp50) this.d;
                wzs<? super View, ? super wix, s3q0> wzsVar = sq50Var.s;
                if (wzsVar != null) {
                    wzsVar.invoke(view, lp50Var.a);
                    break;
                }
                break;
            case 3:
                com.vk.profile.questions.impl.e eVar = (com.vk.profile.questions.impl.e) this.c;
                d.c cVar = (d.c) this.d;
                eVar.l.a(cVar.b.g().b);
                iqe0.a(cVar, SchemeStat$TypeQuestionItem.Type.GO_TO_CHAT);
                break;
            default:
                wbr0 wbr0Var = (wbr0) this.c;
                androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) this.d;
                wbr0Var.a = true;
                wbr0Var.b.c.m(JsApiMethodType.SHOW_REQUEST_BOX, VkAppsErrors.Client.USER_DENIED, null, null);
                dVar.dismiss();
                break;
        }
    }
}
