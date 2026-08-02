package xsna;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogLaunchOrigin;
import com.vk.catalog2.common.dto.api.CatalogOnboardingInfo;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.banner.BannerStyle;
import com.vk.catalog2.common.dto.api.banner.CatalogBannerImageMode;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.dto.ui.UIBlockTitleSubtitleAvatar;
import com.vk.catalog2.common.dto.ui.UIBlockVideoAlbum;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionToggleAlbumSubscription;
import com.vk.catalog2.feature.search.dto.ui.UIBlockSearchEntityVideoPlaylist;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoAlbum;
import com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServicesScreenKt;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import xsna.idh0;
import xsna.kb70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class hy7 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hy7(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17, types: [com.vk.catalog2.common.dto.api.ui.UIBlock] */
    /* JADX WARN: Type inference failed for: r2v18, types: [com.vk.catalog2.feature.search.dto.ui.UIBlockSearchEntityVideoPlaylist] */
    /* JADX WARN: Type inference failed for: r2v19, types: [com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.catalog2.common.dto.ui.UIBlockPlaceholder] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v27, types: [com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.catalog2.common.dto.ui.UIBlockVideoAlbum] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30, types: [com.vk.catalog2.common.dto.ui.UIBlockVideoAlbum] */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        Iterator it;
        UserId userId;
        boolean z;
        VideoAlbum videoAlbum;
        boolean z2;
        Integer num;
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                BookingServicesScreenKt.c((com.vk.ecomm.onlinebooking.impl.services.presentation.model.a) this.c, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                ((xku) this.c).a((com.vk.core.compose.component.group.header.b) this.d, (androidx.compose.runtime.a) obj, ne7.I(7));
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                ((kh00) this.c).n((izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(65));
                return s3q0.a;
            case 3:
                ((Integer) obj2).getClass();
                un20.a((kb70.d) this.c, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 4:
                ((Integer) obj2).getClass();
                com.vk.libvideo.design.compose.base.preview.c.A((PreviewViewState.z) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 5:
                idh0.a aVar = (idh0.a) this.c;
                izs izsVar = (izs) this.d;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1434793430, intValue, -1, "com.vk.video.ui.upload.impl.attachedclips.presentation.compose.screen.Loaded.<anonymous>.<anonymous> (Screen.kt:143)");
                    }
                    q8k0.a(aVar.j, izsVar, null, aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            default:
                VideoAlbum videoAlbum2 = (VideoAlbum) this.c;
                String str = (String) this.d;
                UIBlockList uIBlockList = (UIBlockList) obj;
                ArrayList<UIBlock> arrayList = uIBlockList.y;
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ?? r2 = (UIBlock) it2.next();
                    if (r2 instanceof UIBlockVideoAlbum) {
                        r2 = (UIBlockVideoAlbum) r2;
                        if (epx.f(r2.y.zb(), videoAlbum2.zb())) {
                            r2 = (epx.f(str, "albums_subscribe") || epx.f(str, "albums_unsubscribe")) ? new UIBlockVideoAlbum(sua.l(r2), VideoAlbum.Ab(r2.y, videoAlbum2.l, null, 261119), r2.z, r2.A, r2.B, r2.C, r2.D, r2.E) : new UIBlockVideoAlbum(sua.l(r2), videoAlbum2, r2.z, r2.A, r2.B, r2.C, r2.D, r2.E);
                        }
                    } else if (r2 instanceof UIBlockTitleSubtitleAvatar) {
                        com.vk.catalog2.common.dto.api.ui.a aVar3 = new com.vk.catalog2.common.dto.api.ui.a(r2.b, r2.c, r2.d, r2.e, r2.f, r2.g, r2.h, r2.Db(), r2.j, (CatalogViewStyle) null, (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7680);
                        String str2 = videoAlbum2.d;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String str3 = str2;
                        UIBlockTitleSubtitleAvatar uIBlockTitleSubtitleAvatar = (UIBlockTitleSubtitleAvatar) r2;
                        Integer num2 = uIBlockTitleSubtitleAvatar.B;
                        String str4 = uIBlockTitleSubtitleAvatar.z;
                        String str5 = uIBlockTitleSubtitleAvatar.A;
                        if (epx.f(str, "albums_subscribe")) {
                            if (num2 != null) {
                                num2 = Integer.valueOf(num2.intValue() + 1);
                                num = num2;
                            }
                            num = null;
                        } else {
                            if (epx.f(str, "albums_unsubscribe")) {
                                if (num2 != null) {
                                    num2 = Integer.valueOf(num2.intValue() - 1);
                                }
                                num = null;
                            }
                            num = num2;
                        }
                        r2 = new UIBlockTitleSubtitleAvatar(aVar3, new UIBlockTitleSubtitleAvatar.a(str3, str4, str5, num, uIBlockTitleSubtitleAvatar.C, videoAlbum2.Gb(), uIBlockTitleSubtitleAvatar.E, uIBlockTitleSubtitleAvatar.F, uIBlockTitleSubtitleAvatar.G));
                    } else {
                        boolean z3 = true;
                        if (r2 instanceof UIBlockPlaceholder) {
                            r2 = (UIBlockPlaceholder) r2;
                            ArrayList<UIBlockAction> arrayList3 = r2.G;
                            if (arrayList3 == null || !arrayList3.isEmpty()) {
                                Iterator it3 = arrayList3.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    if (((UIBlockAction) it3.next()) instanceof UIBlockActionToggleAlbumSubscription) {
                                        int i = videoAlbum2.b;
                                        String str6 = r2.b;
                                        CatalogViewType catalogViewType = r2.d;
                                        CatalogDataType catalogDataType = r2.e;
                                        String str7 = r2.f;
                                        UserId userId2 = r2.g;
                                        List<String> list = r2.h;
                                        Set<UIBlockDragDropAction> Db = r2.Db();
                                        UIBlockHint uIBlockHint = r2.j;
                                        String str8 = r2.z;
                                        String str9 = r2.A;
                                        Image image = r2.B;
                                        String str10 = r2.C;
                                        String str11 = r2.D;
                                        String str12 = r2.E;
                                        UIBlockAction uIBlockAction = r2.F;
                                        CatalogBannerImageMode catalogBannerImageMode = r2.H;
                                        String str13 = r2.y;
                                        String str14 = r2.I;
                                        Image image2 = r2.J;
                                        BannerStyle bannerStyle = r2.K;
                                        ArrayList<UIBlockAction> arrayList4 = r2.G;
                                        ArrayList arrayList5 = new ArrayList(c5g.u(arrayList4, 10));
                                        Iterator it4 = arrayList4.iterator();
                                        while (it4.hasNext()) {
                                            UIBlockAction uIBlockAction2 = (UIBlockAction) it4.next();
                                            if (uIBlockAction2 instanceof UIBlockActionToggleAlbumSubscription) {
                                                UIBlockActionToggleAlbumSubscription uIBlockActionToggleAlbumSubscription = (UIBlockActionToggleAlbumSubscription) uIBlockAction2;
                                                it = it4;
                                                VideoAlbum videoAlbum3 = uIBlockActionToggleAlbumSubscription.A;
                                                userId = userId2;
                                                if (videoAlbum3 != null && videoAlbum3.b == i && videoAlbum3 != null) {
                                                    if (epx.f(str, "albums_subscribe")) {
                                                        z2 = z3;
                                                        z = z2;
                                                    } else {
                                                        if (epx.f(str, "albums_unsubscribe") || (videoAlbum = uIBlockActionToggleAlbumSubscription.A) == null) {
                                                            z = z3;
                                                        } else {
                                                            z = z3;
                                                            if (videoAlbum.l == z) {
                                                                z2 = z;
                                                            }
                                                        }
                                                        z2 = false;
                                                    }
                                                    videoAlbum3.l = z2;
                                                    arrayList5.add(uIBlockAction2);
                                                    it4 = it;
                                                    z3 = z;
                                                    userId2 = userId;
                                                }
                                            } else {
                                                it = it4;
                                                userId = userId2;
                                            }
                                            z = z3;
                                            arrayList5.add(uIBlockAction2);
                                            it4 = it;
                                            z3 = z;
                                            userId2 = userId;
                                        }
                                        r2 = new UIBlockPlaceholder(str6, catalogViewType, catalogDataType, str7, userId2, list, Db, uIBlockHint, str8, str9, image, str10, str11, str12, uIBlockAction, arrayList5, catalogBannerImageMode, str13, str14, image2, bannerStyle, r2.L, r2.l, r2.p, r2.q, null, 33554432, null);
                                    }
                                }
                            }
                        } else if (r2 instanceof UIBlockSearchEntityVideoPlaylist) {
                            UIBlockSearchEntityVideoPlaylist uIBlockSearchEntityVideoPlaylist = (UIBlockSearchEntityVideoPlaylist) r2;
                            if (epx.f(uIBlockSearchEntityVideoPlaylist.B.zb(), videoAlbum2.zb())) {
                                r2 = uIBlockSearchEntityVideoPlaylist.Pb(videoAlbum2);
                            }
                        }
                    }
                    arrayList2.add(r2);
                }
                return new UIBlockList(uIBlockList, arrayList2);
        }
    }

    public /* synthetic */ hy7(idh0.a aVar, izs izsVar) {
        this.b = 5;
        this.c = aVar;
        this.d = izsVar;
    }

    public /* synthetic */ hy7(c6s0 c6s0Var, VideoAlbum videoAlbum, String str) {
        this.b = 6;
        this.c = videoAlbum;
        this.d = str;
    }
}
