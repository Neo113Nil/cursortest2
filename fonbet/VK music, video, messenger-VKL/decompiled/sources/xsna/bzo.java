package xsna;

import android.content.Intent;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.photos.legacy.EditAlbumFragment;

/* compiled from: EditAlbumFragment.java */
/* loaded from: classes16.dex */
public final class bzo extends beg0 {
    public final /* synthetic */ EditAlbumFragment d;

    public bzo(EditAlbumFragment editAlbumFragment) {
        this.d = editAlbumFragment;
    }

    @Override // xsna.beg0
    public final void r() {
        EditAlbumFragment editAlbumFragment = this.d;
        editAlbumFragment.c0.g = editAlbumFragment.oo();
        editAlbumFragment.c0.h = editAlbumFragment.e0.getText().toString();
        editAlbumFragment.c0.i = ((PrivacySetting) editAlbumFragment.h0.getTag()).e;
        editAlbumFragment.c0.j = ((PrivacySetting) editAlbumFragment.i0.getTag()).e;
        editAlbumFragment.c0.o = editAlbumFragment.l0.isChecked();
        editAlbumFragment.c0.p = editAlbumFragment.m0.isChecked();
        ysg0<Object> ysg0Var = ysg0.b;
        ysg0.b.a(new cl1(editAlbumFragment.c0));
        editAlbumFragment.Mf(-1, new Intent().putExtra("album", editAlbumFragment.c0));
    }
}
