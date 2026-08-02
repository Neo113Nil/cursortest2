package xsna;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import com.vk.dto.common.id.UserId;
import com.vk.tabbar.core.api.domain.TabbarState;

/* compiled from: TabbarInteractor.kt */
/* loaded from: classes11.dex */
public interface wtn0 {
    TabbarState b();

    TabbarState c();

    void d(TabbarState tabbarState, boolean z);

    Bundle e(String str);

    BitmapDrawable f(int i, int i2, int i3);

    void g(UserId userId);

    void h(String str);

    io.reactivex.rxjava3.subjects.f i();

    io.reactivex.rxjava3.internal.operators.observable.z0 j();

    UserId k();

    void l();

    BitmapDrawable m(Bitmap bitmap, int i, int i2, boolean z);
}
