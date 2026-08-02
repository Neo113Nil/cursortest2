package xsna;

import android.content.Context;
import androidx.preference.Preference;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.common.links.AwayLink;
import com.vk.dto.common.data.VKList;
import com.vk.dto.masks.Mask;
import com.vk.dto.stickers.PopupStickersChatSettingsModel;
import com.vk.vmoji.character.model.VmojiCharacterModel;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import java.util.List;
import java.util.Optional;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.bg7;
import xsna.qjc;
import xsna.t24;
import xsna.taw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class i3u implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, qjc.a, t24.e, io.reactivex.rxjava3.functions.c, mba, com.vungle.ads.internal.ui.view.b {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i3u(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.qjc.a
    public void I(AwayLink awayLink) {
        ((evu0) this.c).invoke();
    }

    @Override // com.vungle.ads.internal.ui.view.b
    public void a(float f, float f2) {
        com.vungle.ads.internal.ui.view.n.a((com.vungle.ads.internal.ui.view.n) this.c, f, f2);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (bl60) ((udo) obj2).invoke(obj);
            case 1:
                return (Mask) ((d4r) obj2).invoke(obj);
            case 2:
                return (Optional) ((udo) obj2).invoke(obj);
            case 3:
                return (List) ((ym1) obj2).invoke(obj);
            case 4:
                return (tt70) ((d4r) obj2).invoke(obj);
            case 5:
            case 8:
            case 10:
            case 11:
            case 14:
            case 18:
            case 20:
            case 23:
            default:
                return (Boolean) ((ptl0) obj2).invoke(obj);
            case 6:
                return (bq) ((ba40) obj2).invoke(obj);
            case 7:
                return (PopupStickersChatSettingsModel) ((ba40) obj2).invoke(obj);
            case 9:
                return (List) ((ba40) obj2).invoke(obj);
            case 12:
                int i2 = SettingsGeneralFragment.z0;
                Context h = ((Preference) obj2).h();
                bg7.g.getClass();
                return bg7.b.a(h);
            case 13:
                return (hda) ((jhj0) obj2).invoke(obj);
            case 15:
                return (io.reactivex.rxjava3.core.e) ((ptl0) obj2).invoke(obj);
            case 16:
                return (io.reactivex.rxjava3.core.b0) ((svk0) obj2).invoke(obj);
            case 17:
                return (io.reactivex.rxjava3.core.e) ((ptl0) obj2).invoke(obj);
            case 19:
                return (Optional) ((yml0) obj2).invoke(obj);
            case 21:
                return (io.reactivex.rxjava3.core.e) ((yml0) obj2).invoke(obj);
            case 22:
                return (Boolean) ((yml0) obj2).invoke(obj);
            case 24:
                return (VmojiCharacterModel) ((f1p0) obj2).invoke(obj);
            case 25:
                return (io.reactivex.rxjava3.core.t) ((hnq) obj2).invoke(obj);
            case 26:
                return (taw0.b.C3735b) ((yml0) obj2).invoke(obj);
            case 27:
                return (u6x0) ((ptl0) obj2).invoke(obj);
        }
    }

    @Override // xsna.t24.e
    public void onClick() {
        ((yoh0) this.c).Fn();
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 5:
                return ((Boolean) ((d4r) this.c).invoke(obj)).booleanValue();
            case 10:
                return ((Boolean) ((ba40) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((ptl0) this.c).invoke(obj)).booleanValue();
        }
    }

    @Override // xsna.mba
    public void z(int i, UIBlock uIBlock) {
        dcn dcnVar = (dcn) ((Ref$ObjectRef) this.c).element;
        if (dcnVar != null) {
            dcnVar.dismiss();
        }
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        switch (this.b) {
            case 18:
                return (VKList) ((dx7) this.c).invoke(obj, obj2);
            default:
                return (Pair) ((bkh) this.c).invoke(obj, obj2);
        }
    }
}
