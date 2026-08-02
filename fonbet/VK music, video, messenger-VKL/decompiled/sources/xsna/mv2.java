package xsna;

import com.vk.stat.scheme.SchemeStat$TypeQuestionItem;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class mv2 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mv2(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        int i2 = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                com.vk.profile.questions.impl.a aVar = (com.vk.profile.questions.impl.a) obj;
                int i3 = com.vk.profile.questions.impl.a.o1;
                aVar.bo(SchemeStat$TypeQuestionItem.Type.MESSAGE_SENT);
                ((p870) aVar.n1.getValue()).d(123, Integer.MIN_VALUE, Integer.valueOf(i2));
                aVar.dismiss();
                break;
            default:
                ((rg50) obj).C(i2);
                break;
        }
        return s3q0.a;
    }
}
