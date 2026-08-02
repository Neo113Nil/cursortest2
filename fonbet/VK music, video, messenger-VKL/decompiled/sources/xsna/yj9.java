package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.Size;
import com.vk.attachpicker.stickers.photo.PhotoStickerStyle;
import com.vk.dto.photo.Photo;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;
import xsna.f5h0;
import xsna.kba0;

/* compiled from: CameraPhotoStickerDelegate.kt */
/* loaded from: classes16.dex */
public final class yj9 {
    public final Context a;
    public final u440 b;
    public final Photo c;
    public final lh9 d;
    public boolean e;

    public yj9(Context context, u440 u440Var, Photo photo, lh9 lh9Var) {
        this.a = context;
        this.b = u440Var;
        this.c = photo;
        this.d = lh9Var;
    }

    public final void a(Canvas canvas, int i, int i2) {
        jwx jwxVar = edg0.a;
        baf0 a = edg0.a(this.c.L, null);
        a5h0 a5h0Var = a != null ? new a5h0(a, f5h0.g.a) : null;
        if (a5h0Var != null) {
            a5h0Var.setBounds(0, 0, i, i2);
            a5h0Var.draw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b7, code lost:
    
        if ((r5 != null ? r5.B : null) == null) goto L32;
     */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Bitmap bitmap) {
        lh9 lh9Var = this.d;
        lh9.d(lh9Var, bitmap);
        Photo photo = this.c;
        if (photo.Ib()) {
            a(new Canvas(bitmap), bitmap.getWidth(), bitmap.getHeight());
        }
        Size a = lh9Var.a();
        float E0 = photo.y.E0();
        long j = photo.e.b;
        int i = photo.c;
        UserProfile userProfile = photo.B;
        String str = userProfile != null ? userProfile.e : null;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        PhotoStickerStyle photoStickerStyle = PhotoStickerStyle.PREVIEW;
        bpn0 bpn0Var = z5l0.a;
        boolean f = z5l0.f(E0, a.getWidth() / a.getHeight());
        ArrayList o = e43.o(photoStickerStyle);
        if (f) {
            o.add(PhotoStickerStyle.FULLSCREEN);
        }
        kba0.a aVar = new kba0.a(photoStickerStyle, o);
        UserProfile userProfile2 = photo.B;
        dnr0 i2 = fco0.i(userProfile2 != null ? userProfile2.B : null);
        String str3 = photo.Fb(a.getWidth(), false).d.d;
        UserProfile userProfile3 = photo.B;
        lba0 lba0Var = new lba0(this.a, new kba0(str2, E0, aVar, str3, false, false, userProfile3 != null ? userProfile3.D() : null, j, i, i2), false);
        lba0Var.setFromSharing(true);
        UserProfile userProfile4 = photo.B;
        String D = userProfile4 != null ? userProfile4.D() : null;
        u440 u440Var = this.b;
        if (D != null) {
            UserProfile userProfile5 = photo.B;
        }
        int i3 = 6;
        u440Var.a(new io.reactivex.rxjava3.internal.operators.observable.c2(((b2m0) lh9Var.d.getValue()).a(photo.e), new vx6(new nj(3), 2)).a0(asu0.a.d()).subscribe(new gf0(new ns1(lba0Var, 12), i3), new hf0(new c2(i3), 1)));
        u440Var.v2(lba0Var);
        this.e = true;
    }
}
