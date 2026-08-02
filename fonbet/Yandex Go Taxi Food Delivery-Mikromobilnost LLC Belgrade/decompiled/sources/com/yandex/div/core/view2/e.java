package com.yandex.div.core.view2;

import android.graphics.drawable.ColorDrawable;
import com.yandex.div.core.widget.LoadableImageView;
import defpackage.l6o;
import defpackage.tls;
import defpackage.xdv;
import defpackage.zdv;
import defpackage.zy11;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final class e {
    public final ExecutorService a;

    public e(ExecutorService executorService) {
        this.a = executorService;
    }

    public final void a(final LoadableImageView loadableImageView, final l6o l6oVar, String str, int i, boolean z, tls tlsVar, final tls tlsVar2) {
        final int i2;
        final tls tlsVar3;
        zy11 zy11Var = null;
        Future<?> submit = null;
        if (str != null) {
            i2 = i;
            tlsVar3 = tlsVar;
            final tls tlsVar4 = new tls() { // from class: com.yandex.div.core.view2.DivPlaceholderLoader$applyPlaceholder$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    zdv zdvVar = (zdv) obj;
                    if (zdvVar instanceof xdv) {
                        l6o.this.f(new Throwable("Preview doesn't contain base64 image", ((xdv) zdvVar).a));
                        tls tlsVar5 = tlsVar3;
                        this.getClass();
                        tlsVar5.invoke(new ColorDrawable(i2));
                    } else {
                        tlsVar2.invoke(zdvVar);
                    }
                    return zy11.a;
                }
            };
            Future loadingTask = loadableImageView.getLoadingTask();
            if (loadingTask != null) {
                loadingTask.cancel(true);
            }
            com.yandex.div.core.a aVar = new com.yandex.div.core.a(str, z, new tls() { // from class: com.yandex.div.core.view2.DivPlaceholderLoader$enqueueDecoding$future$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    tls.this.invoke((zdv) obj);
                    loadableImageView.cleanLoadingTask();
                    return zy11.a;
                }
            });
            if (z) {
                aVar.run();
            } else {
                submit = this.a.submit(aVar);
            }
            if (submit != null) {
                loadableImageView.saveLoadingTask(submit);
            }
            zy11Var = zy11.a;
        } else {
            i2 = i;
            tlsVar3 = tlsVar;
        }
        if (zy11Var == null) {
            tlsVar3.invoke(new ColorDrawable(i2));
        }
    }
}
