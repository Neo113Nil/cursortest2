package xsna;

import com.vk.biometrics.lock.impl.presentation.base.mvi.settings.e;
import com.vk.dto.common.Attachment;
import com.vk.dto.newsfeed.entries.Post;
import xsna.gnd;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class fc0 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fc0(Attachment attachment, com.vk.newsfeed.impl.presenters.b bVar, Post post) {
        this.b = 3;
        this.d = attachment;
        this.e = bVar;
        this.c = post;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a4  */
    @Override // xsna.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        u1c0 u1c0Var;
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ic0.a((y0u0) this.d, (q630) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(49));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((com.vk.biometrics.lock.impl.presentation.base.mvi.settings.g) this.d).h((e.b.a) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 2:
                ((Integer) obj2).getClass();
                qqz.f((gnd.a) this.d, (izs) this.c, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 3:
                Attachment attachment = (Attachment) this.d;
                com.vk.newsfeed.impl.presenters.b bVar = (com.vk.newsfeed.impl.presenters.b) this.e;
                Post post = (Post) this.c;
                Integer num = (Integer) obj;
                u1c0 u1c0Var2 = (u1c0) obj2;
                ol60 ol60Var = null;
                if (u1c0Var2 instanceof u880) {
                    u880 u880Var = (u880) u1c0Var2;
                    if (lbs.a(u880Var, attachment)) {
                        u1c0Var = lbs.i(u880Var);
                        if (u1c0Var != null) {
                            u1c0Var.n = bVar.i0().M0();
                            ol60 ol60Var2 = u1c0Var2.h;
                            if (ol60Var2 != null) {
                                i2c0 i2c0Var = bVar.R;
                                int i = u1c0Var2.c;
                                i2c0Var.getClass();
                                ol60Var = i2c0.s(i, post, attachment, ol60Var2);
                            }
                            u1c0Var.h = ol60Var;
                            bVar.G.F(num.intValue(), u1c0Var);
                        }
                        break;
                    }
                }
                if (u1c0Var2 instanceof k5i) {
                    k5i k5iVar = (k5i) u1c0Var2;
                    if (epx.f(k5iVar.q, attachment)) {
                        u1c0Var = lbs.g(k5iVar, attachment);
                        if (u1c0Var != null) {
                        }
                    }
                }
                if (u1c0Var2 instanceof lsi) {
                    lsi lsiVar = (lsi) u1c0Var2;
                    if (epx.f(lsiVar.q, attachment)) {
                        u1c0Var = lbs.h(lsiVar, attachment);
                        if (u1c0Var != null) {
                        }
                    }
                }
                if (u1c0Var2 instanceof r74) {
                    r74 r74Var = (r74) u1c0Var2;
                    if (epx.f(r74Var.q, attachment)) {
                        u1c0Var = lbs.d(r74Var, attachment);
                        if (u1c0Var != null) {
                        }
                    }
                }
                u1c0Var = null;
                if (u1c0Var != null) {
                }
            case 4:
                yed0 yed0Var = (yed0) this.d;
                izs izsVar = (izs) this.c;
                q630 q630Var = (q630) this.e;
                ((Integer) obj2).getClass();
                yed0Var.l(ne7.I(513), (androidx.compose.runtime.a) obj, izsVar, q630Var);
                break;
            default:
                ((Integer) obj2).getClass();
                trp0.c((mtk0) this.d, (mtk0) this.c, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ fc0(Object obj, Object obj2, izs izsVar, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = izsVar;
    }

    public /* synthetic */ fc0(Object obj, Object obj2, q630 q630Var, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = obj2;
        this.e = q630Var;
    }
}
