package xsna;

import android.os.Bundle;
import com.vk.attachpicker.PhotoVideoAttachActivity;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.dto.market.order.OrderPaymentParameters;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.newsfeed.common.recycler.holders.attachments.market.FeedGoodsPhotoHolder;
import com.vk.stories.StorySettingsActivity;
import com.vk.stories.design.view.archive.StoryArchiveFastScrollView;
import xsna.s8z0;
import xsna.wed0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class bx80 implements io.reactivex.rxjava3.functions.l, t4d0, pcs, io.reactivex.rxjava3.functions.m, FeedGoodsPhotoHolder.b, StoryArchiveFastScrollView.a, w6u0, io.reactivex.rxjava3.functions.c, io.reactivex.rxjava3.functions.b, s8z0.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bx80(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.t4d0
    public void a(MediaStoreEntry mediaStoreEntry) {
        gmj gmjVar = ((PhotoVideoAttachActivity) this.c).Z;
        if (gmjVar != null) {
            gmjVar.invoke(mediaStoreEntry);
        }
    }

    @Override // io.reactivex.rxjava3.functions.b
    public void accept(Object obj, Object obj2) {
        ((com.vk.movika.tools.controls.seekbar.s) this.c).invoke(obj, obj2);
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (Boolean) ((zdi) this.c).invoke(obj, obj2);
    }

    public void b(Throwable th) {
        mwa0 mwa0Var = (mwa0) this.c;
        xu10 xu10Var = mwa0Var.d;
        if (xu10Var != null) {
            xu10Var.a(new awa0(th));
        }
        f100 f100Var = mwa0Var.a.d;
        if (f100Var != null) {
            f100Var.a("PlaybackProcessor", th);
        }
    }

    @Override // com.vk.newsfeed.common.recycler.holders.attachments.market.FeedGoodsPhotoHolder.b
    public FeedGoodsPhotoHolder.GoodsVisibilityState getState() {
        FeedGoodsPhotoHolder.GoodsVisibilityState goodsVisibilityState;
        gvj0 b7 = ((cvj0) this.c).b7();
        return (b7 == null || (goodsVisibilityState = b7.c) == null) ? FeedGoodsPhotoHolder.GoodsVisibilityState.NOT_DRAWN : goodsVisibilityState;
    }

    @Override // xsna.s8z0.a
    public void i(z9z0 z9z0Var) {
        ((ajz0) this.c).k = z9z0Var;
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        cfd0 cfd0Var = (cfd0) this.c;
        qcy<Object>[] qcyVarArr = cfd0.q1;
        if (str.hashCode() == -300393027 && str.equals("request_donut_teaser")) {
            if (cfd0Var.isAdded()) {
                cfd0Var.getChildFragmentManager().f("request_donut_teaser");
            }
            if (bundle.containsKey("result_donut_teaser")) {
                cfd0Var.getFeature().C(new wed0.j(bundle.getString("result_donut_teaser")));
            }
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 5:
                return ((Boolean) ((svz) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((qzl0) this.c).invoke(obj)).booleanValue();
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (OrderPaymentParameters) ((i37) obj2).invoke(obj);
            case 1:
                return (StoryEntry) ((i37) obj2).invoke(obj);
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 13:
            default:
                return ((gzs) obj2).invoke();
            case 8:
                return (StickerItem) ((qzl0) obj2).invoke(obj);
            case 9:
                return (Narrative) ((fxi0) obj2).invoke(obj);
            case 10:
                int i2 = StorySettingsActivity.P;
                return (io.reactivex.rxjava3.core.e) ((zyl0) obj2).invoke(obj);
            case 11:
                return (SdkVideoFile) ((snj0) obj2).invoke(obj);
            case 12:
                return (io.reactivex.rxjava3.core.t) ((snj0) obj2).invoke(obj);
            case 14:
                return (io.reactivex.rxjava3.core.b0) ((vi6) obj2).invoke(obj);
        }
    }
}
