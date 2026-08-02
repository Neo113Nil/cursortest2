package com.yandex.go.places.impl.data.repositories.organizations;

import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.FilterChoiceOptionDto;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.FilterDto$OneOfManySelectionFilterDto;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.FilterDto$ToggleFilterDto;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.FiltersAndSortingResponseDto;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.SortChoiceOptionDto;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.SortDto;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.f;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.g;
import com.yandex.go.places.impl.data.mappers.organizations.h;
import defpackage.bvf0;
import defpackage.gvp0;
import defpackage.jl40;
import defpackage.rcc;
import defpackage.s95;
import defpackage.t95;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tt2;
import defpackage.u95;
import defpackage.uyj;
import defpackage.v95;
import defpackage.w511;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class b {
    public final tt2 a;
    public final h b;
    public final r0 c = bvf0.c(null);
    public final r0 d = bvf0.c(EmptyList.a);
    public final r0 e = bvf0.c(new FiltersAndSortingResponseDto(0));

    public b(tt2 tt2Var, h hVar) {
        this.a = tt2Var;
        this.b = hVar;
    }

    public final List a() {
        List list = (List) this.c.getValue();
        return list == null ? EmptyList.a : list;
    }

    public final Object b(String str, Continuation continuation) {
        this.a.getClass();
        return tje.k0(uyj.a, new OrganizationsSearchOptionsRepository$getSearchOptionById$2(this, str, null), continuation);
    }

    public final void c(FiltersAndSortingResponseDto filtersAndSortingResponseDto) {
        v95 v95Var;
        this.e.l(filtersAndSortingResponseDto);
        this.d.l(filtersAndSortingResponseDto.c);
        List<g> list = filtersAndSortingResponseDto.a;
        SortDto sortDto = (SortDto) kotlin.collections.a.R(filtersAndSortingResponseDto.b);
        this.b.getClass();
        ListBuilder a = rcc.a();
        ArrayList arrayList = new ArrayList();
        for (g gVar : list) {
            if (gVar instanceof FilterDto$ToggleFilterDto) {
                FilterDto$ToggleFilterDto filterDto$ToggleFilterDto = (FilterDto$ToggleFilterDto) gVar;
                String str = filterDto$ToggleFilterDto.a;
                FilterChoiceOptionDto filterChoiceOptionDto = filterDto$ToggleFilterDto.b;
                v95Var = new u95(str, new gvp0(filterChoiceOptionDto.getA(), filterChoiceOptionDto.getB(), filterChoiceOptionDto.getC()));
            } else if (gVar instanceof FilterDto$OneOfManySelectionFilterDto) {
                FilterDto$OneOfManySelectionFilterDto filterDto$OneOfManySelectionFilterDto = (FilterDto$OneOfManySelectionFilterDto) gVar;
                String str2 = filterDto$OneOfManySelectionFilterDto.a;
                List<FilterChoiceOptionDto> list2 = filterDto$OneOfManySelectionFilterDto.b;
                ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
                for (FilterChoiceOptionDto filterChoiceOptionDto2 : list2) {
                    arrayList2.add(new gvp0(filterChoiceOptionDto2.getA(), filterChoiceOptionDto2.getB(), filterChoiceOptionDto2.getC()));
                }
                v95Var = new s95(str2, arrayList2);
            } else {
                if (!jl40.l(gVar, f.INSTANCE)) {
                    w511.b();
                    return;
                }
                v95Var = null;
            }
            if (v95Var != null) {
                arrayList.add(v95Var);
            }
        }
        a.addAll(arrayList);
        if (sortDto != null) {
            String str3 = sortDto.a;
            List<SortChoiceOptionDto> list3 = sortDto.b;
            ArrayList arrayList3 = new ArrayList(tcc.n(list3, 10));
            for (SortChoiceOptionDto sortChoiceOptionDto : list3) {
                arrayList3.add(new gvp0(sortChoiceOptionDto.a, sortChoiceOptionDto.b, sortChoiceOptionDto.c));
            }
            a.add(new t95(str3, arrayList3));
        }
        this.c.l(a.j());
    }
}
