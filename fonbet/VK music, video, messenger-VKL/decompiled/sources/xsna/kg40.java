package xsna;

import android.content.Context;
import android.content.DialogInterface;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.h7u0;
import xsna.xb50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class kg40 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ kg40(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                sg40 sg40Var = (sg40) obj3;
                UserId userId = (UserId) obj2;
                String str = (String) obj;
                for (MusicTrack musicTrack : (ArrayList) obj4) {
                    MusicTrack s = sg40Var.e.s(userId, musicTrack.Fb());
                    if (s != null) {
                        kgp0.f(sg40Var.e, userId, musicTrack, str, false, null, null, 24);
                        xb50 xb50Var = sg40Var.m;
                        xb50.a a = xb50.a(xb50Var.c(s), xb50Var.c(musicTrack));
                        sg40Var.a.Y(a.b, a.a);
                    }
                }
                break;
            default:
                final pgc0 pgc0Var = (pgc0) obj3;
                final gzs gzsVar = (gzs) obj;
                int i2 = h7u0.p;
                h7u0.a c = h7u0.b.c((Context) obj4);
                c.g0(R.string.caution_draft_exists);
                c.U(R.string.caution_draft_removing);
                c.W(R.string.open_draft, new wp1(1, pgc0Var, (PostingCreationEntryPoint) obj2));
                c.c0(R.string.start_from_scratch, new DialogInterface.OnClickListener() { // from class: xsna.ogc0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        pgc0.this.d3();
                        gzsVar.invoke();
                    }
                });
                c.m();
                break;
        }
    }
}
