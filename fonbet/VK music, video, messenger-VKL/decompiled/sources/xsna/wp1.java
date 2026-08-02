package xsna;

import android.content.DialogInterface;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import xsna.vp1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class wp1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wp1(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i2) {
            case 0:
                int i3 = xp1.l1;
                ((xp1) obj2).getFeature().C(new vp1.b((PhotoAlbum) obj));
                break;
            default:
                ((pgc0) obj2).A6((PostingCreationEntryPoint) obj);
                break;
        }
    }
}
