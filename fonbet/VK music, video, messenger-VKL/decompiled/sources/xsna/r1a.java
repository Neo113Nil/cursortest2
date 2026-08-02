package xsna;

import com.vk.catalog.mvi.domain.CatalogLinkButtonActionDo;

/* compiled from: CatalogBlockEvent.kt */
/* loaded from: classes.dex */
public interface r1a extends pk50 {

    /* compiled from: CatalogBlockEvent.kt */
    /* loaded from: classes16.dex */
    public static final class a implements r1a {
        public final CatalogLinkButtonActionDo a;

        public a(CatalogLinkButtonActionDo catalogLinkButtonActionDo) {
            this.a = catalogLinkButtonActionDo;
        }
    }

    /* compiled from: CatalogBlockEvent.kt */
    /* loaded from: classes16.dex */
    public static final class b implements r1a {
        public final String a;
        public final String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }
}
