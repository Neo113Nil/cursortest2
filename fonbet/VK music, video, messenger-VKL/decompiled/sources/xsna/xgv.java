package xsna;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.auth.main.AuthStatSender;
import com.vk.clips.design.view.hsl.HslRecyclerView;
import com.vk.dto.messages.MsgSyncState;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.dto.polls.Poll;
import com.vk.ecomm.categories.api.MarketBridgeCategory;
import com.vk.editor.filters.correction.entity.HslColorType;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.engine.models.stories.ImStoryState;
import com.vk.newsfeed.impl.fragments.PostPreviewFragment;
import com.vk.newsfeed.impl.postmodal.reactions.tabs.all.ModalPostAllReactionsFragment;
import com.vk.newsfeed.posting.impl.domain.model.PhotoTag;
import com.vk.photos.ui.album.PhotoAlbumFragment;
import com.vk.photos.ui.attachmentspicker.PickVKPhotoFragmentNew;
import com.vk.photoviewer.PhotoViewer;
import com.vk.search.params.api.City;
import com.vk.search.params.api.VkMarketSearchParams;
import com.vk.search.params.api.domain.model.MarketSearchDeliveryType;
import com.vk.search.params.api.domain.model.MarketSearchSortingOptions;
import com.vk.video.polls.ui.questions.open.PollOpenView;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Ref$ObjectRef;
import one.video.player.OneVideoPlayer;
import ru.ok.android.externcalls.sdk.api.OkApiServiceInternal;
import xsna.hi00;
import xsna.mcz;
import xsna.ndw;
import xsna.nza0;
import xsna.osb0;
import xsna.rtb0;
import xsna.xrb0;
import xsna.ye50;
import xsna.zd20;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class xgv implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xgv(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x0243, code lost:
    
        if (r4 != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x025e, code lost:
    
        if (r3 != false) goto L119;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0266 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0276  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i;
        f600 f600Var;
        boolean z;
        boolean z2;
        lj30 lj30Var;
        lj30 lj30Var2;
        lj30 lj30Var3;
        lj30 lj30Var4;
        lj30 lj30Var5;
        lj30 lj30Var6;
        boolean z3;
        Boolean bool;
        boolean z4;
        lj30 lj30Var7;
        lj30 lj30Var8;
        lj30 lj30Var9;
        lj30 lj30Var10;
        boolean z5;
        boolean z6;
        s3q0 externalIdsByOkIds$lambda$0;
        gzs<s3q0> gzsVar;
        GroupsGroupFullDto groupsGroupFullDto;
        switch (this.b) {
            case 0:
                HslColorType hslColorType = (HslColorType) this.c;
                int i2 = HslRecyclerView.e;
                return Boolean.valueOf(((wgv) obj).a == hslColorType);
            case 1:
                ((quv) this.c).r.setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
                return s3q0.a;
            case 2:
                return new Pair((m5w) this.c, (ProfilesInfo) obj);
            case 3:
                qdw qdwVar = (qdw) this.c;
                sxp sxpVar = (sxp) obj;
                if (sxpVar instanceof usl0) {
                    qdwVar.g = ((usl0) sxpVar).b;
                    if (!qdwVar.g) {
                        qdwVar.d.onNext(ndw.b.a);
                    }
                } else if (sxpVar instanceof yb80) {
                    qdwVar.e(((yb80) sxpVar).b, ImStoryState.NONE);
                }
                return s3q0.a;
            case 4:
                ((k3z) this.c).e.a(AuthStatSender.Screen.PHONE_CODE);
                return s3q0.a;
            case 5:
                zcz zczVar = (zcz) this.c;
                zczVar.e.onNext(new mcz.c(zczVar.q));
                zczVar.d(R.string.link_copied);
                return s3q0.a;
            case 6:
                eea eeaVar = (eea) this.c;
                if (((Boolean) obj).booleanValue()) {
                }
                return s3q0.a;
            case 7:
                zrz zrzVar = (zrz) this.c;
                zrzVar.n.onNext(new h57(14, zrzVar, obj));
                return s3q0.a;
            case 8:
                d260.b.a().a().add((yb00) this.c);
                return s3q0.a;
            case 9:
                ((io.reactivex.rxjava3.subjects.f) this.c).onNext((hi00.a) obj);
                return s3q0.a;
            case 10:
                uy00 uy00Var = (uy00) this.c;
                MarketBridgeCategory marketBridgeCategory = (MarketBridgeCategory) obj;
                VkMarketSearchParams vkMarketSearchParams = uy00Var.c;
                Context context = uy00Var.a;
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ArrayList a = ty00.a(context, marketBridgeCategory.e, new g22(17, ref$ObjectRef, vkMarketSearchParams));
                ArrayList arrayList = new ArrayList();
                Iterator<E> it = MarketSearchSortingOptions.h().iterator();
                int i3 = 0;
                while (true) {
                    i = -1;
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (i3 < 0) {
                            e43.t();
                            throw null;
                        }
                        if (!epx.f(((MarketSearchSortingOptions) next).i(), vkMarketSearchParams.c)) {
                            i3++;
                        }
                    } else {
                        i3 = -1;
                    }
                }
                Integer valueOf = i3 == -1 ? null : Integer.valueOf(i3);
                arrayList.add(new dsd0(Integer.valueOf(valueOf != null ? valueOf.intValue() : 0), 0));
                rka rkaVar = new rka((wqd0) ref$ObjectRef.element, null, context.getString(R.string.market_search_choose_a_category), context.getString(R.string.market_search_filter_category_title), a, marketBridgeCategory, 162);
                String string = context.getString(R.string.market_search_city);
                String string2 = context.getString(R.string.market_search_choose_a_city);
                City city = vkMarketSearchParams.b;
                nmo nmoVar = new nmo(city != null ? new wqd0(city.b, 100, city.c) : null, string2, string, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE);
                String str = context.getString(R.string.market_search_filter_price_title) + ", ₽";
                Integer num = vkMarketSearchParams.g;
                Integer num2 = vkMarketSearchParams.h;
                arrayList.addAll(e43.l(rkaVar, nmoVar, new n6d0(str, (num == null && num2 == null) ? null : new p6d0(num != null ? Integer.valueOf(num.intValue() * 100) : null, num2 != null ? Integer.valueOf(num2.intValue() * 100) : null), 12)));
                ListBuilder e = e43.e();
                e.add(new esd0(iah0.a(12)));
                e.add(new xqd0(vkMarketSearchParams.n));
                e.add(new znd0(vkMarketSearchParams.o));
                e.add(new yod0(tq.h(tlo0.Companion, R.string.market_filter_delivery_header)));
                MarketSearchDeliveryType marketSearchDeliveryType = vkMarketSearchParams.s;
                Integer valueOf2 = Integer.valueOf(marketSearchDeliveryType != null ? marketSearchDeliveryType.ordinal() : 0);
                Iterator<E> it2 = MarketSearchDeliveryType.h().iterator();
                int i4 = 0;
                while (true) {
                    if (it2.hasNext()) {
                        if (((MarketSearchDeliveryType) it2.next()) == MarketSearchDeliveryType.ANY) {
                            i = i4;
                        } else {
                            i4++;
                        }
                    }
                }
                e.add(new xnd0(valueOf2, Integer.valueOf(i)));
                e.add(new yod0(tq.h(tlo0.Companion, R.string.market_filter_additional_header)));
                e.add(new pfi0(vkMarketSearchParams.p));
                e.add(new wod0(vkMarketSearchParams.q));
                arrayList.addAll(e.g());
                uy00Var.f.onNext(arrayList);
                uy00Var.g = false;
                return s3q0.a;
            case 11:
                s820 s820Var = (s820) this.c;
                n1l0 n1l0Var = s820Var.q;
                if (n1l0Var != null && (f600Var = s820Var.m) != null) {
                    f600Var.a(n1l0Var);
                }
                irc0 irc0Var = s820Var.n;
                if (irc0Var != null) {
                    irc0Var.invoke();
                }
                return s3q0.a;
            case 12:
                zd20 zd20Var = (zd20) this.c;
                ae20<Args> ae20Var = zd20Var.b;
                boolean z7 = zd20Var.c;
                Args args = zd20Var.a;
                ikx0 i5 = ae20Var.i(args);
                if (i5 == null) {
                    return EmptyList.b;
                }
                gkx0 gkx0Var = i5.a;
                gkx0 gkx0Var2 = i5.b;
                Collection<Msg> a2 = ae20Var.a(args, gkx0Var, gkx0Var2);
                if (!z7) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : a2) {
                        if (((Msg) obj2).o != MsgSyncState.SENDING) {
                            arrayList2.add(obj2);
                        }
                    }
                    a2 = arrayList2;
                }
                zd20.a b = zd20Var.b(args, gkx0Var);
                lj30 lj30Var11 = b.a;
                lj30 lj30Var12 = b.b;
                lj30 lj30Var13 = b.c;
                zd20.a b2 = zd20Var.b(args, gkx0Var2);
                lj30 lj30Var14 = b2.a;
                lj30 lj30Var15 = b2.b;
                lj30 lj30Var16 = b2.c;
                if (!gkx0Var.equals(gkx0.d)) {
                    if (lj30Var12 == null) {
                        if (lj30Var11 != null) {
                            z6 = lj30Var11.i;
                            break;
                        } else if (lj30Var13 != null) {
                            z6 = lj30Var13.i;
                            break;
                        } else {
                            z6 = false;
                            break;
                        }
                    }
                    z = true;
                    if (!gkx0Var2.equals(gkx0.e)) {
                        if (lj30Var16 == null) {
                            if (lj30Var14 != null) {
                                z5 = lj30Var14.j;
                                break;
                            } else if (lj30Var15 != null) {
                                z5 = lj30Var15.j;
                                break;
                            } else {
                                z5 = false;
                                break;
                            }
                        }
                        z2 = true;
                        Boolean valueOf3 = ae20Var.k(args) == null ? null : Boolean.valueOf(!(!z || z2));
                        ae20Var.h(args, gkx0Var, gkx0Var2, z7);
                        ae20Var.j(args, gkx0Var, gkx0Var2);
                        gkx0 gkx0Var3 = gkx0.c;
                        zd20.a b3 = zd20Var.b(args, gkx0Var);
                        lj30Var = b3.a;
                        lj30Var2 = b3.b;
                        lj30Var3 = b3.c;
                        zd20.a b4 = zd20Var.b(args, gkx0Var2);
                        lj30Var4 = b4.a;
                        lj30Var5 = b4.b;
                        lj30Var6 = b4.c;
                        if (!(lj30Var2 != null ? lj30Var2.j : false)) {
                            if (!(lj30Var != null ? lj30Var.i : lj30Var3 != null ? lj30Var3.i : false)) {
                                z3 = false;
                                bool = valueOf3;
                                if (!(lj30Var6 == null ? lj30Var6.i : false)) {
                                    if (!(lj30Var4 != null ? lj30Var4.j : lj30Var5 != null ? lj30Var5.j : false)) {
                                        z4 = false;
                                        boolean z8 = !z3 || z4;
                                        if (lj30Var2 != null) {
                                            ae20Var.m(lj30Var2.c, z8);
                                        }
                                        lj30Var7 = lj30Var == null ? lj30Var3 : lj30Var;
                                        if (lj30Var7 != null) {
                                            ae20Var.c(lj30Var7.c, z8);
                                        }
                                        if (lj30Var6 != null) {
                                            ae20Var.c(lj30Var6.c, z8);
                                        }
                                        lj30Var8 = lj30Var4 == null ? lj30Var5 : lj30Var4;
                                        if (lj30Var8 != null) {
                                            ae20Var.m(lj30Var8.c, z8);
                                        }
                                        List I = rl3.I(new lj30[]{lj30Var3, lj30Var, lj30Var2});
                                        ArrayList arrayList3 = new ArrayList();
                                        for (Object obj3 : I) {
                                            if (((lj30) obj3).h.compareTo(gkx0Var2) < 0) {
                                                arrayList3.add(obj3);
                                            }
                                        }
                                        List I2 = rl3.I(new lj30[]{lj30Var5, lj30Var4, lj30Var6});
                                        ArrayList arrayList4 = new ArrayList();
                                        for (Object obj4 : I2) {
                                            if (((lj30) obj4).h.compareTo(gkx0Var) > 0) {
                                                arrayList4.add(obj4);
                                            }
                                        }
                                        lj30Var9 = (lj30) j5g.a0(arrayList3);
                                        lj30Var10 = (lj30) j5g.a0(arrayList4);
                                        if (lj30Var9 != null) {
                                            ae20Var.n(lj30Var9.c, lj30Var10 != null ? lj30Var10.h : gkx0Var3);
                                        }
                                        if (lj30Var10 != null) {
                                            int i6 = lj30Var10.c;
                                            if (lj30Var9 != null) {
                                                gkx0Var3 = lj30Var9.h;
                                            }
                                            ae20Var.f(i6, gkx0Var3);
                                        }
                                        if (bool != null) {
                                            ae20Var.g(args, bool.booleanValue());
                                        }
                                        ae20Var.l(args, a2, zd20Var.d);
                                        return a2;
                                    }
                                }
                                z4 = true;
                                if (z3) {
                                }
                                if (lj30Var2 != null) {
                                }
                                if (lj30Var == null) {
                                }
                                if (lj30Var7 != null) {
                                }
                                if (lj30Var6 != null) {
                                }
                                if (lj30Var4 == null) {
                                }
                                if (lj30Var8 != null) {
                                }
                                List I3 = rl3.I(new lj30[]{lj30Var3, lj30Var, lj30Var2});
                                ArrayList arrayList32 = new ArrayList();
                                while (r3.hasNext()) {
                                }
                                List I22 = rl3.I(new lj30[]{lj30Var5, lj30Var4, lj30Var6});
                                ArrayList arrayList42 = new ArrayList();
                                while (r3.hasNext()) {
                                }
                                lj30Var9 = (lj30) j5g.a0(arrayList32);
                                lj30Var10 = (lj30) j5g.a0(arrayList42);
                                if (lj30Var9 != null) {
                                }
                                if (lj30Var10 != null) {
                                }
                                if (bool != null) {
                                }
                                ae20Var.l(args, a2, zd20Var.d);
                                return a2;
                            }
                        }
                        z3 = true;
                        bool = valueOf3;
                        if (!(lj30Var6 == null ? lj30Var6.i : false)) {
                        }
                        z4 = true;
                        if (z3) {
                        }
                        if (lj30Var2 != null) {
                        }
                        if (lj30Var == null) {
                        }
                        if (lj30Var7 != null) {
                        }
                        if (lj30Var6 != null) {
                        }
                        if (lj30Var4 == null) {
                        }
                        if (lj30Var8 != null) {
                        }
                        List I32 = rl3.I(new lj30[]{lj30Var3, lj30Var, lj30Var2});
                        ArrayList arrayList322 = new ArrayList();
                        while (r3.hasNext()) {
                        }
                        List I222 = rl3.I(new lj30[]{lj30Var5, lj30Var4, lj30Var6});
                        ArrayList arrayList422 = new ArrayList();
                        while (r3.hasNext()) {
                        }
                        lj30Var9 = (lj30) j5g.a0(arrayList322);
                        lj30Var10 = (lj30) j5g.a0(arrayList422);
                        if (lj30Var9 != null) {
                        }
                        if (lj30Var10 != null) {
                        }
                        if (bool != null) {
                        }
                        ae20Var.l(args, a2, zd20Var.d);
                        return a2;
                    }
                    z2 = false;
                    if (ae20Var.k(args) == null) {
                    }
                    ae20Var.h(args, gkx0Var, gkx0Var2, z7);
                    ae20Var.j(args, gkx0Var, gkx0Var2);
                    gkx0 gkx0Var32 = gkx0.c;
                    zd20.a b32 = zd20Var.b(args, gkx0Var);
                    lj30Var = b32.a;
                    lj30Var2 = b32.b;
                    lj30Var3 = b32.c;
                    zd20.a b42 = zd20Var.b(args, gkx0Var2);
                    lj30Var4 = b42.a;
                    lj30Var5 = b42.b;
                    lj30Var6 = b42.c;
                    if (!(lj30Var2 != null ? lj30Var2.j : false)) {
                    }
                    z3 = true;
                    bool = valueOf3;
                    if (!(lj30Var6 == null ? lj30Var6.i : false)) {
                    }
                    z4 = true;
                    if (z3) {
                    }
                    if (lj30Var2 != null) {
                    }
                    if (lj30Var == null) {
                    }
                    if (lj30Var7 != null) {
                    }
                    if (lj30Var6 != null) {
                    }
                    if (lj30Var4 == null) {
                    }
                    if (lj30Var8 != null) {
                    }
                    List I322 = rl3.I(new lj30[]{lj30Var3, lj30Var, lj30Var2});
                    ArrayList arrayList3222 = new ArrayList();
                    while (r3.hasNext()) {
                    }
                    List I2222 = rl3.I(new lj30[]{lj30Var5, lj30Var4, lj30Var6});
                    ArrayList arrayList4222 = new ArrayList();
                    while (r3.hasNext()) {
                    }
                    lj30Var9 = (lj30) j5g.a0(arrayList3222);
                    lj30Var10 = (lj30) j5g.a0(arrayList4222);
                    if (lj30Var9 != null) {
                    }
                    if (lj30Var10 != null) {
                    }
                    if (bool != null) {
                    }
                    ae20Var.l(args, a2, zd20Var.d);
                    return a2;
                }
                z = false;
                if (!gkx0Var2.equals(gkx0.e)) {
                }
                z2 = false;
                if (ae20Var.k(args) == null) {
                }
                ae20Var.h(args, gkx0Var, gkx0Var2, z7);
                ae20Var.j(args, gkx0Var, gkx0Var2);
                gkx0 gkx0Var322 = gkx0.c;
                zd20.a b322 = zd20Var.b(args, gkx0Var);
                lj30Var = b322.a;
                lj30Var2 = b322.b;
                lj30Var3 = b322.c;
                zd20.a b422 = zd20Var.b(args, gkx0Var2);
                lj30Var4 = b422.a;
                lj30Var5 = b422.b;
                lj30Var6 = b422.c;
                if (!(lj30Var2 != null ? lj30Var2.j : false)) {
                }
                z3 = true;
                bool = valueOf3;
                if (!(lj30Var6 == null ? lj30Var6.i : false)) {
                }
                z4 = true;
                if (z3) {
                }
                if (lj30Var2 != null) {
                }
                if (lj30Var == null) {
                }
                if (lj30Var7 != null) {
                }
                if (lj30Var6 != null) {
                }
                if (lj30Var4 == null) {
                }
                if (lj30Var8 != null) {
                }
                List I3222 = rl3.I(new lj30[]{lj30Var3, lj30Var, lj30Var2});
                ArrayList arrayList32222 = new ArrayList();
                while (r3.hasNext()) {
                }
                List I22222 = rl3.I(new lj30[]{lj30Var5, lj30Var4, lj30Var6});
                ArrayList arrayList42222 = new ArrayList();
                while (r3.hasNext()) {
                }
                lj30Var9 = (lj30) j5g.a0(arrayList32222);
                lj30Var10 = (lj30) j5g.a0(arrayList42222);
                if (lj30Var9 != null) {
                }
                if (lj30Var10 != null) {
                }
                if (bool != null) {
                }
                ae20Var.l(args, a2, zd20Var.d);
                return a2;
            case 13:
                ModalPostAllReactionsFragment modalPostAllReactionsFragment = (ModalPostAllReactionsFragment) this.c;
                int i7 = ModalPostAllReactionsFragment.Z;
                modalPostAllReactionsFragment.io();
                return s3q0.a;
            case 14:
                ht30 ht30Var = (ht30) this.c;
                pk30 pk30Var = ht30Var.e;
                it30 it30Var = ht30Var.f;
                Msg msg = it30Var != null ? it30Var.c : null;
                NestedMsg nestedMsg = it30Var != null ? it30Var.e : null;
                if (pk30Var != null && msg != null && nestedMsg != null) {
                    pk30Var.f(msg, nestedMsg);
                }
                return s3q0.a;
            case 15:
                ((vh40) this.c).f((MusicTrack) obj);
                return s3q0.a;
            case 16:
                ((we50) this.c).T(ye50.c.b);
                return s3q0.a;
            case 17:
                f170 f170Var = (f170) this.c;
                boolean n = sua.n((lu60) obj);
                mzp0 a3 = f170Var.a();
                if (a3 != null) {
                    a3.c(n);
                }
                return s3q0.a;
            case 18:
                externalIdsByOkIds$lambda$0 = OkApiServiceInternal.getExternalIdsByOkIds$lambda$0((OkApiServiceInternal) this.c, ((Long) obj).longValue());
                return externalIdsByOkIds$lambda$0;
            case 19:
                yp80 yp80Var = (yp80) this.c;
                Throwable th = (Throwable) obj;
                if (yp80Var != null) {
                    yp80Var.onError(th);
                }
                return s3q0.a;
            case 20:
                return Boolean.valueOf(((View) obj).equals(((PhotoViewer) this.c).x));
            case 21:
                PickVKPhotoFragmentNew pickVKPhotoFragmentNew = (PickVKPhotoFragmentNew) this.c;
                int i8 = PickVKPhotoFragmentNew.t0;
                PhotoAlbumFragment.a aVar = new PhotoAlbumFragment.a(pickVKPhotoFragmentNew.n0.f, (PhotoAlbum) obj, false);
                aVar.j.putBoolean("select", true);
                aVar.s(true);
                aVar.h(pickVKPhotoFragmentNew.getActivity(), 101);
                return s3q0.a;
            case 22:
                return new it80(((vja0) this.c).b());
            case 23:
                x5s x5sVar = (x5s) obj;
                return "'" + x5sVar.b() + "' " + x5sVar.c((ezl) this.c);
            case 24:
                nza0 nza0Var = (nza0) this.c;
                Boolean bool2 = (Boolean) obj;
                gkl gklVar = nza0Var.l;
                nza0.b bVar = nza0Var.j;
                OneVideoPlayer oneVideoPlayer = bVar.a;
                if (oneVideoPlayer != null) {
                    oneVideoPlayer.c0(gklVar);
                }
                boolean booleanValue = bool2.booleanValue();
                gkl gklVar2 = nza0Var.l;
                gklVar2.c.clear();
                gklVar2.b.forEach(new nqa0());
                gkl b5 = nza0Var.b(booleanValue);
                Pair<? extends List<? extends zpa0>, ? extends Uri> pair = nza0Var.v;
                if (pair != null) {
                    b5.F(pair.i(), pair.j());
                }
                nza0Var.l = b5;
                OneVideoPlayer oneVideoPlayer2 = bVar.a;
                if (oneVideoPlayer2 != null) {
                    oneVideoPlayer2.d0(b5);
                }
                return s3q0.a;
            case 25:
                PollOpenView pollOpenView = (PollOpenView) this.c;
                String str2 = (String) obj;
                izs<? super xrb0, s3q0> izsVar = pollOpenView.d;
                if (izsVar != null) {
                    izsVar.invoke(new xrb0.a.c.C4041a(((Integer) pollOpenView.getTag()).intValue(), str2));
                }
                return s3q0.a;
            case 26:
                lsb0 lsb0Var = (lsb0) this.c;
                rtb0.a aVar2 = (rtb0.a) obj;
                boolean z9 = aVar2.b;
                Poll poll = aVar2.a;
                if (z9) {
                    lsb0Var.T(new osb0.g(poll));
                } else {
                    lsb0Var.T(new osb0.a(Integer.valueOf(R.string.poll_user_already_voted), poll));
                }
                return s3q0.a;
            case 27:
                u6c0 u6c0Var = ((PostPreviewFragment) this.c).S;
                if (u6c0Var != null && (gzsVar = u6c0Var.f) != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 28:
                com.vk.newsfeed.impl.presenters.b bVar2 = (com.vk.newsfeed.impl.presenters.b) this.c;
                List<GroupsGroupFullDto> d = ((GroupsGetByIdObjectResponseDto) obj).d();
                if (d == null || (groupsGroupFullDto = (GroupsGroupFullDto) j5g.a0(d)) == null) {
                    return null;
                }
                bVar2.Q.getClass();
                return dqu.a(groupsGroupFullDto);
            default:
                PhotoTag photoTag = (PhotoTag) this.c;
                PhotoTag photoTag2 = (PhotoTag) obj;
                return Boolean.valueOf(photoTag2.b == photoTag.b && photoTag2.g == photoTag.g);
        }
    }
}
