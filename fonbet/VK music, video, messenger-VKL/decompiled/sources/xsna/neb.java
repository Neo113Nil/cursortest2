package xsna;

import com.vk.im.engine.models.channels.ChannelsCounters;
import java.util.ArrayList;

/* compiled from: ChannelsCountChangeLpTask.kt */
/* loaded from: classes2.dex */
public final class neb extends e500 {
    public final w2w c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final boolean g;
    public boolean h;

    public neb(w2w w2wVar, Integer num, Integer num2, Integer num3) {
        super("ChannelsCountChangeLpTask");
        this.c = w2wVar;
        this.d = num;
        this.e = num2;
        this.f = num3;
        this.g = (num == null && num2 == null && num3 == null) ? false : true;
    }

    @Override // xsna.e500
    public final void a(c400 c400Var, f400 f400Var) {
        f400Var.l = c400Var.m == null;
        if (this.d == null || this.e == null) {
            return;
        }
        f400Var.k = false;
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        if (this.g && this.h) {
            z300Var.X = true;
        }
    }

    @Override // xsna.e500
    public final void d(c400 c400Var) {
        if (!this.g || c400Var.a()) {
            return;
        }
        xgl0 I0 = this.c.I0();
        uib a = I0.a();
        int j = I0.system().j();
        ArrayList arrayList = new ArrayList();
        Integer num = this.d;
        if (num != null) {
            arrayList.add(new com.vk.im.engine.models.channels.a(ChannelsCounters.Type.UNREAD, num.intValue(), j));
        }
        Integer num2 = this.e;
        if (num2 != null) {
            arrayList.add(new com.vk.im.engine.models.channels.a(ChannelsCounters.Type.UNREAD_UNMUTED, num2.intValue(), j));
        }
        Integer num3 = this.f;
        if (num3 != null) {
            arrayList.add(new com.vk.im.engine.models.channels.a(ChannelsCounters.Type.ARCHIVED, num3.intValue(), j));
        }
        a.i(arrayList);
        this.h = true;
        Boolean bool = c400Var.m;
        if (bool != null) {
            o25.a().y(bool.booleanValue());
            this.h = true;
        }
    }
}
