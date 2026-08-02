package xsna;

import com.vk.channels.impl.list.g;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class igb implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ igb(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((com.vk.channels.impl.list.b) this.c).n(g.a.a);
                break;
            case 1:
                ((dpd) this.c).j = false;
                break;
            default:
                ((sg60) this.c).q = null;
                break;
        }
    }
}
