package xsna;

import android.net.Uri;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import com.vk.attachpicker.screen.h;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Playlist;
import com.vkontakte.android.R;
import xsna.skm0;
import xsna.xb50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class l0g implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l0g(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                Uri uri = (Uri) this.c;
                String str = (String) this.d;
                com.vk.attachpicker.screen.f fVar = (com.vk.attachpicker.screen.f) this.e;
                if (uri != null && com.vk.core.files.a.x(str)) {
                    if (str != null) {
                        g4p g4pVar = new g4p(str);
                        if (!h.a.a(g4pVar)) {
                            cvk.u(R.string.picker_image_format_invalid, false);
                            m3g m3gVar = fVar.t;
                            if (m3gVar != null) {
                                m3gVar.invoke();
                                break;
                            }
                        } else {
                            g84 g84Var = fVar.s;
                            if (g84Var != null) {
                                g84Var.invoke(g4pVar);
                                break;
                            }
                        }
                    }
                } else {
                    m3g m3gVar2 = fVar.t;
                    if (m3gVar2 != null) {
                        m3gVar2.invoke();
                        break;
                    }
                }
                break;
            case 1:
                sg40 sg40Var = (sg40) this.c;
                UserId userId = (UserId) this.d;
                Playlist playlist = (Playlist) this.e;
                rbb0 rbb0Var = sg40Var.f;
                xb50 xb50Var = sg40Var.m;
                Playlist h = rbb0Var.h(userId, playlist.Ib());
                if (h != null) {
                    playlist.O = h.O;
                    sg40Var.f.c(userId, xb50Var.b(playlist));
                    xb50.a a = xb50.a(xb50Var.d(h), xb50Var.d(playlist));
                    sg40Var.a.Y(a.b, a.a);
                    break;
                }
                break;
            case 2:
                ks80 ks80Var = (ks80) this.c;
                String str2 = (String) this.d;
                wzs wzsVar = (wzs) this.e;
                ohk0 b = ks80Var.f().b((Long) ks80Var.a.invoke(), str2);
                if (b != null) {
                    wzsVar.invoke(b, str2);
                    break;
                }
                break;
            case 3:
                bp50 bp50Var = (bp50) this.c;
                b520 b520Var = (b520) this.d;
                skm0.a aVar = (skm0.a) this.e;
                bp50Var.d(b520Var);
                aVar.F0();
                break;
            case 4:
                UnityAds.show$lambda$16$lambda$15$lambda$14((IUnityAdsShowListener) this.c, (String) this.d, (Throwable) this.e);
                break;
            default:
                ((yads.pk0) this.c).a((yads.qk0) this.d, (Exception) this.e);
                break;
        }
    }
}
