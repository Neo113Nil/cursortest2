package xsna;

import android.view.View;
import com.vk.dto.stories.model.clickable.ClickablePhotoAlbum;
import xsna.pbt0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class dkc implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dkc(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                qkc qkcVar = (qkc) this.c;
                ClickablePhotoAlbum clickablePhotoAlbum = (ClickablePhotoAlbum) this.d;
                qkcVar.m(clickablePhotoAlbum);
                izs<ClickablePhotoAlbum, Boolean> izsVar = qkcVar.d.g;
                if (izsVar != null) {
                    izsVar.invoke(clickablePhotoAlbum);
                    break;
                }
                break;
            case 1:
                xkt xktVar = (xkt) this.c;
                ykt yktVar = (ykt) this.d;
                ebx ebxVar = xktVar.m;
                yktVar.getClass();
                ebxVar.invoke(1);
                break;
            default:
                pbt0.a aVar = (pbt0.a) this.c;
                pbt0 pbt0Var = (pbt0) this.d;
                mbt0 mbt0Var = aVar.n;
                if (mbt0Var != null) {
                    pbt0Var.d.invoke(mbt0Var);
                    break;
                }
                break;
        }
    }
}
