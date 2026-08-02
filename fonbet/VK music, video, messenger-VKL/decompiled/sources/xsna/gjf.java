package xsna;

import androidx.compose.runtime.a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.attachments.api.publish.cta.ClipInvolvementActionButton;
import com.vk.clips.upload.ui.api.entities.cell.ClipUploadItem;
import com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFeatureCell;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.ClipsUploadState;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipAttachedVideoInfo;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadAuthorRelatedData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadDataInternal;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadStaticData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.EasyPromoteData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ProductsData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.TooltipsData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.CellLeftTooltipType;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.ConditionalFeature;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.DisableableFeature;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.HideableFeature;
import com.vk.dto.clips.external.ClipsDraftablePlaylist;
import com.vk.dto.common.Good;
import com.vk.dto.common.clips.ClipsLinkAttachment;
import com.vk.dto.geo.GeoLocation;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.f2s0;
import xsna.fna;
import xsna.jrv;
import xsna.rkp;
import xsna.tlo0;
import xsna.yaf;

/* compiled from: ClipsUploadStateMapper.kt */
/* loaded from: classes17.dex */
public final class gjf implements yzs<ClipsUploadState, izs<? super lbf, ? extends s3q0>, izs<? super yaf.b, ? extends s3q0>, hlf> {
    public final ovu b;
    public final mhd c;

    /* compiled from: ClipsUploadStateMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CellLeftTooltipType.values().length];
            try {
                iArr[CellLeftTooltipType.OPEN_CHANNEL_BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CellLeftTooltipType.TICKET_ACTION_BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public gjf(ovu ovuVar, mhd mhdVar) {
        this.b = ovuVar;
        this.c = mhdVar;
    }

    public static com.vk.clips.upload.ui.api.entities.cell.b a(final ClipsUploadState.Loaded loaded, final izs izsVar) {
        final ConditionalFeature<EasyPromoteData> conditionalFeature = loaded.b.e.k;
        ConditionalFeature.State state = conditionalFeature.c;
        if (state == ConditionalFeature.State.HIDDEN) {
            return null;
        }
        final boolean z = state != ConditionalFeature.State.DISABLED;
        ClipsUploadFeatureCell clipsUploadFeatureCell = ClipsUploadFeatureCell.EasyPromote;
        final int ordinal = clipsUploadFeatureCell.ordinal();
        return new com.vk.clips.upload.ui.api.entities.cell.b(ordinal, new fna.b(R.drawable.vk_icon_advertising_outline_32), tq.h(tlo0.Companion, R.string.clips_publish_easy_promote_title), new tlo0.f(R.string.clips_publish_easy_promote_description), new rkp.a(new jai(1289649687, new yzs() { // from class: xsna.djf
            /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
            
                if ((r4 != null ? r4.d : false) != false) goto L31;
             */
            @Override // xsna.yzs
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                String str;
                q630 q630Var = (q630) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.J(q630Var) ? 4 : 2;
                }
                boolean z2 = true;
                if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1289649687, intValue, -1, "com.vk.clips.upload.vk.ui.impl.fragment.store.ClipsUploadStateMapper.buildAdsEasyPromoteItem.<anonymous> (ClipsUploadStateMapper.kt:313)");
                    }
                    if (ClipsUploadState.Loaded.this.b.d.k.d) {
                        str = zq.a(aVar, 1471458024, R.string.clips_publish_easy_promote_tooltip, aVar, 0);
                    } else {
                        aVar.K(1471560479);
                        aVar.j();
                        str = null;
                    }
                    if (z) {
                        EasyPromoteData easyPromoteData = (EasyPromoteData) conditionalFeature.b;
                    }
                    z2 = false;
                    izs izsVar2 = izsVar;
                    boolean J = aVar.J(izsVar2);
                    int i = ordinal;
                    boolean o = J | aVar.o(i);
                    Object x = aVar.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (o || x == c0012a) {
                        x = new wr4(izsVar2, i, 1);
                        aVar.R(x);
                    }
                    gzs gzsVar = (gzs) x;
                    boolean J2 = aVar.J(izsVar2) | aVar.o(i);
                    Object x2 = aVar.x();
                    if (J2 || x2 == c0012a) {
                        x2 = new ajf(izsVar2, i, 0);
                        aVar.R(x2);
                    }
                    izs izsVar3 = (izs) x2;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1279597620, 24576, -1, "com.vk.clips.upload.vk.ui.impl.fragment.view.custom.promote.EasyPromoteRightContent.Companion.invoke (EasyPromoteRightContent.kt:68)");
                    }
                    boolean J3 = aVar.J(str) | aVar.J(gzsVar);
                    Object x3 = aVar.x();
                    if (J3 || x3 == c0012a) {
                        x3 = new gwo(str, gzsVar, izsVar3, z2);
                        aVar.R(x3);
                    }
                    gwo gwoVar = (gwo) x3;
                    ((zak0) gwoVar.a).setValue(str);
                    ((zak0) gwoVar.b).setValue(gzsVar);
                    ((zak0) gwoVar.c).setValue(izsVar3);
                    ((zak0) gwoVar.d).setValue(Boolean.valueOf(z2));
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    gwoVar.a(q630Var, aVar, intValue & 14);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            }
        }, true)), z, null, clipsUploadFeatureCell.i(), 704);
    }

    public static com.vk.clips.upload.ui.api.entities.cell.b c(ClipsUploadState.Loaded loaded) {
        EasyPromoteData easyPromoteData;
        ConditionalFeature<EasyPromoteData> conditionalFeature = loaded.b.e.k;
        ConditionalFeature.State state = conditionalFeature.c;
        EasyPromoteData easyPromoteData2 = conditionalFeature.b;
        if (state == ConditionalFeature.State.HIDDEN || state == ConditionalFeature.State.DISABLED || (easyPromoteData = easyPromoteData2) == null || !easyPromoteData.d) {
            return null;
        }
        ClipsUploadFeatureCell clipsUploadFeatureCell = ClipsUploadFeatureCell.EasyPromoteSettings;
        int ordinal = clipsUploadFeatureCell.ordinal();
        tlo0.a aVar = tlo0.Companion;
        int i = easyPromoteData.b;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(easyPromoteData.c)};
        aVar.getClass();
        return new com.vk.clips.upload.ui.api.entities.cell.b(ordinal, new fna.c(new lq2(1)), new tlo0.f(R.string.clips_publish_easy_promote_title), tlo0.a.a(R.plurals.clips_publish_easy_promote_settings_subtitle, i, objArr), rkp.e.a, true, null, clipsUploadFeatureCell.i(), 704);
    }

    public static ClipUploadItem.b d(final ClipsUploadState.Loaded loaded, final izs izsVar, final izs izsVar2) {
        ClipsUploadDataInternal clipsUploadDataInternal = loaded.b;
        ClipsUploadAuthorRelatedData clipsUploadAuthorRelatedData = clipsUploadDataInternal.e;
        final HideableFeature<ClipInvolvementActionButton<?>> hideableFeature = clipsUploadAuthorRelatedData.f;
        final ClipInvolvementActionButton<?> clipInvolvementActionButton = clipsUploadAuthorRelatedData.g;
        ClipsUploadStaticData clipsUploadStaticData = clipsUploadDataInternal.d;
        final boolean z = clipsUploadStaticData.m;
        final boolean z2 = clipsUploadStaticData.p;
        if (!hideableFeature.c) {
            return null;
        }
        final int ordinal = ClipsUploadFeatureCell.EcommInvolvement.ordinal();
        return new ClipUploadItem.b(ordinal, new jai(-1233210657, new yzs() { // from class: xsna.cjf
            @Override // xsna.yzs
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                boolean z3;
                T t = hideableFeature.b;
                q630 q630Var = (q630) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.J(q630Var) ? 4 : 2;
                }
                boolean z4 = false;
                if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1233210657, intValue, -1, "com.vk.clips.upload.vk.ui.impl.fragment.store.ClipsUploadStateMapper.buildCtaAttachmentItem.<anonymous> (ClipsUploadStateMapper.kt:577)");
                    }
                    ClipInvolvementActionButton clipInvolvementActionButton2 = ClipInvolvementActionButton.this;
                    boolean z5 = z;
                    final izs izsVar3 = izsVar;
                    final int i = ordinal;
                    izs izsVar4 = izsVar2;
                    Object obj4 = a.C0011a.a;
                    if (clipInvolvementActionButton2 != null) {
                        aVar.K(571650782);
                        if (t != 0) {
                            z3 = false;
                            z4 = true;
                        } else {
                            z3 = false;
                        }
                        boolean z6 = (z5 && (clipInvolvementActionButton2 instanceof ClipInvolvementActionButton.OpenChannel)) ? true : z3;
                        boolean J = aVar.J(izsVar3) | aVar.o(i);
                        Object x = aVar.x();
                        if (J || x == obj4) {
                            x = new gzs() { // from class: xsna.tif
                                @Override // xsna.gzs
                                public final Object invoke() {
                                    izs.this.invoke(new yaf.b.g(i));
                                    return s3q0.a;
                                }
                            };
                            aVar.R(x);
                        }
                        gzs gzsVar = (gzs) x;
                        boolean J2 = aVar.J(izsVar4);
                        Object x2 = aVar.x();
                        if (J2 || x2 == obj4) {
                            x2 = new me0(izsVar4, 3);
                            aVar.R(x2);
                        }
                        mkk.a(clipInvolvementActionButton2, z4, z6, gzsVar, (gzs) x2, ahn.E(q630Var, ClipsUploadFeatureCell.EcommInvolvement.i()), aVar, 0);
                        aVar.j();
                    } else {
                        aVar.K(572583727);
                        ClipInvolvementActionButton clipInvolvementActionButton3 = (ClipInvolvementActionButton) t;
                        CellLeftTooltipType cellLeftTooltipType = null;
                        qow qowVar = clipInvolvementActionButton3 != null ? new qow(clipInvolvementActionButton3) : null;
                        TooltipsData tooltipsData = loaded.b.d.k;
                        if (z5) {
                            cellLeftTooltipType = CellLeftTooltipType.OPEN_CHANNEL_BUTTON;
                        } else if (z2) {
                            cellLeftTooltipType = CellLeftTooltipType.TICKET_ACTION_BUTTON;
                        }
                        CellLeftTooltipType cellLeftTooltipType2 = cellLeftTooltipType;
                        boolean J3 = aVar.J(izsVar3) | aVar.o(i);
                        Object x3 = aVar.x();
                        if (J3 || x3 == obj4) {
                            x3 = new uif(i, 0, izsVar3);
                            aVar.R(x3);
                        }
                        gzs gzsVar2 = (gzs) x3;
                        boolean J4 = aVar.J(izsVar3) | aVar.o(i);
                        Object x4 = aVar.x();
                        if (J4 || x4 == obj4) {
                            x4 = new vif(i, 0, izsVar3);
                            aVar.R(x4);
                        }
                        gzs gzsVar3 = (gzs) x4;
                        boolean J5 = aVar.J(izsVar3) | aVar.o(i);
                        Object x5 = aVar.x();
                        if (J5 || x5 == obj4) {
                            x5 = new wif(izsVar3, i, 0);
                            aVar.R(x5);
                        }
                        izs izsVar5 = (izs) x5;
                        boolean J6 = aVar.J(izsVar4);
                        Object x6 = aVar.x();
                        if (J6 || x6 == obj4) {
                            x6 = new v7b(izsVar4, 1);
                            aVar.R(x6);
                        }
                        ikk.a(qowVar, tooltipsData, cellLeftTooltipType2, gzsVar2, gzsVar3, izsVar5, (izs) x6, ahn.E(q630Var, ClipsUploadFeatureCell.EcommInvolvement.i()), aVar, 0);
                        aVar.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            }
        }, true), false);
    }

    public static com.vk.clips.upload.ui.api.entities.cell.b e(ClipsUploadState.Loaded loaded) {
        tlo0 d;
        tlo0.h hVar;
        GeoLocation geoLocation = loaded.b.d.j;
        int ordinal = ClipsUploadFeatureCell.Geolocation.ordinal();
        fna.b bVar = new fna.b(R.drawable.vk_icon_place_outline_28);
        if (geoLocation == null) {
            d = tq.h(tlo0.Companion, R.string.clips_publish_add_geolocation);
        } else {
            tlo0.a aVar = tlo0.Companion;
            String str = geoLocation.i;
            if (str == null) {
                str = "";
            }
            d = oq.d(aVar, str);
        }
        tlo0 tlo0Var = d;
        List list = null;
        String str2 = geoLocation != null ? geoLocation.k : null;
        if (str2 == null || str2.length() == 0) {
            hVar = null;
        } else {
            tlo0.a aVar2 = tlo0.Companion;
            String str3 = geoLocation != null ? geoLocation.k : null;
            if (str3 == null) {
                str3 = "";
            }
            hVar = oq.d(aVar2, str3);
        }
        rkp rkpVar = geoLocation == null ? rkp.e.a : rkp.d.a;
        List<GeoLocation> list2 = loaded.g;
        if (list2.isEmpty() || geoLocation != null) {
            list2 = null;
        }
        if (list2 != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (myc0.f(((GeoLocation) obj).i)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                GeoLocation geoLocation2 = (GeoLocation) it.next();
                int i = geoLocation2.b;
                tlo0.a aVar3 = tlo0.Companion;
                String str4 = geoLocation2.i;
                if (str4 == null) {
                    str4 = "";
                }
                arrayList2.add(new pdf(i, oq.d(aVar3, str4), null));
            }
            list = j5g.v0(new pdf(-1, tq.h(tlo0.Companion, R.string.clips_publish_suggested_geolocation_search_item), Integer.valueOf(R.drawable.vk_icon_search_20)), arrayList2);
        }
        if (list == null) {
            list = EmptyList.b;
        }
        return new com.vk.clips.upload.ui.api.entities.cell.b(ordinal, bVar, tlo0Var, hVar, rkpVar, true, list, ClipsUploadFeatureCell.Geolocation.i(), 640);
    }

    public static com.vk.clips.upload.ui.api.entities.cell.b g(ClipsUploadState.Loaded loaded) {
        tlo0 h;
        ConditionalFeature<ClipsLinkAttachment> conditionalFeature = loaded.b.e.b;
        ConditionalFeature.State state = conditionalFeature.c;
        tlo0.h hVar = null;
        if (state == ConditionalFeature.State.HIDDEN) {
            return null;
        }
        ClipsLinkAttachment clipsLinkAttachment = conditionalFeature.b;
        boolean z = state == ConditionalFeature.State.DISABLED;
        ClipsUploadFeatureCell clipsUploadFeatureCell = ClipsUploadFeatureCell.LinksAttach;
        int ordinal = clipsUploadFeatureCell.ordinal();
        fna.b bVar = new fna.b(R.drawable.vk_icon_chain_outline_28);
        if (clipsLinkAttachment == null || z) {
            h = tq.h(tlo0.Companion, R.string.clips_publish_add_links_item);
        } else {
            tlo0.a aVar = tlo0.Companion;
            String str = clipsLinkAttachment.b;
            if (str == null) {
                str = "";
            }
            h = oq.d(aVar, str);
        }
        if (clipsLinkAttachment != null && !z) {
            tlo0.a aVar2 = tlo0.Companion;
            String str2 = clipsLinkAttachment.c;
            hVar = oq.d(aVar2, str2 != null ? str2 : "");
        }
        return new com.vk.clips.upload.ui.api.entities.cell.b(ordinal, bVar, h, hVar, z ? new rkp.b(tq.h(tlo0.Companion, R.string.clips_publish_links_item_unavailable_accessibility)) : clipsLinkAttachment == null ? rkp.e.a : rkp.d.a, loaded.b.e.b.c == ConditionalFeature.State.SHOWN, null, clipsUploadFeatureCell.i(), 704);
    }

    public static com.vk.clips.upload.ui.api.entities.cell.b h(final ClipsUploadState.Loaded loaded, final izs izsVar, final izs izsVar2) {
        HideableFeature<ProductsData> hideableFeature = loaded.b.d.l;
        if (!hideableFeature.c) {
            return null;
        }
        List<Good> list = hideableFeature.b.b;
        ClipsUploadFeatureCell clipsUploadFeatureCell = ClipsUploadFeatureCell.MarketAttachments;
        final int ordinal = clipsUploadFeatureCell.ordinal();
        final boolean z = loaded.b.d.o && list.isEmpty();
        return new com.vk.clips.upload.ui.api.entities.cell.b(clipsUploadFeatureCell.ordinal(), new fna.a(new jai(140445880, new yzs() { // from class: xsna.fjf
            @Override // xsna.yzs
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                q630 q630Var = (q630) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.J(q630Var) ? 4 : 2;
                }
                if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(140445880, intValue, -1, "com.vk.clips.upload.vk.ui.impl.fragment.store.ClipsUploadStateMapper.buildMarketAttachmentItem.<anonymous> (ClipsUploadStateMapper.kt:535)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2102857096, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-MarketOutline28> (VkSdkIcons.kt:2496)");
                    }
                    lg90 b = or.b(aVar, 177409129, R.drawable.vk_icon_market_outline_28, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j = ylu0Var.getIcon().a;
                    String str = z ? loaded.b.d.k.c : null;
                    izs izsVar3 = izsVar;
                    boolean J = aVar.J(izsVar3);
                    int i = ordinal;
                    boolean o = J | aVar.o(i);
                    izs izsVar4 = izsVar2;
                    boolean J2 = o | aVar.J(izsVar4);
                    Object x = aVar.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (J2 || x == c0012a) {
                        x = new e59(izsVar3, i, izsVar4, 1);
                        aVar.R(x);
                    }
                    gzs gzsVar = (gzs) x;
                    Object x2 = aVar.x();
                    if (x2 == c0012a) {
                        x2 = new z34(5);
                        aVar.R(x2);
                    }
                    jrv.a.a(b, j, str, gzsVar, (gzs) x2, aVar).a(q630Var, aVar, intValue & 14);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            }
        }, true)), !list.isEmpty() ? hq.b(tlo0.Companion, R.plurals.clips_publish_add_market_item_count_goods_title, list.size()) : tq.h(tlo0.Companion, R.string.clips_publish_add_market_item_from_publication), null, rkp.e.a, true, null, clipsUploadFeatureCell.i(), IronSourceError.ERROR_NT_INSTANCE_INIT_EXCEPTION);
    }

    public static ClipUploadItem.b k(final ClipsUploadState.Loaded loaded, final izs izsVar) {
        if (!loaded.b.e.e.c) {
            return null;
        }
        final int ordinal = ClipsUploadFeatureCell.Playlists.ordinal();
        return new ClipUploadItem.b(ordinal, new jai(-1162114441, new yzs() { // from class: xsna.kif
            @Override // xsna.yzs
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                q630 q630Var = (q630) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.J(q630Var) ? 4 : 2;
                }
                if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1162114441, intValue, -1, "com.vk.clips.upload.vk.ui.impl.fragment.store.ClipsUploadStateMapper.buildPlaylistItem.<anonymous> (ClipsUploadStateMapper.kt:472)");
                    }
                    ClipsDraftablePlaylist clipsDraftablePlaylist = ClipsUploadState.Loaded.this.b.e.e.b;
                    veb0 veb0Var = clipsDraftablePlaylist != null ? new veb0(clipsDraftablePlaylist.c, clipsDraftablePlaylist.d) : null;
                    final izs izsVar2 = izsVar;
                    boolean J = aVar.J(izsVar2);
                    final int i = ordinal;
                    boolean o = J | aVar.o(i);
                    Object x = aVar.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (o || x == c0012a) {
                        x = new gzs() { // from class: xsna.yif
                            @Override // xsna.gzs
                            public final Object invoke() {
                                izs.this.invoke(new yaf.b.C4088b(i));
                                return s3q0.a;
                            }
                        };
                        aVar.R(x);
                    }
                    gzs gzsVar = (gzs) x;
                    boolean J2 = aVar.J(izsVar2) | aVar.o(i);
                    Object x2 = aVar.x();
                    if (J2 || x2 == c0012a) {
                        x2 = new gzs() { // from class: xsna.zif
                            @Override // xsna.gzs
                            public final Object invoke() {
                                izs.this.invoke(new yaf.b.e(i));
                                return s3q0.a;
                            }
                        };
                        aVar.R(x2);
                    }
                    z7b0.a(veb0Var, gzsVar, (gzs) x2, ahn.E(q630Var, ClipsUploadFeatureCell.Playlists.i()), aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            }
        }, true), false);
    }

    public final ClipUploadItem.b l(ClipsUploadState.Loaded loaded, final izs izsVar) {
        final f2s0 aVar;
        final int ordinal = ClipsUploadFeatureCell.VideoAttachment.ordinal();
        DisableableFeature<ClipAttachedVideoInfo> disableableFeature = loaded.b.e.h;
        if (disableableFeature.c) {
            ClipAttachedVideoInfo clipAttachedVideoInfo = disableableFeature.b;
            if (clipAttachedVideoInfo != null) {
                ClipAttachedVideoInfo clipAttachedVideoInfo2 = clipAttachedVideoInfo;
                aVar = new f2s0.b(clipAttachedVideoInfo2.b, clipAttachedVideoInfo2.c);
            } else {
                aVar = new f2s0.a(false);
            }
        } else {
            aVar = new f2s0.a(true);
        }
        return new ClipUploadItem.b(ordinal, new jai(1987553537, new yzs() { // from class: xsna.bjf
            @Override // xsna.yzs
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                q630 q630Var = (q630) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar2.J(q630Var) ? 4 : 2;
                }
                if (aVar2.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1987553537, intValue, -1, "com.vk.clips.upload.vk.ui.impl.fragment.store.ClipsUploadStateMapper.buildVideoAttachmentItem.<anonymous> (ClipsUploadStateMapper.kt:650)");
                    }
                    q630 E = ahn.E(s200.H(q630Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, gjf.this.c.n() ? 12 : 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), ClipsUploadFeatureCell.VideoAttachment.i());
                    VideoFeatures videoFeatures = VideoFeatures.VIDEO_CLIP_ATTACH_VIDEO;
                    videoFeatures.getClass();
                    boolean a2 = com.vk.toggle.b.A.a(videoFeatures);
                    izs izsVar2 = izsVar;
                    boolean J = aVar2.J(izsVar2);
                    int i = ordinal;
                    boolean o = J | aVar2.o(i);
                    Object x = aVar2.x();
                    Object obj4 = a.C0011a.a;
                    if (o || x == obj4) {
                        x = new rif(izsVar2, i, 0);
                        aVar2.R(x);
                    }
                    gzs gzsVar = (gzs) x;
                    boolean J2 = aVar2.J(izsVar2) | aVar2.o(i);
                    Object x2 = aVar2.x();
                    if (J2 || x2 == obj4) {
                        x2 = new sif(i, 0, izsVar2);
                        aVar2.R(x2);
                    }
                    glf.b(aVar, a2, gzsVar, (gzs) x2, E, aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            }
        }, true), false);
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    @Override // xsna.yzs
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final xsna.hlf invoke(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r64v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
}
