package xsna;

import com.vk.attachpicker.stickers.post.attach.StoryAttachImageView;
import com.vk.im.ui.fragments.SharedChatsFragment;
import com.vk.log.L;
import com.vk.upload.impl.UploadNotification;
import xsna.xll0;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class lw30 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lw30(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((rxz) obj2).invoke(obj);
                break;
            case 1:
                ((rxz) obj2).invoke(obj);
                break;
            case 2:
                ((kr60) obj2).c(new yo60.g.a((Throwable) obj));
                break;
            case 3:
                ((lx60) obj2).invoke(obj);
                break;
            case 4:
                ((el30) obj2).invoke(obj);
                break;
            case 5:
                ((rxz) obj2).invoke(obj);
                break;
            case 6:
                ((ut6) obj2).invoke(obj);
                break;
            case 7:
                ((zsw) obj2).invoke(obj);
                break;
            case 8:
                ((rxz) obj2).invoke(obj);
                break;
            case 9:
                ((go6) obj2).invoke(obj);
                break;
            case 10:
                ((rxz) obj2).invoke(obj);
                break;
            case 11:
                ((rxz) obj2).invoke(obj);
                break;
            case 12:
                int i2 = SharedChatsFragment.V;
                ((ioh) obj2).invoke(obj);
                break;
            case 13:
                ((fpl0) obj2).c(new xll0.a.t((Throwable) obj));
                break;
            case 14:
                int i3 = StoryAttachImageView.t;
                ((u2k0) obj2).invoke(obj);
                break;
            case 15:
                ((lx60) obj2).invoke(obj);
                break;
            case 16:
                UploadNotification.b bVar = (UploadNotification.b) obj;
                L.e("Upload RxBus: (" + bVar.a + "): state:" + bVar.b + ' ' + bVar.c + '/' + bVar.d);
                ((izs) obj2).invoke(bVar);
                break;
            case 17:
                ((sxl0) obj2).invoke(obj);
                break;
            case 18:
                ((ti30) obj2).invoke(obj);
                break;
            case 19:
                ((lx60) obj2).invoke(obj);
                break;
            case 20:
                ((sxl0) obj2).invoke(obj);
                break;
            case 21:
                ((lx60) obj2).invoke(obj);
                break;
            default:
                ((lp1) obj2).invoke(obj);
                break;
        }
    }
}
