package xsna;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import com.vk.attachpicker.stat.models.VkStickerMeta;
import com.vk.attachpicker.stickers.selection.models.EditorSticker;
import com.vk.dto.stickers.VmojiAvatar;
import com.vk.dto.stories.model.GifItem;
import xsna.d6l0;

/* compiled from: StickerSelectionControllerImpl.kt */
/* loaded from: classes15.dex */
public final class w860 implements uei0 {
    public final Activity a;
    public final o6a0 b;
    public final d6l0.a c;
    public yzs<? super String, ? super Bitmap, ? super f5l0, s3q0> d = new xgi(3);

    public w860(Activity activity, o6a0 o6a0Var, d6l0.a aVar) {
        this.a = activity;
        this.b = o6a0Var;
        this.c = aVar;
    }

    @Override // xsna.uei0
    public final void a() {
        b7l.a(null);
    }

    @Override // xsna.uei0
    public final void b() {
        b7l.a(null);
    }

    @Override // xsna.uei0
    public final void c() {
        b7l.a(null);
    }

    @Override // xsna.uei0
    public final void close() {
        this.c.invoke();
    }

    @Override // xsna.uei0
    public final void d(VmojiAvatar vmojiAvatar) {
        b6m.e().c(this.a, vmojiAvatar);
    }

    @Override // xsna.uei0
    public final void e() {
        b7l.a(null);
    }

    @Override // xsna.uei0
    public final void f() {
        b7l.a(null);
    }

    @Override // xsna.uei0
    public final void h() {
        b7l.a(null);
    }

    @Override // xsna.uei0
    public final void i() {
        b7l.a(null);
    }

    @Override // xsna.uei0
    public final void j() {
        b7l.a(null);
    }

    @Override // xsna.uei0
    public final void k() {
        b7l.a(null);
    }

    @Override // xsna.uei0
    public final void l(String str, String str2) {
        s(str, new VkStickerMeta(VkStickerMeta.Type.Emoji, null, null));
    }

    @Override // xsna.uei0
    public final void m(GifItem gifItem) {
        b7l.a(null);
    }

    @Override // xsna.uei0
    public final void n() {
        d6w0.a(b6m.e(), this.a, "keyboard_story", null, 8);
        this.b.b(f1v0.a);
    }

    @Override // xsna.uei0
    public final void p() {
        b7l.a(null);
    }

    @Override // xsna.uei0
    public final void q() {
        this.b.b(g1v0.a);
    }

    @Override // xsna.uei0
    public final void r(EditorSticker editorSticker) {
        String str = editorSticker.f;
        int i = editorSticker.c;
        new jea0(i).p();
        String str2 = editorSticker.d;
        if (str2 != null) {
            String str3 = editorSticker.e;
            s(str2, new VkStickerMeta(((str3 == null || str3.length() == 0) && (str == null || str.length() == 0)) ? VkStickerMeta.Type.FromPack : (str == null || str.length() == 0) ? VkStickerMeta.Type.Animated : VkStickerMeta.Type.Vmoji, Integer.valueOf(i), Long.valueOf(editorSticker.b)));
        }
    }

    public final void s(String str, VkStickerMeta vkStickerMeta) {
        io.reactivex.rxjava3.core.q<Bitmap> h = mcr0.h(Uri.parse(str));
        asu0 asu0Var = asu0.a;
        ver0.b(this.a, h.r0(asu0Var.c()).a0(asu0Var.d()).subscribe(new tk40(new jh3(this, str, vkStickerMeta, 7), 3), new m5y(new rvq(14), 8)));
    }

    @Override // xsna.uei0
    public final void g() {
    }

    @Override // xsna.uei0
    public final void o() {
    }
}
