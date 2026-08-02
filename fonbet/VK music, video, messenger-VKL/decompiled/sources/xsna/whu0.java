package xsna;

/* compiled from: VkCatalogConfiguration.kt */
/* loaded from: classes16.dex */
public final class whu0 extends u96 {
    public final /* synthetic */ com.vk.catalog2.common.ui.mvp.configuration.a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public whu0(com.vk.catalog2.common.ui.mvp.configuration.a aVar) {
        super(null);
        this.c = aVar;
    }

    @Override // xsna.gda
    public final io.reactivex.rxjava3.core.q d(String str, String str2, String str3, boolean z, Integer num) {
        if (str == null) {
            str = null;
        }
        return this.c.j(str, str2, str3);
    }
}
