package xsna;

import android.content.Context;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.vk.api.generated.market.dto.MarketHasPinnedCommunityReviewResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.catalog2.common.ui.mvp.holder.stories.MusicClipsSelectorCatalogRootVh;
import com.vk.core.compose.component.defaults.PlaceholderMode;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.c;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.log.L;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.music.view.ThumbsImageView;
import com.vk.newsfeed.impl.helpers.a;
import com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerState;
import com.vk.photo.editor.features.filter.FilterUiModel;
import com.vk.photo.editor.features.filter.a;
import com.vk.voip.ui.sessionrooms.dialog.model.a;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.drz;
import xsna.dug0;
import xsna.l110;
import xsna.tj50;
import xsna.tlo0;
import xsna.v9i0;
import xsna.vn20;
import xsna.yl70;
import xsna.zrz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class per implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ per(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v48, types: [android.view.View, com.vk.core.view.components.placeholder.main.VkPlaceholder] */
    /* JADX WARN: Type inference failed for: r9v0, types: [xsna.tlo0] */
    /* JADX WARN: Type inference failed for: r9v2, types: [com.vk.core.view.components.placeholder.main.VkPlaceholder$c] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2;
        a.C1457a c1457a;
        zhf0 rightExtraRect;
        VkPlaceholder.a.b bVar;
        VkPlaceholder.b bVar2;
        VkPlaceholder.Mode mode;
        VkPlaceholder.c cVar;
        int i = 10;
        int i2 = 5;
        int i3 = 6;
        int i4 = 2;
        int i5 = 4;
        boolean z = true;
        z = true;
        ?? r9 = 0;
        switch (this.b) {
            case 0:
                com.vk.photo.editor.ivm.filter.c cVar2 = (com.vk.photo.editor.ivm.filter.c) obj;
                ArrayList arrayList = new ArrayList();
                List<FilterUiModel> list = cVar2.b;
                ArrayList arrayList2 = new ArrayList();
                for (FilterUiModel filterUiModel : list) {
                    if (filterUiModel.f != FilterUiModel.Type.SUB_FILTER) {
                        c1457a = new a.C1457a(filterUiModel);
                    } else {
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj2 = it.next();
                                if (epx.f(((FilterUiModel) obj2).a, filterUiModel.g)) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        FilterUiModel filterUiModel2 = (FilterUiModel) obj2;
                        c1457a = (filterUiModel2 == null || !filterUiModel2.d) ? null : new a.C1457a(filterUiModel);
                    }
                    if (c1457a != null) {
                        arrayList2.add(c1457a);
                    }
                }
                arrayList.addAll(arrayList2);
                if (cVar2.e) {
                    for (int i6 = 0; i6 < 5; i6++) {
                        arrayList.add(a.b.a);
                    }
                }
                return arrayList;
            case 1:
                return air.b('\"', "\"", (String) obj);
            case 2:
                List list2 = (List) obj;
                ArrayList arrayList3 = new ArrayList(c5g.u(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(Integer.valueOf(((MediaStoreEntry) it2.next()).getId()));
                }
                return j5g.M0(arrayList3);
            case 3:
                ((Integer) obj).intValue();
                qcy<Object>[] qcyVarArr = GoodFragment.U0;
                return s3q0.a;
            case 4:
                Throwable th = (Throwable) obj;
                return ((th instanceof VKApiExecutionException) && ((VKApiExecutionException) th).s() == 104) ? io.reactivex.rxjava3.core.q.T(new a.C1382a(false, false)) : io.reactivex.rxjava3.core.q.H(th);
            case 5:
                View view = (View) obj;
                VkTopBar vkTopBar = view instanceof VkTopBar ? (VkTopBar) view : null;
                if (vkTopBar == null || (rightExtraRect = vkTopBar.getRightExtraRect()) == null) {
                    return null;
                }
                return zjq.n(rightExtraRect);
            case 6:
                return frx.h((erx) obj);
            case 7:
                zrz.a aVar = (zrz.a) obj;
                Object obj3 = aVar.a;
                if (!aVar.e && !aVar.d) {
                    z = false;
                }
                return new drz.a(obj3, z);
            case 8:
                L.i((Throwable) obj);
                return s3q0.a;
            case 9:
                tj50.a aVar2 = (tj50.a) obj;
                zsw zswVar = new zsw(i5);
                ao8 ao8Var = ao8.d;
                return new lx00(aVar2.a(zswVar, ao8Var), aVar2.a(new b4r(i), ao8Var), aVar2.a(new uuz(i4), ao8Var), aVar2.a(new ept(i3), ao8Var));
            case 10:
                return new l110.b(((tj50.a) obj).a(new zsw(i2), ao8.d));
            case 11:
                int i7 = ua20.k1;
                return s3q0.a;
            case 12:
                ?? r1 = (VkPlaceholder) obj;
                vn20 vn20Var = vn20.a;
                int i8 = vn20.d.$EnumSwitchMapping$0[((vn20.a) ((zak0) vn20.i).getValue()).ordinal()];
                if (i8 == 1) {
                    bVar = null;
                } else if (i8 == 2) {
                    VkPlaceholder.a.C0857a c0857a = null;
                    bVar = new VkPlaceholder.a.b(new VkPlaceholder.a.C0857a(oq.d(tlo0.Companion, "Button"), new qo0(22), (VkPlaceholder.a.C0857a.C0858a) null, (VkPlaceholder.a.C0857a.C0858a) null, (VkButton.Size) null, VkButton.Mode.Secondary, (VkButton.Appearance) null, vn20.e(), 188), c0857a, c0857a, null, 8);
                } else if (i8 == 3) {
                    bVar = new VkPlaceholder.a.b(new VkPlaceholder.a.C0857a(oq.d(tlo0.Companion, "Button"), new uw3(21), (VkPlaceholder.a.C0857a.C0858a) null, (VkPlaceholder.a.C0857a.C0858a) null, (VkButton.Size) null, (VkButton.Mode) null, (VkButton.Appearance) null, vn20.e(), 252), new VkPlaceholder.a.C0857a((tlo0) new tlo0.h("Button"), (gzs) new l9(19), (VkPlaceholder.a.C0857a.C0858a) null, (VkPlaceholder.a.C0857a.C0858a) (false ? 1 : 0), (VkButton.Size) (false ? 1 : 0), VkButton.Mode.Tertiary, (VkButton.Appearance) null, vn20.e(), 188), false ? 1 : 0, false ? 1 : 0, 8);
                } else {
                    if (i8 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    VkPlaceholder.a.C0857a c0857a2 = new VkPlaceholder.a.C0857a(oq.d(tlo0.Companion, "Button"), new x5(25), (VkPlaceholder.a.C0857a.C0858a) null, (VkPlaceholder.a.C0857a.C0858a) null, (VkButton.Size) null, (VkButton.Mode) null, (VkButton.Appearance) null, vn20.e(), 252);
                    tlo0.h hVar = new tlo0.h("Button");
                    VkButton.Mode mode2 = VkButton.Mode.Tertiary;
                    bVar = new VkPlaceholder.a.b(c0857a2, new VkPlaceholder.a.C0857a((tlo0) hVar, (gzs) new re0(23), (VkPlaceholder.a.C0857a.C0858a) null, (VkPlaceholder.a.C0857a.C0858a) (false ? 1 : 0), (VkButton.Size) (false ? 1 : 0), mode2, (VkButton.Appearance) null, vn20.e(), 188), new VkPlaceholder.a.C0857a((tlo0) new tlo0.h("Button"), (gzs) new se0(24), (VkPlaceholder.a.C0857a.C0858a) (false ? 1 : 0), (VkPlaceholder.a.C0857a.C0858a) null, (VkButton.Size) (false ? 1 : 0), mode2, (VkButton.Appearance) null, vn20.e(), 188), false ? 1 : 0, 8);
                }
                r1.setBottom(bVar);
                int i9 = vn20.d.$EnumSwitchMapping$1[((vn20.b) ((zak0) vn20.h).getValue()).ordinal()];
                int i10 = 14;
                if (i9 == 1) {
                    bVar2 = null;
                } else if (i9 == 2) {
                    bVar2 = new VkPlaceholder.b(new VkPlaceholder.b.c(i4, oq.d(tlo0.Companion, "Lorem ipsum")), new VkPlaceholder.b.C0859b(i10, r9));
                } else if (i9 == 3) {
                    bVar2 = new VkPlaceholder.b(new VkPlaceholder.b.c(i4, (tlo0) r9), new VkPlaceholder.b.C0859b(i10, oq.d(tlo0.Companion, "Lorem ipsum dolor sit amet, consectetur adipiscing elit")));
                } else {
                    if (i9 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar2 = new VkPlaceholder.b(new VkPlaceholder.b.c(i4, oq.d(tlo0.Companion, "Lorem ipsum")), new VkPlaceholder.b.C0859b(i10, new tlo0.h("Lorem ipsum dolor sit amet, consectetur adipiscing elit")));
                }
                r1.setMiddle(bVar2);
                int i11 = vn20.d.$EnumSwitchMapping$2[((vn20.c) ((zak0) vn20.g).getValue()).ordinal()];
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            cVar = new VkPlaceholder.c.b(new gko(R.drawable.vk_icon_globe_cross_outline_56), null, null, 14);
                        } else if (i11 == 4) {
                            cVar = new VkPlaceholder.c.a(new c.d(vn20.e, null), 0, null, 14);
                        } else {
                            if (i11 != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            cVar = new VkPlaceholder.c.d(new c.d(vn20.f, null), 0, 14);
                        }
                        r9 = cVar;
                    } else {
                        r9 = new VkPlaceholder.c.C0860c(new slw(m33.a(R.drawable.vk_icon_illustration_people_in_circle_110h, r1.getContext())), new Size(iah0.a(230), iah0.a(110)), null, null, 28);
                    }
                }
                r1.setTop(r9);
                int i12 = vn20.d.$EnumSwitchMapping$3[((PlaceholderMode) ((zak0) vn20.j).getValue()).ordinal()];
                if (i12 == 1) {
                    mode = VkPlaceholder.Mode.Primary;
                } else if (i12 == 2) {
                    mode = VkPlaceholder.Mode.Overlay;
                } else {
                    if (i12 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mode = VkPlaceholder.Mode.Primary;
                }
                r1.setMode(mode);
                return s3q0.a;
            case 13:
                bn40.c((Throwable) obj, new Object[0]);
                return s3q0.a;
            case 14:
                MusicClipsSelectorCatalogRootVh.a aVar3 = MusicClipsSelectorCatalogRootVh.J;
                return new ThumbsImageView((Context) obj, null, 6, 0);
            case 15:
                return Boolean.valueOf(((MusicPickerState) obj).h);
            case 16:
                return ((xhp0) ((whp0) obj)).a.b;
            case 17:
                qgi0.r((tgi0) obj, "trackName");
                return s3q0.a;
            case 18:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 19:
                return ((yl70.b) ((li2) obj).f()).a() ? xh2.c(anp.e(jq2.d(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 90, null, 4), 2).b(anp.g(jq2.d(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 90, null, 4))), anp.f(jq2.d(90, 0, null, 6), 2)) : new llj(qpp.a, d5q.a, 4);
            case 20:
                return Boolean.valueOf(((MarketHasPinnedCommunityReviewResponseDto) obj).d());
            case 21:
                return Float.valueOf(((sy40) obj).y);
            case 22:
                return Integer.valueOf(((Boolean) obj).booleanValue() ? R.string.music_talkback_player_radio_pause : R.string.music_talkback_player_radio_play);
            case 23:
                return ((v9i0.d) obj).c;
            case 24:
                return ((a.b) obj).c;
            case 25:
                return Boolean.valueOf(on60.a.contains(fpf0.a(obj.getClass())));
            case 26:
                int a = ((ery) obj).a() / 3;
                Integer valueOf = a > 0 ? Integer.valueOf(a) : null;
                return new tfu(n34.a(valueOf != null ? valueOf.intValue() : 1));
            case 27:
                return new pgy((ViewGroup) obj);
            case 28:
                return Boolean.valueOf(((nov) obj) instanceof dh9);
            default:
                return Boolean.valueOf(((dug0.c) obj).c());
        }
    }
}
