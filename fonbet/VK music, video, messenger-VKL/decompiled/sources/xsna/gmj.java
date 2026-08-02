package xsna;

import android.content.Context;
import android.text.Spannable;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.gestures.Orientation;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.market.dto.MarketUserReviewsItemsResponseObjectDto;
import com.vk.attachpicker.adapter.PhotoSmallAdapter;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.attachpicker.widget.GalleryRecyclerView;
import com.vk.catalog2.common.ui.mvp.friend.FriendsCatalogFragment;
import com.vk.content.design.view.camera.MasksWrap;
import com.vk.core.apps.BuildInfo;
import com.vk.core.dynamic_loader.b;
import com.vk.core.preference.Preference;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.Hint;
import com.vk.dto.masks.Mask;
import com.vk.dto.masks.MaskSection;
import com.vk.dto.stickers.MsgFooterBannerConfig;
import com.vk.dto.stories.model.mention.StoryMentionSpan;
import com.vk.im.engine.models.conversations.BotKeyboard;
import com.vk.im.engine.models.dialogs.DialogTheme;
import com.vk.lists.ListDataSet;
import com.vk.masks.MasksController;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.music.haptic.MusicHapticEvent;
import com.vk.newsfeed.impl.postmodal.ModalPostCommonFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.eqo;
import xsna.gm50;
import xsna.j7u;
import xsna.kbl0;
import xsna.qy40;
import xsna.tj50;
import xsna.u430;
import xsna.unu;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class gmj implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gmj(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f8  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        long floatToRawIntBits;
        int floatToRawIntBits2;
        ListDataSet.ArrayListImpl arrayListImpl;
        Integer g;
        RecyclerView recyclerView;
        lxy lxyVar;
        int i = this.b;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        lxy lxyVar2 = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                oy40 oy40Var = (oy40) obj2;
                float floatValue = ((Float) obj).floatValue();
                if (oy40Var.b == Orientation.Vertical) {
                    floatToRawIntBits = Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    floatToRawIntBits2 = Float.floatToRawIntBits(floatValue);
                } else {
                    floatToRawIntBits = Float.floatToRawIntBits(floatValue);
                    floatToRawIntBits2 = Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                long j = (floatToRawIntBits << 32) | (floatToRawIntBits2 & 4294967295L);
                if (oy40Var.c.h(cdi.t(j), 0)) {
                    jw5.o(0, 0, 6, oy40Var.d);
                    s160 s160Var = oy40Var.c;
                    float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                    double d = intBitsToFloat;
                    s160Var.c(((int) (intBitsToFloat >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Math.ceil(d) : Math.floor(d))) * (-1), ((int) (Float.intBitsToFloat((int) (j & 4294967295L)) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Math.ceil(r1) : Math.floor(r1))) * (-1), oy40Var.d, null, 0);
                }
                return s3q0.a;
            case 1:
                Throwable th = (Throwable) obj;
                xam.y.a(th);
                if (((xam) obj2).u != null) {
                    zk70.e(th);
                }
                return s3q0.a;
            case 2:
                f480 f480Var = (f480) obj;
                DialogTheme P0 = ((alm) obj2).h.P0();
                return Boolean.valueOf(P0 != null && epx.f(f480Var.c.b, P0.c.b));
            case 3:
                return com.vk.im.engine.models.dialogs.b.a((com.vk.im.engine.models.dialogs.b) obj, null, null, null, 0, 0, 0, 0, 0, 0, false, null, null, null, null, null, false, null, false, null, null, (BotKeyboard) obj2, false, null, null, null, null, 0, false, false, null, null, 0, null, 0, -268435457, 2097151);
            case 4:
                ((e4n) obj2).l = ((x960) obj).a().b.n;
                return s3q0.a;
            case 5:
                eqo eqoVar = (eqo) obj2;
                b.AbstractC0762b abstractC0762b = (b.AbstractC0762b) obj;
                boolean b = eqoVar.b();
                jqo jqoVar = eqoVar.c;
                if (b) {
                    eqo.a aVar = eqoVar.g;
                    if (aVar != null) {
                        aVar.a(true);
                    }
                    if (BuildInfo.o()) {
                        vpo vpoVar = com.vk.core.dynamic_loader.b.a;
                        com.vk.core.utils.newtork.b.a.getClass();
                        r4 = com.vk.core.utils.newtork.b.d();
                    }
                    jqoVar.b(r4);
                } else {
                    eqo.a aVar2 = eqoVar.g;
                    if (aVar2 != null) {
                        aVar2.a(false);
                    }
                    jqoVar.e();
                }
                jqoVar.d(abstractC0762b, new z90(29));
                if (!(abstractC0762b instanceof b.AbstractC0762b.g) && !(abstractC0762b instanceof b.AbstractC0762b.a) && !(abstractC0762b instanceof b.AbstractC0762b.c)) {
                    if (abstractC0762b instanceof b.AbstractC0762b.d) {
                        jqoVar.c(((b.AbstractC0762b.d) abstractC0762b).a);
                    } else if (abstractC0762b instanceof b.AbstractC0762b.C0763b) {
                        zkb zkbVar = ((b.AbstractC0762b.C0763b) abstractC0762b).a;
                        Context context = eqoVar.a;
                        bpn0 bpn0Var = enj.a;
                        zkbVar.invoke(e3m.h(context));
                    } else {
                        jqoVar.c(0);
                    }
                }
                return s3q0.a;
            case 6:
                ((zg) obj2).invoke();
                return s3q0.a;
            case 7:
                Object obj3 = ((dpp) obj2).o;
                com.vk.auth.enterphone.a aVar3 = (com.vk.auth.enterphone.a) (obj3 != null ? obj3 : null);
                String y0 = aVar3.y0();
                if (y0 != null) {
                    aVar3.z0(aVar3.C, y0);
                }
                return s3q0.a;
            case 8:
                dw20 dw20Var = (dw20) ((Ref$ObjectRef) obj2).element;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 9:
                ((bq60) obj2).a(yo60.e.a.a);
                return s3q0.a;
            case 10:
                dsq dsqVar = (dsq) obj2;
                dsqVar.o.invoke(dsqVar.m);
                return s3q0.a;
            case 11:
                z3s z3sVar = (z3s) obj2;
                return z3sVar.b.c(z3sVar.a.c.e);
            case 12:
                ((FriendsCatalogFragment.b) obj2).a.a(false);
                g620.s(0);
                g620.y(0);
                return s3q0.a;
            case 13:
                return ((axu) obj2).itemView.getContext().getString(R.string.search_global);
            case 14:
                GalleryFragmentImpl galleryFragmentImpl = (GalleryFragmentImpl) obj2;
                MediaStoreEntry mediaStoreEntry = (MediaStoreEntry) obj;
                PhotoSmallAdapter photoSmallAdapter = galleryFragmentImpl.c0;
                if (photoSmallAdapter != null && (arrayListImpl = ((ListDataSet) photoSmallAdapter.c).d) != null && (g = i7o0.g(arrayListImpl, new frg(mediaStoreEntry, 15))) != null) {
                    int intValue = g.intValue();
                    GalleryRecyclerView galleryRecyclerView = galleryFragmentImpl.a0;
                    if (galleryRecyclerView != null && (recyclerView = galleryRecyclerView.getRecyclerView()) != null) {
                        recyclerView.smoothScrollToPosition(intValue);
                    }
                }
                return s3q0.a;
            case 15:
                return new u6u((ViewGroup) obj, (sop) obj2);
            case 16:
                i7u i7uVar = (i7u) obj2;
                gm50.a.a(i7uVar, ((j7u.c) obj).a, new wik(i7uVar, 13));
                i7uVar.l.setRefreshing(false);
                i7uVar.j.setVisibility(8);
                View view = i7uVar.i;
                if (view != null) {
                    view.setVisibility(8);
                }
                RecyclerView recyclerView2 = i7uVar.h;
                if (recyclerView2 != null) {
                    recyclerView2.setVisibility(0);
                }
                i7uVar.g.setVisibility(0);
                return s3q0.a;
            case 17:
                tj50.a aVar4 = (tj50.a) obj;
                lnu lnuVar = lnu.b;
                ao8 ao8Var = ao8.d;
                return new unu.a(aVar4.a(lnuVar, ao8Var), aVar4.a(mnu.b, ao8Var), aVar4.a(nnu.b, ao8Var), aVar4.a(new wik((tnu) obj2, 14), ao8Var), aVar4.a(onu.b, ao8Var), aVar4.a(pnu.b, ao8Var), aVar4.a(qnu.b, ao8Var), aVar4.a(snu.b, ao8Var), aVar4.a(knu.b, ao8Var), aVar4.a(rnu.b, ao8Var));
            case 18:
                ((Boolean) obj).getClass();
                Hint p = pla.e().b().p(((ykw) obj2).l);
                if (p != null) {
                    pla.e().b().s(p);
                }
                return s3q0.a;
            case 19:
                return ((BaseBoolIntDto) obj) == BaseBoolIntDto.YES ? rsg0.w0(new k0y(fkq0.a((UserId) obj2), null, null)) : io.reactivex.rxjava3.core.x.k(k0y.v);
            case 20:
                uxy uxyVar = (uxy) obj2;
                float f2 = -((Float) obj).floatValue();
                wh50<lxy> wh50Var = uxyVar.d;
                if ((f2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || uxyVar.c()) && (f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || uxyVar.e())) {
                    if (Math.abs(uxyVar.o) > 0.5f) {
                        xzw.c("entered drag with non-zero pending scroll");
                    }
                    float f3 = uxyVar.o + f2;
                    uxyVar.o = f3;
                    if (Math.abs(f3) > 0.5f) {
                        float f4 = uxyVar.o;
                        int b2 = an10.b(f4);
                        zak0 zak0Var = (zak0) wh50Var;
                        lxy g2 = ((lxy) zak0Var.getValue()).g(b2, !uxyVar.a);
                        if (g2 != null && (lxyVar = uxyVar.b) != null) {
                            lxy g3 = lxyVar.g(b2, true);
                            if (g3 != null) {
                                uxyVar.b = g3;
                            }
                            if (lxyVar2 == null) {
                                uxyVar.f(lxyVar2, uxyVar.a, true);
                                zq70.A(uxyVar.u);
                                uxyVar.h(f4 - uxyVar.o, lxyVar2);
                            } else {
                                stf0 stf0Var = uxyVar.h;
                                if (stf0Var != null) {
                                    stf0Var.k();
                                }
                                uxyVar.h(f4 - uxyVar.o, (lxy) zak0Var.getValue());
                            }
                        }
                        lxyVar2 = g2;
                        if (lxyVar2 == null) {
                        }
                    }
                    if (Math.abs(uxyVar.o) > 0.5f) {
                        f2 -= uxyVar.o;
                        uxyVar.o = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    }
                    f = f2;
                }
                return Float.valueOf(-f);
            case 21:
                Object obj4 = ((smg) obj2).a;
                return zs00.b(((MarketUserReviewsItemsResponseObjectDto) obj).d());
            case 22:
                MasksWrap masksWrap = (MasksWrap) obj2;
                Mask mask = (Mask) obj;
                int i2 = MasksWrap.e0;
                MasksController masksController = masksWrap.getMasksController();
                if (mask != null) {
                    hi10 hi10Var = masksController.c;
                    ArrayList arrayList = hi10Var.a;
                    if (arrayList.size() >= 2) {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= arrayList.size()) {
                                i3 = -1;
                            } else if (!((Mask) arrayList.get(i3)).Gb(mask)) {
                                i3++;
                            }
                        }
                        if (i3 > 0) {
                            Collections.swap(arrayList, 0, i3);
                        }
                        hi10Var.c();
                    }
                } else {
                    masksController.getClass();
                }
                masksWrap.N.notifyDataSetChanged();
                Serializer.c<MaskSection> cVar = MaskSection.CREATOR;
                masksWrap.B(-1, mask, false);
                return s3q0.a;
            case 23:
                Spannable spannable = (Spannable) obj2;
                i420 i420Var = (i420) obj;
                int spanStart = spannable.getSpanStart(i420Var);
                int spanEnd = spannable.getSpanEnd(i420Var);
                String obj5 = spannable.subSequence(spanStart, spanEnd).toString();
                if (i420Var instanceof b9z) {
                    return new l9z(spanStart, spanEnd, obj5, ((b9z) i420Var).b);
                }
                if (i420Var instanceof ogq0) {
                    return new pgq0(spanStart, ((ogq0) i420Var).b, spanEnd, obj5);
                }
                if (i420Var instanceof StoryMentionSpan) {
                    return new pgq0(spanStart, ((StoryMentionSpan) i420Var).b, spanEnd, obj5);
                }
                return null;
            case 24:
                int i4 = ModalPostCommonFragment.a0;
                ((ModalPostCommonFragment) obj2).no();
                return s3q0.a;
            case 25:
                ((m430) obj2).f.b(new u430.a(false));
                return s3q0.a;
            case 26:
                xi30 xi30Var = (xi30) obj2;
                for (MsgFooterBannerConfig msgFooterBannerConfig : (List) obj) {
                    xi30Var.getClass();
                    HashMap<UserId, kbl0> hashMap = kbl0.b;
                    kbl0 b3 = kbl0.a.b();
                    b3.getClass();
                    String jSONObject = msgFooterBannerConfig.e5().toString();
                    String str = b3.a;
                    String Db = msgFooterBannerConfig.Db();
                    Preference.H(str, (Db.length() <= 0 || drm0.N(Db)) ? "stickers_msg_footer_banner_config" : "stickers_msg_footer_banner_config_".concat(Db), jSONObject);
                }
                xi30Var.getClass();
                HashMap<UserId, kbl0> hashMap2 = kbl0.b;
                Preference.F(System.currentTimeMillis(), kbl0.a.b().a, "stickers_last_msg_footer_banner_config_update_time");
                return s3q0.a;
            case 27:
                ((com.vk.im.ui.components.msg_list.c) obj2).n(new wcj((xl30) obj, 24));
                return s3q0.a;
            case 28:
                eu90 eu90Var = (eu90) obj;
                hy30 hy30Var = ((rw30) obj2).p;
                return new hy30(hy30Var.d, hy30Var.e, null, false, true, hy30Var.h, eu90Var.c ? Source.CACHE : Source.NETWORK, eu90Var, null, 14439);
            default:
                rw40 rw40Var = (rw40) obj2;
                rw40Var.w.b(qy40.a.b.b);
                rw40Var.x.b(MusicHapticEvent.ERROR);
                return s3q0.a;
        }
    }

    public /* synthetic */ gmj(eqo eqoVar, hqo hqoVar) {
        this.b = 5;
        this.c = eqoVar;
    }
}
