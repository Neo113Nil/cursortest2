package xsna;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import com.vk.dto.narratives.Narrative;
import com.vk.profile.community.details.impl.contacts.a;
import com.vkontakte.android.R;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.h7u0;
import xsna.mbf;
import xsna.pg00;
import xsna.qg00;
import xsna.yt0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class d5f implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d5f(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                zh.j((Canvas) obj3, (r7z) obj2, ((utx0) obj).b.a);
                break;
            case 1:
                nek0 nek0Var = (nek0) obj2;
                izs izsVar = (izs) obj;
                ((vvr) obj3).y(false);
                if (nek0Var != null) {
                    nek0Var.hide();
                }
                izsVar.invoke(a.c.b);
                break;
            case 2:
                int i2 = h7u0.p;
                h7u0.a c = h7u0.b.c((Context) obj3);
                c.U(R.string.highlight_delete_confirm_message);
                c.c0(R.string.delete, new wyf(1, (yah) obj2, (Narrative) obj));
                c.W(R.string.cancel_request, new o1c());
                c.m();
                break;
            case 3:
                ((izs) obj3).invoke(new mbf.c.x.a((fpa) obj2));
                dw20 dw20Var = (dw20) ((Ref$ObjectRef) obj).element;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                break;
            case 4:
                pg00.b bVar = (pg00.b) obj2;
                ((izs) obj3).invoke(new qg00.e(bVar.a, bVar.d));
                ((wh50) obj).setValue(Boolean.FALSE);
                break;
            case 5:
                break;
            case 6:
                evk0 evk0Var = (evk0) obj3;
                evk0Var.d.invoke(new yt0.h.b(new zt0((String) obj2, null)));
                evk0Var.b.a((Context) obj);
                break;
            default:
                ((ubu0) obj3).S.invoke((lvv0) obj2);
                Pair pair = (Pair) ((Ref$ObjectRef) obj).element;
                if (pair != null) {
                    enj.p((Context) pair.i(), (Intent) pair.j());
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ d5f(f5f f5fVar, Canvas canvas, r7z r7zVar, utx0 utx0Var) {
        this.b = 0;
        this.c = canvas;
        this.d = r7zVar;
        this.e = utx0Var;
    }
}
