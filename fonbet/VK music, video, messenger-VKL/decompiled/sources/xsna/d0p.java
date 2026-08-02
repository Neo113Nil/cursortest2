package xsna;

import android.content.DialogInterface;
import com.vk.ecomm.market.album.editor.cover.presentation.b;
import com.vk.profile.user.impl.UserProfileDialogs;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import java.util.ArrayList;
import xsna.bex0;
import xsna.dwv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0p implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d0p(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                ((f0p) this.c).R.finish();
                break;
            case 1:
                ((com.vk.ecomm.market.album.editor.cover.presentation.a) this.c).b.b(b.a.a);
                break;
            case 2:
                ((UserProfileDialogs) this.c).a.a(UserProfileAction.s.a.C1690a.b);
                break;
            case 3:
                r6y r6yVar = ((dwv0) this.c).b;
                if (r6yVar != null) {
                    bex0.a.b(r6yVar, JsApiMethodType.FRIENDS_SEARCH, dwv0.a.b(new ArrayList()), null, 12);
                    break;
                }
                break;
            default:
                ru.mail.libverify.k.a.a((ru.mail.libverify.k.a) this.c, dialogInterface, i);
                break;
        }
    }
}
