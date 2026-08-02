package xsna;

import android.location.LocationManager;
import android.view.View;
import com.ironsource.X3;
import com.vk.attachpicker.fragment.gallery.PostingAttachGalleryFragment;
import com.vk.catalog2.feature.music.holders.MusicTrackCellVh;
import com.vk.dto.attaches.AttachmentsArrangementConfig;
import com.vk.dto.common.VideoFile;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.stickers.bonus.StickersBonusRewardsCatalog;
import com.vk.dto.user.UserProfile;
import com.vk.lists.AbstractPaginatedView;
import com.vk.mediastore.system.AlbumEntry;
import com.vk.profile.core.tabs.ui.clips.Clips;
import com.vk.push.common.Logger;
import com.vk.voip.dto.RecordType;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import kotlin.Pair;
import org.json.JSONObject;
import xsna.ub9;
import xsna.uo40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class tuz implements io.reactivex.rxjava3.functions.l, AbstractPaginatedView.e, io.reactivex.rxjava3.functions.c, ub9.c, i0u0, io.reactivex.rxjava3.core.s, yads.eo0, bc80, FunctionWithThrowable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tuz(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    public void a(yads.do0 do0Var) {
        ((yads.ao0) this.c).b(do0Var);
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        switch (this.b) {
            case 10:
                return (String) ((v95) this.c).invoke(obj, obj2);
            case 15:
                return (Pair) ((lq2) this.c).invoke(obj, obj2);
            default:
                return (Boolean) ((lq2) this.c).invoke(obj, obj2);
        }
    }

    @Override // xsna.ub9.c
    public Object attachCompleter(ub9.a aVar) {
        yon0 yon0Var = (yon0) this.c;
        yon0Var.q = aVar;
        return "ClosingDeferrableSurfaceFuture[session=" + yon0Var + X3.j.e;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.lists.AbstractPaginatedView.e
    public void b(int i) {
        PostingAttachGalleryFragment postingAttachGalleryFragment = (PostingAttachGalleryFragment) this.c;
        int i2 = PostingAttachGalleryFragment.p0;
        ((a5t) postingAttachGalleryFragment.n0.getValue()).d();
    }

    @Override // xsna.i0u0
    public View get() {
        return (View) new WeakReference(((olq0) this.c).f).get();
    }

    @Override // xsna.bc80
    public void onSuccess(Object obj) {
        Logger.DefaultImpls.info$default(((ru.rustore.sdk.pushclient.u.d) this.c).g, "Re-subscription result is Success!", null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$OnLayoutChangeListener, java.lang.Object, xsna.qnt0] */
    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(final io.reactivex.rxjava3.core.r rVar) {
        final View view = (View) this.c;
        ?? r1 = new View.OnLayoutChangeListener() { // from class: xsna.qnt0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                rVar.onNext(xnt0.f(view));
            }
        };
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new ynt0(rVar, r1, view));
        } else {
            rVar.onNext(xnt0.f(view));
            if (!rVar.h()) {
                view.addOnLayoutChangeListener(r1);
            }
        }
        rVar.a(new rnt0(view, r1, 0));
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (AlbumEntry) ((cqf) obj2).invoke(obj);
            case 1:
                return (JSONObject) ((rxz) obj2).invoke(obj);
            case 2:
                return (ncq0) ((zsw) obj2).invoke(obj);
            case 3:
                return (Map) ((rxz) obj2).invoke(obj);
            case 4:
                return (hda) ((uo40.c) obj2).invoke(obj);
            case 5:
                Set<String> set = MusicTrackCellVh.A;
                return (io.reactivex.rxjava3.core.t) ((go6) obj2).invoke(obj);
            case 6:
                return (Boolean) ((zsw) obj2).invoke(obj);
            case 7:
                return (Owner) ((rxz) obj2).invoke(obj);
            case 8:
            case 10:
            case 15:
            case 16:
            case 18:
            case 22:
            default:
                return io.appmetrica.analytics.location.impl.r.a((io.appmetrica.analytics.location.impl.r) obj2, (LocationManager) obj);
            case 9:
                return (AttachmentsArrangementConfig) ((rxz) obj2).invoke(obj);
            case 11:
                return (UserProfile) ((zsw) obj2).invoke(obj);
            case 12:
                return (Pair) ((zsw) obj2).invoke(obj);
            case 13:
                return (StickersBonusRewardsCatalog) ((zsw) obj2).invoke(obj);
            case 14:
                return (io.reactivex.rxjava3.core.t) ((mmm0) obj2).invoke(obj);
            case 17:
                return (Optional) ((lx60) obj2).invoke(obj);
            case 19:
                return (Clips) ((lx60) obj2).invoke(obj);
            case 20:
                return (io.reactivex.rxjava3.core.t) ((hkv) obj2).invoke(obj);
            case 21:
                return (VideoFile) ((weq0) obj2).invoke(obj);
            case 23:
                return (File) ((go6) obj2).invoke(obj);
            case 24:
                return (it80) ((weq0) obj2).invoke(obj);
            case 25:
                return (RecordType) ((weq0) obj2).invoke(obj);
        }
    }
}
