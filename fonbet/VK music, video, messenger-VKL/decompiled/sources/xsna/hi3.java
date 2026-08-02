package xsna;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import android.webkit.ValueCallback;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.core.files.b;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.log.L;
import java.io.File;
import kotlin.Pair;
import kotlin.text.Regex;
import ru.ok.gleffects.dto.UserInfo;
import xsna.ig3;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class hi3 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hi3(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        PrivateFiles.a b;
        int i = this.b;
        boolean z = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                ((ki3) obj2).d.invoke(new ig3.i(z));
                break;
            case 1:
                h1e h1eVar = (h1e) obj2;
                jkq0 jkq0Var = (jkq0) obj;
                h1eVar.k = true;
                if (z) {
                    Regex regex = com.vk.core.files.a.a;
                    PrivateFiles privateFiles = e8r.a;
                    PrivateSubdir privateSubdir = PrivateSubdir.FRIENDS_AVATARS;
                    privateFiles.getClass();
                    b = privateFiles.b(privateSubdir, privateSubdir.h(), true);
                    File file = new File(b.a, "userAvatar.png");
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    io.reactivex.rxjava3.internal.operators.observable.g1 T = io.reactivex.rxjava3.core.q.T(new Pair(file, jkq0Var));
                    int i2 = 15;
                    ((io.reactivex.rxjava3.disposables.g) h1eVar.g.getValue()).b(T.L(new p7(new com.vk.im.engine.internal.api_commands.messages.a(h1eVar, 18), i2), false).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new bn3(new com.vk.im.engine.internal.storage.delegates.messages.b(h1eVar, 29), 11), new f60(new o8(L.a, 2), i2)));
                } else {
                    UserInfo userInfo = h1eVar.j;
                    UserInfo userInfo2 = new UserInfo(userInfo != null ? userInfo.userAvatarFile : null, jkq0Var.b, jkq0Var.c, jkq0Var.d, jkq0Var.e);
                    h1eVar.j = userInfo2;
                    h1eVar.a.f(userInfo2);
                }
                break;
            case 2:
                Post post = (Post) obj2;
                ((Integer) obj).intValue();
                dw20 dw20Var = com.vk.qrcode.d.k;
                if (dw20Var != null) {
                    dw20Var.Pn(-2);
                }
                post.s0(z);
                break;
            default:
                hgx0 hgx0Var = (hgx0) obj2;
                Uri uri = ((b.a) obj).a;
                String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(uri.toString()));
                if (mimeTypeFromExtension != null ? drm0.D(mimeTypeFromExtension, "image", false) : false) {
                    uri = ((f8r) i2w.a().a.a.k.invoke()).a(hgx0Var.e.requireContext(), uri, com.vk.core.files.a.s(), null);
                }
                ValueCallback<Uri[]> valueCallback = hgx0Var.c;
                if (valueCallback != null) {
                    valueCallback.onReceiveValue(z ? new Uri[]{uri} : null);
                }
                hgx0Var.c = null;
                break;
        }
        return s3q0.a;
    }
}
