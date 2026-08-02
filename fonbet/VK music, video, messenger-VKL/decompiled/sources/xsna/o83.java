package xsna;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.compose.runtime.a;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.vk.api.generated.shortVideo.dto.ShortVideoRemoveFavoriteAudioResponseDto;
import com.vk.appredirects.entity.App;
import com.vk.appredirects.entity.LinkType;
import com.vk.appredirects.ui.AppRedirectsSettingsFragment;
import com.vk.catalog.mvi.block.impl.filters.HorizontalFiltersWithScrollView;
import com.vk.core.compose.component.datetime.DateTimePickerState;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.discover.DiscoverCategory;
import com.vk.dto.newsfeed.discover.DiscoverId;
import com.vk.dto.photo.Photo;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.lists.DefaultEmptyView;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.newsfeed.api.data.discover.DiscoverCategoriesContainer;
import com.vk.newsfeed.impl.discover.themed.ThemedFeedToolbarFragment;
import com.vk.photos.root.photoflow.presentation.d;
import com.vk.stickers.keyboard.StickersView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.b9a0;
import xsna.kh00;
import xsna.pg00;
import xsna.q630;
import xsna.t310;
import xsna.tlo0;
import xsna.ty4;
import xsna.wk50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class o83 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ o83(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        tlo0.a aVar;
        int i;
        ViewPager viewPager;
        DiscoverId discoverId;
        int i2 = this.b;
        Object obj2 = null;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i2) {
            case 0:
                AppRedirectsSettingsFragment appRedirectsSettingsFragment = (AppRedirectsSettingsFragment) obj5;
                LinkType linkType = (LinkType) obj4;
                App app2 = (App) obj3;
                int i3 = AppRedirectsSettingsFragment.L0;
                View view = appRedirectsSettingsFragment.b0;
                if (view != null) {
                    xo2.f(view, false, true, 300L);
                }
                Toast.makeText(appRedirectsSettingsFragment.requireContext(), appRedirectsSettingsFragment.getString(R.string.app_redirects_setting_change_succeeded), 0).show();
                ArrayList<T> arrayList = appRedirectsSettingsFragment.v0;
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((j83) next).a == linkType) {
                            obj2 = next;
                        }
                    }
                }
                j83 j83Var = (j83) obj2;
                if (j83Var != null) {
                    j83 j83Var2 = new j83(j83Var.a, app2, j83Var.c);
                    int indexOf = arrayList.indexOf(j83Var);
                    arrayList.remove(j83Var);
                    arrayList.add(indexOf, j83Var2);
                    appRedirectsSettingsFragment.q();
                }
                return s3q0.a;
            case 1:
                String str = (String) obj5;
                ty4 ty4Var = (ty4) obj4;
                ClipGridParams.Data.Music music = (ClipGridParams.Data.Music) obj3;
                List<String> d = ((ShortVideoRemoveFavoriteAudioResponseDto) obj).d();
                if (d == null) {
                    d = EmptyList.b;
                }
                if (!d.contains(str)) {
                    ty4Var.b.invoke(new ty4.b.C3778b(music));
                }
                return s3q0.a;
            case 2:
                List list = (List) obj;
                DateTimePickerState dateTimePickerState = new DateTimePickerState((k9x) obj5, (fai0) obj4, (DateTimePickerState.UpdateValueFromDialogsStrategy) obj3, (DateTimePickerState.DialogState) list.get(0));
                com.vk.core.compose.component.datetime.m mVar = dateTimePickerState.a;
                mVar.a().h((String) list.get(1));
                s3q0 s3q0Var = s3q0.a;
                ((zak0) mVar.a).setValue(mVar.a());
                return dateTimePickerState;
            case 3:
                final HorizontalFiltersWithScrollView.f fVar = (HorizontalFiltersWithScrollView.f) obj5;
                HorizontalFiltersWithScrollView.b bVar = (HorizontalFiltersWithScrollView.b) obj4;
                final izs izsVar = (izs) obj3;
                nvy nvyVar = (nvy) obj;
                final int i4 = 0;
                for (Object obj6 : fVar.d) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        e43.t();
                        throw null;
                    }
                    final HorizontalFiltersWithScrollView.f.a aVar2 = (HorizontalFiltersWithScrollView.f.a) obj6;
                    final HorizontalFiltersWithScrollView.b bVar2 = bVar;
                    nvy.g(nvyVar, aVar2.a, null, kai.b(192778519, new yzs() { // from class: xsna.mdv
                        @Override // xsna.yzs
                        public final Object invoke(Object obj7, Object obj8, Object obj9) {
                            androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj8;
                            int intValue = ((Integer) obj9).intValue();
                            if (aVar3.t(intValue & 1, (intValue & 17) != 16)) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(192778519, intValue, -1, "com.vk.catalog.mvi.block.impl.filters.HorizontalFiltersWithScrollView.BlockView.ContentImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HorizontalFiltersWithScrollView.kt:350)");
                                }
                                final int i6 = i4;
                                boolean o = aVar3.o(i6);
                                Object x = aVar3.x();
                                a.C0011a.C0012a c0012a = a.C0011a.a;
                                if (o || x == c0012a) {
                                    x = new izs() { // from class: xsna.hdv
                                        @Override // xsna.izs
                                        public final Object invoke(Object obj10) {
                                            bgi0.a((tgi0) obj10, i6);
                                            return s3q0.a;
                                        }
                                    };
                                    aVar3.R(x);
                                }
                                q630 b = egi0.b(q630.a.a, false, (izs) x);
                                final izs izsVar2 = izsVar;
                                boolean J = aVar3.J(izsVar2);
                                final HorizontalFiltersWithScrollView.f fVar2 = fVar;
                                boolean J2 = J | aVar3.J(fVar2) | aVar3.o(i6);
                                Object x2 = aVar3.x();
                                if (J2 || x2 == c0012a) {
                                    x2 = new gzs() { // from class: xsna.jdv
                                        @Override // xsna.gzs
                                        public final Object invoke() {
                                            izs.this.invoke(new HorizontalFiltersWithScrollView.a.C0449a(fVar2.b, i6));
                                            return s3q0.a;
                                        }
                                    };
                                    aVar3.R(x2);
                                }
                                bVar2.d(aVar2, b, (gzs) x2, aVar3, 0, 0);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                            } else {
                                aVar3.h();
                            }
                            return s3q0.a;
                        }
                    }), 2);
                    bVar = bVar2;
                    i4 = i5;
                }
                return s3q0.a;
            case 4:
                izs izsVar2 = (izs) obj5;
                pg00.b bVar3 = (pg00.b) obj4;
                wh50 wh50Var = (wh50) obj3;
                aoj aojVar = (aoj) obj;
                aojVar.a(new kh00.a(izsVar2, bVar3, wh50Var));
                aojVar.a(new kh00.b(izsVar2, bVar3, wh50Var));
                return s3q0.a;
            case 5:
                ((r210) obj5).b.b(new t310.e(tq.h(tlo0.Companion, R.string.market_all_reviews_delete_and_restore_error)));
                r210.e((wk50.a) obj4, false, (x410) obj3);
                return s3q0.a;
            case 6:
                com.vk.photos.root.photoflow.presentation.b bVar4 = (com.vk.photos.root.photoflow.presentation.b) obj5;
                List list2 = (List) obj4;
                List list3 = (List) obj3;
                Integer num = (Integer) obj;
                List list4 = list2;
                ArrayList arrayList2 = new ArrayList(c5g.u(list4, 10));
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Integer.valueOf(((Photo) it2.next()).c));
                }
                bVar4.T(new d.e(j5g.S0(arrayList2)));
                f4z f4zVar = bVar4.h;
                r3 = list2.size() != list3.size() ? 1 : 0;
                int size = list2.size();
                int i6 = 21;
                if (num != null && num.intValue() == size) {
                    if (list3.size() == 1) {
                        aVar = tlo0.Companion;
                        i = R.string.photo_archive_move_photo_success;
                    } else if (r3 != 0) {
                        aVar = tlo0.Companion;
                        i = R.string.not_all_photos_moved_system;
                    } else {
                        aVar = tlo0.Companion;
                        i = R.string.photo_archive_move_photos_success;
                    }
                    f4zVar.b(new b9a0.k(new j7k0(tq.h(aVar, i), Integer.valueOf(R.drawable.vk_icon_check_circle_outline_28), Integer.valueOf(R.attr.vk_ui_icon_positive), tq.h(tlo0.Companion, R.string.photo_archive_go), new tzv(bVar4, i6), null, 32)));
                } else {
                    f4zVar.b(new b9a0.k(new j7k0(tq.h(tlo0.Companion, R.string.photo_archive_move_photos_fail), Integer.valueOf(R.drawable.vk_icon_warning_triangle_outline_28), Integer.valueOf(R.attr.vk_ui_accent_orange), new tlo0.f(R.string.see_photo_archive_result), new k7y(bVar4, i6), null, 32)));
                }
                bVar4.X();
                return s3q0.a;
            case 7:
                return ((huh0) obj5).e.e1((MusicTrack) obj4, (MusicPlaybackLaunchContext) obj3, true);
            case 8:
                g2v.d().a().g(((StickersView) obj5).getContext(), (ArrayList) obj4, ((dqt) obj).b, (String) obj3);
                return s3q0.a;
            default:
                ThemedFeedToolbarFragment themedFeedToolbarFragment = (ThemedFeedToolbarFragment) obj5;
                ViewPager viewPager2 = (ViewPager) obj4;
                TabLayout tabLayout = (TabLayout) obj3;
                DiscoverCategoriesContainer discoverCategoriesContainer = (DiscoverCategoriesContainer) obj;
                int i7 = ThemedFeedToolbarFragment.a0;
                ArrayList arrayList3 = new ArrayList(discoverCategoriesContainer.b.size());
                int i8 = 0;
                for (Object obj7 : discoverCategoriesContainer.b) {
                    int i9 = i8 + 1;
                    if (i8 < 0) {
                        e43.t();
                        throw null;
                    }
                    DiscoverCategory discoverCategory = (DiscoverCategory) obj7;
                    FragmentImpl a = new e2n(discoverCategory, i8, false).a();
                    if (a != null) {
                        arrayList3.add(new Pair(discoverCategory, a));
                    }
                    i8 = i9;
                }
                ThemedFeedToolbarFragment.b bVar5 = themedFeedToolbarFragment.U;
                if (bVar5 != null) {
                    ArrayList<Pair<DiscoverCategory, FragmentImpl>> arrayList4 = bVar5.m;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    bVar5.notifyDataSetChanged();
                }
                viewPager2.setAdapter(themedFeedToolbarFragment.U);
                themedFeedToolbarFragment.go(tabLayout);
                themedFeedToolbarFragment.Wd(tabLayout.b(viewPager2.getCurrentItem()));
                View view2 = themedFeedToolbarFragment.S;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                if (arrayList3.isEmpty()) {
                    DefaultEmptyView defaultEmptyView = themedFeedToolbarFragment.T;
                    if (defaultEmptyView != null) {
                        defaultEmptyView.setVisibility(0);
                    }
                } else {
                    viewPager2.setVisibility(0);
                    if (arrayList3.size() == 1) {
                        tabLayout.setVisibility(8);
                    } else {
                        tabLayout.setVisibility(0);
                    }
                }
                Bundle arguments = themedFeedToolbarFragment.getArguments();
                String string = arguments != null ? arguments.getString("tab") : null;
                Bundle arguments2 = themedFeedToolbarFragment.getArguments();
                if (arguments2 != null) {
                    arguments2.remove("tab");
                }
                ThemedFeedToolbarFragment.b bVar6 = themedFeedToolbarFragment.U;
                if (bVar6 != null) {
                    int size2 = bVar6.m.size();
                    while (true) {
                        if (r3 >= size2) {
                            r3 = -1;
                        } else {
                            Bundle arguments3 = bVar6.c(r3).getArguments();
                            String str2 = (arguments3 == null || (discoverId = (DiscoverId) arguments3.getParcelable("discover_id")) == null) ? null : discoverId.b;
                            if (str2 == null || !str2.equals(string)) {
                                r3++;
                            }
                        }
                    }
                    if (r3 >= 0 && (viewPager = themedFeedToolbarFragment.V) != null) {
                        viewPager.setCurrentItem(r3, true);
                    }
                }
                return s3q0.a;
        }
    }
}
