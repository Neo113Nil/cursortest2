package xsna;

import com.vk.catalog2.feature.music.ui.holder.MusicDownloadsHistoryCatalogRootVh;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ChannelMessagesLinkLongClickHandler.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class g3b extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g3b(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                d3b.a((d3b) this.receiver);
                break;
            case 1:
                ((i9b) this.receiver).p();
                break;
            case 2:
                ebd ebdVar = (ebd) this.receiver;
                dw20 dw20Var = ebdVar.y;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                ebdVar.y = null;
                break;
            case 3:
                ((ddr) this.receiver).onDismiss();
                break;
            default:
                MusicDownloadsHistoryCatalogRootVh.i0((MusicDownloadsHistoryCatalogRootVh) this.receiver);
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3b(Object obj, int i) {
        super(0, obj, i9b.class, "unpinChannel", "unpinChannel()V", 0);
        this.b = i;
        switch (i) {
            case 2:
                super(0, obj, ebd.class, "bottomSheetDismissAction", "bottomSheetDismissAction()V", 0);
                break;
            case 3:
            default:
                break;
            case 4:
                super(0, obj, MusicDownloadsHistoryCatalogRootVh.class, "downloadAllHistory", "downloadAllHistory()V", 0);
                break;
        }
    }
}
