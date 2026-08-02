package xsna;

import android.graphics.Bitmap;
import com.google.android.ump.ConsentInformation;
import com.vk.attachpicker.stickers.post.attach.StoryAttachImageView;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListLargeVh;
import com.vk.catalog2.feature.music.configuration.a;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.donut.video.model.domain.action.DonutVideoAction;
import com.vk.donut.video.model.domain.analytics.source.DonutVideoClickSource;
import com.vk.dto.stickers.PopupStickersChatSettingsModel;
import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;
import com.vk.voip.ui.asr.ui.list.PastAsrListFragment;
import java.util.Iterator;
import java.util.List;
import xsna.c0b0;
import xsna.hn90;
import xsna.ihn0;
import xsna.lau;
import xsna.nau;
import xsna.u550;
import xsna.vf40;
import xsna.ymq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class mau implements ConsentInformation.a, io.reactivex.rxjava3.functions.l, h9l, SwipeDrawableRefreshLayout.g, c0b0.a, r580, io.reactivex.rxjava3.functions.c, yads.ng1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mau(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (s3q0) ((yu70) this.c).invoke(obj, obj2);
    }

    @Override // xsna.r580
    public void c(DonutVideoAction donutVideoAction) {
        ((VideoItemListLargeVh) this.c).k(donutVideoAction, DonutVideoClickSource.DESCRIPTION);
    }

    @Override // com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout.g
    public void h() {
        ((PastAsrListFragment) this.c).Q.a(hn90.e.a);
    }

    @Override // yads.ng1
    public void invoke(Object obj) {
        ((yads.nf2) obj).a(((yads.df2) this.c).n);
    }

    @Override // com.google.android.ump.ConsentInformation.a
    public void onConsentInfoUpdateFailure(d8s d8sVar) {
        nau nauVar = (nau) this.c;
        List<lau.a> a = nauVar.c.a();
        nauVar.c = new nau.a.b();
        Iterator<T> it = a.iterator();
        while (it.hasNext()) {
            ((lau.a) it.next()).b(new g2q0(d8sVar.a, d8sVar.b));
        }
    }

    @Override // xsna.h9l
    public g9l provide() {
        return new zfa0((oga0) this.c);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 1:
                return (kiu) ((ci7) obj2).invoke(obj);
            case 2:
            case 10:
            case 11:
            default:
                return (VoipActionsFeatureState.m) ((z7w) obj2).invoke(obj);
            case 3:
                return (ybx0) ((z7w) obj2).invoke(obj);
            case 4:
                return (io.reactivex.rxjava3.core.t) ((srg) obj2).invoke(obj);
            case 5:
                return (hda) ((a.c) obj2).invoke(obj);
            case 6:
                return (hda) ((vf40.b) obj2).invoke(obj);
            case 7:
                return (hda) ((u550.c) obj2).invoke(obj);
            case 8:
                return (ass) ((ut30) obj2).invoke(obj);
            case 9:
                return (Boolean) ((z7w) obj2).invoke(obj);
            case 12:
                return (PopupStickersChatSettingsModel) ((z7w) obj2).invoke(obj);
            case 13:
                return (Boolean) ((z7w) obj2).invoke(obj);
            case 14:
                int i2 = StoryAttachImageView.t;
                return (Bitmap) ((ut30) obj2).invoke(obj);
            case 15:
                return ((ihn0.b.a) obj2).invoke(obj);
            case 16:
                return ((owp0) obj2).invoke(obj);
            case 17:
                return ((ymq0.c) obj2).invoke(obj);
        }
    }
}
