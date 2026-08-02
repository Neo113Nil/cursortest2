package xsna;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.facebook.soloader.MinElf;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.polls.Poll;
import xsna.o0r0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class mna implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mna(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Owner owner;
        switch (this.b) {
            case 0:
                nna nnaVar = (nna) this.c;
                pna pnaVar = (pna) this.d;
                izs<MusicTrack, s3q0> izsVar = nnaVar.a;
                if (izsVar != null) {
                    izsVar.invoke(pnaVar.a);
                    break;
                }
                break;
            case 1:
                cwf cwfVar = (cwf) this.c;
                dw20 dw20Var = (dw20) this.d;
                h1j h1jVar = cwfVar.e;
                if (h1jVar != null) {
                    h1jVar.invoke();
                }
                dw20Var.hide();
                break;
            case 2:
                krb0 krb0Var = (krb0) this.c;
                Context context = (Context) this.d;
                Poll poll = (Poll) krb0Var.m;
                if (poll != null && (owner = poll.w) != null) {
                    g2v.c().d().m(context, owner.b, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                    break;
                }
                break;
            case 3:
                v3g0 v3g0Var = (v3g0) this.c;
                gzs gzsVar = (gzs) this.d;
                TextView textView = v3g0Var.c;
                if (textView == null) {
                    textView = null;
                }
                if (textView.getText().length() > 0) {
                    gzsVar.invoke();
                    break;
                }
                break;
            default:
                yads.pb.a((yads.pb) this.c, (yads.r90) this.d, view);
                break;
        }
    }
}
