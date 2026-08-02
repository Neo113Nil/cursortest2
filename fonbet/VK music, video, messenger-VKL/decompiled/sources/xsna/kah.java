package xsna;

import android.content.Context;
import android.view.View;
import com.vkontakte.android.R;
import xsna.mah;

/* compiled from: CommunityMembersItem.kt */
/* loaded from: classes5.dex */
public final class kah implements l2v0 {
    public final int b;
    public final /* synthetic */ mah.a c;

    public kah(mah.a aVar) {
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
        mah.a aVar = this.c;
        aVar.q6((mah) aVar.m, true);
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
