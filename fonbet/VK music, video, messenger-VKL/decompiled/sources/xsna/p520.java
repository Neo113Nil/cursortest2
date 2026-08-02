package xsna;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.user.UserProfile;
import java.io.File;
import org.json.JSONException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class p520 implements izs {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ RectF d;
    public final /* synthetic */ Photo e;
    public final /* synthetic */ z520 f;
    public final /* synthetic */ boolean g;

    public /* synthetic */ p520(boolean z, String str, RectF rectF, Photo photo, z520 z520Var, boolean z2) {
        this.b = z;
        this.c = str;
        this.d = rectF;
        this.e = photo;
        this.f = z520Var;
        this.g = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Image image;
        UserId userId = this.f.g;
        if (this.b) {
            wxl0 wxl0Var = wxl0.b;
            Integer valueOf = Integer.valueOf(this.e.c);
            String str = this.c;
            if (str == null) {
                wxl0Var.c();
            } else {
                wxl0.m = true;
                wxl0.h = this.d;
                Bitmap a = mcr0.h(Uri.parse(str)).a();
                bpn0 bpn0Var = wxl0.d;
                kd7.m(a, (File) bpn0Var.getValue());
                if (wxl0.l) {
                    wxl0.d((File) wxl0.c.getValue(), (File) bpn0Var.getValue(), valueOf);
                } else {
                    wxl0Var.b();
                }
            }
        }
        try {
            image = ((UserProfile) rsg0.a0(new e1r0(userId, new String[]{"photo_base"})).a()).O;
        } catch (JSONException unused) {
            image = null;
        }
        if (image != null) {
            ImageSize Cb = image.Cb(iah0.f().density > 1.0f ? 100 : 50, true, false);
            String str2 = Cb != null ? Cb.d.d : null;
            if (epx.f(userId, userId) && str2 != null) {
                o6r0 c = q6r0.c();
                c.d(str2, false);
                c.commit();
            }
            Intent putExtra = new Intent("com.vkontakte.android.USER_PHOTO_CHANGED").putExtra("id", userId).putExtra("image", image).putExtra("photo", str2).putExtra("reload_wall", this.g);
            Context context = e43.a;
            n2i0.a(context != null ? context : null, hf8.a, putExtra);
        }
        return s3q0.a;
    }
}
