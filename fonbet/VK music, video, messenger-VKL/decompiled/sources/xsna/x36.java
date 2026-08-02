package xsna;

import android.content.Context;
import com.vk.catalog2.common.dto.api.banner.Banner;
import com.vk.catalog2.common.ui.holders.container.BannersVh;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: BannersVh.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class x36 extends FunctionReferenceImpl implements wzs<Context, Banner, s3q0> {
    @Override // xsna.wzs
    public final s3q0 invoke(Context context, Banner banner) {
        Banner banner2 = banner;
        BannersVh bannersVh = (BannersVh) this.receiver;
        bannersVh.b.a(new t180(banner2));
        bannersVh.f.invoke(context, banner2.c);
        return s3q0.a;
    }
}
