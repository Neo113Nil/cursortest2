package xsna;

import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.CatalogStateInfo;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: BannerBlockTransformer.kt */
/* loaded from: classes16.dex */
public final class k16 {

    /* compiled from: BannerBlockTransformer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.LARGE_LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogViewType.LARGE_SLIDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CatalogViewType.LARGE_SLIDER_INFINITE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CatalogViewType.LARGE_LIST_INFINITE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CatalogViewType.SLIDER_INFINITE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CatalogViewType.SLIDER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CatalogViewType.SNIPPETS_BANNER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CatalogViewType.SMALL_LIST.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CatalogViewType.SMALL_SLIDER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[CatalogViewType.BANNER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[CatalogViewType.PODCAST_BANNERS_SLIDER.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[CatalogViewType.PODCAST_BANNERS_SLIDER_INFINITE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ArrayList a(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, nq8 nq8Var) {
        switch (a.$EnumSwitchMapping$0[catalogBlock.i.b.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                ArrayList Gb = catalogBlock.Gb(catalogExtendedData);
                ArrayList arrayList = new ArrayList();
                Iterator it = Gb.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    CatalogStateInfo catalogStateInfo = next instanceof CatalogStateInfo ? (CatalogStateInfo) next : null;
                    if (catalogStateInfo != null) {
                        arrayList.add(catalogStateInfo);
                    }
                }
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    CatalogStateInfo catalogStateInfo2 = (CatalogStateInfo) it2.next();
                    bi20 bi20Var2 = bi20Var;
                    arrayList2.add(fsa0.c(bi20.a(bi20Var2, fsa0.b(catalogStateInfo2), null, null, null, null, null, 33554427), catalogStateInfo2, catalogExtendedData, nq8Var));
                    bi20Var = bi20Var2;
                }
                return arrayList2;
            case 12:
            case 13:
                ArrayList Gb2 = catalogBlock.Gb(catalogExtendedData);
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = Gb2.iterator();
                while (it3.hasNext()) {
                    Object next2 = it3.next();
                    CatalogStateInfo catalogStateInfo3 = next2 instanceof CatalogStateInfo ? (CatalogStateInfo) next2 : null;
                    if (catalogStateInfo3 != null) {
                        arrayList3.add(catalogStateInfo3);
                    }
                }
                ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(fsa0.c(bi20Var, (CatalogStateInfo) it4.next(), catalogExtendedData, nq8Var));
                }
                return arrayList4;
            default:
                return null;
        }
    }
}
