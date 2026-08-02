package xsna;

import android.content.Context;
import android.view.View;
import com.vkontakte.android.R;
import xsna.v4i;

/* compiled from: CommunityUserSubscribedItem.kt */
/* loaded from: classes5.dex */
public final class t4i implements l2v0 {
    public final int b;
    public final /* synthetic */ v4i.a c;

    public t4i(v4i.a aVar) {
        this.c = aVar;
        this.b = krv0.m(R.attr.vk_ui_text_primary, aVar.itemView.getContext());
    }

    @Override // xsna.rku0
    public final void a(Context context, View view) {
        f(context, view);
    }

    @Override // xsna.rku0
    public final boolean e() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.rku0
    public final void f(Context context, View view) {
        ((v4i) this.c.m).h.invoke();
    }

    @Override // xsna.l2v0
    public final int getColor() {
        return this.b;
    }

    @Override // xsna.l2v0
    public final String i() {
        return null;
    }
}
