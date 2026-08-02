package xsna;

import android.app.Activity;
import android.content.DialogInterface;
import com.vkontakte.android.R;
import io.appmetrica.analytics.impl.L0;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.lang.ref.WeakReference;
import xsna.p9k;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class n9k implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n9k(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                WeakReference weakReference = (WeakReference) this.c;
                p9k.a aVar = (p9k.a) this.d;
                final bu1 bu1Var = (bu1) this.e;
                Activity activity = (Activity) weakReference.get();
                if (activity != null) {
                    if (!aVar.a && !activity.isFinishing()) {
                        ner0 ner0Var = new ner0(activity);
                        ner0Var.setMessage(ner0Var.getContext().getResources().getString(R.string.rx_loading));
                        ner0Var.setCancelable(true);
                        ner0Var.setCanceledOnTouchOutside(true);
                        ner0Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: xsna.m9k
                            @Override // android.content.DialogInterface.OnCancelListener
                            public final void onCancel(DialogInterface dialogInterface) {
                                bu1.this.invoke();
                            }
                        });
                        ner0Var.show();
                        aVar.b = ner0Var;
                        break;
                    }
                } else {
                    aVar.a = true;
                    break;
                }
                break;
            case 1:
                L0.a((L0) this.c, (PluginErrorDetails) this.d, (String) this.e);
                break;
            default:
                nnz nnzVar = (nnz) this.c;
                je0 je0Var = (je0) this.d;
                com.vk.libvideo.api.ad.a aVar2 = (com.vk.libvideo.api.ad.a) this.e;
                nnzVar.f();
                oiz presenter = nnzVar.b.getPresenter();
                if (presenter != null) {
                    presenter.m(je0Var, aVar2);
                    break;
                }
                break;
        }
    }
}
