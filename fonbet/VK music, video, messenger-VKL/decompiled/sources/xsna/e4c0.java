package xsna;

import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.photo.Photo;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.PhotoAttachment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class e4c0 implements izs {
    public final /* synthetic */ f4c0 b;
    public final /* synthetic */ l6z c;
    public final /* synthetic */ q6z d;
    public final /* synthetic */ izs e;

    public /* synthetic */ e4c0(f4c0 f4c0Var, l6z l6zVar, q6z q6zVar, izs izsVar) {
        this.b = f4c0Var;
        this.c = l6zVar;
        this.d = q6zVar;
        this.e = izsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        PhotoAttachment Mb;
        Photo photo;
        Throwable th = (Throwable) obj;
        c6z c6zVar = this.c.a;
        f4c0 f4c0Var = this.b;
        f4c0Var.d.getClass();
        q6z q6zVar = this.d;
        o2f0 o2f0Var = q6zVar.b;
        if (o2f0Var != null) {
            Integer num = q6zVar.c;
            Integer num2 = q6zVar.d;
            Integer num3 = q6zVar.e;
            Integer num4 = q6zVar.f;
            Integer num5 = q6zVar.g;
            if (num != null && num2 != null) {
                o2f0Var.ub(num.intValue(), num2.intValue());
            }
            o2f0Var.j9(num);
            if (num3 != null) {
                o2f0Var.E6(num3.intValue());
            }
            if (num4 != null && num5 != null) {
                o2f0Var.ub(num4.intValue(), num5.intValue());
            }
            o2f0Var.G2();
        }
        c6zVar.f(q6zVar.a);
        c6zVar.f0(q6zVar.h);
        f4c0Var.c.remove(Long.valueOf(c6zVar.hashCode()));
        j03.l(th);
        ce60 ce60Var = ce60.b;
        ce60Var.getClass();
        p870.f().e(102, (NewsEntry) c6zVar);
        if ((c6zVar instanceof Photos) && (Mb = ((Photos) c6zVar).Mb()) != null && (photo = Mb.l) != null) {
            ce60Var.getClass();
            p870.f().e(113, photo);
        }
        izs izsVar = this.e;
        if (izsVar != null) {
        }
        return s3q0.a;
    }
}
