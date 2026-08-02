package xsna;

import android.net.Uri;
import com.vk.dto.common.Image;
import com.vk.log.L;
import java.io.File;
import kotlin.text.Regex;

/* compiled from: VideoOfflineImagesPersistentRepository.kt */
/* loaded from: classes3.dex */
public final class azs0 implements bzs0 {
    @Override // xsna.bzs0
    public final io.reactivex.rxjava3.core.x A(int i, String str, String str2) {
        return I(str, lhg.a(i, "timeline_thumb_"), new jhg(str2, 2));
    }

    public final io.reactivex.rxjava3.internal.operators.single.b0 I(String str, String str2, gzs gzsVar) {
        io.reactivex.rxjava3.internal.operators.single.e0 e0Var = new io.reactivex.rxjava3.internal.operators.single.e0(new io.reactivex.rxjava3.internal.operators.single.v(new jh40(this, str, str2)), new a0m0(new t35(gzsVar, this, str, str2, 3), 10));
        asu0 asu0Var = asu0.a;
        return e0Var.q(asu0Var.c()).m(asu0Var.c());
    }

    @Override // xsna.bzs0
    public final io.reactivex.rxjava3.core.x<Uri> i(String str, String str2) {
        return I(str, "video_author", new jhg(str2, 2));
    }

    @Override // xsna.bzs0
    public final void m(String str) {
        try {
            File a = zys0.a(str);
            Regex regex = com.vk.core.files.a.a;
            vhk0.b(a);
        } catch (Exception e) {
            L.i(e);
        }
    }

    @Override // xsna.bzs0
    public final io.reactivex.rxjava3.core.x o(Image image, String str) {
        return I(str, "video_cover", new akd0(image, 22));
    }
}
