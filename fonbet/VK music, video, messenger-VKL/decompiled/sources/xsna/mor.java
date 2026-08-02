package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class mor implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mor(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        izs<? super Integer, s3q0> izsVar;
        switch (this.b) {
            case 0:
                qor qorVar = (qor) this.d;
                qorVar.requestLayout();
                qorVar.invalidate();
                if (!qorVar.g && (izsVar = qorVar.d) != null) {
                    izsVar.invoke(Integer.valueOf(this.c));
                }
                break;
            case 1:
                com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.c cVar = (com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.c) this.d;
                cVar.c.a();
                com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.d dVar = cVar.c;
                dVar.g(this.c, false);
                dVar.c();
                break;
            default:
                ((izs) this.d).invoke(Integer.valueOf(this.c));
                break;
        }
        return s3q0.a;
    }
}
