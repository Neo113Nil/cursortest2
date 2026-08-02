package xsna;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Rect;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import java.util.concurrent.TimeUnit;
import xsna.k840;
import xsna.l7v;

/* compiled from: MusicLongtapSnippetHintManager.kt */
/* loaded from: classes3.dex */
public final class gn40 implements zf40, w8i {
    public static final long g = TimeUnit.DAYS.toMillis(1);
    public final Activity b;
    public dcn c;
    public boolean d;
    public final u750 e;
    public final bpn0 f;

    public gn40(Activity activity) {
        this.b = activity;
        this.d = true;
        s750 s750Var = k840.a.e;
        this.e = s750Var == null ? null : s750Var;
        this.f = new bpn0(new drg(this, 28));
        this.d = activity.getResources().getConfiguration().orientation != 2;
    }

    @Override // xsna.zf40
    public final void a(Rect rect, gzs<s3q0> gzsVar) {
        if (c() && this.d && rect.top > 0) {
            l7v b = pla.e().b();
            HintId hintId = HintId.MUSIC_LONGTAP_PREVIEW;
            Hint p = b.p(hintId.getId());
            if (p != null) {
                dcn dcnVar = this.c;
                if (dcnVar != null) {
                    if (dcnVar != null) {
                        dcnVar.dismiss();
                    }
                    this.c = null;
                }
                l7v b2 = pla.e().b();
                String id = hintId.getId();
                b2.getClass();
                l7v.b bVar = new l7v.b(id, b2, rect);
                bVar.i = true;
                bVar.f = new DialogInterface.OnShowListener() { // from class: xsna.fn40
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        gn40 gn40Var = gn40.this;
                        gn40Var.e.B();
                        gn40Var.d().D0(System.currentTimeMillis());
                        gn40Var.d().V();
                    }
                };
                this.c = bVar.n(this.b, p);
                if (((int) d().G()) == 2) {
                    pla.e().b().s(p);
                }
            }
        }
    }

    @Override // xsna.zf40
    public final void b() {
        if (((int) d().G()) < 3) {
            Hint p = pla.e().b().p(HintId.MUSIC_LONGTAP_PREVIEW.getId());
            if (p != null) {
                pla.e().b().s(p);
            }
            d().E0();
        }
    }

    @Override // xsna.zf40
    public final boolean c() {
        if (!pla.e().b().a(HintId.MUSIC_LONGTAP_PREVIEW.getId()) || ((int) d().G()) >= 3) {
            return false;
        }
        return System.currentTimeMillis() - d().z() > g;
    }

    public final com.vk.music.pref.a d() {
        return (com.vk.music.pref.a) this.f.getValue();
    }
}
