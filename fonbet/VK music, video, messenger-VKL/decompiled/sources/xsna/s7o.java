package xsna;

import android.content.DialogInterface;
import com.vk.catalog2.feature.music.ui.holder.MusicDownloadsHistoryCatalogRootVh;
import com.vk.newsfeed.impl.posting.PostingFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class s7o implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s7o(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        Object obj = this.c;
        switch (i2) {
            case 0:
                ((MusicDownloadsHistoryCatalogRootVh.a) obj).invoke();
                dialogInterface.dismiss();
                break;
            case 1:
                ((yb40) obj).a();
                break;
            default:
                int i3 = PostingFragment.s0;
                ((gkc0) obj).invoke();
                break;
        }
    }
}
