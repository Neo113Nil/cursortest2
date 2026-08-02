package xsna;

import androidx.compose.runtime.a;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.unity3d.services.UnityAdsConstants;
import com.vk.bridges.ImageViewer;
import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.catalog2.common.ui.mvp.holder.music.MusicSubsectionFilterButtonVh;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.dto.attaches.AttachForMediaViewer;
import com.vk.dto.photo.Photo;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.bonus.StickersBonusResult;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.libvideo.bottomsheet.about.delegate.f0;
import com.vk.libvideo.design.compose.base.trimmer.TrimmerBound;
import com.vk.music.player.playback.PlaybackLaunchMeta;
import com.vk.photos.root.photoflow.presentation.a;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.b9a0;
import xsna.lrp0;
import xsna.pox0;
import xsna.q630;
import xsna.tlo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class wn7 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wn7(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        StickersBonusResult stickersBonusResult;
        tlo0.a aVar;
        int i;
        jrp0 a;
        int i2 = this.b;
        int i3 = 2;
        char c = 1;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i2) {
            case 0:
                ((Integer) obj2).getClass();
                ((xn7) obj4).a((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 1:
                List list = (List) obj4;
                List<? extends AttachForMediaViewer> list2 = (List) obj;
                List<? extends AttachForMediaViewer> list3 = (List) obj2;
                ChatFragment.d dVar = ChatFragment.w1;
                list.addAll(0, list2);
                list.addAll(list3);
                ImageViewer.c<AttachForMediaViewer> cVar = ((ChatFragment) obj3).w0;
                if (cVar != null) {
                    cVar.b(list2, list3);
                }
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                okf.a((egf) obj4, (jai) obj3, (androidx.compose.runtime.a) obj, ne7.I(49));
                return s3q0.a;
            case 3:
                rdi.y((gkj) obj4, new mu0(((yij) obj3).b, ((Boolean) obj).booleanValue(), c == true ? 1 : 0));
                return s3q0.a;
            case 4:
                ((Integer) obj2).getClass();
                gyj.c((kyj) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                fwn.a((pox0.a) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(49));
                return s3q0.a;
            case 6:
                d790 d790Var = (d790) obj4;
                t1z t1zVar = (t1z) obj3;
                StickerStockItem stickerStockItem = (StickerStockItem) obj;
                nge0 nge0Var = (nge0) obj2;
                boolean n = d790Var.n();
                StickerStockItem stickerStockItem2 = d790Var.a;
                if (n || !d790Var.q()) {
                    y9l0.a(new s1l0(stickerStockItem2.b));
                    if (stickerStockItem == null) {
                        stickerStockItem = stickerStockItem2;
                    }
                    y9l0.a(new t1l0(stickerStockItem));
                } else {
                    y9l0.a(new q1l0(stickerStockItem2.b));
                }
                is8 is8Var = t1zVar.i;
                if (is8Var != null) {
                    is8Var.c();
                }
                if (nge0Var != null && (stickersBonusResult = nge0Var.l) != null) {
                    new gl7().a(t1zVar.b, stickersBonusResult);
                }
                return s3q0.a;
            case 7:
                ((Integer) obj2).getClass();
                dl10.c((t7o0) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 8:
                CatalogFilterData catalogFilterData = (CatalogFilterData) obj4;
                MusicSubsectionFilterButtonVh musicSubsectionFilterButtonVh = (MusicSubsectionFilterButtonVh) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1522496475, intValue, -1, "com.vk.catalog2.common.ui.mvp.holder.music.MusicSubsectionFilterButtonVh.bindData.<anonymous>.<anonymous> (MusicSubsectionFilterButtonVh.kt:65)");
                    }
                    boolean y = aVar2.y(catalogFilterData);
                    Object x = aVar2.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (y || x == c0012a) {
                        x = new h440(catalogFilterData, i3);
                        aVar2.R(x);
                    }
                    q630 b = egi0.b(q630.a.a, false, (izs) x);
                    ButtonSize buttonSize = ButtonSize.Small;
                    ButtonStyle buttonStyle = catalogFilterData.e ? ButtonStyle.Secondary : ButtonStyle.Tertiary;
                    ButtonAppearance buttonAppearance = ButtonAppearance.Neutral;
                    boolean y2 = aVar2.y(musicSubsectionFilterButtonVh) | aVar2.y(catalogFilterData);
                    Object x2 = aVar2.x();
                    if (y2 || x2 == c0012a) {
                        x2 = new ag1(9, musicSubsectionFilterButtonVh, catalogFilterData);
                        aVar2.R(x2);
                    }
                    bhu0.c((gzs) x2, buttonSize, buttonStyle, buttonAppearance, b, null, null, false, null, null, null, false, kai.c(452789408, new t67(catalogFilterData, i3), aVar2), aVar2, 3120, 384, 4064);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 9:
                ((Integer) obj2).getClass();
                ((vs70) obj4).d((bt70) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 10:
                a.f fVar = (a.f) obj4;
                f4z f4zVar = ((com.vk.photos.root.photoflow.presentation.b) obj3).h;
                if (((Integer) obj2).intValue() == ((Integer) obj).intValue()) {
                    List<Photo> list4 = fVar.b;
                    if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                        Iterator<T> it = list4.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((Photo) it.next()).d == -6) {
                                    r4 = true;
                                }
                            }
                        }
                    }
                    if (fVar.b.size() == 1) {
                        aVar = tlo0.Companion;
                        i = R.string.photo_moved_to_tab;
                    } else if (r4) {
                        aVar = tlo0.Companion;
                        i = R.string.not_all_photos_moved_system;
                    } else {
                        aVar = tlo0.Companion;
                        i = R.string.photos_moved_to_photoflow;
                    }
                    f4zVar.b(new b9a0.k(new j7k0(tq.h(aVar, i), Integer.valueOf(R.drawable.vk_icon_check_circle_outline_28), Integer.valueOf(R.attr.vk_ui_icon_positive), null, null, null, 32)));
                } else {
                    f4zVar.b(new b9a0.k(new j7k0(tq.h(tlo0.Companion, R.string.not_all_photos_moved), Integer.valueOf(R.drawable.vk_icon_warning_triangle_outline_28), Integer.valueOf(R.attr.vk_ui_accent_orange), null, null, null, 32)));
                }
                return s3q0.a;
            case 11:
                com.vk.music.player.playback.c cVar2 = (com.vk.music.player.playback.c) obj4;
                PlaybackLaunchMeta playbackLaunchMeta = (PlaybackLaunchMeta) obj3;
                List<gza0> list5 = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list5, 10));
                for (gza0 gza0Var : list5) {
                    arrayList.add(new gza0(gza0Var.a, UUID.randomUUID().toString(), gza0Var.c, gza0Var.d, playbackLaunchMeta));
                }
                cVar2.g(arrayList);
                return s3q0.a;
            case 12:
                ((Integer) obj2).getClass();
                y4b0.a((v020) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(49));
                return s3q0.a;
            case 13:
                ((Integer) obj2).getClass();
                cef0.d((kef0) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 14:
                ((Integer) obj).intValue();
                ((Integer) obj2).intValue();
                ((izs) obj4).invoke(new ArrayList((SnapshotStateList) obj3));
                return s3q0.a;
            case 15:
                ((Integer) obj2).getClass();
                tno0.a((uno0) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 16:
                lrp0 lrp0Var = (lrp0) obj3;
                ov70 ov70Var = (ov70) obj2;
                TrimmerBound trimmerBound = (TrimmerBound) ((Ref$ObjectRef) obj4).element;
                if (trimmerBound != null) {
                    float intBitsToFloat = Float.intBitsToFloat((int) (ov70Var.a >> 32));
                    lqr lqrVar = lrp0Var.d;
                    jrp0 jrp0Var = (jrp0) ((zak0) lrp0Var.f).getValue();
                    wh50<jrp0> wh50Var = lrp0Var.c;
                    int i4 = lrp0.a.$EnumSwitchMapping$0[trimmerBound.ordinal()];
                    if (i4 == 1) {
                        lqr lqrVar2 = jrp0Var.b;
                        float f = lqrVar2.a + intBitsToFloat;
                        float f2 = -jrp0Var.c;
                        if (f < f2) {
                            f = f2;
                        }
                        float f3 = lqrVar2.b;
                        a = jrp0.a(jrp0Var, new lqr(swe0.f(f, f3 - lqrVar.b, f3 - lqrVar.a), jrp0Var.b.b), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 5);
                    } else if (i4 == 2) {
                        lqr lqrVar3 = jrp0Var.b;
                        float f4 = lqrVar3.b + intBitsToFloat;
                        float f5 = -jrp0Var.c;
                        float f6 = lqrVar.b;
                        float f7 = f5 + f6;
                        if (f4 > f7) {
                            f4 = f7;
                        }
                        float f8 = lqrVar3.a;
                        a = jrp0.a(jrp0Var, new lqr(jrp0Var.b.a, swe0.f(f4, lqrVar.a + f8, f8 + f6)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 5);
                    } else if (i4 == 3) {
                        float f9 = jrp0Var.c;
                        lqr lqrVar4 = jrp0Var.b;
                        float f10 = lqrVar4.a;
                        float f11 = -f9;
                        float f12 = lqrVar4.b;
                        float f13 = swe0.f(intBitsToFloat, f11 - f10, (f11 + lqrVar.b) - f12);
                        a = jrp0.a(jrp0Var, new lqr(f10 + f13, f12 + f13), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 5);
                    } else {
                        if (i4 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        float f14 = lqrVar.b - lrp0Var.e;
                        float f15 = jrp0Var.c;
                        float f16 = swe0.f(intBitsToFloat, f14 - f15, -f15);
                        lqr lqrVar5 = jrp0Var.b;
                        a = jrp0.a(jrp0Var, new lqr(lqrVar5.a - f16, lqrVar5.b - f16), jrp0Var.c + f16, 1);
                    }
                    ((zak0) wh50Var).setValue(a);
                }
                return s3q0.a;
            default:
                f0.a aVar3 = (f0.a) obj4;
                com.vk.libvideo.bottomsheet.about.delegate.f0 f0Var = (com.vk.libvideo.bottomsheet.about.delegate.f0) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1825622437, intValue2, -1, "com.vk.libvideo.bottomsheet.about.delegate.VideoDescriptionDelegate.ViewHolder.<anonymous> (VideoDescriptionDelegate.kt:127)");
                    }
                    rrv0.e(true, null, null, null, null, null, kai.c(671569022, new yn7(15, aVar3, f0Var), aVar4), aVar4, 1572870, 62);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ wn7(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
