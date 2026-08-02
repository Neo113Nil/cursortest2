package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.vk.newsfeed.impl.posting.PostingFragment;
import com.vk.photos.root.albumdetails.presentation.AlbumDetailsFragment;
import com.vk.photos.root.albumdetails.presentation.i;
import kotlin.text.Regex;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class rg1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rg1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        int i2 = this.b;
        Object obj = this.c;
        switch (i2) {
            case 0:
                int i3 = AlbumDetailsFragment.p0;
                ((i.p) obj).d.invoke();
                break;
            case 1:
                ((l6f) obj).invoke();
                break;
            case 2:
                ((w76) obj).invoke();
                break;
            default:
                PostingFragment postingFragment = (PostingFragment) obj;
                ikc0 ikc0Var = postingFragment.h0;
                if (!ikc0Var.H7() && (str = ikc0Var.F0) != null) {
                    String U = drm0.U(str, "file://");
                    Regex regex = com.vk.core.files.a.a;
                    vhk0.c(U);
                }
                bkc0 bkc0Var = ikc0Var.t;
                sbc0 sbc0Var = ikc0Var.x;
                if (sbc0Var == null) {
                    sbc0Var = null;
                }
                int i4 = sbc0Var.I;
                bkc0Var.getClass();
                if (i4 >= 0) {
                    Intent putExtra = new Intent("publishSuggestAction").putExtra("publishSuggestId", i4);
                    Context context = e43.a;
                    cuz.a(context != null ? context : null).c(putExtra);
                }
                postingFragment.finish();
                break;
        }
    }
}
