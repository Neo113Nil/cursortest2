package xsna;

import android.content.Context;
import android.view.View;
import com.vk.im.ui.views.EmptyViewForList;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: EmptyChatsVc.kt */
/* loaded from: classes2.dex */
public final class ffp extends eyy {
    public final a e;
    public View f;

    /* compiled from: EmptyChatsVc.kt */
    public interface a {
    }

    public ffp(View view, a aVar) {
        super(R.id.dialogs_empty_chats, view);
        this.e = aVar;
    }

    @Override // xsna.eyy
    public final void b(View view) {
        Context context = view.getContext();
        View findViewById = view.findViewById(R.id.im_create_chat);
        this.f = findViewById;
        bwt0.i0(findViewById, new ifg(this, 14));
        EmptyViewForList emptyViewForList = (EmptyViewForList) view.findViewById(R.id.empty);
        e3m.a aVar = e3m.a;
        emptyViewForList.a(m33.a(R.drawable.ic_message_outline_64, context), Integer.valueOf(R.attr.vk_legacy_icon_outline_secondary));
    }

    public final void c(boolean z) {
        if (z) {
            a();
            View view = this.d;
            (view != null ? view : null).setVisibility(0);
        } else if (this.c) {
            View view2 = this.d;
            f4m.j(view2 != null ? view2 : null);
        }
    }
}
