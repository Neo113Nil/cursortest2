package xsna;

import android.view.View;
import com.vk.clips.design.view.feed.item.owner.ClipSubscribeBtnView;
import com.vk.im.ui.fragments.SimpleDialogsFilterFragment;
import xsna.hxo;
import xsna.t5z0;
import xsna.zn30;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class wcd implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wcd(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i2 = ClipSubscribeBtnView.c;
                ((com.vk.movika.sdk.base.observable.p) obj).invoke(view);
                break;
            case 1:
                jmm jmmVar = (jmm) obj;
                jmmVar.l.v(jmmVar.t);
                break;
            case 2:
                iio iioVar = ((wio) obj).e.c;
                (iioVar != null ? iioVar : null).a(d02.p);
                break;
            case 3:
                ((qxo) obj).d.invoke(hxo.i.b);
                break;
            case 4:
                ((zxs) obj).u.a.t.invoke();
                break;
            case 5:
                ((e4w) obj).a();
                break;
            case 6:
                zn30.a aVar = ((zn30) obj).k;
                if (aVar != null) {
                    aVar.a();
                    break;
                }
                break;
            case 7:
                qcy<Object>[] qcyVarArr = SimpleDialogsFilterFragment.Y;
                ((SimpleDialogsFilterFragment) obj).Mf(0, null);
                break;
            case 8:
                androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) obj;
                if (dVar != null) {
                    dVar.dismiss();
                    break;
                }
                break;
            default:
                ((t5z0.a) obj).e();
                break;
        }
    }
}
