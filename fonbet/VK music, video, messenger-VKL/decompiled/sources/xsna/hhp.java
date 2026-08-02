package xsna;

import android.content.Context;
import android.view.View;
import com.vk.im.ui.views.EmptyViewForList;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: EmptySharedChatsVc.kt */
/* loaded from: classes2.dex */
public final class hhp extends eyy {
    public final a e;
    public View f;
    public EmptyViewForList g;
    public String h;
    public boolean i;

    /* compiled from: EmptySharedChatsVc.kt */
    public interface a {
    }

    public hhp(View view, a aVar) {
        super(R.id.dialogs_empty_shared_chats, view);
        this.e = aVar;
        this.i = true;
    }

    @Override // xsna.eyy
    public final void b(View view) {
        Context context = view.getContext();
        View findViewById = view.findViewById(R.id.im_invite_to_chat);
        this.f = findViewById;
        bwt0.i0(findViewById, new mmf(this, 27));
        EmptyViewForList emptyViewForList = (EmptyViewForList) view.findViewById(R.id.empty);
        this.g = emptyViewForList;
        e3m.a aVar = e3m.a;
        emptyViewForList.a(m33.a(R.drawable.vk_icon_messages_outline_56, context), Integer.valueOf(R.attr.vk_legacy_icon_outline_secondary));
    }

    public final void c(boolean z) {
        if (!z) {
            if (this.c) {
                View view = this.d;
                f4m.j(view != null ? view : null);
                return;
            }
            return;
        }
        a();
        Context context = this.b.getContext();
        String str = this.h;
        if (str == null) {
            str = "";
        }
        String string = context.getString(R.string.vkim_dialogs_list_empty_shared_chats, str);
        EmptyViewForList emptyViewForList = this.g;
        if (emptyViewForList == null) {
            emptyViewForList = null;
        }
        emptyViewForList.setText(string);
        View view2 = this.f;
        if (view2 == null) {
            view2 = null;
        }
        awt0.v(view2, this.i);
        View view3 = this.d;
        (view3 != null ? view3 : null).setVisibility(0);
    }
}
