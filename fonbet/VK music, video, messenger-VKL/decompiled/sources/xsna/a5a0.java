package xsna;

import android.content.Context;
import android.content.DialogInterface;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.photos.legacy.PhotoAlbumListFragment;

/* compiled from: PhotoAlbumListFragment.java */
/* loaded from: classes16.dex */
public final class a5a0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context b;
    public final /* synthetic */ PhotoAlbum c;
    public final /* synthetic */ UserId d;
    public final /* synthetic */ izs e;

    public a5a0(Context context, PhotoAlbum photoAlbum, UserId userId, izs izsVar) {
        this.b = context;
        this.c = photoAlbum;
        this.d = userId;
        this.e = izsVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = PhotoAlbumListFragment.O0;
        PhotoAlbum photoAlbum = this.c;
        int i3 = photoAlbum.b;
        UserId userId = this.d;
        sea0 sea0Var = new sea0(i3, userId.b < 0 ? fkq0.e(userId) : UserId.d);
        Context context = this.b;
        jx2 jx2Var = new jx2(sea0Var, new b5a0(context, photoAlbum, this.e));
        jx2Var.g = context;
        jx2Var.a();
    }
}
