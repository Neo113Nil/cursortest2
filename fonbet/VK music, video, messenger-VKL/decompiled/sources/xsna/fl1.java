package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoAlbum;
import com.vkontakte.android.R;

/* compiled from: AlbumUtilsImpl.kt */
/* loaded from: classes4.dex */
public final class fl1 implements el1 {
    public final hk1 a;
    public final s0e0 b;

    public fl1(hk1 hk1Var, s0e0 s0e0Var) {
        this.a = hk1Var;
        this.b = s0e0Var;
    }

    @Override // xsna.el1
    public final boolean a(PhotoAlbum photoAlbum) {
        UserId userId = photoAlbum.c;
        s0e0 s0e0Var = this.b;
        boolean a = s0e0Var.a(userId);
        hk1 hk1Var = this.a;
        if (!a) {
            hk1Var.getClass();
            return hk1.b(photoAlbum, null);
        }
        Boolean valueOf = Boolean.valueOf(s0e0Var.d());
        hk1Var.getClass();
        return hk1.b(photoAlbum, valueOf);
    }

    @Override // xsna.el1
    public final String b(Throwable th) {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return j03.g(context, th, R.string.error);
    }

    @Override // xsna.el1
    public final boolean c(int i) {
        return i < 0;
    }
}
