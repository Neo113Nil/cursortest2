package xsna;

import android.content.Context;
import com.vk.api.generated.pages.dto.PagesWikipageFullDto;
import com.vk.dto.common.id.UserId;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import kotlin.LazyThreadSafetyMode;
import xsna.lpx0;

/* compiled from: HtmlLoader.kt */
/* loaded from: classes7.dex */
public final class rhv implements l990 {
    public final ProfileFragmentProviderComponent a;
    public final fy20 b;
    public final lpx0.a c;
    public final Object d = msy.a(LazyThreadSafetyMode.NONE, new com.vk.movika.sdk.base.logic.interactor.m(15));

    public rhv(ProfileFragmentProviderComponent profileFragmentProviderComponent, fy20 fy20Var, lpx0.a aVar) {
        this.a = profileFragmentProviderComponent;
        this.b = fy20Var;
        this.c = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.l990
    public final void a(long j, String str) {
        bd90 bd90Var = (bd90) this.d.getValue();
        gzs<s3q0> gzsVar = fkq0.a;
        d(bd90.a(bd90Var, new UserId(j), null, null, str, 350));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.l990
    public final void b(int i, long j, boolean z) {
        d(bd90.a((bd90) this.d.getValue(), new UserId(j), Integer.valueOf(i), Boolean.valueOf(z), null, 362));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.l990
    public final void c(String str) {
        d(bd90.a((bd90) this.d.getValue(), null, null, null, str, 343));
    }

    public final void d(xy2<PagesWikipageFullDto> xy2Var) {
        io.reactivex.rxjava3.disposables.c subscribe = rsg0.y0(yfb.x(xy2Var), null, null, 3).subscribe(new l50(new nfj(this, 27), 28), new hms(new s6k(this, 25), 3));
        Context context = this.b.c;
        if (context != null) {
            ver0.c(context, subscribe);
        }
    }
}
