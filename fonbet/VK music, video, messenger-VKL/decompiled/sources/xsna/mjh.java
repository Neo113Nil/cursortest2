package xsna;

import com.vk.ecomm.moderation.api.restrictions.ModerationRestriction;
import xsna.ljh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class mjh implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Comparable e;
    public final /* synthetic */ Object f;

    public /* synthetic */ mjh(Object obj, Object obj2, Comparable comparable, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = comparable;
        this.f = obj3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ljh.b bVar = (ljh.b) this.c;
                c530 c530Var = (c530) this.d;
                ModerationRestriction moderationRestriction = (ModerationRestriction) this.e;
                f5u f5uVar = (f5u) this.f;
                if (bVar.l.b(c530Var, moderationRestriction)) {
                    return s3q0.a;
                }
                bVar.m.invoke(f5uVar.b);
                return s3q0.a;
            default:
                x7w x7wVar = (x7w) this.c;
                x7w x7wVar2 = (x7w) this.d;
                x7w x7wVar3 = (x7w) this.e;
                x7w x7wVar4 = (x7w) this.f;
                StringBuilder sb = new StringBuilder("IM_ITEMS_LOADER getNewMinWeightForNotEmptyHistory\nInput:\nanchor -> ");
                sb.append(com.vk.im.engine.models.im_item.b.a(x7wVar));
                sb.append("\nremoteBound -> ");
                sb.append(x7wVar2 == null ? null : com.vk.im.engine.models.im_item.b.a(x7wVar2));
                sb.append("\nlocalBound -> ");
                sb.append(x7wVar3 == null ? null : com.vk.im.engine.models.im_item.b.a(x7wVar3));
                sb.append("\nOutput: ");
                sb.append(x7wVar4 != null ? com.vk.im.engine.models.im_item.b.a(x7wVar4) : null);
                return sb.toString();
        }
    }
}
