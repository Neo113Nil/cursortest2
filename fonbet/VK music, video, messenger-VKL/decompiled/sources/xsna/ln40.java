package xsna;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Rect;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import java.util.concurrent.TimeUnit;
import xsna.l7v;

/* compiled from: MusicMagicWandHintManager.kt */
/* loaded from: classes3.dex */
public final class ln40 implements zf40 {
    public static final long e = TimeUnit.DAYS.toMillis(1);
    public final Activity b;
    public final com.vk.music.pref.a c;
    public dcn d;

    public ln40(Activity activity, com.vk.music.pref.a aVar) {
        this.b = activity;
        this.c = aVar;
    }

    @Override // xsna.zf40
    public final void a(Rect rect, gzs<s3q0> gzsVar) {
        if (!c() || rect.top <= 0) {
            return;
        }
        l7v b = pla.e().b();
        HintId hintId = HintId.SEARCH_MUSIC_MAGIC_WAND;
        Hint p = b.p(hintId.getId());
        if (p != null) {
            dcn dcnVar = this.d;
            if (dcnVar != null) {
                dcnVar.dismiss();
                this.d = null;
            }
            l7v b2 = pla.e().b();
            String id = hintId.getId();
            b2.getClass();
            l7v.b bVar = new l7v.b(id, b2, rect);
            bVar.i = true;
            bVar.f = new DialogInterface.OnShowListener() { // from class: xsna.jn40
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    com.vk.music.pref.a aVar = ln40.this.c;
                    aVar.f0(System.currentTimeMillis());
                    aVar.x();
                }
            };
            bVar.g = new kn40(gzsVar, 0);
            this.d = bVar.n(this.b, p);
            if (((int) this.c.m0()) == 0) {
                pla.e().b().s(p);
            }
        }
    }

    @Override // xsna.zf40
    public final void b() {
        com.vk.music.pref.a aVar = this.c;
        if (((int) aVar.m0()) < 1) {
            Hint p = pla.e().b().p(HintId.SEARCH_MUSIC_MAGIC_WAND.getId());
            if (p != null) {
                pla.e().b().s(p);
            }
            aVar.N();
        }
    }

    @Override // xsna.zf40
    public final boolean c() {
        if (!pla.e().b().a(HintId.SEARCH_MUSIC_MAGIC_WAND.getId())) {
            return false;
        }
        com.vk.music.pref.a aVar = this.c;
        if (((int) aVar.m0()) < 1) {
            return System.currentTimeMillis() - aVar.e0() > e;
        }
        return false;
    }
}
