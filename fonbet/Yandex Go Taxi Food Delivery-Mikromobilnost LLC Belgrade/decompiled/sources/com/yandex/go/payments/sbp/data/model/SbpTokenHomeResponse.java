package com.yandex.go.payments.sbp.data.model;

import com.yandex.go.payments.data.model.response.BankListSection;
import com.yandex.go.payments.data.model.response.BindDialog;
import com.yandex.go.payments.data.model.response.ErrorDialogs;
import com.yandex.go.payments.data.model.response.InitializationProgressScreen;
import com.yandex.go.payments.data.model.response.SearchBar;
import com.yandex.go.payments.data.model.response.i0;
import com.yandex.go.payments.data.model.response.n;
import com.yandex.go.payments.data.model.response.o;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.v4m0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/sbp/data/model/SbpTokenHomeResponse;", "", "Companion", "$serializer", "com/yandex/go/payments/sbp/data/model/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SbpTokenHomeResponse {
    public static final d Companion = new d();
    public static final i3y[] g;
    public final String a;
    public final SearchBar b;
    public final List c;
    public final BindDialog d;
    public final InitializationProgressScreen e;
    public final ErrorDialogs f;

    static {
        i0 i0Var = ErrorDialogs.Companion;
        o oVar = BindDialog.Companion;
        n nVar = BankListSection.Companion;
        g = new i3y[]{null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new v4m0(8)), null, null, null};
    }

    public SbpTokenHomeResponse(int i, String str, SearchBar searchBar, List list, BindDialog bindDialog, InitializationProgressScreen initializationProgressScreen, ErrorDialogs errorDialogs) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            SearchBar.Companion.getClass();
            this.b = SearchBar.c;
        } else {
            this.b = searchBar;
        }
        if ((i & 4) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            BindDialog.Companion.getClass();
            this.d = BindDialog.g;
        } else {
            this.d = bindDialog;
        }
        if ((i & 16) == 0) {
            InitializationProgressScreen.Companion.getClass();
            this.e = InitializationProgressScreen.b;
        } else {
            this.e = initializationProgressScreen;
        }
        if ((i & 32) != 0) {
            this.f = errorDialogs;
        } else {
            ErrorDialogs.Companion.getClass();
            this.f = ErrorDialogs.c;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SbpTokenHomeResponse)) {
            return false;
        }
        SbpTokenHomeResponse sbpTokenHomeResponse = (SbpTokenHomeResponse) obj;
        return jl40.l(this.a, sbpTokenHomeResponse.a) && jl40.l(this.b, sbpTokenHomeResponse.b) && jl40.l(this.c, sbpTokenHomeResponse.c) && jl40.l(this.d, sbpTokenHomeResponse.d) && jl40.l(this.e, sbpTokenHomeResponse.e) && jl40.l(this.f, sbpTokenHomeResponse.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + unr0.b((this.d.hashCode() + unr0.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31, 31, this.e.a);
    }

    public final String toString() {
        return "SbpTokenHomeResponse(title=" + this.a + ", searchBar=" + this.b + ", bankListSections=" + this.c + ", bindDialog=" + this.d + ", initializationProgressScreen=" + this.e + ", errorDialogs=" + this.f + Extension.C_BRAKE;
    }

    public SbpTokenHomeResponse() {
        this(0);
    }

    public SbpTokenHomeResponse(int i) {
        SearchBar.Companion.getClass();
        BindDialog.Companion.getClass();
        BindDialog bindDialog = BindDialog.g;
        InitializationProgressScreen.Companion.getClass();
        ErrorDialogs.Companion.getClass();
        ErrorDialogs errorDialogs = ErrorDialogs.c;
        this.a = "";
        this.b = SearchBar.c;
        this.c = EmptyList.a;
        this.d = bindDialog;
        this.e = InitializationProgressScreen.b;
        this.f = errorDialogs;
    }
}
