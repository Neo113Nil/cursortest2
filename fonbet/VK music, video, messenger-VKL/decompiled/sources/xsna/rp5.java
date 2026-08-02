package xsna;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.attachpicker.b;
import com.vk.attachpicker.widget.ContextProgressView;
import com.vk.attachpicker.widget.EditorBottomPanel;
import com.vk.crop.CropImageView;
import com.vk.imageloader.ImageScreenSize;
import com.vk.medianative.MediaImageEncoder;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vkontakte.android.R;
import java.io.File;
import java.lang.reflect.Field;

/* compiled from: AvatarAreaSelectionScreen.java */
/* loaded from: classes15.dex */
public final class rp5 extends em6 {
    public final MediaStoreEntry g;
    public CropImageView j;
    public EditorBottomPanel k;
    public ContextProgressView l;
    public io.reactivex.rxjava3.disposables.c n;
    public final pxo0 i = new pxo0(1000);
    public boolean m = true;
    public Bitmap h = null;

    /* compiled from: AvatarAreaSelectionScreen.java */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            rp5 rp5Var = rp5.this;
            pxo0 pxo0Var = rp5Var.i;
            if (pxo0Var.c()) {
                return;
            }
            pxo0Var.d();
            rp5Var.c();
        }
    }

    /* compiled from: AvatarAreaSelectionScreen.java */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent a;
            rp5 rp5Var = rp5.this;
            pxo0 pxo0Var = rp5Var.i;
            if (pxo0Var.c()) {
                return;
            }
            pxo0Var.d();
            rp5Var.j.a();
            Activity d = rp5Var.d();
            if (d == null) {
                return;
            }
            j34 c = rwi.d().p().c(d);
            try {
                MediaStoreEntry mediaStoreEntry = rp5Var.g;
                if (mediaStoreEntry != null) {
                    a = b.a.b(mediaStoreEntry);
                } else {
                    File s = com.vk.core.files.a.s();
                    MediaImageEncoder.INSTANCE.encodeJpeg(rp5Var.h, s);
                    a = b.a.a(Uri.fromFile(s), false, false);
                }
                RectF b = rp5Var.j.getCropController().b();
                a.putExtra("cropLeft", b.left);
                a.putExtra("cropTop", b.top);
                a.putExtra("cropRight", b.right);
                a.putExtra("cropBottom", b.bottom);
                c.V2(a);
            } catch (Exception unused) {
                cvk.u(R.string.picker_saving_error, false);
            }
        }
    }

    /* compiled from: AvatarAreaSelectionScreen.java */
    public class c implements CropImageView.b {
        public c() {
        }
    }

    public rp5(MediaStoreEntry mediaStoreEntry) {
        this.g = mediaStoreEntry;
    }

    @Override // xsna.em6
    public final View b(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.picker_screen_avatar_area_selection, (ViewGroup) null);
        this.j = (CropImageView) inflate.findViewById(R.id.cv_crop);
        this.k = (EditorBottomPanel) inflate.findViewById(R.id.ebp_bottom);
        this.l = (ContextProgressView) inflate.findViewById(R.id.cpv_progress);
        this.k.setOnCancelClickListener(new a());
        this.k.setOnApplyClickListener(new b());
        this.j.setDelegate(new c());
        if (this.h != null) {
            m();
            return inflate;
        }
        if (this.n != null) {
            return inflate;
        }
        Uri f = this.g.f();
        Field field = mcr0.a;
        this.n = mcr0.j(f, ImageScreenSize.VERY_BIG).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new sp5(this), new tp5(this));
        return inflate;
    }

    @Override // xsna.em6
    public final void c() {
        this.j.a();
        this.j.c(false, false, false);
        super.c();
    }

    @Override // xsna.em6
    public final boolean g() {
        return !this.m;
    }

    @Override // xsna.em6
    public final void k(int i) {
        this.j.c.setTopSidePadding(i + com.vk.crop.h.R);
    }

    public final void m() {
        this.l.setVisibility(8);
        com.vk.crop.g gVar = new com.vk.crop.g(this.h.getWidth(), this.h.getHeight());
        gVar.c();
        this.j.b(this.h, gVar, false, null);
    }
}
