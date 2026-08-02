package xsna;

import kotlin.collections.EmptyList;
import xsna.aex0;

/* compiled from: StackSuperrappUiRouter.kt */
/* loaded from: classes6.dex */
public final class jok0 implements aex0.d {
    public final /* synthetic */ zu1 a;
    public final /* synthetic */ com.vk.newsfeed.common.recycler.holders.attachments.a b;

    public jok0(zu1 zu1Var, com.vk.newsfeed.common.recycler.holders.attachments.a aVar) {
        this.a = zu1Var;
        this.b = aVar;
    }

    @Override // xsna.aex0.d
    public final void a() {
        this.a.invoke(EmptyList.b);
    }

    @Override // xsna.aex0.d
    public final void b() {
        this.b.invoke();
    }

    @Override // xsna.aex0.d
    public final void onCancel() {
        this.b.invoke();
    }
}
