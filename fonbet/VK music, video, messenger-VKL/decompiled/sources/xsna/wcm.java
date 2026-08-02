package xsna;

import kotlin.jvm.internal.Ref$BooleanRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class wcm implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wcm(long j, Object obj, int i) {
        this.b = i;
        this.c = j;
        this.d = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.d;
                final hpm e = ((xgl0) obj).b().e();
                dhl0<com.vk.im.engine.models.dialogs.b, Long> dhl0Var = e.c;
                final long j = this.c;
                dhl0Var.a(Long.valueOf(j), new py(22), new izs() { // from class: xsna.qom
                    @Override // xsna.izs
                    public final Object invoke(Object obj2) {
                        e.b.b().execSQL("\n                        UPDATE dialogs\n                        SET conversation_bar_buttons = NULL,\n                            conversation_bar_type = NULL, conversation_bar_title = NULL, conversation_bar_subtitle = NULL,\n                            conversation_bar_content = NULL, conversation_bar_imageurl = NULL, conversation_bar_id = NULL\n                        WHERE id = ?\n                        ", new Long[]{Long.valueOf(j)});
                        return s3q0.a;
                    }
                });
                ref$BooleanRef.element = true;
                break;
            default:
                mtk0 mtk0Var = (mtk0) this.d;
                ggj ggjVar = (ggj) obj;
                ggjVar.s1();
                oio.P(ggjVar, this.c, ((zhf0) mtk0Var.getValue()).e(), ((zhf0) mtk0Var.getValue()).d(), 0.3f, null, 0, 112);
                break;
        }
        return s3q0.a;
    }
}
