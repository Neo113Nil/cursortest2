package xsna;

import com.vk.dto.tags.Tag;
import com.vkontakte.android.attachments.PhotoAttachment;
import xsna.skm0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class gba0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ gba0(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return Boolean.valueOf((((Boolean) ((gzs) this.c).invoke()).booleanValue() || ((Boolean) ((gzs) this.d).invoke()).booleanValue() || ((Boolean) ((gzs) this.e).invoke()).booleanValue()) ? false : true);
            case 1:
                bp50 bp50Var = (bp50) this.c;
                b520 b520Var = (b520) this.d;
                skm0.a aVar = (skm0.a) this.e;
                bp50Var.d(b520Var);
                aVar.q0();
                return s3q0.a;
            case 2:
                ((x0o0) this.c).j(((PhotoAttachment) this.d).l, (Tag) this.e);
                return s3q0.a;
            default:
                dmb0 dmb0Var = (dmb0) this.c;
                bpn0 bpn0Var = (bpn0) this.d;
                bpn0 bpn0Var2 = (bpn0) this.e;
                zhf0 zhf0Var = (zhf0) bpn0Var.getValue();
                zhf0 zhf0Var2 = (zhf0) bpn0Var2.getValue();
                float f = zhf0Var.c;
                float f2 = wrp0.b;
                return new zhf0(f, dmb0Var.I0(f2), zhf0Var2.a, dmb0Var.I0(f2 + wrp0.e));
        }
    }
}
