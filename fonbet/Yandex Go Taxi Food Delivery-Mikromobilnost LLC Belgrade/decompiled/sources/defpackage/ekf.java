package defpackage;

import android.content.Context;
import android.view.View;
import com.yandex.payment.sdk.flex.impl.customview.views.loader.CustomLoaderView;

/* loaded from: classes2.dex */
public final class ekf extends jz4 {
    public ekf() {
        super(hkf.Companion.serializer());
    }

    @Override // defpackage.jz4
    public final /* bridge */ /* synthetic */ void a(View view, yzh yzhVar) {
    }

    @Override // defpackage.jz4
    public final View b(Context context, Object obj, qnh qnhVar) {
        return new CustomLoaderView(context, (hkf) obj, qnhVar);
    }
}
