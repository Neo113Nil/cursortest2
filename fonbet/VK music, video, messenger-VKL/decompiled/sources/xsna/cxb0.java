package xsna;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import com.vk.video.ui.albums.fragments.VideoAlbumsFragment;
import com.vkontakte.android.R;

/* compiled from: PopupMenu.java */
/* loaded from: classes11.dex */
public final class cxb0 {
    public final androidx.appcompat.view.menu.f a;
    public final View b;
    public final androidx.appcompat.view.menu.i c;
    public VideoAlbumsFragment.d.a d;

    public cxb0(@NonNull Context context, @NonNull View view, int i) {
        this.b = view;
        androidx.appcompat.view.menu.f fVar = new androidx.appcompat.view.menu.f(context);
        this.a = fVar;
        fVar.e = new axb0(this);
        androidx.appcompat.view.menu.i iVar = new androidx.appcompat.view.menu.i(context, fVar, view, false, R.attr.popupMenuStyle, 0);
        this.c = iVar;
        iVar.f = i;
        iVar.j = new bxb0(this);
    }
}
