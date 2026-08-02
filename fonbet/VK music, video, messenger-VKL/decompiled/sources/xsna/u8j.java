package xsna;

/* compiled from: MsgSearchAdapterModels.kt */
/* loaded from: classes2.dex */
public class u8j implements com.vk.im.ui.components.msg_search.vc.a {
    public final gyh0<? extends qtd0> b;

    public u8j(gyh0<? extends qtd0> gyh0Var) {
        this.b = gyh0Var;
    }

    @Override // xsna.hfz
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Long getItemId() {
        return Long.valueOf(((qtd0) this.b.a).id());
    }
}
