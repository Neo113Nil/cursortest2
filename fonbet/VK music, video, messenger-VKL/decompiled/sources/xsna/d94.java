package xsna;

import com.vk.catalog2.feature.music.ui.holder.MusicCatalogRootVh;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.t24;

/* compiled from: AttachmentsPostingViewController.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class d94 extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d94(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return qjg.a(this.receiver);
            case 1:
                t24.e eVar = ((x24) this.receiver).e;
                if (eVar != null) {
                    eVar.onClick();
                }
                return s3q0.a;
            case 2:
                ((seh) this.receiver).c.invoke(CommunityProfileAction.e.k.b);
                return s3q0.a;
            case 3:
                hym.T6((hym) this.receiver);
                return s3q0.a;
            case 4:
                ((MusicCatalogRootVh) this.receiver).getClass();
                return Boolean.valueOf(com.vk.toggle.d.K());
            default:
                return (Boolean) ((mcy) this.receiver).get();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d94(Object obj, int i) {
        super(0, obj, x24.class, "onRightButtonClick", "onRightButtonClick()V", 0);
        this.b = i;
        switch (i) {
            case 2:
                super(0, obj, seh.class, "sendUnsubscribe", "sendUnsubscribe()V", 0);
                break;
            default:
                break;
        }
    }
}
