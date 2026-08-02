package xsna;

import android.content.Context;
import com.vk.dto.common.Image;
import com.vk.dto.market.catalog.CatalogMarketStatusOption;
import com.vk.ecomm.categories.api.MarketBridgeCategory;
import com.vk.ecomm.market.api.search.filters.dto.MarketCatalogFilterVM;
import com.vk.ecomm.market.api.search.filters.dto.MarketDeliveryType;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: MarketFilterCatalogFieldsHelper.kt */
/* loaded from: classes18.dex */
public final class qy00 implements pcr<MarketCatalogFilterVM> {
    public final Context a;
    public final MarketCatalogFilterVM b;
    public final boolean c;
    public boolean d;
    public MarketCatalogFilterVM e;

    /* compiled from: MarketFilterCatalogFieldsHelper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MarketCatalogFilterVM.FilterContextType.values().length];
            try {
                iArr[MarketCatalogFilterVM.FilterContextType.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MarketCatalogFilterVM.FilterContextType.CLASSIFIEDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public qy00(Context context, MarketCatalogFilterVM marketCatalogFilterVM, boolean z) {
        this.a = context;
        this.b = marketCatalogFilterVM;
        this.c = z;
        this.e = marketCatalogFilterVM;
    }

    public static ArrayList c(Context context, List list, r3e r3eVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MarketBridgeCategory marketBridgeCategory = (MarketBridgeCategory) it.next();
            int i = marketBridgeCategory.b;
            String str = marketBridgeCategory.c;
            Image image = marketBridgeCategory.d;
            ArrayList c = c(context, marketBridgeCategory.e, r3eVar);
            if (!c.isEmpty()) {
                c.add(0, new wqd0(marketBridgeCategory.b, 101, context.getString(R.string.market_all_products_in_category)));
            }
            wqd0 wqd0Var = new wqd0(i, 100, str, image, c);
            r3eVar.invoke(wqd0Var);
            arrayList.add(wqd0Var);
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:180:0x030b, code lost:
    
        if (xsna.epx.f(r6, (r8 == null || (r8 = r8.b) == null) ? null : java.lang.Long.valueOf(r8.intValue())) == false) goto L182;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ea  */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.pcr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(List<? extends vcr<?>> list) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        MarketBridgeCategory marketBridgeCategory;
        MarketBridgeCategory a2;
        MarketCatalogFilterVM.c cVar;
        MarketCatalogFilterVM.FilterContextType filterContextType;
        MarketCatalogFilterVM.d dVar;
        MarketBridgeCategory b;
        Integer num5;
        MarketBridgeCategory a3;
        MarketBridgeCategory b2;
        Integer num6;
        Pair pair;
        boolean booleanValue;
        Float f;
        List<MarketCatalogFilterVM.b> list2;
        dz00 dz00Var;
        this.d = false;
        for (int size = list.size() - 1; -1 < size; size--) {
            vcr<?> vcrVar = list.get(size);
            if (vcrVar instanceof x1c) {
                y1c<?> y1cVar = ((x1c) vcrVar).f;
                Object obj = y1cVar != null ? y1cVar.b : null;
                r7 = obj instanceof MarketCatalogFilterVM.FilterContextType ? (MarketCatalogFilterVM.FilterContextType) obj : null;
                if (r7 != null && r7 != this.e.a) {
                    this.d = true;
                }
                MarketCatalogFilterVM marketCatalogFilterVM = this.e;
                if (r7 == null) {
                    r7 = marketCatalogFilterVM.a;
                }
                this.e = MarketCatalogFilterVM.a(marketCatalogFilterVM, r7, null, null, null, null, null, null, null, null, null, null, null, null, null, 131070);
            } else if (vcrVar instanceof mec) {
                mec mecVar = (mec) vcrVar;
                if (epx.f(this.e.e, mecVar.l)) {
                    dz00Var = this.e.e;
                } else {
                    this.d = true;
                    dz00Var = mecVar.l;
                }
                this.e = MarketCatalogFilterVM.a(this.e, null, null, null, dz00Var, null, null, null, null, null, null, null, null, null, null, 131055);
            } else if (vcrVar instanceof t0k0) {
                t0k0 t0k0Var = (t0k0) vcrVar;
                if (t0k0Var != null && (f = t0k0Var.f) != null) {
                    int floatValue = (int) f.floatValue();
                    MarketCatalogFilterVM.a aVar = this.e.d;
                    MarketCatalogFilterVM.b bVar = (aVar == null || (list2 = aVar.e) == null) ? null : list2.get(floatValue);
                    if (bVar != null) {
                        num6 = Integer.valueOf(bVar.b);
                        if (t0k0Var != null) {
                            MarketCatalogFilterVM.a aVar2 = this.e.d;
                            if (!epx.f(aVar2 != null ? aVar2.c : null, num6)) {
                                pair = new Pair(Boolean.TRUE, num6);
                                booleanValue = ((Boolean) pair.d()).booleanValue();
                                Integer num7 = (Integer) pair.g();
                                if (booleanValue) {
                                    this.d = true;
                                }
                                MarketCatalogFilterVM marketCatalogFilterVM2 = this.e;
                                MarketCatalogFilterVM.a aVar3 = marketCatalogFilterVM2.d;
                                this.e = MarketCatalogFilterVM.a(marketCatalogFilterVM2, null, null, aVar3 != null ? MarketCatalogFilterVM.a.d(aVar3, null, num7, 27) : null, null, null, null, null, null, null, null, null, null, null, null, 131063);
                            }
                        }
                        Boolean bool = Boolean.FALSE;
                        MarketCatalogFilterVM.a aVar4 = this.e.d;
                        pair = new Pair(bool, aVar4 == null ? aVar4.c : null);
                        booleanValue = ((Boolean) pair.d()).booleanValue();
                        Integer num72 = (Integer) pair.g();
                        if (booleanValue) {
                        }
                        MarketCatalogFilterVM marketCatalogFilterVM22 = this.e;
                        MarketCatalogFilterVM.a aVar32 = marketCatalogFilterVM22.d;
                        this.e = MarketCatalogFilterVM.a(marketCatalogFilterVM22, null, null, aVar32 != null ? MarketCatalogFilterVM.a.d(aVar32, null, num72, 27) : null, null, null, null, null, null, null, null, null, null, null, null, 131063);
                    }
                }
                num6 = null;
                if (t0k0Var != null) {
                }
                Boolean bool2 = Boolean.FALSE;
                MarketCatalogFilterVM.a aVar42 = this.e.d;
                pair = new Pair(bool2, aVar42 == null ? aVar42.c : null);
                booleanValue = ((Boolean) pair.d()).booleanValue();
                Integer num722 = (Integer) pair.g();
                if (booleanValue) {
                }
                MarketCatalogFilterVM marketCatalogFilterVM222 = this.e;
                MarketCatalogFilterVM.a aVar322 = marketCatalogFilterVM222.d;
                this.e = MarketCatalogFilterVM.a(marketCatalogFilterVM222, null, null, aVar322 != null ? MarketCatalogFilterVM.a.d(aVar322, null, num722, 27) : null, null, null, null, null, null, null, null, null, null, null, null, 131063);
            } else if (vcrVar instanceof rka) {
                MarketCatalogFilterVM marketCatalogFilterVM3 = this.e;
                MarketCatalogFilterVM.c b3 = marketCatalogFilterVM3.b(marketCatalogFilterVM3.a);
                Integer valueOf = (b3 == null || (b2 = b3.b()) == null) ? null : Integer.valueOf(b2.b);
                rka rkaVar = (rka) vcrVar;
                wqd0 wqd0Var = rkaVar.e;
                if (!epx.f(valueOf, wqd0Var != null ? Integer.valueOf(wqd0Var.a) : null)) {
                    this.d = true;
                }
                wqd0 wqd0Var2 = rkaVar.e;
                MarketBridgeCategory marketBridgeCategory2 = rkaVar.l;
                if (wqd0Var2 == null || (a3 = marketBridgeCategory2.a(wqd0Var2.a)) == null) {
                    MarketCatalogFilterVM marketCatalogFilterVM4 = this.e;
                    Map map = (Map) marketCatalogFilterVM4.q.get(marketCatalogFilterVM4.a);
                    if (map != null) {
                        MarketCatalogFilterVM.FilterContextType filterContextType2 = this.e.a;
                        MarketCatalogFilterVM.FilterContextType filterContextType3 = MarketCatalogFilterVM.FilterContextType.CLASSIFIEDS;
                        if (filterContextType2 == filterContextType3) {
                            filterContextType3 = MarketCatalogFilterVM.FilterContextType.MARKET;
                        }
                        Map map2 = (Map) map.get(filterContextType3);
                        if (map2 != null) {
                            wqd0 wqd0Var3 = rkaVar.e;
                            num4 = (Integer) map2.get(wqd0Var3 != null ? Integer.valueOf(wqd0Var3.a) : null);
                            if (num4 != null) {
                                int intValue = num4.intValue();
                                MarketCatalogFilterVM marketCatalogFilterVM5 = this.e;
                                MarketCatalogFilterVM.c b4 = marketCatalogFilterVM5.b(marketCatalogFilterVM5.a);
                                if (b4 != null && (a2 = b4.a()) != null) {
                                    marketBridgeCategory = a2.a(intValue);
                                    if (marketBridgeCategory != null) {
                                        marketBridgeCategory2 = marketBridgeCategory;
                                    }
                                }
                            }
                            marketBridgeCategory = null;
                            if (marketBridgeCategory != null) {
                            }
                        }
                    }
                    num4 = null;
                    if (num4 != null) {
                    }
                    marketBridgeCategory = null;
                    if (marketBridgeCategory != null) {
                    }
                } else {
                    marketBridgeCategory2 = a3;
                }
                MarketCatalogFilterVM marketCatalogFilterVM6 = this.e;
                MarketCatalogFilterVM.c b5 = marketCatalogFilterVM6.b(marketCatalogFilterVM6.a);
                MarketCatalogFilterVM.c c = b5 != null ? b5.c(marketBridgeCategory2) : null;
                if (c != null && (b = c.b()) != null) {
                    MarketCatalogFilterVM marketCatalogFilterVM7 = this.e;
                    MarketCatalogFilterVM.FilterContextType filterContextType4 = marketCatalogFilterVM7.a;
                    MarketCatalogFilterVM.FilterContextType filterContextType5 = MarketCatalogFilterVM.FilterContextType.CLASSIFIEDS;
                    cVar = marketCatalogFilterVM7.b(filterContextType4 == filterContextType5 ? MarketCatalogFilterVM.FilterContextType.MARKET : filterContextType5);
                    if (cVar != null) {
                        MarketCatalogFilterVM marketCatalogFilterVM8 = this.e;
                        Map map3 = (Map) marketCatalogFilterVM8.q.get(marketCatalogFilterVM8.a);
                        if (map3 != null) {
                            if (this.e.a == filterContextType5) {
                                filterContextType5 = MarketCatalogFilterVM.FilterContextType.MARKET;
                            }
                            Map map4 = (Map) map3.get(filterContextType5);
                            if (map4 != null && (num5 = (Integer) map4.get(Integer.valueOf(b.b))) != null) {
                                MarketBridgeCategory a4 = cVar.a().a(num5.intValue());
                                if (a4 != null) {
                                    cVar = cVar.c(a4);
                                }
                            }
                        }
                        filterContextType = this.e.a;
                        if (filterContextType != MarketCatalogFilterVM.FilterContextType.MARKET) {
                            if (c instanceof MarketCatalogFilterVM.d) {
                                dVar = (MarketCatalogFilterVM.d) c;
                                if (filterContextType != MarketCatalogFilterVM.FilterContextType.CLASSIFIEDS) {
                                    if (c instanceof MarketCatalogFilterVM.a) {
                                        r7 = (MarketCatalogFilterVM.a) c;
                                    }
                                } else if (cVar instanceof MarketCatalogFilterVM.a) {
                                    r7 = (MarketCatalogFilterVM.a) cVar;
                                }
                                Pair pair2 = new Pair(dVar, r7);
                                this.e = MarketCatalogFilterVM.a(this.e, null, (MarketCatalogFilterVM.d) pair2.d(), (MarketCatalogFilterVM.a) pair2.g(), null, null, null, null, null, null, null, null, null, null, null, 131059);
                            }
                            dVar = null;
                            if (filterContextType != MarketCatalogFilterVM.FilterContextType.CLASSIFIEDS) {
                            }
                            Pair pair22 = new Pair(dVar, r7);
                            this.e = MarketCatalogFilterVM.a(this.e, null, (MarketCatalogFilterVM.d) pair22.d(), (MarketCatalogFilterVM.a) pair22.g(), null, null, null, null, null, null, null, null, null, null, null, 131059);
                        } else {
                            if (cVar instanceof MarketCatalogFilterVM.d) {
                                dVar = (MarketCatalogFilterVM.d) cVar;
                                if (filterContextType != MarketCatalogFilterVM.FilterContextType.CLASSIFIEDS) {
                                }
                                Pair pair222 = new Pair(dVar, r7);
                                this.e = MarketCatalogFilterVM.a(this.e, null, (MarketCatalogFilterVM.d) pair222.d(), (MarketCatalogFilterVM.a) pair222.g(), null, null, null, null, null, null, null, null, null, null, null, 131059);
                            }
                            dVar = null;
                            if (filterContextType != MarketCatalogFilterVM.FilterContextType.CLASSIFIEDS) {
                            }
                            Pair pair2222 = new Pair(dVar, r7);
                            this.e = MarketCatalogFilterVM.a(this.e, null, (MarketCatalogFilterVM.d) pair2222.d(), (MarketCatalogFilterVM.a) pair2222.g(), null, null, null, null, null, null, null, null, null, null, null, 131059);
                        }
                    }
                }
                cVar = null;
                filterContextType = this.e.a;
                if (filterContextType != MarketCatalogFilterVM.FilterContextType.MARKET) {
                }
            } else if (vcrVar instanceof wzk0) {
                wzk0 wzk0Var = (wzk0) vcrVar;
                if (!epx.f(this.e.i, wzk0Var.f)) {
                    this.d = true;
                }
                MarketCatalogFilterVM marketCatalogFilterVM9 = this.e;
                CatalogMarketStatusOption catalogMarketStatusOption = wzk0Var.f;
                if (catalogMarketStatusOption == null) {
                    catalogMarketStatusOption = wzk0Var.g;
                }
                this.e = MarketCatalogFilterVM.a(marketCatalogFilterVM9, null, null, null, null, null, null, catalogMarketStatusOption, wzk0Var.h, null, null, null, null, null, null, 130303);
            } else if (vcrVar instanceof n6d0) {
                Long l = this.e.f;
                n6d0 n6d0Var = (n6d0) vcrVar;
                p6d0 p6d0Var = n6d0Var.f;
                if (epx.f(l, (p6d0Var == null || (num3 = p6d0Var.a) == null) ? null : Long.valueOf(num3.intValue()))) {
                    Long l2 = this.e.g;
                    p6d0 p6d0Var2 = n6d0Var.f;
                }
                this.d = true;
                MarketCatalogFilterVM marketCatalogFilterVM10 = this.e;
                p6d0 p6d0Var3 = n6d0Var.f;
                Long valueOf2 = (p6d0Var3 == null || (num2 = p6d0Var3.a) == null) ? null : Long.valueOf(num2.intValue());
                p6d0 p6d0Var4 = n6d0Var.f;
                if (p6d0Var4 != null && (num = p6d0Var4.b) != null) {
                    r7 = Long.valueOf(num.intValue());
                }
                this.e = MarketCatalogFilterVM.a(marketCatalogFilterVM10, null, null, null, null, valueOf2, r7, null, null, null, null, null, null, null, null, 130975);
            } else if (vcrVar instanceof xqd0) {
                xqd0 xqd0Var = (xqd0) vcrVar;
                if (!epx.f(this.e.k, xqd0Var.h)) {
                    this.d = true;
                }
                this.e = MarketCatalogFilterVM.a(this.e, null, null, null, null, null, null, null, null, xqd0Var.h, null, null, null, null, null, 130047);
            } else if (vcrVar instanceof znd0) {
                znd0 znd0Var = (znd0) vcrVar;
                if (!epx.f(this.e.l, znd0Var.h)) {
                    this.d = true;
                }
                this.e = MarketCatalogFilterVM.a(this.e, null, null, null, null, null, null, null, null, null, znd0Var.h, null, null, null, null, 129023);
            } else if (vcrVar instanceof pfi0) {
                pfi0 pfi0Var = (pfi0) vcrVar;
                if (!epx.f(this.e.m, pfi0Var.h)) {
                    this.d = true;
                }
                this.e = MarketCatalogFilterVM.a(this.e, null, null, null, null, null, null, null, null, null, null, pfi0Var.h, null, null, null, 126975);
            } else if (vcrVar instanceof wod0) {
                wod0 wod0Var = (wod0) vcrVar;
                if (!epx.f(this.e.n, wod0Var.h)) {
                    this.d = true;
                }
                this.e = MarketCatalogFilterVM.a(this.e, null, null, null, null, null, null, null, null, null, null, null, wod0Var.h, null, null, 122879);
            } else if (vcrVar instanceof xod0) {
                xod0 xod0Var = (xod0) vcrVar;
                if (!epx.f(this.e.o, xod0Var.h)) {
                    this.d = true;
                }
                this.e = MarketCatalogFilterVM.a(this.e, null, null, null, null, null, null, null, null, null, null, null, null, xod0Var.h, null, 114687);
            } else if (vcrVar instanceof xnd0) {
                MarketDeliveryType marketDeliveryType = this.e.p;
                xnd0 xnd0Var = (xnd0) vcrVar;
                if (!epx.f(marketDeliveryType != null ? Integer.valueOf(marketDeliveryType.ordinal()) : null, xnd0Var.h)) {
                    this.d = true;
                }
                Integer num8 = xnd0Var.h;
                if (num8 != null) {
                    this.e = MarketCatalogFilterVM.a(this.e, null, null, null, null, null, null, null, null, null, null, null, null, null, (MarketDeliveryType) MarketDeliveryType.h().get(num8.intValue()), 98303);
                }
            }
        }
        return this.d;
    }

    @Override // xsna.pcr
    public final MarketCatalogFilterVM b() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02a4  */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.ArrayList] */
    @Override // xsna.pcr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ListBuilder getFields() {
        MarketCatalogFilterVM marketCatalogFilterVM;
        Object obj;
        x1c x1cVar;
        MarketCatalogFilterVM.c b;
        int i;
        MarketCatalogFilterVM marketCatalogFilterVM2;
        rka rkaVar;
        List<CatalogMarketStatusOption> list;
        wzk0 wzk0Var;
        int i2;
        hfz mecVar;
        ListBuilder e;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        boolean isEmpty;
        MarketBridgeCategory a2;
        Object obj2;
        List<MarketBridgeCategory> list2;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        MarketCatalogFilterVM marketCatalogFilterVM3 = this.e;
        MarketCatalogFilterVM.c b2 = marketCatalogFilterVM3.b(marketCatalogFilterVM3.a);
        MarketBridgeCategory a3 = b2 != null ? b2.a() : null;
        Context context = this.a;
        ArrayList c = (a3 == null || (list2 = a3.e) == null) ? null : c(context, list2, new r3e(this, ref$ObjectRef, a3, ref$ObjectRef2, 2));
        ListBuilder e2 = e43.e();
        String string = context.getString(R.string.catalog_market_radio_shops);
        MarketCatalogFilterVM.FilterContextType filterContextType = MarketCatalogFilterVM.FilterContextType.MARKET;
        int i3 = 0;
        y1c y1cVar = new y1c(filterContextType, string, this.e.a == filterContextType);
        String string2 = context.getString(R.string.catalog_market_radio_classifieds);
        MarketCatalogFilterVM.FilterContextType filterContextType2 = MarketCatalogFilterVM.FilterContextType.CLASSIFIEDS;
        List l = e43.l(y1cVar, new y1c(filterContextType2, string2, this.e.a == filterContextType2));
        List list3 = l;
        Iterator it = list3.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            marketCatalogFilterVM = this.b;
            if (!hasNext) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((y1c) obj).b == marketCatalogFilterVM.b) {
                break;
            }
        }
        y1c y1cVar2 = (y1c) obj;
        if (this.c) {
            MarketCatalogFilterVM marketCatalogFilterVM4 = this.e;
            if (marketCatalogFilterVM4.c != null && marketCatalogFilterVM4.d != null) {
                String string3 = context.getString(R.string.catalog_market_title_show);
                Iterator it2 = list3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    if (((y1c) obj2).c) {
                        break;
                    }
                }
                x1cVar = new x1c(string3, (y1c) obj2, y1cVar2, l);
                if (x1cVar != null) {
                    e2.add(x1cVar);
                }
                wqd0 wqd0Var = (wqd0) ref$ObjectRef.element;
                wqd0 wqd0Var2 = (wqd0) ref$ObjectRef2.element;
                MarketCatalogFilterVM marketCatalogFilterVM5 = this.e;
                b = marketCatalogFilterVM5.b(marketCatalogFilterVM5.a);
                if (b != null || (a2 = b.a()) == null) {
                    i = 1;
                    marketCatalogFilterVM2 = marketCatalogFilterVM;
                    rkaVar = null;
                } else {
                    marketCatalogFilterVM2 = marketCatalogFilterVM;
                    i = 1;
                    rkaVar = new rka(wqd0Var, wqd0Var2, context.getString(R.string.market_search_choose_a_category), context.getString(R.string.market_search_filter_category_title), c, a2, 160);
                }
                if (rkaVar != null) {
                    e2.add(rkaVar);
                }
                list = this.e.j;
                if (list == null) {
                    wzk0Var = new wzk0(context.getString(R.string.market_storefront_status), !epx.f(this.e.i, j5g.Y(list)) ? this.e.i : null, (CatalogMarketStatusOption) j5g.Y(list), list);
                } else {
                    wzk0Var = null;
                }
                if (wzk0Var != null) {
                    e2.add(wzk0Var);
                }
                i2 = a.$EnumSwitchMapping$0[this.e.a.ordinal()];
                int i4 = -1;
                if (i2 != i) {
                    if (this.e.e != null) {
                        String string4 = context.getString(R.string.vk_discover_search_city);
                        String string5 = context.getString(R.string.vk_discover_search_choose_a_city);
                        dz00 dz00Var = this.e.e;
                        wqd0 wqd0Var3 = dz00Var != null ? new wqd0(dz00Var.hashCode(), 100, dz00Var.a) : null;
                        dz00 dz00Var2 = this.e.e;
                        mecVar = new mec(wqd0Var3, dz00Var2 != null ? new wqd0(dz00Var2.hashCode(), 100, dz00Var2.a) : null, string5, string4, dz00Var2, 224);
                    }
                    mecVar = null;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    MarketCatalogFilterVM.a aVar = this.e.d;
                    if (aVar != null) {
                        Integer num = aVar.d;
                        List<MarketCatalogFilterVM.b> list4 = aVar.e;
                        if (!list4.isEmpty()) {
                            List<MarketCatalogFilterVM.b> list5 = list4;
                            Iterator<MarketCatalogFilterVM.b> it3 = list5.iterator();
                            int i5 = 0;
                            while (true) {
                                if (!it3.hasNext()) {
                                    i5 = -1;
                                    break;
                                }
                                int i6 = it3.next().b;
                                Integer num2 = aVar.c;
                                if (num2 == null) {
                                    num2 = num;
                                }
                                if (num2 != null && i6 == num2.intValue()) {
                                    break;
                                }
                                i5++;
                            }
                            if (i5 < 0) {
                                i5 = 0;
                            }
                            float f = i5;
                            Iterator<MarketCatalogFilterVM.b> it4 = list5.iterator();
                            int i7 = 0;
                            while (true) {
                                if (!it4.hasNext()) {
                                    i7 = -1;
                                    break;
                                }
                                int i8 = it4.next().b;
                                if (num != null && i8 == num.intValue()) {
                                    break;
                                }
                                i7++;
                            }
                            list5.size();
                            mecVar = new t0k0(new js00(1, list5, this), Float.valueOf(f), Float.valueOf(i7), 8);
                        }
                    }
                    mecVar = null;
                }
                if (mecVar != null) {
                    e2.add(mecVar);
                }
                String str = context.getString(R.string.market_search_filter_price_title) + ", " + this.e.h;
                Long l2 = this.e.f;
                Integer valueOf = l2 == null ? Integer.valueOf((int) l2.longValue()) : null;
                Long l3 = this.e.g;
                Integer valueOf2 = l3 == null ? Integer.valueOf((int) l3.longValue()) : null;
                e2.add(new n6d0(str, (valueOf == null || valueOf2 != null) ? new p6d0(valueOf, valueOf2) : null, 12));
                e = e43.e();
                bool = marketCatalogFilterVM2.k;
                bool2 = marketCatalogFilterVM2.o;
                bool3 = marketCatalogFilterVM2.n;
                bool4 = marketCatalogFilterVM2.m;
                if (bool != null) {
                    e.add(new xqd0(this.e.k));
                }
                if (marketCatalogFilterVM2.l != null) {
                    e.add(new znd0(this.e.l));
                }
                if (marketCatalogFilterVM2.p != null) {
                    e.add(new yod0(tq.h(tlo0.Companion, R.string.market_filter_delivery_header)));
                    MarketDeliveryType marketDeliveryType = this.e.p;
                    Integer valueOf3 = marketDeliveryType != null ? Integer.valueOf(marketDeliveryType.ordinal()) : null;
                    Iterator it5 = MarketDeliveryType.h().iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            break;
                        }
                        if (((MarketDeliveryType) it5.next()) == MarketDeliveryType.ANY) {
                            i4 = i3;
                            break;
                        }
                        i3++;
                    }
                    e.add(new xnd0(valueOf3, Integer.valueOf(i4)));
                }
                if (bool4 == null || bool3 != null || bool2 != null) {
                    e.add(new yod0(tq.h(tlo0.Companion, R.string.market_filter_additional_header)));
                }
                if (bool4 != null) {
                    e.add(new pfi0(this.e.m));
                }
                if (bool3 != null) {
                    e.add(new wod0(this.e.n));
                }
                if (bool2 != null) {
                    e.add(new xod0(this.e.o));
                }
                ListBuilder g = e.g();
                isEmpty = g.isEmpty();
                ListBuilder listBuilder = g;
                if (!isEmpty) {
                    listBuilder = j5g.u0(g, Collections.singletonList(new esd0(iah0.a(12))));
                }
                e2.addAll(listBuilder);
                return e2.g();
            }
        }
        x1cVar = null;
        if (x1cVar != null) {
        }
        wqd0 wqd0Var4 = (wqd0) ref$ObjectRef.element;
        wqd0 wqd0Var22 = (wqd0) ref$ObjectRef2.element;
        MarketCatalogFilterVM marketCatalogFilterVM52 = this.e;
        b = marketCatalogFilterVM52.b(marketCatalogFilterVM52.a);
        if (b != null) {
        }
        i = 1;
        marketCatalogFilterVM2 = marketCatalogFilterVM;
        rkaVar = null;
        if (rkaVar != null) {
        }
        list = this.e.j;
        if (list == null) {
        }
        if (wzk0Var != null) {
        }
        i2 = a.$EnumSwitchMapping$0[this.e.a.ordinal()];
        int i42 = -1;
        if (i2 != i) {
        }
        if (mecVar != null) {
        }
        String str2 = context.getString(R.string.market_search_filter_price_title) + ", " + this.e.h;
        Long l22 = this.e.f;
        if (l22 == null) {
        }
        Long l32 = this.e.g;
        if (l32 == null) {
        }
        e2.add(new n6d0(str2, (valueOf == null || valueOf2 != null) ? new p6d0(valueOf, valueOf2) : null, 12));
        e = e43.e();
        bool = marketCatalogFilterVM2.k;
        bool2 = marketCatalogFilterVM2.o;
        bool3 = marketCatalogFilterVM2.n;
        bool4 = marketCatalogFilterVM2.m;
        if (bool != null) {
        }
        if (marketCatalogFilterVM2.l != null) {
        }
        if (marketCatalogFilterVM2.p != null) {
        }
        if (bool4 == null) {
        }
        e.add(new yod0(tq.h(tlo0.Companion, R.string.market_filter_additional_header)));
        if (bool4 != null) {
        }
        if (bool3 != null) {
        }
        if (bool2 != null) {
        }
        ListBuilder g2 = e.g();
        isEmpty = g2.isEmpty();
        ListBuilder listBuilder2 = g2;
        if (!isEmpty) {
        }
        e2.addAll(listBuilder2);
        return e2.g();
    }
}
