package xsna;

import com.vk.appredirects.activity.BaseLinkRedirectActivity;
import com.vk.channels.impl.list.g;
import com.vk.dto.masks.Mask;
import com.vk.dto.masks.MasksCatalogItem;
import com.vk.im.channelcreation.impl.c;
import com.vk.im.ui.fragments.dialogtheme.ImSettingsDialogThemeFragment;
import com.vkontakte.android.actionlinks.views.fragments.addpoll.AddPollView;
import java.util.ArrayList;
import java.util.List;
import xsna.l8j;
import xsna.xeg;
import xsna.yqm;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class cz implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cz(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((bz) obj2).invoke(obj);
                break;
            case 1:
                ((bz) obj2).invoke(obj);
                break;
            case 2:
                int i2 = AddPollView.R;
                ((com.vk.movika.sdk.base.observable.e) obj2).invoke(obj);
                break;
            case 3:
                ((yf1) obj2).invoke(obj);
                break;
            case 4:
                ((xv2) obj2).invoke(obj);
                break;
            case 5:
                ((f66) obj2).invoke(obj);
                break;
            case 6:
                int i3 = BaseLinkRedirectActivity.g;
                ((bz) obj2).invoke(obj);
                break;
            case 7:
                ((i37) obj2).invoke(obj);
                break;
            case 8:
                ((com.vk.movika.sdk.base.observable.e) obj2).invoke(obj);
                break;
            case 9:
                ((n8) obj2).invoke(obj);
                break;
            case 10:
                ((bz) obj2).invoke(obj);
                break;
            case 11:
                ((com.vk.im.channelcreation.impl.b) obj2).m(c.C1094c.a);
                break;
            case 12:
                ((ju) obj2).invoke(obj);
                break;
            case 13:
                com.vk.channels.impl.list.b bVar = (com.vk.channels.impl.list.b) obj2;
                Throwable th = (Throwable) obj;
                bVar.s().b(th, new ob0(3));
                bVar.n(new g.b(th));
                break;
            case 14:
                ((q2c) obj2).invoke(obj);
                break;
            case 15:
                ((com.vk.movika.sdk.base.observable.e) obj2).invoke(obj);
                break;
            case 16:
                ((ju) obj2).invoke(obj);
                break;
            case 17:
                ((xeg.a) obj2).invoke(obj);
                break;
            case 18:
                ((mre) obj2).invoke(obj);
                break;
            case 19:
                ((l8j.f) obj2).invoke(obj);
                break;
            case 20:
                ((yqm.c) obj2).invoke(obj);
                break;
            case 21:
                ((oce) obj2).invoke(obj);
                break;
            case 22:
                ((uoh) obj2).invoke(obj);
                break;
            case 23:
                ((uoh) obj2).invoke(obj);
                break;
            case 24:
                ((bz) obj2).invoke(obj);
                break;
            case 25:
                ((kmu) obj2).invoke(obj);
                break;
            case 26:
                ((d9w) obj2).a((Throwable) obj);
                break;
            case 27:
                int i4 = ImSettingsDialogThemeFragment.c0;
                ((ImSettingsDialogThemeFragment.d) obj2).invoke(obj);
                break;
            case 28:
                Mask mask = (Mask) obj2;
                List list = (List) obj;
                if (list.size() > 0) {
                    for (int i5 = 0; i5 < list.size(); i5++) {
                        ArrayList<Mask> arrayList = ((MasksCatalogItem) list.get(i5)).c;
                        if (arrayList != null) {
                            int i6 = 0;
                            while (true) {
                                if (i6 < arrayList.size()) {
                                    Mask mask2 = arrayList.get(i6);
                                    if (mask2.d == mask.d) {
                                        mask2.m = false;
                                    } else {
                                        i6++;
                                    }
                                }
                            }
                        }
                    }
                    wmi0.a.m("masks_catalog", list);
                    break;
                }
                break;
            default:
                ((pqz) obj2).invoke(obj);
                break;
        }
    }
}
