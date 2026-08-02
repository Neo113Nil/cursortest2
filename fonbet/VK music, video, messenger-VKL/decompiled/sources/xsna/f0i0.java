package xsna;

import com.vk.search.integration.api.SearchDelegate;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: SearchViewStateController.kt */
/* loaded from: classes5.dex */
public final class f0i0 {
    public final FunctionReferenceImpl a;
    public final boolean b;
    public boolean d;
    public boolean e;
    public boolean c = true;
    public SearchDelegate.SearchState f = SearchDelegate.SearchState.COLLAPSED;

    /* JADX WARN: Multi-variable type inference failed */
    public f0i0(boolean z, gzs gzsVar) {
        this.a = (FunctionReferenceImpl) gzsVar;
        this.b = z;
    }

    public final SearchDelegate.SearchState a() {
        return !this.d ? SearchDelegate.SearchState.COLLAPSED : (!this.c || this.e) ? SearchDelegate.SearchState.ACTIVE : SearchDelegate.SearchState.EXPANDED;
    }
}
