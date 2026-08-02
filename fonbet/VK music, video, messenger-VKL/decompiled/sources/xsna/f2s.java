package xsna;

import android.view.ViewGroup;
import com.vk.api.base.VkPaginationList;
import com.vk.api.generated.market.dto.MarketGetAlbumByIdResponseDto;
import com.vk.api.generated.market.dto.MarketGetItemReviewsResponseDto;
import com.vk.api.generated.market.dto.MarketMarketAlbumDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.catalog2.feature.music.ui.holder.MusicOfflineCatalogRootVh;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.communities.GroupsSuggestionsFragment;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupSuggestion;
import com.vk.dto.im.MsgType;
import com.vk.dto.market.MarketItemType;
import com.vk.dto.newsfeed.entries.InterestingStoriesEntry;
import com.vk.dto.photo.Photo;
import com.vk.dto.tags.Tag;
import com.vk.ecomm.market.album.GoodAlbumEditFlowEntity;
import com.vk.ecomm.market.album.MarketEditAlbumGoodsFragment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.ui.components.contacts.DonutContactsListFactory;
import com.vk.im.ui.components.group.vc.GroupProfileView;
import com.vk.im.ui.fragments.ImSelectDonutContactsFragment;
import com.vk.lists.ListDataSet;
import com.vk.log.L;
import com.vk.method.selector.impl.MethodSelectorView;
import com.vk.method.selector.impl.a;
import com.vk.newsfeed.api.posting.profilefriendslists.ProfileFriendItem;
import com.vk.newsfeed.common.PostActions;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import org.json.JSONObject;
import ru.ok.gl.tf.Tensorflow;
import xsna.drz;
import xsna.e0o0;
import xsna.tj50;
import xsna.tlo0;
import xsna.x1s;
import xsna.y6u;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class f2s implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f2s(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        List arrayList;
        tlo0.a aVar;
        int i;
        e0o0 e0o0Var;
        tfx c;
        int i2 = 2;
        switch (this.b) {
            case 0:
                return new Pair((drz.a) this.c, (x1s.a) obj);
            case 1:
                fxt0 fxt0Var = (fxt0) this.c;
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((zak0) fxt0Var.f).setValue(bool);
                return s3q0.a;
            case 2:
                return new mns((ViewGroup) obj, ((pms) this.c).i);
            case 3:
                zqs zqsVar = (zqs) this.c;
                List<UsersUserFullDto> list = (List) obj;
                ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
                for (UsersUserFullDto usersUserFullDto : list) {
                    Serializer.c<ProfileFriendItem> cVar = ProfileFriendItem.CREATOR;
                    arrayList2.add(ProfileFriendItem.a.b(usersUserFullDto));
                }
                return new VkPaginationList(arrayList2, Math.max(zqsVar.c.size(), 31), true, zqsVar.d);
            case 4:
                svs svsVar = (svs) this.c;
                if (((uvs) obj) instanceof nvf) {
                    svsVar.d();
                }
                return s3q0.a;
            case 5:
                o3t o3tVar = (o3t) this.c;
                o3tVar.b = (JSONObject) obj;
                o3tVar.a = Long.valueOf(System.currentTimeMillis());
                return s3q0.a;
            case 6:
                return c4u.b(null, (MarketGetItemReviewsResponseDto) obj, (cxo) this.c);
            case 7:
                k6u k6uVar = (k6u) this.c;
                Throwable th = (Throwable) obj;
                mzp0 mzp0Var = k6uVar.i;
                if (mzp0Var != null) {
                    mzp0Var.f();
                }
                k6uVar.T(new y6u.d.a(th));
                return s3q0.a;
            case 8:
                GroupProfileView groupProfileView = (GroupProfileView) this.c;
                int i3 = GroupProfileView.K;
                groupProfileView.getClass();
                return s3q0.a;
            case 9:
                kym0 kym0Var = (kym0) obj;
                pru pruVar = ((GroupsSuggestionsFragment) this.c).V;
                if (pruVar != null) {
                    UserId a = fkq0.a(kym0Var.b);
                    int i4 = kym0Var.a.value;
                    ListDataSet<GroupSuggestion> listDataSet = pruVar.g;
                    final nru nruVar = new nru(a, r6);
                    int w = listDataSet.w(new Predicate() { // from class: xsna.oru
                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj2) {
                            return ((Boolean) nru.this.invoke(obj2)).booleanValue();
                        }
                    });
                    GroupSuggestion c2 = listDataSet.c(w);
                    if (c2 != null) {
                        Group group = c2.b;
                        if (group.C != i4) {
                            group.C = i4;
                            listDataSet.d(w);
                        }
                    }
                }
                return s3q0.a;
            case 10:
                c8v c8vVar = (c8v) this.c;
                c8vVar.d1().f(false);
                c8vVar.f1().a((Throwable) obj);
                return s3q0.a;
            case 11:
                ((k8w) this.c).b();
                return s3q0.a;
            case 12:
                ((cbw) this.c).d.set(System.currentTimeMillis() + 3600000);
                L.g("Can't fetch reaction assets ", (Throwable) obj);
                return s3q0.a;
            case 13:
                ImSelectDonutContactsFragment imSelectDonutContactsFragment = (ImSelectDonutContactsFragment) this.c;
                x8j x8jVar = (x8j) obj;
                DonutContactsListFactory donutContactsListFactory = imSelectDonutContactsFragment.Y;
                return (donutContactsListFactory != null ? donutContactsListFactory : null).j().invoke(new fzn(x8jVar.a, x8jVar.b, x8jVar.c, x8jVar.d, imSelectDonutContactsFragment.i0));
            case 14:
                zdx zdxVar = (zdx) this.c;
                InterestingStoriesEntry q6 = zdxVar.q6();
                if (q6 == null) {
                    return s3q0.a;
                }
                s980 s980Var = zdxVar.y;
                if (s980Var != null) {
                    NewsEntry t6 = zdxVar.t6();
                    int h = PostActions.ACTION_LAZY_LOAD_RETRY.h();
                    u1c0 J0 = zdxVar.J0();
                    s980Var.d9(q6, t6, h, J0 != null ? J0.k : 0);
                }
                return s3q0.a;
            case 15:
                elz elzVar = ((klz) this.c).d;
                if (elzVar != null) {
                    elzVar.R();
                }
                return s3q0.a;
            case 16:
                return new uyz(tj50.a.d((tj50.a) obj, new pyz(r6), new qey(2), new ryz(2, (qyz) this.c, qyz.class, "isApplyButtonEnabled", "isApplyButtonEnabled(Lcom/vk/search/params/impl/presentation/modal/location/mvi/model/LocationSearchState$LocationState;Lcom/vk/search/params/impl/presentation/modal/location/mvi/model/LocationSearchState$ResultItemSource;)Z", 0)));
            case 17:
                l6u l6uVar = (l6u) this.c;
                int i5 = MarketEditAlbumGoodsFragment.c1;
                MarketMarketAlbumDto marketMarketAlbumDto = (MarketMarketAlbumDto) j5g.a0(((MarketGetAlbumByIdResponseDto) obj).d());
                if (marketMarketAlbumDto != null) {
                    PhotosPhotoDto e = marketMarketAlbumDto.e();
                    Photo a2 = e != null ? xfa0.a(e) : null;
                    UserId q = marketMarketAlbumDto.q();
                    String title = marketMarketAlbumDto.getTitle();
                    Integer valueOf = Integer.valueOf(marketMarketAlbumDto.getId());
                    int count = marketMarketAlbumDto.getCount();
                    Boolean j = marketMarketAlbumDto.j();
                    boolean booleanValue = j != null ? j.booleanValue() : false;
                    Boolean i6 = marketMarketAlbumDto.i();
                    boolean booleanValue2 = i6 != null ? i6.booleanValue() : false;
                    List<Integer> d = marketMarketAlbumDto.d();
                    if (d != null) {
                        List<Integer> list2 = d;
                        ArrayList arrayList3 = new ArrayList(c5g.u(list2, 10));
                        Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(Long.valueOf(((Number) it.next()).intValue()));
                        }
                        arrayList = rdi.g(arrayList3);
                    } else {
                        arrayList = new ArrayList();
                    }
                    l6uVar.invoke(new GoodAlbumEditFlowEntity(q, title, valueOf, a2, count, booleanValue, booleanValue2, arrayList, null, null, Tensorflow.FRAME_HEIGHT, null));
                }
                return s3q0.a;
            case 18:
                a510 a510Var = (a510) this.c;
                x410 x410Var = (x410) obj;
                boolean z = x410Var.g;
                boolean z2 = x410Var.l;
                if (x410Var.p != MarketItemType.OZON && x410Var.q == null) {
                    r4 = false;
                }
                a510Var.getClass();
                if (r4) {
                    aVar = tlo0.Companion;
                    i = R.string.market_item_empty_list_title_for_ozon;
                } else if (z) {
                    aVar = tlo0.Companion;
                    i = R.string.market_item_empty_list_first_review_title;
                } else if (z2) {
                    aVar = tlo0.Companion;
                    i = R.string.market_item_empty_list_title_for_admin;
                } else {
                    aVar = tlo0.Companion;
                    i = R.string.market_item_empty_list_title;
                }
                return tq.h(aVar, i);
            case 19:
                f910 f910Var = (f910) this.c;
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                la10 a3 = f910Var.a();
                if (a3 != null) {
                    a3.setLoading(booleanValue3);
                }
                return s3q0.a;
            case 20:
                com.vk.newsfeed.posting.market_picker.presentation.base.view.f fVar = (com.vk.newsfeed.posting.market_picker.presentation.base.view.f) this.c;
                Pair pair = (Pair) obj;
                Photo photo = (Photo) pair.d();
                List list3 = (List) pair.g();
                final oue oueVar = new oue(4);
                List<e0o0> D0 = j5g.D0(new Comparator() { // from class: xsna.da10
                    @Override // java.util.Comparator
                    public final int compare(Object obj2, Object obj3) {
                        return ((Number) oue.this.invoke(obj2, obj3)).intValue();
                    }
                }, list3);
                ArrayList arrayList4 = new ArrayList(c5g.u(D0, 10));
                for (e0o0 e0o0Var2 : D0) {
                    if (e0o0Var2 instanceof e0o0.c) {
                        e0o0.c cVar2 = (e0o0.c) e0o0Var2;
                        c = ((n2o0) fVar.h.getValue()).a(cVar2.a.a.e, cVar2.a.a.a, photo.e, Tag.ContentType.PHOTO.h(), photo.v);
                    } else if (e0o0Var2 instanceof e0o0.b) {
                        StringBuilder sb = new StringBuilder("product");
                        e0o0.b bVar = (e0o0.b) e0o0Var2;
                        sb.append(bVar.a.b);
                        sb.append('_');
                        sb.append(bVar.a.c);
                        String sb2 = sb.toString();
                        n2o0 n2o0Var = (n2o0) fVar.h.getValue();
                        String h2 = Tag.ContentType.PHOTO.h();
                        UserId userId = photo.e;
                        int i7 = photo.c;
                        String str = photo.v;
                        Tag tag = bVar.a.a;
                        c = n2o0Var.c(h2, userId, i7, sb2, str, Float.valueOf((float) tag.g), Float.valueOf((float) tag.h));
                    } else {
                        if (!(e0o0Var2 instanceof e0o0.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        StringBuilder sb3 = new StringBuilder("product");
                        e0o0.a aVar2 = (e0o0.a) e0o0Var2;
                        sb3.append(aVar2.a.d.c);
                        sb3.append('_');
                        sb3.append(aVar2.a.d.b);
                        String sb4 = sb3.toString();
                        n2o0 n2o0Var2 = (n2o0) fVar.h.getValue();
                        String h3 = Tag.ContentType.PHOTO.h();
                        UserId userId2 = photo.e;
                        int i8 = photo.c;
                        String str2 = photo.v;
                        Tag tag2 = aVar2.a.a;
                        e0o0Var = e0o0Var2;
                        c = n2o0Var2.c(h3, userId2, i8, sb4, str2, Float.valueOf((float) tag2.g), Float.valueOf((float) tag2.h));
                        arrayList4.add(new io.reactivex.rxjava3.internal.operators.observable.p1(rsg0.a0(yfb.x(c)).U(new pb(new ea10(e0o0Var, 0), 22)), new nm3(new irt(2), 18)));
                    }
                    e0o0Var = e0o0Var2;
                    arrayList4.add(new io.reactivex.rxjava3.internal.operators.observable.p1(rsg0.a0(yfb.x(c)).U(new pb(new ea10(e0o0Var, 0), 22)), new nm3(new irt(2), 18)));
                }
                Iterator it2 = arrayList4.iterator();
                if (!it2.hasNext()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                Object obj2 = it2.next();
                while (it2.hasNext()) {
                    io.reactivex.rxjava3.core.q qVar = (io.reactivex.rxjava3.core.q) it2.next();
                    io.reactivex.rxjava3.core.q qVar2 = (io.reactivex.rxjava3.core.q) obj2;
                    qVar2.getClass();
                    Objects.requireNonNull(qVar, "other is null");
                    obj2 = io.reactivex.rxjava3.core.q.q(qVar2, qVar);
                }
                return ((io.reactivex.rxjava3.core.q) obj2).f0(new ArrayList(), new rf3(new aad(6), 17)).l(new nit(new dxh(photo, 24), 4)).q(vx2.d.m()).m(asu0.a.d());
            case 21:
                ((w920) this.c).g.debug(new jhg((String) obj, i2));
                return s3q0.a;
            case 22:
                Boolean bool2 = (Boolean) obj;
                ChannelFragment.b bVar2 = ((sf20) this.c).n;
                bool2.booleanValue();
                ((io.reactivex.rxjava3.subjects.d) ChannelFragment.this.x0.a).onNext(bool2);
                return s3q0.a;
            case 23:
                com.vk.method.selector.impl.b bVar3 = (com.vk.method.selector.impl.b) this.c;
                List list4 = (List) obj;
                com.vk.method.selector.impl.a bVar4 = list4.isEmpty() ? a.c.a : new a.b(list4);
                bVar3.o = bVar4;
                MethodSelectorView methodSelectorView = bVar3.h;
                if (methodSelectorView != null) {
                    methodSelectorView.setState(bVar4);
                }
                bVar3.p.a = bVar3.o;
                return s3q0.a;
            case 24:
                fv20 fv20Var = (fv20) this.c;
                VkButton vkButton = fv20Var.j1;
                if (vkButton == null) {
                    vkButton = null;
                }
                vkButton.setLoading(true);
                hv20<?> hv20Var = fv20Var.r1;
                (hv20Var != null ? hv20Var : null).K2(fv20Var.A1, fv20Var.eo());
                return s3q0.a;
            case 25:
                ((per) this.c).invoke((Throwable) obj);
                return s3q0.a;
            case 26:
                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g b = qk30.b(((Integer) obj).intValue(), ((vm30) this.c).H);
                return Boolean.valueOf(b != null && b.B());
            case 27:
                kz30 kz30Var = (kz30) this.c;
                MsgType msgType = (MsgType) obj;
                if (msgType != null) {
                    kz30Var.W(kz30.c0(msgType));
                }
                return s3q0.a;
            case 28:
                ((mat0) this.c).e();
                return s3q0.a;
            default:
                MusicOfflineCatalogRootVh musicOfflineCatalogRootVh = (MusicOfflineCatalogRootVh) this.c;
                if (((Integer) obj).intValue() > 0) {
                    utk0 utk0Var = musicOfflineCatalogRootVh.x;
                    Boolean bool3 = Boolean.FALSE;
                    utk0Var.getClass();
                    utk0Var.i(null, bool3);
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ f2s(c4u c4uVar, cxo cxoVar) {
        this.b = 6;
        this.c = cxoVar;
    }
}
