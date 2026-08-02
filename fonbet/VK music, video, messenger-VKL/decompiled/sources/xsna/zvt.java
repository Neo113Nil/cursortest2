package xsna;

import com.vkontakte.android.attachments.AudioPlaylistAttachment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class zvt implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zvt(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                gwt gwtVar = (gwt) this.c;
                if (!((Boolean) obj).booleanValue()) {
                    ((e8e0) gwtVar.d.getValue()).c();
                }
                break;
            default:
                ((p870) ((ek40) this.c).b.getValue()).e(120, new AudioPlaylistAttachment(((c8b0) obj).a));
                break;
        }
        return s3q0.a;
    }
}
